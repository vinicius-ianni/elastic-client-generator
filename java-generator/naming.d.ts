import Domain from "elasticsearch-client-specification/src/domain";
export declare const stringTypes: string[];
export declare const numberTypes: string[];
export declare const objectTypes: string[];
export declare const $typeName: (name: string) => string;
export declare const $propertyName: (prop: string) => string;
export declare const $fieldName: (prop: string) => string;
export declare const $parseFieldName: (prop: string) => string;
export declare const $instanceOf: (instance: Domain.InstanceOf) => any;
