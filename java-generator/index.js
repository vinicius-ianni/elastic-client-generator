"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
var __importStar = (this && this.__importStar) || function (mod) {
    if (mod && mod.__esModule) return mod;
    var result = {};
    if (mod != null) for (var k in mod) if (Object.hasOwnProperty.call(mod, k)) result[k] = mod[k];
    result["default"] = mod;
    return result;
};
Object.defineProperty(exports, "__esModule", { value: true });
const domain_1 = __importDefault(require("elasticsearch-client-specification/src/domain"));
const fs_1 = __importDefault(require("fs"));
const changeCase = __importStar(require("change-case"));
const naming_1 = require("./naming");
const types_value_1 = require("./types-value");
const types_union_1 = require("./types-union");
const types_1 = require("./types");
const enums_1 = require("./enums");
const specs_1 = require("./specs");
if (specs_1.specification.domain_errors.length + specs_1.specification.endpoint_errors.length !== 0) {
    if (specs_1.specification.endpoint_errors.length > 0)
        console.error("The specification contains the following endpoint mapping errors:");
    for (const e of specs_1.specification.endpoint_errors)
        console.error("  - " + e);
}
else
    console.log("The specification contains no errors in any of the " + specs_1.specification.endpoints.length + " endpoints yielding " + specs_1.specification.types.length + " types");
const $createType = (type) => {
    if (naming_1.stringTypes.includes(type.name))
        return types_value_1.$createValueObject(type, "String");
    if (naming_1.objectTypes.includes(type.name))
        return types_value_1.$createValueObject(type, "Object");
    if (type.implementsUnion())
        return types_union_1.$createUnionType(type);
    return types_1.$createClass(type);
};
const $renderType = (type) => {
    if (type instanceof domain_1.default.Interface)
        return $createType(type);
    else if (type instanceof domain_1.default.Enum)
        return enums_1.$createEnum(type);
};
for (const type of specs_1.specification.types) {
    if (naming_1.numberTypes.includes(type.name))
        continue;
    if (type.name === "Date")
        continue;
    if (type.name === "Dictionary")
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