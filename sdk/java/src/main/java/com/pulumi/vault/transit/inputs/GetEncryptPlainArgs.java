// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.transit.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEncryptPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEncryptPlainArgs Empty = new GetEncryptPlainArgs();

    /**
     * The path the transit secret backend is mounted at, with no leading or trailing `/`.
     * 
     */
    @Import(name="backend", required=true)
    private String backend;

    /**
     * @return The path the transit secret backend is mounted at, with no leading or trailing `/`.
     * 
     */
    public String backend() {
        return this.backend;
    }

    /**
     * Context for key derivation. This is required if key derivation is enabled for this key.
     * 
     */
    @Import(name="context")
    private @Nullable String context;

    /**
     * @return Context for key derivation. This is required if key derivation is enabled for this key.
     * 
     */
    public Optional<String> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * Specifies the name of the transit key to encrypt against.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return Specifies the name of the transit key to encrypt against.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * The version of the key to use for encryption. If not set, uses the latest version. Must be greater than or equal to the key&#39;s `min_encryption_version`, if set.
     * 
     */
    @Import(name="keyVersion")
    private @Nullable Integer keyVersion;

    /**
     * @return The version of the key to use for encryption. If not set, uses the latest version. Must be greater than or equal to the key&#39;s `min_encryption_version`, if set.
     * 
     */
    public Optional<Integer> keyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }

    @Import(name="namespace")
    private @Nullable String namespace;

    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * Plaintext to be encoded.
     * 
     */
    @Import(name="plaintext", required=true)
    private String plaintext;

    /**
     * @return Plaintext to be encoded.
     * 
     */
    public String plaintext() {
        return this.plaintext;
    }

    private GetEncryptPlainArgs() {}

    private GetEncryptPlainArgs(GetEncryptPlainArgs $) {
        this.backend = $.backend;
        this.context = $.context;
        this.key = $.key;
        this.keyVersion = $.keyVersion;
        this.namespace = $.namespace;
        this.plaintext = $.plaintext;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEncryptPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEncryptPlainArgs $;

        public Builder() {
            $ = new GetEncryptPlainArgs();
        }

        public Builder(GetEncryptPlainArgs defaults) {
            $ = new GetEncryptPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backend The path the transit secret backend is mounted at, with no leading or trailing `/`.
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param context Context for key derivation. This is required if key derivation is enabled for this key.
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable String context) {
            $.context = context;
            return this;
        }

        /**
         * @param key Specifies the name of the transit key to encrypt against.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param keyVersion The version of the key to use for encryption. If not set, uses the latest version. Must be greater than or equal to the key&#39;s `min_encryption_version`, if set.
         * 
         * @return builder
         * 
         */
        public Builder keyVersion(@Nullable Integer keyVersion) {
            $.keyVersion = keyVersion;
            return this;
        }

        public Builder namespace(@Nullable String namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param plaintext Plaintext to be encoded.
         * 
         * @return builder
         * 
         */
        public Builder plaintext(String plaintext) {
            $.plaintext = plaintext;
            return this;
        }

        public GetEncryptPlainArgs build() {
            $.backend = Objects.requireNonNull($.backend, "expected parameter 'backend' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.plaintext = Objects.requireNonNull($.plaintext, "expected parameter 'plaintext' to be non-null");
            return $;
        }
    }

}
