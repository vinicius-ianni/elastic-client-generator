"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const naming_1 = require("./naming");
exports.$createValueObject = (type, valueType) => `
package org.elasticsearch.${type.namespace};

import java.io.IOException;
import java.util.Objects;
import org.elasticsearch.XContentable;
import org.elasticsearch.common.xcontent.*;

public final class ${naming_1.$typeName(type.name)} implements XContentable<${naming_1.$typeName(type.name)}> {
  private final ${valueType} value;

  public ${naming_1.$typeName(type.name)}(String value) { this.value = value; }

  @Override
  public String toString() { return value.toString(); }

  @Override
  public boolean equals(Object o) {
      if (o == null || getClass() != o.getClass()) return false;
      ${naming_1.$typeName(type.name)} that = (${naming_1.$typeName(type.name)}) o;
      return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() { return Objects.hash(value); }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.value(this.value);
    return null;
  }

  public static ${naming_1.$typeName(type.name)} createFrom(XContentParser parser) throws IOException, XContentParseException { return new ${naming_1.$typeName(type.name)}(parser.text()); }

  @Override
  public ${naming_1.$typeName(type.name)} fromXContent(XContentParser parser) throws IOException, XContentParseException { return ${naming_1.$typeName(type.name)}.createFrom(parser); }

}
`;
//# sourceMappingURL=types-value.js.map