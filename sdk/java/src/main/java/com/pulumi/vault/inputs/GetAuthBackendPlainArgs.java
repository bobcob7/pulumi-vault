// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAuthBackendPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuthBackendPlainArgs Empty = new GetAuthBackendPlainArgs();

    /**
     * The auth backend mount point.
     * 
     */
    @Import(name="path", required=true)
    private String path;

    /**
     * @return The auth backend mount point.
     * 
     */
    public String path() {
        return this.path;
    }

    private GetAuthBackendPlainArgs() {}

    private GetAuthBackendPlainArgs(GetAuthBackendPlainArgs $) {
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuthBackendPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuthBackendPlainArgs $;

        public Builder() {
            $ = new GetAuthBackendPlainArgs();
        }

        public Builder(GetAuthBackendPlainArgs defaults) {
            $ = new GetAuthBackendPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path The auth backend mount point.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            $.path = path;
            return this;
        }

        public GetAuthBackendPlainArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
