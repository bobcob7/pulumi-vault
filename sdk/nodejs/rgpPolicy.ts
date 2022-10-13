// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource to manage Role Governing Policy (RGP) via [Sentinel](https://www.vaultproject.io/docs/enterprise/sentinel/index.html).
 *
 * **Note** this feature is available only with Vault Enterprise.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 *
 * const allow_all = new vault.RgpPolicy("allow-all", {
 *     enforcementLevel: "soft-mandatory",
 *     policy: `main = rule {
 *   true
 * }
 * `,
 * });
 * ```
 */
export class RgpPolicy extends pulumi.CustomResource {
    /**
     * Get an existing RgpPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RgpPolicyState, opts?: pulumi.CustomResourceOptions): RgpPolicy {
        return new RgpPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'vault:index/rgpPolicy:RgpPolicy';

    /**
     * Returns true if the given object is an instance of RgpPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RgpPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RgpPolicy.__pulumiType;
    }

    /**
     * Enforcement level of Sentinel policy. Can be either `advisory` or `soft-mandatory` or `hard-mandatory`
     */
    public readonly enforcementLevel!: pulumi.Output<string>;
    /**
     * The name of the policy
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     */
    public readonly namespace!: pulumi.Output<string | undefined>;
    /**
     * String containing a Sentinel policy
     */
    public readonly policy!: pulumi.Output<string>;

    /**
     * Create a RgpPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RgpPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RgpPolicyArgs | RgpPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RgpPolicyState | undefined;
            resourceInputs["enforcementLevel"] = state ? state.enforcementLevel : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namespace"] = state ? state.namespace : undefined;
            resourceInputs["policy"] = state ? state.policy : undefined;
        } else {
            const args = argsOrState as RgpPolicyArgs | undefined;
            if ((!args || args.enforcementLevel === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enforcementLevel'");
            }
            if ((!args || args.policy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policy'");
            }
            resourceInputs["enforcementLevel"] = args ? args.enforcementLevel : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namespace"] = args ? args.namespace : undefined;
            resourceInputs["policy"] = args ? args.policy : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RgpPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RgpPolicy resources.
 */
export interface RgpPolicyState {
    /**
     * Enforcement level of Sentinel policy. Can be either `advisory` or `soft-mandatory` or `hard-mandatory`
     */
    enforcementLevel?: pulumi.Input<string>;
    /**
     * The name of the policy
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     */
    namespace?: pulumi.Input<string>;
    /**
     * String containing a Sentinel policy
     */
    policy?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RgpPolicy resource.
 */
export interface RgpPolicyArgs {
    /**
     * Enforcement level of Sentinel policy. Can be either `advisory` or `soft-mandatory` or `hard-mandatory`
     */
    enforcementLevel: pulumi.Input<string>;
    /**
     * The name of the policy
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     */
    namespace?: pulumi.Input<string>;
    /**
     * String containing a Sentinel policy
     */
    policy: pulumi.Input<string>;
}
