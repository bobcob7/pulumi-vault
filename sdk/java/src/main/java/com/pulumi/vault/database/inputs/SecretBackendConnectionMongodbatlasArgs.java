// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SecretBackendConnectionMongodbatlasArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretBackendConnectionMongodbatlasArgs Empty = new SecretBackendConnectionMongodbatlasArgs();

    /**
     * The Private Programmatic API Key used to connect with MongoDB Atlas API.
     * 
     */
    @Import(name="privateKey", required=true)
    private Output<String> privateKey;

    /**
     * @return The Private Programmatic API Key used to connect with MongoDB Atlas API.
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
    }

    /**
     * The Project ID the Database User should be created within.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The Project ID the Database User should be created within.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * The Public Programmatic API Key used to authenticate with the MongoDB Atlas API.
     * 
     */
    @Import(name="publicKey", required=true)
    private Output<String> publicKey;

    /**
     * @return The Public Programmatic API Key used to authenticate with the MongoDB Atlas API.
     * 
     */
    public Output<String> publicKey() {
        return this.publicKey;
    }

    private SecretBackendConnectionMongodbatlasArgs() {}

    private SecretBackendConnectionMongodbatlasArgs(SecretBackendConnectionMongodbatlasArgs $) {
        this.privateKey = $.privateKey;
        this.projectId = $.projectId;
        this.publicKey = $.publicKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretBackendConnectionMongodbatlasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretBackendConnectionMongodbatlasArgs $;

        public Builder() {
            $ = new SecretBackendConnectionMongodbatlasArgs();
        }

        public Builder(SecretBackendConnectionMongodbatlasArgs defaults) {
            $ = new SecretBackendConnectionMongodbatlasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateKey The Private Programmatic API Key used to connect with MongoDB Atlas API.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey The Private Programmatic API Key used to connect with MongoDB Atlas API.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param projectId The Project ID the Database User should be created within.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The Project ID the Database User should be created within.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param publicKey The Public Programmatic API Key used to authenticate with the MongoDB Atlas API.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey The Public Programmatic API Key used to authenticate with the MongoDB Atlas API.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        public SecretBackendConnectionMongodbatlasArgs build() {
            $.privateKey = Objects.requireNonNull($.privateKey, "expected parameter 'privateKey' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.publicKey = Objects.requireNonNull($.publicKey, "expected parameter 'publicKey' to be non-null");
            return $;
        }
    }

}
