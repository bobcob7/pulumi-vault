// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderAuthLoginAwsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderAuthLoginAwsArgs Empty = new ProviderAuthLoginAwsArgs();

    @Import(name="awsAccessKeyId")
    private @Nullable Output<String> awsAccessKeyId;

    public Optional<Output<String>> awsAccessKeyId() {
        return Optional.ofNullable(this.awsAccessKeyId);
    }

    @Import(name="awsIamEndpoint")
    private @Nullable Output<String> awsIamEndpoint;

    public Optional<Output<String>> awsIamEndpoint() {
        return Optional.ofNullable(this.awsIamEndpoint);
    }

    @Import(name="awsProfile")
    private @Nullable Output<String> awsProfile;

    public Optional<Output<String>> awsProfile() {
        return Optional.ofNullable(this.awsProfile);
    }

    @Import(name="awsRegion")
    private @Nullable Output<String> awsRegion;

    public Optional<Output<String>> awsRegion() {
        return Optional.ofNullable(this.awsRegion);
    }

    @Import(name="awsRoleArn")
    private @Nullable Output<String> awsRoleArn;

    public Optional<Output<String>> awsRoleArn() {
        return Optional.ofNullable(this.awsRoleArn);
    }

    @Import(name="awsRoleSessionName")
    private @Nullable Output<String> awsRoleSessionName;

    public Optional<Output<String>> awsRoleSessionName() {
        return Optional.ofNullable(this.awsRoleSessionName);
    }

    @Import(name="awsSecretAccessKey")
    private @Nullable Output<String> awsSecretAccessKey;

    public Optional<Output<String>> awsSecretAccessKey() {
        return Optional.ofNullable(this.awsSecretAccessKey);
    }

    @Import(name="awsSessionToken")
    private @Nullable Output<String> awsSessionToken;

    public Optional<Output<String>> awsSessionToken() {
        return Optional.ofNullable(this.awsSessionToken);
    }

    @Import(name="awsSharedCredentialsFile")
    private @Nullable Output<String> awsSharedCredentialsFile;

    public Optional<Output<String>> awsSharedCredentialsFile() {
        return Optional.ofNullable(this.awsSharedCredentialsFile);
    }

    @Import(name="awsStsEndpoint")
    private @Nullable Output<String> awsStsEndpoint;

    public Optional<Output<String>> awsStsEndpoint() {
        return Optional.ofNullable(this.awsStsEndpoint);
    }

    @Import(name="awsWebIdentityTokenFile")
    private @Nullable Output<String> awsWebIdentityTokenFile;

    public Optional<Output<String>> awsWebIdentityTokenFile() {
        return Optional.ofNullable(this.awsWebIdentityTokenFile);
    }

    @Import(name="headerValue")
    private @Nullable Output<String> headerValue;

    public Optional<Output<String>> headerValue() {
        return Optional.ofNullable(this.headerValue);
    }

    @Import(name="mount")
    private @Nullable Output<String> mount;

    public Optional<Output<String>> mount() {
        return Optional.ofNullable(this.mount);
    }

    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    @Import(name="role", required=true)
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    private ProviderAuthLoginAwsArgs() {}

    private ProviderAuthLoginAwsArgs(ProviderAuthLoginAwsArgs $) {
        this.awsAccessKeyId = $.awsAccessKeyId;
        this.awsIamEndpoint = $.awsIamEndpoint;
        this.awsProfile = $.awsProfile;
        this.awsRegion = $.awsRegion;
        this.awsRoleArn = $.awsRoleArn;
        this.awsRoleSessionName = $.awsRoleSessionName;
        this.awsSecretAccessKey = $.awsSecretAccessKey;
        this.awsSessionToken = $.awsSessionToken;
        this.awsSharedCredentialsFile = $.awsSharedCredentialsFile;
        this.awsStsEndpoint = $.awsStsEndpoint;
        this.awsWebIdentityTokenFile = $.awsWebIdentityTokenFile;
        this.headerValue = $.headerValue;
        this.mount = $.mount;
        this.namespace = $.namespace;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderAuthLoginAwsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderAuthLoginAwsArgs $;

        public Builder() {
            $ = new ProviderAuthLoginAwsArgs();
        }

        public Builder(ProviderAuthLoginAwsArgs defaults) {
            $ = new ProviderAuthLoginAwsArgs(Objects.requireNonNull(defaults));
        }

        public Builder awsAccessKeyId(@Nullable Output<String> awsAccessKeyId) {
            $.awsAccessKeyId = awsAccessKeyId;
            return this;
        }

        public Builder awsAccessKeyId(String awsAccessKeyId) {
            return awsAccessKeyId(Output.of(awsAccessKeyId));
        }

        public Builder awsIamEndpoint(@Nullable Output<String> awsIamEndpoint) {
            $.awsIamEndpoint = awsIamEndpoint;
            return this;
        }

        public Builder awsIamEndpoint(String awsIamEndpoint) {
            return awsIamEndpoint(Output.of(awsIamEndpoint));
        }

        public Builder awsProfile(@Nullable Output<String> awsProfile) {
            $.awsProfile = awsProfile;
            return this;
        }

        public Builder awsProfile(String awsProfile) {
            return awsProfile(Output.of(awsProfile));
        }

        public Builder awsRegion(@Nullable Output<String> awsRegion) {
            $.awsRegion = awsRegion;
            return this;
        }

        public Builder awsRegion(String awsRegion) {
            return awsRegion(Output.of(awsRegion));
        }

        public Builder awsRoleArn(@Nullable Output<String> awsRoleArn) {
            $.awsRoleArn = awsRoleArn;
            return this;
        }

        public Builder awsRoleArn(String awsRoleArn) {
            return awsRoleArn(Output.of(awsRoleArn));
        }

        public Builder awsRoleSessionName(@Nullable Output<String> awsRoleSessionName) {
            $.awsRoleSessionName = awsRoleSessionName;
            return this;
        }

        public Builder awsRoleSessionName(String awsRoleSessionName) {
            return awsRoleSessionName(Output.of(awsRoleSessionName));
        }

        public Builder awsSecretAccessKey(@Nullable Output<String> awsSecretAccessKey) {
            $.awsSecretAccessKey = awsSecretAccessKey;
            return this;
        }

        public Builder awsSecretAccessKey(String awsSecretAccessKey) {
            return awsSecretAccessKey(Output.of(awsSecretAccessKey));
        }

        public Builder awsSessionToken(@Nullable Output<String> awsSessionToken) {
            $.awsSessionToken = awsSessionToken;
            return this;
        }

        public Builder awsSessionToken(String awsSessionToken) {
            return awsSessionToken(Output.of(awsSessionToken));
        }

        public Builder awsSharedCredentialsFile(@Nullable Output<String> awsSharedCredentialsFile) {
            $.awsSharedCredentialsFile = awsSharedCredentialsFile;
            return this;
        }

        public Builder awsSharedCredentialsFile(String awsSharedCredentialsFile) {
            return awsSharedCredentialsFile(Output.of(awsSharedCredentialsFile));
        }

        public Builder awsStsEndpoint(@Nullable Output<String> awsStsEndpoint) {
            $.awsStsEndpoint = awsStsEndpoint;
            return this;
        }

        public Builder awsStsEndpoint(String awsStsEndpoint) {
            return awsStsEndpoint(Output.of(awsStsEndpoint));
        }

        public Builder awsWebIdentityTokenFile(@Nullable Output<String> awsWebIdentityTokenFile) {
            $.awsWebIdentityTokenFile = awsWebIdentityTokenFile;
            return this;
        }

        public Builder awsWebIdentityTokenFile(String awsWebIdentityTokenFile) {
            return awsWebIdentityTokenFile(Output.of(awsWebIdentityTokenFile));
        }

        public Builder headerValue(@Nullable Output<String> headerValue) {
            $.headerValue = headerValue;
            return this;
        }

        public Builder headerValue(String headerValue) {
            return headerValue(Output.of(headerValue));
        }

        public Builder mount(@Nullable Output<String> mount) {
            $.mount = mount;
            return this;
        }

        public Builder mount(String mount) {
            return mount(Output.of(mount));
        }

        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public ProviderAuthLoginAwsArgs build() {
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}
