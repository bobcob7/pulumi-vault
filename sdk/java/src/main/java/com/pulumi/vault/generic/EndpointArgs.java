// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.generic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointArgs Empty = new EndpointArgs();

    /**
     * String containing a JSON-encoded object that will be
     * written to the given path as the secret data.
     * 
     */
    @Import(name="dataJson", required=true)
    private Output<String> dataJson;

    /**
     * @return String containing a JSON-encoded object that will be
     * written to the given path as the secret data.
     * 
     */
    public Output<String> dataJson() {
        return this.dataJson;
    }

    /**
     * Don&#39;t attempt to delete the path from Vault if true
     * 
     */
    @Import(name="disableDelete")
    private @Nullable Output<Boolean> disableDelete;

    /**
     * @return Don&#39;t attempt to delete the path from Vault if true
     * 
     */
    public Optional<Output<Boolean>> disableDelete() {
        return Optional.ofNullable(this.disableDelete);
    }

    /**
     * True/false. Set this to true if your vault
     * authentication is not able to read the data or if the endpoint does
     * not support the `GET` method. Setting this to `true` will break drift
     * detection. You should set this to `true` for endpoints that are
     * write-only. Defaults to false.
     * 
     */
    @Import(name="disableRead")
    private @Nullable Output<Boolean> disableRead;

    /**
     * @return True/false. Set this to true if your vault
     * authentication is not able to read the data or if the endpoint does
     * not support the `GET` method. Setting this to `true` will break drift
     * detection. You should set this to `true` for endpoints that are
     * write-only. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> disableRead() {
        return Optional.ofNullable(this.disableRead);
    }

    /**
     * When reading, disregard fields not present in data_json
     * 
     */
    @Import(name="ignoreAbsentFields")
    private @Nullable Output<Boolean> ignoreAbsentFields;

    /**
     * @return When reading, disregard fields not present in data_json
     * 
     */
    public Optional<Output<Boolean>> ignoreAbsentFields() {
        return Optional.ofNullable(this.ignoreAbsentFields);
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
     * The full logical path at which to write the given
     * data. Consult each backend&#39;s documentation to see which endpoints
     * support the `PUT` methods and to determine whether they also support
     * `DELETE` and `GET`.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return The full logical path at which to write the given
     * data. Consult each backend&#39;s documentation to see which endpoints
     * support the `PUT` methods and to determine whether they also support
     * `DELETE` and `GET`.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * Top-level fields returned by write to persist in state
     * 
     */
    @Import(name="writeFields")
    private @Nullable Output<List<String>> writeFields;

    /**
     * @return Top-level fields returned by write to persist in state
     * 
     */
    public Optional<Output<List<String>>> writeFields() {
        return Optional.ofNullable(this.writeFields);
    }

    private EndpointArgs() {}

    private EndpointArgs(EndpointArgs $) {
        this.dataJson = $.dataJson;
        this.disableDelete = $.disableDelete;
        this.disableRead = $.disableRead;
        this.ignoreAbsentFields = $.ignoreAbsentFields;
        this.namespace = $.namespace;
        this.path = $.path;
        this.writeFields = $.writeFields;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointArgs $;

        public Builder() {
            $ = new EndpointArgs();
        }

        public Builder(EndpointArgs defaults) {
            $ = new EndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataJson String containing a JSON-encoded object that will be
         * written to the given path as the secret data.
         * 
         * @return builder
         * 
         */
        public Builder dataJson(Output<String> dataJson) {
            $.dataJson = dataJson;
            return this;
        }

        /**
         * @param dataJson String containing a JSON-encoded object that will be
         * written to the given path as the secret data.
         * 
         * @return builder
         * 
         */
        public Builder dataJson(String dataJson) {
            return dataJson(Output.of(dataJson));
        }

        /**
         * @param disableDelete Don&#39;t attempt to delete the path from Vault if true
         * 
         * @return builder
         * 
         */
        public Builder disableDelete(@Nullable Output<Boolean> disableDelete) {
            $.disableDelete = disableDelete;
            return this;
        }

        /**
         * @param disableDelete Don&#39;t attempt to delete the path from Vault if true
         * 
         * @return builder
         * 
         */
        public Builder disableDelete(Boolean disableDelete) {
            return disableDelete(Output.of(disableDelete));
        }

        /**
         * @param disableRead True/false. Set this to true if your vault
         * authentication is not able to read the data or if the endpoint does
         * not support the `GET` method. Setting this to `true` will break drift
         * detection. You should set this to `true` for endpoints that are
         * write-only. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder disableRead(@Nullable Output<Boolean> disableRead) {
            $.disableRead = disableRead;
            return this;
        }

        /**
         * @param disableRead True/false. Set this to true if your vault
         * authentication is not able to read the data or if the endpoint does
         * not support the `GET` method. Setting this to `true` will break drift
         * detection. You should set this to `true` for endpoints that are
         * write-only. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder disableRead(Boolean disableRead) {
            return disableRead(Output.of(disableRead));
        }

        /**
         * @param ignoreAbsentFields When reading, disregard fields not present in data_json
         * 
         * @return builder
         * 
         */
        public Builder ignoreAbsentFields(@Nullable Output<Boolean> ignoreAbsentFields) {
            $.ignoreAbsentFields = ignoreAbsentFields;
            return this;
        }

        /**
         * @param ignoreAbsentFields When reading, disregard fields not present in data_json
         * 
         * @return builder
         * 
         */
        public Builder ignoreAbsentFields(Boolean ignoreAbsentFields) {
            return ignoreAbsentFields(Output.of(ignoreAbsentFields));
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
         * @param path The full logical path at which to write the given
         * data. Consult each backend&#39;s documentation to see which endpoints
         * support the `PUT` methods and to determine whether they also support
         * `DELETE` and `GET`.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The full logical path at which to write the given
         * data. Consult each backend&#39;s documentation to see which endpoints
         * support the `PUT` methods and to determine whether they also support
         * `DELETE` and `GET`.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param writeFields Top-level fields returned by write to persist in state
         * 
         * @return builder
         * 
         */
        public Builder writeFields(@Nullable Output<List<String>> writeFields) {
            $.writeFields = writeFields;
            return this;
        }

        /**
         * @param writeFields Top-level fields returned by write to persist in state
         * 
         * @return builder
         * 
         */
        public Builder writeFields(List<String> writeFields) {
            return writeFields(Output.of(writeFields));
        }

        /**
         * @param writeFields Top-level fields returned by write to persist in state
         * 
         * @return builder
         * 
         */
        public Builder writeFields(String... writeFields) {
            return writeFields(List.of(writeFields));
        }

        public EndpointArgs build() {
            $.dataJson = Objects.requireNonNull($.dataJson, "expected parameter 'dataJson' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
