// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.jwt.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthBackendTuneArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthBackendTuneArgs Empty = new AuthBackendTuneArgs();

    /**
     * List of headers to whitelist and allowing
     * a plugin to include them in the response.
     * 
     */
    @Import(name="allowedResponseHeaders")
    private @Nullable Output<List<String>> allowedResponseHeaders;

    /**
     * @return List of headers to whitelist and allowing
     * a plugin to include them in the response.
     * 
     */
    public Optional<Output<List<String>>> allowedResponseHeaders() {
        return Optional.ofNullable(this.allowedResponseHeaders);
    }

    /**
     * Specifies the list of keys that will
     * not be HMAC&#39;d by audit devices in the request data object.
     * 
     */
    @Import(name="auditNonHmacRequestKeys")
    private @Nullable Output<List<String>> auditNonHmacRequestKeys;

    /**
     * @return Specifies the list of keys that will
     * not be HMAC&#39;d by audit devices in the request data object.
     * 
     */
    public Optional<Output<List<String>>> auditNonHmacRequestKeys() {
        return Optional.ofNullable(this.auditNonHmacRequestKeys);
    }

    /**
     * Specifies the list of keys that will
     * not be HMAC&#39;d by audit devices in the response data object.
     * 
     */
    @Import(name="auditNonHmacResponseKeys")
    private @Nullable Output<List<String>> auditNonHmacResponseKeys;

    /**
     * @return Specifies the list of keys that will
     * not be HMAC&#39;d by audit devices in the response data object.
     * 
     */
    public Optional<Output<List<String>>> auditNonHmacResponseKeys() {
        return Optional.ofNullable(this.auditNonHmacResponseKeys);
    }

    /**
     * Specifies the default time-to-live.
     * If set, this overrides the global default.
     * Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
     * 
     */
    @Import(name="defaultLeaseTtl")
    private @Nullable Output<String> defaultLeaseTtl;

    /**
     * @return Specifies the default time-to-live.
     * If set, this overrides the global default.
     * Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
     * 
     */
    public Optional<Output<String>> defaultLeaseTtl() {
        return Optional.ofNullable(this.defaultLeaseTtl);
    }

    /**
     * Specifies whether to show this mount in
     * the UI-specific listing endpoint. Valid values are &#34;unauth&#34; or &#34;hidden&#34;.
     * 
     */
    @Import(name="listingVisibility")
    private @Nullable Output<String> listingVisibility;

    /**
     * @return Specifies whether to show this mount in
     * the UI-specific listing endpoint. Valid values are &#34;unauth&#34; or &#34;hidden&#34;.
     * 
     */
    public Optional<Output<String>> listingVisibility() {
        return Optional.ofNullable(this.listingVisibility);
    }

    /**
     * Specifies the maximum time-to-live.
     * If set, this overrides the global default.
     * Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
     * 
     */
    @Import(name="maxLeaseTtl")
    private @Nullable Output<String> maxLeaseTtl;

    /**
     * @return Specifies the maximum time-to-live.
     * If set, this overrides the global default.
     * Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
     * 
     */
    public Optional<Output<String>> maxLeaseTtl() {
        return Optional.ofNullable(this.maxLeaseTtl);
    }

    /**
     * List of headers to whitelist and
     * pass from the request to the backend.
     * 
     */
    @Import(name="passthroughRequestHeaders")
    private @Nullable Output<List<String>> passthroughRequestHeaders;

    /**
     * @return List of headers to whitelist and
     * pass from the request to the backend.
     * 
     */
    public Optional<Output<List<String>>> passthroughRequestHeaders() {
        return Optional.ofNullable(this.passthroughRequestHeaders);
    }

    /**
     * Specifies the type of tokens that should be returned by
     * the mount. Valid values are &#34;default-service&#34;, &#34;default-batch&#34;, &#34;service&#34;, &#34;batch&#34;.
     * 
     */
    @Import(name="tokenType")
    private @Nullable Output<String> tokenType;

    /**
     * @return Specifies the type of tokens that should be returned by
     * the mount. Valid values are &#34;default-service&#34;, &#34;default-batch&#34;, &#34;service&#34;, &#34;batch&#34;.
     * 
     */
    public Optional<Output<String>> tokenType() {
        return Optional.ofNullable(this.tokenType);
    }

    private AuthBackendTuneArgs() {}

    private AuthBackendTuneArgs(AuthBackendTuneArgs $) {
        this.allowedResponseHeaders = $.allowedResponseHeaders;
        this.auditNonHmacRequestKeys = $.auditNonHmacRequestKeys;
        this.auditNonHmacResponseKeys = $.auditNonHmacResponseKeys;
        this.defaultLeaseTtl = $.defaultLeaseTtl;
        this.listingVisibility = $.listingVisibility;
        this.maxLeaseTtl = $.maxLeaseTtl;
        this.passthroughRequestHeaders = $.passthroughRequestHeaders;
        this.tokenType = $.tokenType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthBackendTuneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthBackendTuneArgs $;

        public Builder() {
            $ = new AuthBackendTuneArgs();
        }

        public Builder(AuthBackendTuneArgs defaults) {
            $ = new AuthBackendTuneArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedResponseHeaders List of headers to whitelist and allowing
         * a plugin to include them in the response.
         * 
         * @return builder
         * 
         */
        public Builder allowedResponseHeaders(@Nullable Output<List<String>> allowedResponseHeaders) {
            $.allowedResponseHeaders = allowedResponseHeaders;
            return this;
        }

        /**
         * @param allowedResponseHeaders List of headers to whitelist and allowing
         * a plugin to include them in the response.
         * 
         * @return builder
         * 
         */
        public Builder allowedResponseHeaders(List<String> allowedResponseHeaders) {
            return allowedResponseHeaders(Output.of(allowedResponseHeaders));
        }

        /**
         * @param allowedResponseHeaders List of headers to whitelist and allowing
         * a plugin to include them in the response.
         * 
         * @return builder
         * 
         */
        public Builder allowedResponseHeaders(String... allowedResponseHeaders) {
            return allowedResponseHeaders(List.of(allowedResponseHeaders));
        }

        /**
         * @param auditNonHmacRequestKeys Specifies the list of keys that will
         * not be HMAC&#39;d by audit devices in the request data object.
         * 
         * @return builder
         * 
         */
        public Builder auditNonHmacRequestKeys(@Nullable Output<List<String>> auditNonHmacRequestKeys) {
            $.auditNonHmacRequestKeys = auditNonHmacRequestKeys;
            return this;
        }

        /**
         * @param auditNonHmacRequestKeys Specifies the list of keys that will
         * not be HMAC&#39;d by audit devices in the request data object.
         * 
         * @return builder
         * 
         */
        public Builder auditNonHmacRequestKeys(List<String> auditNonHmacRequestKeys) {
            return auditNonHmacRequestKeys(Output.of(auditNonHmacRequestKeys));
        }

        /**
         * @param auditNonHmacRequestKeys Specifies the list of keys that will
         * not be HMAC&#39;d by audit devices in the request data object.
         * 
         * @return builder
         * 
         */
        public Builder auditNonHmacRequestKeys(String... auditNonHmacRequestKeys) {
            return auditNonHmacRequestKeys(List.of(auditNonHmacRequestKeys));
        }

        /**
         * @param auditNonHmacResponseKeys Specifies the list of keys that will
         * not be HMAC&#39;d by audit devices in the response data object.
         * 
         * @return builder
         * 
         */
        public Builder auditNonHmacResponseKeys(@Nullable Output<List<String>> auditNonHmacResponseKeys) {
            $.auditNonHmacResponseKeys = auditNonHmacResponseKeys;
            return this;
        }

        /**
         * @param auditNonHmacResponseKeys Specifies the list of keys that will
         * not be HMAC&#39;d by audit devices in the response data object.
         * 
         * @return builder
         * 
         */
        public Builder auditNonHmacResponseKeys(List<String> auditNonHmacResponseKeys) {
            return auditNonHmacResponseKeys(Output.of(auditNonHmacResponseKeys));
        }

        /**
         * @param auditNonHmacResponseKeys Specifies the list of keys that will
         * not be HMAC&#39;d by audit devices in the response data object.
         * 
         * @return builder
         * 
         */
        public Builder auditNonHmacResponseKeys(String... auditNonHmacResponseKeys) {
            return auditNonHmacResponseKeys(List.of(auditNonHmacResponseKeys));
        }

        /**
         * @param defaultLeaseTtl Specifies the default time-to-live.
         * If set, this overrides the global default.
         * Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
         * 
         * @return builder
         * 
         */
        public Builder defaultLeaseTtl(@Nullable Output<String> defaultLeaseTtl) {
            $.defaultLeaseTtl = defaultLeaseTtl;
            return this;
        }

        /**
         * @param defaultLeaseTtl Specifies the default time-to-live.
         * If set, this overrides the global default.
         * Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
         * 
         * @return builder
         * 
         */
        public Builder defaultLeaseTtl(String defaultLeaseTtl) {
            return defaultLeaseTtl(Output.of(defaultLeaseTtl));
        }

        /**
         * @param listingVisibility Specifies whether to show this mount in
         * the UI-specific listing endpoint. Valid values are &#34;unauth&#34; or &#34;hidden&#34;.
         * 
         * @return builder
         * 
         */
        public Builder listingVisibility(@Nullable Output<String> listingVisibility) {
            $.listingVisibility = listingVisibility;
            return this;
        }

        /**
         * @param listingVisibility Specifies whether to show this mount in
         * the UI-specific listing endpoint. Valid values are &#34;unauth&#34; or &#34;hidden&#34;.
         * 
         * @return builder
         * 
         */
        public Builder listingVisibility(String listingVisibility) {
            return listingVisibility(Output.of(listingVisibility));
        }

        /**
         * @param maxLeaseTtl Specifies the maximum time-to-live.
         * If set, this overrides the global default.
         * Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
         * 
         * @return builder
         * 
         */
        public Builder maxLeaseTtl(@Nullable Output<String> maxLeaseTtl) {
            $.maxLeaseTtl = maxLeaseTtl;
            return this;
        }

        /**
         * @param maxLeaseTtl Specifies the maximum time-to-live.
         * If set, this overrides the global default.
         * Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
         * 
         * @return builder
         * 
         */
        public Builder maxLeaseTtl(String maxLeaseTtl) {
            return maxLeaseTtl(Output.of(maxLeaseTtl));
        }

        /**
         * @param passthroughRequestHeaders List of headers to whitelist and
         * pass from the request to the backend.
         * 
         * @return builder
         * 
         */
        public Builder passthroughRequestHeaders(@Nullable Output<List<String>> passthroughRequestHeaders) {
            $.passthroughRequestHeaders = passthroughRequestHeaders;
            return this;
        }

        /**
         * @param passthroughRequestHeaders List of headers to whitelist and
         * pass from the request to the backend.
         * 
         * @return builder
         * 
         */
        public Builder passthroughRequestHeaders(List<String> passthroughRequestHeaders) {
            return passthroughRequestHeaders(Output.of(passthroughRequestHeaders));
        }

        /**
         * @param passthroughRequestHeaders List of headers to whitelist and
         * pass from the request to the backend.
         * 
         * @return builder
         * 
         */
        public Builder passthroughRequestHeaders(String... passthroughRequestHeaders) {
            return passthroughRequestHeaders(List.of(passthroughRequestHeaders));
        }

        /**
         * @param tokenType Specifies the type of tokens that should be returned by
         * the mount. Valid values are &#34;default-service&#34;, &#34;default-batch&#34;, &#34;service&#34;, &#34;batch&#34;.
         * 
         * @return builder
         * 
         */
        public Builder tokenType(@Nullable Output<String> tokenType) {
            $.tokenType = tokenType;
            return this;
        }

        /**
         * @param tokenType Specifies the type of tokens that should be returned by
         * the mount. Valid values are &#34;default-service&#34;, &#34;default-batch&#34;, &#34;service&#34;, &#34;batch&#34;.
         * 
         * @return builder
         * 
         */
        public Builder tokenType(String tokenType) {
            return tokenType(Output.of(tokenType));
        }

        public AuthBackendTuneArgs build() {
            return $;
        }
    }

}
