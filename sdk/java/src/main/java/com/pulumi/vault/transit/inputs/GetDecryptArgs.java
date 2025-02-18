// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.transit.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDecryptArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDecryptArgs Empty = new GetDecryptArgs();

    /**
     * The path the transit secret backend is mounted at, with no leading or trailing `/`.
     * 
     */
    @Import(name="backend", required=true)
    private Output<String> backend;

    /**
     * @return The path the transit secret backend is mounted at, with no leading or trailing `/`.
     * 
     */
    public Output<String> backend() {
        return this.backend;
    }

    /**
     * Ciphertext to be decoded.
     * 
     */
    @Import(name="ciphertext", required=true)
    private Output<String> ciphertext;

    /**
     * @return Ciphertext to be decoded.
     * 
     */
    public Output<String> ciphertext() {
        return this.ciphertext;
    }

    /**
     * Context for key derivation. This is required if key derivation is enabled for this key.
     * 
     */
    @Import(name="context")
    private @Nullable Output<String> context;

    /**
     * @return Context for key derivation. This is required if key derivation is enabled for this key.
     * 
     */
    public Optional<Output<String>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * Specifies the name of the transit key to decrypt against.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Specifies the name of the transit key to decrypt against.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    private GetDecryptArgs() {}

    private GetDecryptArgs(GetDecryptArgs $) {
        this.backend = $.backend;
        this.ciphertext = $.ciphertext;
        this.context = $.context;
        this.key = $.key;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDecryptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDecryptArgs $;

        public Builder() {
            $ = new GetDecryptArgs();
        }

        public Builder(GetDecryptArgs defaults) {
            $ = new GetDecryptArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backend The path the transit secret backend is mounted at, with no leading or trailing `/`.
         * 
         * @return builder
         * 
         */
        public Builder backend(Output<String> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend The path the transit secret backend is mounted at, with no leading or trailing `/`.
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param ciphertext Ciphertext to be decoded.
         * 
         * @return builder
         * 
         */
        public Builder ciphertext(Output<String> ciphertext) {
            $.ciphertext = ciphertext;
            return this;
        }

        /**
         * @param ciphertext Ciphertext to be decoded.
         * 
         * @return builder
         * 
         */
        public Builder ciphertext(String ciphertext) {
            return ciphertext(Output.of(ciphertext));
        }

        /**
         * @param context Context for key derivation. This is required if key derivation is enabled for this key.
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable Output<String> context) {
            $.context = context;
            return this;
        }

        /**
         * @param context Context for key derivation. This is required if key derivation is enabled for this key.
         * 
         * @return builder
         * 
         */
        public Builder context(String context) {
            return context(Output.of(context));
        }

        /**
         * @param key Specifies the name of the transit key to decrypt against.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Specifies the name of the transit key to decrypt against.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public GetDecryptArgs build() {
            $.backend = Objects.requireNonNull($.backend, "expected parameter 'backend' to be non-null");
            $.ciphertext = Objects.requireNonNull($.ciphertext, "expected parameter 'ciphertext' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
