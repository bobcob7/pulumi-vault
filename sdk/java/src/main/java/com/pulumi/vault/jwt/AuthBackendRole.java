// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.jwt;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.vault.Utilities;
import com.pulumi.vault.jwt.AuthBackendRoleArgs;
import com.pulumi.vault.jwt.inputs.AuthBackendRoleState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an JWT/OIDC auth backend role in a Vault server. See the [Vault
 * documentation](https://www.vaultproject.io/docs/auth/jwt.html) for more
 * information.
 * 
 * ## Example Usage
 * 
 * Role for JWT backend:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.vault.jwt.AuthBackend;
 * import com.pulumi.vault.jwt.AuthBackendArgs;
 * import com.pulumi.vault.jwt.AuthBackendRole;
 * import com.pulumi.vault.jwt.AuthBackendRoleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var jwt = new AuthBackend(&#34;jwt&#34;, AuthBackendArgs.builder()        
 *             .path(&#34;jwt&#34;)
 *             .build());
 * 
 *         var example = new AuthBackendRole(&#34;example&#34;, AuthBackendRoleArgs.builder()        
 *             .backend(jwt.path())
 *             .roleName(&#34;test-role&#34;)
 *             .tokenPolicies(            
 *                 &#34;default&#34;,
 *                 &#34;dev&#34;,
 *                 &#34;prod&#34;)
 *             .boundAudiences(&#34;https://myco.test&#34;)
 *             .boundClaims(Map.of(&#34;color&#34;, &#34;red,green,blue&#34;))
 *             .userClaim(&#34;https://vault/user&#34;)
 *             .roleType(&#34;jwt&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Role for OIDC backend:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.vault.jwt.AuthBackend;
 * import com.pulumi.vault.jwt.AuthBackendArgs;
 * import com.pulumi.vault.jwt.AuthBackendRole;
 * import com.pulumi.vault.jwt.AuthBackendRoleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var oidc = new AuthBackend(&#34;oidc&#34;, AuthBackendArgs.builder()        
 *             .path(&#34;oidc&#34;)
 *             .defaultRole(&#34;test-role&#34;)
 *             .build());
 * 
 *         var example = new AuthBackendRole(&#34;example&#34;, AuthBackendRoleArgs.builder()        
 *             .backend(oidc.path())
 *             .roleName(&#34;test-role&#34;)
 *             .tokenPolicies(            
 *                 &#34;default&#34;,
 *                 &#34;dev&#34;,
 *                 &#34;prod&#34;)
 *             .userClaim(&#34;https://vault/user&#34;)
 *             .roleType(&#34;oidc&#34;)
 *             .allowedRedirectUris(&#34;http://localhost:8200/ui/vault/auth/oidc/oidc/callback&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * JWT authentication backend roles can be imported using the `path`, e.g.
 * 
 * ```sh
 *  $ pulumi import vault:jwt/authBackendRole:AuthBackendRole example auth/jwt/role/test-role
 * ```
 * 
 */
@ResourceType(type="vault:jwt/authBackendRole:AuthBackendRole")
public class AuthBackendRole extends com.pulumi.resources.CustomResource {
    /**
     * The list of allowed values for redirect_uri during OIDC logins.
     * Required for OIDC roles
     * 
     */
    @Export(name="allowedRedirectUris", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedRedirectUris;

    /**
     * @return The list of allowed values for redirect_uri during OIDC logins.
     * Required for OIDC roles
     * 
     */
    public Output<Optional<List<String>>> allowedRedirectUris() {
        return Codegen.optional(this.allowedRedirectUris);
    }
    /**
     * The unique name of the auth backend to configure.
     * Defaults to `jwt`.
     * 
     */
    @Export(name="backend", type=String.class, parameters={})
    private Output</* @Nullable */ String> backend;

    /**
     * @return The unique name of the auth backend to configure.
     * Defaults to `jwt`.
     * 
     */
    public Output<Optional<String>> backend() {
        return Codegen.optional(this.backend);
    }
    /**
     * (For &#34;jwt&#34; roles, at least one of `bound_audiences`, `bound_subject`, `bound_claims`
     * or `token_bound_cidrs` is required. Optional for &#34;oidc&#34; roles.) List of `aud` claims to match against.
     * Any match is sufficient.
     * 
     */
    @Export(name="boundAudiences", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> boundAudiences;

    /**
     * @return (For &#34;jwt&#34; roles, at least one of `bound_audiences`, `bound_subject`, `bound_claims`
     * or `token_bound_cidrs` is required. Optional for &#34;oidc&#34; roles.) List of `aud` claims to match against.
     * Any match is sufficient.
     * 
     */
    public Output<Optional<List<String>>> boundAudiences() {
        return Codegen.optional(this.boundAudiences);
    }
    /**
     * If set, a map of claims to values to match against.
     * A claim&#39;s value must be a string, which may contain one value or multiple
     * comma-separated values, e.g. `&#34;red&#34;` or `&#34;red,green,blue&#34;`.
     * 
     */
    @Export(name="boundClaims", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> boundClaims;

    /**
     * @return If set, a map of claims to values to match against.
     * A claim&#39;s value must be a string, which may contain one value or multiple
     * comma-separated values, e.g. `&#34;red&#34;` or `&#34;red,green,blue&#34;`.
     * 
     */
    public Output<Optional<Map<String,Object>>> boundClaims() {
        return Codegen.optional(this.boundClaims);
    }
    /**
     * How to interpret values in the claims/values
     * map (`bound_claims`): can be either `string` (exact match) or `glob` (wildcard
     * match). Requires Vault 1.4.0 or above.
     * 
     */
    @Export(name="boundClaimsType", type=String.class, parameters={})
    private Output<String> boundClaimsType;

    /**
     * @return How to interpret values in the claims/values
     * map (`bound_claims`): can be either `string` (exact match) or `glob` (wildcard
     * match). Requires Vault 1.4.0 or above.
     * 
     */
    public Output<String> boundClaimsType() {
        return this.boundClaimsType;
    }
    /**
     * If set, requires that the `sub` claim matches
     * this value.
     * 
     */
    @Export(name="boundSubject", type=String.class, parameters={})
    private Output</* @Nullable */ String> boundSubject;

    /**
     * @return If set, requires that the `sub` claim matches
     * this value.
     * 
     */
    public Output<Optional<String>> boundSubject() {
        return Codegen.optional(this.boundSubject);
    }
    /**
     * If set, a map of claims (keys) to be copied
     * to specified metadata fields (values).
     * 
     */
    @Export(name="claimMappings", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> claimMappings;

    /**
     * @return If set, a map of claims (keys) to be copied
     * to specified metadata fields (values).
     * 
     */
    public Output<Optional<Map<String,Object>>> claimMappings() {
        return Codegen.optional(this.claimMappings);
    }
    /**
     * The amount of leeway to add to all claims to account for clock skew, in
     * seconds. Defaults to `60` seconds if set to `0` and can be disabled if set to `-1`.
     * Only applicable with &#34;jwt&#34; roles.
     * 
     */
    @Export(name="clockSkewLeeway", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> clockSkewLeeway;

    /**
     * @return The amount of leeway to add to all claims to account for clock skew, in
     * seconds. Defaults to `60` seconds if set to `0` and can be disabled if set to `-1`.
     * Only applicable with &#34;jwt&#34; roles.
     * 
     */
    public Output<Optional<Integer>> clockSkewLeeway() {
        return Codegen.optional(this.clockSkewLeeway);
    }
    /**
     * Disable bound claim value parsing. Useful when values contain commas.
     * 
     */
    @Export(name="disableBoundClaimsParsing", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableBoundClaimsParsing;

    /**
     * @return Disable bound claim value parsing. Useful when values contain commas.
     * 
     */
    public Output<Optional<Boolean>> disableBoundClaimsParsing() {
        return Codegen.optional(this.disableBoundClaimsParsing);
    }
    /**
     * The amount of leeway to add to expiration (`exp`) claims to account for
     * clock skew, in seconds. Defaults to `60` seconds if set to `0` and can be disabled if set to `-1`.
     * Only applicable with &#34;jwt&#34; roles.
     * 
     */
    @Export(name="expirationLeeway", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> expirationLeeway;

    /**
     * @return The amount of leeway to add to expiration (`exp`) claims to account for
     * clock skew, in seconds. Defaults to `60` seconds if set to `0` and can be disabled if set to `-1`.
     * Only applicable with &#34;jwt&#34; roles.
     * 
     */
    public Output<Optional<Integer>> expirationLeeway() {
        return Codegen.optional(this.expirationLeeway);
    }
    /**
     * The claim to use to uniquely identify
     * the set of groups to which the user belongs; this will be used as the names
     * for the Identity group aliases created due to a successful login. The claim
     * value must be a list of strings.
     * 
     */
    @Export(name="groupsClaim", type=String.class, parameters={})
    private Output</* @Nullable */ String> groupsClaim;

    /**
     * @return The claim to use to uniquely identify
     * the set of groups to which the user belongs; this will be used as the names
     * for the Identity group aliases created due to a successful login. The claim
     * value must be a list of strings.
     * 
     */
    public Output<Optional<String>> groupsClaim() {
        return Codegen.optional(this.groupsClaim);
    }
    /**
     * Specifies the allowable elapsed time in seconds since the last time
     * the user was actively authenticated with the OIDC provider.
     * 
     */
    @Export(name="maxAge", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxAge;

    /**
     * @return Specifies the allowable elapsed time in seconds since the last time
     * the user was actively authenticated with the OIDC provider.
     * 
     */
    public Output<Optional<Integer>> maxAge() {
        return Codegen.optional(this.maxAge);
    }
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     * 
     */
    @Export(name="namespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> namespace;

    /**
     * @return The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     * 
     */
    public Output<Optional<String>> namespace() {
        return Codegen.optional(this.namespace);
    }
    /**
     * The amount of leeway to add to not before (`nbf`) claims to account for
     * clock skew, in seconds. Defaults to `60` seconds if set to `0` and can be disabled if set to `-1`.
     * Only applicable with &#34;jwt&#34; roles.
     * 
     */
    @Export(name="notBeforeLeeway", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> notBeforeLeeway;

    /**
     * @return The amount of leeway to add to not before (`nbf`) claims to account for
     * clock skew, in seconds. Defaults to `60` seconds if set to `0` and can be disabled if set to `-1`.
     * Only applicable with &#34;jwt&#34; roles.
     * 
     */
    public Output<Optional<Integer>> notBeforeLeeway() {
        return Codegen.optional(this.notBeforeLeeway);
    }
    /**
     * If set, a list of OIDC scopes to be used with an OIDC role.
     * The standard scope &#34;openid&#34; is automatically included and need not be specified.
     * 
     */
    @Export(name="oidcScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> oidcScopes;

    /**
     * @return If set, a list of OIDC scopes to be used with an OIDC role.
     * The standard scope &#34;openid&#34; is automatically included and need not be specified.
     * 
     */
    public Output<Optional<List<String>>> oidcScopes() {
        return Codegen.optional(this.oidcScopes);
    }
    /**
     * The name of the role.
     * 
     */
    @Export(name="roleName", type=String.class, parameters={})
    private Output<String> roleName;

    /**
     * @return The name of the role.
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }
    /**
     * Type of role, either &#34;oidc&#34; (default) or &#34;jwt&#34;.
     * 
     */
    @Export(name="roleType", type=String.class, parameters={})
    private Output<String> roleType;

    /**
     * @return Type of role, either &#34;oidc&#34; (default) or &#34;jwt&#34;.
     * 
     */
    public Output<String> roleType() {
        return this.roleType;
    }
    /**
     * List of CIDR blocks; if set, specifies blocks of IP
     * addresses which can authenticate successfully, and ties the resulting token to these blocks
     * as well.
     * 
     */
    @Export(name="tokenBoundCidrs", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tokenBoundCidrs;

    /**
     * @return List of CIDR blocks; if set, specifies blocks of IP
     * addresses which can authenticate successfully, and ties the resulting token to these blocks
     * as well.
     * 
     */
    public Output<Optional<List<String>>> tokenBoundCidrs() {
        return Codegen.optional(this.tokenBoundCidrs);
    }
    /**
     * If set, will encode an
     * [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
     * onto the token in number of seconds. This is a hard cap even if `token_ttl` and
     * `token_max_ttl` would otherwise allow a renewal.
     * 
     */
    @Export(name="tokenExplicitMaxTtl", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> tokenExplicitMaxTtl;

    /**
     * @return If set, will encode an
     * [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
     * onto the token in number of seconds. This is a hard cap even if `token_ttl` and
     * `token_max_ttl` would otherwise allow a renewal.
     * 
     */
    public Output<Optional<Integer>> tokenExplicitMaxTtl() {
        return Codegen.optional(this.tokenExplicitMaxTtl);
    }
    /**
     * The maximum lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     * 
     */
    @Export(name="tokenMaxTtl", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> tokenMaxTtl;

    /**
     * @return The maximum lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     * 
     */
    public Output<Optional<Integer>> tokenMaxTtl() {
        return Codegen.optional(this.tokenMaxTtl);
    }
    /**
     * If set, the default policy will not be set on
     * generated tokens; otherwise it will be added to the policies set in token_policies.
     * 
     */
    @Export(name="tokenNoDefaultPolicy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> tokenNoDefaultPolicy;

    /**
     * @return If set, the default policy will not be set on
     * generated tokens; otherwise it will be added to the policies set in token_policies.
     * 
     */
    public Output<Optional<Boolean>> tokenNoDefaultPolicy() {
        return Codegen.optional(this.tokenNoDefaultPolicy);
    }
    /**
     * The [maximum number](https://www.vaultproject.io/api-docs/jwt#token_num_uses)
     * of times a generated token may be used (within its lifetime); 0 means unlimited.
     * 
     */
    @Export(name="tokenNumUses", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> tokenNumUses;

    /**
     * @return The [maximum number](https://www.vaultproject.io/api-docs/jwt#token_num_uses)
     * of times a generated token may be used (within its lifetime); 0 means unlimited.
     * 
     */
    public Output<Optional<Integer>> tokenNumUses() {
        return Codegen.optional(this.tokenNumUses);
    }
    /**
     * If set, indicates that the
     * token generated using this role should never expire. The token should be renewed within the
     * duration specified by this value. At each renewal, the token&#39;s TTL will be set to the
     * value of this field. Specified in seconds.
     * 
     */
    @Export(name="tokenPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> tokenPeriod;

    /**
     * @return If set, indicates that the
     * token generated using this role should never expire. The token should be renewed within the
     * duration specified by this value. At each renewal, the token&#39;s TTL will be set to the
     * value of this field. Specified in seconds.
     * 
     */
    public Output<Optional<Integer>> tokenPeriod() {
        return Codegen.optional(this.tokenPeriod);
    }
    /**
     * List of policies to encode onto generated tokens. Depending
     * on the auth method, this list may be supplemented by user/group/other values.
     * 
     */
    @Export(name="tokenPolicies", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tokenPolicies;

    /**
     * @return List of policies to encode onto generated tokens. Depending
     * on the auth method, this list may be supplemented by user/group/other values.
     * 
     */
    public Output<Optional<List<String>>> tokenPolicies() {
        return Codegen.optional(this.tokenPolicies);
    }
    /**
     * The incremental lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     * 
     */
    @Export(name="tokenTtl", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> tokenTtl;

    /**
     * @return The incremental lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     * 
     */
    public Output<Optional<Integer>> tokenTtl() {
        return Codegen.optional(this.tokenTtl);
    }
    /**
     * The type of token that should be generated. Can be `service`,
     * `batch`, or `default` to use the mount&#39;s tuned default (which unless changed will be
     * `service` tokens). For token store roles, there are two additional possibilities:
     * `default-service` and `default-batch` which specify the type to return unless the client
     * requests a different type at generation time.
     * 
     */
    @Export(name="tokenType", type=String.class, parameters={})
    private Output</* @Nullable */ String> tokenType;

    /**
     * @return The type of token that should be generated. Can be `service`,
     * `batch`, or `default` to use the mount&#39;s tuned default (which unless changed will be
     * `service` tokens). For token store roles, there are two additional possibilities:
     * `default-service` and `default-batch` which specify the type to return unless the client
     * requests a different type at generation time.
     * 
     */
    public Output<Optional<String>> tokenType() {
        return Codegen.optional(this.tokenType);
    }
    /**
     * The claim to use to uniquely identify
     * the user; this will be used as the name for the Identity entity alias created
     * due to a successful login.
     * 
     */
    @Export(name="userClaim", type=String.class, parameters={})
    private Output<String> userClaim;

    /**
     * @return The claim to use to uniquely identify
     * the user; this will be used as the name for the Identity entity alias created
     * due to a successful login.
     * 
     */
    public Output<String> userClaim() {
        return this.userClaim;
    }
    /**
     * Specifies if the `user_claim` value uses
     * [JSON pointer](https://www.vaultproject.io/docs/auth/jwt#claim-specifications-and-json-pointer)
     * syntax for referencing claims. By default, the `user_claim` value will not use JSON pointer.
     * Requires Vault 1.11+.
     * 
     */
    @Export(name="userClaimJsonPointer", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> userClaimJsonPointer;

    /**
     * @return Specifies if the `user_claim` value uses
     * [JSON pointer](https://www.vaultproject.io/docs/auth/jwt#claim-specifications-and-json-pointer)
     * syntax for referencing claims. By default, the `user_claim` value will not use JSON pointer.
     * Requires Vault 1.11+.
     * 
     */
    public Output<Optional<Boolean>> userClaimJsonPointer() {
        return Codegen.optional(this.userClaimJsonPointer);
    }
    /**
     * Log received OIDC tokens and claims when debug-level
     * logging is active. Not recommended in production since sensitive information may be present
     * in OIDC responses.
     * 
     */
    @Export(name="verboseOidcLogging", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> verboseOidcLogging;

    /**
     * @return Log received OIDC tokens and claims when debug-level
     * logging is active. Not recommended in production since sensitive information may be present
     * in OIDC responses.
     * 
     */
    public Output<Optional<Boolean>> verboseOidcLogging() {
        return Codegen.optional(this.verboseOidcLogging);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthBackendRole(String name) {
        this(name, AuthBackendRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthBackendRole(String name, AuthBackendRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthBackendRole(String name, AuthBackendRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:jwt/authBackendRole:AuthBackendRole", name, args == null ? AuthBackendRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AuthBackendRole(String name, Output<String> id, @Nullable AuthBackendRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:jwt/authBackendRole:AuthBackendRole", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AuthBackendRole get(String name, Output<String> id, @Nullable AuthBackendRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AuthBackendRole(name, id, state, options);
    }
}
