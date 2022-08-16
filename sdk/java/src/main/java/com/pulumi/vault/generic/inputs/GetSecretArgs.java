// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.generic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretArgs Empty = new GetSecretArgs();

    /**
     * The full logical path from which to request data.
     * To read data from the &#34;generic&#34; secret backend mounted in Vault by
     * default, this should be prefixed with `secret/`. Reading from other backends
     * with this data source is possible; consult each backend&#39;s documentation
     * to see which endpoints support the `GET` method.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return The full logical path from which to request data.
     * To read data from the &#34;generic&#34; secret backend mounted in Vault by
     * default, this should be prefixed with `secret/`. Reading from other backends
     * with this data source is possible; consult each backend&#39;s documentation
     * to see which endpoints support the `GET` method.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * The version of the secret to read. This is used by the
     * Vault KV secrets engine - version 2 to indicate which version of the secret
     * to read.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return The version of the secret to read. This is used by the
     * Vault KV secrets engine - version 2 to indicate which version of the secret
     * to read.
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    @Import(name="withLeaseStartTime")
    private @Nullable Output<Boolean> withLeaseStartTime;

    public Optional<Output<Boolean>> withLeaseStartTime() {
        return Optional.ofNullable(this.withLeaseStartTime);
    }

    private GetSecretArgs() {}

    private GetSecretArgs(GetSecretArgs $) {
        this.path = $.path;
        this.version = $.version;
        this.withLeaseStartTime = $.withLeaseStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretArgs $;

        public Builder() {
            $ = new GetSecretArgs();
        }

        public Builder(GetSecretArgs defaults) {
            $ = new GetSecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path The full logical path from which to request data.
         * To read data from the &#34;generic&#34; secret backend mounted in Vault by
         * default, this should be prefixed with `secret/`. Reading from other backends
         * with this data source is possible; consult each backend&#39;s documentation
         * to see which endpoints support the `GET` method.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The full logical path from which to request data.
         * To read data from the &#34;generic&#34; secret backend mounted in Vault by
         * default, this should be prefixed with `secret/`. Reading from other backends
         * with this data source is possible; consult each backend&#39;s documentation
         * to see which endpoints support the `GET` method.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param version The version of the secret to read. This is used by the
         * Vault KV secrets engine - version 2 to indicate which version of the secret
         * to read.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the secret to read. This is used by the
         * Vault KV secrets engine - version 2 to indicate which version of the secret
         * to read.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public Builder withLeaseStartTime(@Nullable Output<Boolean> withLeaseStartTime) {
            $.withLeaseStartTime = withLeaseStartTime;
            return this;
        }

        public Builder withLeaseStartTime(Boolean withLeaseStartTime) {
            return withLeaseStartTime(Output.of(withLeaseStartTime));
        }

        public GetSecretArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
