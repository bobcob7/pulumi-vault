// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Consul secrets role for a Consul secrets engine in Vault. Consul secret backends can then issue Consul tokens.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 *
 * const test = new vault.consul.SecretBackend("test", {
 *     path: "consul",
 *     description: "Manages the Consul backend",
 *     address: "127.0.0.1:8500",
 *     token: "4240861b-ce3d-8530-115a-521ff070dd29",
 * });
 * const example = new vault.consul.SecretBackendRole("example", {
 *     backend: test.path,
 *     policies: ["example-policy"],
 * });
 * ```
 *
 * ## Import
 *
 * Consul secret backend roles can be imported using the `backend`, `/roles/`, and the `name` e.g.
 *
 * ```sh
 *  $ pulumi import vault:consul/secretBackendRole:SecretBackendRole example consul/roles/my-role
 * ```
 */
export class SecretBackendRole extends pulumi.CustomResource {
    /**
     * Get an existing SecretBackendRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecretBackendRoleState, opts?: pulumi.CustomResourceOptions): SecretBackendRole {
        return new SecretBackendRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'vault:consul/secretBackendRole:SecretBackendRole';

    /**
     * Returns true if the given object is an instance of SecretBackendRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecretBackendRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecretBackendRole.__pulumiType;
    }

    /**
     * The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. One of `path` or `backend` is required.
     */
    public readonly backend!: pulumi.Output<string | undefined>;
    /**
     * Indicates that the token should not be replicated globally and instead be local to the current datacenter.
     */
    public readonly local!: pulumi.Output<boolean | undefined>;
    /**
     * Maximum TTL for leases associated with this role, in seconds.
     */
    public readonly maxTtl!: pulumi.Output<number | undefined>;
    /**
     * The name of the Consul secrets engine role to create.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. **Deprecated**
     *
     * @deprecated use `backend` instead
     */
    public readonly path!: pulumi.Output<string | undefined>;
    /**
     * The list of Consul ACL policies to associate with these roles.
     */
    public readonly policies!: pulumi.Output<string[]>;
    /**
     * Specifies the type of token to create when using this role. Valid values are "client" or "management".
     */
    public readonly tokenType!: pulumi.Output<string | undefined>;
    /**
     * Specifies the TTL for this role.
     */
    public readonly ttl!: pulumi.Output<number | undefined>;

    /**
     * Create a SecretBackendRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecretBackendRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecretBackendRoleArgs | SecretBackendRoleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecretBackendRoleState | undefined;
            inputs["backend"] = state ? state.backend : undefined;
            inputs["local"] = state ? state.local : undefined;
            inputs["maxTtl"] = state ? state.maxTtl : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["path"] = state ? state.path : undefined;
            inputs["policies"] = state ? state.policies : undefined;
            inputs["tokenType"] = state ? state.tokenType : undefined;
            inputs["ttl"] = state ? state.ttl : undefined;
        } else {
            const args = argsOrState as SecretBackendRoleArgs | undefined;
            if ((!args || args.policies === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policies'");
            }
            inputs["backend"] = args ? args.backend : undefined;
            inputs["local"] = args ? args.local : undefined;
            inputs["maxTtl"] = args ? args.maxTtl : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["path"] = args ? args.path : undefined;
            inputs["policies"] = args ? args.policies : undefined;
            inputs["tokenType"] = args ? args.tokenType : undefined;
            inputs["ttl"] = args ? args.ttl : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(SecretBackendRole.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecretBackendRole resources.
 */
export interface SecretBackendRoleState {
    /**
     * The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. One of `path` or `backend` is required.
     */
    backend?: pulumi.Input<string>;
    /**
     * Indicates that the token should not be replicated globally and instead be local to the current datacenter.
     */
    local?: pulumi.Input<boolean>;
    /**
     * Maximum TTL for leases associated with this role, in seconds.
     */
    maxTtl?: pulumi.Input<number>;
    /**
     * The name of the Consul secrets engine role to create.
     */
    name?: pulumi.Input<string>;
    /**
     * The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. **Deprecated**
     *
     * @deprecated use `backend` instead
     */
    path?: pulumi.Input<string>;
    /**
     * The list of Consul ACL policies to associate with these roles.
     */
    policies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the type of token to create when using this role. Valid values are "client" or "management".
     */
    tokenType?: pulumi.Input<string>;
    /**
     * Specifies the TTL for this role.
     */
    ttl?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a SecretBackendRole resource.
 */
export interface SecretBackendRoleArgs {
    /**
     * The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. One of `path` or `backend` is required.
     */
    backend?: pulumi.Input<string>;
    /**
     * Indicates that the token should not be replicated globally and instead be local to the current datacenter.
     */
    local?: pulumi.Input<boolean>;
    /**
     * Maximum TTL for leases associated with this role, in seconds.
     */
    maxTtl?: pulumi.Input<number>;
    /**
     * The name of the Consul secrets engine role to create.
     */
    name?: pulumi.Input<string>;
    /**
     * The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. **Deprecated**
     *
     * @deprecated use `backend` instead
     */
    path?: pulumi.Input<string>;
    /**
     * The list of Consul ACL policies to associate with these roles.
     */
    policies: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the type of token to create when using this role. Valid values are "client" or "management".
     */
    tokenType?: pulumi.Input<string>;
    /**
     * Specifies the TTL for this role.
     */
    ttl?: pulumi.Input<number>;
}
