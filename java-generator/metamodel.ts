
// Background on type-safe pattern matching of union types
// https://blog.logrocket.com/pattern-matching-and-type-safety-in-typescript-1da1231a2e34/
// https://medium.com/@fillopeter/pattern-matching-with-typescript-done-right-94049ddd671c

/**
 * The name of a type, composed of a simple name and a namespace.
 * Reserved namespaces:
 * - "generic" for type names that are generic parameter values from the enclosing type.
 * - "internal" for primitive and builtin types (e.g. Id, IndexName, etc)
 */
export class TypeName {
  name: string;
  namespace: string;
}

// ------------------------------------------------------------------------------------------------
// Value types

// Note: "required" is part of Property. This means we can have optional properties but we can't have null entries in
// containers (array and dictionary), which doesn't seem to be needed.
export type InstanceOf = ValueOf | ArrayOf | UnionOf | DictionaryOf | NamedValueOf | UserDefinedValue

/** A single value */
export class ValueOf {
  _kind: "value";
  name: TypeName;
  /** Generic parameters for the `name` type */
  generics?: InstanceOf[];
}

export class ArrayOf {
  _kind: "array";
  value: InstanceOf;
}

export class UnionOf {
  _kind: "union";
  items: InstanceOf[];
}

export class DictionaryOf {
  _kind: "dictionary";
  key: InstanceOf;
  value: InstanceOf;
}

export class NamedValueOf {
  _kind: "named_value";
  value: InstanceOf;
}

export class UserDefinedValue {
  _kind: "user_defined";
}

// ------------------------------------------------------------------------------------------------

export class Property {
  name: string;
  type: InstanceOf;
  required: boolean;
  description?: string;
  annotations?: Record<string, string>;

  // Removed properties:
  // isRequestParameter - request has 3 parameter lists for path/query/body

  // Missing:
  // annotation to skip generation (e.g. flat_settings in index settings)
}

// ------------------------------------------------------------------------------------------------
// Type definitions

export type TypeDefinition = Enum | Interface | RequestInterface | UnionAlias | StringAlias | NumberAlias ;
// Missing in all type declarations
// - annotations

export class UnionAlias {
  _kind: "union_alias";
  name: TypeName;
  description?: string;
  alias: UnionOf;
}

export class StringAlias {
  _kind: "string_alias";
  name: TypeName;
  description?: string;
}

export class NumberAlias {
  _kind: "number_alias";
  name: TypeName;
  description?: string;
}

export class EnumMember{
  name: string;
  description?: string;
  // See DateMathTimeUnit - could we use string enums for this?
  stringValue: string;
  annotations?: Record<string, string>;
}

export class Enum {
  _kind: "enum";
  name: TypeName;
  description?: string;
  members: EnumMember[];

  // Removed properties:
  // - flags: always false
}

export class Implements {
  type: TypeName;
  // generic parameters: either concrete types or open parameters from the enclosing type
  generics?: InstanceOf[];
}

export class Interface {
  _kind: "interface";
  name: TypeName;
  description?: string;
  generics?: string[];
  inherits?: Implements[];
  properties: Property[];
}

export class RequestInterface {
  // Note: does not extend Interface as properties are split across path, query and body
  _kind: "request";
  name: TypeName;
  description?: string;
  generics?: string[];
  inherits?: Implements[];
  /** URL path properties */
  path: Property[];
  /** Query string properties */
  query: Property[];
  // Note: weed a "query_params" annotation on a property that lists query params replaced by a body property so that
  // we can skip them.
  // Examples on _search: sort -> sort, _source -> (_source, _source_include, _source_exclude)
  // Or can we say that implicitly a body property replaces all path params starting with its name?
  // Is there a priority rule between path and body parameters?
  //
  // We can also pull path parameter descriptions on body properties they replace
  body?: InstanceOf | Property[];
}

// ------------------------------------------------------------------------------------------------

export enum Stability {
  stable = "stable",
  beta = "beta",
  experimental = "experimental"
  // NOTE: do we filter out "private"?
}

export class Deprecation {
  version: string;
  description: string;
}

export class Endpoint {
  name: string;
  description: string;
  docUrl: string;
  stability: Stability;
  deprecation: Deprecation

  request: TypeName;
  requestBodyRequired: boolean; // Not sure this is useful

  response: TypeName;

  urls: UrlTemplate[];

  // Removed properties:
  // - routeParts: should be request.path (but we currently have some inconsistencies)
  // - queryStringParameters: should be request.query (ditto)
}

export class UrlTemplate {
  path: string;
  methods: string[];
  deprecation?: Deprecation;
}

export class Model {
  types: TypeDefinition[];
  endpoints: Endpoint[];
}
