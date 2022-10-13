// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthBackendLoginState extends com.pulumi.resources.ResourceArgs {

    public static final AuthBackendLoginState Empty = new AuthBackendLoginState();

    /**
     * The token&#39;s accessor.
     * 
     */
    @Import(name="accessor")
    private @Nullable Output<String> accessor;

    /**
     * @return The token&#39;s accessor.
     * 
     */
    public Optional<Output<String>> accessor() {
        return Optional.ofNullable(this.accessor);
    }

    /**
     * The authentication type used to generate this token.
     * 
     */
    @Import(name="authType")
    private @Nullable Output<String> authType;

    /**
     * @return The authentication type used to generate this token.
     * 
     */
    public Optional<Output<String>> authType() {
        return Optional.ofNullable(this.authType);
    }

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
     * The token returned by Vault.
     * 
     */
    @Import(name="clientToken")
    private @Nullable Output<String> clientToken;

    /**
     * @return The token returned by Vault.
     * 
     */
    public Optional<Output<String>> clientToken() {
        return Optional.ofNullable(this.clientToken);
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
     * The duration in seconds the token will be valid, relative
     * to the time in `lease_start_time`.
     * 
     */
    @Import(name="leaseDuration")
    private @Nullable Output<Integer> leaseDuration;

    /**
     * @return The duration in seconds the token will be valid, relative
     * to the time in `lease_start_time`.
     * 
     */
    public Optional<Output<Integer>> leaseDuration() {
        return Optional.ofNullable(this.leaseDuration);
    }

    /**
     * Time at which the lease was read, using the clock of the system where Terraform was running
     * 
     */
    @Import(name="leaseStartTime")
    private @Nullable Output<String> leaseStartTime;

    /**
     * @return Time at which the lease was read, using the clock of the system where Terraform was running
     * 
     */
    public Optional<Output<String>> leaseStartTime() {
        return Optional.ofNullable(this.leaseStartTime);
    }

    /**
     * A map of information returned by the Vault server about the
     * authentication used to generate this token.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,Object>> metadata;

    /**
     * @return A map of information returned by the Vault server about the
     * authentication used to generate this token.
     * 
     */
    public Optional<Output<Map<String,Object>>> metadata() {
        return Optional.ofNullable(this.metadata);
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
     * The Vault policies assigned to this token.
     * 
     */
    @Import(name="policies")
    private @Nullable Output<List<String>> policies;

    /**
     * @return The Vault policies assigned to this token.
     * 
     */
    public Optional<Output<List<String>>> policies() {
        return Optional.ofNullable(this.policies);
    }

    /**
     * Set to true if the token can be extended through renewal.
     * 
     */
    @Import(name="renewable")
    private @Nullable Output<Boolean> renewable;

    /**
     * @return Set to true if the token can be extended through renewal.
     * 
     */
    public Optional<Output<Boolean>> renewable() {
        return Optional.ofNullable(this.renewable);
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

    private AuthBackendLoginState() {}

    private AuthBackendLoginState(AuthBackendLoginState $) {
        this.accessor = $.accessor;
        this.authType = $.authType;
        this.backend = $.backend;
        this.clientToken = $.clientToken;
        this.iamHttpRequestMethod = $.iamHttpRequestMethod;
        this.iamRequestBody = $.iamRequestBody;
        this.iamRequestHeaders = $.iamRequestHeaders;
        this.iamRequestUrl = $.iamRequestUrl;
        this.identity = $.identity;
        this.leaseDuration = $.leaseDuration;
        this.leaseStartTime = $.leaseStartTime;
        this.metadata = $.metadata;
        this.namespace = $.namespace;
        this.nonce = $.nonce;
        this.pkcs7 = $.pkcs7;
        this.policies = $.policies;
        this.renewable = $.renewable;
        this.role = $.role;
        this.signature = $.signature;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthBackendLoginState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthBackendLoginState $;

        public Builder() {
            $ = new AuthBackendLoginState();
        }

        public Builder(AuthBackendLoginState defaults) {
            $ = new AuthBackendLoginState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessor The token&#39;s accessor.
         * 
         * @return builder
         * 
         */
        public Builder accessor(@Nullable Output<String> accessor) {
            $.accessor = accessor;
            return this;
        }

        /**
         * @param accessor The token&#39;s accessor.
         * 
         * @return builder
         * 
         */
        public Builder accessor(String accessor) {
            return accessor(Output.of(accessor));
        }

        /**
         * @param authType The authentication type used to generate this token.
         * 
         * @return builder
         * 
         */
        public Builder authType(@Nullable Output<String> authType) {
            $.authType = authType;
            return this;
        }

        /**
         * @param authType The authentication type used to generate this token.
         * 
         * @return builder
         * 
         */
        public Builder authType(String authType) {
            return authType(Output.of(authType));
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
         * @param clientToken The token returned by Vault.
         * 
         * @return builder
         * 
         */
        public Builder clientToken(@Nullable Output<String> clientToken) {
            $.clientToken = clientToken;
            return this;
        }

        /**
         * @param clientToken The token returned by Vault.
         * 
         * @return builder
         * 
         */
        public Builder clientToken(String clientToken) {
            return clientToken(Output.of(clientToken));
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
         * @param leaseDuration The duration in seconds the token will be valid, relative
         * to the time in `lease_start_time`.
         * 
         * @return builder
         * 
         */
        public Builder leaseDuration(@Nullable Output<Integer> leaseDuration) {
            $.leaseDuration = leaseDuration;
            return this;
        }

        /**
         * @param leaseDuration The duration in seconds the token will be valid, relative
         * to the time in `lease_start_time`.
         * 
         * @return builder
         * 
         */
        public Builder leaseDuration(Integer leaseDuration) {
            return leaseDuration(Output.of(leaseDuration));
        }

        /**
         * @param leaseStartTime Time at which the lease was read, using the clock of the system where Terraform was running
         * 
         * @return builder
         * 
         */
        public Builder leaseStartTime(@Nullable Output<String> leaseStartTime) {
            $.leaseStartTime = leaseStartTime;
            return this;
        }

        /**
         * @param leaseStartTime Time at which the lease was read, using the clock of the system where Terraform was running
         * 
         * @return builder
         * 
         */
        public Builder leaseStartTime(String leaseStartTime) {
            return leaseStartTime(Output.of(leaseStartTime));
        }

        /**
         * @param metadata A map of information returned by the Vault server about the
         * authentication used to generate this token.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,Object>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata A map of information returned by the Vault server about the
         * authentication used to generate this token.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,Object> metadata) {
            return metadata(Output.of(metadata));
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
         * @param policies The Vault policies assigned to this token.
         * 
         * @return builder
         * 
         */
        public Builder policies(@Nullable Output<List<String>> policies) {
            $.policies = policies;
            return this;
        }

        /**
         * @param policies The Vault policies assigned to this token.
         * 
         * @return builder
         * 
         */
        public Builder policies(List<String> policies) {
            return policies(Output.of(policies));
        }

        /**
         * @param policies The Vault policies assigned to this token.
         * 
         * @return builder
         * 
         */
        public Builder policies(String... policies) {
            return policies(List.of(policies));
        }

        /**
         * @param renewable Set to true if the token can be extended through renewal.
         * 
         * @return builder
         * 
         */
        public Builder renewable(@Nullable Output<Boolean> renewable) {
            $.renewable = renewable;
            return this;
        }

        /**
         * @param renewable Set to true if the token can be extended through renewal.
         * 
         * @return builder
         * 
         */
        public Builder renewable(Boolean renewable) {
            return renewable(Output.of(renewable));
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

        public AuthBackendLoginState build() {
            return $;
        }
    }

}
