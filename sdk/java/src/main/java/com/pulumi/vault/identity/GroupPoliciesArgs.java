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


public final class GroupPoliciesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupPoliciesArgs Empty = new GroupPoliciesArgs();

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
     * Group ID to assign policies to.
     * 
     */
    @Import(name="groupId", required=true)
    private Output<String> groupId;

    /**
     * @return Group ID to assign policies to.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
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
     * List of policies to assign to the group
     * 
     */
    @Import(name="policies", required=true)
    private Output<List<String>> policies;

    /**
     * @return List of policies to assign to the group
     * 
     */
    public Output<List<String>> policies() {
        return this.policies;
    }

    private GroupPoliciesArgs() {}

    private GroupPoliciesArgs(GroupPoliciesArgs $) {
        this.exclusive = $.exclusive;
        this.groupId = $.groupId;
        this.namespace = $.namespace;
        this.policies = $.policies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupPoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupPoliciesArgs $;

        public Builder() {
            $ = new GroupPoliciesArgs();
        }

        public Builder(GroupPoliciesArgs defaults) {
            $ = new GroupPoliciesArgs(Objects.requireNonNull(defaults));
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
         * @param groupId Group ID to assign policies to.
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId Group ID to assign policies to.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
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
         * @param policies List of policies to assign to the group
         * 
         * @return builder
         * 
         */
        public Builder policies(Output<List<String>> policies) {
            $.policies = policies;
            return this;
        }

        /**
         * @param policies List of policies to assign to the group
         * 
         * @return builder
         * 
         */
        public Builder policies(List<String> policies) {
            return policies(Output.of(policies));
        }

        /**
         * @param policies List of policies to assign to the group
         * 
         * @return builder
         * 
         */
        public Builder policies(String... policies) {
            return policies(List.of(policies));
        }

        public GroupPoliciesArgs build() {
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            $.policies = Objects.requireNonNull($.policies, "expected parameter 'policies' to be non-null");
            return $;
        }
    }

}
