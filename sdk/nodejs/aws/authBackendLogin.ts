// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Logs into a Vault server using an AWS auth backend. Login can be
 * accomplished using a signed identity request from IAM or using ec2
 * instance metadata. For more information, see the [Vault
 * documentation](https://www.vaultproject.io/docs/auth/aws.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 *
 * const aws = new vault.AuthBackend("aws", {
 *     type: "aws",
 * });
 * const exampleAuthBackendClient = new vault.aws.AuthBackendClient("example", {
 *     accessKey: "123456789012",
 *     backend: aws.path,
 *     secretKey: "AWSSECRETKEYGOESHERE",
 * });
 * const exampleAuthBackendRole = new vault.aws.AuthBackendRole("example", {
 *     authType: "ec2",
 *     backend: aws.path,
 *     boundAccountId: "123456789012",
 *     boundAmiId: "ami-8c1be5f6",
 *     boundIamInstanceProfileArn: "arn:aws:iam::123456789012:instance-profile/MyProfile",
 *     boundSubnetId: "vpc-133128f1",
 *     boundVpcId: "vpc-b61106d4",
 *     maxTtl: 120,
 *     role: "test-role",
 *     tokenPolicies: [
 *         "default",
 *         "dev",
 *         "prod",
 *     ],
 *     ttl: 60,
 * }, { dependsOn: [exampleAuthBackendClient] });
 * const exampleAuthBackendLogin = new vault.aws.AuthBackendLogin("example", {
 *     backend: vault_auth_backend_example.path,
 *     identity: "BASE64ENCODEDIDENTITYDOCUMENT",
 *     role: exampleAuthBackendRole.role,
 *     signature: "BASE64ENCODEDSHA256IDENTITYDOCUMENTSIGNATURE",
 * });
 * ```
 */
export class AuthBackendLogin extends pulumi.CustomResource {
    /**
     * Get an existing AuthBackendLogin resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AuthBackendLoginState, opts?: pulumi.CustomResourceOptions): AuthBackendLogin {
        return new AuthBackendLogin(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'vault:aws/authBackendLogin:AuthBackendLogin';

    /**
     * Returns true if the given object is an instance of AuthBackendLogin.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AuthBackendLogin {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AuthBackendLogin.__pulumiType;
    }

    /**
     * The token's accessor.
     */
    public /*out*/ readonly accessor!: pulumi.Output<string>;
    /**
     * The authentication type used to generate this token.
     */
    public /*out*/ readonly authType!: pulumi.Output<string>;
    /**
     * The unique name of the AWS auth backend. Defaults to
     * 'aws'.
     */
    public readonly backend!: pulumi.Output<string | undefined>;
    /**
     * The token returned by Vault.
     */
    public /*out*/ readonly clientToken!: pulumi.Output<string>;
    /**
     * The HTTP method used in the signed IAM
     * request.
     */
    public readonly iamHttpRequestMethod!: pulumi.Output<string | undefined>;
    /**
     * The base64-encoded body of the signed
     * request.
     */
    public readonly iamRequestBody!: pulumi.Output<string | undefined>;
    /**
     * The base64-encoded, JSON serialized
     * representation of the GetCallerIdentity HTTP request headers.
     */
    public readonly iamRequestHeaders!: pulumi.Output<string | undefined>;
    /**
     * The base64-encoded HTTP URL used in the signed
     * request.
     */
    public readonly iamRequestUrl!: pulumi.Output<string | undefined>;
    /**
     * The base64-encoded EC2 instance identity document to
     * authenticate with. Can be retrieved from the EC2 metadata server.
     */
    public readonly identity!: pulumi.Output<string | undefined>;
    /**
     * The duration in seconds the token will be valid, relative
     * to the time in `leaseStartTime`.
     */
    public /*out*/ readonly leaseDuration!: pulumi.Output<number>;
    /**
     * Time at which the lease was read, using the clock of the system where Terraform was running
     */
    public /*out*/ readonly leaseStartTime!: pulumi.Output<string>;
    /**
     * A map of information returned by the Vault server about the
     * authentication used to generate this token.
     */
    public /*out*/ readonly metadata!: pulumi.Output<{[key: string]: any}>;
    /**
     * The unique nonce to be used for login requests. Can be
     * set to a user-specified value, or will contain the server-generated value
     * once a token is issued. EC2 instances can only acquire a single token until
     * the whitelist is tidied again unless they keep track of this nonce.
     */
    public readonly nonce!: pulumi.Output<string>;
    /**
     * The PKCS#7 signature of the identity document to
     * authenticate with, with all newline characters removed. Can be retrieved from
     * the EC2 metadata server.
     */
    public readonly pkcs7!: pulumi.Output<string | undefined>;
    /**
     * The Vault policies assigned to this token.
     */
    public /*out*/ readonly policies!: pulumi.Output<string[]>;
    /**
     * Set to true if the token can be extended through renewal.
     */
    public /*out*/ readonly renewable!: pulumi.Output<boolean>;
    /**
     * The name of the AWS auth backend role to create tokens
     * against.
     */
    public readonly role!: pulumi.Output<string>;
    /**
     * The base64-encoded SHA256 RSA signature of the
     * instance identity document to authenticate with, with all newline characters
     * removed. Can be retrieved from the EC2 metadata server.
     */
    public readonly signature!: pulumi.Output<string | undefined>;

    /**
     * Create a AuthBackendLogin resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AuthBackendLoginArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AuthBackendLoginArgs | AuthBackendLoginState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as AuthBackendLoginState | undefined;
            inputs["accessor"] = state ? state.accessor : undefined;
            inputs["authType"] = state ? state.authType : undefined;
            inputs["backend"] = state ? state.backend : undefined;
            inputs["clientToken"] = state ? state.clientToken : undefined;
            inputs["iamHttpRequestMethod"] = state ? state.iamHttpRequestMethod : undefined;
            inputs["iamRequestBody"] = state ? state.iamRequestBody : undefined;
            inputs["iamRequestHeaders"] = state ? state.iamRequestHeaders : undefined;
            inputs["iamRequestUrl"] = state ? state.iamRequestUrl : undefined;
            inputs["identity"] = state ? state.identity : undefined;
            inputs["leaseDuration"] = state ? state.leaseDuration : undefined;
            inputs["leaseStartTime"] = state ? state.leaseStartTime : undefined;
            inputs["metadata"] = state ? state.metadata : undefined;
            inputs["nonce"] = state ? state.nonce : undefined;
            inputs["pkcs7"] = state ? state.pkcs7 : undefined;
            inputs["policies"] = state ? state.policies : undefined;
            inputs["renewable"] = state ? state.renewable : undefined;
            inputs["role"] = state ? state.role : undefined;
            inputs["signature"] = state ? state.signature : undefined;
        } else {
            const args = argsOrState as AuthBackendLoginArgs | undefined;
            inputs["backend"] = args ? args.backend : undefined;
            inputs["iamHttpRequestMethod"] = args ? args.iamHttpRequestMethod : undefined;
            inputs["iamRequestBody"] = args ? args.iamRequestBody : undefined;
            inputs["iamRequestHeaders"] = args ? args.iamRequestHeaders : undefined;
            inputs["iamRequestUrl"] = args ? args.iamRequestUrl : undefined;
            inputs["identity"] = args ? args.identity : undefined;
            inputs["nonce"] = args ? args.nonce : undefined;
            inputs["pkcs7"] = args ? args.pkcs7 : undefined;
            inputs["role"] = args ? args.role : undefined;
            inputs["signature"] = args ? args.signature : undefined;
            inputs["accessor"] = undefined /*out*/;
            inputs["authType"] = undefined /*out*/;
            inputs["clientToken"] = undefined /*out*/;
            inputs["leaseDuration"] = undefined /*out*/;
            inputs["leaseStartTime"] = undefined /*out*/;
            inputs["metadata"] = undefined /*out*/;
            inputs["policies"] = undefined /*out*/;
            inputs["renewable"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(AuthBackendLogin.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AuthBackendLogin resources.
 */
export interface AuthBackendLoginState {
    /**
     * The token's accessor.
     */
    readonly accessor?: pulumi.Input<string>;
    /**
     * The authentication type used to generate this token.
     */
    readonly authType?: pulumi.Input<string>;
    /**
     * The unique name of the AWS auth backend. Defaults to
     * 'aws'.
     */
    readonly backend?: pulumi.Input<string>;
    /**
     * The token returned by Vault.
     */
    readonly clientToken?: pulumi.Input<string>;
    /**
     * The HTTP method used in the signed IAM
     * request.
     */
    readonly iamHttpRequestMethod?: pulumi.Input<string>;
    /**
     * The base64-encoded body of the signed
     * request.
     */
    readonly iamRequestBody?: pulumi.Input<string>;
    /**
     * The base64-encoded, JSON serialized
     * representation of the GetCallerIdentity HTTP request headers.
     */
    readonly iamRequestHeaders?: pulumi.Input<string>;
    /**
     * The base64-encoded HTTP URL used in the signed
     * request.
     */
    readonly iamRequestUrl?: pulumi.Input<string>;
    /**
     * The base64-encoded EC2 instance identity document to
     * authenticate with. Can be retrieved from the EC2 metadata server.
     */
    readonly identity?: pulumi.Input<string>;
    /**
     * The duration in seconds the token will be valid, relative
     * to the time in `leaseStartTime`.
     */
    readonly leaseDuration?: pulumi.Input<number>;
    /**
     * Time at which the lease was read, using the clock of the system where Terraform was running
     */
    readonly leaseStartTime?: pulumi.Input<string>;
    /**
     * A map of information returned by the Vault server about the
     * authentication used to generate this token.
     */
    readonly metadata?: pulumi.Input<{[key: string]: any}>;
    /**
     * The unique nonce to be used for login requests. Can be
     * set to a user-specified value, or will contain the server-generated value
     * once a token is issued. EC2 instances can only acquire a single token until
     * the whitelist is tidied again unless they keep track of this nonce.
     */
    readonly nonce?: pulumi.Input<string>;
    /**
     * The PKCS#7 signature of the identity document to
     * authenticate with, with all newline characters removed. Can be retrieved from
     * the EC2 metadata server.
     */
    readonly pkcs7?: pulumi.Input<string>;
    /**
     * The Vault policies assigned to this token.
     */
    readonly policies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Set to true if the token can be extended through renewal.
     */
    readonly renewable?: pulumi.Input<boolean>;
    /**
     * The name of the AWS auth backend role to create tokens
     * against.
     */
    readonly role?: pulumi.Input<string>;
    /**
     * The base64-encoded SHA256 RSA signature of the
     * instance identity document to authenticate with, with all newline characters
     * removed. Can be retrieved from the EC2 metadata server.
     */
    readonly signature?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AuthBackendLogin resource.
 */
export interface AuthBackendLoginArgs {
    /**
     * The unique name of the AWS auth backend. Defaults to
     * 'aws'.
     */
    readonly backend?: pulumi.Input<string>;
    /**
     * The HTTP method used in the signed IAM
     * request.
     */
    readonly iamHttpRequestMethod?: pulumi.Input<string>;
    /**
     * The base64-encoded body of the signed
     * request.
     */
    readonly iamRequestBody?: pulumi.Input<string>;
    /**
     * The base64-encoded, JSON serialized
     * representation of the GetCallerIdentity HTTP request headers.
     */
    readonly iamRequestHeaders?: pulumi.Input<string>;
    /**
     * The base64-encoded HTTP URL used in the signed
     * request.
     */
    readonly iamRequestUrl?: pulumi.Input<string>;
    /**
     * The base64-encoded EC2 instance identity document to
     * authenticate with. Can be retrieved from the EC2 metadata server.
     */
    readonly identity?: pulumi.Input<string>;
    /**
     * The unique nonce to be used for login requests. Can be
     * set to a user-specified value, or will contain the server-generated value
     * once a token is issued. EC2 instances can only acquire a single token until
     * the whitelist is tidied again unless they keep track of this nonce.
     */
    readonly nonce?: pulumi.Input<string>;
    /**
     * The PKCS#7 signature of the identity document to
     * authenticate with, with all newline characters removed. Can be retrieved from
     * the EC2 metadata server.
     */
    readonly pkcs7?: pulumi.Input<string>;
    /**
     * The name of the AWS auth backend role to create tokens
     * against.
     */
    readonly role?: pulumi.Input<string>;
    /**
     * The base64-encoded SHA256 RSA signature of the
     * instance identity document to authenticate with, with all newline characters
     * removed. Can be retrieved from the EC2 metadata server.
     */
    readonly signature?: pulumi.Input<string>;
}
