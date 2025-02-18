// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.managed.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KeysAzure {
    /**
     * @return If no existing key can be found in
     * the referenced backend, instructs Vault to generate a key within the backend.
     * 
     */
    private @Nullable Boolean allowGenerateKey;
    /**
     * @return Controls the ability for Vault to replace through
     * generation or importing a key into the configured backend even
     * if a key is present, if set to `false` those operations are forbidden
     * if a key exists.
     * 
     */
    private @Nullable Boolean allowReplaceKey;
    /**
     * @return Controls the ability for Vault to import a key to the
     * configured backend, if `false`, those operations will be forbidden.
     * 
     */
    private @Nullable Boolean allowStoreKey;
    /**
     * @return If `true`, allows usage from any mount point within the
     * namespace.
     * 
     */
    private @Nullable Boolean anyMount;
    /**
     * @return The client id for credentials to query the Azure APIs.
     * 
     */
    private String clientId;
    /**
     * @return The client secret for credentials to query the Azure APIs.
     * 
     */
    private String clientSecret;
    /**
     * @return The Azure Cloud environment API endpoints to use.
     * 
     */
    private @Nullable String environment;
    /**
     * @return Supplies the size in bits of the key when using `CKM_RSA_PKCS_PSS`,
     * `CKM_RSA_PKCS_OAEP` or `CKM_RSA_PKCS` as a value for `mechanism`. Required if
     * `allow_generate_key` is `true`.
     * 
     */
    private @Nullable String keyBits;
    /**
     * @return The Key Vault key to use for encryption and decryption.
     * 
     */
    private String keyName;
    /**
     * @return The type of key to use.
     * 
     */
    private String keyType;
    /**
     * @return A unique lowercase name that serves as identifying the key.
     * 
     */
    private String name;
    /**
     * @return The Azure Key Vault resource&#39;s DNS Suffix to connect to.
     * 
     */
    private @Nullable String resource;
    /**
     * @return The tenant id for the Azure Active Directory organization.
     * 
     */
    private String tenantId;
    private @Nullable String uuid;
    /**
     * @return The Key Vault vault to use for encryption and decryption.
     * 
     */
    private String vaultName;

    private KeysAzure() {}
    /**
     * @return If no existing key can be found in
     * the referenced backend, instructs Vault to generate a key within the backend.
     * 
     */
    public Optional<Boolean> allowGenerateKey() {
        return Optional.ofNullable(this.allowGenerateKey);
    }
    /**
     * @return Controls the ability for Vault to replace through
     * generation or importing a key into the configured backend even
     * if a key is present, if set to `false` those operations are forbidden
     * if a key exists.
     * 
     */
    public Optional<Boolean> allowReplaceKey() {
        return Optional.ofNullable(this.allowReplaceKey);
    }
    /**
     * @return Controls the ability for Vault to import a key to the
     * configured backend, if `false`, those operations will be forbidden.
     * 
     */
    public Optional<Boolean> allowStoreKey() {
        return Optional.ofNullable(this.allowStoreKey);
    }
    /**
     * @return If `true`, allows usage from any mount point within the
     * namespace.
     * 
     */
    public Optional<Boolean> anyMount() {
        return Optional.ofNullable(this.anyMount);
    }
    /**
     * @return The client id for credentials to query the Azure APIs.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The client secret for credentials to query the Azure APIs.
     * 
     */
    public String clientSecret() {
        return this.clientSecret;
    }
    /**
     * @return The Azure Cloud environment API endpoints to use.
     * 
     */
    public Optional<String> environment() {
        return Optional.ofNullable(this.environment);
    }
    /**
     * @return Supplies the size in bits of the key when using `CKM_RSA_PKCS_PSS`,
     * `CKM_RSA_PKCS_OAEP` or `CKM_RSA_PKCS` as a value for `mechanism`. Required if
     * `allow_generate_key` is `true`.
     * 
     */
    public Optional<String> keyBits() {
        return Optional.ofNullable(this.keyBits);
    }
    /**
     * @return The Key Vault key to use for encryption and decryption.
     * 
     */
    public String keyName() {
        return this.keyName;
    }
    /**
     * @return The type of key to use.
     * 
     */
    public String keyType() {
        return this.keyType;
    }
    /**
     * @return A unique lowercase name that serves as identifying the key.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Azure Key Vault resource&#39;s DNS Suffix to connect to.
     * 
     */
    public Optional<String> resource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * @return The tenant id for the Azure Active Directory organization.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    /**
     * @return The Key Vault vault to use for encryption and decryption.
     * 
     */
    public String vaultName() {
        return this.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeysAzure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowGenerateKey;
        private @Nullable Boolean allowReplaceKey;
        private @Nullable Boolean allowStoreKey;
        private @Nullable Boolean anyMount;
        private String clientId;
        private String clientSecret;
        private @Nullable String environment;
        private @Nullable String keyBits;
        private String keyName;
        private String keyType;
        private String name;
        private @Nullable String resource;
        private String tenantId;
        private @Nullable String uuid;
        private String vaultName;
        public Builder() {}
        public Builder(KeysAzure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowGenerateKey = defaults.allowGenerateKey;
    	      this.allowReplaceKey = defaults.allowReplaceKey;
    	      this.allowStoreKey = defaults.allowStoreKey;
    	      this.anyMount = defaults.anyMount;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.environment = defaults.environment;
    	      this.keyBits = defaults.keyBits;
    	      this.keyName = defaults.keyName;
    	      this.keyType = defaults.keyType;
    	      this.name = defaults.name;
    	      this.resource = defaults.resource;
    	      this.tenantId = defaults.tenantId;
    	      this.uuid = defaults.uuid;
    	      this.vaultName = defaults.vaultName;
        }

        @CustomType.Setter
        public Builder allowGenerateKey(@Nullable Boolean allowGenerateKey) {
            this.allowGenerateKey = allowGenerateKey;
            return this;
        }
        @CustomType.Setter
        public Builder allowReplaceKey(@Nullable Boolean allowReplaceKey) {
            this.allowReplaceKey = allowReplaceKey;
            return this;
        }
        @CustomType.Setter
        public Builder allowStoreKey(@Nullable Boolean allowStoreKey) {
            this.allowStoreKey = allowStoreKey;
            return this;
        }
        @CustomType.Setter
        public Builder anyMount(@Nullable Boolean anyMount) {
            this.anyMount = anyMount;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        @CustomType.Setter
        public Builder environment(@Nullable String environment) {
            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder keyBits(@Nullable String keyBits) {
            this.keyBits = keyBits;
            return this;
        }
        @CustomType.Setter
        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }
        @CustomType.Setter
        public Builder keyType(String keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder resource(@Nullable String resource) {
            this.resource = resource;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder vaultName(String vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }
        public KeysAzure build() {
            final var o = new KeysAzure();
            o.allowGenerateKey = allowGenerateKey;
            o.allowReplaceKey = allowReplaceKey;
            o.allowStoreKey = allowStoreKey;
            o.anyMount = anyMount;
            o.clientId = clientId;
            o.clientSecret = clientSecret;
            o.environment = environment;
            o.keyBits = keyBits;
            o.keyName = keyName;
            o.keyType = keyType;
            o.name = name;
            o.resource = resource;
            o.tenantId = tenantId;
            o.uuid = uuid;
            o.vaultName = vaultName;
            return o;
        }
    }
}
