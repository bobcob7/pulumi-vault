// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TeamArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamArgs Empty = new TeamArgs();

    /**
     * Path where the github auth backend is mounted. Defaults to `github`
     * if not specified.
     * 
     */
    @Import(name="backend")
    private @Nullable Output<String> backend;

    /**
     * @return Path where the github auth backend is mounted. Defaults to `github`
     * if not specified.
     * 
     */
    public Optional<Output<String>> backend() {
        return Optional.ofNullable(this.backend);
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
     * An array of strings specifying the policies to be set on tokens
     * issued using this role.
     * 
     */
    @Import(name="policies")
    private @Nullable Output<List<String>> policies;

    /**
     * @return An array of strings specifying the policies to be set on tokens
     * issued using this role.
     * 
     */
    public Optional<Output<List<String>>> policies() {
        return Optional.ofNullable(this.policies);
    }

    /**
     * GitHub team name in &#34;slugified&#34; format.
     * 
     */
    @Import(name="team", required=true)
    private Output<String> team;

    /**
     * @return GitHub team name in &#34;slugified&#34; format.
     * 
     */
    public Output<String> team() {
        return this.team;
    }

    private TeamArgs() {}

    private TeamArgs(TeamArgs $) {
        this.backend = $.backend;
        this.namespace = $.namespace;
        this.policies = $.policies;
        this.team = $.team;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamArgs $;

        public Builder() {
            $ = new TeamArgs();
        }

        public Builder(TeamArgs defaults) {
            $ = new TeamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backend Path where the github auth backend is mounted. Defaults to `github`
         * if not specified.
         * 
         * @return builder
         * 
         */
        public Builder backend(@Nullable Output<String> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend Path where the github auth backend is mounted. Defaults to `github`
         * if not specified.
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            return backend(Output.of(backend));
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
         * @param policies An array of strings specifying the policies to be set on tokens
         * issued using this role.
         * 
         * @return builder
         * 
         */
        public Builder policies(@Nullable Output<List<String>> policies) {
            $.policies = policies;
            return this;
        }

        /**
         * @param policies An array of strings specifying the policies to be set on tokens
         * issued using this role.
         * 
         * @return builder
         * 
         */
        public Builder policies(List<String> policies) {
            return policies(Output.of(policies));
        }

        /**
         * @param policies An array of strings specifying the policies to be set on tokens
         * issued using this role.
         * 
         * @return builder
         * 
         */
        public Builder policies(String... policies) {
            return policies(List.of(policies));
        }

        /**
         * @param team GitHub team name in &#34;slugified&#34; format.
         * 
         * @return builder
         * 
         */
        public Builder team(Output<String> team) {
            $.team = team;
            return this;
        }

        /**
         * @param team GitHub team name in &#34;slugified&#34; format.
         * 
         * @return builder
         * 
         */
        public Builder team(String team) {
            return team(Output.of(team));
        }

        public TeamArgs build() {
            $.team = Objects.requireNonNull($.team, "expected parameter 'team' to be non-null");
            return $;
        }
    }

}
