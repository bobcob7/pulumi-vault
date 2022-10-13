// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.rabbitMq;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.vault.rabbitMq.inputs.SecretBackendRoleVhostArgs;
import com.pulumi.vault.rabbitMq.inputs.SecretBackendRoleVhostTopicArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretBackendRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretBackendRoleArgs Empty = new SecretBackendRoleArgs();

    /**
     * The path the RabbitMQ secret backend is mounted at,
     * with no leading or trailing `/`s.
     * 
     */
    @Import(name="backend", required=true)
    private Output<String> backend;

    /**
     * @return The path the RabbitMQ secret backend is mounted at,
     * with no leading or trailing `/`s.
     * 
     */
    public Output<String> backend() {
        return this.backend;
    }

    /**
     * The name to identify this role within the backend.
     * Must be unique within the backend.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name to identify this role within the backend.
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
     * Specifies a comma-separated RabbitMQ management tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<String> tags;

    /**
     * @return Specifies a comma-separated RabbitMQ management tags.
     * 
     */
    public Optional<Output<String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies a map of virtual hosts and exchanges to topic permissions. This option requires RabbitMQ 3.7.0 or later.
     * 
     */
    @Import(name="vhostTopics")
    private @Nullable Output<List<SecretBackendRoleVhostTopicArgs>> vhostTopics;

    /**
     * @return Specifies a map of virtual hosts and exchanges to topic permissions. This option requires RabbitMQ 3.7.0 or later.
     * 
     */
    public Optional<Output<List<SecretBackendRoleVhostTopicArgs>>> vhostTopics() {
        return Optional.ofNullable(this.vhostTopics);
    }

    /**
     * Specifies a map of virtual hosts to permissions.
     * 
     */
    @Import(name="vhosts")
    private @Nullable Output<List<SecretBackendRoleVhostArgs>> vhosts;

    /**
     * @return Specifies a map of virtual hosts to permissions.
     * 
     */
    public Optional<Output<List<SecretBackendRoleVhostArgs>>> vhosts() {
        return Optional.ofNullable(this.vhosts);
    }

    private SecretBackendRoleArgs() {}

    private SecretBackendRoleArgs(SecretBackendRoleArgs $) {
        this.backend = $.backend;
        this.name = $.name;
        this.namespace = $.namespace;
        this.tags = $.tags;
        this.vhostTopics = $.vhostTopics;
        this.vhosts = $.vhosts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretBackendRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretBackendRoleArgs $;

        public Builder() {
            $ = new SecretBackendRoleArgs();
        }

        public Builder(SecretBackendRoleArgs defaults) {
            $ = new SecretBackendRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backend The path the RabbitMQ secret backend is mounted at,
         * with no leading or trailing `/`s.
         * 
         * @return builder
         * 
         */
        public Builder backend(Output<String> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend The path the RabbitMQ secret backend is mounted at,
         * with no leading or trailing `/`s.
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param name The name to identify this role within the backend.
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
         * @param name The name to identify this role within the backend.
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
         * @param tags Specifies a comma-separated RabbitMQ management tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Specifies a comma-separated RabbitMQ management tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(String tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vhostTopics Specifies a map of virtual hosts and exchanges to topic permissions. This option requires RabbitMQ 3.7.0 or later.
         * 
         * @return builder
         * 
         */
        public Builder vhostTopics(@Nullable Output<List<SecretBackendRoleVhostTopicArgs>> vhostTopics) {
            $.vhostTopics = vhostTopics;
            return this;
        }

        /**
         * @param vhostTopics Specifies a map of virtual hosts and exchanges to topic permissions. This option requires RabbitMQ 3.7.0 or later.
         * 
         * @return builder
         * 
         */
        public Builder vhostTopics(List<SecretBackendRoleVhostTopicArgs> vhostTopics) {
            return vhostTopics(Output.of(vhostTopics));
        }

        /**
         * @param vhostTopics Specifies a map of virtual hosts and exchanges to topic permissions. This option requires RabbitMQ 3.7.0 or later.
         * 
         * @return builder
         * 
         */
        public Builder vhostTopics(SecretBackendRoleVhostTopicArgs... vhostTopics) {
            return vhostTopics(List.of(vhostTopics));
        }

        /**
         * @param vhosts Specifies a map of virtual hosts to permissions.
         * 
         * @return builder
         * 
         */
        public Builder vhosts(@Nullable Output<List<SecretBackendRoleVhostArgs>> vhosts) {
            $.vhosts = vhosts;
            return this;
        }

        /**
         * @param vhosts Specifies a map of virtual hosts to permissions.
         * 
         * @return builder
         * 
         */
        public Builder vhosts(List<SecretBackendRoleVhostArgs> vhosts) {
            return vhosts(Output.of(vhosts));
        }

        /**
         * @param vhosts Specifies a map of virtual hosts to permissions.
         * 
         * @return builder
         * 
         */
        public Builder vhosts(SecretBackendRoleVhostArgs... vhosts) {
            return vhosts(List.of(vhosts));
        }

        public SecretBackendRoleArgs build() {
            $.backend = Objects.requireNonNull($.backend, "expected parameter 'backend' to be non-null");
            return $;
        }
    }

}
