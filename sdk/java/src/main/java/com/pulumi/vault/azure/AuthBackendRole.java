// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.azure;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.vault.Utilities;
import com.pulumi.vault.azure.AuthBackendRoleArgs;
import com.pulumi.vault.azure.inputs.AuthBackendRoleState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure auth backend role in a Vault server. Roles constrain the
 * instances or principals that can perform the login operation against the
 * backend. See the [Vault
 * documentation](https://www.vaultproject.io/docs/auth/azure.html) for more
 * information.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.vault.AuthBackend;
 * import com.pulumi.vault.AuthBackendArgs;
 * import com.pulumi.vault.azure.AuthBackendRole;
 * import com.pulumi.vault.azure.AuthBackendRoleArgs;
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
 *         var azure = new AuthBackend(&#34;azure&#34;, AuthBackendArgs.builder()        
 *             .type(&#34;azure&#34;)
 *             .build());
 * 
 *         var example = new AuthBackendRole(&#34;example&#34;, AuthBackendRoleArgs.builder()        
 *             .backend(azure.path())
 *             .role(&#34;test-role&#34;)
 *             .boundSubscriptionIds(&#34;11111111-2222-3333-4444-555555555555&#34;)
 *             .boundResourceGroups(&#34;123456789012&#34;)
 *             .tokenTtl(60)
 *             .tokenMaxTtl(120)
 *             .tokenPolicies(            
 *                 &#34;default&#34;,
 *                 &#34;dev&#34;,
 *                 &#34;prod&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Azure auth backend roles can be imported using `auth/`, the `backend` path, `/role/`, and the `role` name e.g.
 * 
 * ```sh
 *  $ pulumi import vault:azure/authBackendRole:AuthBackendRole example auth/azure/role/test-role
 * ```
 * 
 */
@ResourceType(type="vault:azure/authBackendRole:AuthBackendRole")
public class AuthBackendRole extends com.pulumi.resources.CustomResource {
    /**
     * Unique name of the auth backend to configure.
     * 
     */
    @Export(name="backend", type=String.class, parameters={})
    private Output</* @Nullable */ String> backend;

    /**
     * @return Unique name of the auth backend to configure.
     * 
     */
    public Output<Optional<String>> backend() {
        return Codegen.optional(this.backend);
    }
    /**
     * If set, defines a constraint on the groups
     * that can perform the login operation that they should be using the group
     * ID specified by this field.
     * 
     */
    @Export(name="boundGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> boundGroupIds;

    /**
     * @return If set, defines a constraint on the groups
     * that can perform the login operation that they should be using the group
     * ID specified by this field.
     * 
     */
    public Output<Optional<List<String>>> boundGroupIds() {
        return Codegen.optional(this.boundGroupIds);
    }
    /**
     * If set, defines a constraint on the virtual machines
     * that can perform the login operation that the location in their identity
     * document must match the one specified by this field.
     * 
     */
    @Export(name="boundLocations", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> boundLocations;

    /**
     * @return If set, defines a constraint on the virtual machines
     * that can perform the login operation that the location in their identity
     * document must match the one specified by this field.
     * 
     */
    public Output<Optional<List<String>>> boundLocations() {
        return Codegen.optional(this.boundLocations);
    }
    /**
     * If set, defines a constraint on the virtual
     * machines that can perform the login operation that they be associated with
     * the resource group that matches the value specified by this field.
     * 
     */
    @Export(name="boundResourceGroups", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> boundResourceGroups;

    /**
     * @return If set, defines a constraint on the virtual
     * machines that can perform the login operation that they be associated with
     * the resource group that matches the value specified by this field.
     * 
     */
    public Output<Optional<List<String>>> boundResourceGroups() {
        return Codegen.optional(this.boundResourceGroups);
    }
    /**
     * If set, defines a constraint on the virtual
     * machines that can perform the login operation that they must match the scale set
     * specified by this field.
     * 
     */
    @Export(name="boundScaleSets", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> boundScaleSets;

    /**
     * @return If set, defines a constraint on the virtual
     * machines that can perform the login operation that they must match the scale set
     * specified by this field.
     * 
     */
    public Output<Optional<List<String>>> boundScaleSets() {
        return Codegen.optional(this.boundScaleSets);
    }
    /**
     * If set, defines a constraint on the
     * service principals that can perform the login operation that they should be possess
     * the ids specified by this field.
     * 
     */
    @Export(name="boundServicePrincipalIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> boundServicePrincipalIds;

    /**
     * @return If set, defines a constraint on the
     * service principals that can perform the login operation that they should be possess
     * the ids specified by this field.
     * 
     */
    public Output<Optional<List<String>>> boundServicePrincipalIds() {
        return Codegen.optional(this.boundServicePrincipalIds);
    }
    /**
     * If set, defines a constraint on the subscriptions
     * that can perform the login operation to ones which  matches the value specified by this
     * field.
     * 
     */
    @Export(name="boundSubscriptionIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> boundSubscriptionIds;

    /**
     * @return If set, defines a constraint on the subscriptions
     * that can perform the login operation to ones which  matches the value specified by this
     * field.
     * 
     */
    public Output<Optional<List<String>>> boundSubscriptionIds() {
        return Codegen.optional(this.boundSubscriptionIds);
    }
    /**
     * The name of the role.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The name of the role.
     * 
     */
    public Output<String> role() {
        return this.role;
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
     * The [maximum number](https://www.vaultproject.io/api-docs/azure#token_num_uses)
     * of times a generated token may be used (within its lifetime); 0 means unlimited.
     * 
     */
    @Export(name="tokenNumUses", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> tokenNumUses;

    /**
     * @return The [maximum number](https://www.vaultproject.io/api-docs/azure#token_num_uses)
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
        super("vault:azure/authBackendRole:AuthBackendRole", name, args == null ? AuthBackendRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AuthBackendRole(String name, Output<String> id, @Nullable AuthBackendRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:azure/authBackendRole:AuthBackendRole", name, state, makeResourceOptions(options, id));
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
