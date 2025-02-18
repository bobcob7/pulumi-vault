// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.identity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OidcAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final OidcAssignmentArgs Empty = new OidcAssignmentArgs();

    /**
     * A set of Vault entity IDs.
     * 
     */
    @Import(name="entityIds")
    private @Nullable Output<List<String>> entityIds;

    /**
     * @return A set of Vault entity IDs.
     * 
     */
    public Optional<Output<List<String>>> entityIds() {
        return Optional.ofNullable(this.entityIds);
    }

    /**
     * A set of Vault group IDs.
     * 
     */
    @Import(name="groupIds")
    private @Nullable Output<List<String>> groupIds;

    /**
     * @return A set of Vault group IDs.
     * 
     */
    public Optional<Output<List<String>>> groupIds() {
        return Optional.ofNullable(this.groupIds);
    }

    /**
     * The name of the assignment.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the assignment.
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

    private OidcAssignmentArgs() {}

    private OidcAssignmentArgs(OidcAssignmentArgs $) {
        this.entityIds = $.entityIds;
        this.groupIds = $.groupIds;
        this.name = $.name;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OidcAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OidcAssignmentArgs $;

        public Builder() {
            $ = new OidcAssignmentArgs();
        }

        public Builder(OidcAssignmentArgs defaults) {
            $ = new OidcAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entityIds A set of Vault entity IDs.
         * 
         * @return builder
         * 
         */
        public Builder entityIds(@Nullable Output<List<String>> entityIds) {
            $.entityIds = entityIds;
            return this;
        }

        /**
         * @param entityIds A set of Vault entity IDs.
         * 
         * @return builder
         * 
         */
        public Builder entityIds(List<String> entityIds) {
            return entityIds(Output.of(entityIds));
        }

        /**
         * @param entityIds A set of Vault entity IDs.
         * 
         * @return builder
         * 
         */
        public Builder entityIds(String... entityIds) {
            return entityIds(List.of(entityIds));
        }

        /**
         * @param groupIds A set of Vault group IDs.
         * 
         * @return builder
         * 
         */
        public Builder groupIds(@Nullable Output<List<String>> groupIds) {
            $.groupIds = groupIds;
            return this;
        }

        /**
         * @param groupIds A set of Vault group IDs.
         * 
         * @return builder
         * 
         */
        public Builder groupIds(List<String> groupIds) {
            return groupIds(Output.of(groupIds));
        }

        /**
         * @param groupIds A set of Vault group IDs.
         * 
         * @return builder
         * 
         */
        public Builder groupIds(String... groupIds) {
            return groupIds(List.of(groupIds));
        }

        /**
         * @param name The name of the assignment.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the assignment.
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

        public OidcAssignmentArgs build() {
            return $;
        }
    }

}
