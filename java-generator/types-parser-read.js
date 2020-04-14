"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const domain_1 = __importDefault(require("elasticsearch-client-specification/src/domain"));
const naming_1 = require("./naming");
const specs_1 = require("./specs");
const valueTypes = ["String", "Float", "Double", "Integer", "Boolean", "Long"];
const $declareType = (type) => {
    if (type instanceof domain_1.default.ArrayOf)
        return $declareType(type.of);
    if (type instanceof domain_1.default.Type) {
        const lookup = specs_1.specification.typeLookup[type.name];
        if (lookup instanceof domain_1.default.Enum)
            return "Field";
    }
    const t = naming_1.$instanceOf(type);
    if (valueTypes.includes(t))
        return t.replace("Integer", "Int");
    return "Object";
};
const $propertyExpression = (prop, parent) => `${naming_1.$typeName(parent.name)}::set${naming_1.$propertyName(prop.name)}`;
const $fieldRef = (prop) => naming_1.$parseFieldName(prop.name);
const $valueParse = (typeSymbol, type, parent, recurse = 0) => {
    if (valueTypes.includes(typeSymbol))
        return "";
    if (typeSymbol === "Date")
        return "(p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text())))";
    if (typeSymbol === "Object")
        return "(p, t) -> p.objectText()";
    if (typeSymbol === "String")
        return "(p, t) -> p.text()";
    if (naming_1.stringTypes.includes(typeSymbol))
        return `(p, t) -> ${typeSymbol}.createFrom(p)`;
    if (type instanceof domain_1.default.UnionOf)
        return `(p, t) ->  new ${typeSymbol}() /* TODO UnionOf */`;
    if (type instanceof domain_1.default.ArrayOf) {
        if (recurse !== 0)
            return `(p, t) -> null /* TODO ${typeSymbol} */`;
        return $valueParse(naming_1.$instanceOf(type.of), type.of, parent, ++recurse);
    }
    if (type instanceof domain_1.default.Dictionary) {
        const $key = (i) => {
            if (i instanceof domain_1.default.Type) {
                if (valueTypes.includes(naming_1.$instanceOf(i)))
                    return `n -> () -> n`;
                if (naming_1.stringTypes.includes(i.name))
                    return `n -> () -> new ${naming_1.$instanceOf(i)}(n)`;
                return `${naming_1.$instanceOf(i)}.PARSER.apply(p, null)`;
            }
            return `null /* TODO ${naming_1.$instanceOf(i)} */`;
        };
        const $val = (i) => {
            const ti = naming_1.$instanceOf(i);
            if (i instanceof domain_1.default.Type) {
                if (ti === "Object")
                    return `XContentParser::binaryValue`;
                if (ti === "String")
                    return `pp -> pp.text()`;
                if (ti === "Integer")
                    return `pp -> pp.intValue()`;
                if (ti === "Boolean")
                    return `pp -> pp.booleanValue()`;
                if (ti === "Double")
                    return `pp -> pp.doubleValue()`;
                if (ti === "Long")
                    return `pp -> pp.longValue()`;
                const tt = specs_1.specification.typeLookup[i.name];
                if (tt instanceof domain_1.default.Enum)
                    return `pp -> ${ti}.PARSER.apply(p)`;
                return `pp -> ${ti}.PARSER.apply(pp, null)`;
            }
            return `null /* TODO ${ti} */`;
        };
        return `(p, t) -> new NamedContainer<>(${$key(type.key)},${$val(type.value)})`;
    }
    const t = specs_1.specification.typeLookup[type.name];
    if (t instanceof domain_1.default.Enum)
        return `(p, t) -> ${typeSymbol}.PARSER.apply(p)`;
    if (t instanceof domain_1.default.Interface && t.implementsUnion())
        return `(p, t) -> new ${naming_1.$typeName(t.name)}().fromXContent(p)`;
    if (["TDocument", "TPartialDocument", "TResult", "T", "TCatRecord"].includes(typeSymbol))
        return `(p, t) -> null /* TODO ${typeSymbol} */`;
    return `(p, t) -> ${typeSymbol}.PARSER.apply(p, t)`;
};
const recursiveArray = (t) => t instanceof domain_1.default.ArrayOf ? recursiveArray(t.of) : t;
const $parseProperty = (prop, parent) => {
    const typeSymbol = naming_1.$instanceOf(prop.type);
    let declareType = $declareType(prop.type);
    if (prop.type instanceof domain_1.default.ArrayOf)
        declareType += "Array";
    const exp = $propertyExpression(prop, parent);
    let args = $valueParse(typeSymbol, prop.type, parent);
    if (args !== "")
        args += ", ";
    const closedOverType = recursiveArray(prop.type);
    let trailingArgs = $fieldRef(prop);
    const lookup = specs_1.specification.typeLookup[closedOverType.name];
    if (lookup instanceof domain_1.default.Enum) {
        if (prop.type instanceof domain_1.default.ArrayOf)
            trailingArgs += ", ObjectParser.ValueType.STRING_ARRAY";
        else
            trailingArgs += ", ObjectParser.ValueType.STRING_OR_NULL";
    }
    const declareParser = `PARSER.declare${declareType}(${exp}, ${args}${trailingArgs});`;
    if (closedOverType instanceof domain_1.default.Type && closedOverType.closedGenerics.length > 0) {
        const closedOverSymbol = naming_1.$instanceOf(closedOverType);
        const field = naming_1.$fieldName(prop.name);
        let instance = `${closedOverSymbol} ${field} = new ${closedOverSymbol}();`;
        if (closedOverSymbol.includes("<T>") || closedOverSymbol.includes("<TDocument>")) {
            const rawSym = closedOverSymbol.replace("<T>", "").replace("<TDocument>", "");
            const newRaw = closedOverSymbol.replace("<T>", "<>").replace("<TDocument>", "<>");
            instance = `${rawSym} ${field} = new ${newRaw}();`;
        }
        return [instance, declareParser.replace(closedOverSymbol, field)];
    }
    return [declareParser];
};
exports.$parseProperties = (type) => type.properties.flatMap(p => $parseProperty(p, type)).join("\n    ");
//# sourceMappingURL=types-parser-read.js.map