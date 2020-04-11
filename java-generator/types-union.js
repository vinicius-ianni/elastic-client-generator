"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const naming_1 = require("./naming");
const imports_1 = require("./imports");
exports.$createUnionType = (type) => `package org.elasticsearch.${type.namespace};

import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.common.xcontent.*;
${[...imports_1.$imports(type)].join("\n")}
import java.io.IOException;
import java.util.List;

public class ${naming_1.$typeName(type.name)} extends Either<${type.inherits[0].closedGenerics.map(naming_1.$instanceOf).join(", ")}> implements XContentable<${naming_1.$typeName(type.name)}> {

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ${naming_1.$typeName(type.name)} fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return null;
  }
}
`;
//# sourceMappingURL=types-union.js.map