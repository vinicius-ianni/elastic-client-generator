"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const domain_1 = __importDefault(require("elasticsearch-client-specification/src/domain"));
const specs_1 = require("./specs");
const $referencedTypes = (instance) => {
    if (instance instanceof domain_1.default.Type) {
        const type = specs_1.specification.typeLookup[instance.name];
        const inherits = type instanceof domain_1.default.Interface
            ? type.inherits.flatMap(t => t.closedGenerics.map($referencedTypes)).flat()
            : [];
        return [type]
            .concat(instance.closedGenerics.map($referencedTypes).flat(Infinity))
            .concat(inherits);
    }
    else if (instance instanceof domain_1.default.ArrayOf)
        return $referencedTypes(instance.of).flat(Infinity);
    else if (instance instanceof domain_1.default.Dictionary)
        return [$referencedTypes(instance.key), $referencedTypes(instance.value)].flat(Infinity);
    else if (instance instanceof domain_1.default.UnionOf)
        return instance.items.map($referencedTypes).flat(Infinity);
};
const $import = (ns) => `import org.elasticsearch.${ns}.*;`;
exports.$imports = (type) => {
    const types = type
        .properties
        .flatMap(e => $referencedTypes(e.type))
        .concat(type.inherits.map(i => i.type))
        .concat(type.inherits.flatMap(i => i.closedGenerics.flatMap($referencedTypes)))
        .filter(e => e && e.name !== "string")
        .map(e => {
        if (e.namespace.startsWith("mapping.types.core."))
            return "mapping.types.core";
        return e.namespace;
    })
        .map($import);
    return new Set(types);
};
//# sourceMappingURL=imports.js.map