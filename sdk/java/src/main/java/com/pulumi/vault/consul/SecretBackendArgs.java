// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.consul;

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
     * Specifies the address of the Consul instance, provided as &#34;host:port&#34; like &#34;127.0.0.1:8500&#34;.
     * 
     */
    @Import(name="address", required=true)
    private Output<String> address;

    /**
     * @return Specifies the address of the Consul instance, provided as &#34;host:port&#34; like &#34;127.0.0.1:8500&#34;.
     * 
     */
    public Output<String> address() {
        return this.address;
    }

    /**
     * Denotes that the resource is used to bootstrap the Consul ACL system.
     * 
     */
    @Import(name="bootstrap")
    private @Nullable Output<Boolean> bootstrap;

    /**
     * @return Denotes that the resource is used to bootstrap the Consul ACL system.
     * 
     */
    public Optional<Output<Boolean>> bootstrap() {
        return Optional.ofNullable(this.bootstrap);
    }

    /**
     * CA certificate to use when verifying Consul server certificate, must be x509 PEM encoded.
     * 
     */
    @Import(name="caCert")
    private @Nullable Output<String> caCert;

    /**
     * @return CA certificate to use when verifying Consul server certificate, must be x509 PEM encoded.
     * 
     */
    public Optional<Output<String>> caCert() {
        return Optional.ofNullable(this.caCert);
    }

    /**
     * Client certificate used for Consul&#39;s TLS communication, must be x509 PEM encoded and if
     * this is set you need to also set client_key.
     * 
     */
    @Import(name="clientCert")
    private @Nullable Output<String> clientCert;

    /**
     * @return Client certificate used for Consul&#39;s TLS communication, must be x509 PEM encoded and if
     * this is set you need to also set client_key.
     * 
     */
    public Optional<Output<String>> clientCert() {
        return Optional.ofNullable(this.clientCert);
    }

    /**
     * Client key used for Consul&#39;s TLS communication, must be x509 PEM encoded and if this is set
     * you need to also set client_cert.
     * 
     */
    @Import(name="clientKey")
    private @Nullable Output<String> clientKey;

    /**
     * @return Client key used for Consul&#39;s TLS communication, must be x509 PEM encoded and if this is set
     * you need to also set client_cert.
     * 
     */
    public Optional<Output<String>> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }

    /**
     * The default TTL for credentials issued by this backend.
     * 
     */
    @Import(name="defaultLeaseTtlSeconds")
    private @Nullable Output<Integer> defaultLeaseTtlSeconds;

    /**
     * @return The default TTL for credentials issued by this backend.
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
     * Specifies if the secret backend is local only.
     * 
     */
    @Import(name="local")
    private @Nullable Output<Boolean> local;

    /**
     * @return Specifies if the secret backend is local only.
     * 
     */
    public Optional<Output<Boolean>> local() {
        return Optional.ofNullable(this.local);
    }

    /**
     * The maximum TTL that can be requested
     * for credentials issued by this backend.
     * 
     */
    @Import(name="maxLeaseTtlSeconds")
    private @Nullable Output<Integer> maxLeaseTtlSeconds;

    /**
     * @return The maximum TTL that can be requested
     * for credentials issued by this backend.
     * 
     */
    public Optional<Output<Integer>> maxLeaseTtlSeconds() {
        return Optional.ofNullable(this.maxLeaseTtlSeconds);
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
     * The unique location this backend should be mounted at. Must not begin or end with a `/`. Defaults
     * to `consul`.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The unique location this backend should be mounted at. Must not begin or end with a `/`. Defaults
     * to `consul`.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Specifies the URL scheme to use. Defaults to `http`.
     * 
     */
    @Import(name="scheme")
    private @Nullable Output<String> scheme;

    /**
     * @return Specifies the URL scheme to use. Defaults to `http`.
     * 
     */
    public Optional<Output<String>> scheme() {
        return Optional.ofNullable(this.scheme);
    }

    /**
     * The Consul management token this backend should use to issue new tokens. This field is required
     * when `bootstrap` is false.
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return The Consul management token this backend should use to issue new tokens. This field is required
     * when `bootstrap` is false.
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    private SecretBackendArgs() {}

    private SecretBackendArgs(SecretBackendArgs $) {
        this.address = $.address;
        this.bootstrap = $.bootstrap;
        this.caCert = $.caCert;
        this.clientCert = $.clientCert;
        this.clientKey = $.clientKey;
        this.defaultLeaseTtlSeconds = $.defaultLeaseTtlSeconds;
        this.description = $.description;
        this.disableRemount = $.disableRemount;
        this.local = $.local;
        this.maxLeaseTtlSeconds = $.maxLeaseTtlSeconds;
        this.namespace = $.namespace;
        this.path = $.path;
        this.scheme = $.scheme;
        this.token = $.token;
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
         * @param address Specifies the address of the Consul instance, provided as &#34;host:port&#34; like &#34;127.0.0.1:8500&#34;.
         * 
         * @return builder
         * 
         */
        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address Specifies the address of the Consul instance, provided as &#34;host:port&#34; like &#34;127.0.0.1:8500&#34;.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param bootstrap Denotes that the resource is used to bootstrap the Consul ACL system.
         * 
         * @return builder
         * 
         */
        public Builder bootstrap(@Nullable Output<Boolean> bootstrap) {
            $.bootstrap = bootstrap;
            return this;
        }

        /**
         * @param bootstrap Denotes that the resource is used to bootstrap the Consul ACL system.
         * 
         * @return builder
         * 
         */
        public Builder bootstrap(Boolean bootstrap) {
            return bootstrap(Output.of(bootstrap));
        }

        /**
         * @param caCert CA certificate to use when verifying Consul server certificate, must be x509 PEM encoded.
         * 
         * @return builder
         * 
         */
        public Builder caCert(@Nullable Output<String> caCert) {
            $.caCert = caCert;
            return this;
        }

        /**
         * @param caCert CA certificate to use when verifying Consul server certificate, must be x509 PEM encoded.
         * 
         * @return builder
         * 
         */
        public Builder caCert(String caCert) {
            return caCert(Output.of(caCert));
        }

        /**
         * @param clientCert Client certificate used for Consul&#39;s TLS communication, must be x509 PEM encoded and if
         * this is set you need to also set client_key.
         * 
         * @return builder
         * 
         */
        public Builder clientCert(@Nullable Output<String> clientCert) {
            $.clientCert = clientCert;
            return this;
        }

        /**
         * @param clientCert Client certificate used for Consul&#39;s TLS communication, must be x509 PEM encoded and if
         * this is set you need to also set client_key.
         * 
         * @return builder
         * 
         */
        public Builder clientCert(String clientCert) {
            return clientCert(Output.of(clientCert));
        }

        /**
         * @param clientKey Client key used for Consul&#39;s TLS communication, must be x509 PEM encoded and if this is set
         * you need to also set client_cert.
         * 
         * @return builder
         * 
         */
        public Builder clientKey(@Nullable Output<String> clientKey) {
            $.clientKey = clientKey;
            return this;
        }

        /**
         * @param clientKey Client key used for Consul&#39;s TLS communication, must be x509 PEM encoded and if this is set
         * you need to also set client_cert.
         * 
         * @return builder
         * 
         */
        public Builder clientKey(String clientKey) {
            return clientKey(Output.of(clientKey));
        }

        /**
         * @param defaultLeaseTtlSeconds The default TTL for credentials issued by this backend.
         * 
         * @return builder
         * 
         */
        public Builder defaultLeaseTtlSeconds(@Nullable Output<Integer> defaultLeaseTtlSeconds) {
            $.defaultLeaseTtlSeconds = defaultLeaseTtlSeconds;
            return this;
        }

        /**
         * @param defaultLeaseTtlSeconds The default TTL for credentials issued by this backend.
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
         * @param local Specifies if the secret backend is local only.
         * 
         * @return builder
         * 
         */
        public Builder local(@Nullable Output<Boolean> local) {
            $.local = local;
            return this;
        }

        /**
         * @param local Specifies if the secret backend is local only.
         * 
         * @return builder
         * 
         */
        public Builder local(Boolean local) {
            return local(Output.of(local));
        }

        /**
         * @param maxLeaseTtlSeconds The maximum TTL that can be requested
         * for credentials issued by this backend.
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
         * for credentials issued by this backend.
         * 
         * @return builder
         * 
         */
        public Builder maxLeaseTtlSeconds(Integer maxLeaseTtlSeconds) {
            return maxLeaseTtlSeconds(Output.of(maxLeaseTtlSeconds));
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
         * @param path The unique location this backend should be mounted at. Must not begin or end with a `/`. Defaults
         * to `consul`.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The unique location this backend should be mounted at. Must not begin or end with a `/`. Defaults
         * to `consul`.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param scheme Specifies the URL scheme to use. Defaults to `http`.
         * 
         * @return builder
         * 
         */
        public Builder scheme(@Nullable Output<String> scheme) {
            $.scheme = scheme;
            return this;
        }

        /**
         * @param scheme Specifies the URL scheme to use. Defaults to `http`.
         * 
         * @return builder
         * 
         */
        public Builder scheme(String scheme) {
            return scheme(Output.of(scheme));
        }

        /**
         * @param token The Consul management token this backend should use to issue new tokens. This field is required
         * when `bootstrap` is false.
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token The Consul management token this backend should use to issue new tokens. This field is required
         * when `bootstrap` is false.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public SecretBackendArgs build() {
            $.address = Objects.requireNonNull($.address, "expected parameter 'address' to be non-null");
            return $;
        }
    }

}
