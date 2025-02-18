// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.terraformcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.vault.Utilities;
import com.pulumi.vault.terraformcloud.SecretRoleArgs;
import com.pulumi.vault.terraformcloud.inputs.SecretRoleState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.vault.terraformcloud.SecretBackend;
 * import com.pulumi.vault.terraformcloud.SecretBackendArgs;
 * import com.pulumi.vault.terraformcloud.SecretRole;
 * import com.pulumi.vault.terraformcloud.SecretRoleArgs;
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
 *         var test = new SecretBackend(&#34;test&#34;, SecretBackendArgs.builder()        
 *             .backend(&#34;terraform&#34;)
 *             .description(&#34;Manages the Terraform Cloud backend&#34;)
 *             .token(&#34;V0idfhi2iksSDU234ucdbi2nidsi...&#34;)
 *             .build());
 * 
 *         var example = new SecretRole(&#34;example&#34;, SecretRoleArgs.builder()        
 *             .backend(test.backend())
 *             .organization(&#34;example-organization-name&#34;)
 *             .teamId(&#34;team-ieF4isC...&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Terraform Cloud secret backend roles can be imported using the `backend`, `/roles/`, and the `name` e.g.
 * 
 * ```sh
 *  $ pulumi import vault:terraformcloud/secretRole:SecretRole example terraform/roles/my-role
 * ```
 * 
 */
@ResourceType(type="vault:terraformcloud/secretRole:SecretRole")
public class SecretRole extends com.pulumi.resources.CustomResource {
    /**
     * The path of the Terraform Cloud Secret Backend the role belongs to.
     * 
     */
    @Export(name="backend", type=String.class, parameters={})
    private Output</* @Nullable */ String> backend;

    /**
     * @return The path of the Terraform Cloud Secret Backend the role belongs to.
     * 
     */
    public Output<Optional<String>> backend() {
        return Codegen.optional(this.backend);
    }
    /**
     * Maximum TTL for leases associated with this role, in seconds.
     * 
     */
    @Export(name="maxTtl", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxTtl;

    /**
     * @return Maximum TTL for leases associated with this role, in seconds.
     * 
     */
    public Output<Optional<Integer>> maxTtl() {
        return Codegen.optional(this.maxTtl);
    }
    /**
     * The name of an existing role against which to create this Terraform Cloud credential
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of an existing role against which to create this Terraform Cloud credential
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * Name of the Terraform Cloud or Enterprise organization
     * 
     */
    @Export(name="organization", type=String.class, parameters={})
    private Output</* @Nullable */ String> organization;

    /**
     * @return Name of the Terraform Cloud or Enterprise organization
     * 
     */
    public Output<Optional<String>> organization() {
        return Codegen.optional(this.organization);
    }
    /**
     * ID of the Terraform Cloud or Enterprise team under organization (e.g., settings/teams/team-xxxxxxxxxxxxx)
     * 
     */
    @Export(name="teamId", type=String.class, parameters={})
    private Output</* @Nullable */ String> teamId;

    /**
     * @return ID of the Terraform Cloud or Enterprise team under organization (e.g., settings/teams/team-xxxxxxxxxxxxx)
     * 
     */
    public Output<Optional<String>> teamId() {
        return Codegen.optional(this.teamId);
    }
    /**
     * Specifies the TTL for this role.
     * 
     */
    @Export(name="ttl", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> ttl;

    /**
     * @return Specifies the TTL for this role.
     * 
     */
    public Output<Optional<Integer>> ttl() {
        return Codegen.optional(this.ttl);
    }
    /**
     * ID of the Terraform Cloud or Enterprise user (e.g., user-xxxxxxxxxxxxxxxx)
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output</* @Nullable */ String> userId;

    /**
     * @return ID of the Terraform Cloud or Enterprise user (e.g., user-xxxxxxxxxxxxxxxx)
     * 
     */
    public Output<Optional<String>> userId() {
        return Codegen.optional(this.userId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecretRole(String name) {
        this(name, SecretRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecretRole(String name, @Nullable SecretRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecretRole(String name, @Nullable SecretRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:terraformcloud/secretRole:SecretRole", name, args == null ? SecretRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecretRole(String name, Output<String> id, @Nullable SecretRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:terraformcloud/secretRole:SecretRole", name, state, makeResourceOptions(options, id));
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
    public static SecretRole get(String name, Output<String> id, @Nullable SecretRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecretRole(name, id, state, options);
    }
}
