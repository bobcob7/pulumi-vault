// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.vault.PasswordPolicyArgs;
import com.pulumi.vault.Utilities;
import com.pulumi.vault.inputs.PasswordPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage Password Policies
 * 
 * **Note** this feature is available only Vault 1.5+
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.vault.PasswordPolicy;
 * import com.pulumi.vault.PasswordPolicyArgs;
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
 *         var alphanumeric = new PasswordPolicy(&#34;alphanumeric&#34;, PasswordPolicyArgs.builder()        
 *             .policy(&#34;&#34;&#34;
 *     length = 20
 *     rule &#34;charset&#34; {
 *       charset = &#34;abcdefghijklmnopqrstuvwxyz0123456789&#34;
 *     }
 *   
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Password policies can be imported using the `name`, e.g.
 * 
 * ```sh
 *  $ pulumi import vault:index/passwordPolicy:PasswordPolicy alphanumeric alphanumeric
 * ```
 * 
 */
@ResourceType(type="vault:index/passwordPolicy:PasswordPolicy")
public class PasswordPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The name of the password policy.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the password policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * String containing a password policy.
     * 
     */
    @Export(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return String containing a password policy.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PasswordPolicy(String name) {
        this(name, PasswordPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PasswordPolicy(String name, PasswordPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PasswordPolicy(String name, PasswordPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:index/passwordPolicy:PasswordPolicy", name, args == null ? PasswordPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PasswordPolicy(String name, Output<String> id, @Nullable PasswordPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:index/passwordPolicy:PasswordPolicy", name, state, makeResourceOptions(options, id));
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
    public static PasswordPolicy get(String name, Output<String> id, @Nullable PasswordPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PasswordPolicy(name, id, state, options);
    }
}
