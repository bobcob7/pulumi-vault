// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.aws;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.vault.Utilities;
import com.pulumi.vault.aws.inputs.GetAccessCredentialsArgs;
import com.pulumi.vault.aws.inputs.GetAccessCredentialsPlainArgs;
import com.pulumi.vault.aws.outputs.GetAccessCredentialsResult;
import java.util.concurrent.CompletableFuture;

public final class AwsFunctions {
    /**
     * ## Example Usage
     * 
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.vault.aws.SecretBackend;
     * import com.pulumi.vault.aws.SecretBackendArgs;
     * import com.pulumi.vault.aws.SecretBackendRole;
     * import com.pulumi.vault.aws.SecretBackendRoleArgs;
     * import com.pulumi.vault.aws.AwsFunctions;
     * import com.pulumi.vault.ad.inputs.GetAccessCredentialsArgs;
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
     *         var aws = new SecretBackend(&#34;aws&#34;, SecretBackendArgs.builder()        
     *             .accessKey(&#34;AKIA.....&#34;)
     *             .secretKey(&#34;SECRETKEYFROMAWS&#34;)
     *             .build());
     * 
     *         var role = new SecretBackendRole(&#34;role&#34;, SecretBackendRoleArgs.builder()        
     *             .backend(aws.path())
     *             .policy(&#34;&#34;&#34;
     * {
     *   &#34;Version&#34;: &#34;2012-10-17&#34;,
     *   &#34;Statement&#34;: [
     *     {
     *       &#34;Effect&#34;: &#34;Allow&#34;,
     *       &#34;Action&#34;: &#34;iam:*&#34;,
     *       &#34;Resource&#34;: &#34;*&#34;
     *     }
     *   ]
     * }
     *             &#34;&#34;&#34;)
     *             .build());
     * 
     *         final var creds = AwsFunctions.getAccessCredentials(GetAccessCredentialsArgs.builder()
     *             .backend(aws.path())
     *             .role(role.name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAccessCredentialsResult> getAccessCredentials(GetAccessCredentialsArgs args) {
        return getAccessCredentials(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.vault.aws.SecretBackend;
     * import com.pulumi.vault.aws.SecretBackendArgs;
     * import com.pulumi.vault.aws.SecretBackendRole;
     * import com.pulumi.vault.aws.SecretBackendRoleArgs;
     * import com.pulumi.vault.aws.AwsFunctions;
     * import com.pulumi.vault.ad.inputs.GetAccessCredentialsArgs;
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
     *         var aws = new SecretBackend(&#34;aws&#34;, SecretBackendArgs.builder()        
     *             .accessKey(&#34;AKIA.....&#34;)
     *             .secretKey(&#34;SECRETKEYFROMAWS&#34;)
     *             .build());
     * 
     *         var role = new SecretBackendRole(&#34;role&#34;, SecretBackendRoleArgs.builder()        
     *             .backend(aws.path())
     *             .policy(&#34;&#34;&#34;
     * {
     *   &#34;Version&#34;: &#34;2012-10-17&#34;,
     *   &#34;Statement&#34;: [
     *     {
     *       &#34;Effect&#34;: &#34;Allow&#34;,
     *       &#34;Action&#34;: &#34;iam:*&#34;,
     *       &#34;Resource&#34;: &#34;*&#34;
     *     }
     *   ]
     * }
     *             &#34;&#34;&#34;)
     *             .build());
     * 
     *         final var creds = AwsFunctions.getAccessCredentials(GetAccessCredentialsArgs.builder()
     *             .backend(aws.path())
     *             .role(role.name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccessCredentialsResult> getAccessCredentialsPlain(GetAccessCredentialsPlainArgs args) {
        return getAccessCredentialsPlain(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.vault.aws.SecretBackend;
     * import com.pulumi.vault.aws.SecretBackendArgs;
     * import com.pulumi.vault.aws.SecretBackendRole;
     * import com.pulumi.vault.aws.SecretBackendRoleArgs;
     * import com.pulumi.vault.aws.AwsFunctions;
     * import com.pulumi.vault.ad.inputs.GetAccessCredentialsArgs;
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
     *         var aws = new SecretBackend(&#34;aws&#34;, SecretBackendArgs.builder()        
     *             .accessKey(&#34;AKIA.....&#34;)
     *             .secretKey(&#34;SECRETKEYFROMAWS&#34;)
     *             .build());
     * 
     *         var role = new SecretBackendRole(&#34;role&#34;, SecretBackendRoleArgs.builder()        
     *             .backend(aws.path())
     *             .policy(&#34;&#34;&#34;
     * {
     *   &#34;Version&#34;: &#34;2012-10-17&#34;,
     *   &#34;Statement&#34;: [
     *     {
     *       &#34;Effect&#34;: &#34;Allow&#34;,
     *       &#34;Action&#34;: &#34;iam:*&#34;,
     *       &#34;Resource&#34;: &#34;*&#34;
     *     }
     *   ]
     * }
     *             &#34;&#34;&#34;)
     *             .build());
     * 
     *         final var creds = AwsFunctions.getAccessCredentials(GetAccessCredentialsArgs.builder()
     *             .backend(aws.path())
     *             .role(role.name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAccessCredentialsResult> getAccessCredentials(GetAccessCredentialsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("vault:aws/getAccessCredentials:getAccessCredentials", TypeShape.of(GetAccessCredentialsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.vault.aws.SecretBackend;
     * import com.pulumi.vault.aws.SecretBackendArgs;
     * import com.pulumi.vault.aws.SecretBackendRole;
     * import com.pulumi.vault.aws.SecretBackendRoleArgs;
     * import com.pulumi.vault.aws.AwsFunctions;
     * import com.pulumi.vault.ad.inputs.GetAccessCredentialsArgs;
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
     *         var aws = new SecretBackend(&#34;aws&#34;, SecretBackendArgs.builder()        
     *             .accessKey(&#34;AKIA.....&#34;)
     *             .secretKey(&#34;SECRETKEYFROMAWS&#34;)
     *             .build());
     * 
     *         var role = new SecretBackendRole(&#34;role&#34;, SecretBackendRoleArgs.builder()        
     *             .backend(aws.path())
     *             .policy(&#34;&#34;&#34;
     * {
     *   &#34;Version&#34;: &#34;2012-10-17&#34;,
     *   &#34;Statement&#34;: [
     *     {
     *       &#34;Effect&#34;: &#34;Allow&#34;,
     *       &#34;Action&#34;: &#34;iam:*&#34;,
     *       &#34;Resource&#34;: &#34;*&#34;
     *     }
     *   ]
     * }
     *             &#34;&#34;&#34;)
     *             .build());
     * 
     *         final var creds = AwsFunctions.getAccessCredentials(GetAccessCredentialsArgs.builder()
     *             .backend(aws.path())
     *             .role(role.name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccessCredentialsResult> getAccessCredentialsPlain(GetAccessCredentialsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("vault:aws/getAccessCredentials:getAccessCredentials", TypeShape.of(GetAccessCredentialsResult.class), args, Utilities.withVersion(options));
    }
}
