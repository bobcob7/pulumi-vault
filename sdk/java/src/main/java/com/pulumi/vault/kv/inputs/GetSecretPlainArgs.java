// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.kv.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretPlainArgs Empty = new GetSecretPlainArgs();

    /**
     * The namespace of the target resource.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     * 
     */
    @Import(name="namespace")
    private @Nullable String namespace;

    /**
     * @return The namespace of the target resource.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * Full path of the KV-V1 secret.
     * 
     */
    @Import(name="path", required=true)
    private String path;

    /**
     * @return Full path of the KV-V1 secret.
     * 
     */
    public String path() {
        return this.path;
    }

    private GetSecretPlainArgs() {}

    private GetSecretPlainArgs(GetSecretPlainArgs $) {
        this.namespace = $.namespace;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretPlainArgs $;

        public Builder() {
            $ = new GetSecretPlainArgs();
        }

        public Builder(GetSecretPlainArgs defaults) {
            $ = new GetSecretPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespace The namespace of the target resource.
         * The value should not contain leading or trailing forward slashes.
         * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
         * *Available only for Vault Enterprise*.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable String namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param path Full path of the KV-V1 secret.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            $.path = path;
            return this;
        }

        public GetSecretPlainArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
