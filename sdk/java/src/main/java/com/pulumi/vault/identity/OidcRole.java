// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.identity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.vault.Utilities;
import com.pulumi.vault.identity.OidcRoleArgs;
import com.pulumi.vault.identity.inputs.OidcRoleState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * You need to create a role with a named key.
 * At creation time, the key can be created independently of the role. However, the key must
 * exist before the role can be used to issue tokens. You must also configure the key with the
 * role&#39;s Client ID to allow the role to use the key.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.vault.identity.OidcRole;
 * import com.pulumi.vault.identity.OidcRoleArgs;
 * import com.pulumi.vault.identity.OidcKey;
 * import com.pulumi.vault.identity.OidcKeyArgs;
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
 *         final var config = ctx.config();
 *         final var key = config.get(&#34;key&#34;).orElse(&#34;key&#34;);
 *         var role = new OidcRole(&#34;role&#34;, OidcRoleArgs.builder()        
 *             .key(key)
 *             .build());
 * 
 *         var keyOidcKey = new OidcKey(&#34;keyOidcKey&#34;, OidcKeyArgs.builder()        
 *             .algorithm(&#34;RS256&#34;)
 *             .allowedClientIds(role.clientId())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * If you want to create the key first before creating the role, you can use a separate
 * resource to configure the allowed Client ID on
 * the key.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.vault.identity.OidcKey;
 * import com.pulumi.vault.identity.OidcKeyArgs;
 * import com.pulumi.vault.identity.OidcRole;
 * import com.pulumi.vault.identity.OidcRoleArgs;
 * import com.pulumi.vault.identity.OidcKeyAllowedClientID;
 * import com.pulumi.vault.identity.OidcKeyAllowedClientIDArgs;
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
 *         var key = new OidcKey(&#34;key&#34;, OidcKeyArgs.builder()        
 *             .algorithm(&#34;RS256&#34;)
 *             .build());
 * 
 *         var roleOidcRole = new OidcRole(&#34;roleOidcRole&#34;, OidcRoleArgs.builder()        
 *             .key(key.name())
 *             .build());
 * 
 *         var roleOidcKeyAllowedClientID = new OidcKeyAllowedClientID(&#34;roleOidcKeyAllowedClientID&#34;, OidcKeyAllowedClientIDArgs.builder()        
 *             .keyName(key.name())
 *             .allowedClientId(roleOidcRole.clientId())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * The key can be imported with the role name, for example
 * 
 * ```sh
 *  $ pulumi import vault:identity/oidcRole:OidcRole role role
 * ```
 * 
 */
@ResourceType(type="vault:identity/oidcRole:OidcRole")
public class OidcRole extends com.pulumi.resources.CustomResource {
    /**
     * The value that will be included in the `aud` field of all the OIDC identity
     * tokens issued by this role
     * 
     */
    @Export(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return The value that will be included in the `aud` field of all the OIDC identity
     * tokens issued by this role
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * A configured named key, the key must already exist
     * before tokens can be issued.
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return A configured named key, the key must already exist
     * before tokens can be issued.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * Name of the OIDC Role to create.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the OIDC Role to create.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The template string to use for generating tokens. This may be in
     * string-ified JSON or base64 format. See the
     * [documentation](https://www.vaultproject.io/docs/secrets/identity/index.html#token-contents-and-templates)
     * for the template format.
     * 
     */
    @Export(name="template", type=String.class, parameters={})
    private Output</* @Nullable */ String> template;

    /**
     * @return The template string to use for generating tokens. This may be in
     * string-ified JSON or base64 format. See the
     * [documentation](https://www.vaultproject.io/docs/secrets/identity/index.html#token-contents-and-templates)
     * for the template format.
     * 
     */
    public Output<Optional<String>> template() {
        return Codegen.optional(this.template);
    }
    /**
     * TTL of the tokens generated against the role in number of seconds.
     * 
     */
    @Export(name="ttl", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> ttl;

    /**
     * @return TTL of the tokens generated against the role in number of seconds.
     * 
     */
    public Output<Optional<Integer>> ttl() {
        return Codegen.optional(this.ttl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OidcRole(String name) {
        this(name, OidcRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OidcRole(String name, OidcRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OidcRole(String name, OidcRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:identity/oidcRole:OidcRole", name, args == null ? OidcRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OidcRole(String name, Output<String> id, @Nullable OidcRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:identity/oidcRole:OidcRole", name, state, makeResourceOptions(options, id));
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
    public static OidcRole get(String name, Output<String> id, @Nullable OidcRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OidcRole(name, id, state, options);
    }
}
