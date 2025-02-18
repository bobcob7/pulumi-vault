// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.database.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecretsMountMysql {
    /**
     * @return A list of roles that are allowed to use this
     * connection.
     * 
     */
    private @Nullable List<String> allowedRoles;
    /**
     * @return A URL containing connection information.\
     * See [Vault docs](https://www.vaultproject.io/api-docs/secret/databases/snowflake#sample-payload)
     * 
     */
    private @Nullable String connectionUrl;
    /**
     * @return A map of sensitive data to pass to the endpoint. Useful for templated connection strings.
     * 
     */
    private @Nullable Map<String,Object> data;
    /**
     * @return The maximum number of seconds to keep
     * a connection alive for.
     * 
     */
    private @Nullable Integer maxConnectionLifetime;
    /**
     * @return The maximum number of idle connections to
     * maintain.
     * 
     */
    private @Nullable Integer maxIdleConnections;
    /**
     * @return The maximum number of open connections to
     * use.
     * 
     */
    private @Nullable Integer maxOpenConnections;
    private String name;
    /**
     * @return The password to be used in the connection.
     * 
     */
    private @Nullable String password;
    /**
     * @return Specifies the name of the plugin to use.
     * 
     */
    private @Nullable String pluginName;
    /**
     * @return A list of database statements to be executed to rotate the root user&#39;s credentials.
     * 
     */
    private @Nullable List<String> rootRotationStatements;
    /**
     * @return x509 CA file for validating the certificate presented by the MySQL server. Must be PEM encoded.
     * 
     */
    private @Nullable String tlsCa;
    /**
     * @return x509 certificate for connecting to the database. This must be a PEM encoded version of the private key and the certificate combined.
     * 
     */
    private @Nullable String tlsCertificateKey;
    /**
     * @return The username to be used in the connection (the account admin level).
     * 
     */
    private @Nullable String username;
    /**
     * @return - [Template](https://www.vaultproject.io/docs/concepts/username-templating) describing how dynamic usernames are generated.
     * 
     */
    private @Nullable String usernameTemplate;
    /**
     * @return Whether the connection should be verified on
     * initial configuration or not.
     * 
     */
    private @Nullable Boolean verifyConnection;

    private SecretsMountMysql() {}
    /**
     * @return A list of roles that are allowed to use this
     * connection.
     * 
     */
    public List<String> allowedRoles() {
        return this.allowedRoles == null ? List.of() : this.allowedRoles;
    }
    /**
     * @return A URL containing connection information.\
     * See [Vault docs](https://www.vaultproject.io/api-docs/secret/databases/snowflake#sample-payload)
     * 
     */
    public Optional<String> connectionUrl() {
        return Optional.ofNullable(this.connectionUrl);
    }
    /**
     * @return A map of sensitive data to pass to the endpoint. Useful for templated connection strings.
     * 
     */
    public Map<String,Object> data() {
        return this.data == null ? Map.of() : this.data;
    }
    /**
     * @return The maximum number of seconds to keep
     * a connection alive for.
     * 
     */
    public Optional<Integer> maxConnectionLifetime() {
        return Optional.ofNullable(this.maxConnectionLifetime);
    }
    /**
     * @return The maximum number of idle connections to
     * maintain.
     * 
     */
    public Optional<Integer> maxIdleConnections() {
        return Optional.ofNullable(this.maxIdleConnections);
    }
    /**
     * @return The maximum number of open connections to
     * use.
     * 
     */
    public Optional<Integer> maxOpenConnections() {
        return Optional.ofNullable(this.maxOpenConnections);
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The password to be used in the connection.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Specifies the name of the plugin to use.
     * 
     */
    public Optional<String> pluginName() {
        return Optional.ofNullable(this.pluginName);
    }
    /**
     * @return A list of database statements to be executed to rotate the root user&#39;s credentials.
     * 
     */
    public List<String> rootRotationStatements() {
        return this.rootRotationStatements == null ? List.of() : this.rootRotationStatements;
    }
    /**
     * @return x509 CA file for validating the certificate presented by the MySQL server. Must be PEM encoded.
     * 
     */
    public Optional<String> tlsCa() {
        return Optional.ofNullable(this.tlsCa);
    }
    /**
     * @return x509 certificate for connecting to the database. This must be a PEM encoded version of the private key and the certificate combined.
     * 
     */
    public Optional<String> tlsCertificateKey() {
        return Optional.ofNullable(this.tlsCertificateKey);
    }
    /**
     * @return The username to be used in the connection (the account admin level).
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }
    /**
     * @return - [Template](https://www.vaultproject.io/docs/concepts/username-templating) describing how dynamic usernames are generated.
     * 
     */
    public Optional<String> usernameTemplate() {
        return Optional.ofNullable(this.usernameTemplate);
    }
    /**
     * @return Whether the connection should be verified on
     * initial configuration or not.
     * 
     */
    public Optional<Boolean> verifyConnection() {
        return Optional.ofNullable(this.verifyConnection);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretsMountMysql defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allowedRoles;
        private @Nullable String connectionUrl;
        private @Nullable Map<String,Object> data;
        private @Nullable Integer maxConnectionLifetime;
        private @Nullable Integer maxIdleConnections;
        private @Nullable Integer maxOpenConnections;
        private String name;
        private @Nullable String password;
        private @Nullable String pluginName;
        private @Nullable List<String> rootRotationStatements;
        private @Nullable String tlsCa;
        private @Nullable String tlsCertificateKey;
        private @Nullable String username;
        private @Nullable String usernameTemplate;
        private @Nullable Boolean verifyConnection;
        public Builder() {}
        public Builder(SecretsMountMysql defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedRoles = defaults.allowedRoles;
    	      this.connectionUrl = defaults.connectionUrl;
    	      this.data = defaults.data;
    	      this.maxConnectionLifetime = defaults.maxConnectionLifetime;
    	      this.maxIdleConnections = defaults.maxIdleConnections;
    	      this.maxOpenConnections = defaults.maxOpenConnections;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.pluginName = defaults.pluginName;
    	      this.rootRotationStatements = defaults.rootRotationStatements;
    	      this.tlsCa = defaults.tlsCa;
    	      this.tlsCertificateKey = defaults.tlsCertificateKey;
    	      this.username = defaults.username;
    	      this.usernameTemplate = defaults.usernameTemplate;
    	      this.verifyConnection = defaults.verifyConnection;
        }

        @CustomType.Setter
        public Builder allowedRoles(@Nullable List<String> allowedRoles) {
            this.allowedRoles = allowedRoles;
            return this;
        }
        public Builder allowedRoles(String... allowedRoles) {
            return allowedRoles(List.of(allowedRoles));
        }
        @CustomType.Setter
        public Builder connectionUrl(@Nullable String connectionUrl) {
            this.connectionUrl = connectionUrl;
            return this;
        }
        @CustomType.Setter
        public Builder data(@Nullable Map<String,Object> data) {
            this.data = data;
            return this;
        }
        @CustomType.Setter
        public Builder maxConnectionLifetime(@Nullable Integer maxConnectionLifetime) {
            this.maxConnectionLifetime = maxConnectionLifetime;
            return this;
        }
        @CustomType.Setter
        public Builder maxIdleConnections(@Nullable Integer maxIdleConnections) {
            this.maxIdleConnections = maxIdleConnections;
            return this;
        }
        @CustomType.Setter
        public Builder maxOpenConnections(@Nullable Integer maxOpenConnections) {
            this.maxOpenConnections = maxOpenConnections;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder pluginName(@Nullable String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        @CustomType.Setter
        public Builder rootRotationStatements(@Nullable List<String> rootRotationStatements) {
            this.rootRotationStatements = rootRotationStatements;
            return this;
        }
        public Builder rootRotationStatements(String... rootRotationStatements) {
            return rootRotationStatements(List.of(rootRotationStatements));
        }
        @CustomType.Setter
        public Builder tlsCa(@Nullable String tlsCa) {
            this.tlsCa = tlsCa;
            return this;
        }
        @CustomType.Setter
        public Builder tlsCertificateKey(@Nullable String tlsCertificateKey) {
            this.tlsCertificateKey = tlsCertificateKey;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        @CustomType.Setter
        public Builder usernameTemplate(@Nullable String usernameTemplate) {
            this.usernameTemplate = usernameTemplate;
            return this;
        }
        @CustomType.Setter
        public Builder verifyConnection(@Nullable Boolean verifyConnection) {
            this.verifyConnection = verifyConnection;
            return this;
        }
        public SecretsMountMysql build() {
            final var o = new SecretsMountMysql();
            o.allowedRoles = allowedRoles;
            o.connectionUrl = connectionUrl;
            o.data = data;
            o.maxConnectionLifetime = maxConnectionLifetime;
            o.maxIdleConnections = maxIdleConnections;
            o.maxOpenConnections = maxOpenConnections;
            o.name = name;
            o.password = password;
            o.pluginName = pluginName;
            o.rootRotationStatements = rootRotationStatements;
            o.tlsCa = tlsCa;
            o.tlsCertificateKey = tlsCertificateKey;
            o.username = username;
            o.usernameTemplate = usernameTemplate;
            o.verifyConnection = verifyConnection;
            return o;
        }
    }
}
