"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const naming_1 = require("./naming");
const $enumFlag = (e, flag, n) => !flag ? `"${e.stringRepresentation}"` : `1 << ${n + 1}`;
const $enumValue = (e, flag, n) => `${naming_1.$propertyName(e.name)}(${$enumFlag(e, flag, n)})`;
const $enumValues = (e) => e.members.map((m, i) => $enumValue(m, e.flags, i)).join(",\n    ");
const $enumParseCase = (e, parent) => `case "${e.stringRepresentation}": return ${naming_1.$typeName(parent.name)}.${naming_1.$propertyName(e.name)}`;
const $enumParseCases = (e) => e.members.map((m, i) => $enumParseCase(m, e)).join(";\n      ");
exports.$createEnum = (e) => `
package org.elasticsearch.${e.namespace};

import org.elasticsearch.XContentable;
import org.elasticsearch.common.CheckedFunction;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum ${naming_1.$typeName(e.name)} implements XContentable<${naming_1.$typeName(e.name)}> {
  ${$enumValues(e)};
  private final String textRepresentation;

  private ${naming_1.$typeName(e.name)}(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public ${naming_1.$typeName(e.name)} fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, ${naming_1.$typeName(e.name)}, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      ${$enumParseCases(e)};
      default:
        String message = java.lang.String.format("'%s' not a valid value for enum '%s'", text, ${naming_1.$typeName(e.name)}.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
`;
//# sourceMappingURL=enums.js.map