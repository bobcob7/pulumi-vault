// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.gcp;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.vault.Utilities;
import com.pulumi.vault.gcp.AuthBackendRoleArgs;
import com.pulumi.vault.gcp.inputs.AuthBackendRoleState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to create a role in an [GCP auth backend within Vault](https://www.vaultproject.io/docs/auth/gcp.html).
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.vault.AuthBackend;
 * import com.pulumi.vault.AuthBackendArgs;
 * import com.pulumi.vault.gcp.AuthBackendRole;
 * import com.pulumi.vault.gcp.AuthBackendRoleArgs;
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
 *         var gcpAuthBackend = new AuthBackend(&#34;gcpAuthBackend&#34;, AuthBackendArgs.builder()        
 *             .path(&#34;gcp&#34;)
 *             .type(&#34;gcp&#34;)
 *             .build());
 * 
 *         var gcpAuthBackendRole = new AuthBackendRole(&#34;gcpAuthBackendRole&#34;, AuthBackendRoleArgs.builder()        
 *             .backend(gcpAuthBackend.path())
 *             .projectId(&#34;foo-bar-baz&#34;)
 *             .boundServiceAccounts(&#34;database-server@foo-bar-baz.iam.gserviceaccount.com&#34;)
 *             .tokenPolicies(&#34;database-server&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * GCP authentication roles can be imported using the `path`, e.g.
 * 
 * ```sh
 *  $ pulumi import vault:gcp/authBackendRole:AuthBackendRole my_role auth/gcp/role/my_role
 * ```
 * 
 */
@ResourceType(type="vault:gcp/authBackendRole:AuthBackendRole")
public class AuthBackendRole extends com.pulumi.resources.CustomResource {
    @Export(name="addGroupAliases", type=Boolean.class, parameters={})
    private Output<Boolean> addGroupAliases;

    public Output<Boolean> addGroupAliases() {
        return this.addGroupAliases;
    }
    /**
     * A flag to determine if this role should allow GCE instances to authenticate by inferring service accounts from the GCE identity metadata token.
     * 
     */
    @Export(name="allowGceInference", type=Boolean.class, parameters={})
    private Output<Boolean> allowGceInference;

    /**
     * @return A flag to determine if this role should allow GCE instances to authenticate by inferring service accounts from the GCE identity metadata token.
     * 
     */
    public Output<Boolean> allowGceInference() {
        return this.allowGceInference;
    }
    /**
     * Path to the mounted GCP auth backend
     * 
     */
    @Export(name="backend", type=String.class, parameters={})
    private Output</* @Nullable */ String> backend;

    /**
     * @return Path to the mounted GCP auth backend
     * 
     */
    public Output<Optional<String>> backend() {
        return Codegen.optional(this.backend);
    }
    /**
     * The instance groups that an authorized instance must belong to in order to be authenticated. If specified, either `bound_zones` or `bound_regions` must be set too.
     * 
     */
    @Export(name="boundInstanceGroups", type=List.class, parameters={String.class})
    private Output<List<String>> boundInstanceGroups;

    /**
     * @return The instance groups that an authorized instance must belong to in order to be authenticated. If specified, either `bound_zones` or `bound_regions` must be set too.
     * 
     */
    public Output<List<String>> boundInstanceGroups() {
        return this.boundInstanceGroups;
    }
    /**
     * A comma-separated list of GCP labels formatted as `&#34;key:value&#34;` strings that must be set on authorized GCE instances. Because GCP labels are not currently ACL&#39;d, we recommend that this be used in conjunction with other restrictions.
     * 
     */
    @Export(name="boundLabels", type=List.class, parameters={String.class})
    private Output<List<String>> boundLabels;

    /**
     * @return A comma-separated list of GCP labels formatted as `&#34;key:value&#34;` strings that must be set on authorized GCE instances. Because GCP labels are not currently ACL&#39;d, we recommend that this be used in conjunction with other restrictions.
     * 
     */
    public Output<List<String>> boundLabels() {
        return this.boundLabels;
    }
    /**
     * GCP Projects that the role exists within
     * 
     */
    @Export(name="boundProjects", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> boundProjects;

    /**
     * @return GCP Projects that the role exists within
     * 
     */
    public Output<Optional<List<String>>> boundProjects() {
        return Codegen.optional(this.boundProjects);
    }
    /**
     * The list of regions that a GCE instance must belong to in order to be authenticated. If bound_instance_groups is provided, it is assumed to be a regional group and the group must belong to this region. If bound_zones are provided, this attribute is ignored.
     * 
     */
    @Export(name="boundRegions", type=List.class, parameters={String.class})
    private Output<List<String>> boundRegions;

    /**
     * @return The list of regions that a GCE instance must belong to in order to be authenticated. If bound_instance_groups is provided, it is assumed to be a regional group and the group must belong to this region. If bound_zones are provided, this attribute is ignored.
     * 
     */
    public Output<List<String>> boundRegions() {
        return this.boundRegions;
    }
    /**
     * GCP Service Accounts allowed to issue tokens under this role. (Note: **Required** if role is `iam`)
     * 
     */
    @Export(name="boundServiceAccounts", type=List.class, parameters={String.class})
    private Output<List<String>> boundServiceAccounts;

    /**
     * @return GCP Service Accounts allowed to issue tokens under this role. (Note: **Required** if role is `iam`)
     * 
     */
    public Output<List<String>> boundServiceAccounts() {
        return this.boundServiceAccounts;
    }
    /**
     * The list of zones that a GCE instance must belong to in order to be authenticated. If bound_instance_groups is provided, it is assumed to be a zonal group and the group must belong to this zone.
     * 
     */
    @Export(name="boundZones", type=List.class, parameters={String.class})
    private Output<List<String>> boundZones;

    /**
     * @return The list of zones that a GCE instance must belong to in order to be authenticated. If bound_instance_groups is provided, it is assumed to be a zonal group and the group must belong to this zone.
     * 
     */
    public Output<List<String>> boundZones() {
        return this.boundZones;
    }
    /**
     * The number of seconds past the time of authentication that the login param JWT must expire within. For example, if a user attempts to login with a token that expires within an hour and this is set to 15 minutes, Vault will return an error prompting the user to create a new signed JWT with a shorter `exp`. The GCE metadata tokens currently do not allow the `exp` claim to be customized.
     * 
     */
    @Export(name="maxJwtExp", type=String.class, parameters={})
    private Output<String> maxJwtExp;

    /**
     * @return The number of seconds past the time of authentication that the login param JWT must expire within. For example, if a user attempts to login with a token that expires within an hour and this is set to 15 minutes, Vault will return an error prompting the user to create a new signed JWT with a shorter `exp`. The GCE metadata tokens currently do not allow the `exp` claim to be customized.
     * 
     */
    public Output<String> maxJwtExp() {
        return this.maxJwtExp;
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
     * Name of the GCP role
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return Name of the GCP role
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
     * The [maximum number](https://www.vaultproject.io/api-docs/gcp#token_num_uses)
     * of times a generated token may be used (within its lifetime); 0 means unlimited.
     * 
     */
    @Export(name="tokenNumUses", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> tokenNumUses;

    /**
     * @return The [maximum number](https://www.vaultproject.io/api-docs/gcp#token_num_uses)
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
     * Type of GCP authentication role (either `gce` or `iam`)
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of GCP authentication role (either `gce` or `iam`)
     * 
     */
    public Output<String> type() {
        return this.type;
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
        super("vault:gcp/authBackendRole:AuthBackendRole", name, args == null ? AuthBackendRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AuthBackendRole(String name, Output<String> id, @Nullable AuthBackendRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:gcp/authBackendRole:AuthBackendRole", name, state, makeResourceOptions(options, id));
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
