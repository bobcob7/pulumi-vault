// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthBackendRoleTagState extends com.pulumi.resources.ResourceArgs {

    public static final AuthBackendRoleTagState Empty = new AuthBackendRoleTagState();

    /**
     * If set, allows migration of the underlying instances where the client resides. Use with caution.
     * 
     */
    @Import(name="allowInstanceMigration")
    private @Nullable Output<Boolean> allowInstanceMigration;

    /**
     * @return If set, allows migration of the underlying instances where the client resides. Use with caution.
     * 
     */
    public Optional<Output<Boolean>> allowInstanceMigration() {
        return Optional.ofNullable(this.allowInstanceMigration);
    }

    /**
     * The path to the AWS auth backend to
     * read role tags from, with no leading or trailing `/`s. Defaults to &#34;aws&#34;.
     * 
     */
    @Import(name="backend")
    private @Nullable Output<String> backend;

    /**
     * @return The path to the AWS auth backend to
     * read role tags from, with no leading or trailing `/`s. Defaults to &#34;aws&#34;.
     * 
     */
    public Optional<Output<String>> backend() {
        return Optional.ofNullable(this.backend);
    }

    /**
     * If set, only allows a single token to be granted per instance ID.
     * 
     */
    @Import(name="disallowReauthentication")
    private @Nullable Output<Boolean> disallowReauthentication;

    /**
     * @return If set, only allows a single token to be granted per instance ID.
     * 
     */
    public Optional<Output<Boolean>> disallowReauthentication() {
        return Optional.ofNullable(this.disallowReauthentication);
    }

    /**
     * Instance ID for which this tag is intended for. If set, the created tag can only be used by the instance with the given ID.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return Instance ID for which this tag is intended for. If set, the created tag can only be used by the instance with the given ID.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The maximum TTL of the tokens issued using this role.
     * 
     */
    @Import(name="maxTtl")
    private @Nullable Output<String> maxTtl;

    /**
     * @return The maximum TTL of the tokens issued using this role.
     * 
     */
    public Optional<Output<String>> maxTtl() {
        return Optional.ofNullable(this.maxTtl);
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
     * The policies to be associated with the tag. Must be a subset of the policies associated with the role.
     * 
     */
    @Import(name="policies")
    private @Nullable Output<List<String>> policies;

    /**
     * @return The policies to be associated with the tag. Must be a subset of the policies associated with the role.
     * 
     */
    public Optional<Output<List<String>>> policies() {
        return Optional.ofNullable(this.policies);
    }

    /**
     * The name of the AWS auth backend role to read
     * role tags from, with no leading or trailing `/`s.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The name of the AWS auth backend role to read
     * role tags from, with no leading or trailing `/`s.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * The key of the role tag.
     * 
     */
    @Import(name="tagKey")
    private @Nullable Output<String> tagKey;

    /**
     * @return The key of the role tag.
     * 
     */
    public Optional<Output<String>> tagKey() {
        return Optional.ofNullable(this.tagKey);
    }

    /**
     * The value to set the role key.
     * 
     */
    @Import(name="tagValue")
    private @Nullable Output<String> tagValue;

    /**
     * @return The value to set the role key.
     * 
     */
    public Optional<Output<String>> tagValue() {
        return Optional.ofNullable(this.tagValue);
    }

    private AuthBackendRoleTagState() {}

    private AuthBackendRoleTagState(AuthBackendRoleTagState $) {
        this.allowInstanceMigration = $.allowInstanceMigration;
        this.backend = $.backend;
        this.disallowReauthentication = $.disallowReauthentication;
        this.instanceId = $.instanceId;
        this.maxTtl = $.maxTtl;
        this.namespace = $.namespace;
        this.policies = $.policies;
        this.role = $.role;
        this.tagKey = $.tagKey;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthBackendRoleTagState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthBackendRoleTagState $;

        public Builder() {
            $ = new AuthBackendRoleTagState();
        }

        public Builder(AuthBackendRoleTagState defaults) {
            $ = new AuthBackendRoleTagState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowInstanceMigration If set, allows migration of the underlying instances where the client resides. Use with caution.
         * 
         * @return builder
         * 
         */
        public Builder allowInstanceMigration(@Nullable Output<Boolean> allowInstanceMigration) {
            $.allowInstanceMigration = allowInstanceMigration;
            return this;
        }

        /**
         * @param allowInstanceMigration If set, allows migration of the underlying instances where the client resides. Use with caution.
         * 
         * @return builder
         * 
         */
        public Builder allowInstanceMigration(Boolean allowInstanceMigration) {
            return allowInstanceMigration(Output.of(allowInstanceMigration));
        }

        /**
         * @param backend The path to the AWS auth backend to
         * read role tags from, with no leading or trailing `/`s. Defaults to &#34;aws&#34;.
         * 
         * @return builder
         * 
         */
        public Builder backend(@Nullable Output<String> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend The path to the AWS auth backend to
         * read role tags from, with no leading or trailing `/`s. Defaults to &#34;aws&#34;.
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param disallowReauthentication If set, only allows a single token to be granted per instance ID.
         * 
         * @return builder
         * 
         */
        public Builder disallowReauthentication(@Nullable Output<Boolean> disallowReauthentication) {
            $.disallowReauthentication = disallowReauthentication;
            return this;
        }

        /**
         * @param disallowReauthentication If set, only allows a single token to be granted per instance ID.
         * 
         * @return builder
         * 
         */
        public Builder disallowReauthentication(Boolean disallowReauthentication) {
            return disallowReauthentication(Output.of(disallowReauthentication));
        }

        /**
         * @param instanceId Instance ID for which this tag is intended for. If set, the created tag can only be used by the instance with the given ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId Instance ID for which this tag is intended for. If set, the created tag can only be used by the instance with the given ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param maxTtl The maximum TTL of the tokens issued using this role.
         * 
         * @return builder
         * 
         */
        public Builder maxTtl(@Nullable Output<String> maxTtl) {
            $.maxTtl = maxTtl;
            return this;
        }

        /**
         * @param maxTtl The maximum TTL of the tokens issued using this role.
         * 
         * @return builder
         * 
         */
        public Builder maxTtl(String maxTtl) {
            return maxTtl(Output.of(maxTtl));
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
         * @param policies The policies to be associated with the tag. Must be a subset of the policies associated with the role.
         * 
         * @return builder
         * 
         */
        public Builder policies(@Nullable Output<List<String>> policies) {
            $.policies = policies;
            return this;
        }

        /**
         * @param policies The policies to be associated with the tag. Must be a subset of the policies associated with the role.
         * 
         * @return builder
         * 
         */
        public Builder policies(List<String> policies) {
            return policies(Output.of(policies));
        }

        /**
         * @param policies The policies to be associated with the tag. Must be a subset of the policies associated with the role.
         * 
         * @return builder
         * 
         */
        public Builder policies(String... policies) {
            return policies(List.of(policies));
        }

        /**
         * @param role The name of the AWS auth backend role to read
         * role tags from, with no leading or trailing `/`s.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The name of the AWS auth backend role to read
         * role tags from, with no leading or trailing `/`s.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param tagKey The key of the role tag.
         * 
         * @return builder
         * 
         */
        public Builder tagKey(@Nullable Output<String> tagKey) {
            $.tagKey = tagKey;
            return this;
        }

        /**
         * @param tagKey The key of the role tag.
         * 
         * @return builder
         * 
         */
        public Builder tagKey(String tagKey) {
            return tagKey(Output.of(tagKey));
        }

        /**
         * @param tagValue The value to set the role key.
         * 
         * @return builder
         * 
         */
        public Builder tagValue(@Nullable Output<String> tagValue) {
            $.tagValue = tagValue;
            return this;
        }

        /**
         * @param tagValue The value to set the role key.
         * 
         * @return builder
         * 
         */
        public Builder tagValue(String tagValue) {
            return tagValue(Output.of(tagValue));
        }

        public AuthBackendRoleTagState build() {
            return $;
        }
    }

}
