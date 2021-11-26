// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an JWT/OIDC auth backend role in a Vault server. See the [Vault
 * documentation](https://www.vaultproject.io/docs/auth/jwt.html) for more
 * information.
 *
 * ## Example Usage
 *
 * Role for JWT backend:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 *
 * const jwt = new vault.jwt.AuthBackend("jwt", {path: "jwt"});
 * const example = new vault.jwt.AuthBackendRole("example", {
 *     backend: jwt.path,
 *     roleName: "test-role",
 *     tokenPolicies: [
 *         "default",
 *         "dev",
 *         "prod",
 *     ],
 *     boundAudiences: ["https://myco.test"],
 *     boundClaims: {
 *         color: "red,green,blue",
 *     },
 *     userClaim: "https://vault/user",
 *     roleType: "jwt",
 * });
 * ```
 *
 * Role for OIDC backend:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 *
 * const oidc = new vault.jwt.AuthBackend("oidc", {
 *     path: "oidc",
 *     defaultRole: "test-role",
 * });
 * const example = new vault.jwt.AuthBackendRole("example", {
 *     backend: oidc.path,
 *     roleName: "test-role",
 *     tokenPolicies: [
 *         "default",
 *         "dev",
 *         "prod",
 *     ],
 *     userClaim: "https://vault/user",
 *     roleType: "oidc",
 *     allowedRedirectUris: ["http://localhost:8200/ui/vault/auth/oidc/oidc/callback"],
 * });
 * ```
 *
 * ## Import
 *
 * JWT authentication backend roles can be imported using the `path`, e.g.
 *
 * ```sh
 *  $ pulumi import vault:jwt/authBackendRole:AuthBackendRole example auth/jwt/role/test-role
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
    public static readonly __pulumiType = 'vault:jwt/authBackendRole:AuthBackendRole';

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

    /**
     * The list of allowed values for redirectUri during OIDC logins.
     * Required for OIDC roles
     */
    public readonly allowedRedirectUris!: pulumi.Output<string[] | undefined>;
    /**
     * The unique name of the auth backend to configure.
     * Defaults to `jwt`.
     */
    public readonly backend!: pulumi.Output<string | undefined>;
    /**
     * (Required for roles of type `jwt`, optional for roles of
     * type `oidc`) List of `aud` claims to match against. Any match is sufficient.
     */
    public readonly boundAudiences!: pulumi.Output<string[] | undefined>;
    /**
     * If set, a map of claims to values to match against.
     * A claim's value must be a string, which may contain one value or multiple
     * comma-separated values, e.g. `"red"` or `"red,green,blue"`.
     */
    public readonly boundClaims!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * How to interpret values in the claims/values
     * map (`boundClaims`): can be either `string` (exact match) or `glob` (wildcard
     * match). Requires Vault 1.4.0 or above.
     */
    public readonly boundClaimsType!: pulumi.Output<string>;
    /**
     * If set, requires that the `sub` claim matches
     * this value.
     */
    public readonly boundSubject!: pulumi.Output<string | undefined>;
    /**
     * If set, a map of claims (keys) to be copied
     * to specified metadata fields (values).
     */
    public readonly claimMappings!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The amount of leeway to add to all claims to account for clock skew, in
     * seconds. Defaults to `60` seconds if set to `0` and can be disabled if set to `-1`.
     * Only applicable with "jwt" roles.
     */
    public readonly clockSkewLeeway!: pulumi.Output<number | undefined>;
    /**
     * Disable bound claim value parsing. Useful when values contain commas.
     */
    public readonly disableBoundClaimsParsing!: pulumi.Output<boolean | undefined>;
    /**
     * The amount of leeway to add to expiration (`exp`) claims to account for
     * clock skew, in seconds. Defaults to `60` seconds if set to `0` and can be disabled if set to `-1`.
     * Only applicable with "jwt" roles.
     */
    public readonly expirationLeeway!: pulumi.Output<number | undefined>;
    /**
     * The claim to use to uniquely identify
     * the set of groups to which the user belongs; this will be used as the names
     * for the Identity group aliases created due to a successful login. The claim
     * value must be a list of strings.
     */
    public readonly groupsClaim!: pulumi.Output<string | undefined>;
    /**
     * The amount of leeway to add to not before (`nbf`) claims to account for
     * clock skew, in seconds. Defaults to `60` seconds if set to `0` and can be disabled if set to `-1`.
     * Only applicable with "jwt" roles.
     */
    public readonly notBeforeLeeway!: pulumi.Output<number | undefined>;
    /**
     * If set, a list of OIDC scopes to be used with an OIDC role.
     * The standard scope "openid" is automatically included and need not be specified.
     */
    public readonly oidcScopes!: pulumi.Output<string[] | undefined>;
    /**
     * The name of the role.
     */
    public readonly roleName!: pulumi.Output<string>;
    /**
     * Type of role, either "oidc" (default) or "jwt".
     */
    public readonly roleType!: pulumi.Output<string>;
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
     * The
     * [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
     * if any, in number of seconds to set on the token.
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
     * The claim to use to uniquely identify
     * the user; this will be used as the name for the Identity entity alias created
     * due to a successful login.
     */
    public readonly userClaim!: pulumi.Output<string>;
    /**
     * Log received OIDC tokens and claims when debug-level
     * logging is active. Not recommended in production since sensitive information may be present
     * in OIDC responses.
     */
    public readonly verboseOidcLogging!: pulumi.Output<boolean | undefined>;

    /**
     * Create a AuthBackendRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AuthBackendRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AuthBackendRoleArgs | AuthBackendRoleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AuthBackendRoleState | undefined;
            inputs["allowedRedirectUris"] = state ? state.allowedRedirectUris : undefined;
            inputs["backend"] = state ? state.backend : undefined;
            inputs["boundAudiences"] = state ? state.boundAudiences : undefined;
            inputs["boundClaims"] = state ? state.boundClaims : undefined;
            inputs["boundClaimsType"] = state ? state.boundClaimsType : undefined;
            inputs["boundSubject"] = state ? state.boundSubject : undefined;
            inputs["claimMappings"] = state ? state.claimMappings : undefined;
            inputs["clockSkewLeeway"] = state ? state.clockSkewLeeway : undefined;
            inputs["disableBoundClaimsParsing"] = state ? state.disableBoundClaimsParsing : undefined;
            inputs["expirationLeeway"] = state ? state.expirationLeeway : undefined;
            inputs["groupsClaim"] = state ? state.groupsClaim : undefined;
            inputs["notBeforeLeeway"] = state ? state.notBeforeLeeway : undefined;
            inputs["oidcScopes"] = state ? state.oidcScopes : undefined;
            inputs["roleName"] = state ? state.roleName : undefined;
            inputs["roleType"] = state ? state.roleType : undefined;
            inputs["tokenBoundCidrs"] = state ? state.tokenBoundCidrs : undefined;
            inputs["tokenExplicitMaxTtl"] = state ? state.tokenExplicitMaxTtl : undefined;
            inputs["tokenMaxTtl"] = state ? state.tokenMaxTtl : undefined;
            inputs["tokenNoDefaultPolicy"] = state ? state.tokenNoDefaultPolicy : undefined;
            inputs["tokenNumUses"] = state ? state.tokenNumUses : undefined;
            inputs["tokenPeriod"] = state ? state.tokenPeriod : undefined;
            inputs["tokenPolicies"] = state ? state.tokenPolicies : undefined;
            inputs["tokenTtl"] = state ? state.tokenTtl : undefined;
            inputs["tokenType"] = state ? state.tokenType : undefined;
            inputs["userClaim"] = state ? state.userClaim : undefined;
            inputs["verboseOidcLogging"] = state ? state.verboseOidcLogging : undefined;
        } else {
            const args = argsOrState as AuthBackendRoleArgs | undefined;
            if ((!args || args.roleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleName'");
            }
            if ((!args || args.userClaim === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userClaim'");
            }
            inputs["allowedRedirectUris"] = args ? args.allowedRedirectUris : undefined;
            inputs["backend"] = args ? args.backend : undefined;
            inputs["boundAudiences"] = args ? args.boundAudiences : undefined;
            inputs["boundClaims"] = args ? args.boundClaims : undefined;
            inputs["boundClaimsType"] = args ? args.boundClaimsType : undefined;
            inputs["boundSubject"] = args ? args.boundSubject : undefined;
            inputs["claimMappings"] = args ? args.claimMappings : undefined;
            inputs["clockSkewLeeway"] = args ? args.clockSkewLeeway : undefined;
            inputs["disableBoundClaimsParsing"] = args ? args.disableBoundClaimsParsing : undefined;
            inputs["expirationLeeway"] = args ? args.expirationLeeway : undefined;
            inputs["groupsClaim"] = args ? args.groupsClaim : undefined;
            inputs["notBeforeLeeway"] = args ? args.notBeforeLeeway : undefined;
            inputs["oidcScopes"] = args ? args.oidcScopes : undefined;
            inputs["roleName"] = args ? args.roleName : undefined;
            inputs["roleType"] = args ? args.roleType : undefined;
            inputs["tokenBoundCidrs"] = args ? args.tokenBoundCidrs : undefined;
            inputs["tokenExplicitMaxTtl"] = args ? args.tokenExplicitMaxTtl : undefined;
            inputs["tokenMaxTtl"] = args ? args.tokenMaxTtl : undefined;
            inputs["tokenNoDefaultPolicy"] = args ? args.tokenNoDefaultPolicy : undefined;
            inputs["tokenNumUses"] = args ? args.tokenNumUses : undefined;
            inputs["tokenPeriod"] = args ? args.tokenPeriod : undefined;
            inputs["tokenPolicies"] = args ? args.tokenPolicies : undefined;
            inputs["tokenTtl"] = args ? args.tokenTtl : undefined;
            inputs["tokenType"] = args ? args.tokenType : undefined;
            inputs["userClaim"] = args ? args.userClaim : undefined;
            inputs["verboseOidcLogging"] = args ? args.verboseOidcLogging : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AuthBackendRole.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AuthBackendRole resources.
 */
export interface AuthBackendRoleState {
    /**
     * The list of allowed values for redirectUri during OIDC logins.
     * Required for OIDC roles
     */
    allowedRedirectUris?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The unique name of the auth backend to configure.
     * Defaults to `jwt`.
     */
    backend?: pulumi.Input<string>;
    /**
     * (Required for roles of type `jwt`, optional for roles of
     * type `oidc`) List of `aud` claims to match against. Any match is sufficient.
     */
    boundAudiences?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * If set, a map of claims to values to match against.
     * A claim's value must be a string, which may contain one value or multiple
     * comma-separated values, e.g. `"red"` or `"red,green,blue"`.
     */
    boundClaims?: pulumi.Input<{[key: string]: any}>;
    /**
     * How to interpret values in the claims/values
     * map (`boundClaims`): can be either `string` (exact match) or `glob` (wildcard
     * match). Requires Vault 1.4.0 or above.
     */
    boundClaimsType?: pulumi.Input<string>;
    /**
     * If set, requires that the `sub` claim matches
     * this value.
     */
    boundSubject?: pulumi.Input<string>;
    /**
     * If set, a map of claims (keys) to be copied
     * to specified metadata fields (values).
     */
    claimMappings?: pulumi.Input<{[key: string]: any}>;
    /**
     * The amount of leeway to add to all claims to account for clock skew, in
     * seconds. Defaults to `60` seconds if set to `0` and can be disabled if set to `-1`.
     * Only applicable with "jwt" roles.
     */
    clockSkewLeeway?: pulumi.Input<number>;
    /**
     * Disable bound claim value parsing. Useful when values contain commas.
     */
    disableBoundClaimsParsing?: pulumi.Input<boolean>;
    /**
     * The amount of leeway to add to expiration (`exp`) claims to account for
     * clock skew, in seconds. Defaults to `60` seconds if set to `0` and can be disabled if set to `-1`.
     * Only applicable with "jwt" roles.
     */
    expirationLeeway?: pulumi.Input<number>;
    /**
     * The claim to use to uniquely identify
     * the set of groups to which the user belongs; this will be used as the names
     * for the Identity group aliases created due to a successful login. The claim
     * value must be a list of strings.
     */
    groupsClaim?: pulumi.Input<string>;
    /**
     * The amount of leeway to add to not before (`nbf`) claims to account for
     * clock skew, in seconds. Defaults to `60` seconds if set to `0` and can be disabled if set to `-1`.
     * Only applicable with "jwt" roles.
     */
    notBeforeLeeway?: pulumi.Input<number>;
    /**
     * If set, a list of OIDC scopes to be used with an OIDC role.
     * The standard scope "openid" is automatically included and need not be specified.
     */
    oidcScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the role.
     */
    roleName?: pulumi.Input<string>;
    /**
     * Type of role, either "oidc" (default) or "jwt".
     */
    roleType?: pulumi.Input<string>;
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
     * The
     * [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
     * if any, in number of seconds to set on the token.
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
     * The claim to use to uniquely identify
     * the user; this will be used as the name for the Identity entity alias created
     * due to a successful login.
     */
    userClaim?: pulumi.Input<string>;
    /**
     * Log received OIDC tokens and claims when debug-level
     * logging is active. Not recommended in production since sensitive information may be present
     * in OIDC responses.
     */
    verboseOidcLogging?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a AuthBackendRole resource.
 */
export interface AuthBackendRoleArgs {
    /**
     * The list of allowed values for redirectUri during OIDC logins.
     * Required for OIDC roles
     */
    allowedRedirectUris?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The unique name of the auth backend to configure.
     * Defaults to `jwt`.
     */
    backend?: pulumi.Input<string>;
    /**
     * (Required for roles of type `jwt`, optional for roles of
     * type `oidc`) List of `aud` claims to match against. Any match is sufficient.
     */
    boundAudiences?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * If set, a map of claims to values to match against.
     * A claim's value must be a string, which may contain one value or multiple
     * comma-separated values, e.g. `"red"` or `"red,green,blue"`.
     */
    boundClaims?: pulumi.Input<{[key: string]: any}>;
    /**
     * How to interpret values in the claims/values
     * map (`boundClaims`): can be either `string` (exact match) or `glob` (wildcard
     * match). Requires Vault 1.4.0 or above.
     */
    boundClaimsType?: pulumi.Input<string>;
    /**
     * If set, requires that the `sub` claim matches
     * this value.
     */
    boundSubject?: pulumi.Input<string>;
    /**
     * If set, a map of claims (keys) to be copied
     * to specified metadata fields (values).
     */
    claimMappings?: pulumi.Input<{[key: string]: any}>;
    /**
     * The amount of leeway to add to all claims to account for clock skew, in
     * seconds. Defaults to `60` seconds if set to `0` and can be disabled if set to `-1`.
     * Only applicable with "jwt" roles.
     */
    clockSkewLeeway?: pulumi.Input<number>;
    /**
     * Disable bound claim value parsing. Useful when values contain commas.
     */
    disableBoundClaimsParsing?: pulumi.Input<boolean>;
    /**
     * The amount of leeway to add to expiration (`exp`) claims to account for
     * clock skew, in seconds. Defaults to `60` seconds if set to `0` and can be disabled if set to `-1`.
     * Only applicable with "jwt" roles.
     */
    expirationLeeway?: pulumi.Input<number>;
    /**
     * The claim to use to uniquely identify
     * the set of groups to which the user belongs; this will be used as the names
     * for the Identity group aliases created due to a successful login. The claim
     * value must be a list of strings.
     */
    groupsClaim?: pulumi.Input<string>;
    /**
     * The amount of leeway to add to not before (`nbf`) claims to account for
     * clock skew, in seconds. Defaults to `60` seconds if set to `0` and can be disabled if set to `-1`.
     * Only applicable with "jwt" roles.
     */
    notBeforeLeeway?: pulumi.Input<number>;
    /**
     * If set, a list of OIDC scopes to be used with an OIDC role.
     * The standard scope "openid" is automatically included and need not be specified.
     */
    oidcScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the role.
     */
    roleName: pulumi.Input<string>;
    /**
     * Type of role, either "oidc" (default) or "jwt".
     */
    roleType?: pulumi.Input<string>;
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
     * The
     * [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
     * if any, in number of seconds to set on the token.
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
     * The claim to use to uniquely identify
     * the user; this will be used as the name for the Identity entity alias created
     * due to a successful login.
     */
    userClaim: pulumi.Input<string>;
    /**
     * Log received OIDC tokens and claims when debug-level
     * logging is active. Not recommended in production since sensitive information may be present
     * in OIDC responses.
     */
    verboseOidcLogging?: pulumi.Input<boolean>;
}
