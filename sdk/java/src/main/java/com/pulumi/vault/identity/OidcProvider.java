// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.identity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.vault.Utilities;
import com.pulumi.vault.identity.OidcProviderArgs;
import com.pulumi.vault.identity.inputs.OidcProviderState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages OIDC Providers in a Vault server. See the [Vault documentation](https://www.vaultproject.io/api-docs/secret/identity/oidc-provider#create-or-update-an-assignment)
 * for more information.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.vault.identity.OidcKey;
 * import com.pulumi.vault.identity.OidcKeyArgs;
 * import com.pulumi.vault.identity.OidcAssignment;
 * import com.pulumi.vault.identity.OidcAssignmentArgs;
 * import com.pulumi.vault.identity.OidcClient;
 * import com.pulumi.vault.identity.OidcClientArgs;
 * import com.pulumi.vault.identity.OidcScope;
 * import com.pulumi.vault.identity.OidcScopeArgs;
 * import com.pulumi.vault.identity.OidcProvider;
 * import com.pulumi.vault.identity.OidcProviderArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var testOidcKey = new OidcKey(&#34;testOidcKey&#34;, OidcKeyArgs.builder()        
 *             .allowedClientIds(&#34;*&#34;)
 *             .rotationPeriod(3600)
 *             .verificationTtl(3600)
 *             .build());
 * 
 *         var testOidcAssignment = new OidcAssignment(&#34;testOidcAssignment&#34;, OidcAssignmentArgs.builder()        
 *             .entityIds(&#34;fake-ascbascas-2231a-sdfaa&#34;)
 *             .groupIds(&#34;fake-sajkdsad-32414-sfsada&#34;)
 *             .build());
 * 
 *         var testOidcClient = new OidcClient(&#34;testOidcClient&#34;, OidcClientArgs.builder()        
 *             .key(testOidcKey.name())
 *             .redirectUris(            
 *                 &#34;http://127.0.0.1:9200/v1/auth-methods/oidc:authenticate:callback&#34;,
 *                 &#34;http://127.0.0.1:8251/callback&#34;,
 *                 &#34;http://127.0.0.1:8080/callback&#34;)
 *             .assignments(testOidcAssignment.name())
 *             .idTokenTtl(2400)
 *             .accessTokenTtl(7200)
 *             .build());
 * 
 *         var testOidcScope = new OidcScope(&#34;testOidcScope&#34;, OidcScopeArgs.builder()        
 *             .template(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;groups&#34;, &#34;{{identity.entity.groups.names}}&#34;)
 *                 )))
 *             .description(&#34;Groups scope.&#34;)
 *             .build());
 * 
 *         var testOidcProvider = new OidcProvider(&#34;testOidcProvider&#34;, OidcProviderArgs.builder()        
 *             .httpsEnabled(false)
 *             .issuerHost(&#34;127.0.0.1:8200&#34;)
 *             .allowedClientIds(testOidcClient.clientId())
 *             .scopesSupporteds(testOidcScope.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * OIDC Providers can be imported using the `name`, e.g.
 * 
 * ```sh
 *  $ pulumi import vault:identity/oidcProvider:OidcProvider test my-provider
 * ```
 * 
 */
@ResourceType(type="vault:identity/oidcProvider:OidcProvider")
public class OidcProvider extends com.pulumi.resources.CustomResource {
    /**
     * The client IDs that are permitted to use the provider.
     * If empty, no clients are allowed. If `*`, all clients are allowed.
     * 
     */
    @Export(name="allowedClientIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedClientIds;

    /**
     * @return The client IDs that are permitted to use the provider.
     * If empty, no clients are allowed. If `*`, all clients are allowed.
     * 
     */
    public Output<Optional<List<String>>> allowedClientIds() {
        return Codegen.optional(this.allowedClientIds);
    }
    /**
     * Set to true if the issuer endpoint uses HTTPS.
     * 
     */
    @Export(name="httpsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> httpsEnabled;

    /**
     * @return Set to true if the issuer endpoint uses HTTPS.
     * 
     */
    public Output<Optional<Boolean>> httpsEnabled() {
        return Codegen.optional(this.httpsEnabled);
    }
    /**
     * Specifies what will be used as the `scheme://host:port`
     * component for the `iss` claim of ID tokens. This value is computed using the
     * `issuer_host` and `https_enabled` fields.
     * 
     */
    @Export(name="issuer", type=String.class, parameters={})
    private Output<String> issuer;

    /**
     * @return Specifies what will be used as the `scheme://host:port`
     * component for the `iss` claim of ID tokens. This value is computed using the
     * `issuer_host` and `https_enabled` fields.
     * 
     */
    public Output<String> issuer() {
        return this.issuer;
    }
    /**
     * The host for the issuer. Can be either host or host:port.
     * 
     */
    @Export(name="issuerHost", type=String.class, parameters={})
    private Output</* @Nullable */ String> issuerHost;

    /**
     * @return The host for the issuer. Can be either host or host:port.
     * 
     */
    public Output<Optional<String>> issuerHost() {
        return Codegen.optional(this.issuerHost);
    }
    /**
     * The name of the provider.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the provider.
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
     * The scopes available for requesting on the provider.
     * 
     */
    @Export(name="scopesSupporteds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> scopesSupporteds;

    /**
     * @return The scopes available for requesting on the provider.
     * 
     */
    public Output<Optional<List<String>>> scopesSupporteds() {
        return Codegen.optional(this.scopesSupporteds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OidcProvider(String name) {
        this(name, OidcProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OidcProvider(String name, @Nullable OidcProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OidcProvider(String name, @Nullable OidcProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:identity/oidcProvider:OidcProvider", name, args == null ? OidcProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OidcProvider(String name, Output<String> id, @Nullable OidcProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:identity/oidcProvider:OidcProvider", name, state, makeResourceOptions(options, id));
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
    public static OidcProvider get(String name, Output<String> id, @Nullable OidcProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OidcProvider(name, id, state, options);
    }
}
