// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretBackendConnectionElasticsearchArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretBackendConnectionElasticsearchArgs Empty = new SecretBackendConnectionElasticsearchArgs();

    /**
     * The path to a PEM-encoded CA cert file to use to verify the Elasticsearch server&#39;s identity.
     * 
     */
    @Import(name="caCert")
    private @Nullable Output<String> caCert;

    /**
     * @return The path to a PEM-encoded CA cert file to use to verify the Elasticsearch server&#39;s identity.
     * 
     */
    public Optional<Output<String>> caCert() {
        return Optional.ofNullable(this.caCert);
    }

    /**
     * The path to a directory of PEM-encoded CA cert files to use to verify the Elasticsearch server&#39;s identity.
     * 
     */
    @Import(name="caPath")
    private @Nullable Output<String> caPath;

    /**
     * @return The path to a directory of PEM-encoded CA cert files to use to verify the Elasticsearch server&#39;s identity.
     * 
     */
    public Optional<Output<String>> caPath() {
        return Optional.ofNullable(this.caPath);
    }

    /**
     * The path to the certificate for the Elasticsearch client to present for communication.
     * 
     */
    @Import(name="clientCert")
    private @Nullable Output<String> clientCert;

    /**
     * @return The path to the certificate for the Elasticsearch client to present for communication.
     * 
     */
    public Optional<Output<String>> clientCert() {
        return Optional.ofNullable(this.clientCert);
    }

    /**
     * The path to the key for the Elasticsearch client to use for communication.
     * 
     */
    @Import(name="clientKey")
    private @Nullable Output<String> clientKey;

    /**
     * @return The path to the key for the Elasticsearch client to use for communication.
     * 
     */
    public Optional<Output<String>> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }

    /**
     * Whether to disable certificate verification.
     * 
     */
    @Import(name="insecure")
    private @Nullable Output<Boolean> insecure;

    /**
     * @return Whether to disable certificate verification.
     * 
     */
    public Optional<Output<Boolean>> insecure() {
        return Optional.ofNullable(this.insecure);
    }

    /**
     * The root credential password used in the connection URL.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The root credential password used in the connection URL.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * This, if set, is used to set the SNI host when connecting via TLS.
     * 
     */
    @Import(name="tlsServerName")
    private @Nullable Output<String> tlsServerName;

    /**
     * @return This, if set, is used to set the SNI host when connecting via TLS.
     * 
     */
    public Optional<Output<String>> tlsServerName() {
        return Optional.ofNullable(this.tlsServerName);
    }

    /**
     * The URL for Elasticsearch&#39;s API. https requires certificate
     * by trusted CA if used.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The URL for Elasticsearch&#39;s API. https requires certificate
     * by trusted CA if used.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     * The root credential username used in the connection URL.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The root credential username used in the connection URL.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     * - [Template](https://www.vaultproject.io/docs/concepts/username-templating) describing how dynamic usernames are generated.
     * 
     */
    @Import(name="usernameTemplate")
    private @Nullable Output<String> usernameTemplate;

    /**
     * @return - [Template](https://www.vaultproject.io/docs/concepts/username-templating) describing how dynamic usernames are generated.
     * 
     */
    public Optional<Output<String>> usernameTemplate() {
        return Optional.ofNullable(this.usernameTemplate);
    }

    private SecretBackendConnectionElasticsearchArgs() {}

    private SecretBackendConnectionElasticsearchArgs(SecretBackendConnectionElasticsearchArgs $) {
        this.caCert = $.caCert;
        this.caPath = $.caPath;
        this.clientCert = $.clientCert;
        this.clientKey = $.clientKey;
        this.insecure = $.insecure;
        this.password = $.password;
        this.tlsServerName = $.tlsServerName;
        this.url = $.url;
        this.username = $.username;
        this.usernameTemplate = $.usernameTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretBackendConnectionElasticsearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretBackendConnectionElasticsearchArgs $;

        public Builder() {
            $ = new SecretBackendConnectionElasticsearchArgs();
        }

        public Builder(SecretBackendConnectionElasticsearchArgs defaults) {
            $ = new SecretBackendConnectionElasticsearchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caCert The path to a PEM-encoded CA cert file to use to verify the Elasticsearch server&#39;s identity.
         * 
         * @return builder
         * 
         */
        public Builder caCert(@Nullable Output<String> caCert) {
            $.caCert = caCert;
            return this;
        }

        /**
         * @param caCert The path to a PEM-encoded CA cert file to use to verify the Elasticsearch server&#39;s identity.
         * 
         * @return builder
         * 
         */
        public Builder caCert(String caCert) {
            return caCert(Output.of(caCert));
        }

        /**
         * @param caPath The path to a directory of PEM-encoded CA cert files to use to verify the Elasticsearch server&#39;s identity.
         * 
         * @return builder
         * 
         */
        public Builder caPath(@Nullable Output<String> caPath) {
            $.caPath = caPath;
            return this;
        }

        /**
         * @param caPath The path to a directory of PEM-encoded CA cert files to use to verify the Elasticsearch server&#39;s identity.
         * 
         * @return builder
         * 
         */
        public Builder caPath(String caPath) {
            return caPath(Output.of(caPath));
        }

        /**
         * @param clientCert The path to the certificate for the Elasticsearch client to present for communication.
         * 
         * @return builder
         * 
         */
        public Builder clientCert(@Nullable Output<String> clientCert) {
            $.clientCert = clientCert;
            return this;
        }

        /**
         * @param clientCert The path to the certificate for the Elasticsearch client to present for communication.
         * 
         * @return builder
         * 
         */
        public Builder clientCert(String clientCert) {
            return clientCert(Output.of(clientCert));
        }

        /**
         * @param clientKey The path to the key for the Elasticsearch client to use for communication.
         * 
         * @return builder
         * 
         */
        public Builder clientKey(@Nullable Output<String> clientKey) {
            $.clientKey = clientKey;
            return this;
        }

        /**
         * @param clientKey The path to the key for the Elasticsearch client to use for communication.
         * 
         * @return builder
         * 
         */
        public Builder clientKey(String clientKey) {
            return clientKey(Output.of(clientKey));
        }

        /**
         * @param insecure Whether to disable certificate verification.
         * 
         * @return builder
         * 
         */
        public Builder insecure(@Nullable Output<Boolean> insecure) {
            $.insecure = insecure;
            return this;
        }

        /**
         * @param insecure Whether to disable certificate verification.
         * 
         * @return builder
         * 
         */
        public Builder insecure(Boolean insecure) {
            return insecure(Output.of(insecure));
        }

        /**
         * @param password The root credential password used in the connection URL.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The root credential password used in the connection URL.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param tlsServerName This, if set, is used to set the SNI host when connecting via TLS.
         * 
         * @return builder
         * 
         */
        public Builder tlsServerName(@Nullable Output<String> tlsServerName) {
            $.tlsServerName = tlsServerName;
            return this;
        }

        /**
         * @param tlsServerName This, if set, is used to set the SNI host when connecting via TLS.
         * 
         * @return builder
         * 
         */
        public Builder tlsServerName(String tlsServerName) {
            return tlsServerName(Output.of(tlsServerName));
        }

        /**
         * @param url The URL for Elasticsearch&#39;s API. https requires certificate
         * by trusted CA if used.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL for Elasticsearch&#39;s API. https requires certificate
         * by trusted CA if used.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param username The root credential username used in the connection URL.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The root credential username used in the connection URL.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param usernameTemplate - [Template](https://www.vaultproject.io/docs/concepts/username-templating) describing how dynamic usernames are generated.
         * 
         * @return builder
         * 
         */
        public Builder usernameTemplate(@Nullable Output<String> usernameTemplate) {
            $.usernameTemplate = usernameTemplate;
            return this;
        }

        /**
         * @param usernameTemplate - [Template](https://www.vaultproject.io/docs/concepts/username-templating) describing how dynamic usernames are generated.
         * 
         * @return builder
         * 
         */
        public Builder usernameTemplate(String usernameTemplate) {
            return usernameTemplate(Output.of(usernameTemplate));
        }

        public SecretBackendConnectionElasticsearchArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
