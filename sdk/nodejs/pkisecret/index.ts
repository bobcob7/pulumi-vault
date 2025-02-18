// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { SecretBackendCertArgs, SecretBackendCertState } from "./secretBackendCert";
export type SecretBackendCert = import("./secretBackendCert").SecretBackendCert;
export const SecretBackendCert: typeof import("./secretBackendCert").SecretBackendCert = null as any;

export { SecretBackendConfigCaArgs, SecretBackendConfigCaState } from "./secretBackendConfigCa";
export type SecretBackendConfigCa = import("./secretBackendConfigCa").SecretBackendConfigCa;
export const SecretBackendConfigCa: typeof import("./secretBackendConfigCa").SecretBackendConfigCa = null as any;

export { SecretBackendConfigUrlsArgs, SecretBackendConfigUrlsState } from "./secretBackendConfigUrls";
export type SecretBackendConfigUrls = import("./secretBackendConfigUrls").SecretBackendConfigUrls;
export const SecretBackendConfigUrls: typeof import("./secretBackendConfigUrls").SecretBackendConfigUrls = null as any;

export { SecretBackendCrlConfigArgs, SecretBackendCrlConfigState } from "./secretBackendCrlConfig";
export type SecretBackendCrlConfig = import("./secretBackendCrlConfig").SecretBackendCrlConfig;
export const SecretBackendCrlConfig: typeof import("./secretBackendCrlConfig").SecretBackendCrlConfig = null as any;

export { SecretBackendIntermediateCertRequestArgs, SecretBackendIntermediateCertRequestState } from "./secretBackendIntermediateCertRequest";
export type SecretBackendIntermediateCertRequest = import("./secretBackendIntermediateCertRequest").SecretBackendIntermediateCertRequest;
export const SecretBackendIntermediateCertRequest: typeof import("./secretBackendIntermediateCertRequest").SecretBackendIntermediateCertRequest = null as any;

export { SecretBackendIntermediateSetSignedArgs, SecretBackendIntermediateSetSignedState } from "./secretBackendIntermediateSetSigned";
export type SecretBackendIntermediateSetSigned = import("./secretBackendIntermediateSetSigned").SecretBackendIntermediateSetSigned;
export const SecretBackendIntermediateSetSigned: typeof import("./secretBackendIntermediateSetSigned").SecretBackendIntermediateSetSigned = null as any;

export { SecretBackendRoleArgs, SecretBackendRoleState } from "./secretBackendRole";
export type SecretBackendRole = import("./secretBackendRole").SecretBackendRole;
export const SecretBackendRole: typeof import("./secretBackendRole").SecretBackendRole = null as any;

export { SecretBackendRootCertArgs, SecretBackendRootCertState } from "./secretBackendRootCert";
export type SecretBackendRootCert = import("./secretBackendRootCert").SecretBackendRootCert;
export const SecretBackendRootCert: typeof import("./secretBackendRootCert").SecretBackendRootCert = null as any;

export { SecretBackendRootSignIntermediateArgs, SecretBackendRootSignIntermediateState } from "./secretBackendRootSignIntermediate";
export type SecretBackendRootSignIntermediate = import("./secretBackendRootSignIntermediate").SecretBackendRootSignIntermediate;
export const SecretBackendRootSignIntermediate: typeof import("./secretBackendRootSignIntermediate").SecretBackendRootSignIntermediate = null as any;

export { SecretBackendSignArgs, SecretBackendSignState } from "./secretBackendSign";
export type SecretBackendSign = import("./secretBackendSign").SecretBackendSign;
export const SecretBackendSign: typeof import("./secretBackendSign").SecretBackendSign = null as any;

utilities.lazyLoad(exports, ["SecretBackendCert"], () => require("./secretBackendCert"));
utilities.lazyLoad(exports, ["SecretBackendConfigCa"], () => require("./secretBackendConfigCa"));
utilities.lazyLoad(exports, ["SecretBackendConfigUrls"], () => require("./secretBackendConfigUrls"));
utilities.lazyLoad(exports, ["SecretBackendCrlConfig"], () => require("./secretBackendCrlConfig"));
utilities.lazyLoad(exports, ["SecretBackendIntermediateCertRequest"], () => require("./secretBackendIntermediateCertRequest"));
utilities.lazyLoad(exports, ["SecretBackendIntermediateSetSigned"], () => require("./secretBackendIntermediateSetSigned"));
utilities.lazyLoad(exports, ["SecretBackendRole"], () => require("./secretBackendRole"));
utilities.lazyLoad(exports, ["SecretBackendRootCert"], () => require("./secretBackendRootCert"));
utilities.lazyLoad(exports, ["SecretBackendRootSignIntermediate"], () => require("./secretBackendRootSignIntermediate"));
utilities.lazyLoad(exports, ["SecretBackendSign"], () => require("./secretBackendSign"));

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "vault:pkiSecret/secretBackendCert:SecretBackendCert":
                return new SecretBackendCert(name, <any>undefined, { urn })
            case "vault:pkiSecret/secretBackendConfigCa:SecretBackendConfigCa":
                return new SecretBackendConfigCa(name, <any>undefined, { urn })
            case "vault:pkiSecret/secretBackendConfigUrls:SecretBackendConfigUrls":
                return new SecretBackendConfigUrls(name, <any>undefined, { urn })
            case "vault:pkiSecret/secretBackendCrlConfig:SecretBackendCrlConfig":
                return new SecretBackendCrlConfig(name, <any>undefined, { urn })
            case "vault:pkiSecret/secretBackendIntermediateCertRequest:SecretBackendIntermediateCertRequest":
                return new SecretBackendIntermediateCertRequest(name, <any>undefined, { urn })
            case "vault:pkiSecret/secretBackendIntermediateSetSigned:SecretBackendIntermediateSetSigned":
                return new SecretBackendIntermediateSetSigned(name, <any>undefined, { urn })
            case "vault:pkiSecret/secretBackendRole:SecretBackendRole":
                return new SecretBackendRole(name, <any>undefined, { urn })
            case "vault:pkiSecret/secretBackendRootCert:SecretBackendRootCert":
                return new SecretBackendRootCert(name, <any>undefined, { urn })
            case "vault:pkiSecret/secretBackendRootSignIntermediate:SecretBackendRootSignIntermediate":
                return new SecretBackendRootSignIntermediate(name, <any>undefined, { urn })
            case "vault:pkiSecret/secretBackendSign:SecretBackendSign":
                return new SecretBackendSign(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("vault", "pkiSecret/secretBackendCert", _module)
pulumi.runtime.registerResourceModule("vault", "pkiSecret/secretBackendConfigCa", _module)
pulumi.runtime.registerResourceModule("vault", "pkiSecret/secretBackendConfigUrls", _module)
pulumi.runtime.registerResourceModule("vault", "pkiSecret/secretBackendCrlConfig", _module)
pulumi.runtime.registerResourceModule("vault", "pkiSecret/secretBackendIntermediateCertRequest", _module)
pulumi.runtime.registerResourceModule("vault", "pkiSecret/secretBackendIntermediateSetSigned", _module)
pulumi.runtime.registerResourceModule("vault", "pkiSecret/secretBackendRole", _module)
pulumi.runtime.registerResourceModule("vault", "pkiSecret/secretBackendRootCert", _module)
pulumi.runtime.registerResourceModule("vault", "pkiSecret/secretBackendRootSignIntermediate", _module)
pulumi.runtime.registerResourceModule("vault", "pkiSecret/secretBackendSign", _module)
