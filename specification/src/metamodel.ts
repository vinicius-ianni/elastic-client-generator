
/**
 * The name of a type, composed of a simple name and a namespace. Hierarchical namespace elements are separated by
 * a dot, e.g 'cat.cat_aliases'.
 *
 * Builtin namespaces:
 * - "generic" for type names that are generic parameter values from the enclosing type.
 * - "internal" for primitive and builtin types (e.g. Id, IndexName, etc)
 *    Builtin types:
 *    - boolean,
 *    - string,
 *    - number: a 64bits floating point number. Additional types will be added for integers.
 *    - null: the null value. Since JS distinguishes undefined and null, some APIs make use of this value.
 *    - Array: an array,
 *    - object: used to represent "any". We may forbid it at some point. UserDefinedValue should be used for user data.
 */
export class TypeName {
  namespace: string;
  name: string;
}

// ------------------------------------------------------------------------------------------------
// Value types

// Note: "required" is part of Property. This means we can have optional properties but we can't have null entries in
// containers (array and dictionary), which doesn't seem to be needed.
//
// The 'kind' property is used to tag and disambiguate union type members, and allow type-safe pattern matching in TS:
// see https://blog.logrocket.com/pattern-matching-and-type-safety-in-typescript-1da1231a2e34/
// and https://medium.com/@fillopeter/pattern-matching-with-typescript-done-right-94049ddd671c

/**
 * Type of a value. Used both for property types and nested type definitions.
 */
export type ValueOf = InstanceOf | ArrayOf | UnionOf | DictionaryOf | NamedValueOf | UserDefinedValue;

/**
 * A single value
 */
export class InstanceOf {
  kind: "instance_of";
  type: TypeName;
  /** generic parameters: either concrete types or open parameters from the enclosing type */
  generics?: ValueOf[];
}

/**
 * An array
 */
export class ArrayOf {
  kind: "array_of";
  value: ValueOf;
}

/**
 * One of several possible types which don't necessarily have a common superclass
 */
export class UnionOf {
  kind: "union_of";
  items: ValueOf[];
}

/**
 * A dictionary (or map)
 */
export class DictionaryOf {
  kind: "dictionary_of";
  key: ValueOf;
  value: ValueOf;
}

/**
 * A named value. This is a common pattern in ES APIs that deserves its own representation. It's often used to
 * associate some value to a field name, e.g. the "sort" field in search.
 */
export class NamedValueOf {
  kind: "named_value_of";
  value: ValueOf;
}

/**
 * A user defined value. To be used when bubbling a generic parameter up to the top-level class is
 * inconvenient or impossible (e.g. for lists of user-defined values of possibly different types).
 *
 * Clients will allow providing a serializer/deserializer when reading/writing properties of this type,
 * and should also accept raw json.
 *
 * Think twice before using this as it defeats the purpose of a strongly typed API, and deserialization
 * will also require to buffer raw JSON data which may have performance implications.
 */
export class UserDefinedValue {
  kind: "user_defined_value";
}

// ------------------------------------------------------------------------------------------------

/**
 * An interface or request interface property.
 */
export class Property {
  name: string;
  type: ValueOf;
  required: boolean;
  description?: string;
  annotations?: Record<string, string>;
}

// ------------------------------------------------------------------------------------------------
// Type definitions

export type TypeDefinition = Interface | Request | Union | Enum | TypeAlias;

/**
 * Common attributes for all type definitions
 */
abstract class BaseType {
  name: TypeName;
  description?: string;
  annotations?: Record<string, string>;
}

/**
 * Inherits clause (aka extends or implements) for an interface or request
 */
export class Inherits {
  type: TypeName;
  generics?: ValueOf[];
}
export class Implements {
  type: TypeName;
  generics?: ValueOf[];
  depth:number
}

/**
 * An interface type
 */
export class Interface extends BaseType {
  kind: "interface";
  generics?: string[];
  inherits?: Inherits[];
  implements?: Implements[];
  properties: Property[];
}

/**
 * A request type
 */
export class Request extends BaseType {
  // Note: does not extend Interface as properties are split across path, query and body
  kind: "request";
  generics?: string[];
  inherits?: Inherits[];
  /** URL path properties */
  path: Property[];
  /** Query string properties */
  query: Property[];
  // FIXME: we need an annotation that lists query params replaced by a body property so that we can skip them.
  // Examples on _search: sort -> sort, _source -> (_source, _source_include, _source_exclude)
  // Or can we say that implicitly a body property replaces all path params starting with its name?
  // Is there a priority rule between path and body parameters?
  //
  // We can also pull path parameter descriptions on body properties they replace

  /**
   * Body type. In most cases this is just a list of properties, except for a few specific cases like bulk requests
   * (an array of bulk operations) or create requests (a user provided document type).
   */
  body?: ValueBody | PropertiesBody;
}

export class ValueBody {
  kind: "value";
  value: ValueOf;
}

export class PropertiesBody {
  kind: "properties";
  properties: Property[];
}

/**
 * A union type, containing a list of type references.
 *
 * As type references can themselves be unions (see `UnionOf`) a code generator will likely have to flatten a union or
 * a unionOf in a single list of type references.
 */
export class Union extends BaseType {
  kind: "union";
  items: ValueOf[];
}

/**
 * An enumeration member.
 *
 * When enumeration members can become ambiguous when translated to an identifier, the `name` property will be a good
 * identifier name, and `stringValue` will be the string value to use on the wire.
 * See DateMathTimeUnit for an example of this, which have members for "m" (minute) and "M" (month).
 */
export class EnumMember {
  /** The identifier to use for this enum */
  name: string;
  description?: string;
  /** The value to send of the wire. Use `name` if absent */
  stringValue?: string;
  annotations?: Record<string, string>;
}

/**
 * An enumeration
 */
export class Enum extends BaseType {
  kind: "enum";
  members: EnumMember[];
}

/**
 * An alias for an existing type.
 */
export class TypeAlias extends BaseType {
  kind: "type_alias";
  type: ValueOf
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
  /**
   * The version when this endpoint reached its current stability level.
   * Missing data means "forever", i.e. before any of the target client versions produced from this spec.
   */
  since?: string;
  deprecation: Deprecation

  /**
   * If the request value is `null` it means that there is not yet a
   * request type definition for this endpoint.
   */
  request: TypeName | null;
  requestBodyRequired: boolean; // Not sure this is useful

  /**
   * If the response value is `null` it means that there is not yet a
   * response type definition for this endpoint.
   */
  response: TypeName | null;

  urls: UrlTemplate[];
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
