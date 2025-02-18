// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.kv.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretV2Args extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretV2Args Empty = new GetSecretV2Args();

    /**
     * Path where KV-V2 engine is mounted.
     * 
     */
    @Import(name="mount", required=true)
    private Output<String> mount;

    /**
     * @return Path where KV-V2 engine is mounted.
     * 
     */
    public Output<String> mount() {
        return this.mount;
    }

    /**
     * Full name of the secret. For a nested secret
     * the name is the nested path excluding the mount and data
     * prefix. For example, for a secret at `kvv2/data/foo/bar/baz`
     * the name is `foo/bar/baz`.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Full name of the secret. For a nested secret
     * the name is the nested path excluding the mount and data
     * prefix. For example, for a secret at `kvv2/data/foo/bar/baz`
     * the name is `foo/bar/baz`.
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * Version of the secret to retrieve.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return Version of the secret to retrieve.
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private GetSecretV2Args() {}

    private GetSecretV2Args(GetSecretV2Args $) {
        this.mount = $.mount;
        this.name = $.name;
        this.namespace = $.namespace;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretV2Args $;

        public Builder() {
            $ = new GetSecretV2Args();
        }

        public Builder(GetSecretV2Args defaults) {
            $ = new GetSecretV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param mount Path where KV-V2 engine is mounted.
         * 
         * @return builder
         * 
         */
        public Builder mount(Output<String> mount) {
            $.mount = mount;
            return this;
        }

        /**
         * @param mount Path where KV-V2 engine is mounted.
         * 
         * @return builder
         * 
         */
        public Builder mount(String mount) {
            return mount(Output.of(mount));
        }

        /**
         * @param name Full name of the secret. For a nested secret
         * the name is the nested path excluding the mount and data
         * prefix. For example, for a secret at `kvv2/data/foo/bar/baz`
         * the name is `foo/bar/baz`.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Full name of the secret. For a nested secret
         * the name is the nested path excluding the mount and data
         * prefix. For example, for a secret at `kvv2/data/foo/bar/baz`
         * the name is `foo/bar/baz`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param version Version of the secret to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version of the secret to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public GetSecretV2Args build() {
            $.mount = Objects.requireNonNull($.mount, "expected parameter 'mount' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
