// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccessCredentialsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessCredentialsArgs Empty = new GetAccessCredentialsArgs();

    /**
     * The path to the Azure secret backend to
     * read credentials from, with no leading or trailing `/`s.
     * 
     */
    @Import(name="backend", required=true)
    private Output<String> backend;

    /**
     * @return The path to the Azure secret backend to
     * read credentials from, with no leading or trailing `/`s.
     * 
     */
    public Output<String> backend() {
        return this.backend;
    }

    /**
     * The Azure environment to use during credential validation.
     * Defaults to the environment configured in the Vault backend.
     * Some possible values: `AzurePublicCloud`, `AzureGovernmentCloud`
     * *See the caveats section for more information on this field.*
     * 
     */
    @Import(name="environment")
    private @Nullable Output<String> environment;

    /**
     * @return The Azure environment to use during credential validation.
     * Defaults to the environment configured in the Vault backend.
     * Some possible values: `AzurePublicCloud`, `AzureGovernmentCloud`
     * *See the caveats section for more information on this field.*
     * 
     */
    public Optional<Output<String>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * If &#39;validate_creds&#39; is true,
     * the number of seconds after which to give up validating credentials. Defaults
     * to 300.
     * 
     */
    @Import(name="maxCredValidationSeconds")
    private @Nullable Output<Integer> maxCredValidationSeconds;

    /**
     * @return If &#39;validate_creds&#39; is true,
     * the number of seconds after which to give up validating credentials. Defaults
     * to 300.
     * 
     */
    public Optional<Output<Integer>> maxCredValidationSeconds() {
        return Optional.ofNullable(this.maxCredValidationSeconds);
    }

    /**
     * The namespace of the target resource.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The namespace of the target resource.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * If &#39;validate_creds&#39; is true,
     * the number of seconds to wait between each test of generated credentials.
     * Defaults to 1.
     * 
     */
    @Import(name="numSecondsBetweenTests")
    private @Nullable Output<Integer> numSecondsBetweenTests;

    /**
     * @return If &#39;validate_creds&#39; is true,
     * the number of seconds to wait between each test of generated credentials.
     * Defaults to 1.
     * 
     */
    public Optional<Output<Integer>> numSecondsBetweenTests() {
        return Optional.ofNullable(this.numSecondsBetweenTests);
    }

    /**
     * If &#39;validate_creds&#39; is true,
     * the number of sequential successes required to validate generated
     * credentials. Defaults to 8.
     * 
     */
    @Import(name="numSequentialSuccesses")
    private @Nullable Output<Integer> numSequentialSuccesses;

    /**
     * @return If &#39;validate_creds&#39; is true,
     * the number of sequential successes required to validate generated
     * credentials. Defaults to 8.
     * 
     */
    public Optional<Output<Integer>> numSequentialSuccesses() {
        return Optional.ofNullable(this.numSequentialSuccesses);
    }

    /**
     * The name of the Azure secret backend role to read
     * credentials from, with no leading or trailing `/`s.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The name of the Azure secret backend role to read
     * credentials from, with no leading or trailing `/`s.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     * The subscription ID to use during credential
     * validation. Defaults to the subscription ID configured in the Vault `backend`.
     * *See the caveats section for more information on this field.*
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable Output<String> subscriptionId;

    /**
     * @return The subscription ID to use during credential
     * validation. Defaults to the subscription ID configured in the Vault `backend`.
     * *See the caveats section for more information on this field.*
     * 
     */
    public Optional<Output<String>> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    /**
     * The tenant ID to use during credential validation.
     * Defaults to the tenant ID configured in the Vault `backend`.
     * *See the caveats section for more information on this field.*
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The tenant ID to use during credential validation.
     * Defaults to the tenant ID configured in the Vault `backend`.
     * *See the caveats section for more information on this field.*
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Whether generated credentials should be
     * validated before being returned. Defaults to `false`, which returns
     * credentials without checking whether they have fully propagated throughout
     * Azure Active Directory. Designating `true` activates testing.
     * 
     */
    @Import(name="validateCreds")
    private @Nullable Output<Boolean> validateCreds;

    /**
     * @return Whether generated credentials should be
     * validated before being returned. Defaults to `false`, which returns
     * credentials without checking whether they have fully propagated throughout
     * Azure Active Directory. Designating `true` activates testing.
     * 
     */
    public Optional<Output<Boolean>> validateCreds() {
        return Optional.ofNullable(this.validateCreds);
    }

    private GetAccessCredentialsArgs() {}

    private GetAccessCredentialsArgs(GetAccessCredentialsArgs $) {
        this.backend = $.backend;
        this.environment = $.environment;
        this.maxCredValidationSeconds = $.maxCredValidationSeconds;
        this.namespace = $.namespace;
        this.numSecondsBetweenTests = $.numSecondsBetweenTests;
        this.numSequentialSuccesses = $.numSequentialSuccesses;
        this.role = $.role;
        this.subscriptionId = $.subscriptionId;
        this.tenantId = $.tenantId;
        this.validateCreds = $.validateCreds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessCredentialsArgs $;

        public Builder() {
            $ = new GetAccessCredentialsArgs();
        }

        public Builder(GetAccessCredentialsArgs defaults) {
            $ = new GetAccessCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backend The path to the Azure secret backend to
         * read credentials from, with no leading or trailing `/`s.
         * 
         * @return builder
         * 
         */
        public Builder backend(Output<String> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend The path to the Azure secret backend to
         * read credentials from, with no leading or trailing `/`s.
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param environment The Azure environment to use during credential validation.
         * Defaults to the environment configured in the Vault backend.
         * Some possible values: `AzurePublicCloud`, `AzureGovernmentCloud`
         * *See the caveats section for more information on this field.*
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<String> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment The Azure environment to use during credential validation.
         * Defaults to the environment configured in the Vault backend.
         * Some possible values: `AzurePublicCloud`, `AzureGovernmentCloud`
         * *See the caveats section for more information on this field.*
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param maxCredValidationSeconds If &#39;validate_creds&#39; is true,
         * the number of seconds after which to give up validating credentials. Defaults
         * to 300.
         * 
         * @return builder
         * 
         */
        public Builder maxCredValidationSeconds(@Nullable Output<Integer> maxCredValidationSeconds) {
            $.maxCredValidationSeconds = maxCredValidationSeconds;
            return this;
        }

        /**
         * @param maxCredValidationSeconds If &#39;validate_creds&#39; is true,
         * the number of seconds after which to give up validating credentials. Defaults
         * to 300.
         * 
         * @return builder
         * 
         */
        public Builder maxCredValidationSeconds(Integer maxCredValidationSeconds) {
            return maxCredValidationSeconds(Output.of(maxCredValidationSeconds));
        }

        /**
         * @param namespace The namespace of the target resource.
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
         * @param namespace The namespace of the target resource.
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
         * @param numSecondsBetweenTests If &#39;validate_creds&#39; is true,
         * the number of seconds to wait between each test of generated credentials.
         * Defaults to 1.
         * 
         * @return builder
         * 
         */
        public Builder numSecondsBetweenTests(@Nullable Output<Integer> numSecondsBetweenTests) {
            $.numSecondsBetweenTests = numSecondsBetweenTests;
            return this;
        }

        /**
         * @param numSecondsBetweenTests If &#39;validate_creds&#39; is true,
         * the number of seconds to wait between each test of generated credentials.
         * Defaults to 1.
         * 
         * @return builder
         * 
         */
        public Builder numSecondsBetweenTests(Integer numSecondsBetweenTests) {
            return numSecondsBetweenTests(Output.of(numSecondsBetweenTests));
        }

        /**
         * @param numSequentialSuccesses If &#39;validate_creds&#39; is true,
         * the number of sequential successes required to validate generated
         * credentials. Defaults to 8.
         * 
         * @return builder
         * 
         */
        public Builder numSequentialSuccesses(@Nullable Output<Integer> numSequentialSuccesses) {
            $.numSequentialSuccesses = numSequentialSuccesses;
            return this;
        }

        /**
         * @param numSequentialSuccesses If &#39;validate_creds&#39; is true,
         * the number of sequential successes required to validate generated
         * credentials. Defaults to 8.
         * 
         * @return builder
         * 
         */
        public Builder numSequentialSuccesses(Integer numSequentialSuccesses) {
            return numSequentialSuccesses(Output.of(numSequentialSuccesses));
        }

        /**
         * @param role The name of the Azure secret backend role to read
         * credentials from, with no leading or trailing `/`s.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The name of the Azure secret backend role to read
         * credentials from, with no leading or trailing `/`s.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param subscriptionId The subscription ID to use during credential
         * validation. Defaults to the subscription ID configured in the Vault `backend`.
         * *See the caveats section for more information on this field.*
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId The subscription ID to use during credential
         * validation. Defaults to the subscription ID configured in the Vault `backend`.
         * *See the caveats section for more information on this field.*
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        /**
         * @param tenantId The tenant ID to use during credential validation.
         * Defaults to the tenant ID configured in the Vault `backend`.
         * *See the caveats section for more information on this field.*
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The tenant ID to use during credential validation.
         * Defaults to the tenant ID configured in the Vault `backend`.
         * *See the caveats section for more information on this field.*
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param validateCreds Whether generated credentials should be
         * validated before being returned. Defaults to `false`, which returns
         * credentials without checking whether they have fully propagated throughout
         * Azure Active Directory. Designating `true` activates testing.
         * 
         * @return builder
         * 
         */
        public Builder validateCreds(@Nullable Output<Boolean> validateCreds) {
            $.validateCreds = validateCreds;
            return this;
        }

        /**
         * @param validateCreds Whether generated credentials should be
         * validated before being returned. Defaults to `false`, which returns
         * credentials without checking whether they have fully propagated throughout
         * Azure Active Directory. Designating `true` activates testing.
         * 
         * @return builder
         * 
         */
        public Builder validateCreds(Boolean validateCreds) {
            return validateCreds(Output.of(validateCreds));
        }

        public GetAccessCredentialsArgs build() {
            $.backend = Objects.requireNonNull($.backend, "expected parameter 'backend' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}
