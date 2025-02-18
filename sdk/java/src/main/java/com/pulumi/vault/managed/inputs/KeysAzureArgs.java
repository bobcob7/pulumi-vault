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


public final class KeysAzureArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeysAzureArgs Empty = new KeysAzureArgs();

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
     * The client id for credentials to query the Azure APIs.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return The client id for credentials to query the Azure APIs.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * The client secret for credentials to query the Azure APIs.
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    /**
     * @return The client secret for credentials to query the Azure APIs.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    /**
     * The Azure Cloud environment API endpoints to use.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<String> environment;

    /**
     * @return The Azure Cloud environment API endpoints to use.
     * 
     */
    public Optional<Output<String>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * Supplies the size in bits of the key when using `CKM_RSA_PKCS_PSS`,
     * `CKM_RSA_PKCS_OAEP` or `CKM_RSA_PKCS` as a value for `mechanism`. Required if
     * `allow_generate_key` is `true`.
     * 
     */
    @Import(name="keyBits")
    private @Nullable Output<String> keyBits;

    /**
     * @return Supplies the size in bits of the key when using `CKM_RSA_PKCS_PSS`,
     * `CKM_RSA_PKCS_OAEP` or `CKM_RSA_PKCS` as a value for `mechanism`. Required if
     * `allow_generate_key` is `true`.
     * 
     */
    public Optional<Output<String>> keyBits() {
        return Optional.ofNullable(this.keyBits);
    }

    /**
     * The Key Vault key to use for encryption and decryption.
     * 
     */
    @Import(name="keyName", required=true)
    private Output<String> keyName;

    /**
     * @return The Key Vault key to use for encryption and decryption.
     * 
     */
    public Output<String> keyName() {
        return this.keyName;
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
     * The Azure Key Vault resource&#39;s DNS Suffix to connect to.
     * 
     */
    @Import(name="resource")
    private @Nullable Output<String> resource;

    /**
     * @return The Azure Key Vault resource&#39;s DNS Suffix to connect to.
     * 
     */
    public Optional<Output<String>> resource() {
        return Optional.ofNullable(this.resource);
    }

    /**
     * The tenant id for the Azure Active Directory organization.
     * 
     */
    @Import(name="tenantId", required=true)
    private Output<String> tenantId;

    /**
     * @return The tenant id for the Azure Active Directory organization.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    /**
     * The Key Vault vault to use for encryption and decryption.
     * 
     */
    @Import(name="vaultName", required=true)
    private Output<String> vaultName;

    /**
     * @return The Key Vault vault to use for encryption and decryption.
     * 
     */
    public Output<String> vaultName() {
        return this.vaultName;
    }

    private KeysAzureArgs() {}

    private KeysAzureArgs(KeysAzureArgs $) {
        this.allowGenerateKey = $.allowGenerateKey;
        this.allowReplaceKey = $.allowReplaceKey;
        this.allowStoreKey = $.allowStoreKey;
        this.anyMount = $.anyMount;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.environment = $.environment;
        this.keyBits = $.keyBits;
        this.keyName = $.keyName;
        this.keyType = $.keyType;
        this.name = $.name;
        this.resource = $.resource;
        this.tenantId = $.tenantId;
        this.uuid = $.uuid;
        this.vaultName = $.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeysAzureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeysAzureArgs $;

        public Builder() {
            $ = new KeysAzureArgs();
        }

        public Builder(KeysAzureArgs defaults) {
            $ = new KeysAzureArgs(Objects.requireNonNull(defaults));
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
         * @param clientId The client id for credentials to query the Azure APIs.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The client id for credentials to query the Azure APIs.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The client secret for credentials to query the Azure APIs.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The client secret for credentials to query the Azure APIs.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param environment The Azure Cloud environment API endpoints to use.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<String> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment The Azure Cloud environment API endpoints to use.
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param keyBits Supplies the size in bits of the key when using `CKM_RSA_PKCS_PSS`,
         * `CKM_RSA_PKCS_OAEP` or `CKM_RSA_PKCS` as a value for `mechanism`. Required if
         * `allow_generate_key` is `true`.
         * 
         * @return builder
         * 
         */
        public Builder keyBits(@Nullable Output<String> keyBits) {
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
         * @param keyName The Key Vault key to use for encryption and decryption.
         * 
         * @return builder
         * 
         */
        public Builder keyName(Output<String> keyName) {
            $.keyName = keyName;
            return this;
        }

        /**
         * @param keyName The Key Vault key to use for encryption and decryption.
         * 
         * @return builder
         * 
         */
        public Builder keyName(String keyName) {
            return keyName(Output.of(keyName));
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
         * @param resource The Azure Key Vault resource&#39;s DNS Suffix to connect to.
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource The Azure Key Vault resource&#39;s DNS Suffix to connect to.
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param tenantId The tenant id for the Azure Active Directory organization.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The tenant id for the Azure Active Directory organization.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        /**
         * @param vaultName The Key Vault vault to use for encryption and decryption.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(Output<String> vaultName) {
            $.vaultName = vaultName;
            return this;
        }

        /**
         * @param vaultName The Key Vault vault to use for encryption and decryption.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(String vaultName) {
            return vaultName(Output.of(vaultName));
        }

        public KeysAzureArgs build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            $.keyName = Objects.requireNonNull($.keyName, "expected parameter 'keyName' to be non-null");
            $.keyType = Objects.requireNonNull($.keyType, "expected parameter 'keyType' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            $.vaultName = Objects.requireNonNull($.vaultName, "expected parameter 'vaultName' to be non-null");
            return $;
        }
    }

}
