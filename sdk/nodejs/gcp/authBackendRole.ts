// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a resource to create a role in an [GCP auth backend within Vault](https://www.vaultproject.io/docs/auth/gcp.html).
 *
 * ## Import
 *
 * GCP authentication roles can be imported using the `path`, e.g.
 *
 * ```sh
 *  $ pulumi import vault:gcp/authBackendRole:AuthBackendRole my_role auth/gcp/role/my_role
 * ```
 */
export class AuthBackendRole extends pulumi.CustomResource {
    /**
     * Get an existing AuthBackendRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AuthBackendRoleState, opts?: pulumi.CustomResourceOptions): AuthBackendRole {
        return new AuthBackendRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'vault:gcp/authBackendRole:AuthBackendRole';

    /**
     * Returns true if the given object is an instance of AuthBackendRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AuthBackendRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AuthBackendRole.__pulumiType;
    }

    public readonly addGroupAliases!: pulumi.Output<boolean>;
    /**
     * A flag to determine if this role should allow GCE instances to authenticate by inferring service accounts from the GCE identity metadata token.
     */
    public readonly allowGceInference!: pulumi.Output<boolean>;
    /**
     * Path to the mounted GCP auth backend
     */
    public readonly backend!: pulumi.Output<string | undefined>;
    /**
     * The instance groups that an authorized instance must belong to in order to be authenticated. If specified, either `boundZones` or `boundRegions` must be set too.
     */
    public readonly boundInstanceGroups!: pulumi.Output<string[]>;
    /**
     * A comma-separated list of GCP labels formatted as `"key:value"` strings that must be set on authorized GCE instances. Because GCP labels are not currently ACL'd, we recommend that this be used in conjunction with other restrictions.
     */
    public readonly boundLabels!: pulumi.Output<string[]>;
    /**
     * GCP Projects that the role exists within
     */
    public readonly boundProjects!: pulumi.Output<string[] | undefined>;
    /**
     * The list of regions that a GCE instance must belong to in order to be authenticated. If boundInstanceGroups is provided, it is assumed to be a regional group and the group must belong to this region. If boundZones are provided, this attribute is ignored.
     */
    public readonly boundRegions!: pulumi.Output<string[]>;
    /**
     * GCP Service Accounts allowed to issue tokens under this role. (Note: **Required** if role is `iam`)
     */
    public readonly boundServiceAccounts!: pulumi.Output<string[]>;
    /**
     * The list of zones that a GCE instance must belong to in order to be authenticated. If boundInstanceGroups is provided, it is assumed to be a zonal group and the group must belong to this zone.
     */
    public readonly boundZones!: pulumi.Output<string[]>;
    /**
     * The number of seconds past the time of authentication that the login param JWT must expire within. For example, if a user attempts to login with a token that expires within an hour and this is set to 15 minutes, Vault will return an error prompting the user to create a new signed JWT with a shorter `exp`. The GCE metadata tokens currently do not allow the `exp` claim to be customized.
     */
    public readonly maxJwtExp!: pulumi.Output<string>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     */
    public readonly namespace!: pulumi.Output<string | undefined>;
    /**
     * Name of the GCP role
     */
    public readonly role!: pulumi.Output<string>;
    /**
     * List of CIDR blocks; if set, specifies blocks of IP
     * addresses which can authenticate successfully, and ties the resulting token to these blocks
     * as well.
     */
    public readonly tokenBoundCidrs!: pulumi.Output<string[] | undefined>;
    /**
     * If set, will encode an
     * [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
     * onto the token in number of seconds. This is a hard cap even if `tokenTtl` and
     * `tokenMaxTtl` would otherwise allow a renewal.
     */
    public readonly tokenExplicitMaxTtl!: pulumi.Output<number | undefined>;
    /**
     * The maximum lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     */
    public readonly tokenMaxTtl!: pulumi.Output<number | undefined>;
    /**
     * If set, the default policy will not be set on
     * generated tokens; otherwise it will be added to the policies set in token_policies.
     */
    public readonly tokenNoDefaultPolicy!: pulumi.Output<boolean | undefined>;
    /**
     * The [maximum number](https://www.vaultproject.io/api-docs/gcp#token_num_uses)
     * of times a generated token may be used (within its lifetime); 0 means unlimited.
     */
    public readonly tokenNumUses!: pulumi.Output<number | undefined>;
    /**
     * If set, indicates that the
     * token generated using this role should never expire. The token should be renewed within the
     * duration specified by this value. At each renewal, the token's TTL will be set to the
     * value of this field. Specified in seconds.
     */
    public readonly tokenPeriod!: pulumi.Output<number | undefined>;
    /**
     * List of policies to encode onto generated tokens. Depending
     * on the auth method, this list may be supplemented by user/group/other values.
     */
    public readonly tokenPolicies!: pulumi.Output<string[] | undefined>;
    /**
     * The incremental lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     */
    public readonly tokenTtl!: pulumi.Output<number | undefined>;
    /**
     * The type of token that should be generated. Can be `service`,
     * `batch`, or `default` to use the mount's tuned default (which unless changed will be
     * `service` tokens). For token store roles, there are two additional possibilities:
     * `default-service` and `default-batch` which specify the type to return unless the client
     * requests a different type at generation time.
     */
    public readonly tokenType!: pulumi.Output<string | undefined>;
    /**
     * Type of GCP authentication role (either `gce` or `iam`)
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a AuthBackendRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AuthBackendRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AuthBackendRoleArgs | AuthBackendRoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AuthBackendRoleState | undefined;
            resourceInputs["addGroupAliases"] = state ? state.addGroupAliases : undefined;
            resourceInputs["allowGceInference"] = state ? state.allowGceInference : undefined;
            resourceInputs["backend"] = state ? state.backend : undefined;
            resourceInputs["boundInstanceGroups"] = state ? state.boundInstanceGroups : undefined;
            resourceInputs["boundLabels"] = state ? state.boundLabels : undefined;
            resourceInputs["boundProjects"] = state ? state.boundProjects : undefined;
            resourceInputs["boundRegions"] = state ? state.boundRegions : undefined;
            resourceInputs["boundServiceAccounts"] = state ? state.boundServiceAccounts : undefined;
            resourceInputs["boundZones"] = state ? state.boundZones : undefined;
            resourceInputs["maxJwtExp"] = state ? state.maxJwtExp : undefined;
            resourceInputs["namespace"] = state ? state.namespace : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["tokenBoundCidrs"] = state ? state.tokenBoundCidrs : undefined;
            resourceInputs["tokenExplicitMaxTtl"] = state ? state.tokenExplicitMaxTtl : undefined;
            resourceInputs["tokenMaxTtl"] = state ? state.tokenMaxTtl : undefined;
            resourceInputs["tokenNoDefaultPolicy"] = state ? state.tokenNoDefaultPolicy : undefined;
            resourceInputs["tokenNumUses"] = state ? state.tokenNumUses : undefined;
            resourceInputs["tokenPeriod"] = state ? state.tokenPeriod : undefined;
            resourceInputs["tokenPolicies"] = state ? state.tokenPolicies : undefined;
            resourceInputs["tokenTtl"] = state ? state.tokenTtl : undefined;
            resourceInputs["tokenType"] = state ? state.tokenType : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as AuthBackendRoleArgs | undefined;
            if ((!args || args.role === undefined) && !opts.urn) {
                throw new Error("Missing required property 'role'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["addGroupAliases"] = args ? args.addGroupAliases : undefined;
            resourceInputs["allowGceInference"] = args ? args.allowGceInference : undefined;
            resourceInputs["backend"] = args ? args.backend : undefined;
            resourceInputs["boundInstanceGroups"] = args ? args.boundInstanceGroups : undefined;
            resourceInputs["boundLabels"] = args ? args.boundLabels : undefined;
            resourceInputs["boundProjects"] = args ? args.boundProjects : undefined;
            resourceInputs["boundRegions"] = args ? args.boundRegions : undefined;
            resourceInputs["boundServiceAccounts"] = args ? args.boundServiceAccounts : undefined;
            resourceInputs["boundZones"] = args ? args.boundZones : undefined;
            resourceInputs["maxJwtExp"] = args ? args.maxJwtExp : undefined;
            resourceInputs["namespace"] = args ? args.namespace : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["tokenBoundCidrs"] = args ? args.tokenBoundCidrs : undefined;
            resourceInputs["tokenExplicitMaxTtl"] = args ? args.tokenExplicitMaxTtl : undefined;
            resourceInputs["tokenMaxTtl"] = args ? args.tokenMaxTtl : undefined;
            resourceInputs["tokenNoDefaultPolicy"] = args ? args.tokenNoDefaultPolicy : undefined;
            resourceInputs["tokenNumUses"] = args ? args.tokenNumUses : undefined;
            resourceInputs["tokenPeriod"] = args ? args.tokenPeriod : undefined;
            resourceInputs["tokenPolicies"] = args ? args.tokenPolicies : undefined;
            resourceInputs["tokenTtl"] = args ? args.tokenTtl : undefined;
            resourceInputs["tokenType"] = args ? args.tokenType : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AuthBackendRole.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AuthBackendRole resources.
 */
export interface AuthBackendRoleState {
    addGroupAliases?: pulumi.Input<boolean>;
    /**
     * A flag to determine if this role should allow GCE instances to authenticate by inferring service accounts from the GCE identity metadata token.
     */
    allowGceInference?: pulumi.Input<boolean>;
    /**
     * Path to the mounted GCP auth backend
     */
    backend?: pulumi.Input<string>;
    /**
     * The instance groups that an authorized instance must belong to in order to be authenticated. If specified, either `boundZones` or `boundRegions` must be set too.
     */
    boundInstanceGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A comma-separated list of GCP labels formatted as `"key:value"` strings that must be set on authorized GCE instances. Because GCP labels are not currently ACL'd, we recommend that this be used in conjunction with other restrictions.
     */
    boundLabels?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * GCP Projects that the role exists within
     */
    boundProjects?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The list of regions that a GCE instance must belong to in order to be authenticated. If boundInstanceGroups is provided, it is assumed to be a regional group and the group must belong to this region. If boundZones are provided, this attribute is ignored.
     */
    boundRegions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * GCP Service Accounts allowed to issue tokens under this role. (Note: **Required** if role is `iam`)
     */
    boundServiceAccounts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The list of zones that a GCE instance must belong to in order to be authenticated. If boundInstanceGroups is provided, it is assumed to be a zonal group and the group must belong to this zone.
     */
    boundZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The number of seconds past the time of authentication that the login param JWT must expire within. For example, if a user attempts to login with a token that expires within an hour and this is set to 15 minutes, Vault will return an error prompting the user to create a new signed JWT with a shorter `exp`. The GCE metadata tokens currently do not allow the `exp` claim to be customized.
     */
    maxJwtExp?: pulumi.Input<string>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     */
    namespace?: pulumi.Input<string>;
    /**
     * Name of the GCP role
     */
    role?: pulumi.Input<string>;
    /**
     * List of CIDR blocks; if set, specifies blocks of IP
     * addresses which can authenticate successfully, and ties the resulting token to these blocks
     * as well.
     */
    tokenBoundCidrs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * If set, will encode an
     * [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
     * onto the token in number of seconds. This is a hard cap even if `tokenTtl` and
     * `tokenMaxTtl` would otherwise allow a renewal.
     */
    tokenExplicitMaxTtl?: pulumi.Input<number>;
    /**
     * The maximum lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     */
    tokenMaxTtl?: pulumi.Input<number>;
    /**
     * If set, the default policy will not be set on
     * generated tokens; otherwise it will be added to the policies set in token_policies.
     */
    tokenNoDefaultPolicy?: pulumi.Input<boolean>;
    /**
     * The [maximum number](https://www.vaultproject.io/api-docs/gcp#token_num_uses)
     * of times a generated token may be used (within its lifetime); 0 means unlimited.
     */
    tokenNumUses?: pulumi.Input<number>;
    /**
     * If set, indicates that the
     * token generated using this role should never expire. The token should be renewed within the
     * duration specified by this value. At each renewal, the token's TTL will be set to the
     * value of this field. Specified in seconds.
     */
    tokenPeriod?: pulumi.Input<number>;
    /**
     * List of policies to encode onto generated tokens. Depending
     * on the auth method, this list may be supplemented by user/group/other values.
     */
    tokenPolicies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The incremental lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     */
    tokenTtl?: pulumi.Input<number>;
    /**
     * The type of token that should be generated. Can be `service`,
     * `batch`, or `default` to use the mount's tuned default (which unless changed will be
     * `service` tokens). For token store roles, there are two additional possibilities:
     * `default-service` and `default-batch` which specify the type to return unless the client
     * requests a different type at generation time.
     */
    tokenType?: pulumi.Input<string>;
    /**
     * Type of GCP authentication role (either `gce` or `iam`)
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AuthBackendRole resource.
 */
export interface AuthBackendRoleArgs {
    addGroupAliases?: pulumi.Input<boolean>;
    /**
     * A flag to determine if this role should allow GCE instances to authenticate by inferring service accounts from the GCE identity metadata token.
     */
    allowGceInference?: pulumi.Input<boolean>;
    /**
     * Path to the mounted GCP auth backend
     */
    backend?: pulumi.Input<string>;
    /**
     * The instance groups that an authorized instance must belong to in order to be authenticated. If specified, either `boundZones` or `boundRegions` must be set too.
     */
    boundInstanceGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A comma-separated list of GCP labels formatted as `"key:value"` strings that must be set on authorized GCE instances. Because GCP labels are not currently ACL'd, we recommend that this be used in conjunction with other restrictions.
     */
    boundLabels?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * GCP Projects that the role exists within
     */
    boundProjects?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The list of regions that a GCE instance must belong to in order to be authenticated. If boundInstanceGroups is provided, it is assumed to be a regional group and the group must belong to this region. If boundZones are provided, this attribute is ignored.
     */
    boundRegions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * GCP Service Accounts allowed to issue tokens under this role. (Note: **Required** if role is `iam`)
     */
    boundServiceAccounts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The list of zones that a GCE instance must belong to in order to be authenticated. If boundInstanceGroups is provided, it is assumed to be a zonal group and the group must belong to this zone.
     */
    boundZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The number of seconds past the time of authentication that the login param JWT must expire within. For example, if a user attempts to login with a token that expires within an hour and this is set to 15 minutes, Vault will return an error prompting the user to create a new signed JWT with a shorter `exp`. The GCE metadata tokens currently do not allow the `exp` claim to be customized.
     */
    maxJwtExp?: pulumi.Input<string>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     */
    namespace?: pulumi.Input<string>;
    /**
     * Name of the GCP role
     */
    role: pulumi.Input<string>;
    /**
     * List of CIDR blocks; if set, specifies blocks of IP
     * addresses which can authenticate successfully, and ties the resulting token to these blocks
     * as well.
     */
    tokenBoundCidrs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * If set, will encode an
     * [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
     * onto the token in number of seconds. This is a hard cap even if `tokenTtl` and
     * `tokenMaxTtl` would otherwise allow a renewal.
     */
    tokenExplicitMaxTtl?: pulumi.Input<number>;
    /**
     * The maximum lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     */
    tokenMaxTtl?: pulumi.Input<number>;
    /**
     * If set, the default policy will not be set on
     * generated tokens; otherwise it will be added to the policies set in token_policies.
     */
    tokenNoDefaultPolicy?: pulumi.Input<boolean>;
    /**
     * The [maximum number](https://www.vaultproject.io/api-docs/gcp#token_num_uses)
     * of times a generated token may be used (within its lifetime); 0 means unlimited.
     */
    tokenNumUses?: pulumi.Input<number>;
    /**
     * If set, indicates that the
     * token generated using this role should never expire. The token should be renewed within the
     * duration specified by this value. At each renewal, the token's TTL will be set to the
     * value of this field. Specified in seconds.
     */
    tokenPeriod?: pulumi.Input<number>;
    /**
     * List of policies to encode onto generated tokens. Depending
     * on the auth method, this list may be supplemented by user/group/other values.
     */
    tokenPolicies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The incremental lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     */
    tokenTtl?: pulumi.Input<number>;
    /**
     * The type of token that should be generated. Can be `service`,
     * `batch`, or `default` to use the mount's tuned default (which unless changed will be
     * `service` tokens). For token store roles, there are two additional possibilities:
     * `default-service` and `default-batch` which specify the type to return unless the client
     * requests a different type at generation time.
     */
    tokenType?: pulumi.Input<string>;
    /**
     * Type of GCP authentication role (either `gce` or `iam`)
     */
    type: pulumi.Input<string>;
}
