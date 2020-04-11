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
const changeCase = __importStar(require("change-case"));
const domain_1 = __importDefault(require("elasticsearch-client-specification/src/domain"));
exports.stringTypes = ["Field", "Id", "Ids", "IndexName", "Indices", "Routing", "LongId", "IndexMetrics", "Metrics", "Name", "Names",
    "NodeIds", "PropertyName", "RelationName", "TaskId", "Timestamp",
    "Uri", "Date", "TimeSpan"
];
exports.numberTypes = ["short", "byte", "integer", "long", "float", "double"];
exports.objectTypes = ["SourceDocument"];
const reservedTypes = ["string", "integer", "double", "boolean", "object"];
exports.$typeName = (name) => {
    if (reservedTypes.includes(name) || !name.includes("<"))
        return changeCase.pascalCase(name, { stripRegexp: /[^A-Z0-9<>]/gi });
    return changeCase.pascalCase(name, { stripRegexp: /[^A-Z0-9<>]/gi });
};
exports.$propertyName = (prop) => {
    if (prop === "+")
        return "Add";
    if (prop === "-")
        return "Subtract";
    if (prop.match(/^\d/))
        return `${changeCase.pascalCase("average" + prop)}`;
    return prop.includes(".") || prop.includes("-") || prop.match(/^(\d|\W)/)
        ? changeCase.pascalCase(prop)
        : changeCase.pascalCase(prop);
};
exports.$fieldName = (prop) => {
    if (prop.match(/^\d/))
        return `_${changeCase.camelCase("average" + prop)}`;
    return prop.includes(".") || prop.includes("-") || prop.match(/^(\d|\W)/)
        ? `_${changeCase.camelCase(prop)}`
        : `_${changeCase.camelCase(prop)}`;
};
exports.$parseFieldName = (prop) => {
    if (prop.match(/^\d/))
        return changeCase.constantCase("average" + prop);
    return changeCase.constantCase(prop);
};
exports.$instanceOf = (instance) => {
    if (instance instanceof domain_1.default.Type) {
        if (instance.closedGenerics.length === 0)
            return exports.$typeName(instance.name);
        const generics = instance.closedGenerics.map(exports.$instanceOf).flat(Infinity);
        return `${exports.$typeName(instance.name)}<${generics.join(", ")}>`;
    }
    else if (instance instanceof domain_1.default.ArrayOf)
        return `List<${exports.$instanceOf(instance.of)}>`;
    else if (instance instanceof domain_1.default.Dictionary)
        return `NamedContainer<${exports.$instanceOf(instance.key)}, ${exports.$instanceOf(instance.value)}>`;
    else if (instance instanceof domain_1.default.UnionOf)
        return `Either<${instance.items.map(exports.$instanceOf).join(", ")}>`;
};
//# sourceMappingURL=naming.js.map