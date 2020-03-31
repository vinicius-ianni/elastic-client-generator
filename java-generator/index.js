"use strict";
var __importStar = (this && this.__importStar) || function (mod) {
    if (mod && mod.__esModule) return mod;
    var result = {};
    if (mod != null) for (var k in mod) if (Object.hasOwnProperty.call(mod, k)) result[k] = mod[k];
    result["default"] = mod;
    return result;
};
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const api_specification_1 = require("../specification/src/api-specification");
const domain_1 = __importStar(require("elasticsearch-client-specification/src/domain"));
const fs_1 = __importDefault(require("fs"));
const changeCase = __importStar(require("change-case"));
const specification = api_specification_1.Specification.load();
if (specification.domain_errors.length + specification.endpoint_errors.length !== 0) {
    if (specification.endpoint_errors.length > 0)
        console.error("The specification contains the following endpoint mapping errors:");
    for (const e of specification.endpoint_errors)
        console.error("  - " + e);
}
else
    console.log("The specification contains no errors in any of the " + specification.endpoints.length + " endpoints yielding " + specification.types.length + " types");
const reservedTypes = ["string", "integer", "double", "boolean", "object"];
const $typeName = (name) => {
    if (reservedTypes.includes(name) || !name.includes("<"))
        return changeCase.pascalCase(name, { stripRegexp: /[^A-Z0-9<>]/gi });
    const pre = name.substr(0, name.indexOf("<"));
    const post = name.substr(name.indexOf("<"), name.lastIndexOf(">"));
    return `${changeCase.pascalCase(pre, { stripRegexp: /[^A-Z0-9<>]/gi })}${post}`;
};
const $referencedTypes = (instance) => {
    if (instance instanceof domain_1.Type)
        return [specification.typeLookup[instance.name]];
    else if (instance instanceof domain_1.ArrayOf)
        return $referencedTypes(instance.of).flat(Infinity);
    else if (instance instanceof domain_1.Dictionary)
        return [$referencedTypes(instance.key), $referencedTypes(instance.value)].flat(Infinity);
    else if (instance instanceof domain_1.UnionOf)
        return instance.items.map($referencedTypes).flat(Infinity);
};
const $instanceOf = (instance) => {
    if (instance instanceof domain_1.Type)
        return $typeName(instance.name);
    else if (instance instanceof domain_1.ArrayOf)
        return `${$instanceOf(instance.of)}[]`;
    else if (instance instanceof domain_1.Dictionary)
        return `Map<${$instanceOf(instance.key)}, ${$instanceOf(instance.value)}>`;
    else if (instance instanceof domain_1.UnionOf)
        return `Either<${instance.items.map($instanceOf).join(", ")}>`;
};
const $propertyName = (prop) => {
    if (prop === "+")
        return "Add";
    if (prop === "-")
        return "Subtract";
    return prop.includes(".") || prop.includes("-") || prop.match(/^(\d|\W)/)
        ? changeCase.pascalCase(prop)
        : changeCase.pascalCase(prop);
};
const $fieldName = (prop) => prop.includes(".") || prop.includes("-") || prop.match(/^(\d|\W)/)
    ? `_${changeCase.camelCase(prop)}`
    : `_${changeCase.camelCase(prop)}`;
const $property = (prop, parent) => `
  private ${$instanceOf(prop.type)} ${$fieldName(prop.name)};
  public ${$instanceOf(prop.type)} get${$propertyName(prop.name)}() { return this.${$fieldName(prop.name)}; }
  public ${$typeName(parent.name)}${$typeGenerics(parent)} set${$propertyName(prop.name)}(${$instanceOf(prop.type)} val) { this.${$fieldName(prop.name)} = val; return this; }
`;
const $properties = (type) => type.properties.map(p => $property(p, type)).join("\n");
const $typeExtends = (type) => {
    return type.inherits.length === 0
        ? ``
        : `extends ${type.inherits.map($handleDictionaryResponse).join(", ")}`;
};
const $handleDictionaryResponse = (ref) => {
    if (ref.type === undefined) {
        console.log(ref);
        return "";
    }
    return ref.type.name === "DictionaryResponseBase"
        ? `${$typeName(ref.type.name)}<${ref.closedGenerics.map($instanceOf).join(", ")}>`
        : $typeName(ref.type.name);
};
const $imports = (type) => {
    const types = type
        .properties
        .flatMap(e => $referencedTypes(e.type))
        .concat(type.inherits.map(i => i.type))
        .filter(e => e && e.name !== "string")
        .map(e => {
        if (e.namespace.startsWith("mapping.types.core."))
            return "mapping.types.core";
        return e.namespace;
    })
        .map($import);
    return new Set(types);
};
const $import = (ns) => `import org.elasticsearch.${ns}.*;`;
const $typeGenerics = (type) => {
    return type.openGenerics.length === 0
        ? ``
        : `<${type.openGenerics.map(g => `${g}`).join(", ")}>`;
};
const $type = (type) => `
package org.elasticsearch.${type.namespace};

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
${[...$imports(type)].join("\n")}

public class ${$typeName(type.name)}${$typeGenerics(type)} ${$typeExtends(type)} {
  ${$properties(type)}
}
`;
const $createUnionType = (type) => `package org.elasticsearch.${type.namespace};

import org.elasticsearch.Either;

public class ${type.name} extends Either<${type.inherits[0].closedGenerics.map($instanceOf).join(", ")}> { }
`;
const stringTypes = ["Field", "Id", "Ids", "IndexName", "Indices", "Routing", "LongId", "IndexMetrics", "Metrics", "Name", "Names",
    "NodeIds", "PropertyName", "RelationName", "TaskId", "Timestamp",
    "Uri", "Date", "TimeSpan"
];
const numberTypes = ["short", "byte", "integer", "long", "float", "double"];
const objectTypes = ["SourceDocument"];
const $createValueObject = (type, valueType) => `
package org.elasticsearch.${type.namespace};

import java.util.Objects;

public final class ${$typeName(type.name)} {
    private final ${valueType} value;

    public ${$typeName(type.name)}(String value) { this.value = value; }

    @Override
    public ${valueType} toString() { return value.toString(); }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ${$typeName(type.name)} that = (${$typeName(type.name)}) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return Objects.hash(value); }
}
`;
const $createType = (type) => {
    if (stringTypes.includes(type.name))
        return $createValueObject(type, "String");
    if (objectTypes.includes(type.name))
        return $createValueObject(type, "Object");
    if (type.implementsUnion())
        return $createUnionType(type);
    return $type(type);
};
const $enumFlag = (e, flag, n) => !flag ? `"${e.name}"` : `1 << ${n + 1}`;
const $enumValue = (e, flag, n) => `${$propertyName(e.name)}(${$enumFlag(e, flag, n)})`;
const $enumValues = (e) => e.members.map((m, i) => $enumValue(m, e.flags, i)).join(",\n    ");
const $enum = (e) => `
package org.elasticsearch.${e.namespace};

public enum ${$typeName(e.name)} {
  ${$enumValues(e)};
  private final String textRepresentation;

  private ${$typeName(e.name)}(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
`;
const $renderType = (type) => {
    if (type instanceof domain_1.default.Interface)
        return $createType(type);
    else if (type instanceof domain_1.default.Enum)
        return $enum(type);
};
for (const type of specification.types) {
    if (numberTypes.includes(type.name))
        continue;
    if (type.name === "Date")
        continue;
    if (type.namespace.startsWith("mapping.types.core."))
        type.namespace = "mapping.types.core";
    const ns = type.namespace;
    const folder = ns.replace(/\./g, "/");
    const exportFolder = `../output/java/src/main/java/org/elasticsearch/${folder}`;
    if (!fs_1.default.existsSync(exportFolder))
        fs_1.default.mkdirSync(exportFolder, { recursive: true });
    fs_1.default.writeFileSync(`${exportFolder}/${changeCase.pascalCase(type.name)}.java`, $renderType(type));
}
//# sourceMappingURL=index.js.map