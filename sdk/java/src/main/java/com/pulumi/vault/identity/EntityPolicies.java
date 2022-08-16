// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.identity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.vault.Utilities;
import com.pulumi.vault.identity.EntityPoliciesArgs;
import com.pulumi.vault.identity.inputs.EntityPoliciesState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages policies for an Identity Entity for Vault. The [Identity secrets engine](https://www.vaultproject.io/docs/secrets/identity/index.html) is the identity management solution for Vault.
 * 
 * ## Example Usage
 * ### Exclusive Policies
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.vault.identity.Entity;
 * import com.pulumi.vault.identity.EntityArgs;
 * import com.pulumi.vault.identity.EntityPolicies;
 * import com.pulumi.vault.identity.EntityPoliciesArgs;
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
 *         var entity = new Entity(&#34;entity&#34;, EntityArgs.builder()        
 *             .externalPolicies(true)
 *             .build());
 * 
 *         var policies = new EntityPolicies(&#34;policies&#34;, EntityPoliciesArgs.builder()        
 *             .policies(            
 *                 &#34;default&#34;,
 *                 &#34;test&#34;)
 *             .exclusive(true)
 *             .entityId(entity.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Non-exclusive Policies
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.vault.identity.Entity;
 * import com.pulumi.vault.identity.EntityArgs;
 * import com.pulumi.vault.identity.EntityPolicies;
 * import com.pulumi.vault.identity.EntityPoliciesArgs;
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
 *         var entity = new Entity(&#34;entity&#34;, EntityArgs.builder()        
 *             .externalPolicies(true)
 *             .build());
 * 
 *         var default_ = new EntityPolicies(&#34;default&#34;, EntityPoliciesArgs.builder()        
 *             .policies(            
 *                 &#34;default&#34;,
 *                 &#34;test&#34;)
 *             .exclusive(false)
 *             .entityId(entity.id())
 *             .build());
 * 
 *         var others = new EntityPolicies(&#34;others&#34;, EntityPoliciesArgs.builder()        
 *             .policies(&#34;others&#34;)
 *             .exclusive(false)
 *             .entityId(entity.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="vault:identity/entityPolicies:EntityPolicies")
public class EntityPolicies extends com.pulumi.resources.CustomResource {
    /**
     * Entity ID to assign policies to.
     * 
     */
    @Export(name="entityId", type=String.class, parameters={})
    private Output<String> entityId;

    /**
     * @return Entity ID to assign policies to.
     * 
     */
    public Output<String> entityId() {
        return this.entityId;
    }
    /**
     * The name of the entity that are assigned the policies.
     * 
     */
    @Export(name="entityName", type=String.class, parameters={})
    private Output<String> entityName;

    /**
     * @return The name of the entity that are assigned the policies.
     * 
     */
    public Output<String> entityName() {
        return this.entityName;
    }
    /**
     * Defaults to `true`.
     * 
     */
    @Export(name="exclusive", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> exclusive;

    /**
     * @return Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> exclusive() {
        return Codegen.optional(this.exclusive);
    }
    /**
     * List of policies to assign to the entity
     * 
     */
    @Export(name="policies", type=List.class, parameters={String.class})
    private Output<List<String>> policies;

    /**
     * @return List of policies to assign to the entity
     * 
     */
    public Output<List<String>> policies() {
        return this.policies;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EntityPolicies(String name) {
        this(name, EntityPoliciesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EntityPolicies(String name, EntityPoliciesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EntityPolicies(String name, EntityPoliciesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:identity/entityPolicies:EntityPolicies", name, args == null ? EntityPoliciesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EntityPolicies(String name, Output<String> id, @Nullable EntityPoliciesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:identity/entityPolicies:EntityPolicies", name, state, makeResourceOptions(options, id));
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
    public static EntityPolicies get(String name, Output<String> id, @Nullable EntityPoliciesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EntityPolicies(name, id, state, options);
    }
}
