// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.terraformcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretRoleState extends com.pulumi.resources.ResourceArgs {

    public static final SecretRoleState Empty = new SecretRoleState();

    /**
     * The path of the Terraform Cloud Secret Backend the role belongs to.
     * 
     */
    @Import(name="backend")
    private @Nullable Output<String> backend;

    /**
     * @return The path of the Terraform Cloud Secret Backend the role belongs to.
     * 
     */
    public Optional<Output<String>> backend() {
        return Optional.ofNullable(this.backend);
    }

    /**
     * Maximum TTL for leases associated with this role, in seconds.
     * 
     */
    @Import(name="maxTtl")
    private @Nullable Output<Integer> maxTtl;

    /**
     * @return Maximum TTL for leases associated with this role, in seconds.
     * 
     */
    public Optional<Output<Integer>> maxTtl() {
        return Optional.ofNullable(this.maxTtl);
    }

    /**
     * The name of an existing role against which to create this Terraform Cloud credential
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of an existing role against which to create this Terraform Cloud credential
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Name of the Terraform Cloud or Enterprise organization
     * 
     */
    @Import(name="organization")
    private @Nullable Output<String> organization;

    /**
     * @return Name of the Terraform Cloud or Enterprise organization
     * 
     */
    public Optional<Output<String>> organization() {
        return Optional.ofNullable(this.organization);
    }

    /**
     * ID of the Terraform Cloud or Enterprise team under organization (e.g., settings/teams/team-xxxxxxxxxxxxx)
     * 
     */
    @Import(name="teamId")
    private @Nullable Output<String> teamId;

    /**
     * @return ID of the Terraform Cloud or Enterprise team under organization (e.g., settings/teams/team-xxxxxxxxxxxxx)
     * 
     */
    public Optional<Output<String>> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    /**
     * Specifies the TTL for this role.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    /**
     * @return Specifies the TTL for this role.
     * 
     */
    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    /**
     * ID of the Terraform Cloud or Enterprise user (e.g., user-xxxxxxxxxxxxxxxx)
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return ID of the Terraform Cloud or Enterprise user (e.g., user-xxxxxxxxxxxxxxxx)
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private SecretRoleState() {}

    private SecretRoleState(SecretRoleState $) {
        this.backend = $.backend;
        this.maxTtl = $.maxTtl;
        this.name = $.name;
        this.organization = $.organization;
        this.teamId = $.teamId;
        this.ttl = $.ttl;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretRoleState $;

        public Builder() {
            $ = new SecretRoleState();
        }

        public Builder(SecretRoleState defaults) {
            $ = new SecretRoleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backend The path of the Terraform Cloud Secret Backend the role belongs to.
         * 
         * @return builder
         * 
         */
        public Builder backend(@Nullable Output<String> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend The path of the Terraform Cloud Secret Backend the role belongs to.
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param maxTtl Maximum TTL for leases associated with this role, in seconds.
         * 
         * @return builder
         * 
         */
        public Builder maxTtl(@Nullable Output<Integer> maxTtl) {
            $.maxTtl = maxTtl;
            return this;
        }

        /**
         * @param maxTtl Maximum TTL for leases associated with this role, in seconds.
         * 
         * @return builder
         * 
         */
        public Builder maxTtl(Integer maxTtl) {
            return maxTtl(Output.of(maxTtl));
        }

        /**
         * @param name The name of an existing role against which to create this Terraform Cloud credential
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of an existing role against which to create this Terraform Cloud credential
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organization Name of the Terraform Cloud or Enterprise organization
         * 
         * @return builder
         * 
         */
        public Builder organization(@Nullable Output<String> organization) {
            $.organization = organization;
            return this;
        }

        /**
         * @param organization Name of the Terraform Cloud or Enterprise organization
         * 
         * @return builder
         * 
         */
        public Builder organization(String organization) {
            return organization(Output.of(organization));
        }

        /**
         * @param teamId ID of the Terraform Cloud or Enterprise team under organization (e.g., settings/teams/team-xxxxxxxxxxxxx)
         * 
         * @return builder
         * 
         */
        public Builder teamId(@Nullable Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        /**
         * @param teamId ID of the Terraform Cloud or Enterprise team under organization (e.g., settings/teams/team-xxxxxxxxxxxxx)
         * 
         * @return builder
         * 
         */
        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        /**
         * @param ttl Specifies the TTL for this role.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl Specifies the TTL for this role.
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        /**
         * @param userId ID of the Terraform Cloud or Enterprise user (e.g., user-xxxxxxxxxxxxxxxx)
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId ID of the Terraform Cloud or Enterprise user (e.g., user-xxxxxxxxxxxxxxxx)
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public SecretRoleState build() {
            return $;
        }
    }

}
