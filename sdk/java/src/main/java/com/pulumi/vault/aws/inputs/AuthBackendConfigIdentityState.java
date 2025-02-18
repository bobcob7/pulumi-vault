// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthBackendConfigIdentityState extends com.pulumi.resources.ResourceArgs {

    public static final AuthBackendConfigIdentityState Empty = new AuthBackendConfigIdentityState();

    /**
     * Unique name of the auth backend to configure.
     * 
     */
    @Import(name="backend")
    private @Nullable Output<String> backend;

    /**
     * @return Unique name of the auth backend to configure.
     * 
     */
    public Optional<Output<String>> backend() {
        return Optional.ofNullable(this.backend);
    }

    /**
     * How to generate the identity alias when using the ec2 auth method. Valid choices are
     * `role_id`, `instance_id`, and `image_id`. Defaults to `role_id`
     * 
     */
    @Import(name="ec2Alias")
    private @Nullable Output<String> ec2Alias;

    /**
     * @return How to generate the identity alias when using the ec2 auth method. Valid choices are
     * `role_id`, `instance_id`, and `image_id`. Defaults to `role_id`
     * 
     */
    public Optional<Output<String>> ec2Alias() {
        return Optional.ofNullable(this.ec2Alias);
    }

    /**
     * The metadata to include on the token returned by the `login` endpoint. This metadata will be
     * added to both audit logs, and on the `ec2_alias`
     * 
     */
    @Import(name="ec2Metadatas")
    private @Nullable Output<List<String>> ec2Metadatas;

    /**
     * @return The metadata to include on the token returned by the `login` endpoint. This metadata will be
     * added to both audit logs, and on the `ec2_alias`
     * 
     */
    public Optional<Output<List<String>>> ec2Metadatas() {
        return Optional.ofNullable(this.ec2Metadatas);
    }

    /**
     * How to generate the identity alias when using the iam auth method. Valid choices are
     * `role_id`, `unique_id`, and `full_arn`. Defaults to `role_id`
     * 
     */
    @Import(name="iamAlias")
    private @Nullable Output<String> iamAlias;

    /**
     * @return How to generate the identity alias when using the iam auth method. Valid choices are
     * `role_id`, `unique_id`, and `full_arn`. Defaults to `role_id`
     * 
     */
    public Optional<Output<String>> iamAlias() {
        return Optional.ofNullable(this.iamAlias);
    }

    /**
     * The metadata to include on the token returned by the `login` endpoint. This metadata will be
     * added to both audit logs, and on the `iam_alias`
     * 
     */
    @Import(name="iamMetadatas")
    private @Nullable Output<List<String>> iamMetadatas;

    /**
     * @return The metadata to include on the token returned by the `login` endpoint. This metadata will be
     * added to both audit logs, and on the `iam_alias`
     * 
     */
    public Optional<Output<List<String>>> iamMetadatas() {
        return Optional.ofNullable(this.iamMetadatas);
    }

    private AuthBackendConfigIdentityState() {}

    private AuthBackendConfigIdentityState(AuthBackendConfigIdentityState $) {
        this.backend = $.backend;
        this.ec2Alias = $.ec2Alias;
        this.ec2Metadatas = $.ec2Metadatas;
        this.iamAlias = $.iamAlias;
        this.iamMetadatas = $.iamMetadatas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthBackendConfigIdentityState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthBackendConfigIdentityState $;

        public Builder() {
            $ = new AuthBackendConfigIdentityState();
        }

        public Builder(AuthBackendConfigIdentityState defaults) {
            $ = new AuthBackendConfigIdentityState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backend Unique name of the auth backend to configure.
         * 
         * @return builder
         * 
         */
        public Builder backend(@Nullable Output<String> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend Unique name of the auth backend to configure.
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param ec2Alias How to generate the identity alias when using the ec2 auth method. Valid choices are
         * `role_id`, `instance_id`, and `image_id`. Defaults to `role_id`
         * 
         * @return builder
         * 
         */
        public Builder ec2Alias(@Nullable Output<String> ec2Alias) {
            $.ec2Alias = ec2Alias;
            return this;
        }

        /**
         * @param ec2Alias How to generate the identity alias when using the ec2 auth method. Valid choices are
         * `role_id`, `instance_id`, and `image_id`. Defaults to `role_id`
         * 
         * @return builder
         * 
         */
        public Builder ec2Alias(String ec2Alias) {
            return ec2Alias(Output.of(ec2Alias));
        }

        /**
         * @param ec2Metadatas The metadata to include on the token returned by the `login` endpoint. This metadata will be
         * added to both audit logs, and on the `ec2_alias`
         * 
         * @return builder
         * 
         */
        public Builder ec2Metadatas(@Nullable Output<List<String>> ec2Metadatas) {
            $.ec2Metadatas = ec2Metadatas;
            return this;
        }

        /**
         * @param ec2Metadatas The metadata to include on the token returned by the `login` endpoint. This metadata will be
         * added to both audit logs, and on the `ec2_alias`
         * 
         * @return builder
         * 
         */
        public Builder ec2Metadatas(List<String> ec2Metadatas) {
            return ec2Metadatas(Output.of(ec2Metadatas));
        }

        /**
         * @param ec2Metadatas The metadata to include on the token returned by the `login` endpoint. This metadata will be
         * added to both audit logs, and on the `ec2_alias`
         * 
         * @return builder
         * 
         */
        public Builder ec2Metadatas(String... ec2Metadatas) {
            return ec2Metadatas(List.of(ec2Metadatas));
        }

        /**
         * @param iamAlias How to generate the identity alias when using the iam auth method. Valid choices are
         * `role_id`, `unique_id`, and `full_arn`. Defaults to `role_id`
         * 
         * @return builder
         * 
         */
        public Builder iamAlias(@Nullable Output<String> iamAlias) {
            $.iamAlias = iamAlias;
            return this;
        }

        /**
         * @param iamAlias How to generate the identity alias when using the iam auth method. Valid choices are
         * `role_id`, `unique_id`, and `full_arn`. Defaults to `role_id`
         * 
         * @return builder
         * 
         */
        public Builder iamAlias(String iamAlias) {
            return iamAlias(Output.of(iamAlias));
        }

        /**
         * @param iamMetadatas The metadata to include on the token returned by the `login` endpoint. This metadata will be
         * added to both audit logs, and on the `iam_alias`
         * 
         * @return builder
         * 
         */
        public Builder iamMetadatas(@Nullable Output<List<String>> iamMetadatas) {
            $.iamMetadatas = iamMetadatas;
            return this;
        }

        /**
         * @param iamMetadatas The metadata to include on the token returned by the `login` endpoint. This metadata will be
         * added to both audit logs, and on the `iam_alias`
         * 
         * @return builder
         * 
         */
        public Builder iamMetadatas(List<String> iamMetadatas) {
            return iamMetadatas(Output.of(iamMetadatas));
        }

        /**
         * @param iamMetadatas The metadata to include on the token returned by the `login` endpoint. This metadata will be
         * added to both audit logs, and on the `iam_alias`
         * 
         * @return builder
         * 
         */
        public Builder iamMetadatas(String... iamMetadatas) {
            return iamMetadatas(List.of(iamMetadatas));
        }

        public AuthBackendConfigIdentityState build() {
            return $;
        }
    }

}
