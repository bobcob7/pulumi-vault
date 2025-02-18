// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.kv.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretV2CustomMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretV2CustomMetadataArgs Empty = new SecretV2CustomMetadataArgs();

    @Import(name="casRequired")
    private @Nullable Output<Boolean> casRequired;

    public Optional<Output<Boolean>> casRequired() {
        return Optional.ofNullable(this.casRequired);
    }

    /**
     * A mapping whose keys are the top-level data keys returned from
     * Vault and whose values are the corresponding values. This map can only
     * represent string data, so any non-string values returned from Vault are
     * serialized as JSON.
     * 
     */
    @Import(name="data")
    private @Nullable Output<Map<String,Object>> data;

    /**
     * @return A mapping whose keys are the top-level data keys returned from
     * Vault and whose values are the corresponding values. This map can only
     * represent string data, so any non-string values returned from Vault are
     * serialized as JSON.
     * 
     */
    public Optional<Output<Map<String,Object>>> data() {
        return Optional.ofNullable(this.data);
    }

    @Import(name="deleteVersionAfter")
    private @Nullable Output<Integer> deleteVersionAfter;

    public Optional<Output<Integer>> deleteVersionAfter() {
        return Optional.ofNullable(this.deleteVersionAfter);
    }

    @Import(name="maxVersions")
    private @Nullable Output<Integer> maxVersions;

    public Optional<Output<Integer>> maxVersions() {
        return Optional.ofNullable(this.maxVersions);
    }

    private SecretV2CustomMetadataArgs() {}

    private SecretV2CustomMetadataArgs(SecretV2CustomMetadataArgs $) {
        this.casRequired = $.casRequired;
        this.data = $.data;
        this.deleteVersionAfter = $.deleteVersionAfter;
        this.maxVersions = $.maxVersions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretV2CustomMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretV2CustomMetadataArgs $;

        public Builder() {
            $ = new SecretV2CustomMetadataArgs();
        }

        public Builder(SecretV2CustomMetadataArgs defaults) {
            $ = new SecretV2CustomMetadataArgs(Objects.requireNonNull(defaults));
        }

        public Builder casRequired(@Nullable Output<Boolean> casRequired) {
            $.casRequired = casRequired;
            return this;
        }

        public Builder casRequired(Boolean casRequired) {
            return casRequired(Output.of(casRequired));
        }

        /**
         * @param data A mapping whose keys are the top-level data keys returned from
         * Vault and whose values are the corresponding values. This map can only
         * represent string data, so any non-string values returned from Vault are
         * serialized as JSON.
         * 
         * @return builder
         * 
         */
        public Builder data(@Nullable Output<Map<String,Object>> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data A mapping whose keys are the top-level data keys returned from
         * Vault and whose values are the corresponding values. This map can only
         * represent string data, so any non-string values returned from Vault are
         * serialized as JSON.
         * 
         * @return builder
         * 
         */
        public Builder data(Map<String,Object> data) {
            return data(Output.of(data));
        }

        public Builder deleteVersionAfter(@Nullable Output<Integer> deleteVersionAfter) {
            $.deleteVersionAfter = deleteVersionAfter;
            return this;
        }

        public Builder deleteVersionAfter(Integer deleteVersionAfter) {
            return deleteVersionAfter(Output.of(deleteVersionAfter));
        }

        public Builder maxVersions(@Nullable Output<Integer> maxVersions) {
            $.maxVersions = maxVersions;
            return this;
        }

        public Builder maxVersions(Integer maxVersions) {
            return maxVersions(Output.of(maxVersions));
        }

        public SecretV2CustomMetadataArgs build() {
            return $;
        }
    }

}
