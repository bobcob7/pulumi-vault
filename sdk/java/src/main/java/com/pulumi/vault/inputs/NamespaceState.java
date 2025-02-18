// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceState extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceState Empty = new NamespaceState();

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
     * Namespace ID.
     * 
     */
    @Import(name="namespaceId")
    private @Nullable Output<String> namespaceId;

    /**
     * @return Namespace ID.
     * 
     */
    public Optional<Output<String>> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    /**
     * The path of the namespace. Must not have a trailing `/`
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path of the namespace. Must not have a trailing `/`
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The fully qualified path to the namespace. Useful when provisioning resources in a child `namespace`.
     * 
     */
    @Import(name="pathFq")
    private @Nullable Output<String> pathFq;

    /**
     * @return The fully qualified path to the namespace. Useful when provisioning resources in a child `namespace`.
     * 
     */
    public Optional<Output<String>> pathFq() {
        return Optional.ofNullable(this.pathFq);
    }

    private NamespaceState() {}

    private NamespaceState(NamespaceState $) {
        this.namespace = $.namespace;
        this.namespaceId = $.namespaceId;
        this.path = $.path;
        this.pathFq = $.pathFq;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceState $;

        public Builder() {
            $ = new NamespaceState();
        }

        public Builder(NamespaceState defaults) {
            $ = new NamespaceState(Objects.requireNonNull(defaults));
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
         * @param namespaceId Namespace ID.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId Namespace ID.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        /**
         * @param path The path of the namespace. Must not have a trailing `/`
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path of the namespace. Must not have a trailing `/`
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param pathFq The fully qualified path to the namespace. Useful when provisioning resources in a child `namespace`.
         * 
         * @return builder
         * 
         */
        public Builder pathFq(@Nullable Output<String> pathFq) {
            $.pathFq = pathFq;
            return this;
        }

        /**
         * @param pathFq The fully qualified path to the namespace. Useful when provisioning resources in a child `namespace`.
         * 
         * @return builder
         * 
         */
        public Builder pathFq(String pathFq) {
            return pathFq(Output.of(pathFq));
        }

        public NamespaceState build() {
            return $;
        }
    }

}
