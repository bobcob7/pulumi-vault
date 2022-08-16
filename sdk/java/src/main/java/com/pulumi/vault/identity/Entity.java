// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.identity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.vault.Utilities;
import com.pulumi.vault.identity.EntityArgs;
import com.pulumi.vault.identity.inputs.EntityState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
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
 * import com.pulumi.vault.identity.Entity;
 * import com.pulumi.vault.identity.EntityArgs;
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
 *         var test = new Entity(&#34;test&#34;, EntityArgs.builder()        
 *             .metadata(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .policies(&#34;test&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Identity entity can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import vault:identity/entity:Entity test &#34;ae6f8ued-0f1a-9f6b-2915-1a2be20dc053&#34;
 * ```
 * 
 */
@ResourceType(type="vault:identity/entity:Entity")
public class Entity extends com.pulumi.resources.CustomResource {
    /**
     * True/false Is this entity currently disabled. Defaults to `false`
     * 
     */
    @Export(name="disabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return True/false Is this entity currently disabled. Defaults to `false`
     * 
     */
    public Output<Optional<Boolean>> disabled() {
        return Codegen.optional(this.disabled);
    }
    /**
     * `false` by default. If set to `true`, this resource will ignore any policies return from Vault or specified in the resource. You can use `vault.identity.EntityPolicies` to manage policies for this entity in a decoupled manner.
     * 
     */
    @Export(name="externalPolicies", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> externalPolicies;

    /**
     * @return `false` by default. If set to `true`, this resource will ignore any policies return from Vault or specified in the resource. You can use `vault.identity.EntityPolicies` to manage policies for this entity in a decoupled manner.
     * 
     */
    public Output<Optional<Boolean>> externalPolicies() {
        return Codegen.optional(this.externalPolicies);
    }
    /**
     * A Map of additional metadata to associate with the user.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return A Map of additional metadata to associate with the user.
     * 
     */
    public Output<Optional<Map<String,String>>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * Name of the identity entity to create.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the identity entity to create.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of policies to apply to the entity.
     * 
     */
    @Export(name="policies", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> policies;

    /**
     * @return A list of policies to apply to the entity.
     * 
     */
    public Output<Optional<List<String>>> policies() {
        return Codegen.optional(this.policies);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Entity(String name) {
        this(name, EntityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Entity(String name, @Nullable EntityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Entity(String name, @Nullable EntityArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:identity/entity:Entity", name, args == null ? EntityArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Entity(String name, Output<String> id, @Nullable EntityState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:identity/entity:Entity", name, state, makeResourceOptions(options, id));
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
    public static Entity get(String name, Output<String> id, @Nullable EntityState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Entity(name, id, state, options);
    }
}
