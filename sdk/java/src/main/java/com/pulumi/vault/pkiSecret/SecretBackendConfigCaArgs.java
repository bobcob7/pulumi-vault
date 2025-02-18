// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.pkiSecret;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretBackendConfigCaArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretBackendConfigCaArgs Empty = new SecretBackendConfigCaArgs();

    /**
     * The PKI secret backend the resource belongs to.
     * 
     */
    @Import(name="backend", required=true)
    private Output<String> backend;

    /**
     * @return The PKI secret backend the resource belongs to.
     * 
     */
    public Output<String> backend() {
        return this.backend;
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
     * The key and certificate PEM bundle
     * 
     */
    @Import(name="pemBundle", required=true)
    private Output<String> pemBundle;

    /**
     * @return The key and certificate PEM bundle
     * 
     */
    public Output<String> pemBundle() {
        return this.pemBundle;
    }

    private SecretBackendConfigCaArgs() {}

    private SecretBackendConfigCaArgs(SecretBackendConfigCaArgs $) {
        this.backend = $.backend;
        this.namespace = $.namespace;
        this.pemBundle = $.pemBundle;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretBackendConfigCaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretBackendConfigCaArgs $;

        public Builder() {
            $ = new SecretBackendConfigCaArgs();
        }

        public Builder(SecretBackendConfigCaArgs defaults) {
            $ = new SecretBackendConfigCaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backend The PKI secret backend the resource belongs to.
         * 
         * @return builder
         * 
         */
        public Builder backend(Output<String> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend The PKI secret backend the resource belongs to.
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            return backend(Output.of(backend));
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
         * @param pemBundle The key and certificate PEM bundle
         * 
         * @return builder
         * 
         */
        public Builder pemBundle(Output<String> pemBundle) {
            $.pemBundle = pemBundle;
            return this;
        }

        /**
         * @param pemBundle The key and certificate PEM bundle
         * 
         * @return builder
         * 
         */
        public Builder pemBundle(String pemBundle) {
            return pemBundle(Output.of(pemBundle));
        }

        public SecretBackendConfigCaArgs build() {
            $.backend = Objects.requireNonNull($.backend, "expected parameter 'backend' to be non-null");
            $.pemBundle = Objects.requireNonNull($.pemBundle, "expected parameter 'pemBundle' to be non-null");
            return $;
        }
    }

}
