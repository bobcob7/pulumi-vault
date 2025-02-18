// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.transit.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretBackendKeyState extends com.pulumi.resources.ResourceArgs {

    public static final SecretBackendKeyState Empty = new SecretBackendKeyState();

    /**
     * Enables taking backup of entire keyring in the plaintext format. Once set, this cannot be disabled.
     * * Refer to Vault API documentation on key backups for more information: [Backup Key](https://www.vaultproject.io/api-docs/secret/transit#backup-key)
     * 
     */
    @Import(name="allowPlaintextBackup")
    private @Nullable Output<Boolean> allowPlaintextBackup;

    /**
     * @return Enables taking backup of entire keyring in the plaintext format. Once set, this cannot be disabled.
     * * Refer to Vault API documentation on key backups for more information: [Backup Key](https://www.vaultproject.io/api-docs/secret/transit#backup-key)
     * 
     */
    public Optional<Output<Boolean>> allowPlaintextBackup() {
        return Optional.ofNullable(this.allowPlaintextBackup);
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
    @Import(name="autoRotateInterval")
    private @Nullable Output<Integer> autoRotateInterval;

    /**
     * @return Amount of time the key should live before being automatically rotated. A value of 0 disables automatic rotation for the
     * key.
     * 
     * @deprecated
     * Use auto_rotate_period instead
     * 
     */
    @Deprecated /* Use auto_rotate_period instead */
    public Optional<Output<Integer>> autoRotateInterval() {
        return Optional.ofNullable(this.autoRotateInterval);
    }

    /**
     * Amount of time the key should live before being automatically rotated.
     * A value of 0 disables automatic rotation for the key.
     * 
     */
    @Import(name="autoRotatePeriod")
    private @Nullable Output<Integer> autoRotatePeriod;

    /**
     * @return Amount of time the key should live before being automatically rotated.
     * A value of 0 disables automatic rotation for the key.
     * 
     */
    public Optional<Output<Integer>> autoRotatePeriod() {
        return Optional.ofNullable(this.autoRotatePeriod);
    }

    /**
     * The path the transit secret backend is mounted at, with no leading or trailing `/`s.
     * 
     */
    @Import(name="backend")
    private @Nullable Output<String> backend;

    /**
     * @return The path the transit secret backend is mounted at, with no leading or trailing `/`s.
     * 
     */
    public Optional<Output<String>> backend() {
        return Optional.ofNullable(this.backend);
    }

    /**
     * Whether or not to support convergent encryption, where the same plaintext creates the same ciphertext. This requires `derived` to be set to `true`.
     * 
     */
    @Import(name="convergentEncryption")
    private @Nullable Output<Boolean> convergentEncryption;

    /**
     * @return Whether or not to support convergent encryption, where the same plaintext creates the same ciphertext. This requires `derived` to be set to `true`.
     * 
     */
    public Optional<Output<Boolean>> convergentEncryption() {
        return Optional.ofNullable(this.convergentEncryption);
    }

    /**
     * Specifies if the key is allowed to be deleted.
     * 
     */
    @Import(name="deletionAllowed")
    private @Nullable Output<Boolean> deletionAllowed;

    /**
     * @return Specifies if the key is allowed to be deleted.
     * 
     */
    public Optional<Output<Boolean>> deletionAllowed() {
        return Optional.ofNullable(this.deletionAllowed);
    }

    /**
     * Specifies if key derivation is to be used. If enabled, all encrypt/decrypt requests to this key must provide a context which is used for key derivation.
     * 
     */
    @Import(name="derived")
    private @Nullable Output<Boolean> derived;

    /**
     * @return Specifies if key derivation is to be used. If enabled, all encrypt/decrypt requests to this key must provide a context which is used for key derivation.
     * 
     */
    public Optional<Output<Boolean>> derived() {
        return Optional.ofNullable(this.derived);
    }

    /**
     * Enables keys to be exportable. This allows for all valid private keys in the keyring to be exported. Once set, this cannot be disabled.
     * 
     */
    @Import(name="exportable")
    private @Nullable Output<Boolean> exportable;

    /**
     * @return Enables keys to be exportable. This allows for all valid private keys in the keyring to be exported. Once set, this cannot be disabled.
     * 
     */
    public Optional<Output<Boolean>> exportable() {
        return Optional.ofNullable(this.exportable);
    }

    /**
     * List of key versions in the keyring. This attribute is zero-indexed and will contain a map of values depending on the `type` of the encryption key.
     * * for key types `aes128-gcm96`, `aes256-gcm96` and `chacha20-poly1305`, each key version will be a map of a single value `id` which is just a hash of the key&#39;s metadata.
     * * for key types `ed25519`, `ecdsa-p256`, `ecdsa-p384`, `ecdsa-p521`, `rsa-2048`, `rsa-3072` and `rsa-4096`, each key version will be a map of the following:
     * 
     */
    @Import(name="keys")
    private @Nullable Output<List<Map<String,Object>>> keys;

    /**
     * @return List of key versions in the keyring. This attribute is zero-indexed and will contain a map of values depending on the `type` of the encryption key.
     * * for key types `aes128-gcm96`, `aes256-gcm96` and `chacha20-poly1305`, each key version will be a map of a single value `id` which is just a hash of the key&#39;s metadata.
     * * for key types `ed25519`, `ecdsa-p256`, `ecdsa-p384`, `ecdsa-p521`, `rsa-2048`, `rsa-3072` and `rsa-4096`, each key version will be a map of the following:
     * 
     */
    public Optional<Output<List<Map<String,Object>>>> keys() {
        return Optional.ofNullable(this.keys);
    }

    /**
     * Latest key version available. This value is 1-indexed, so if `latest_version` is `1`, then the key&#39;s information can be referenced from `keys` by selecting element `0`
     * 
     */
    @Import(name="latestVersion")
    private @Nullable Output<Integer> latestVersion;

    /**
     * @return Latest key version available. This value is 1-indexed, so if `latest_version` is `1`, then the key&#39;s information can be referenced from `keys` by selecting element `0`
     * 
     */
    public Optional<Output<Integer>> latestVersion() {
        return Optional.ofNullable(this.latestVersion);
    }

    /**
     * Minimum key version available for use. If keys have been archived by increasing `min_decryption_version`, this attribute will reflect that change.
     * 
     */
    @Import(name="minAvailableVersion")
    private @Nullable Output<Integer> minAvailableVersion;

    /**
     * @return Minimum key version available for use. If keys have been archived by increasing `min_decryption_version`, this attribute will reflect that change.
     * 
     */
    public Optional<Output<Integer>> minAvailableVersion() {
        return Optional.ofNullable(this.minAvailableVersion);
    }

    /**
     * Minimum key version to use for decryption.
     * 
     */
    @Import(name="minDecryptionVersion")
    private @Nullable Output<Integer> minDecryptionVersion;

    /**
     * @return Minimum key version to use for decryption.
     * 
     */
    public Optional<Output<Integer>> minDecryptionVersion() {
        return Optional.ofNullable(this.minDecryptionVersion);
    }

    /**
     * Minimum key version to use for encryption
     * 
     */
    @Import(name="minEncryptionVersion")
    private @Nullable Output<Integer> minEncryptionVersion;

    /**
     * @return Minimum key version to use for encryption
     * 
     */
    public Optional<Output<Integer>> minEncryptionVersion() {
        return Optional.ofNullable(this.minEncryptionVersion);
    }

    /**
     * The name to identify this key within the backend. Must be unique within the backend.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name to identify this key within the backend. Must be unique within the backend.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * Whether or not the key supports decryption, based on key type.
     * 
     */
    @Import(name="supportsDecryption")
    private @Nullable Output<Boolean> supportsDecryption;

    /**
     * @return Whether or not the key supports decryption, based on key type.
     * 
     */
    public Optional<Output<Boolean>> supportsDecryption() {
        return Optional.ofNullable(this.supportsDecryption);
    }

    /**
     * Whether or not the key supports derivation, based on key type.
     * 
     */
    @Import(name="supportsDerivation")
    private @Nullable Output<Boolean> supportsDerivation;

    /**
     * @return Whether or not the key supports derivation, based on key type.
     * 
     */
    public Optional<Output<Boolean>> supportsDerivation() {
        return Optional.ofNullable(this.supportsDerivation);
    }

    /**
     * Whether or not the key supports encryption, based on key type.
     * 
     */
    @Import(name="supportsEncryption")
    private @Nullable Output<Boolean> supportsEncryption;

    /**
     * @return Whether or not the key supports encryption, based on key type.
     * 
     */
    public Optional<Output<Boolean>> supportsEncryption() {
        return Optional.ofNullable(this.supportsEncryption);
    }

    /**
     * Whether or not the key supports signing, based on key type.
     * 
     */
    @Import(name="supportsSigning")
    private @Nullable Output<Boolean> supportsSigning;

    /**
     * @return Whether or not the key supports signing, based on key type.
     * 
     */
    public Optional<Output<Boolean>> supportsSigning() {
        return Optional.ofNullable(this.supportsSigning);
    }

    /**
     * Specifies the type of key to create. The currently-supported types are: `aes128-gcm96`, `aes256-gcm96` (default), `chacha20-poly1305`, `ed25519`, `ecdsa-p256`, `ecdsa-p384`, `ecdsa-p521`, `rsa-2048`, `rsa-3072` and `rsa-4096`.
     * * Refer to the Vault documentation on transit key types for more information: [Key Types](https://www.vaultproject.io/docs/secrets/transit#key-types)
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Specifies the type of key to create. The currently-supported types are: `aes128-gcm96`, `aes256-gcm96` (default), `chacha20-poly1305`, `ed25519`, `ecdsa-p256`, `ecdsa-p384`, `ecdsa-p521`, `rsa-2048`, `rsa-3072` and `rsa-4096`.
     * * Refer to the Vault documentation on transit key types for more information: [Key Types](https://www.vaultproject.io/docs/secrets/transit#key-types)
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private SecretBackendKeyState() {}

    private SecretBackendKeyState(SecretBackendKeyState $) {
        this.allowPlaintextBackup = $.allowPlaintextBackup;
        this.autoRotateInterval = $.autoRotateInterval;
        this.autoRotatePeriod = $.autoRotatePeriod;
        this.backend = $.backend;
        this.convergentEncryption = $.convergentEncryption;
        this.deletionAllowed = $.deletionAllowed;
        this.derived = $.derived;
        this.exportable = $.exportable;
        this.keys = $.keys;
        this.latestVersion = $.latestVersion;
        this.minAvailableVersion = $.minAvailableVersion;
        this.minDecryptionVersion = $.minDecryptionVersion;
        this.minEncryptionVersion = $.minEncryptionVersion;
        this.name = $.name;
        this.namespace = $.namespace;
        this.supportsDecryption = $.supportsDecryption;
        this.supportsDerivation = $.supportsDerivation;
        this.supportsEncryption = $.supportsEncryption;
        this.supportsSigning = $.supportsSigning;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretBackendKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretBackendKeyState $;

        public Builder() {
            $ = new SecretBackendKeyState();
        }

        public Builder(SecretBackendKeyState defaults) {
            $ = new SecretBackendKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowPlaintextBackup Enables taking backup of entire keyring in the plaintext format. Once set, this cannot be disabled.
         * * Refer to Vault API documentation on key backups for more information: [Backup Key](https://www.vaultproject.io/api-docs/secret/transit#backup-key)
         * 
         * @return builder
         * 
         */
        public Builder allowPlaintextBackup(@Nullable Output<Boolean> allowPlaintextBackup) {
            $.allowPlaintextBackup = allowPlaintextBackup;
            return this;
        }

        /**
         * @param allowPlaintextBackup Enables taking backup of entire keyring in the plaintext format. Once set, this cannot be disabled.
         * * Refer to Vault API documentation on key backups for more information: [Backup Key](https://www.vaultproject.io/api-docs/secret/transit#backup-key)
         * 
         * @return builder
         * 
         */
        public Builder allowPlaintextBackup(Boolean allowPlaintextBackup) {
            return allowPlaintextBackup(Output.of(allowPlaintextBackup));
        }

        /**
         * @param autoRotateInterval Amount of time the key should live before being automatically rotated. A value of 0 disables automatic rotation for the
         * key.
         * 
         * @return builder
         * 
         * @deprecated
         * Use auto_rotate_period instead
         * 
         */
        @Deprecated /* Use auto_rotate_period instead */
        public Builder autoRotateInterval(@Nullable Output<Integer> autoRotateInterval) {
            $.autoRotateInterval = autoRotateInterval;
            return this;
        }

        /**
         * @param autoRotateInterval Amount of time the key should live before being automatically rotated. A value of 0 disables automatic rotation for the
         * key.
         * 
         * @return builder
         * 
         * @deprecated
         * Use auto_rotate_period instead
         * 
         */
        @Deprecated /* Use auto_rotate_period instead */
        public Builder autoRotateInterval(Integer autoRotateInterval) {
            return autoRotateInterval(Output.of(autoRotateInterval));
        }

        /**
         * @param autoRotatePeriod Amount of time the key should live before being automatically rotated.
         * A value of 0 disables automatic rotation for the key.
         * 
         * @return builder
         * 
         */
        public Builder autoRotatePeriod(@Nullable Output<Integer> autoRotatePeriod) {
            $.autoRotatePeriod = autoRotatePeriod;
            return this;
        }

        /**
         * @param autoRotatePeriod Amount of time the key should live before being automatically rotated.
         * A value of 0 disables automatic rotation for the key.
         * 
         * @return builder
         * 
         */
        public Builder autoRotatePeriod(Integer autoRotatePeriod) {
            return autoRotatePeriod(Output.of(autoRotatePeriod));
        }

        /**
         * @param backend The path the transit secret backend is mounted at, with no leading or trailing `/`s.
         * 
         * @return builder
         * 
         */
        public Builder backend(@Nullable Output<String> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend The path the transit secret backend is mounted at, with no leading or trailing `/`s.
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param convergentEncryption Whether or not to support convergent encryption, where the same plaintext creates the same ciphertext. This requires `derived` to be set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder convergentEncryption(@Nullable Output<Boolean> convergentEncryption) {
            $.convergentEncryption = convergentEncryption;
            return this;
        }

        /**
         * @param convergentEncryption Whether or not to support convergent encryption, where the same plaintext creates the same ciphertext. This requires `derived` to be set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder convergentEncryption(Boolean convergentEncryption) {
            return convergentEncryption(Output.of(convergentEncryption));
        }

        /**
         * @param deletionAllowed Specifies if the key is allowed to be deleted.
         * 
         * @return builder
         * 
         */
        public Builder deletionAllowed(@Nullable Output<Boolean> deletionAllowed) {
            $.deletionAllowed = deletionAllowed;
            return this;
        }

        /**
         * @param deletionAllowed Specifies if the key is allowed to be deleted.
         * 
         * @return builder
         * 
         */
        public Builder deletionAllowed(Boolean deletionAllowed) {
            return deletionAllowed(Output.of(deletionAllowed));
        }

        /**
         * @param derived Specifies if key derivation is to be used. If enabled, all encrypt/decrypt requests to this key must provide a context which is used for key derivation.
         * 
         * @return builder
         * 
         */
        public Builder derived(@Nullable Output<Boolean> derived) {
            $.derived = derived;
            return this;
        }

        /**
         * @param derived Specifies if key derivation is to be used. If enabled, all encrypt/decrypt requests to this key must provide a context which is used for key derivation.
         * 
         * @return builder
         * 
         */
        public Builder derived(Boolean derived) {
            return derived(Output.of(derived));
        }

        /**
         * @param exportable Enables keys to be exportable. This allows for all valid private keys in the keyring to be exported. Once set, this cannot be disabled.
         * 
         * @return builder
         * 
         */
        public Builder exportable(@Nullable Output<Boolean> exportable) {
            $.exportable = exportable;
            return this;
        }

        /**
         * @param exportable Enables keys to be exportable. This allows for all valid private keys in the keyring to be exported. Once set, this cannot be disabled.
         * 
         * @return builder
         * 
         */
        public Builder exportable(Boolean exportable) {
            return exportable(Output.of(exportable));
        }

        /**
         * @param keys List of key versions in the keyring. This attribute is zero-indexed and will contain a map of values depending on the `type` of the encryption key.
         * * for key types `aes128-gcm96`, `aes256-gcm96` and `chacha20-poly1305`, each key version will be a map of a single value `id` which is just a hash of the key&#39;s metadata.
         * * for key types `ed25519`, `ecdsa-p256`, `ecdsa-p384`, `ecdsa-p521`, `rsa-2048`, `rsa-3072` and `rsa-4096`, each key version will be a map of the following:
         * 
         * @return builder
         * 
         */
        public Builder keys(@Nullable Output<List<Map<String,Object>>> keys) {
            $.keys = keys;
            return this;
        }

        /**
         * @param keys List of key versions in the keyring. This attribute is zero-indexed and will contain a map of values depending on the `type` of the encryption key.
         * * for key types `aes128-gcm96`, `aes256-gcm96` and `chacha20-poly1305`, each key version will be a map of a single value `id` which is just a hash of the key&#39;s metadata.
         * * for key types `ed25519`, `ecdsa-p256`, `ecdsa-p384`, `ecdsa-p521`, `rsa-2048`, `rsa-3072` and `rsa-4096`, each key version will be a map of the following:
         * 
         * @return builder
         * 
         */
        public Builder keys(List<Map<String,Object>> keys) {
            return keys(Output.of(keys));
        }

        /**
         * @param keys List of key versions in the keyring. This attribute is zero-indexed and will contain a map of values depending on the `type` of the encryption key.
         * * for key types `aes128-gcm96`, `aes256-gcm96` and `chacha20-poly1305`, each key version will be a map of a single value `id` which is just a hash of the key&#39;s metadata.
         * * for key types `ed25519`, `ecdsa-p256`, `ecdsa-p384`, `ecdsa-p521`, `rsa-2048`, `rsa-3072` and `rsa-4096`, each key version will be a map of the following:
         * 
         * @return builder
         * 
         */
        public Builder keys(Map<String,Object>... keys) {
            return keys(List.of(keys));
        }

        /**
         * @param latestVersion Latest key version available. This value is 1-indexed, so if `latest_version` is `1`, then the key&#39;s information can be referenced from `keys` by selecting element `0`
         * 
         * @return builder
         * 
         */
        public Builder latestVersion(@Nullable Output<Integer> latestVersion) {
            $.latestVersion = latestVersion;
            return this;
        }

        /**
         * @param latestVersion Latest key version available. This value is 1-indexed, so if `latest_version` is `1`, then the key&#39;s information can be referenced from `keys` by selecting element `0`
         * 
         * @return builder
         * 
         */
        public Builder latestVersion(Integer latestVersion) {
            return latestVersion(Output.of(latestVersion));
        }

        /**
         * @param minAvailableVersion Minimum key version available for use. If keys have been archived by increasing `min_decryption_version`, this attribute will reflect that change.
         * 
         * @return builder
         * 
         */
        public Builder minAvailableVersion(@Nullable Output<Integer> minAvailableVersion) {
            $.minAvailableVersion = minAvailableVersion;
            return this;
        }

        /**
         * @param minAvailableVersion Minimum key version available for use. If keys have been archived by increasing `min_decryption_version`, this attribute will reflect that change.
         * 
         * @return builder
         * 
         */
        public Builder minAvailableVersion(Integer minAvailableVersion) {
            return minAvailableVersion(Output.of(minAvailableVersion));
        }

        /**
         * @param minDecryptionVersion Minimum key version to use for decryption.
         * 
         * @return builder
         * 
         */
        public Builder minDecryptionVersion(@Nullable Output<Integer> minDecryptionVersion) {
            $.minDecryptionVersion = minDecryptionVersion;
            return this;
        }

        /**
         * @param minDecryptionVersion Minimum key version to use for decryption.
         * 
         * @return builder
         * 
         */
        public Builder minDecryptionVersion(Integer minDecryptionVersion) {
            return minDecryptionVersion(Output.of(minDecryptionVersion));
        }

        /**
         * @param minEncryptionVersion Minimum key version to use for encryption
         * 
         * @return builder
         * 
         */
        public Builder minEncryptionVersion(@Nullable Output<Integer> minEncryptionVersion) {
            $.minEncryptionVersion = minEncryptionVersion;
            return this;
        }

        /**
         * @param minEncryptionVersion Minimum key version to use for encryption
         * 
         * @return builder
         * 
         */
        public Builder minEncryptionVersion(Integer minEncryptionVersion) {
            return minEncryptionVersion(Output.of(minEncryptionVersion));
        }

        /**
         * @param name The name to identify this key within the backend. Must be unique within the backend.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name to identify this key within the backend. Must be unique within the backend.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace The namespace to provision the resource in.
         * The value should not contain leading or trailing forward slashes.
         * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
         * *Available only for Vault Enterprise*.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespace to provision the resource in.
         * The value should not contain leading or trailing forward slashes.
         * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
         * *Available only for Vault Enterprise*.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param supportsDecryption Whether or not the key supports decryption, based on key type.
         * 
         * @return builder
         * 
         */
        public Builder supportsDecryption(@Nullable Output<Boolean> supportsDecryption) {
            $.supportsDecryption = supportsDecryption;
            return this;
        }

        /**
         * @param supportsDecryption Whether or not the key supports decryption, based on key type.
         * 
         * @return builder
         * 
         */
        public Builder supportsDecryption(Boolean supportsDecryption) {
            return supportsDecryption(Output.of(supportsDecryption));
        }

        /**
         * @param supportsDerivation Whether or not the key supports derivation, based on key type.
         * 
         * @return builder
         * 
         */
        public Builder supportsDerivation(@Nullable Output<Boolean> supportsDerivation) {
            $.supportsDerivation = supportsDerivation;
            return this;
        }

        /**
         * @param supportsDerivation Whether or not the key supports derivation, based on key type.
         * 
         * @return builder
         * 
         */
        public Builder supportsDerivation(Boolean supportsDerivation) {
            return supportsDerivation(Output.of(supportsDerivation));
        }

        /**
         * @param supportsEncryption Whether or not the key supports encryption, based on key type.
         * 
         * @return builder
         * 
         */
        public Builder supportsEncryption(@Nullable Output<Boolean> supportsEncryption) {
            $.supportsEncryption = supportsEncryption;
            return this;
        }

        /**
         * @param supportsEncryption Whether or not the key supports encryption, based on key type.
         * 
         * @return builder
         * 
         */
        public Builder supportsEncryption(Boolean supportsEncryption) {
            return supportsEncryption(Output.of(supportsEncryption));
        }

        /**
         * @param supportsSigning Whether or not the key supports signing, based on key type.
         * 
         * @return builder
         * 
         */
        public Builder supportsSigning(@Nullable Output<Boolean> supportsSigning) {
            $.supportsSigning = supportsSigning;
            return this;
        }

        /**
         * @param supportsSigning Whether or not the key supports signing, based on key type.
         * 
         * @return builder
         * 
         */
        public Builder supportsSigning(Boolean supportsSigning) {
            return supportsSigning(Output.of(supportsSigning));
        }

        /**
         * @param type Specifies the type of key to create. The currently-supported types are: `aes128-gcm96`, `aes256-gcm96` (default), `chacha20-poly1305`, `ed25519`, `ecdsa-p256`, `ecdsa-p384`, `ecdsa-p521`, `rsa-2048`, `rsa-3072` and `rsa-4096`.
         * * Refer to the Vault documentation on transit key types for more information: [Key Types](https://www.vaultproject.io/docs/secrets/transit#key-types)
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of key to create. The currently-supported types are: `aes128-gcm96`, `aes256-gcm96` (default), `chacha20-poly1305`, `ed25519`, `ecdsa-p256`, `ecdsa-p384`, `ecdsa-p521`, `rsa-2048`, `rsa-3072` and `rsa-4096`.
         * * Refer to the Vault documentation on transit key types for more information: [Key Types](https://www.vaultproject.io/docs/secrets/transit#key-types)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SecretBackendKeyState build() {
            return $;
        }
    }

}
