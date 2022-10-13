// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.ldap.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthBackendGroupState extends com.pulumi.resources.ResourceArgs {

    public static final AuthBackendGroupState Empty = new AuthBackendGroupState();

    /**
     * Path to the authentication backend
     * 
     */
    @Import(name="backend")
    private @Nullable Output<String> backend;

    /**
     * @return Path to the authentication backend
     * 
     */
    public Optional<Output<String>> backend() {
        return Optional.ofNullable(this.backend);
    }

    /**
     * The LDAP groupname
     * 
     */
    @Import(name="groupname")
    private @Nullable Output<String> groupname;

    /**
     * @return The LDAP groupname
     * 
     */
    public Optional<Output<String>> groupname() {
        return Optional.ofNullable(this.groupname);
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
     * Policies which should be granted to members of the group
     * 
     */
    @Import(name="policies")
    private @Nullable Output<List<String>> policies;

    /**
     * @return Policies which should be granted to members of the group
     * 
     */
    public Optional<Output<List<String>>> policies() {
        return Optional.ofNullable(this.policies);
    }

    private AuthBackendGroupState() {}

    private AuthBackendGroupState(AuthBackendGroupState $) {
        this.backend = $.backend;
        this.groupname = $.groupname;
        this.namespace = $.namespace;
        this.policies = $.policies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthBackendGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthBackendGroupState $;

        public Builder() {
            $ = new AuthBackendGroupState();
        }

        public Builder(AuthBackendGroupState defaults) {
            $ = new AuthBackendGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backend Path to the authentication backend
         * 
         * @return builder
         * 
         */
        public Builder backend(@Nullable Output<String> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend Path to the authentication backend
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param groupname The LDAP groupname
         * 
         * @return builder
         * 
         */
        public Builder groupname(@Nullable Output<String> groupname) {
            $.groupname = groupname;
            return this;
        }

        /**
         * @param groupname The LDAP groupname
         * 
         * @return builder
         * 
         */
        public Builder groupname(String groupname) {
            return groupname(Output.of(groupname));
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
         * @param policies Policies which should be granted to members of the group
         * 
         * @return builder
         * 
         */
        public Builder policies(@Nullable Output<List<String>> policies) {
            $.policies = policies;
            return this;
        }

        /**
         * @param policies Policies which should be granted to members of the group
         * 
         * @return builder
         * 
         */
        public Builder policies(List<String> policies) {
            return policies(Output.of(policies));
        }

        /**
         * @param policies Policies which should be granted to members of the group
         * 
         * @return builder
         * 
         */
        public Builder policies(String... policies) {
            return policies(List.of(policies));
        }

        public AuthBackendGroupState build() {
            return $;
        }
    }

}
