// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.vault.NomadSecretBackendArgs;
import com.pulumi.vault.Utilities;
import com.pulumi.vault.inputs.NomadSecretBackendState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
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
 * import com.pulumi.vault.NomadSecretBackend;
 * import com.pulumi.vault.NomadSecretBackendArgs;
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
 *         var config = new NomadSecretBackend(&#34;config&#34;, NomadSecretBackendArgs.builder()        
 *             .address(&#34;https://127.0.0.1:4646&#34;)
 *             .backend(&#34;nomad&#34;)
 *             .defaultLeaseTtlSeconds(&#34;3600&#34;)
 *             .description(&#34;test description&#34;)
 *             .maxLeaseTtlSeconds(&#34;7200&#34;)
 *             .maxTtl(&#34;240&#34;)
 *             .token(&#34;ae20ceaa-...&#34;)
 *             .ttl(&#34;120&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Nomad secret backend can be imported using the `backend`, e.g.
 * 
 * ```sh
 *  $ pulumi import vault:index/nomadSecretBackend:NomadSecretBackend nomad nomad
 * ```
 * 
 */
@ResourceType(type="vault:index/nomadSecretBackend:NomadSecretBackend")
public class NomadSecretBackend extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the address of the Nomad instance, provided
     * as &#34;protocol://host:port&#34; like &#34;http://127.0.0.1:4646&#34;.
     * 
     */
    @Export(name="address", type=String.class, parameters={})
    private Output</* @Nullable */ String> address;

    /**
     * @return Specifies the address of the Nomad instance, provided
     * as &#34;protocol://host:port&#34; like &#34;http://127.0.0.1:4646&#34;.
     * 
     */
    public Output<Optional<String>> address() {
        return Codegen.optional(this.address);
    }
    /**
     * The unique path this backend should be mounted at. Must
     * not begin or end with a `/`. Defaults to `nomad`.
     * 
     */
    @Export(name="backend", type=String.class, parameters={})
    private Output</* @Nullable */ String> backend;

    /**
     * @return The unique path this backend should be mounted at. Must
     * not begin or end with a `/`. Defaults to `nomad`.
     * 
     */
    public Output<Optional<String>> backend() {
        return Codegen.optional(this.backend);
    }
    /**
     * CA certificate to use when verifying the Nomad server certificate, must be
     * x509 PEM encoded.
     * 
     */
    @Export(name="caCert", type=String.class, parameters={})
    private Output</* @Nullable */ String> caCert;

    /**
     * @return CA certificate to use when verifying the Nomad server certificate, must be
     * x509 PEM encoded.
     * 
     */
    public Output<Optional<String>> caCert() {
        return Codegen.optional(this.caCert);
    }
    /**
     * Client certificate to provide to the Nomad server, must be x509 PEM encoded.
     * 
     */
    @Export(name="clientCert", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientCert;

    /**
     * @return Client certificate to provide to the Nomad server, must be x509 PEM encoded.
     * 
     */
    public Output<Optional<String>> clientCert() {
        return Codegen.optional(this.clientCert);
    }
    /**
     * Client certificate key to provide to the Nomad server, must be x509 PEM encoded.
     * 
     */
    @Export(name="clientKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientKey;

    /**
     * @return Client certificate key to provide to the Nomad server, must be x509 PEM encoded.
     * 
     */
    public Output<Optional<String>> clientKey() {
        return Codegen.optional(this.clientKey);
    }
    /**
     * Default lease duration for secrets in seconds.
     * 
     */
    @Export(name="defaultLeaseTtlSeconds", type=Integer.class, parameters={})
    private Output<Integer> defaultLeaseTtlSeconds;

    /**
     * @return Default lease duration for secrets in seconds.
     * 
     */
    public Output<Integer> defaultLeaseTtlSeconds() {
        return this.defaultLeaseTtlSeconds;
    }
    /**
     * Human-friendly description of the mount for the Active Directory backend.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Human-friendly description of the mount for the Active Directory backend.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * If set, opts out of mount migration on path updates.
     * See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
     * 
     */
    @Export(name="disableRemount", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableRemount;

    /**
     * @return If set, opts out of mount migration on path updates.
     * See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
     * 
     */
    public Output<Optional<Boolean>> disableRemount() {
        return Codegen.optional(this.disableRemount);
    }
    /**
     * Mark the secrets engine as local-only. Local engines are not replicated or removed by
     * replication.Tolerance duration to use when checking the last rotation time.
     * 
     */
    @Export(name="local", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> local;

    /**
     * @return Mark the secrets engine as local-only. Local engines are not replicated or removed by
     * replication.Tolerance duration to use when checking the last rotation time.
     * 
     */
    public Output<Optional<Boolean>> local() {
        return Codegen.optional(this.local);
    }
    /**
     * Maximum possible lease duration for secrets in seconds.
     * 
     */
    @Export(name="maxLeaseTtlSeconds", type=Integer.class, parameters={})
    private Output<Integer> maxLeaseTtlSeconds;

    /**
     * @return Maximum possible lease duration for secrets in seconds.
     * 
     */
    public Output<Integer> maxLeaseTtlSeconds() {
        return this.maxLeaseTtlSeconds;
    }
    /**
     * Specifies the maximum length to use for the name of the Nomad token
     * generated with Generate Credential. If omitted, 0 is used and ignored, defaulting to the max value allowed
     * by the Nomad version.
     * 
     */
    @Export(name="maxTokenNameLength", type=Integer.class, parameters={})
    private Output<Integer> maxTokenNameLength;

    /**
     * @return Specifies the maximum length to use for the name of the Nomad token
     * generated with Generate Credential. If omitted, 0 is used and ignored, defaulting to the max value allowed
     * by the Nomad version.
     * 
     */
    public Output<Integer> maxTokenNameLength() {
        return this.maxTokenNameLength;
    }
    /**
     * Maximum possible lease duration for secrets in seconds.
     * 
     */
    @Export(name="maxTtl", type=Integer.class, parameters={})
    private Output<Integer> maxTtl;

    /**
     * @return Maximum possible lease duration for secrets in seconds.
     * 
     */
    public Output<Integer> maxTtl() {
        return this.maxTtl;
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
     * Specifies the Nomad Management token to use.
     * 
     */
    @Export(name="token", type=String.class, parameters={})
    private Output</* @Nullable */ String> token;

    /**
     * @return Specifies the Nomad Management token to use.
     * 
     */
    public Output<Optional<String>> token() {
        return Codegen.optional(this.token);
    }
    /**
     * Specifies the ttl of the lease for the generated token.
     * 
     */
    @Export(name="ttl", type=Integer.class, parameters={})
    private Output<Integer> ttl;

    /**
     * @return Specifies the ttl of the lease for the generated token.
     * 
     */
    public Output<Integer> ttl() {
        return this.ttl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NomadSecretBackend(String name) {
        this(name, NomadSecretBackendArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NomadSecretBackend(String name, @Nullable NomadSecretBackendArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NomadSecretBackend(String name, @Nullable NomadSecretBackendArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:index/nomadSecretBackend:NomadSecretBackend", name, args == null ? NomadSecretBackendArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NomadSecretBackend(String name, Output<String> id, @Nullable NomadSecretBackendState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:index/nomadSecretBackend:NomadSecretBackend", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "clientCert",
                "clientKey",
                "token"
            ))
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
    public static NomadSecretBackend get(String name, Output<String> id, @Nullable NomadSecretBackendState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NomadSecretBackend(name, id, state, options);
    }
}
