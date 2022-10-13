// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.ad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretLibraryState extends com.pulumi.resources.ResourceArgs {

    public static final SecretLibraryState Empty = new SecretLibraryState();

    /**
     * The path the AD secret backend is mounted at,
     * with no leading or trailing `/`s.
     * 
     */
    @Import(name="backend")
    private @Nullable Output<String> backend;

    /**
     * @return The path the AD secret backend is mounted at,
     * with no leading or trailing `/`s.
     * 
     */
    public Optional<Output<String>> backend() {
        return Optional.ofNullable(this.backend);
    }

    /**
     * Disable enforcing that service accounts must be checked in by the entity or client token that checked them out.
     * 
     */
    @Import(name="disableCheckInEnforcement")
    private @Nullable Output<Boolean> disableCheckInEnforcement;

    /**
     * @return Disable enforcing that service accounts must be checked in by the entity or client token that checked them out.
     * 
     */
    public Optional<Output<Boolean>> disableCheckInEnforcement() {
        return Optional.ofNullable(this.disableCheckInEnforcement);
    }

    /**
     * The maximum password time-to-live in seconds. Defaults to the configuration
     * max_ttl if not provided.
     * 
     */
    @Import(name="maxTtl")
    private @Nullable Output<Integer> maxTtl;

    /**
     * @return The maximum password time-to-live in seconds. Defaults to the configuration
     * max_ttl if not provided.
     * 
     */
    public Optional<Output<Integer>> maxTtl() {
        return Optional.ofNullable(this.maxTtl);
    }

    /**
     * The name to identify this set of service accounts.
     * Must be unique within the backend.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name to identify this set of service accounts.
     * Must be unique within the backend.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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
     * Specifies the slice of service accounts mapped to this set.
     * 
     */
    @Import(name="serviceAccountNames")
    private @Nullable Output<List<String>> serviceAccountNames;

    /**
     * @return Specifies the slice of service accounts mapped to this set.
     * 
     */
    public Optional<Output<List<String>>> serviceAccountNames() {
        return Optional.ofNullable(this.serviceAccountNames);
    }

    /**
     * The password time-to-live in seconds. Defaults to the configuration
     * ttl if not provided.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    /**
     * @return The password time-to-live in seconds. Defaults to the configuration
     * ttl if not provided.
     * 
     */
    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    private SecretLibraryState() {}

    private SecretLibraryState(SecretLibraryState $) {
        this.backend = $.backend;
        this.disableCheckInEnforcement = $.disableCheckInEnforcement;
        this.maxTtl = $.maxTtl;
        this.name = $.name;
        this.namespace = $.namespace;
        this.serviceAccountNames = $.serviceAccountNames;
        this.ttl = $.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretLibraryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretLibraryState $;

        public Builder() {
            $ = new SecretLibraryState();
        }

        public Builder(SecretLibraryState defaults) {
            $ = new SecretLibraryState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backend The path the AD secret backend is mounted at,
         * with no leading or trailing `/`s.
         * 
         * @return builder
         * 
         */
        public Builder backend(@Nullable Output<String> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend The path the AD secret backend is mounted at,
         * with no leading or trailing `/`s.
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param disableCheckInEnforcement Disable enforcing that service accounts must be checked in by the entity or client token that checked them out.
         * 
         * @return builder
         * 
         */
        public Builder disableCheckInEnforcement(@Nullable Output<Boolean> disableCheckInEnforcement) {
            $.disableCheckInEnforcement = disableCheckInEnforcement;
            return this;
        }

        /**
         * @param disableCheckInEnforcement Disable enforcing that service accounts must be checked in by the entity or client token that checked them out.
         * 
         * @return builder
         * 
         */
        public Builder disableCheckInEnforcement(Boolean disableCheckInEnforcement) {
            return disableCheckInEnforcement(Output.of(disableCheckInEnforcement));
        }

        /**
         * @param maxTtl The maximum password time-to-live in seconds. Defaults to the configuration
         * max_ttl if not provided.
         * 
         * @return builder
         * 
         */
        public Builder maxTtl(@Nullable Output<Integer> maxTtl) {
            $.maxTtl = maxTtl;
            return this;
        }

        /**
         * @param maxTtl The maximum password time-to-live in seconds. Defaults to the configuration
         * max_ttl if not provided.
         * 
         * @return builder
         * 
         */
        public Builder maxTtl(Integer maxTtl) {
            return maxTtl(Output.of(maxTtl));
        }

        /**
         * @param name The name to identify this set of service accounts.
         * Must be unique within the backend.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name to identify this set of service accounts.
         * Must be unique within the backend.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param serviceAccountNames Specifies the slice of service accounts mapped to this set.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountNames(@Nullable Output<List<String>> serviceAccountNames) {
            $.serviceAccountNames = serviceAccountNames;
            return this;
        }

        /**
         * @param serviceAccountNames Specifies the slice of service accounts mapped to this set.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountNames(List<String> serviceAccountNames) {
            return serviceAccountNames(Output.of(serviceAccountNames));
        }

        /**
         * @param serviceAccountNames Specifies the slice of service accounts mapped to this set.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountNames(String... serviceAccountNames) {
            return serviceAccountNames(List.of(serviceAccountNames));
        }

        /**
         * @param ttl The password time-to-live in seconds. Defaults to the configuration
         * ttl if not provided.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl The password time-to-live in seconds. Defaults to the configuration
         * ttl if not provided.
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        public SecretLibraryState build() {
            return $;
        }
    }

}
