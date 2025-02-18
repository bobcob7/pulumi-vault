// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.identity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OidcKeyAllowedClientIDArgs extends com.pulumi.resources.ResourceArgs {

    public static final OidcKeyAllowedClientIDArgs Empty = new OidcKeyAllowedClientIDArgs();

    /**
     * Client ID to allow usage with the OIDC named key
     * 
     */
    @Import(name="allowedClientId", required=true)
    private Output<String> allowedClientId;

    /**
     * @return Client ID to allow usage with the OIDC named key
     * 
     */
    public Output<String> allowedClientId() {
        return this.allowedClientId;
    }

    /**
     * Name of the OIDC Key allow the Client ID.
     * 
     */
    @Import(name="keyName", required=true)
    private Output<String> keyName;

    /**
     * @return Name of the OIDC Key allow the Client ID.
     * 
     */
    public Output<String> keyName() {
        return this.keyName;
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

    private OidcKeyAllowedClientIDArgs() {}

    private OidcKeyAllowedClientIDArgs(OidcKeyAllowedClientIDArgs $) {
        this.allowedClientId = $.allowedClientId;
        this.keyName = $.keyName;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OidcKeyAllowedClientIDArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OidcKeyAllowedClientIDArgs $;

        public Builder() {
            $ = new OidcKeyAllowedClientIDArgs();
        }

        public Builder(OidcKeyAllowedClientIDArgs defaults) {
            $ = new OidcKeyAllowedClientIDArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedClientId Client ID to allow usage with the OIDC named key
         * 
         * @return builder
         * 
         */
        public Builder allowedClientId(Output<String> allowedClientId) {
            $.allowedClientId = allowedClientId;
            return this;
        }

        /**
         * @param allowedClientId Client ID to allow usage with the OIDC named key
         * 
         * @return builder
         * 
         */
        public Builder allowedClientId(String allowedClientId) {
            return allowedClientId(Output.of(allowedClientId));
        }

        /**
         * @param keyName Name of the OIDC Key allow the Client ID.
         * 
         * @return builder
         * 
         */
        public Builder keyName(Output<String> keyName) {
            $.keyName = keyName;
            return this;
        }

        /**
         * @param keyName Name of the OIDC Key allow the Client ID.
         * 
         * @return builder
         * 
         */
        public Builder keyName(String keyName) {
            return keyName(Output.of(keyName));
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

        public OidcKeyAllowedClientIDArgs build() {
            $.allowedClientId = Objects.requireNonNull($.allowedClientId, "expected parameter 'allowedClientId' to be non-null");
            $.keyName = Objects.requireNonNull($.keyName, "expected parameter 'keyName' to be non-null");
            return $;
        }
    }

}
