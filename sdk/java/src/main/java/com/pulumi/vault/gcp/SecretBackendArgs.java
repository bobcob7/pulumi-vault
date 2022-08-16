// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.gcp;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretBackendArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretBackendArgs Empty = new SecretBackendArgs();

    /**
     * The GCP service account credentials in JSON format.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<String> credentials;

    /**
     * @return The GCP service account credentials in JSON format.
     * 
     */
    public Optional<Output<String>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The default TTL for credentials
     * issued by this backend. Defaults to &#39;0&#39;.
     * 
     */
    @Import(name="defaultLeaseTtlSeconds")
    private @Nullable Output<Integer> defaultLeaseTtlSeconds;

    /**
     * @return The default TTL for credentials
     * issued by this backend. Defaults to &#39;0&#39;.
     * 
     */
    public Optional<Output<Integer>> defaultLeaseTtlSeconds() {
        return Optional.ofNullable(this.defaultLeaseTtlSeconds);
    }

    /**
     * A human-friendly description for this backend.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A human-friendly description for this backend.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Boolean flag that can be explicitly set to true to enforce local mount in HA environment
     * 
     */
    @Import(name="local")
    private @Nullable Output<Boolean> local;

    /**
     * @return Boolean flag that can be explicitly set to true to enforce local mount in HA environment
     * 
     */
    public Optional<Output<Boolean>> local() {
        return Optional.ofNullable(this.local);
    }

    /**
     * The maximum TTL that can be requested
     * for credentials issued by this backend. Defaults to &#39;0&#39;.
     * 
     */
    @Import(name="maxLeaseTtlSeconds")
    private @Nullable Output<Integer> maxLeaseTtlSeconds;

    /**
     * @return The maximum TTL that can be requested
     * for credentials issued by this backend. Defaults to &#39;0&#39;.
     * 
     */
    public Optional<Output<Integer>> maxLeaseTtlSeconds() {
        return Optional.ofNullable(this.maxLeaseTtlSeconds);
    }

    /**
     * The unique path this backend should be mounted at. Must
     * not begin or end with a `/`. Defaults to `gcp`.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The unique path this backend should be mounted at. Must
     * not begin or end with a `/`. Defaults to `gcp`.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    private SecretBackendArgs() {}

    private SecretBackendArgs(SecretBackendArgs $) {
        this.credentials = $.credentials;
        this.defaultLeaseTtlSeconds = $.defaultLeaseTtlSeconds;
        this.description = $.description;
        this.local = $.local;
        this.maxLeaseTtlSeconds = $.maxLeaseTtlSeconds;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretBackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretBackendArgs $;

        public Builder() {
            $ = new SecretBackendArgs();
        }

        public Builder(SecretBackendArgs defaults) {
            $ = new SecretBackendArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param credentials The GCP service account credentials in JSON format.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<String> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The GCP service account credentials in JSON format.
         * 
         * @return builder
         * 
         */
        public Builder credentials(String credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param defaultLeaseTtlSeconds The default TTL for credentials
         * issued by this backend. Defaults to &#39;0&#39;.
         * 
         * @return builder
         * 
         */
        public Builder defaultLeaseTtlSeconds(@Nullable Output<Integer> defaultLeaseTtlSeconds) {
            $.defaultLeaseTtlSeconds = defaultLeaseTtlSeconds;
            return this;
        }

        /**
         * @param defaultLeaseTtlSeconds The default TTL for credentials
         * issued by this backend. Defaults to &#39;0&#39;.
         * 
         * @return builder
         * 
         */
        public Builder defaultLeaseTtlSeconds(Integer defaultLeaseTtlSeconds) {
            return defaultLeaseTtlSeconds(Output.of(defaultLeaseTtlSeconds));
        }

        /**
         * @param description A human-friendly description for this backend.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A human-friendly description for this backend.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param local Boolean flag that can be explicitly set to true to enforce local mount in HA environment
         * 
         * @return builder
         * 
         */
        public Builder local(@Nullable Output<Boolean> local) {
            $.local = local;
            return this;
        }

        /**
         * @param local Boolean flag that can be explicitly set to true to enforce local mount in HA environment
         * 
         * @return builder
         * 
         */
        public Builder local(Boolean local) {
            return local(Output.of(local));
        }

        /**
         * @param maxLeaseTtlSeconds The maximum TTL that can be requested
         * for credentials issued by this backend. Defaults to &#39;0&#39;.
         * 
         * @return builder
         * 
         */
        public Builder maxLeaseTtlSeconds(@Nullable Output<Integer> maxLeaseTtlSeconds) {
            $.maxLeaseTtlSeconds = maxLeaseTtlSeconds;
            return this;
        }

        /**
         * @param maxLeaseTtlSeconds The maximum TTL that can be requested
         * for credentials issued by this backend. Defaults to &#39;0&#39;.
         * 
         * @return builder
         * 
         */
        public Builder maxLeaseTtlSeconds(Integer maxLeaseTtlSeconds) {
            return maxLeaseTtlSeconds(Output.of(maxLeaseTtlSeconds));
        }

        /**
         * @param path The unique path this backend should be mounted at. Must
         * not begin or end with a `/`. Defaults to `gcp`.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The unique path this backend should be mounted at. Must
         * not begin or end with a `/`. Defaults to `gcp`.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public SecretBackendArgs build() {
            return $;
        }
    }

}
