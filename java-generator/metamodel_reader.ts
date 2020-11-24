import Domain from "elasticsearch-client-specification/src/domain";

import {Specification} from "elasticsearch-client-specification/src/api-specification";
import {
  Endpoint,
  Implements,
  InstanceOf,
  Model,
  Property,
  RequestInterface,
  Stability,
  TypeDefinition,
  TypeName,
  UnionOf,
  UrlTemplate
} from "./metamodel";

export function loadModel(spec: Specification): Model {
  const model: Model = {
    types: [],
    endpoints: []
  };

  const allTypeDefinitions = new Map<string, TypeDefinition>();
  const allTypeNames = new Map<string, TypeName>();

  allTypeNames.set("boolean", {name:"boolean", namespace: "internal"});
  allTypeNames.set("string", {name:"string", namespace: "internal"});
  allTypeNames.set("Array", {name:"Array", namespace: "internal"});

  // 'any' is translated to 'object'
  allTypeNames.set("object", {name:"object", namespace: "internal"});

  // See makeImplements()
  const autoFixedGenerics = new Set<string>();

  // Make endpoints, this will pull all needed types transitively
  model.endpoints = spec.endpoints.map(ep => makeEndpoint(ep)).filter(ep => ep);
  model.types = Array.from(allTypeDefinitions.values());

  // Move path and query properties docs to the corresponding request properties
  model.endpoints.forEach(ep => {
    const specEp = spec.endpoints.find(sep => sep.name === ep.name);
    const reqType = allTypeDefinitions.get(ep.request.name);

    if (reqType._kind === "request") {
      if (!reqType.description) {
        reqType.description = nonEmpty(specEp.body && specEp.body.description);
      }

      reqType.path.forEach(prop => {
        if (prop.description && prop.description.length > 0) return; // already has some docs
        outer: for (const path of specEp.url.paths) {
          for (const part of path.parts) {
            if (part.name === prop.name) {
              prop.description = nonEmpty(part.description);
              break outer;
            }
          }
        }
      });

      reqType.query.forEach(prop => {
        if (prop.description && prop.description.length > 0) return; // already has some docs
        for (const param of specEp.queryStringParameters) {
          if (param.name === prop.name) {
            prop.description = nonEmpty(param.description);
            break;
          }
        }
      });
    }
  });

  console.log("Model: " + model.types.length + " types (" + spec.types.length + " in spec)");
  console.log("Model: " + model.endpoints.length + " endpoints (" + spec.endpoints.length + " in spec)");

  function makeEndpoint(api: Domain.Endpoint): Endpoint {
    if (!spec.typeLookup[api.typeMapping.request]) {
      console.log("Endpoint " + api.name + " skipped: request type not found");
      return undefined;
    }

    if (!spec.typeLookup[api.typeMapping.response]) {
      console.log("Endpoint " + api.name + " skipped: response type not found");
      return undefined;
    }

    // Move endpoint docs to the request definition
    const request = makeTypeDefinition(api.typeMapping.request) as RequestInterface;
    if (!request.description || request.description.length === 0) {
      request.description = nonEmpty(api.body && api.body.description);
    }

    request.path.forEach(prop => {
      if (prop.description && prop.description.length > 0) return; // already has some docs
      outer: for (const path of api.url.paths) {
        for (const part of path.parts) {
          if (part.name === prop.name) {
            prop.description = nonEmpty(part.description);
            break outer;
          }
        }
      }
    });

    request.query.forEach(prop => {
      if (prop.description && prop.description.length > 0) return; // already has some docs
      for (const param of api.queryStringParameters) {
        if (param.name === prop.name) {
          prop.description = nonEmpty(param.description);
          break;
        }
      }
    });

    return {
      name: api.name,
      description: nonEmpty(api.documentation.description),
      docUrl: api.documentation.url,
      stability: makeStability(api.stability),
      deprecation: api.deprecated,

      request: request.name,
      requestBodyRequired: !!api.body && api.body.required,

      response: makeTypeDefinition(api.typeMapping.response).name,

      urls: makeUrlTemplates(api.url)
    }
  }

  function makeStability(s: Domain.Stability): Stability {
    switch (s) {
      case Domain.Stability.stable: return Stability.stable;
      case Domain.Stability.beta: return Stability.beta;
      case Domain.Stability.experimental: return Stability.experimental;
    }
  }

  function makeTypeDefinition(name: string): TypeDefinition {
    const cached = allTypeDefinitions.get(name);
    if (cached) return cached;

    function store(t: TypeDefinition): TypeDefinition {
      allTypeDefinitions.set(name, t);
      return t;
    }

    const fullName = makeTypeName(name, []);
    const specType = spec.typeLookup[name]; // existence checked in makeTypeName

    if (specType instanceof Domain.Enum) {
      return store({
        _kind: "enum",
        name: fullName,
        members: specType.members.map(m => {
          return {
            name: m.name,
            stringValue: m.stringRepresentation,
            description: nonEmpty(m.generatorHints && m.generatorHints.description),
            annotations: nonEmptyObj(m.generatorHints && m.generatorHints.annotations)
          };
        })
      });
    }

    else if (specType instanceof Domain.RequestInterface) {
      let body: InstanceOf | Property[];
      if (specType.body instanceof Array) {
        body = specType.body.map(prop => makeProperty(prop, specType.openGenerics))
      } else {
        body = specType.body && makeInstanceOf(specType.body, specType.openGenerics);
      }

      return store({
        _kind: "request",
        name: fullName,
        generics: nonEmptyArr(specType.openGenerics),
        inherits: nonEmptyArr(specType.inherits.map(i => makeImplements(i, specType.openGenerics))),
        path: specType.path.map(prop => makeProperty(prop, specType.openGenerics)),
        query: specType.queryParameters.map(prop => makeProperty(prop, specType.openGenerics)),
        body: body,
      });
    }

    else if (specType instanceof Domain.UnionAlias) {
      return store({
        _kind: "union_alias",
        name: fullName,
        alias: makeInstanceOf(specType.wraps, []) as UnionOf, // assumes spec is consistent
      });
    }

    else if (specType instanceof Domain.StringAlias) {
      return store({
        _kind: "string_alias",
        name: fullName
      });
    }

    else if (specType instanceof Domain.NumberAlias) {
      return store({
        _kind: "number_alias",
        name: fullName
      });
    }

    else if (specType instanceof Domain.Interface) {
      return store({
        _kind: "interface",
        name: fullName,
        generics: nonEmptyArr(specType.openGenerics),
        inherits: nonEmptyArr(specType.inherits.map(impl => makeImplements(impl, specType.openGenerics))),
        properties: specType.properties.map(prop => makeProperty(prop, specType.openGenerics)),
      });
    }

    else {
      throw Error("Unknown type " + typeof (specType))
    }
  }

  function makeImplements(impl: Domain.ImplementsReference, openGenerics: string[]): Implements {

    // Autofix requests and responses that have self-reference generic parameters
    if (impl.closedGenerics.length > 0 && impl.type.openGenerics.length === 0) {
      if (!autoFixedGenerics.has(impl.type.name)) {
        console.log("Auto fixing implements generic parameters for " + impl.type.name);
        autoFixedGenerics.add(impl.type.name);
      }
      impl.closedGenerics = [];
    }

    return {
      type: { name: impl.type.name, namespace: impl.type.namespace },
      generics: nonEmptyArr(impl.closedGenerics.map(i => makeInstanceOf(i, openGenerics)))
    };
  }

  function makeInstanceOf(inst: Domain.InstanceOf, openGenerics: string[]): InstanceOf {

    if (inst instanceof Domain.Type) {
      return {
        _kind: "value",
        name: makeTypeName(inst.name, openGenerics),
        generics: nonEmptyArr(inst.closedGenerics.map(g => makeInstanceOf(g, openGenerics))),
      };
    }

    else if (inst instanceof Domain.ArrayOf) {
      return {
        _kind: "array",
        value: makeInstanceOf(inst.of, openGenerics),
      };
    }

    else if (inst instanceof Domain.UnionOf) {
      return {
        _kind: "union",
        items: inst.items.map(i => makeInstanceOf(i, openGenerics))
      };
    }

    else if (inst instanceof Domain.Dictionary) {
      return {
        _kind: "dictionary",
        key: makeInstanceOf(inst.key, openGenerics),
        value: makeInstanceOf(inst.value, openGenerics)
      };
    }

    else if (inst instanceof Domain.SingleKeyDictionary) {
      return {
        _kind: "named_value",
        value: makeInstanceOf(inst.value, openGenerics)
      };
    }

    else if (inst instanceof Domain.UserDefinedValue) {
      return {
        _kind: "user_defined"
      };
    }

    else {
      throw Error("Unnkown instance kind: " + typeof inst);
    }
  }

  function makeProperty(prop: Domain.InterfaceProperty, openGenerics: string[]): Property {
    return {
      name: prop.name,
      type: makeInstanceOf(prop.type, openGenerics),
      required: !prop.nullable,
      description: nonEmpty(prop.generatorHints && prop.generatorHints.description),
      annotations: nonEmptyObj(prop.generatorHints && prop.generatorHints.annotations)
    };
  }

  function makeTypeName(name: string, openGenerics: string[]): TypeName {
    const cached = allTypeNames.get(name);
    if (cached) return cached;

    if (openGenerics.includes(name)) {
      // Open generics have precedence
      return {name: name, namespace: "generic"};
    }

    const t = spec.typeLookup[name];
    if (!t) {
      // console.log("Type " + name + " was not found");
      // return { name: name, namespace: "unknown"};
      throw Error("Type " + name + " was not found");
    }

    const r = { name: t.name, namespace: t.namespace };
    allTypeNames.set(name, r);
    return r;
  }

  function makeUrlTemplates(url: Domain.Url): UrlTemplate[] {
    return url.paths.map(path => {
      const t: UrlTemplate = {
        path: path.path,
        methods: path.methods,
        deprecation: path.deprecated
      }
      return t;
    })
  }

  function nonEmpty(str: string): string {
    if (!str || str.length === 0) {
      return undefined;
    } else {
      return str;
    }
  }

  function nonEmptyArr<T>(arr: T[]): T[] {
    if (!arr || arr.length === 0) {
      return undefined;
    } else {
      return arr;
    }
  }

  function nonEmptyObj<T>(obj: T): T {
    if (!obj || Object.keys(obj).length === 0) {
      return undefined
    } else {
      return obj;
    }
  }

  return model;
}
