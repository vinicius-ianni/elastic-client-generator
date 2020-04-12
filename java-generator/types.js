"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const naming_1 = require("./naming");
const imports_1 = require("./imports");
const types_parser_read_1 = require("./types-parser-read");
const types_parser_write_1 = require("./types-parser-write");
const $typeExtends = (type) => {
    return type.inherits.length === 0
        ? ``
        : `extends ${type.inherits.map($handleDictionaryResponse).join(", ")}`;
};
const $handleDictionaryResponse = (ref) => {
    if (ref.type === undefined)
        return "";
    return ref.type.name === "DictionaryResponseBase"
        ? `${naming_1.$typeName(ref.type.name)}<${ref.closedGenerics.map(naming_1.$instanceOf).join(", ")}>`
        : naming_1.$typeName(ref.type.name);
};
const $implementsXContent = (type) => {
    return type.name === "DictionaryResponseBase"
        ? ``
        : `implements XContentable<${naming_1.$typeName(type.name)}${$typeGenerics(type)}>`;
};
const $xCContentImplementation = (type) => {
    if (type.name === "DictionaryResponseBase")
        return "";
    return `
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    ${types_parser_write_1.$writeProperties(type)}
    builder.endObject();
    return builder;
  }

  @Override
  public ${naming_1.$typeName(type.name)} fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ${naming_1.$typeName(type.name)}.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<${naming_1.$typeName(type.name)}, Void> PARSER =
    new ConstructingObjectParser<>(${naming_1.$typeName(type.name)}.class.getName(), false, args -> new ${naming_1.$typeName(type.name)}());

  static {
    ${types_parser_read_1.$parseProperties(type)}
  }
`;
};
const $abstractClass = (type) => {
    return type.name === "DictionaryResponseBase"
        ? `abstract `
        : ``;
};
const $typeGenerics = (type) => {
    return type.openGenerics.length === 0
        ? ``
        : `<${type.openGenerics.map(g => `${g}`).join(", ")}>`;
};
const $property = (prop, parent) => `
  static final ParseField ${naming_1.$parseFieldName(prop.name)} = new ParseField("${prop.name}");
  private ${naming_1.$instanceOf(prop.type)} ${naming_1.$fieldName(prop.name)};
  public ${naming_1.$instanceOf(prop.type)} get${naming_1.$propertyName(prop.name)}() { return this.${naming_1.$fieldName(prop.name)}; }
  public ${naming_1.$typeName(parent.name)}${$typeGenerics(parent)} set${naming_1.$propertyName(prop.name)}(${naming_1.$instanceOf(prop.type)} val) { this.${naming_1.$fieldName(prop.name)} = val; return this; }
`;
const $properties = (type) => type.properties.map(p => $property(p, type)).join("\n");
exports.$createClass = (type) => `
package org.elasticsearch.${type.namespace};

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
${[...imports_1.$imports(type)].join("\n")}

public ${$abstractClass(type)}class ${naming_1.$typeName(type.name)}${$typeGenerics(type)} ${$typeExtends(type)} ${$implementsXContent(type)} {
  ${$properties(type)}

  ${$xCContentImplementation(type)}
}
`;
//# sourceMappingURL=types.js.map