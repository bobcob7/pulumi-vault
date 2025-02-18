// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthBackendCertState extends com.pulumi.resources.ResourceArgs {

    public static final AuthBackendCertState Empty = new AuthBackendCertState();

    /**
     * The  Base64 encoded AWS Public key required to
     * verify PKCS7 signature of the EC2 instance metadata. You can find this key in
     * the [AWS
     * documentation](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-identity-documents.html).
     * 
     */
    @Import(name="awsPublicCert")
    private @Nullable Output<String> awsPublicCert;

    /**
     * @return The  Base64 encoded AWS Public key required to
     * verify PKCS7 signature of the EC2 instance metadata. You can find this key in
     * the [AWS
     * documentation](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-identity-documents.html).
     * 
     */
    public Optional<Output<String>> awsPublicCert() {
        return Optional.ofNullable(this.awsPublicCert);
    }

    /**
     * The path the AWS auth backend being configured was
     * mounted at.  Defaults to `aws`.
     * 
     */
    @Import(name="backend")
    private @Nullable Output<String> backend;

    /**
     * @return The path the AWS auth backend being configured was
     * mounted at.  Defaults to `aws`.
     * 
     */
    public Optional<Output<String>> backend() {
        return Optional.ofNullable(this.backend);
    }

    /**
     * The name of the certificate.
     * 
     */
    @Import(name="certName")
    private @Nullable Output<String> certName;

    /**
     * @return The name of the certificate.
     * 
     */
    public Optional<Output<String>> certName() {
        return Optional.ofNullable(this.certName);
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
     * Either &#34;pkcs7&#34; or &#34;identity&#34;, indicating the type of
     * document which can be verified using the given certificate. Defaults to
     * &#34;pkcs7&#34;.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Either &#34;pkcs7&#34; or &#34;identity&#34;, indicating the type of
     * document which can be verified using the given certificate. Defaults to
     * &#34;pkcs7&#34;.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private AuthBackendCertState() {}

    private AuthBackendCertState(AuthBackendCertState $) {
        this.awsPublicCert = $.awsPublicCert;
        this.backend = $.backend;
        this.certName = $.certName;
        this.namespace = $.namespace;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthBackendCertState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthBackendCertState $;

        public Builder() {
            $ = new AuthBackendCertState();
        }

        public Builder(AuthBackendCertState defaults) {
            $ = new AuthBackendCertState(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsPublicCert The  Base64 encoded AWS Public key required to
         * verify PKCS7 signature of the EC2 instance metadata. You can find this key in
         * the [AWS
         * documentation](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-identity-documents.html).
         * 
         * @return builder
         * 
         */
        public Builder awsPublicCert(@Nullable Output<String> awsPublicCert) {
            $.awsPublicCert = awsPublicCert;
            return this;
        }

        /**
         * @param awsPublicCert The  Base64 encoded AWS Public key required to
         * verify PKCS7 signature of the EC2 instance metadata. You can find this key in
         * the [AWS
         * documentation](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-identity-documents.html).
         * 
         * @return builder
         * 
         */
        public Builder awsPublicCert(String awsPublicCert) {
            return awsPublicCert(Output.of(awsPublicCert));
        }

        /**
         * @param backend The path the AWS auth backend being configured was
         * mounted at.  Defaults to `aws`.
         * 
         * @return builder
         * 
         */
        public Builder backend(@Nullable Output<String> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend The path the AWS auth backend being configured was
         * mounted at.  Defaults to `aws`.
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param certName The name of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder certName(@Nullable Output<String> certName) {
            $.certName = certName;
            return this;
        }

        /**
         * @param certName The name of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder certName(String certName) {
            return certName(Output.of(certName));
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
         * @param type Either &#34;pkcs7&#34; or &#34;identity&#34;, indicating the type of
         * document which can be verified using the given certificate. Defaults to
         * &#34;pkcs7&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Either &#34;pkcs7&#34; or &#34;identity&#34;, indicating the type of
         * document which can be verified using the given certificate. Defaults to
         * &#34;pkcs7&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AuthBackendCertState build() {
            return $;
        }
    }

}
