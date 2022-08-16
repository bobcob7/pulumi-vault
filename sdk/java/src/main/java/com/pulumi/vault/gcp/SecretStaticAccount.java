// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.gcp;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.vault.Utilities;
import com.pulumi.vault.gcp.SecretStaticAccountArgs;
import com.pulumi.vault.gcp.inputs.SecretStaticAccountState;
import com.pulumi.vault.gcp.outputs.SecretStaticAccountBinding;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a Static Account in the [GCP Secrets Engine](https://www.vaultproject.io/docs/secrets/gcp/index.html) for Vault.
 * 
 * Each [static account](https://www.vaultproject.io/docs/secrets/gcp/index.html#static-accounts) is tied to a separately managed
 * Service Account, and can have one or more [bindings](https://www.vaultproject.io/docs/secrets/gcp/index.html#bindings) associated with it.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.serviceAccount.Account;
 * import com.pulumi.gcp.serviceAccount.AccountArgs;
 * import com.pulumi.vault.gcp.SecretBackend;
 * import com.pulumi.vault.gcp.SecretBackendArgs;
 * import com.pulumi.vault.gcp.SecretStaticAccount;
 * import com.pulumi.vault.gcp.SecretStaticAccountArgs;
 * import com.pulumi.vault.gcp.inputs.SecretStaticAccountBindingArgs;
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
 *         var this_ = new Account(&#34;this&#34;, AccountArgs.builder()        
 *             .accountId(&#34;my-awesome-account&#34;)
 *             .build());
 * 
 *         var gcp = new SecretBackend(&#34;gcp&#34;, SecretBackendArgs.builder()        
 *             .path(&#34;gcp&#34;)
 *             .credentials(Files.readString(Paths.get(&#34;credentials.json&#34;)))
 *             .build());
 * 
 *         var staticAccount = new SecretStaticAccount(&#34;staticAccount&#34;, SecretStaticAccountArgs.builder()        
 *             .backend(gcp.path())
 *             .staticAccount(&#34;project_viewer&#34;)
 *             .secretType(&#34;access_token&#34;)
 *             .tokenScopes(&#34;https://www.googleapis.com/auth/cloud-platform&#34;)
 *             .serviceAccountEmail(this_.email())
 *             .bindings(SecretStaticAccountBindingArgs.builder()
 *                 .resource(this_.project().applyValue(project -&gt; String.format(&#34;//cloudresourcemanager.googleapis.com/projects/%s&#34;, project)))
 *                 .roles(&#34;roles/viewer&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * A static account can be imported using its Vault Path. For example, referencing the example above,
 * 
 * ```sh
 *  $ pulumi import vault:gcp/secretStaticAccount:SecretStaticAccount static_account gcp/static-account/project_viewer
 * ```
 * 
 */
@ResourceType(type="vault:gcp/secretStaticAccount:SecretStaticAccount")
public class SecretStaticAccount extends com.pulumi.resources.CustomResource {
    /**
     * Path where the GCP Secrets Engine is mounted
     * 
     */
    @Export(name="backend", type=String.class, parameters={})
    private Output<String> backend;

    /**
     * @return Path where the GCP Secrets Engine is mounted
     * 
     */
    public Output<String> backend() {
        return this.backend;
    }
    /**
     * Bindings to create for this static account. This can be specified multiple times for multiple bindings. Structure is documented below.
     * 
     */
    @Export(name="bindings", type=List.class, parameters={SecretStaticAccountBinding.class})
    private Output</* @Nullable */ List<SecretStaticAccountBinding>> bindings;

    /**
     * @return Bindings to create for this static account. This can be specified multiple times for multiple bindings. Structure is documented below.
     * 
     */
    public Output<Optional<List<SecretStaticAccountBinding>>> bindings() {
        return Codegen.optional(this.bindings);
    }
    /**
     * Type of secret generated for this static account. Accepted values: `access_token`, `service_account_key`. Defaults to `access_token`.
     * 
     */
    @Export(name="secretType", type=String.class, parameters={})
    private Output<String> secretType;

    /**
     * @return Type of secret generated for this static account. Accepted values: `access_token`, `service_account_key`. Defaults to `access_token`.
     * 
     */
    public Output<String> secretType() {
        return this.secretType;
    }
    /**
     * Email of the GCP service account to manage.
     * 
     */
    @Export(name="serviceAccountEmail", type=String.class, parameters={})
    private Output<String> serviceAccountEmail;

    /**
     * @return Email of the GCP service account to manage.
     * 
     */
    public Output<String> serviceAccountEmail() {
        return this.serviceAccountEmail;
    }
    /**
     * Project the service account belongs to.
     * 
     */
    @Export(name="serviceAccountProject", type=String.class, parameters={})
    private Output<String> serviceAccountProject;

    /**
     * @return Project the service account belongs to.
     * 
     */
    public Output<String> serviceAccountProject() {
        return this.serviceAccountProject;
    }
    /**
     * Name of the Static Account to create
     * 
     */
    @Export(name="staticAccount", type=String.class, parameters={})
    private Output<String> staticAccount;

    /**
     * @return Name of the Static Account to create
     * 
     */
    public Output<String> staticAccount() {
        return this.staticAccount;
    }
    /**
     * List of OAuth scopes to assign to `access_token` secrets generated under this static account (`access_token` static accounts only).
     * 
     */
    @Export(name="tokenScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tokenScopes;

    /**
     * @return List of OAuth scopes to assign to `access_token` secrets generated under this static account (`access_token` static accounts only).
     * 
     */
    public Output<Optional<List<String>>> tokenScopes() {
        return Codegen.optional(this.tokenScopes);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecretStaticAccount(String name) {
        this(name, SecretStaticAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecretStaticAccount(String name, SecretStaticAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecretStaticAccount(String name, SecretStaticAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:gcp/secretStaticAccount:SecretStaticAccount", name, args == null ? SecretStaticAccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecretStaticAccount(String name, Output<String> id, @Nullable SecretStaticAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:gcp/secretStaticAccount:SecretStaticAccount", name, state, makeResourceOptions(options, id));
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
    public static SecretStaticAccount get(String name, Output<String> id, @Nullable SecretStaticAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecretStaticAccount(name, id, state, options);
    }
}
