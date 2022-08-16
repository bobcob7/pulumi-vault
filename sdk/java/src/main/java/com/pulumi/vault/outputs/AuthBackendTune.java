// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AuthBackendTune {
    /**
     * @return List of headers to whitelist and allowing
     * a plugin to include them in the response.
     * 
     */
    private final @Nullable List<String> allowedResponseHeaders;
    /**
     * @return Specifies the list of keys that will
     * not be HMAC&#39;d by audit devices in the request data object.
     * 
     */
    private final @Nullable List<String> auditNonHmacRequestKeys;
    /**
     * @return Specifies the list of keys that will
     * not be HMAC&#39;d by audit devices in the response data object.
     * 
     */
    private final @Nullable List<String> auditNonHmacResponseKeys;
    /**
     * @return Specifies the default time-to-live.
     * If set, this overrides the global default.
     * Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
     * 
     */
    private final @Nullable String defaultLeaseTtl;
    /**
     * @return Specifies whether to show this mount in
     * the UI-specific listing endpoint. Valid values are &#34;unauth&#34; or &#34;hidden&#34;.
     * 
     */
    private final @Nullable String listingVisibility;
    /**
     * @return Specifies the maximum time-to-live.
     * If set, this overrides the global default.
     * Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
     * 
     */
    private final @Nullable String maxLeaseTtl;
    /**
     * @return List of headers to whitelist and
     * pass from the request to the backend.
     * 
     */
    private final @Nullable List<String> passthroughRequestHeaders;
    /**
     * @return Specifies the type of tokens that should be returned by
     * the mount. Valid values are &#34;default-service&#34;, &#34;default-batch&#34;, &#34;service&#34;, &#34;batch&#34;.
     * 
     */
    private final @Nullable String tokenType;

    @CustomType.Constructor
    private AuthBackendTune(
        @CustomType.Parameter("allowedResponseHeaders") @Nullable List<String> allowedResponseHeaders,
        @CustomType.Parameter("auditNonHmacRequestKeys") @Nullable List<String> auditNonHmacRequestKeys,
        @CustomType.Parameter("auditNonHmacResponseKeys") @Nullable List<String> auditNonHmacResponseKeys,
        @CustomType.Parameter("defaultLeaseTtl") @Nullable String defaultLeaseTtl,
        @CustomType.Parameter("listingVisibility") @Nullable String listingVisibility,
        @CustomType.Parameter("maxLeaseTtl") @Nullable String maxLeaseTtl,
        @CustomType.Parameter("passthroughRequestHeaders") @Nullable List<String> passthroughRequestHeaders,
        @CustomType.Parameter("tokenType") @Nullable String tokenType) {
        this.allowedResponseHeaders = allowedResponseHeaders;
        this.auditNonHmacRequestKeys = auditNonHmacRequestKeys;
        this.auditNonHmacResponseKeys = auditNonHmacResponseKeys;
        this.defaultLeaseTtl = defaultLeaseTtl;
        this.listingVisibility = listingVisibility;
        this.maxLeaseTtl = maxLeaseTtl;
        this.passthroughRequestHeaders = passthroughRequestHeaders;
        this.tokenType = tokenType;
    }

    /**
     * @return List of headers to whitelist and allowing
     * a plugin to include them in the response.
     * 
     */
    public List<String> allowedResponseHeaders() {
        return this.allowedResponseHeaders == null ? List.of() : this.allowedResponseHeaders;
    }
    /**
     * @return Specifies the list of keys that will
     * not be HMAC&#39;d by audit devices in the request data object.
     * 
     */
    public List<String> auditNonHmacRequestKeys() {
        return this.auditNonHmacRequestKeys == null ? List.of() : this.auditNonHmacRequestKeys;
    }
    /**
     * @return Specifies the list of keys that will
     * not be HMAC&#39;d by audit devices in the response data object.
     * 
     */
    public List<String> auditNonHmacResponseKeys() {
        return this.auditNonHmacResponseKeys == null ? List.of() : this.auditNonHmacResponseKeys;
    }
    /**
     * @return Specifies the default time-to-live.
     * If set, this overrides the global default.
     * Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
     * 
     */
    public Optional<String> defaultLeaseTtl() {
        return Optional.ofNullable(this.defaultLeaseTtl);
    }
    /**
     * @return Specifies whether to show this mount in
     * the UI-specific listing endpoint. Valid values are &#34;unauth&#34; or &#34;hidden&#34;.
     * 
     */
    public Optional<String> listingVisibility() {
        return Optional.ofNullable(this.listingVisibility);
    }
    /**
     * @return Specifies the maximum time-to-live.
     * If set, this overrides the global default.
     * Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
     * 
     */
    public Optional<String> maxLeaseTtl() {
        return Optional.ofNullable(this.maxLeaseTtl);
    }
    /**
     * @return List of headers to whitelist and
     * pass from the request to the backend.
     * 
     */
    public List<String> passthroughRequestHeaders() {
        return this.passthroughRequestHeaders == null ? List.of() : this.passthroughRequestHeaders;
    }
    /**
     * @return Specifies the type of tokens that should be returned by
     * the mount. Valid values are &#34;default-service&#34;, &#34;default-batch&#34;, &#34;service&#34;, &#34;batch&#34;.
     * 
     */
    public Optional<String> tokenType() {
        return Optional.ofNullable(this.tokenType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthBackendTune defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedResponseHeaders;
        private @Nullable List<String> auditNonHmacRequestKeys;
        private @Nullable List<String> auditNonHmacResponseKeys;
        private @Nullable String defaultLeaseTtl;
        private @Nullable String listingVisibility;
        private @Nullable String maxLeaseTtl;
        private @Nullable List<String> passthroughRequestHeaders;
        private @Nullable String tokenType;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthBackendTune defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedResponseHeaders = defaults.allowedResponseHeaders;
    	      this.auditNonHmacRequestKeys = defaults.auditNonHmacRequestKeys;
    	      this.auditNonHmacResponseKeys = defaults.auditNonHmacResponseKeys;
    	      this.defaultLeaseTtl = defaults.defaultLeaseTtl;
    	      this.listingVisibility = defaults.listingVisibility;
    	      this.maxLeaseTtl = defaults.maxLeaseTtl;
    	      this.passthroughRequestHeaders = defaults.passthroughRequestHeaders;
    	      this.tokenType = defaults.tokenType;
        }

        public Builder allowedResponseHeaders(@Nullable List<String> allowedResponseHeaders) {
            this.allowedResponseHeaders = allowedResponseHeaders;
            return this;
        }
        public Builder allowedResponseHeaders(String... allowedResponseHeaders) {
            return allowedResponseHeaders(List.of(allowedResponseHeaders));
        }
        public Builder auditNonHmacRequestKeys(@Nullable List<String> auditNonHmacRequestKeys) {
            this.auditNonHmacRequestKeys = auditNonHmacRequestKeys;
            return this;
        }
        public Builder auditNonHmacRequestKeys(String... auditNonHmacRequestKeys) {
            return auditNonHmacRequestKeys(List.of(auditNonHmacRequestKeys));
        }
        public Builder auditNonHmacResponseKeys(@Nullable List<String> auditNonHmacResponseKeys) {
            this.auditNonHmacResponseKeys = auditNonHmacResponseKeys;
            return this;
        }
        public Builder auditNonHmacResponseKeys(String... auditNonHmacResponseKeys) {
            return auditNonHmacResponseKeys(List.of(auditNonHmacResponseKeys));
        }
        public Builder defaultLeaseTtl(@Nullable String defaultLeaseTtl) {
            this.defaultLeaseTtl = defaultLeaseTtl;
            return this;
        }
        public Builder listingVisibility(@Nullable String listingVisibility) {
            this.listingVisibility = listingVisibility;
            return this;
        }
        public Builder maxLeaseTtl(@Nullable String maxLeaseTtl) {
            this.maxLeaseTtl = maxLeaseTtl;
            return this;
        }
        public Builder passthroughRequestHeaders(@Nullable List<String> passthroughRequestHeaders) {
            this.passthroughRequestHeaders = passthroughRequestHeaders;
            return this;
        }
        public Builder passthroughRequestHeaders(String... passthroughRequestHeaders) {
            return passthroughRequestHeaders(List.of(passthroughRequestHeaders));
        }
        public Builder tokenType(@Nullable String tokenType) {
            this.tokenType = tokenType;
            return this;
        }        public AuthBackendTune build() {
            return new AuthBackendTune(allowedResponseHeaders, auditNonHmacRequestKeys, auditNonHmacResponseKeys, defaultLeaseTtl, listingVisibility, maxLeaseTtl, passthroughRequestHeaders, tokenType);
        }
    }
}
