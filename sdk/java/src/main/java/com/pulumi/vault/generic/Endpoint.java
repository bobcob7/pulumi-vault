// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.generic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.vault.Utilities;
import com.pulumi.vault.generic.EndpointArgs;
import com.pulumi.vault.generic.inputs.EndpointState;
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
 * import com.pulumi.vault.AuthBackend;
 * import com.pulumi.vault.AuthBackendArgs;
 * import com.pulumi.vault.generic.Endpoint;
 * import com.pulumi.vault.generic.EndpointArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var userpass = new AuthBackend(&#34;userpass&#34;, AuthBackendArgs.builder()        
 *             .type(&#34;userpass&#34;)
 *             .build());
 * 
 *         var u1 = new Endpoint(&#34;u1&#34;, EndpointArgs.builder()        
 *             .path(&#34;auth/userpass/users/u1&#34;)
 *             .ignoreAbsentFields(true)
 *             .dataJson(&#34;&#34;&#34;
 * {
 *   &#34;policies&#34;: [&#34;p1&#34;],
 *   &#34;password&#34;: &#34;changeme&#34;
 * }
 *             &#34;&#34;&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(userpass)
 *                 .build());
 * 
 *         var u1Token = new Endpoint(&#34;u1Token&#34;, EndpointArgs.builder()        
 *             .path(&#34;auth/userpass/login/u1&#34;)
 *             .disableRead(true)
 *             .disableDelete(true)
 *             .dataJson(&#34;&#34;&#34;
 * {
 *   &#34;password&#34;: &#34;changeme&#34;
 * }
 *             &#34;&#34;&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(u1)
 *                 .build());
 * 
 *         var u1Entity = new Endpoint(&#34;u1Entity&#34;, EndpointArgs.builder()        
 *             .disableRead(true)
 *             .disableDelete(true)
 *             .path(&#34;identity/lookup/entity&#34;)
 *             .ignoreAbsentFields(true)
 *             .writeFields(&#34;id&#34;)
 *             .dataJson(&#34;&#34;&#34;
 * {
 *   &#34;alias_name&#34;: &#34;u1&#34;,
 *   &#34;alias_mount_accessor&#34;: vault_auth_backend.userpass.accessor
 * }
 *             &#34;&#34;&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(u1Token)
 *                 .build());
 * 
 *         ctx.export(&#34;u1Id&#34;, u1Entity.writeData().applyValue(writeData -&gt; writeData.id()));
 *     }
 * }
 * ```
 * ## Required Vault Capabilities
 * 
 * Use of this resource requires the `create` or `update` capability
 * (depending on whether the resource already exists) on the given path. If
 * `disable_delete` is false, the `delete` capbility is also required. If
 * `disable_delete` is false, the `read` capbility is required.
 * 
 * ## Import
 * 
 * Import is not supported for this resource.
 * 
 */
@ResourceType(type="vault:generic/endpoint:Endpoint")
public class Endpoint extends com.pulumi.resources.CustomResource {
    /**
     * String containing a JSON-encoded object that will be
     * written to the given path as the secret data.
     * 
     */
    @Export(name="dataJson", type=String.class, parameters={})
    private Output<String> dataJson;

    /**
     * @return String containing a JSON-encoded object that will be
     * written to the given path as the secret data.
     * 
     */
    public Output<String> dataJson() {
        return this.dataJson;
    }
    /**
     * Don&#39;t attempt to delete the path from Vault if true
     * 
     */
    @Export(name="disableDelete", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableDelete;

    /**
     * @return Don&#39;t attempt to delete the path from Vault if true
     * 
     */
    public Output<Optional<Boolean>> disableDelete() {
        return Codegen.optional(this.disableDelete);
    }
    /**
     * True/false. Set this to true if your vault
     * authentication is not able to read the data or if the endpoint does
     * not support the `GET` method. Setting this to `true` will break drift
     * detection. You should set this to `true` for endpoints that are
     * write-only. Defaults to false.
     * 
     */
    @Export(name="disableRead", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableRead;

    /**
     * @return True/false. Set this to true if your vault
     * authentication is not able to read the data or if the endpoint does
     * not support the `GET` method. Setting this to `true` will break drift
     * detection. You should set this to `true` for endpoints that are
     * write-only. Defaults to false.
     * 
     */
    public Output<Optional<Boolean>> disableRead() {
        return Codegen.optional(this.disableRead);
    }
    /**
     * When reading, disregard fields not present in data_json
     * 
     */
    @Export(name="ignoreAbsentFields", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignoreAbsentFields;

    /**
     * @return When reading, disregard fields not present in data_json
     * 
     */
    public Output<Optional<Boolean>> ignoreAbsentFields() {
        return Codegen.optional(this.ignoreAbsentFields);
    }
    /**
     * The full logical path at which to write the given
     * data. Consult each backend&#39;s documentation to see which endpoints
     * support the `PUT` methods and to determine whether they also support
     * `DELETE` and `GET`.
     * 
     */
    @Export(name="path", type=String.class, parameters={})
    private Output<String> path;

    /**
     * @return The full logical path at which to write the given
     * data. Consult each backend&#39;s documentation to see which endpoints
     * support the `PUT` methods and to determine whether they also support
     * `DELETE` and `GET`.
     * 
     */
    public Output<String> path() {
        return this.path;
    }
    /**
     * Map of strings returned by write operation
     * 
     */
    @Export(name="writeData", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> writeData;

    /**
     * @return Map of strings returned by write operation
     * 
     */
    public Output<Map<String,String>> writeData() {
        return this.writeData;
    }
    /**
     * JSON data returned by write operation
     * 
     */
    @Export(name="writeDataJson", type=String.class, parameters={})
    private Output<String> writeDataJson;

    /**
     * @return JSON data returned by write operation
     * 
     */
    public Output<String> writeDataJson() {
        return this.writeDataJson;
    }
    /**
     * Top-level fields returned by write to persist in state
     * 
     */
    @Export(name="writeFields", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> writeFields;

    /**
     * @return Top-level fields returned by write to persist in state
     * 
     */
    public Output<Optional<List<String>>> writeFields() {
        return Codegen.optional(this.writeFields);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Endpoint(String name) {
        this(name, EndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Endpoint(String name, EndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Endpoint(String name, EndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:generic/endpoint:Endpoint", name, args == null ? EndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Endpoint(String name, Output<String> id, @Nullable EndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:generic/endpoint:Endpoint", name, state, makeResourceOptions(options, id));
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
    public static Endpoint get(String name, Output<String> id, @Nullable EndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Endpoint(name, id, state, options);
    }
}
