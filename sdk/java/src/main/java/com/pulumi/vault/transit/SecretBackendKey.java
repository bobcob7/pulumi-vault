// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.transit;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.vault.Utilities;
import com.pulumi.vault.transit.SecretBackendKeyArgs;
import com.pulumi.vault.transit.inputs.SecretBackendKeyState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates an Encryption Keyring on a Transit Secret Backend for Vault.
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
 * import com.pulumi.vault.transit.SecretBackendKey;
 * import com.pulumi.vault.transit.SecretBackendKeyArgs;
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
 *         var transit = new Mount(&#34;transit&#34;, MountArgs.builder()        
 *             .path(&#34;transit&#34;)
 *             .type(&#34;transit&#34;)
 *             .description(&#34;Example description&#34;)
 *             .defaultLeaseTtlSeconds(3600)
 *             .maxLeaseTtlSeconds(86400)
 *             .build());
 * 
 *         var key = new SecretBackendKey(&#34;key&#34;, SecretBackendKeyArgs.builder()        
 *             .backend(transit.path())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Deprecations
 * 
 * * `auto_rotate_interval` - Replaced by `auto_rotate_period`.
 * 
 * ## Import
 * 
 * Transit secret backend keys can be imported using the `path`, e.g.
 * 
 * ```sh
 *  $ pulumi import vault:transit/secretBackendKey:SecretBackendKey key transit/keys/my_key
 * ```
 * 
 */
@ResourceType(type="vault:transit/secretBackendKey:SecretBackendKey")
public class SecretBackendKey extends com.pulumi.resources.CustomResource {
    /**
     * Enables taking backup of entire keyring in the plaintext format. Once set, this cannot be disabled.
     * * Refer to Vault API documentation on key backups for more information: [Backup Key](https://www.vaultproject.io/api-docs/secret/transit#backup-key)
     * 
     */
    @Export(name="allowPlaintextBackup", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowPlaintextBackup;

    /**
     * @return Enables taking backup of entire keyring in the plaintext format. Once set, this cannot be disabled.
     * * Refer to Vault API documentation on key backups for more information: [Backup Key](https://www.vaultproject.io/api-docs/secret/transit#backup-key)
     * 
     */
    public Output<Optional<Boolean>> allowPlaintextBackup() {
        return Codegen.optional(this.allowPlaintextBackup);
    }
    /**
     * Amount of time the key should live before being automatically rotated. A value of 0 disables automatic rotation for the
     * key.
     * 
     * @deprecated
     * Use auto_rotate_period instead
     * 
     */
    @Deprecated /* Use auto_rotate_period instead */
    @Export(name="autoRotateInterval", type=Integer.class, parameters={})
    private Output<Integer> autoRotateInterval;

    /**
     * @return Amount of time the key should live before being automatically rotated. A value of 0 disables automatic rotation for the
     * key.
     * 
     */
    public Output<Integer> autoRotateInterval() {
        return this.autoRotateInterval;
    }
    /**
     * Amount of time the key should live before being automatically rotated.
     * A value of 0 disables automatic rotation for the key.
     * 
     */
    @Export(name="autoRotatePeriod", type=Integer.class, parameters={})
    private Output<Integer> autoRotatePeriod;

    /**
     * @return Amount of time the key should live before being automatically rotated.
     * A value of 0 disables automatic rotation for the key.
     * 
     */
    public Output<Integer> autoRotatePeriod() {
        return this.autoRotatePeriod;
    }
    /**
     * The path the transit secret backend is mounted at, with no leading or trailing `/`s.
     * 
     */
    @Export(name="backend", type=String.class, parameters={})
    private Output<String> backend;

    /**
     * @return The path the transit secret backend is mounted at, with no leading or trailing `/`s.
     * 
     */
    public Output<String> backend() {
        return this.backend;
    }
    /**
     * Whether or not to support convergent encryption, where the same plaintext creates the same ciphertext. This requires `derived` to be set to `true`.
     * 
     */
    @Export(name="convergentEncryption", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> convergentEncryption;

    /**
     * @return Whether or not to support convergent encryption, where the same plaintext creates the same ciphertext. This requires `derived` to be set to `true`.
     * 
     */
    public Output<Optional<Boolean>> convergentEncryption() {
        return Codegen.optional(this.convergentEncryption);
    }
    /**
     * Specifies if the key is allowed to be deleted.
     * 
     */
    @Export(name="deletionAllowed", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deletionAllowed;

    /**
     * @return Specifies if the key is allowed to be deleted.
     * 
     */
    public Output<Optional<Boolean>> deletionAllowed() {
        return Codegen.optional(this.deletionAllowed);
    }
    /**
     * Specifies if key derivation is to be used. If enabled, all encrypt/decrypt requests to this key must provide a context which is used for key derivation.
     * 
     */
    @Export(name="derived", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> derived;

    /**
     * @return Specifies if key derivation is to be used. If enabled, all encrypt/decrypt requests to this key must provide a context which is used for key derivation.
     * 
     */
    public Output<Optional<Boolean>> derived() {
        return Codegen.optional(this.derived);
    }
    /**
     * Enables keys to be exportable. This allows for all valid private keys in the keyring to be exported. Once set, this cannot be disabled.
     * 
     */
    @Export(name="exportable", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> exportable;

    /**
     * @return Enables keys to be exportable. This allows for all valid private keys in the keyring to be exported. Once set, this cannot be disabled.
     * 
     */
    public Output<Optional<Boolean>> exportable() {
        return Codegen.optional(this.exportable);
    }
    /**
     * List of key versions in the keyring. This attribute is zero-indexed and will contain a map of values depending on the `type` of the encryption key.
     * * for key types `aes128-gcm96`, `aes256-gcm96` and `chacha20-poly1305`, each key version will be a map of a single value `id` which is just a hash of the key&#39;s metadata.
     * * for key types `ed25519`, `ecdsa-p256`, `ecdsa-p384`, `ecdsa-p521`, `rsa-2048`, `rsa-3072` and `rsa-4096`, each key version will be a map of the following:
     * 
     */
    @Export(name="keys", type=List.class, parameters={Map.class})
    private Output<List<Map<String,Object>>> keys;

    /**
     * @return List of key versions in the keyring. This attribute is zero-indexed and will contain a map of values depending on the `type` of the encryption key.
     * * for key types `aes128-gcm96`, `aes256-gcm96` and `chacha20-poly1305`, each key version will be a map of a single value `id` which is just a hash of the key&#39;s metadata.
     * * for key types `ed25519`, `ecdsa-p256`, `ecdsa-p384`, `ecdsa-p521`, `rsa-2048`, `rsa-3072` and `rsa-4096`, each key version will be a map of the following:
     * 
     */
    public Output<List<Map<String,Object>>> keys() {
        return this.keys;
    }
    /**
     * Latest key version available. This value is 1-indexed, so if `latest_version` is `1`, then the key&#39;s information can be referenced from `keys` by selecting element `0`
     * 
     */
    @Export(name="latestVersion", type=Integer.class, parameters={})
    private Output<Integer> latestVersion;

    /**
     * @return Latest key version available. This value is 1-indexed, so if `latest_version` is `1`, then the key&#39;s information can be referenced from `keys` by selecting element `0`
     * 
     */
    public Output<Integer> latestVersion() {
        return this.latestVersion;
    }
    /**
     * Minimum key version available for use. If keys have been archived by increasing `min_decryption_version`, this attribute will reflect that change.
     * 
     */
    @Export(name="minAvailableVersion", type=Integer.class, parameters={})
    private Output<Integer> minAvailableVersion;

    /**
     * @return Minimum key version available for use. If keys have been archived by increasing `min_decryption_version`, this attribute will reflect that change.
     * 
     */
    public Output<Integer> minAvailableVersion() {
        return this.minAvailableVersion;
    }
    /**
     * Minimum key version to use for decryption.
     * 
     */
    @Export(name="minDecryptionVersion", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minDecryptionVersion;

    /**
     * @return Minimum key version to use for decryption.
     * 
     */
    public Output<Optional<Integer>> minDecryptionVersion() {
        return Codegen.optional(this.minDecryptionVersion);
    }
    /**
     * Minimum key version to use for encryption
     * 
     */
    @Export(name="minEncryptionVersion", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minEncryptionVersion;

    /**
     * @return Minimum key version to use for encryption
     * 
     */
    public Output<Optional<Integer>> minEncryptionVersion() {
        return Codegen.optional(this.minEncryptionVersion);
    }
    /**
     * The name to identify this key within the backend. Must be unique within the backend.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name to identify this key within the backend. Must be unique within the backend.
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
     * Whether or not the key supports decryption, based on key type.
     * 
     */
    @Export(name="supportsDecryption", type=Boolean.class, parameters={})
    private Output<Boolean> supportsDecryption;

    /**
     * @return Whether or not the key supports decryption, based on key type.
     * 
     */
    public Output<Boolean> supportsDecryption() {
        return this.supportsDecryption;
    }
    /**
     * Whether or not the key supports derivation, based on key type.
     * 
     */
    @Export(name="supportsDerivation", type=Boolean.class, parameters={})
    private Output<Boolean> supportsDerivation;

    /**
     * @return Whether or not the key supports derivation, based on key type.
     * 
     */
    public Output<Boolean> supportsDerivation() {
        return this.supportsDerivation;
    }
    /**
     * Whether or not the key supports encryption, based on key type.
     * 
     */
    @Export(name="supportsEncryption", type=Boolean.class, parameters={})
    private Output<Boolean> supportsEncryption;

    /**
     * @return Whether or not the key supports encryption, based on key type.
     * 
     */
    public Output<Boolean> supportsEncryption() {
        return this.supportsEncryption;
    }
    /**
     * Whether or not the key supports signing, based on key type.
     * 
     */
    @Export(name="supportsSigning", type=Boolean.class, parameters={})
    private Output<Boolean> supportsSigning;

    /**
     * @return Whether or not the key supports signing, based on key type.
     * 
     */
    public Output<Boolean> supportsSigning() {
        return this.supportsSigning;
    }
    /**
     * Specifies the type of key to create. The currently-supported types are: `aes128-gcm96`, `aes256-gcm96` (default), `chacha20-poly1305`, `ed25519`, `ecdsa-p256`, `ecdsa-p384`, `ecdsa-p521`, `rsa-2048`, `rsa-3072` and `rsa-4096`.
     * * Refer to the Vault documentation on transit key types for more information: [Key Types](https://www.vaultproject.io/docs/secrets/transit#key-types)
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return Specifies the type of key to create. The currently-supported types are: `aes128-gcm96`, `aes256-gcm96` (default), `chacha20-poly1305`, `ed25519`, `ecdsa-p256`, `ecdsa-p384`, `ecdsa-p521`, `rsa-2048`, `rsa-3072` and `rsa-4096`.
     * * Refer to the Vault documentation on transit key types for more information: [Key Types](https://www.vaultproject.io/docs/secrets/transit#key-types)
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecretBackendKey(String name) {
        this(name, SecretBackendKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecretBackendKey(String name, SecretBackendKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecretBackendKey(String name, SecretBackendKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:transit/secretBackendKey:SecretBackendKey", name, args == null ? SecretBackendKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecretBackendKey(String name, Output<String> id, @Nullable SecretBackendKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("vault:transit/secretBackendKey:SecretBackendKey", name, state, makeResourceOptions(options, id));
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
    public static SecretBackendKey get(String name, Output<String> id, @Nullable SecretBackendKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecretBackendKey(name, id, state, options);
    }
}
