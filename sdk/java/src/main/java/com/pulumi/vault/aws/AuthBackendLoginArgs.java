// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthBackendLoginArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthBackendLoginArgs Empty = new AuthBackendLoginArgs();

    /**
     * The unique name of the AWS auth backend. Defaults to
     * &#39;aws&#39;.
     * 
     */
    @Import(name="backend")
    private @Nullable Output<String> backend;

    /**
     * @return The unique name of the AWS auth backend. Defaults to
     * &#39;aws&#39;.
     * 
     */
    public Optional<Output<String>> backend() {
        return Optional.ofNullable(this.backend);
    }

    /**
     * The HTTP method used in the signed IAM
     * request.
     * 
     */
    @Import(name="iamHttpRequestMethod")
    private @Nullable Output<String> iamHttpRequestMethod;

    /**
     * @return The HTTP method used in the signed IAM
     * request.
     * 
     */
    public Optional<Output<String>> iamHttpRequestMethod() {
        return Optional.ofNullable(this.iamHttpRequestMethod);
    }

    /**
     * The base64-encoded body of the signed
     * request.
     * 
     */
    @Import(name="iamRequestBody")
    private @Nullable Output<String> iamRequestBody;

    /**
     * @return The base64-encoded body of the signed
     * request.
     * 
     */
    public Optional<Output<String>> iamRequestBody() {
        return Optional.ofNullable(this.iamRequestBody);
    }

    /**
     * The base64-encoded, JSON serialized
     * representation of the GetCallerIdentity HTTP request headers.
     * 
     */
    @Import(name="iamRequestHeaders")
    private @Nullable Output<String> iamRequestHeaders;

    /**
     * @return The base64-encoded, JSON serialized
     * representation of the GetCallerIdentity HTTP request headers.
     * 
     */
    public Optional<Output<String>> iamRequestHeaders() {
        return Optional.ofNullable(this.iamRequestHeaders);
    }

    /**
     * The base64-encoded HTTP URL used in the signed
     * request.
     * 
     */
    @Import(name="iamRequestUrl")
    private @Nullable Output<String> iamRequestUrl;

    /**
     * @return The base64-encoded HTTP URL used in the signed
     * request.
     * 
     */
    public Optional<Output<String>> iamRequestUrl() {
        return Optional.ofNullable(this.iamRequestUrl);
    }

    /**
     * The base64-encoded EC2 instance identity document to
     * authenticate with. Can be retrieved from the EC2 metadata server.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<String> identity;

    /**
     * @return The base64-encoded EC2 instance identity document to
     * authenticate with. Can be retrieved from the EC2 metadata server.
     * 
     */
    public Optional<Output<String>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The unique nonce to be used for login requests. Can be
     * set to a user-specified value, or will contain the server-generated value
     * once a token is issued. EC2 instances can only acquire a single token until
     * the whitelist is tidied again unless they keep track of this nonce.
     * 
     */
    @Import(name="nonce")
    private @Nullable Output<String> nonce;

    /**
     * @return The unique nonce to be used for login requests. Can be
     * set to a user-specified value, or will contain the server-generated value
     * once a token is issued. EC2 instances can only acquire a single token until
     * the whitelist is tidied again unless they keep track of this nonce.
     * 
     */
    public Optional<Output<String>> nonce() {
        return Optional.ofNullable(this.nonce);
    }

    /**
     * The PKCS#7 signature of the identity document to
     * authenticate with, with all newline characters removed. Can be retrieved from
     * the EC2 metadata server.
     * 
     */
    @Import(name="pkcs7")
    private @Nullable Output<String> pkcs7;

    /**
     * @return The PKCS#7 signature of the identity document to
     * authenticate with, with all newline characters removed. Can be retrieved from
     * the EC2 metadata server.
     * 
     */
    public Optional<Output<String>> pkcs7() {
        return Optional.ofNullable(this.pkcs7);
    }

    /**
     * The name of the AWS auth backend role to create tokens
     * against.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The name of the AWS auth backend role to create tokens
     * against.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * The base64-encoded SHA256 RSA signature of the
     * instance identity document to authenticate with, with all newline characters
     * removed. Can be retrieved from the EC2 metadata server.
     * 
     */
    @Import(name="signature")
    private @Nullable Output<String> signature;

    /**
     * @return The base64-encoded SHA256 RSA signature of the
     * instance identity document to authenticate with, with all newline characters
     * removed. Can be retrieved from the EC2 metadata server.
     * 
     */
    public Optional<Output<String>> signature() {
        return Optional.ofNullable(this.signature);
    }

    private AuthBackendLoginArgs() {}

    private AuthBackendLoginArgs(AuthBackendLoginArgs $) {
        this.backend = $.backend;
        this.iamHttpRequestMethod = $.iamHttpRequestMethod;
        this.iamRequestBody = $.iamRequestBody;
        this.iamRequestHeaders = $.iamRequestHeaders;
        this.iamRequestUrl = $.iamRequestUrl;
        this.identity = $.identity;
        this.nonce = $.nonce;
        this.pkcs7 = $.pkcs7;
        this.role = $.role;
        this.signature = $.signature;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthBackendLoginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthBackendLoginArgs $;

        public Builder() {
            $ = new AuthBackendLoginArgs();
        }

        public Builder(AuthBackendLoginArgs defaults) {
            $ = new AuthBackendLoginArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backend The unique name of the AWS auth backend. Defaults to
         * &#39;aws&#39;.
         * 
         * @return builder
         * 
         */
        public Builder backend(@Nullable Output<String> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend The unique name of the AWS auth backend. Defaults to
         * &#39;aws&#39;.
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param iamHttpRequestMethod The HTTP method used in the signed IAM
         * request.
         * 
         * @return builder
         * 
         */
        public Builder iamHttpRequestMethod(@Nullable Output<String> iamHttpRequestMethod) {
            $.iamHttpRequestMethod = iamHttpRequestMethod;
            return this;
        }

        /**
         * @param iamHttpRequestMethod The HTTP method used in the signed IAM
         * request.
         * 
         * @return builder
         * 
         */
        public Builder iamHttpRequestMethod(String iamHttpRequestMethod) {
            return iamHttpRequestMethod(Output.of(iamHttpRequestMethod));
        }

        /**
         * @param iamRequestBody The base64-encoded body of the signed
         * request.
         * 
         * @return builder
         * 
         */
        public Builder iamRequestBody(@Nullable Output<String> iamRequestBody) {
            $.iamRequestBody = iamRequestBody;
            return this;
        }

        /**
         * @param iamRequestBody The base64-encoded body of the signed
         * request.
         * 
         * @return builder
         * 
         */
        public Builder iamRequestBody(String iamRequestBody) {
            return iamRequestBody(Output.of(iamRequestBody));
        }

        /**
         * @param iamRequestHeaders The base64-encoded, JSON serialized
         * representation of the GetCallerIdentity HTTP request headers.
         * 
         * @return builder
         * 
         */
        public Builder iamRequestHeaders(@Nullable Output<String> iamRequestHeaders) {
            $.iamRequestHeaders = iamRequestHeaders;
            return this;
        }

        /**
         * @param iamRequestHeaders The base64-encoded, JSON serialized
         * representation of the GetCallerIdentity HTTP request headers.
         * 
         * @return builder
         * 
         */
        public Builder iamRequestHeaders(String iamRequestHeaders) {
            return iamRequestHeaders(Output.of(iamRequestHeaders));
        }

        /**
         * @param iamRequestUrl The base64-encoded HTTP URL used in the signed
         * request.
         * 
         * @return builder
         * 
         */
        public Builder iamRequestUrl(@Nullable Output<String> iamRequestUrl) {
            $.iamRequestUrl = iamRequestUrl;
            return this;
        }

        /**
         * @param iamRequestUrl The base64-encoded HTTP URL used in the signed
         * request.
         * 
         * @return builder
         * 
         */
        public Builder iamRequestUrl(String iamRequestUrl) {
            return iamRequestUrl(Output.of(iamRequestUrl));
        }

        /**
         * @param identity The base64-encoded EC2 instance identity document to
         * authenticate with. Can be retrieved from the EC2 metadata server.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<String> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity The base64-encoded EC2 instance identity document to
         * authenticate with. Can be retrieved from the EC2 metadata server.
         * 
         * @return builder
         * 
         */
        public Builder identity(String identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param nonce The unique nonce to be used for login requests. Can be
         * set to a user-specified value, or will contain the server-generated value
         * once a token is issued. EC2 instances can only acquire a single token until
         * the whitelist is tidied again unless they keep track of this nonce.
         * 
         * @return builder
         * 
         */
        public Builder nonce(@Nullable Output<String> nonce) {
            $.nonce = nonce;
            return this;
        }

        /**
         * @param nonce The unique nonce to be used for login requests. Can be
         * set to a user-specified value, or will contain the server-generated value
         * once a token is issued. EC2 instances can only acquire a single token until
         * the whitelist is tidied again unless they keep track of this nonce.
         * 
         * @return builder
         * 
         */
        public Builder nonce(String nonce) {
            return nonce(Output.of(nonce));
        }

        /**
         * @param pkcs7 The PKCS#7 signature of the identity document to
         * authenticate with, with all newline characters removed. Can be retrieved from
         * the EC2 metadata server.
         * 
         * @return builder
         * 
         */
        public Builder pkcs7(@Nullable Output<String> pkcs7) {
            $.pkcs7 = pkcs7;
            return this;
        }

        /**
         * @param pkcs7 The PKCS#7 signature of the identity document to
         * authenticate with, with all newline characters removed. Can be retrieved from
         * the EC2 metadata server.
         * 
         * @return builder
         * 
         */
        public Builder pkcs7(String pkcs7) {
            return pkcs7(Output.of(pkcs7));
        }

        /**
         * @param role The name of the AWS auth backend role to create tokens
         * against.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The name of the AWS auth backend role to create tokens
         * against.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param signature The base64-encoded SHA256 RSA signature of the
         * instance identity document to authenticate with, with all newline characters
         * removed. Can be retrieved from the EC2 metadata server.
         * 
         * @return builder
         * 
         */
        public Builder signature(@Nullable Output<String> signature) {
            $.signature = signature;
            return this;
        }

        /**
         * @param signature The base64-encoded SHA256 RSA signature of the
         * instance identity document to authenticate with, with all newline characters
         * removed. Can be retrieved from the EC2 metadata server.
         * 
         * @return builder
         * 
         */
        public Builder signature(String signature) {
            return signature(Output.of(signature));
        }

        public AuthBackendLoginArgs build() {
            return $;
        }
    }

}
