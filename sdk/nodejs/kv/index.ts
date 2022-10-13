// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { GetSecretArgs, GetSecretResult, GetSecretOutputArgs } from "./getSecret";
export const getSecret: typeof import("./getSecret").getSecret = null as any;
export const getSecretOutput: typeof import("./getSecret").getSecretOutput = null as any;

export { GetSecretSubKeysV2Args, GetSecretSubKeysV2Result, GetSecretSubKeysV2OutputArgs } from "./getSecretSubKeysV2";
export const getSecretSubKeysV2: typeof import("./getSecretSubKeysV2").getSecretSubKeysV2 = null as any;
export const getSecretSubKeysV2Output: typeof import("./getSecretSubKeysV2").getSecretSubKeysV2Output = null as any;

export { GetSecretV2Args, GetSecretV2Result, GetSecretV2OutputArgs } from "./getSecretV2";
export const getSecretV2: typeof import("./getSecretV2").getSecretV2 = null as any;
export const getSecretV2Output: typeof import("./getSecretV2").getSecretV2Output = null as any;

export { GetSecretsListArgs, GetSecretsListResult, GetSecretsListOutputArgs } from "./getSecretsList";
export const getSecretsList: typeof import("./getSecretsList").getSecretsList = null as any;
export const getSecretsListOutput: typeof import("./getSecretsList").getSecretsListOutput = null as any;

export { GetSecretsV2ListArgs, GetSecretsV2ListResult, GetSecretsV2ListOutputArgs } from "./getSecretsV2List";
export const getSecretsV2List: typeof import("./getSecretsV2List").getSecretsV2List = null as any;
export const getSecretsV2ListOutput: typeof import("./getSecretsV2List").getSecretsV2ListOutput = null as any;

export { SecretArgs, SecretState } from "./secret";
export type Secret = import("./secret").Secret;
export const Secret: typeof import("./secret").Secret = null as any;

export { SecretBackendV2Args, SecretBackendV2State } from "./secretBackendV2";
export type SecretBackendV2 = import("./secretBackendV2").SecretBackendV2;
export const SecretBackendV2: typeof import("./secretBackendV2").SecretBackendV2 = null as any;

export { SecretV2Args, SecretV2State } from "./secretV2";
export type SecretV2 = import("./secretV2").SecretV2;
export const SecretV2: typeof import("./secretV2").SecretV2 = null as any;

utilities.lazyLoad(exports, ["getSecret","getSecretOutput"], () => require("./getSecret"));
utilities.lazyLoad(exports, ["getSecretSubKeysV2","getSecretSubKeysV2Output"], () => require("./getSecretSubKeysV2"));
utilities.lazyLoad(exports, ["getSecretV2","getSecretV2Output"], () => require("./getSecretV2"));
utilities.lazyLoad(exports, ["getSecretsList","getSecretsListOutput"], () => require("./getSecretsList"));
utilities.lazyLoad(exports, ["getSecretsV2List","getSecretsV2ListOutput"], () => require("./getSecretsV2List"));
utilities.lazyLoad(exports, ["Secret"], () => require("./secret"));
utilities.lazyLoad(exports, ["SecretBackendV2"], () => require("./secretBackendV2"));
utilities.lazyLoad(exports, ["SecretV2"], () => require("./secretV2"));

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "vault:kv/secret:Secret":
                return new Secret(name, <any>undefined, { urn })
            case "vault:kv/secretBackendV2:SecretBackendV2":
                return new SecretBackendV2(name, <any>undefined, { urn })
            case "vault:kv/secretV2:SecretV2":
                return new SecretV2(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("vault", "kv/secret", _module)
pulumi.runtime.registerResourceModule("vault", "kv/secretBackendV2", _module)
pulumi.runtime.registerResourceModule("vault", "kv/secretV2", _module)
