// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manage lease count quotas which enforce the number of leases that can be created.
 * A lease count quota can be created at the root level or defined on a namespace or mount by
 * specifying a path when creating the quota.
 *
 * See [Vault's Documentation](https://www.vaultproject.io/docs/enterprise/lease-count-quotas) for more
 * information.
 *
 * **Note** this feature is available only with Vault Enterprise.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 *
 * const global = new vault.QuotaLeaseCount("global", {
 *     maxLeases: 100,
 *     path: "",
 * });
 * ```
 *
 * ## Import
 *
 * Lease count quotas can be imported using their names
 *
 * ```sh
 *  $ pulumi import vault:index/quotaLeaseCount:QuotaLeaseCount global global
 * ```
 */
export class QuotaLeaseCount extends pulumi.CustomResource {
    /**
     * Get an existing QuotaLeaseCount resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: QuotaLeaseCountState, opts?: pulumi.CustomResourceOptions): QuotaLeaseCount {
        return new QuotaLeaseCount(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'vault:index/quotaLeaseCount:QuotaLeaseCount';

    /**
     * Returns true if the given object is an instance of QuotaLeaseCount.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is QuotaLeaseCount {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === QuotaLeaseCount.__pulumiType;
    }

    /**
     * The maximum number of leases to be allowed by the quota
     * rule. The `maxLeases` must be positive.
     */
    public readonly maxLeases!: pulumi.Output<number>;
    /**
     * Name of the rate limit quota
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured namespace.
     * *Available only for Vault Enterprise*.
     */
    public readonly namespace!: pulumi.Output<string | undefined>;
    /**
     * Path of the mount or namespace to apply the quota. A blank path configures a
     * global rate limit quota. For example `namespace1/` adds a quota to a full namespace,
     * `namespace1/auth/userpass` adds a `quota` to `userpass` in `namespace1`.
     * Updating this field on an existing quota can have "moving" effects. For example, updating
     * `auth/userpass` to `namespace1/auth/userpass` moves this quota from being a global mount quota to
     * a namespace specific mount quota. **Note, namespaces are supported in Enterprise only.**
     */
    public readonly path!: pulumi.Output<string | undefined>;

    /**
     * Create a QuotaLeaseCount resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: QuotaLeaseCountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: QuotaLeaseCountArgs | QuotaLeaseCountState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as QuotaLeaseCountState | undefined;
            resourceInputs["maxLeases"] = state ? state.maxLeases : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namespace"] = state ? state.namespace : undefined;
            resourceInputs["path"] = state ? state.path : undefined;
        } else {
            const args = argsOrState as QuotaLeaseCountArgs | undefined;
            if ((!args || args.maxLeases === undefined) && !opts.urn) {
                throw new Error("Missing required property 'maxLeases'");
            }
            resourceInputs["maxLeases"] = args ? args.maxLeases : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namespace"] = args ? args.namespace : undefined;
            resourceInputs["path"] = args ? args.path : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(QuotaLeaseCount.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering QuotaLeaseCount resources.
 */
export interface QuotaLeaseCountState {
    /**
     * The maximum number of leases to be allowed by the quota
     * rule. The `maxLeases` must be positive.
     */
    maxLeases?: pulumi.Input<number>;
    /**
     * Name of the rate limit quota
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured namespace.
     * *Available only for Vault Enterprise*.
     */
    namespace?: pulumi.Input<string>;
    /**
     * Path of the mount or namespace to apply the quota. A blank path configures a
     * global rate limit quota. For example `namespace1/` adds a quota to a full namespace,
     * `namespace1/auth/userpass` adds a `quota` to `userpass` in `namespace1`.
     * Updating this field on an existing quota can have "moving" effects. For example, updating
     * `auth/userpass` to `namespace1/auth/userpass` moves this quota from being a global mount quota to
     * a namespace specific mount quota. **Note, namespaces are supported in Enterprise only.**
     */
    path?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a QuotaLeaseCount resource.
 */
export interface QuotaLeaseCountArgs {
    /**
     * The maximum number of leases to be allowed by the quota
     * rule. The `maxLeases` must be positive.
     */
    maxLeases: pulumi.Input<number>;
    /**
     * Name of the rate limit quota
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured namespace.
     * *Available only for Vault Enterprise*.
     */
    namespace?: pulumi.Input<string>;
    /**
     * Path of the mount or namespace to apply the quota. A blank path configures a
     * global rate limit quota. For example `namespace1/` adds a quota to a full namespace,
     * `namespace1/auth/userpass` adds a `quota` to `userpass` in `namespace1`.
     * Updating this field on an existing quota can have "moving" effects. For example, updating
     * `auth/userpass` to `namespace1/auth/userpass` moves this quota from being a global mount quota to
     * a namespace specific mount quota. **Note, namespaces are supported in Enterprise only.**
     */
    path?: pulumi.Input<string>;
}
