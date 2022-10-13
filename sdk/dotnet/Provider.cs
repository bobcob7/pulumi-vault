// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault
{
    /// <summary>
    /// The provider type for the vault package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [VaultResourceType("pulumi:providers:vault")]
    public partial class Provider : global::Pulumi.ProviderResource
    {
        /// <summary>
        /// If true, adds the value of the `address` argument to the Terraform process environment.
        /// </summary>
        [Output("addAddressToEnv")]
        public Output<string?> AddAddressToEnv { get; private set; } = null!;

        /// <summary>
        /// URL of the root of the target Vault server.
        /// </summary>
        [Output("address")]
        public Output<string> Address { get; private set; } = null!;

        /// <summary>
        /// Path to directory containing CA certificate files to validate the server's certificate.
        /// </summary>
        [Output("caCertDir")]
        public Output<string?> CaCertDir { get; private set; } = null!;

        /// <summary>
        /// Path to a CA certificate file to validate the server's certificate.
        /// </summary>
        [Output("caCertFile")]
        public Output<string?> CaCertFile { get; private set; } = null!;

        /// <summary>
        /// The namespace to use. Available only for Vault Enterprise.
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        /// <summary>
        /// Name to use as the SNI host when connecting via TLS.
        /// </summary>
        [Output("tlsServerName")]
        public Output<string?> TlsServerName { get; private set; } = null!;

        /// <summary>
        /// Token to use to authenticate to Vault.
        /// </summary>
        [Output("token")]
        public Output<string> Token { get; private set; } = null!;

        /// <summary>
        /// Token name to use for creating the Vault child token.
        /// </summary>
        [Output("tokenName")]
        public Output<string?> TokenName { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs args, CustomResourceOptions? options = null)
            : base("vault", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, adds the value of the `address` argument to the Terraform process environment.
        /// </summary>
        [Input("addAddressToEnv")]
        public Input<string>? AddAddressToEnv { get; set; }

        /// <summary>
        /// URL of the root of the target Vault server.
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// Login to vault with an existing auth method using auth/&lt;mount&gt;/login
        /// </summary>
        [Input("authLogin", json: true)]
        public Input<Inputs.ProviderAuthLoginArgs>? AuthLogin { get; set; }

        /// <summary>
        /// Login to vault using the AWS method
        /// </summary>
        [Input("authLoginAws", json: true)]
        public Input<Inputs.ProviderAuthLoginAwsArgs>? AuthLoginAws { get; set; }

        /// <summary>
        /// Login to vault using the azure method
        /// </summary>
        [Input("authLoginAzure", json: true)]
        public Input<Inputs.ProviderAuthLoginAzureArgs>? AuthLoginAzure { get; set; }

        /// <summary>
        /// Login to vault using the cert method
        /// </summary>
        [Input("authLoginCert", json: true)]
        public Input<Inputs.ProviderAuthLoginCertArgs>? AuthLoginCert { get; set; }

        /// <summary>
        /// Login to vault using the gcp method
        /// </summary>
        [Input("authLoginGcp", json: true)]
        public Input<Inputs.ProviderAuthLoginGcpArgs>? AuthLoginGcp { get; set; }

        /// <summary>
        /// Login to vault using the jwt method
        /// </summary>
        [Input("authLoginJwt", json: true)]
        public Input<Inputs.ProviderAuthLoginJwtArgs>? AuthLoginJwt { get; set; }

        /// <summary>
        /// Login to vault using the kerberos method
        /// </summary>
        [Input("authLoginKerberos", json: true)]
        public Input<Inputs.ProviderAuthLoginKerberosArgs>? AuthLoginKerberos { get; set; }

        /// <summary>
        /// Login to vault using the OCI method
        /// </summary>
        [Input("authLoginOci", json: true)]
        public Input<Inputs.ProviderAuthLoginOciArgs>? AuthLoginOci { get; set; }

        /// <summary>
        /// Login to vault using the oidc method
        /// </summary>
        [Input("authLoginOidc", json: true)]
        public Input<Inputs.ProviderAuthLoginOidcArgs>? AuthLoginOidc { get; set; }

        /// <summary>
        /// Login to vault using the radius method
        /// </summary>
        [Input("authLoginRadius", json: true)]
        public Input<Inputs.ProviderAuthLoginRadiusArgs>? AuthLoginRadius { get; set; }

        /// <summary>
        /// Login to vault using the userpass method
        /// </summary>
        [Input("authLoginUserpass", json: true)]
        public Input<Inputs.ProviderAuthLoginUserpassArgs>? AuthLoginUserpass { get; set; }

        /// <summary>
        /// Path to directory containing CA certificate files to validate the server's certificate.
        /// </summary>
        [Input("caCertDir")]
        public Input<string>? CaCertDir { get; set; }

        /// <summary>
        /// Path to a CA certificate file to validate the server's certificate.
        /// </summary>
        [Input("caCertFile")]
        public Input<string>? CaCertFile { get; set; }

        /// <summary>
        /// Client authentication credentials.
        /// </summary>
        [Input("clientAuth", json: true)]
        public Input<Inputs.ProviderClientAuthArgs>? ClientAuth { get; set; }

        [Input("headers", json: true)]
        private InputList<Inputs.ProviderHeaderArgs>? _headers;

        /// <summary>
        /// The headers to send with each Vault request.
        /// </summary>
        public InputList<Inputs.ProviderHeaderArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.ProviderHeaderArgs>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableArray.Create<Inputs.ProviderHeaderArgs>());
                _headers = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// Maximum TTL for secret leases requested by this provider.
        /// </summary>
        [Input("maxLeaseTtlSeconds", json: true)]
        public Input<int>? MaxLeaseTtlSeconds { get; set; }

        /// <summary>
        /// Maximum number of retries when a 5xx error code is encountered.
        /// </summary>
        [Input("maxRetries", json: true)]
        public Input<int>? MaxRetries { get; set; }

        /// <summary>
        /// Maximum number of retries for Client Controlled Consistency related operations
        /// </summary>
        [Input("maxRetriesCcc", json: true)]
        public Input<int>? MaxRetriesCcc { get; set; }

        /// <summary>
        /// The namespace to use. Available only for Vault Enterprise.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// Set this to true to prevent the creation of ephemeral child token used by this provider.
        /// </summary>
        [Input("skipChildToken", json: true)]
        public Input<bool>? SkipChildToken { get; set; }

        /// <summary>
        /// Set this to true only if the target Vault server is an insecure development instance.
        /// </summary>
        [Input("skipTlsVerify", json: true)]
        public Input<bool>? SkipTlsVerify { get; set; }

        /// <summary>
        /// Name to use as the SNI host when connecting via TLS.
        /// </summary>
        [Input("tlsServerName")]
        public Input<string>? TlsServerName { get; set; }

        /// <summary>
        /// Token to use to authenticate to Vault.
        /// </summary>
        [Input("token", required: true)]
        public Input<string> Token { get; set; } = null!;

        /// <summary>
        /// Token name to use for creating the Vault child token.
        /// </summary>
        [Input("tokenName")]
        public Input<string>? TokenName { get; set; }

        public ProviderArgs()
        {
            MaxLeaseTtlSeconds = Utilities.GetEnvInt32("TERRAFORM_VAULT_MAX_TTL") ?? 1200;
            MaxRetries = Utilities.GetEnvInt32("VAULT_MAX_RETRIES") ?? 2;
            SkipTlsVerify = Utilities.GetEnvBoolean("VAULT_SKIP_VERIFY");
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }
}
