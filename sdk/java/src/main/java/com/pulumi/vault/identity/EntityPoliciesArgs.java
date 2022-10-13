// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.identity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EntityPoliciesArgs extends com.pulumi.resources.ResourceArgs {

    public static final EntityPoliciesArgs Empty = new EntityPoliciesArgs();

    /**
     * Entity ID to assign policies to.
     * 
     */
    @Import(name="entityId", required=true)
    private Output<String> entityId;

    /**
     * @return Entity ID to assign policies to.
     * 
     */
    public Output<String> entityId() {
        return this.entityId;
    }

    /**
     * Defaults to `true`.
     * 
     */
    @Import(name="exclusive")
    private @Nullable Output<Boolean> exclusive;

    /**
     * @return Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> exclusive() {
        return Optional.ofNullable(this.exclusive);
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
     * List of policies to assign to the entity
     * 
     */
    @Import(name="policies", required=true)
    private Output<List<String>> policies;

    /**
     * @return List of policies to assign to the entity
     * 
     */
    public Output<List<String>> policies() {
        return this.policies;
    }

    private EntityPoliciesArgs() {}

    private EntityPoliciesArgs(EntityPoliciesArgs $) {
        this.entityId = $.entityId;
        this.exclusive = $.exclusive;
        this.namespace = $.namespace;
        this.policies = $.policies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntityPoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntityPoliciesArgs $;

        public Builder() {
            $ = new EntityPoliciesArgs();
        }

        public Builder(EntityPoliciesArgs defaults) {
            $ = new EntityPoliciesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entityId Entity ID to assign policies to.
         * 
         * @return builder
         * 
         */
        public Builder entityId(Output<String> entityId) {
            $.entityId = entityId;
            return this;
        }

        /**
         * @param entityId Entity ID to assign policies to.
         * 
         * @return builder
         * 
         */
        public Builder entityId(String entityId) {
            return entityId(Output.of(entityId));
        }

        /**
         * @param exclusive Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder exclusive(@Nullable Output<Boolean> exclusive) {
            $.exclusive = exclusive;
            return this;
        }

        /**
         * @param exclusive Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder exclusive(Boolean exclusive) {
            return exclusive(Output.of(exclusive));
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
         * @param policies List of policies to assign to the entity
         * 
         * @return builder
         * 
         */
        public Builder policies(Output<List<String>> policies) {
            $.policies = policies;
            return this;
        }

        /**
         * @param policies List of policies to assign to the entity
         * 
         * @return builder
         * 
         */
        public Builder policies(List<String> policies) {
            return policies(Output.of(policies));
        }

        /**
         * @param policies List of policies to assign to the entity
         * 
         * @return builder
         * 
         */
        public Builder policies(String... policies) {
            return policies(List.of(policies));
        }

        public EntityPoliciesArgs build() {
            $.entityId = Objects.requireNonNull($.entityId, "expected parameter 'entityId' to be non-null");
            $.policies = Objects.requireNonNull($.policies, "expected parameter 'policies' to be non-null");
            return $;
        }
    }

}
