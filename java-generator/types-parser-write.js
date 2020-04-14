"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const domain_1 = __importDefault(require("elasticsearch-client-specification/src/domain"));
const naming_1 = require("./naming");
const directWriteTypes = ["Object", "String", "Integer", "Boolean", "Double", "Long", "Float"];
const $writePropertyWrapped = (prop, parent) => [`if (${naming_1.$fieldName(prop.name)} != null) {`]
    .concat($writeProperty(prop, parent).map(e => `  ${e}`))
    .concat([`}`]);
const $writeProperty = (prop, parent) => {
    const typeSymbol = naming_1.$instanceOf(prop.type);
    if (directWriteTypes.includes(typeSymbol))
        return [`builder.field(${naming_1.$parseFieldName(prop.name)}.getPreferredName(), ${naming_1.$fieldName(prop.name)});`];
    if (typeSymbol === "Date")
        return [
            `builder.field(${naming_1.$parseFieldName(prop.name)}.getPreferredName(),`,
            `  DateTimeFormatter.ISO_DATE.format(${naming_1.$fieldName(prop.name)}.toInstant()));`
        ];
    if (prop.type instanceof domain_1.default.UnionOf) {
        const lr = (type) => {
            const s = naming_1.$instanceOf(type);
            if (directWriteTypes.includes(s))
                return "builder::value";
            if (s === "Date")
                return `r -> builder.value(DateTimeFormatter.ISO_DATE.format(r.toInstant()))`;
            if (type instanceof domain_1.default.ArrayOf)
                return `builder::value /* TODO ${s} */`;
            return "r-> r.toXContent(builder, params)";
        };
        return [
            `builder.field(${naming_1.$parseFieldName(prop.name)}.getPreferredName());`,
            `${naming_1.$fieldName(prop.name)}.map(${lr(prop.type.items[0])}, ${lr(prop.type.items[1])});`,
        ];
    }
    if (prop.type instanceof domain_1.default.ArrayOf)
        return [
            `builder.array(${naming_1.$parseFieldName(prop.name)}.getPreferredName(), ${naming_1.$fieldName(prop.name)});`,
        ];
    if (naming_1.stringTypes.includes(typeSymbol))
        return [
            `builder.field(${naming_1.$parseFieldName(prop.name)}.getPreferredName());`,
            `${naming_1.$fieldName(prop.name)}.toXContent(builder, params);`,
        ];
    if (["TDocument", "TPartialDocument", "TResult", "T", "TCatRecord"].includes(typeSymbol))
        return [`builder.field(${naming_1.$parseFieldName(prop.name)}.getPreferredName(), ${naming_1.$fieldName(prop.name)});`];
    return [
        `builder.field(${naming_1.$parseFieldName(prop.name)}.getPreferredName());`,
        `${naming_1.$fieldName(prop.name)}.toXContent(builder, params);`,
    ];
};
exports.$writeProperties = (type) => type.properties.flatMap(p => $writePropertyWrapped(p, type)).join("\n    ");
//# sourceMappingURL=types-parser-write.js.map