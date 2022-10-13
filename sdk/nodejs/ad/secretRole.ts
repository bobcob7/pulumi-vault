// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 *
 * const config = new vault.ad.SecretBackend("config", {
 *     backend: "ad",
 *     binddn: "CN=Administrator,CN=Users,DC=corp,DC=example,DC=net",
 *     bindpass: "SuperSecretPassw0rd",
 *     url: "ldaps://ad",
 *     insecureTls: true,
 *     userdn: "CN=Users,DC=corp,DC=example,DC=net",
 * });
 * const role = new vault.ad.SecretRole("role", {
 *     backend: config.backend,
 *     role: "bob",
 *     serviceAccountName: "Bob",
 *     ttl: 60,
 * });
 * ```
 *
 * ## Import
 *
 * AD secret backend roles can be imported using the `path`, e.g.
 *
 * ```sh
 *  $ pulumi import vault:ad/secretRole:SecretRole role ad/roles/bob
 * ```
 */
export class SecretRole extends pulumi.CustomResource {
    /**
     * Get an existing SecretRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecretRoleState, opts?: pulumi.CustomResourceOptions): SecretRole {
        return new SecretRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'vault:ad/secretRole:SecretRole';

    /**
     * Returns true if the given object is an instance of SecretRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecretRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecretRole.__pulumiType;
    }

    /**
     * The path the AD secret backend is mounted at,
     * with no leading or trailing `/`s.
     */
    public readonly backend!: pulumi.Output<string>;
    /**
     * Timestamp of the last password rotation by Vault.
     */
    public /*out*/ readonly lastVaultRotation!: pulumi.Output<string>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     */
    public readonly namespace!: pulumi.Output<string | undefined>;
    /**
     * Timestamp of the last password set by Vault.
     */
    public /*out*/ readonly passwordLastSet!: pulumi.Output<string>;
    /**
     * The name to identify this role within the backend.
     * Must be unique within the backend.
     */
    public readonly role!: pulumi.Output<string>;
    /**
     * Specifies the name of the Active Directory service
     * account mapped to this role.
     */
    public readonly serviceAccountName!: pulumi.Output<string>;
    /**
     * The password time-to-live in seconds. Defaults to the configuration
     * ttl if not provided.
     */
    public readonly ttl!: pulumi.Output<number | undefined>;

    /**
     * Create a SecretRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecretRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecretRoleArgs | SecretRoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecretRoleState | undefined;
            resourceInputs["backend"] = state ? state.backend : undefined;
            resourceInputs["lastVaultRotation"] = state ? state.lastVaultRotation : undefined;
            resourceInputs["namespace"] = state ? state.namespace : undefined;
            resourceInputs["passwordLastSet"] = state ? state.passwordLastSet : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["serviceAccountName"] = state ? state.serviceAccountName : undefined;
            resourceInputs["ttl"] = state ? state.ttl : undefined;
        } else {
            const args = argsOrState as SecretRoleArgs | undefined;
            if ((!args || args.backend === undefined) && !opts.urn) {
                throw new Error("Missing required property 'backend'");
            }
            if ((!args || args.role === undefined) && !opts.urn) {
                throw new Error("Missing required property 'role'");
            }
            if ((!args || args.serviceAccountName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceAccountName'");
            }
            resourceInputs["backend"] = args ? args.backend : undefined;
            resourceInputs["namespace"] = args ? args.namespace : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["serviceAccountName"] = args ? args.serviceAccountName : undefined;
            resourceInputs["ttl"] = args ? args.ttl : undefined;
            resourceInputs["lastVaultRotation"] = undefined /*out*/;
            resourceInputs["passwordLastSet"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SecretRole.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecretRole resources.
 */
export interface SecretRoleState {
    /**
     * The path the AD secret backend is mounted at,
     * with no leading or trailing `/`s.
     */
    backend?: pulumi.Input<string>;
    /**
     * Timestamp of the last password rotation by Vault.
     */
    lastVaultRotation?: pulumi.Input<string>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     */
    namespace?: pulumi.Input<string>;
    /**
     * Timestamp of the last password set by Vault.
     */
    passwordLastSet?: pulumi.Input<string>;
    /**
     * The name to identify this role within the backend.
     * Must be unique within the backend.
     */
    role?: pulumi.Input<string>;
    /**
     * Specifies the name of the Active Directory service
     * account mapped to this role.
     */
    serviceAccountName?: pulumi.Input<string>;
    /**
     * The password time-to-live in seconds. Defaults to the configuration
     * ttl if not provided.
     */
    ttl?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a SecretRole resource.
 */
export interface SecretRoleArgs {
    /**
     * The path the AD secret backend is mounted at,
     * with no leading or trailing `/`s.
     */
    backend: pulumi.Input<string>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     */
    namespace?: pulumi.Input<string>;
    /**
     * The name to identify this role within the backend.
     * Must be unique within the backend.
     */
    role: pulumi.Input<string>;
    /**
     * Specifies the name of the Active Directory service
     * account mapped to this role.
     */
    serviceAccountName: pulumi.Input<string>;
    /**
     * The password time-to-live in seconds. Defaults to the configuration
     * ttl if not provided.
     */
    ttl?: pulumi.Input<number>;
}
