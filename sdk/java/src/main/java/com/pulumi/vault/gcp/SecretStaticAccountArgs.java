// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.gcp;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.vault.gcp.inputs.SecretStaticAccountBindingArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretStaticAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretStaticAccountArgs Empty = new SecretStaticAccountArgs();

    /**
     * Path where the GCP Secrets Engine is mounted
     * 
     */
    @Import(name="backend", required=true)
    private Output<String> backend;

    /**
     * @return Path where the GCP Secrets Engine is mounted
     * 
     */
    public Output<String> backend() {
        return this.backend;
    }

    /**
     * Bindings to create for this static account. This can be specified multiple times for multiple bindings. Structure is documented below.
     * 
     */
    @Import(name="bindings")
    private @Nullable Output<List<SecretStaticAccountBindingArgs>> bindings;

    /**
     * @return Bindings to create for this static account. This can be specified multiple times for multiple bindings. Structure is documented below.
     * 
     */
    public Optional<Output<List<SecretStaticAccountBindingArgs>>> bindings() {
        return Optional.ofNullable(this.bindings);
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
     * Type of secret generated for this static account. Accepted values: `access_token`, `service_account_key`. Defaults to `access_token`.
     * 
     */
    @Import(name="secretType")
    private @Nullable Output<String> secretType;

    /**
     * @return Type of secret generated for this static account. Accepted values: `access_token`, `service_account_key`. Defaults to `access_token`.
     * 
     */
    public Optional<Output<String>> secretType() {
        return Optional.ofNullable(this.secretType);
    }

    /**
     * Email of the GCP service account to manage.
     * 
     */
    @Import(name="serviceAccountEmail", required=true)
    private Output<String> serviceAccountEmail;

    /**
     * @return Email of the GCP service account to manage.
     * 
     */
    public Output<String> serviceAccountEmail() {
        return this.serviceAccountEmail;
    }

    /**
     * Name of the Static Account to create
     * 
     */
    @Import(name="staticAccount", required=true)
    private Output<String> staticAccount;

    /**
     * @return Name of the Static Account to create
     * 
     */
    public Output<String> staticAccount() {
        return this.staticAccount;
    }

    /**
     * List of OAuth scopes to assign to `access_token` secrets generated under this static account (`access_token` static accounts only).
     * 
     */
    @Import(name="tokenScopes")
    private @Nullable Output<List<String>> tokenScopes;

    /**
     * @return List of OAuth scopes to assign to `access_token` secrets generated under this static account (`access_token` static accounts only).
     * 
     */
    public Optional<Output<List<String>>> tokenScopes() {
        return Optional.ofNullable(this.tokenScopes);
    }

    private SecretStaticAccountArgs() {}

    private SecretStaticAccountArgs(SecretStaticAccountArgs $) {
        this.backend = $.backend;
        this.bindings = $.bindings;
        this.namespace = $.namespace;
        this.secretType = $.secretType;
        this.serviceAccountEmail = $.serviceAccountEmail;
        this.staticAccount = $.staticAccount;
        this.tokenScopes = $.tokenScopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretStaticAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretStaticAccountArgs $;

        public Builder() {
            $ = new SecretStaticAccountArgs();
        }

        public Builder(SecretStaticAccountArgs defaults) {
            $ = new SecretStaticAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backend Path where the GCP Secrets Engine is mounted
         * 
         * @return builder
         * 
         */
        public Builder backend(Output<String> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend Path where the GCP Secrets Engine is mounted
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param bindings Bindings to create for this static account. This can be specified multiple times for multiple bindings. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bindings(@Nullable Output<List<SecretStaticAccountBindingArgs>> bindings) {
            $.bindings = bindings;
            return this;
        }

        /**
         * @param bindings Bindings to create for this static account. This can be specified multiple times for multiple bindings. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bindings(List<SecretStaticAccountBindingArgs> bindings) {
            return bindings(Output.of(bindings));
        }

        /**
         * @param bindings Bindings to create for this static account. This can be specified multiple times for multiple bindings. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bindings(SecretStaticAccountBindingArgs... bindings) {
            return bindings(List.of(bindings));
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
         * @param secretType Type of secret generated for this static account. Accepted values: `access_token`, `service_account_key`. Defaults to `access_token`.
         * 
         * @return builder
         * 
         */
        public Builder secretType(@Nullable Output<String> secretType) {
            $.secretType = secretType;
            return this;
        }

        /**
         * @param secretType Type of secret generated for this static account. Accepted values: `access_token`, `service_account_key`. Defaults to `access_token`.
         * 
         * @return builder
         * 
         */
        public Builder secretType(String secretType) {
            return secretType(Output.of(secretType));
        }

        /**
         * @param serviceAccountEmail Email of the GCP service account to manage.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(Output<String> serviceAccountEmail) {
            $.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        /**
         * @param serviceAccountEmail Email of the GCP service account to manage.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            return serviceAccountEmail(Output.of(serviceAccountEmail));
        }

        /**
         * @param staticAccount Name of the Static Account to create
         * 
         * @return builder
         * 
         */
        public Builder staticAccount(Output<String> staticAccount) {
            $.staticAccount = staticAccount;
            return this;
        }

        /**
         * @param staticAccount Name of the Static Account to create
         * 
         * @return builder
         * 
         */
        public Builder staticAccount(String staticAccount) {
            return staticAccount(Output.of(staticAccount));
        }

        /**
         * @param tokenScopes List of OAuth scopes to assign to `access_token` secrets generated under this static account (`access_token` static accounts only).
         * 
         * @return builder
         * 
         */
        public Builder tokenScopes(@Nullable Output<List<String>> tokenScopes) {
            $.tokenScopes = tokenScopes;
            return this;
        }

        /**
         * @param tokenScopes List of OAuth scopes to assign to `access_token` secrets generated under this static account (`access_token` static accounts only).
         * 
         * @return builder
         * 
         */
        public Builder tokenScopes(List<String> tokenScopes) {
            return tokenScopes(Output.of(tokenScopes));
        }

        /**
         * @param tokenScopes List of OAuth scopes to assign to `access_token` secrets generated under this static account (`access_token` static accounts only).
         * 
         * @return builder
         * 
         */
        public Builder tokenScopes(String... tokenScopes) {
            return tokenScopes(List.of(tokenScopes));
        }

        public SecretStaticAccountArgs build() {
            $.backend = Objects.requireNonNull($.backend, "expected parameter 'backend' to be non-null");
            $.serviceAccountEmail = Objects.requireNonNull($.serviceAccountEmail, "expected parameter 'serviceAccountEmail' to be non-null");
            $.staticAccount = Objects.requireNonNull($.staticAccount, "expected parameter 'staticAccount' to be non-null");
            return $;
        }
    }

}
