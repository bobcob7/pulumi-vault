// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 *
 * const example = new vault.Mount("example", {
 *     description: "This is an example mount",
 *     path: "dummy",
 *     type: "generic",
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 *
 * const kvv2_example = new vault.Mount("kvv2-example", {
 *     description: "This is an example KV Version 2 secret engine mount",
 *     path: "version2-example",
 *     type: "kv-v2",
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 *
 * const transit_example = new vault.Mount("transit-example", {
 *     description: "This is an example transit secret engine mount",
 *     options: {
 *         convergent_encryption: false,
 *     },
 *     path: "transit-example",
 *     type: "transit",
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 *
 * const pki_example = new vault.Mount("pki-example", {
 *     defaultLeaseTtlSeconds: 3600,
 *     description: "This is an example PKI mount",
 *     maxLeaseTtlSeconds: 86400,
 *     path: "pki-example",
 *     type: "pki",
 * });
 * ```
 *
 * ## Import
 *
 * Mounts can be imported using the `path`, e.g.
 *
 * ```sh
 *  $ pulumi import vault:index/mount:Mount example dummy
 * ```
 */
export class Mount extends pulumi.CustomResource {
    /**
     * Get an existing Mount resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MountState, opts?: pulumi.CustomResourceOptions): Mount {
        return new Mount(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'vault:index/mount:Mount';

    /**
     * Returns true if the given object is an instance of Mount.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Mount {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Mount.__pulumiType;
    }

    /**
     * The accessor for this mount.
     */
    public /*out*/ readonly accessor!: pulumi.Output<string>;
    /**
     * Set of managed key registry entry names that the mount in question is allowed to access
     */
    public readonly allowedManagedKeys!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies the list of keys that will not be HMAC'd by audit devices in the request data object.
     */
    public readonly auditNonHmacRequestKeys!: pulumi.Output<string[]>;
    /**
     * Specifies the list of keys that will not be HMAC'd by audit devices in the response data object.
     */
    public readonly auditNonHmacResponseKeys!: pulumi.Output<string[]>;
    /**
     * Default lease duration for tokens and secrets in seconds
     */
    public readonly defaultLeaseTtlSeconds!: pulumi.Output<number>;
    /**
     * Human-friendly description of the mount
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Boolean flag that can be explicitly set to true to enable the secrets engine to access Vault's external entropy source
     */
    public readonly externalEntropyAccess!: pulumi.Output<boolean | undefined>;
    /**
     * Boolean flag that can be explicitly set to true to enforce local mount in HA environment
     */
    public readonly local!: pulumi.Output<boolean | undefined>;
    /**
     * Maximum possible lease duration for tokens and secrets in seconds
     */
    public readonly maxLeaseTtlSeconds!: pulumi.Output<number>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     */
    public readonly namespace!: pulumi.Output<string | undefined>;
    /**
     * Specifies mount type specific options that are passed to the backend
     */
    public readonly options!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Where the secret backend will be mounted
     */
    public readonly path!: pulumi.Output<string>;
    /**
     * Boolean flag that can be explicitly set to true to enable seal wrapping for the mount, causing values stored by the mount to be wrapped by the seal's encryption capability
     */
    public readonly sealWrap!: pulumi.Output<boolean>;
    /**
     * Type of the backend, such as "aws"
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a Mount resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MountArgs | MountState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MountState | undefined;
            resourceInputs["accessor"] = state ? state.accessor : undefined;
            resourceInputs["allowedManagedKeys"] = state ? state.allowedManagedKeys : undefined;
            resourceInputs["auditNonHmacRequestKeys"] = state ? state.auditNonHmacRequestKeys : undefined;
            resourceInputs["auditNonHmacResponseKeys"] = state ? state.auditNonHmacResponseKeys : undefined;
            resourceInputs["defaultLeaseTtlSeconds"] = state ? state.defaultLeaseTtlSeconds : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["externalEntropyAccess"] = state ? state.externalEntropyAccess : undefined;
            resourceInputs["local"] = state ? state.local : undefined;
            resourceInputs["maxLeaseTtlSeconds"] = state ? state.maxLeaseTtlSeconds : undefined;
            resourceInputs["namespace"] = state ? state.namespace : undefined;
            resourceInputs["options"] = state ? state.options : undefined;
            resourceInputs["path"] = state ? state.path : undefined;
            resourceInputs["sealWrap"] = state ? state.sealWrap : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as MountArgs | undefined;
            if ((!args || args.path === undefined) && !opts.urn) {
                throw new Error("Missing required property 'path'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["allowedManagedKeys"] = args ? args.allowedManagedKeys : undefined;
            resourceInputs["auditNonHmacRequestKeys"] = args ? args.auditNonHmacRequestKeys : undefined;
            resourceInputs["auditNonHmacResponseKeys"] = args ? args.auditNonHmacResponseKeys : undefined;
            resourceInputs["defaultLeaseTtlSeconds"] = args ? args.defaultLeaseTtlSeconds : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["externalEntropyAccess"] = args ? args.externalEntropyAccess : undefined;
            resourceInputs["local"] = args ? args.local : undefined;
            resourceInputs["maxLeaseTtlSeconds"] = args ? args.maxLeaseTtlSeconds : undefined;
            resourceInputs["namespace"] = args ? args.namespace : undefined;
            resourceInputs["options"] = args ? args.options : undefined;
            resourceInputs["path"] = args ? args.path : undefined;
            resourceInputs["sealWrap"] = args ? args.sealWrap : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["accessor"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Mount.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Mount resources.
 */
export interface MountState {
    /**
     * The accessor for this mount.
     */
    accessor?: pulumi.Input<string>;
    /**
     * Set of managed key registry entry names that the mount in question is allowed to access
     */
    allowedManagedKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the list of keys that will not be HMAC'd by audit devices in the request data object.
     */
    auditNonHmacRequestKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the list of keys that will not be HMAC'd by audit devices in the response data object.
     */
    auditNonHmacResponseKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Default lease duration for tokens and secrets in seconds
     */
    defaultLeaseTtlSeconds?: pulumi.Input<number>;
    /**
     * Human-friendly description of the mount
     */
    description?: pulumi.Input<string>;
    /**
     * Boolean flag that can be explicitly set to true to enable the secrets engine to access Vault's external entropy source
     */
    externalEntropyAccess?: pulumi.Input<boolean>;
    /**
     * Boolean flag that can be explicitly set to true to enforce local mount in HA environment
     */
    local?: pulumi.Input<boolean>;
    /**
     * Maximum possible lease duration for tokens and secrets in seconds
     */
    maxLeaseTtlSeconds?: pulumi.Input<number>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     */
    namespace?: pulumi.Input<string>;
    /**
     * Specifies mount type specific options that are passed to the backend
     */
    options?: pulumi.Input<{[key: string]: any}>;
    /**
     * Where the secret backend will be mounted
     */
    path?: pulumi.Input<string>;
    /**
     * Boolean flag that can be explicitly set to true to enable seal wrapping for the mount, causing values stored by the mount to be wrapped by the seal's encryption capability
     */
    sealWrap?: pulumi.Input<boolean>;
    /**
     * Type of the backend, such as "aws"
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Mount resource.
 */
export interface MountArgs {
    /**
     * Set of managed key registry entry names that the mount in question is allowed to access
     */
    allowedManagedKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the list of keys that will not be HMAC'd by audit devices in the request data object.
     */
    auditNonHmacRequestKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the list of keys that will not be HMAC'd by audit devices in the response data object.
     */
    auditNonHmacResponseKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Default lease duration for tokens and secrets in seconds
     */
    defaultLeaseTtlSeconds?: pulumi.Input<number>;
    /**
     * Human-friendly description of the mount
     */
    description?: pulumi.Input<string>;
    /**
     * Boolean flag that can be explicitly set to true to enable the secrets engine to access Vault's external entropy source
     */
    externalEntropyAccess?: pulumi.Input<boolean>;
    /**
     * Boolean flag that can be explicitly set to true to enforce local mount in HA environment
     */
    local?: pulumi.Input<boolean>;
    /**
     * Maximum possible lease duration for tokens and secrets in seconds
     */
    maxLeaseTtlSeconds?: pulumi.Input<number>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     */
    namespace?: pulumi.Input<string>;
    /**
     * Specifies mount type specific options that are passed to the backend
     */
    options?: pulumi.Input<{[key: string]: any}>;
    /**
     * Where the secret backend will be mounted
     */
    path: pulumi.Input<string>;
    /**
     * Boolean flag that can be explicitly set to true to enable seal wrapping for the mount, causing values stored by the mount to be wrapped by the seal's encryption capability
     */
    sealWrap?: pulumi.Input<boolean>;
    /**
     * Type of the backend, such as "aws"
     */
    type: pulumi.Input<string>;
}
