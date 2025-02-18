// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.transform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEncodePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEncodePlainArgs Empty = new GetEncodePlainArgs();

    /**
     * Specifies a list of items to be encoded in a single batch. If this parameter is set, the parameters &#39;value&#39;, &#39;transformation&#39; and &#39;tweak&#39; will be ignored. Each batch item within the list can specify these parameters instead.
     * 
     */
    @Import(name="batchInputs")
    private @Nullable List<Map<String,Object>> batchInputs;

    /**
     * @return Specifies a list of items to be encoded in a single batch. If this parameter is set, the parameters &#39;value&#39;, &#39;transformation&#39; and &#39;tweak&#39; will be ignored. Each batch item within the list can specify these parameters instead.
     * 
     */
    public Optional<List<Map<String,Object>>> batchInputs() {
        return Optional.ofNullable(this.batchInputs);
    }

    /**
     * The result of encoding a batch.
     * 
     */
    @Import(name="batchResults")
    private @Nullable List<Map<String,Object>> batchResults;

    /**
     * @return The result of encoding a batch.
     * 
     */
    public Optional<List<Map<String,Object>>> batchResults() {
        return Optional.ofNullable(this.batchResults);
    }

    /**
     * The result of encoding a value.
     * 
     */
    @Import(name="encodedValue")
    private @Nullable String encodedValue;

    /**
     * @return The result of encoding a value.
     * 
     */
    public Optional<String> encodedValue() {
        return Optional.ofNullable(this.encodedValue);
    }

    /**
     * Path to where the back-end is mounted within Vault.
     * 
     */
    @Import(name="path", required=true)
    private String path;

    /**
     * @return Path to where the back-end is mounted within Vault.
     * 
     */
    public String path() {
        return this.path;
    }

    /**
     * The name of the role.
     * 
     */
    @Import(name="roleName", required=true)
    private String roleName;

    /**
     * @return The name of the role.
     * 
     */
    public String roleName() {
        return this.roleName;
    }

    /**
     * The transformation to perform. If no value is provided and the role contains a single transformation, this value will be inferred from the role.
     * 
     */
    @Import(name="transformation")
    private @Nullable String transformation;

    /**
     * @return The transformation to perform. If no value is provided and the role contains a single transformation, this value will be inferred from the role.
     * 
     */
    public Optional<String> transformation() {
        return Optional.ofNullable(this.transformation);
    }

    /**
     * The tweak value to use. Only applicable for FPE transformations
     * 
     */
    @Import(name="tweak")
    private @Nullable String tweak;

    /**
     * @return The tweak value to use. Only applicable for FPE transformations
     * 
     */
    public Optional<String> tweak() {
        return Optional.ofNullable(this.tweak);
    }

    /**
     * The value in which to encode.
     * 
     */
    @Import(name="value")
    private @Nullable String value;

    /**
     * @return The value in which to encode.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private GetEncodePlainArgs() {}

    private GetEncodePlainArgs(GetEncodePlainArgs $) {
        this.batchInputs = $.batchInputs;
        this.batchResults = $.batchResults;
        this.encodedValue = $.encodedValue;
        this.path = $.path;
        this.roleName = $.roleName;
        this.transformation = $.transformation;
        this.tweak = $.tweak;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEncodePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEncodePlainArgs $;

        public Builder() {
            $ = new GetEncodePlainArgs();
        }

        public Builder(GetEncodePlainArgs defaults) {
            $ = new GetEncodePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param batchInputs Specifies a list of items to be encoded in a single batch. If this parameter is set, the parameters &#39;value&#39;, &#39;transformation&#39; and &#39;tweak&#39; will be ignored. Each batch item within the list can specify these parameters instead.
         * 
         * @return builder
         * 
         */
        public Builder batchInputs(@Nullable List<Map<String,Object>> batchInputs) {
            $.batchInputs = batchInputs;
            return this;
        }

        /**
         * @param batchInputs Specifies a list of items to be encoded in a single batch. If this parameter is set, the parameters &#39;value&#39;, &#39;transformation&#39; and &#39;tweak&#39; will be ignored. Each batch item within the list can specify these parameters instead.
         * 
         * @return builder
         * 
         */
        public Builder batchInputs(Map<String,Object>... batchInputs) {
            return batchInputs(List.of(batchInputs));
        }

        /**
         * @param batchResults The result of encoding a batch.
         * 
         * @return builder
         * 
         */
        public Builder batchResults(@Nullable List<Map<String,Object>> batchResults) {
            $.batchResults = batchResults;
            return this;
        }

        /**
         * @param batchResults The result of encoding a batch.
         * 
         * @return builder
         * 
         */
        public Builder batchResults(Map<String,Object>... batchResults) {
            return batchResults(List.of(batchResults));
        }

        /**
         * @param encodedValue The result of encoding a value.
         * 
         * @return builder
         * 
         */
        public Builder encodedValue(@Nullable String encodedValue) {
            $.encodedValue = encodedValue;
            return this;
        }

        /**
         * @param path Path to where the back-end is mounted within Vault.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            $.path = path;
            return this;
        }

        /**
         * @param roleName The name of the role.
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            $.roleName = roleName;
            return this;
        }

        /**
         * @param transformation The transformation to perform. If no value is provided and the role contains a single transformation, this value will be inferred from the role.
         * 
         * @return builder
         * 
         */
        public Builder transformation(@Nullable String transformation) {
            $.transformation = transformation;
            return this;
        }

        /**
         * @param tweak The tweak value to use. Only applicable for FPE transformations
         * 
         * @return builder
         * 
         */
        public Builder tweak(@Nullable String tweak) {
            $.tweak = tweak;
            return this;
        }

        /**
         * @param value The value in which to encode.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public GetEncodePlainArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            $.roleName = Objects.requireNonNull($.roleName, "expected parameter 'roleName' to be non-null");
            return $;
        }
    }

}
