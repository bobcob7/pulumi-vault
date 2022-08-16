// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EgpPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final EgpPolicyState Empty = new EgpPolicyState();

    /**
     * Enforcement level of Sentinel policy. Can be either `advisory` or `soft-mandatory` or `hard-mandatory`
     * 
     */
    @Import(name="enforcementLevel")
    private @Nullable Output<String> enforcementLevel;

    /**
     * @return Enforcement level of Sentinel policy. Can be either `advisory` or `soft-mandatory` or `hard-mandatory`
     * 
     */
    public Optional<Output<String>> enforcementLevel() {
        return Optional.ofNullable(this.enforcementLevel);
    }

    /**
     * The name of the policy
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the policy
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of paths to which the policy will be applied to
     * 
     */
    @Import(name="paths")
    private @Nullable Output<List<String>> paths;

    /**
     * @return List of paths to which the policy will be applied to
     * 
     */
    public Optional<Output<List<String>>> paths() {
        return Optional.ofNullable(this.paths);
    }

    /**
     * String containing a Sentinel policy
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return String containing a Sentinel policy
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    private EgpPolicyState() {}

    private EgpPolicyState(EgpPolicyState $) {
        this.enforcementLevel = $.enforcementLevel;
        this.name = $.name;
        this.paths = $.paths;
        this.policy = $.policy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EgpPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EgpPolicyState $;

        public Builder() {
            $ = new EgpPolicyState();
        }

        public Builder(EgpPolicyState defaults) {
            $ = new EgpPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param enforcementLevel Enforcement level of Sentinel policy. Can be either `advisory` or `soft-mandatory` or `hard-mandatory`
         * 
         * @return builder
         * 
         */
        public Builder enforcementLevel(@Nullable Output<String> enforcementLevel) {
            $.enforcementLevel = enforcementLevel;
            return this;
        }

        /**
         * @param enforcementLevel Enforcement level of Sentinel policy. Can be either `advisory` or `soft-mandatory` or `hard-mandatory`
         * 
         * @return builder
         * 
         */
        public Builder enforcementLevel(String enforcementLevel) {
            return enforcementLevel(Output.of(enforcementLevel));
        }

        /**
         * @param name The name of the policy
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the policy
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param paths List of paths to which the policy will be applied to
         * 
         * @return builder
         * 
         */
        public Builder paths(@Nullable Output<List<String>> paths) {
            $.paths = paths;
            return this;
        }

        /**
         * @param paths List of paths to which the policy will be applied to
         * 
         * @return builder
         * 
         */
        public Builder paths(List<String> paths) {
            return paths(Output.of(paths));
        }

        /**
         * @param paths List of paths to which the policy will be applied to
         * 
         * @return builder
         * 
         */
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }

        /**
         * @param policy String containing a Sentinel policy
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy String containing a Sentinel policy
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public EgpPolicyState build() {
            return $;
        }
    }

}
