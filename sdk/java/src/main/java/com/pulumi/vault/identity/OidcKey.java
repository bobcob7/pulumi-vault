// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.identity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.vault.Utilities;
import com.pulumi.vault.identity.OidcKeyArgs;
import com.pulumi.vault.identity.inputs.OidcKeyState;
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
 * The key can be imported with the key name, for example
 * 
 * ```sh
 *  $ pulumi import vault:identity/oidcKey:OidcKey key key
 * ```
 * 
 */
@ResourceType(type="vault:identity/oidcKey:OidcKey")
public class OidcKey extends com.pulumi.resources.CustomResource {
    /**
     * Signing algorithm to use. Signing algorithm to use.
     * Allowed values are: RS256 (default), RS384, RS512, ES256, ES384, ES512, EdDSA.
     * 
     */
    @Export(name="algorithm", type=String.class, parameters={})
    private Output</* @Nullable */ String> algorithm;

    /**
     * @return Signing algorithm to use. Signing algorithm to use.
     * Allowed values are: RS256 (default), RS384, RS512, ES256, ES384, ES512, EdDSA.
     * 
     */
    public Output<Optional<String>> algorithm() {
        return Codegen.optional(this.algorithm);
    }
    /**
     * Array of role client ids allowed to use this key for signing. If empty, no roles are allowed. If &#34;*&#34;, all roles are
     * allowed.
     * 
     */
    @Export(name="allowedClientIds", type=List.class, parameters={String.class})
    private Output<List<String>> allowedClientIds;

    /**
     * @return Array of role client ids allowed to use this key for signing. If empty, no roles are allowed. If &#34;*&#34;, all roles are
     * allowed.
     * 
     */
    public Output<List<String>> allowedClientIds() {
        return this.allowedClientIds;
    }
    /**
     * Name of the OIDC Key to create.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the OIDC Key to create.
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
     * How often to generate a new signing key in number of seconds
     * 
     */
    @Export(name="rotationPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> rotationPeriod;

    /**
     * @return How often to generate a new signing key in number of seconds
     * 
     */
    public Output<Optional<Integer>> rotationPeriod() {
        return Codegen.optional(this.rotationPeriod);
    }
    /**
     * &#34;Controls how long the public portion of a signing key will be
     * available for verification after being rotated in seconds.
     * 
     */
    @Export(name="verificationTtl", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> verificationTtl;

    /**
     * @return &#34;Controls how long the public portion of a signing key will be
     * available for verification after being rotated in seconds.
     * 
     */
    public Output<Optional<Integer>> verificationTtl() {
        return Codegen.optional(this.verificationTtl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OidcKey(String name) {
        this(name, OidcKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OidcKey(String name, @Nullable OidcKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OidcKey(String name, @Nullable OidcKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:identity/oidcKey:OidcKey", name, args == null ? OidcKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OidcKey(String name, Output<String> id, @Nullable OidcKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:identity/oidcKey:OidcKey", name, state, makeResourceOptions(options, id));
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
    public static OidcKey get(String name, Output<String> id, @Nullable OidcKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OidcKey(name, id, state, options);
    }
}
