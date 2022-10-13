// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.ldap;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.vault.Utilities;
import com.pulumi.vault.ldap.AuthBackendUserArgs;
import com.pulumi.vault.ldap.inputs.AuthBackendUserState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to create a user in an [LDAP auth backend within Vault](https://www.vaultproject.io/docs/auth/ldap.html).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.vault.ldap.AuthBackend;
 * import com.pulumi.vault.ldap.AuthBackendArgs;
 * import com.pulumi.vault.ldap.AuthBackendUser;
 * import com.pulumi.vault.ldap.AuthBackendUserArgs;
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
 *         var ldap = new AuthBackend(&#34;ldap&#34;, AuthBackendArgs.builder()        
 *             .path(&#34;ldap&#34;)
 *             .url(&#34;ldaps://dc-01.example.org&#34;)
 *             .userdn(&#34;OU=Users,OU=Accounts,DC=example,DC=org&#34;)
 *             .userattr(&#34;sAMAccountName&#34;)
 *             .upndomain(&#34;EXAMPLE.ORG&#34;)
 *             .discoverdn(false)
 *             .groupdn(&#34;OU=Groups,DC=example,DC=org&#34;)
 *             .groupfilter(&#34;(&amp;(objectClass=group)(member:1.2.840.113556.1.4.1941:={{.UserDN}}))&#34;)
 *             .build());
 * 
 *         var user = new AuthBackendUser(&#34;user&#34;, AuthBackendUserArgs.builder()        
 *             .username(&#34;test-user&#34;)
 *             .policies(            
 *                 &#34;dba&#34;,
 *                 &#34;sysops&#34;)
 *             .backend(ldap.path())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * LDAP authentication backend users can be imported using the `path`, e.g.
 * 
 * ```sh
 *  $ pulumi import vault:ldap/authBackendUser:AuthBackendUser foo auth/ldap/users/foo
 * ```
 * 
 */
@ResourceType(type="vault:ldap/authBackendUser:AuthBackendUser")
public class AuthBackendUser extends com.pulumi.resources.CustomResource {
    /**
     * Path to the authentication backend
     * 
     */
    @Export(name="backend", type=String.class, parameters={})
    private Output</* @Nullable */ String> backend;

    /**
     * @return Path to the authentication backend
     * 
     */
    public Output<Optional<String>> backend() {
        return Codegen.optional(this.backend);
    }
    /**
     * Override LDAP groups which should be granted to user
     * 
     */
    @Export(name="groups", type=List.class, parameters={String.class})
    private Output<List<String>> groups;

    /**
     * @return Override LDAP groups which should be granted to user
     * 
     */
    public Output<List<String>> groups() {
        return this.groups;
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
     * Policies which should be granted to user
     * 
     */
    @Export(name="policies", type=List.class, parameters={String.class})
    private Output<List<String>> policies;

    /**
     * @return Policies which should be granted to user
     * 
     */
    public Output<List<String>> policies() {
        return this.policies;
    }
    /**
     * The LDAP username
     * 
     */
    @Export(name="username", type=String.class, parameters={})
    private Output<String> username;

    /**
     * @return The LDAP username
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthBackendUser(String name) {
        this(name, AuthBackendUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthBackendUser(String name, AuthBackendUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthBackendUser(String name, AuthBackendUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:ldap/authBackendUser:AuthBackendUser", name, args == null ? AuthBackendUserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AuthBackendUser(String name, Output<String> id, @Nullable AuthBackendUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:ldap/authBackendUser:AuthBackendUser", name, state, makeResourceOptions(options, id));
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
    public static AuthBackendUser get(String name, Output<String> id, @Nullable AuthBackendUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AuthBackendUser(name, id, state, options);
    }
}
