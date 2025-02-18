// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.kmip.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretBackendState extends com.pulumi.resources.ResourceArgs {

    public static final SecretBackendState Empty = new SecretBackendState();

    /**
     * Client certificate key bits, valid values depend on key type.
     * 
     */
    @Import(name="defaultTlsClientKeyBits")
    private @Nullable Output<Integer> defaultTlsClientKeyBits;

    /**
     * @return Client certificate key bits, valid values depend on key type.
     * 
     */
    public Optional<Output<Integer>> defaultTlsClientKeyBits() {
        return Optional.ofNullable(this.defaultTlsClientKeyBits);
    }

    /**
     * Client certificate key type, `rsa` or `ec`.
     * 
     */
    @Import(name="defaultTlsClientKeyType")
    private @Nullable Output<String> defaultTlsClientKeyType;

    /**
     * @return Client certificate key type, `rsa` or `ec`.
     * 
     */
    public Optional<Output<String>> defaultTlsClientKeyType() {
        return Optional.ofNullable(this.defaultTlsClientKeyType);
    }

    /**
     * Client certificate TTL in seconds
     * 
     */
    @Import(name="defaultTlsClientTtl")
    private @Nullable Output<Integer> defaultTlsClientTtl;

    /**
     * @return Client certificate TTL in seconds
     * 
     */
    public Optional<Output<Integer>> defaultTlsClientTtl() {
        return Optional.ofNullable(this.defaultTlsClientTtl);
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
     * If set, opts out of mount migration on path updates.
     * See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
     * 
     */
    @Import(name="disableRemount")
    private @Nullable Output<Boolean> disableRemount;

    /**
     * @return If set, opts out of mount migration on path updates.
     * See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
     * 
     */
    public Optional<Output<Boolean>> disableRemount() {
        return Optional.ofNullable(this.disableRemount);
    }

    /**
     * Addresses the KMIP server should listen on (`host:port`).
     * 
     */
    @Import(name="listenAddrs")
    private @Nullable Output<List<String>> listenAddrs;

    /**
     * @return Addresses the KMIP server should listen on (`host:port`).
     * 
     */
    public Optional<Output<List<String>>> listenAddrs() {
        return Optional.ofNullable(this.listenAddrs);
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
     * The unique path this backend should be mounted at. Must
     * not begin or end with a `/`. Defaults to `kmip`.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The unique path this backend should be mounted at. Must
     * not begin or end with a `/`. Defaults to `kmip`.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Hostnames to include in the server&#39;s TLS certificate as SAN DNS names. The first will be used as the common name (CN).
     * 
     */
    @Import(name="serverHostnames")
    private @Nullable Output<List<String>> serverHostnames;

    /**
     * @return Hostnames to include in the server&#39;s TLS certificate as SAN DNS names. The first will be used as the common name (CN).
     * 
     */
    public Optional<Output<List<String>>> serverHostnames() {
        return Optional.ofNullable(this.serverHostnames);
    }

    /**
     * IPs to include in the server&#39;s TLS certificate as SAN IP addresses.
     * 
     */
    @Import(name="serverIps")
    private @Nullable Output<List<String>> serverIps;

    /**
     * @return IPs to include in the server&#39;s TLS certificate as SAN IP addresses.
     * 
     */
    public Optional<Output<List<String>>> serverIps() {
        return Optional.ofNullable(this.serverIps);
    }

    /**
     * CA key bits, valid values depend on key type.
     * 
     */
    @Import(name="tlsCaKeyBits")
    private @Nullable Output<Integer> tlsCaKeyBits;

    /**
     * @return CA key bits, valid values depend on key type.
     * 
     */
    public Optional<Output<Integer>> tlsCaKeyBits() {
        return Optional.ofNullable(this.tlsCaKeyBits);
    }

    /**
     * CA key type, rsa or ec.
     * 
     */
    @Import(name="tlsCaKeyType")
    private @Nullable Output<String> tlsCaKeyType;

    /**
     * @return CA key type, rsa or ec.
     * 
     */
    public Optional<Output<String>> tlsCaKeyType() {
        return Optional.ofNullable(this.tlsCaKeyType);
    }

    /**
     * Minimum TLS version to accept.
     * 
     */
    @Import(name="tlsMinVersion")
    private @Nullable Output<String> tlsMinVersion;

    /**
     * @return Minimum TLS version to accept.
     * 
     */
    public Optional<Output<String>> tlsMinVersion() {
        return Optional.ofNullable(this.tlsMinVersion);
    }

    private SecretBackendState() {}

    private SecretBackendState(SecretBackendState $) {
        this.defaultTlsClientKeyBits = $.defaultTlsClientKeyBits;
        this.defaultTlsClientKeyType = $.defaultTlsClientKeyType;
        this.defaultTlsClientTtl = $.defaultTlsClientTtl;
        this.description = $.description;
        this.disableRemount = $.disableRemount;
        this.listenAddrs = $.listenAddrs;
        this.namespace = $.namespace;
        this.path = $.path;
        this.serverHostnames = $.serverHostnames;
        this.serverIps = $.serverIps;
        this.tlsCaKeyBits = $.tlsCaKeyBits;
        this.tlsCaKeyType = $.tlsCaKeyType;
        this.tlsMinVersion = $.tlsMinVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretBackendState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretBackendState $;

        public Builder() {
            $ = new SecretBackendState();
        }

        public Builder(SecretBackendState defaults) {
            $ = new SecretBackendState(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultTlsClientKeyBits Client certificate key bits, valid values depend on key type.
         * 
         * @return builder
         * 
         */
        public Builder defaultTlsClientKeyBits(@Nullable Output<Integer> defaultTlsClientKeyBits) {
            $.defaultTlsClientKeyBits = defaultTlsClientKeyBits;
            return this;
        }

        /**
         * @param defaultTlsClientKeyBits Client certificate key bits, valid values depend on key type.
         * 
         * @return builder
         * 
         */
        public Builder defaultTlsClientKeyBits(Integer defaultTlsClientKeyBits) {
            return defaultTlsClientKeyBits(Output.of(defaultTlsClientKeyBits));
        }

        /**
         * @param defaultTlsClientKeyType Client certificate key type, `rsa` or `ec`.
         * 
         * @return builder
         * 
         */
        public Builder defaultTlsClientKeyType(@Nullable Output<String> defaultTlsClientKeyType) {
            $.defaultTlsClientKeyType = defaultTlsClientKeyType;
            return this;
        }

        /**
         * @param defaultTlsClientKeyType Client certificate key type, `rsa` or `ec`.
         * 
         * @return builder
         * 
         */
        public Builder defaultTlsClientKeyType(String defaultTlsClientKeyType) {
            return defaultTlsClientKeyType(Output.of(defaultTlsClientKeyType));
        }

        /**
         * @param defaultTlsClientTtl Client certificate TTL in seconds
         * 
         * @return builder
         * 
         */
        public Builder defaultTlsClientTtl(@Nullable Output<Integer> defaultTlsClientTtl) {
            $.defaultTlsClientTtl = defaultTlsClientTtl;
            return this;
        }

        /**
         * @param defaultTlsClientTtl Client certificate TTL in seconds
         * 
         * @return builder
         * 
         */
        public Builder defaultTlsClientTtl(Integer defaultTlsClientTtl) {
            return defaultTlsClientTtl(Output.of(defaultTlsClientTtl));
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
         * @param disableRemount If set, opts out of mount migration on path updates.
         * See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
         * 
         * @return builder
         * 
         */
        public Builder disableRemount(@Nullable Output<Boolean> disableRemount) {
            $.disableRemount = disableRemount;
            return this;
        }

        /**
         * @param disableRemount If set, opts out of mount migration on path updates.
         * See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
         * 
         * @return builder
         * 
         */
        public Builder disableRemount(Boolean disableRemount) {
            return disableRemount(Output.of(disableRemount));
        }

        /**
         * @param listenAddrs Addresses the KMIP server should listen on (`host:port`).
         * 
         * @return builder
         * 
         */
        public Builder listenAddrs(@Nullable Output<List<String>> listenAddrs) {
            $.listenAddrs = listenAddrs;
            return this;
        }

        /**
         * @param listenAddrs Addresses the KMIP server should listen on (`host:port`).
         * 
         * @return builder
         * 
         */
        public Builder listenAddrs(List<String> listenAddrs) {
            return listenAddrs(Output.of(listenAddrs));
        }

        /**
         * @param listenAddrs Addresses the KMIP server should listen on (`host:port`).
         * 
         * @return builder
         * 
         */
        public Builder listenAddrs(String... listenAddrs) {
            return listenAddrs(List.of(listenAddrs));
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
         * @param path The unique path this backend should be mounted at. Must
         * not begin or end with a `/`. Defaults to `kmip`.
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
         * not begin or end with a `/`. Defaults to `kmip`.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param serverHostnames Hostnames to include in the server&#39;s TLS certificate as SAN DNS names. The first will be used as the common name (CN).
         * 
         * @return builder
         * 
         */
        public Builder serverHostnames(@Nullable Output<List<String>> serverHostnames) {
            $.serverHostnames = serverHostnames;
            return this;
        }

        /**
         * @param serverHostnames Hostnames to include in the server&#39;s TLS certificate as SAN DNS names. The first will be used as the common name (CN).
         * 
         * @return builder
         * 
         */
        public Builder serverHostnames(List<String> serverHostnames) {
            return serverHostnames(Output.of(serverHostnames));
        }

        /**
         * @param serverHostnames Hostnames to include in the server&#39;s TLS certificate as SAN DNS names. The first will be used as the common name (CN).
         * 
         * @return builder
         * 
         */
        public Builder serverHostnames(String... serverHostnames) {
            return serverHostnames(List.of(serverHostnames));
        }

        /**
         * @param serverIps IPs to include in the server&#39;s TLS certificate as SAN IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder serverIps(@Nullable Output<List<String>> serverIps) {
            $.serverIps = serverIps;
            return this;
        }

        /**
         * @param serverIps IPs to include in the server&#39;s TLS certificate as SAN IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder serverIps(List<String> serverIps) {
            return serverIps(Output.of(serverIps));
        }

        /**
         * @param serverIps IPs to include in the server&#39;s TLS certificate as SAN IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder serverIps(String... serverIps) {
            return serverIps(List.of(serverIps));
        }

        /**
         * @param tlsCaKeyBits CA key bits, valid values depend on key type.
         * 
         * @return builder
         * 
         */
        public Builder tlsCaKeyBits(@Nullable Output<Integer> tlsCaKeyBits) {
            $.tlsCaKeyBits = tlsCaKeyBits;
            return this;
        }

        /**
         * @param tlsCaKeyBits CA key bits, valid values depend on key type.
         * 
         * @return builder
         * 
         */
        public Builder tlsCaKeyBits(Integer tlsCaKeyBits) {
            return tlsCaKeyBits(Output.of(tlsCaKeyBits));
        }

        /**
         * @param tlsCaKeyType CA key type, rsa or ec.
         * 
         * @return builder
         * 
         */
        public Builder tlsCaKeyType(@Nullable Output<String> tlsCaKeyType) {
            $.tlsCaKeyType = tlsCaKeyType;
            return this;
        }

        /**
         * @param tlsCaKeyType CA key type, rsa or ec.
         * 
         * @return builder
         * 
         */
        public Builder tlsCaKeyType(String tlsCaKeyType) {
            return tlsCaKeyType(Output.of(tlsCaKeyType));
        }

        /**
         * @param tlsMinVersion Minimum TLS version to accept.
         * 
         * @return builder
         * 
         */
        public Builder tlsMinVersion(@Nullable Output<String> tlsMinVersion) {
            $.tlsMinVersion = tlsMinVersion;
            return this;
        }

        /**
         * @param tlsMinVersion Minimum TLS version to accept.
         * 
         * @return builder
         * 
         */
        public Builder tlsMinVersion(String tlsMinVersion) {
            return tlsMinVersion(Output.of(tlsMinVersion));
        }

        public SecretBackendState build() {
            return $;
        }
    }

}
