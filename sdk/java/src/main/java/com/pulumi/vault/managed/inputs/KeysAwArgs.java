// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.managed.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeysAwArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeysAwArgs Empty = new KeysAwArgs();

    /**
     * The AWS access key to use.
     * 
     */
    @Import(name="accessKey", required=true)
    private Output<String> accessKey;

    /**
     * @return The AWS access key to use.
     * 
     */
    public Output<String> accessKey() {
        return this.accessKey;
    }

    /**
     * If no existing key can be found in
     * the referenced backend, instructs Vault to generate a key within the backend.
     * 
     */
    @Import(name="allowGenerateKey")
    private @Nullable Output<Boolean> allowGenerateKey;

    /**
     * @return If no existing key can be found in
     * the referenced backend, instructs Vault to generate a key within the backend.
     * 
     */
    public Optional<Output<Boolean>> allowGenerateKey() {
        return Optional.ofNullable(this.allowGenerateKey);
    }

    /**
     * Controls the ability for Vault to replace through
     * generation or importing a key into the configured backend even
     * if a key is present, if set to `false` those operations are forbidden
     * if a key exists.
     * 
     */
    @Import(name="allowReplaceKey")
    private @Nullable Output<Boolean> allowReplaceKey;

    /**
     * @return Controls the ability for Vault to replace through
     * generation or importing a key into the configured backend even
     * if a key is present, if set to `false` those operations are forbidden
     * if a key exists.
     * 
     */
    public Optional<Output<Boolean>> allowReplaceKey() {
        return Optional.ofNullable(this.allowReplaceKey);
    }

    /**
     * Controls the ability for Vault to import a key to the
     * configured backend, if `false`, those operations will be forbidden.
     * 
     */
    @Import(name="allowStoreKey")
    private @Nullable Output<Boolean> allowStoreKey;

    /**
     * @return Controls the ability for Vault to import a key to the
     * configured backend, if `false`, those operations will be forbidden.
     * 
     */
    public Optional<Output<Boolean>> allowStoreKey() {
        return Optional.ofNullable(this.allowStoreKey);
    }

    /**
     * If `true`, allows usage from any mount point within the
     * namespace.
     * 
     */
    @Import(name="anyMount")
    private @Nullable Output<Boolean> anyMount;

    /**
     * @return If `true`, allows usage from any mount point within the
     * namespace.
     * 
     */
    public Optional<Output<Boolean>> anyMount() {
        return Optional.ofNullable(this.anyMount);
    }

    /**
     * Supplies the curve value when using the `CKM_ECDSA` mechanism.
     * Required if `allow_generate_key` is `true`.
     * 
     */
    @Import(name="curve")
    private @Nullable Output<String> curve;

    /**
     * @return Supplies the curve value when using the `CKM_ECDSA` mechanism.
     * Required if `allow_generate_key` is `true`.
     * 
     */
    public Optional<Output<String>> curve() {
        return Optional.ofNullable(this.curve);
    }

    /**
     * Used to specify a custom AWS endpoint.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return Used to specify a custom AWS endpoint.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * Supplies the size in bits of the key when using `CKM_RSA_PKCS_PSS`,
     * `CKM_RSA_PKCS_OAEP` or `CKM_RSA_PKCS` as a value for `mechanism`. Required if
     * `allow_generate_key` is `true`.
     * 
     */
    @Import(name="keyBits", required=true)
    private Output<String> keyBits;

    /**
     * @return Supplies the size in bits of the key when using `CKM_RSA_PKCS_PSS`,
     * `CKM_RSA_PKCS_OAEP` or `CKM_RSA_PKCS` as a value for `mechanism`. Required if
     * `allow_generate_key` is `true`.
     * 
     */
    public Output<String> keyBits() {
        return this.keyBits;
    }

    /**
     * The type of key to use.
     * 
     */
    @Import(name="keyType", required=true)
    private Output<String> keyType;

    /**
     * @return The type of key to use.
     * 
     */
    public Output<String> keyType() {
        return this.keyType;
    }

    /**
     * An identifier for the key.
     * 
     */
    @Import(name="kmsKey", required=true)
    private Output<String> kmsKey;

    /**
     * @return An identifier for the key.
     * 
     */
    public Output<String> kmsKey() {
        return this.kmsKey;
    }

    /**
     * A unique lowercase name that serves as identifying the key.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A unique lowercase name that serves as identifying the key.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The AWS region where the keys are stored (or will be stored).
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The AWS region where the keys are stored (or will be stored).
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The AWS access key to use.
     * 
     */
    @Import(name="secretKey", required=true)
    private Output<String> secretKey;

    /**
     * @return The AWS access key to use.
     * 
     */
    public Output<String> secretKey() {
        return this.secretKey;
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private KeysAwArgs() {}

    private KeysAwArgs(KeysAwArgs $) {
        this.accessKey = $.accessKey;
        this.allowGenerateKey = $.allowGenerateKey;
        this.allowReplaceKey = $.allowReplaceKey;
        this.allowStoreKey = $.allowStoreKey;
        this.anyMount = $.anyMount;
        this.curve = $.curve;
        this.endpoint = $.endpoint;
        this.keyBits = $.keyBits;
        this.keyType = $.keyType;
        this.kmsKey = $.kmsKey;
        this.name = $.name;
        this.region = $.region;
        this.secretKey = $.secretKey;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeysAwArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeysAwArgs $;

        public Builder() {
            $ = new KeysAwArgs();
        }

        public Builder(KeysAwArgs defaults) {
            $ = new KeysAwArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey The AWS access key to use.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey The AWS access key to use.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param allowGenerateKey If no existing key can be found in
         * the referenced backend, instructs Vault to generate a key within the backend.
         * 
         * @return builder
         * 
         */
        public Builder allowGenerateKey(@Nullable Output<Boolean> allowGenerateKey) {
            $.allowGenerateKey = allowGenerateKey;
            return this;
        }

        /**
         * @param allowGenerateKey If no existing key can be found in
         * the referenced backend, instructs Vault to generate a key within the backend.
         * 
         * @return builder
         * 
         */
        public Builder allowGenerateKey(Boolean allowGenerateKey) {
            return allowGenerateKey(Output.of(allowGenerateKey));
        }

        /**
         * @param allowReplaceKey Controls the ability for Vault to replace through
         * generation or importing a key into the configured backend even
         * if a key is present, if set to `false` those operations are forbidden
         * if a key exists.
         * 
         * @return builder
         * 
         */
        public Builder allowReplaceKey(@Nullable Output<Boolean> allowReplaceKey) {
            $.allowReplaceKey = allowReplaceKey;
            return this;
        }

        /**
         * @param allowReplaceKey Controls the ability for Vault to replace through
         * generation or importing a key into the configured backend even
         * if a key is present, if set to `false` those operations are forbidden
         * if a key exists.
         * 
         * @return builder
         * 
         */
        public Builder allowReplaceKey(Boolean allowReplaceKey) {
            return allowReplaceKey(Output.of(allowReplaceKey));
        }

        /**
         * @param allowStoreKey Controls the ability for Vault to import a key to the
         * configured backend, if `false`, those operations will be forbidden.
         * 
         * @return builder
         * 
         */
        public Builder allowStoreKey(@Nullable Output<Boolean> allowStoreKey) {
            $.allowStoreKey = allowStoreKey;
            return this;
        }

        /**
         * @param allowStoreKey Controls the ability for Vault to import a key to the
         * configured backend, if `false`, those operations will be forbidden.
         * 
         * @return builder
         * 
         */
        public Builder allowStoreKey(Boolean allowStoreKey) {
            return allowStoreKey(Output.of(allowStoreKey));
        }

        /**
         * @param anyMount If `true`, allows usage from any mount point within the
         * namespace.
         * 
         * @return builder
         * 
         */
        public Builder anyMount(@Nullable Output<Boolean> anyMount) {
            $.anyMount = anyMount;
            return this;
        }

        /**
         * @param anyMount If `true`, allows usage from any mount point within the
         * namespace.
         * 
         * @return builder
         * 
         */
        public Builder anyMount(Boolean anyMount) {
            return anyMount(Output.of(anyMount));
        }

        /**
         * @param curve Supplies the curve value when using the `CKM_ECDSA` mechanism.
         * Required if `allow_generate_key` is `true`.
         * 
         * @return builder
         * 
         */
        public Builder curve(@Nullable Output<String> curve) {
            $.curve = curve;
            return this;
        }

        /**
         * @param curve Supplies the curve value when using the `CKM_ECDSA` mechanism.
         * Required if `allow_generate_key` is `true`.
         * 
         * @return builder
         * 
         */
        public Builder curve(String curve) {
            return curve(Output.of(curve));
        }

        /**
         * @param endpoint Used to specify a custom AWS endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint Used to specify a custom AWS endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param keyBits Supplies the size in bits of the key when using `CKM_RSA_PKCS_PSS`,
         * `CKM_RSA_PKCS_OAEP` or `CKM_RSA_PKCS` as a value for `mechanism`. Required if
         * `allow_generate_key` is `true`.
         * 
         * @return builder
         * 
         */
        public Builder keyBits(Output<String> keyBits) {
            $.keyBits = keyBits;
            return this;
        }

        /**
         * @param keyBits Supplies the size in bits of the key when using `CKM_RSA_PKCS_PSS`,
         * `CKM_RSA_PKCS_OAEP` or `CKM_RSA_PKCS` as a value for `mechanism`. Required if
         * `allow_generate_key` is `true`.
         * 
         * @return builder
         * 
         */
        public Builder keyBits(String keyBits) {
            return keyBits(Output.of(keyBits));
        }

        /**
         * @param keyType The type of key to use.
         * 
         * @return builder
         * 
         */
        public Builder keyType(Output<String> keyType) {
            $.keyType = keyType;
            return this;
        }

        /**
         * @param keyType The type of key to use.
         * 
         * @return builder
         * 
         */
        public Builder keyType(String keyType) {
            return keyType(Output.of(keyType));
        }

        /**
         * @param kmsKey An identifier for the key.
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(Output<String> kmsKey) {
            $.kmsKey = kmsKey;
            return this;
        }

        /**
         * @param kmsKey An identifier for the key.
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(String kmsKey) {
            return kmsKey(Output.of(kmsKey));
        }

        /**
         * @param name A unique lowercase name that serves as identifying the key.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique lowercase name that serves as identifying the key.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param region The AWS region where the keys are stored (or will be stored).
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The AWS region where the keys are stored (or will be stored).
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param secretKey The AWS access key to use.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey The AWS access key to use.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public KeysAwArgs build() {
            $.accessKey = Objects.requireNonNull($.accessKey, "expected parameter 'accessKey' to be non-null");
            $.keyBits = Objects.requireNonNull($.keyBits, "expected parameter 'keyBits' to be non-null");
            $.keyType = Objects.requireNonNull($.keyType, "expected parameter 'keyType' to be non-null");
            $.kmsKey = Objects.requireNonNull($.kmsKey, "expected parameter 'kmsKey' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.secretKey = Objects.requireNonNull($.secretKey, "expected parameter 'secretKey' to be non-null");
            return $;
        }
    }

}
