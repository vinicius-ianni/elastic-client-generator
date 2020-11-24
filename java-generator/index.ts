/* tslint:disable:no-console */
import {Specification} from "elasticsearch-client-specification/lib/src/api-specification";
import Domain, {
  GeneratorDocumentation,
  InterfaceProperty,
  RequestInterface, TypeDeclaration
} from "elasticsearch-client-specification/src/domain";
import fs from "fs";
import * as changeCase from "change-case";
import {stringTypes, objectTypes, numberTypes} from "./naming";
import {$createValueObject} from "./types-value";
import {$createUnionType} from "./types-union";
import {$createClass} from "./types";
import {$createEnum} from "./enums";
import {specification} from "./specs";

import {Emitter, testIt} from "./emitter";
import {loadModel} from "./metamodel_reader";

//const specification = Specification.load();

if (specification.domain_errors.length + specification.endpoint_errors.length !== 0) {
  if (specification.endpoint_errors.length > 0) console.error("The specification contains the following endpoint mapping errors:");
  for (const e of specification.endpoint_errors) console.error("  - " + e);
// tslint:disable-next-line:max-line-length
} else console.log("The specification contains no errors in any of the " + specification.endpoints.length + " endpoints yielding " + specification.types.length + " types.");

const $createType = (type: Domain.Interface) => {
  if (stringTypes.includes(type.name))
    return $createValueObject(type, "String");
  if (objectTypes.includes(type.name))
    return $createValueObject(type, "Object");
  if (type.implementsUnion()) return $createUnionType(type);
  return $createClass(type)
};

const $renderType = (type: Domain.TypeDeclaration) => {
  if (type instanceof Domain.Interface) return $createType(type)
  if (type instanceof Domain.Enum) return $createEnum(type);

  console.log(`Don't know how to render ${type.constructor.name}(${type.name})`);
};

const OUTPUT_DIR = "../output/java/src/main/java/org/elasticsearch";

// Do not generate, point to the hand-written version
specification.typeLookup.SingleKeyDictionary.namespace = "org.elasticsearch";

specification.types.forEach(type => {
  // Move core types to a single package -- Why?
  if (type.namespace.startsWith("mapping.types.core."))
    type.namespace = "mapping.types.core";

  if (type.namespace.endsWith(".boolean")) {
    type.namespace += "_";
  }

  if (type instanceof Domain.UnionAlias) {
    if (type.wraps.items.length === 2
      && type.wraps.items[0] instanceof Domain.Type
      && type.wraps.items[0].name === "string") {
      // Only keep the second part of the union
      //replaceType(type, new Domain.NumberAlias(type.name, ));
      return; //TODO
    }
  }

  if (type instanceof Domain.RequestInterface) {
    normalizeArrays(type.properties);
    if (type.queryParameters) {
      normalizeArrays(type.queryParameters);
    }

    if (type.body && type.body[0] instanceof Domain.InterfaceProperty) {
      // @ts-ignore
      normalizeArrays(type.body);
    }
  } else if (type instanceof Domain.Interface) {
    normalizeArrays(type.properties);
  }
})

function normalizeArrays(props: Domain.InterfaceProperty[]): void {
  props.forEach((prop, idx) => {
    if (prop.type instanceof Domain.Type && prop.type.name === "Array") {
      const newType = new Domain.ArrayOf();
      newType.of = prop.type.closedGenerics[0];
      prop.type = newType;
    }
  })
}

// generateOne("CatNodeAttributesRecord");
// generateAll();
// dumpModel();

const newModel = loadModel(specification);
console.log(JSON.stringify(newModel, null, 2));

function generateOne(name: string) {
  generateType(specification.typeLookup[name]);
}

function generateAll() {
  // Cleanup previously generated files, keeping top-level helper classes.
  fs.readdirSync(OUTPUT_DIR).forEach(name => {
    const file = `${OUTPUT_DIR}/${name}`;
    if (fs.statSync(file).isDirectory()) {
      fs.rmdirSync(`${OUTPUT_DIR}/${name}`, {recursive: true})
    }
  });

  let filesCount = 0;
  for (const type of specification.types) {
    if (generateType(type)) {
      filesCount++;
    }
  }
  console.log(`${filesCount} files generated.`);
}

function generateType(type: Domain.TypeDeclaration): boolean {
  if (numberTypes.includes(type.name)
    || type.name === "Date"
    || type.name === "Dictionary"
    || type.name === "SingleKeyDictionary"
    || type instanceof Domain.StringAlias
    || type instanceof Domain.UnionAlias
    || type instanceof Domain.NumberAlias
    || type.namespace === "org.elastisearch") {
    // console.log(`Skipping ${type.constructor.name} ${type.name}`);
    return;
  }

  const ns = type.namespace;
  const folder = ns.replace(/\./g, "/");
  const exportFolder = `${OUTPUT_DIR}/${folder}`;
  if (!fs.existsSync(exportFolder)) fs.mkdirSync(exportFolder, { recursive: true });

  const render = $renderType(type);
  if (!render) {
    console.error(`Nothing generated for type ${type.constructor.name}(${type.name})`);
    return false;
  } else {
    fs.writeFileSync(`${exportFolder}/${changeCase.pascalCase(type.name)}.java`, render);
    // console.log(`Rendered type ${type.constructor.name}(${type.name})`)
    return true;
  }
}

function dumpModel() {

  const typeAnnotations = new Set<string>();
  const enumAnnotations = new Set<string>();
  const propertyAnnotations = new Set<string>();

  specification.types.forEach(type => {

    if (type instanceof Domain.Interface) {
      if (type.implementsUnion()) {
        // Never seen. Deprecated to be removed?
        console.log(type.name + " implements union");
      }
    }

    if (type instanceof Domain.Enum) {
      // @ts-ignore
      type.type = "enum";
      type.members.forEach(e => {
        cleanupHints(e.generatorHints, enumAnnotations);
      });

    } else if (type instanceof RequestInterface) {
      // @ts-ignore
      type.type = "request";
      cleanupInterface(type);
      // Only keep body properties
      delete type.properties;

      type.path.forEach(p => cleanupHints(p.generatorHints, propertyAnnotations));
      type.queryParameters.forEach(p => cleanupHints(p.generatorHints, propertyAnnotations));
      if (type.body instanceof Array) {
        type.body.forEach(p => cleanupHints(p.generatorHints, propertyAnnotations));
      } else if(type.body) {
        console.log(type.name + ": body isn't a struct");
      }

    } else if (type instanceof Domain.UnionAlias) {
      // @ts-ignore
      type.type = "union_alias";

    } else if (type instanceof Domain.StringAlias) {
      // @ts-ignore
      type.type = "string_alias";

    } else if (type instanceof Domain.NumberAlias) {
      // @ts-ignore
      type.type = "number_alias";

    } else if (type instanceof Domain.Interface) {
      // @ts-ignore
      type.type = "interface";
      cleanupInterface(type);
      type.properties.forEach(p => cleanupHints(p.generatorHints, propertyAnnotations));
    } else {
      throw Error("Unknown type " + typeof (type))
    }

    if (!type.generatorHints) {
      // Comment says "/** generator hinting, never null */"
      // @ts-ignore
      // console.log(type.name + " (" + type.type + ") has no hints");
    } else {
      if (type.namespace === "internal") {
        // @ts-ignore
        // console.log("internal " + type.name + " (" + type.type + ") has hints?");
      }

      cleanupHints(type.generatorHints, typeAnnotations);
    }
  });

  console.log("Type annotations", typeAnnotations);
  console.log("Enum annotations", enumAnnotations);
  console.log("Enum annotations", propertyAnnotations);

  specification.endpoints.forEach(api => {
    const req = specification.typeLookup[api.typeMapping.request] as RequestInterface;

    // Verify path params
    const pathParams = new Set<string>();
    api.url.paths.forEach(p => {
      p.parts.forEach(part => {
        pathParams.add(part.name);
      })
    });

    diffNames(api.name + " path",
      Array.from(pathParams),
      req.queryParameters.map(p => p.name),
      false
    );

    // Verify query params
    diffNames(api.name + " query",
      api.queryStringParameters.map(p => p.name),
      req.queryParameters.map(p => p.name),
      false
    );

  });

  delete specification.typeLookup;

  console.log("done");
//  console.log(JSON.stringify(specification, null, 2));
}

function diffNames(kind: string, apiNames: string[], reqNames: string[], log: boolean): boolean {
  const onlyInApi = apiNames.filter(n => !reqNames.includes(n));
  const onlyInReq = reqNames.filter(n => !apiNames.includes(n));

  if (onlyInApi.length > 0 || onlyInReq.length > 0) {
    if (log) console.log(`api ${kind} - only in API: [${onlyInApi}], only in req: [${onlyInReq}]`)
    return true;
  } else {
    return false;
  }
}

function cleanupHints(hints: GeneratorDocumentation, annotations: Set<string>) {
  if (!hints) return;

  // Annotations
  Object.keys(hints.annotations).forEach(a => annotations.add(a));

  if (hints.description && hints.description.length === 0) {
    delete hints.description;
  }

  // @alternate_name --> generatorHints.alternateName
  delete hints.alternateName;
  // @prop_serializer --> generatorHints.customSerializationRoutine
  delete hints.customSerializationRoutine;
}

function cleanupInterface(type: Domain.Interface) {
  const parents = Object.keys(type.inheritsFromUnresolved);
  if (type.inherits.length !== parents.length) {
    throw Error("Inheritance inconsistency in "+ type.name);
  }
  delete type.inheritsFromUnresolved; // this is some temporary stuff

}
