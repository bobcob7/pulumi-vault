// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 * ### Generic secret
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 *
 * const rundeckAuth = vault.generic.getSecret({
 *     path: "secret/rundeck_auth",
 * });
 * ```
 * ## Required Vault Capabilities
 *
 * Use of this resource requires the `read` capability on the given path.
 */
export function getSecret(args: GetSecretArgs, opts?: pulumi.InvokeOptions): Promise<GetSecretResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("vault:generic/getSecret:getSecret", {
        "namespace": args.namespace,
        "path": args.path,
        "version": args.version,
        "withLeaseStartTime": args.withLeaseStartTime,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecret.
 */
export interface GetSecretArgs {
    /**
     * The namespace of the target resource.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     */
    namespace?: string;
    /**
     * The full logical path from which to request data.
     * To read data from the "generic" secret backend mounted in Vault by
     * default, this should be prefixed with `secret/`. Reading from other backends
     * with this data source is possible; consult each backend's documentation
     * to see which endpoints support the `GET` method.
     */
    path: string;
    /**
     * The version of the secret to read. This is used by the
     * Vault KV secrets engine - version 2 to indicate which version of the secret
     * to read.
     */
    version?: number;
    withLeaseStartTime?: boolean;
}

/**
 * A collection of values returned by getSecret.
 */
export interface GetSecretResult {
    /**
     * A mapping whose keys are the top-level data keys returned from
     * Vault and whose values are the corresponding values. This map can only
     * represent string data, so any non-string values returned from Vault are
     * serialized as JSON.
     */
    readonly data: {[key: string]: any};
    /**
     * A string containing the full data payload retrieved from
     * Vault, serialized in JSON format.
     */
    readonly dataJson: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The duration of the secret lease, in seconds relative
     * to the time the data was requested. Once this time has passed any plan
     * generated with this data may fail to apply.
     */
    readonly leaseDuration: number;
    /**
     * The lease identifier assigned by Vault, if any.
     */
    readonly leaseId: string;
    readonly leaseRenewable: boolean;
    readonly leaseStartTime: string;
    readonly namespace?: string;
    readonly path: string;
    readonly version?: number;
    readonly withLeaseStartTime?: boolean;
}

export function getSecretOutput(args: GetSecretOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSecretResult> {
    return pulumi.output(args).apply(a => getSecret(a, opts))
}

/**
 * A collection of arguments for invoking getSecret.
 */
export interface GetSecretOutputArgs {
    /**
     * The namespace of the target resource.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     */
    namespace?: pulumi.Input<string>;
    /**
     * The full logical path from which to request data.
     * To read data from the "generic" secret backend mounted in Vault by
     * default, this should be prefixed with `secret/`. Reading from other backends
     * with this data source is possible; consult each backend's documentation
     * to see which endpoints support the `GET` method.
     */
    path: pulumi.Input<string>;
    /**
     * The version of the secret to read. This is used by the
     * Vault KV secrets engine - version 2 to indicate which version of the secret
     * to read.
     */
    version?: pulumi.Input<number>;
    withLeaseStartTime?: pulumi.Input<boolean>;
}
