// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.transit.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEncryptResult {
    private String backend;
    /**
     * @return Encrypted ciphertext returned from Vault
     * 
     */
    private String ciphertext;
    private @Nullable String context;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String key;
    private @Nullable Integer keyVersion;
    private @Nullable String namespace;
    private String plaintext;

    private GetEncryptResult() {}
    public String backend() {
        return this.backend;
    }
    /**
     * @return Encrypted ciphertext returned from Vault
     * 
     */
    public String ciphertext() {
        return this.ciphertext;
    }
    public Optional<String> context() {
        return Optional.ofNullable(this.context);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String key() {
        return this.key;
    }
    public Optional<Integer> keyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    public String plaintext() {
        return this.plaintext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEncryptResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String backend;
        private String ciphertext;
        private @Nullable String context;
        private String id;
        private String key;
        private @Nullable Integer keyVersion;
        private @Nullable String namespace;
        private String plaintext;
        public Builder() {}
        public Builder(GetEncryptResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backend = defaults.backend;
    	      this.ciphertext = defaults.ciphertext;
    	      this.context = defaults.context;
    	      this.id = defaults.id;
    	      this.key = defaults.key;
    	      this.keyVersion = defaults.keyVersion;
    	      this.namespace = defaults.namespace;
    	      this.plaintext = defaults.plaintext;
        }

        @CustomType.Setter
        public Builder backend(String backend) {
            this.backend = Objects.requireNonNull(backend);
            return this;
        }
        @CustomType.Setter
        public Builder ciphertext(String ciphertext) {
            this.ciphertext = Objects.requireNonNull(ciphertext);
            return this;
        }
        @CustomType.Setter
        public Builder context(@Nullable String context) {
            this.context = context;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder keyVersion(@Nullable Integer keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder plaintext(String plaintext) {
            this.plaintext = Objects.requireNonNull(plaintext);
            return this;
        }
        public GetEncryptResult build() {
            final var o = new GetEncryptResult();
            o.backend = backend;
            o.ciphertext = ciphertext;
            o.context = context;
            o.id = id;
            o.key = key;
            o.keyVersion = keyVersion;
            o.namespace = namespace;
            o.plaintext = plaintext;
            return o;
        }
    }
}
