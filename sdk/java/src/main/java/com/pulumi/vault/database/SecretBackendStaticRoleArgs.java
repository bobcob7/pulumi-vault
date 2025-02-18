// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.database;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretBackendStaticRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretBackendStaticRoleArgs Empty = new SecretBackendStaticRoleArgs();

    /**
     * The unique name of the Vault mount to configure.
     * 
     */
    @Import(name="backend", required=true)
    private Output<String> backend;

    /**
     * @return The unique name of the Vault mount to configure.
     * 
     */
    public Output<String> backend() {
        return this.backend;
    }

    /**
     * The unique name of the database connection to use for the static role.
     * 
     */
    @Import(name="dbName", required=true)
    private Output<String> dbName;

    /**
     * @return The unique name of the database connection to use for the static role.
     * 
     */
    public Output<String> dbName() {
        return this.dbName;
    }

    /**
     * A unique name to give the static role.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique name to give the static role.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider&#39;s configured namespace.
     * *Available only for Vault Enterprise*.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider&#39;s configured namespace.
     * *Available only for Vault Enterprise*.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * The amount of time Vault should wait before rotating the password, in seconds.
     * 
     */
    @Import(name="rotationPeriod", required=true)
    private Output<Integer> rotationPeriod;

    /**
     * @return The amount of time Vault should wait before rotating the password, in seconds.
     * 
     */
    public Output<Integer> rotationPeriod() {
        return this.rotationPeriod;
    }

    /**
     * Database statements to execute to rotate the password for the configured database user.
     * 
     */
    @Import(name="rotationStatements")
    private @Nullable Output<List<String>> rotationStatements;

    /**
     * @return Database statements to execute to rotate the password for the configured database user.
     * 
     */
    public Optional<Output<List<String>>> rotationStatements() {
        return Optional.ofNullable(this.rotationStatements);
    }

    /**
     * The database username that this static role corresponds to.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The database username that this static role corresponds to.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private SecretBackendStaticRoleArgs() {}

    private SecretBackendStaticRoleArgs(SecretBackendStaticRoleArgs $) {
        this.backend = $.backend;
        this.dbName = $.dbName;
        this.name = $.name;
        this.namespace = $.namespace;
        this.rotationPeriod = $.rotationPeriod;
        this.rotationStatements = $.rotationStatements;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretBackendStaticRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretBackendStaticRoleArgs $;

        public Builder() {
            $ = new SecretBackendStaticRoleArgs();
        }

        public Builder(SecretBackendStaticRoleArgs defaults) {
            $ = new SecretBackendStaticRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backend The unique name of the Vault mount to configure.
         * 
         * @return builder
         * 
         */
        public Builder backend(Output<String> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend The unique name of the Vault mount to configure.
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param dbName The unique name of the database connection to use for the static role.
         * 
         * @return builder
         * 
         */
        public Builder dbName(Output<String> dbName) {
            $.dbName = dbName;
            return this;
        }

        /**
         * @param dbName The unique name of the database connection to use for the static role.
         * 
         * @return builder
         * 
         */
        public Builder dbName(String dbName) {
            return dbName(Output.of(dbName));
        }

        /**
         * @param name A unique name to give the static role.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name to give the static role.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace The namespace to provision the resource in.
         * The value should not contain leading or trailing forward slashes.
         * The `namespace` is always relative to the provider&#39;s configured namespace.
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
         * The `namespace` is always relative to the provider&#39;s configured namespace.
         * *Available only for Vault Enterprise*.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param rotationPeriod The amount of time Vault should wait before rotating the password, in seconds.
         * 
         * @return builder
         * 
         */
        public Builder rotationPeriod(Output<Integer> rotationPeriod) {
            $.rotationPeriod = rotationPeriod;
            return this;
        }

        /**
         * @param rotationPeriod The amount of time Vault should wait before rotating the password, in seconds.
         * 
         * @return builder
         * 
         */
        public Builder rotationPeriod(Integer rotationPeriod) {
            return rotationPeriod(Output.of(rotationPeriod));
        }

        /**
         * @param rotationStatements Database statements to execute to rotate the password for the configured database user.
         * 
         * @return builder
         * 
         */
        public Builder rotationStatements(@Nullable Output<List<String>> rotationStatements) {
            $.rotationStatements = rotationStatements;
            return this;
        }

        /**
         * @param rotationStatements Database statements to execute to rotate the password for the configured database user.
         * 
         * @return builder
         * 
         */
        public Builder rotationStatements(List<String> rotationStatements) {
            return rotationStatements(Output.of(rotationStatements));
        }

        /**
         * @param rotationStatements Database statements to execute to rotate the password for the configured database user.
         * 
         * @return builder
         * 
         */
        public Builder rotationStatements(String... rotationStatements) {
            return rotationStatements(List.of(rotationStatements));
        }

        /**
         * @param username The database username that this static role corresponds to.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The database username that this static role corresponds to.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public SecretBackendStaticRoleArgs build() {
            $.backend = Objects.requireNonNull($.backend, "expected parameter 'backend' to be non-null");
            $.dbName = Objects.requireNonNull($.dbName, "expected parameter 'dbName' to be non-null");
            $.rotationPeriod = Objects.requireNonNull($.rotationPeriod, "expected parameter 'rotationPeriod' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
