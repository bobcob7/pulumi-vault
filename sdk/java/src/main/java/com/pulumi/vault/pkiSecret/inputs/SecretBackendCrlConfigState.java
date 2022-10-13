// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.pkiSecret.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretBackendCrlConfigState extends com.pulumi.resources.ResourceArgs {

    public static final SecretBackendCrlConfigState Empty = new SecretBackendCrlConfigState();

    /**
     * The path the PKI secret backend is mounted at, with no leading or trailing `/`s.
     * 
     */
    @Import(name="backend")
    private @Nullable Output<String> backend;

    /**
     * @return The path the PKI secret backend is mounted at, with no leading or trailing `/`s.
     * 
     */
    public Optional<Output<String>> backend() {
        return Optional.ofNullable(this.backend);
    }

    /**
     * Disables or enables CRL building.
     * 
     */
    @Import(name="disable")
    private @Nullable Output<Boolean> disable;

    /**
     * @return Disables or enables CRL building.
     * 
     */
    public Optional<Output<Boolean>> disable() {
        return Optional.ofNullable(this.disable);
    }

    /**
     * Specifies the time until expiration.
     * 
     */
    @Import(name="expiry")
    private @Nullable Output<String> expiry;

    /**
     * @return Specifies the time until expiration.
     * 
     */
    public Optional<Output<String>> expiry() {
        return Optional.ofNullable(this.expiry);
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

    private SecretBackendCrlConfigState() {}

    private SecretBackendCrlConfigState(SecretBackendCrlConfigState $) {
        this.backend = $.backend;
        this.disable = $.disable;
        this.expiry = $.expiry;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretBackendCrlConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretBackendCrlConfigState $;

        public Builder() {
            $ = new SecretBackendCrlConfigState();
        }

        public Builder(SecretBackendCrlConfigState defaults) {
            $ = new SecretBackendCrlConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backend The path the PKI secret backend is mounted at, with no leading or trailing `/`s.
         * 
         * @return builder
         * 
         */
        public Builder backend(@Nullable Output<String> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend The path the PKI secret backend is mounted at, with no leading or trailing `/`s.
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param disable Disables or enables CRL building.
         * 
         * @return builder
         * 
         */
        public Builder disable(@Nullable Output<Boolean> disable) {
            $.disable = disable;
            return this;
        }

        /**
         * @param disable Disables or enables CRL building.
         * 
         * @return builder
         * 
         */
        public Builder disable(Boolean disable) {
            return disable(Output.of(disable));
        }

        /**
         * @param expiry Specifies the time until expiration.
         * 
         * @return builder
         * 
         */
        public Builder expiry(@Nullable Output<String> expiry) {
            $.expiry = expiry;
            return this;
        }

        /**
         * @param expiry Specifies the time until expiration.
         * 
         * @return builder
         * 
         */
        public Builder expiry(String expiry) {
            return expiry(Output.of(expiry));
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

        public SecretBackendCrlConfigState build() {
            return $;
        }
    }

}
