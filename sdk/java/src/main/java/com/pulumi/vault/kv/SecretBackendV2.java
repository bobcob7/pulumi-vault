// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.kv;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.vault.Utilities;
import com.pulumi.vault.kv.SecretBackendV2Args;
import com.pulumi.vault.kv.inputs.SecretBackendV2State;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Configures KV-V2 backend level settings that are applied to
 * every key in the key-value store.
 * 
 * For more information on Vault&#39;s KV-V2 secret backend
 * [see here](https://www.vaultproject.io/docs/secrets/kv/kv-v2).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.vault.Mount;
 * import com.pulumi.vault.MountArgs;
 * import com.pulumi.vault.kv.SecretBackendV2;
 * import com.pulumi.vault.kv.SecretBackendV2Args;
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
 *         var kvv2 = new Mount(&#34;kvv2&#34;, MountArgs.builder()        
 *             .path(&#34;kvv2&#34;)
 *             .type(&#34;kv&#34;)
 *             .options(Map.of(&#34;version&#34;, &#34;2&#34;))
 *             .description(&#34;KV Version 2 secret engine mount&#34;)
 *             .build());
 * 
 *         var config = new SecretBackendV2(&#34;config&#34;, SecretBackendV2Args.builder()        
 *             .mount(kvv2.path())
 *             .maxVersions(5)
 *             .deleteVersionAfter(12600)
 *             .casRequired(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Required Vault Capabilities
 * 
 * Use of this resource requires the `create` or `update` capability
 * (depending on whether the resource already exists) on the given path,
 * the `delete` capability if the resource is removed from configuration,
 * and the `read` capability for drift detection (by default).
 * 
 * ## Import
 * 
 * The KV-V2 secret backend can be imported using the `path`, e.g.
 * 
 * ```sh
 *  $ pulumi import vault:kv/secretBackendV2:SecretBackendV2 config kvv2/config
 * ```
 * 
 */
@ResourceType(type="vault:kv/secretBackendV2:SecretBackendV2")
public class SecretBackendV2 extends com.pulumi.resources.CustomResource {
    /**
     * If true, all keys will require the cas
     * parameter to be set on all write requests.
     * 
     */
    @Export(name="casRequired", type=Boolean.class, parameters={})
    private Output<Boolean> casRequired;

    /**
     * @return If true, all keys will require the cas
     * parameter to be set on all write requests.
     * 
     */
    public Output<Boolean> casRequired() {
        return this.casRequired;
    }
    /**
     * If set, specifies the length of time before
     * a version is deleted. Accepts duration in integer seconds.
     * 
     */
    @Export(name="deleteVersionAfter", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> deleteVersionAfter;

    /**
     * @return If set, specifies the length of time before
     * a version is deleted. Accepts duration in integer seconds.
     * 
     */
    public Output<Optional<Integer>> deleteVersionAfter() {
        return Codegen.optional(this.deleteVersionAfter);
    }
    /**
     * The number of versions to keep per key.
     * 
     */
    @Export(name="maxVersions", type=Integer.class, parameters={})
    private Output<Integer> maxVersions;

    /**
     * @return The number of versions to keep per key.
     * 
     */
    public Output<Integer> maxVersions() {
        return this.maxVersions;
    }
    /**
     * Path where KV-V2 engine is mounted.
     * 
     */
    @Export(name="mount", type=String.class, parameters={})
    private Output<String> mount;

    /**
     * @return Path where KV-V2 engine is mounted.
     * 
     */
    public Output<String> mount() {
        return this.mount;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecretBackendV2(String name) {
        this(name, SecretBackendV2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecretBackendV2(String name, SecretBackendV2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecretBackendV2(String name, SecretBackendV2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:kv/secretBackendV2:SecretBackendV2", name, args == null ? SecretBackendV2Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecretBackendV2(String name, Output<String> id, @Nullable SecretBackendV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:kv/secretBackendV2:SecretBackendV2", name, state, makeResourceOptions(options, id));
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
    public static SecretBackendV2 get(String name, Output<String> id, @Nullable SecretBackendV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecretBackendV2(name, id, state, options);
    }
}
