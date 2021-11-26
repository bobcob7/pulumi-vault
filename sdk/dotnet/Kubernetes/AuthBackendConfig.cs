// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.Kubernetes
{
    /// <summary>
    /// Manages an Kubernetes auth backend config in a Vault server. See the [Vault
    /// documentation](https://www.vaultproject.io/docs/auth/kubernetes.html) for more
    /// information.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Vault = Pulumi.Vault;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var kubernetes = new Vault.AuthBackend("kubernetes", new Vault.AuthBackendArgs
    ///         {
    ///             Type = "kubernetes",
    ///         });
    ///         var example = new Vault.Kubernetes.AuthBackendConfig("example", new Vault.Kubernetes.AuthBackendConfigArgs
    ///         {
    ///             Backend = kubernetes.Path,
    ///             KubernetesHost = "http://example.com:443",
    ///             KubernetesCaCert = @"-----BEGIN CERTIFICATE-----
    /// example
    /// -----END CERTIFICATE-----",
    ///             TokenReviewerJwt = "ZXhhbXBsZQo=",
    ///             Issuer = "api",
    ///             DisableIssValidation = true,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Kubernetes authentication backend can be imported using the `path`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import vault:kubernetes/authBackendConfig:AuthBackendConfig config auth/kubernetes/config
    /// ```
    /// </summary>
    [VaultResourceType("vault:kubernetes/authBackendConfig:AuthBackendConfig")]
    public partial class AuthBackendConfig : Pulumi.CustomResource
    {
        /// <summary>
        /// Unique name of the kubernetes backend to configure.
        /// </summary>
        [Output("backend")]
        public Output<string?> Backend { get; private set; } = null!;

        /// <summary>
        /// Disable JWT issuer validation. Allows to skip ISS validation. Requires Vault `v1.5.4+` or Vault auth kubernetes plugin `v0.7.1+`
        /// </summary>
        [Output("disableIssValidation")]
        public Output<bool> DisableIssValidation { get; private set; } = null!;

        /// <summary>
        /// Disable defaulting to the local CA cert and service account JWT when running in a Kubernetes pod. Requires Vault `v1.5.4+` or Vault auth kubernetes plugin `v0.7.1+`
        /// </summary>
        [Output("disableLocalCaJwt")]
        public Output<bool> DisableLocalCaJwt { get; private set; } = null!;

        /// <summary>
        /// JWT issuer. If no issuer is specified, `kubernetes.io/serviceaccount` will be used as the default issuer.
        /// </summary>
        [Output("issuer")]
        public Output<string?> Issuer { get; private set; } = null!;

        /// <summary>
        /// PEM encoded CA cert for use by the TLS client used to talk with the Kubernetes API.
        /// </summary>
        [Output("kubernetesCaCert")]
        public Output<string?> KubernetesCaCert { get; private set; } = null!;

        /// <summary>
        /// Host must be a host string, a host:port pair, or a URL to the base of the Kubernetes API server.
        /// </summary>
        [Output("kubernetesHost")]
        public Output<string> KubernetesHost { get; private set; } = null!;

        /// <summary>
        /// List of PEM-formatted public keys or certificates used to verify the signatures of Kubernetes service account JWTs. If a certificate is given, its public key will be extracted. Not every installation of Kubernetes exposes these keys.
        /// </summary>
        [Output("pemKeys")]
        public Output<ImmutableArray<string>> PemKeys { get; private set; } = null!;

        /// <summary>
        /// A service account JWT used to access the TokenReview API to validate other JWTs during login. If not set the JWT used for login will be used to access the API.
        /// </summary>
        [Output("tokenReviewerJwt")]
        public Output<string?> TokenReviewerJwt { get; private set; } = null!;


        /// <summary>
        /// Create a AuthBackendConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AuthBackendConfig(string name, AuthBackendConfigArgs args, CustomResourceOptions? options = null)
            : base("vault:kubernetes/authBackendConfig:AuthBackendConfig", name, args ?? new AuthBackendConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AuthBackendConfig(string name, Input<string> id, AuthBackendConfigState? state = null, CustomResourceOptions? options = null)
            : base("vault:kubernetes/authBackendConfig:AuthBackendConfig", name, state, MakeResourceOptions(options, id))
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
        /// <summary>
        /// Get an existing AuthBackendConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AuthBackendConfig Get(string name, Input<string> id, AuthBackendConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new AuthBackendConfig(name, id, state, options);
        }
    }

    public sealed class AuthBackendConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique name of the kubernetes backend to configure.
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        /// <summary>
        /// Disable JWT issuer validation. Allows to skip ISS validation. Requires Vault `v1.5.4+` or Vault auth kubernetes plugin `v0.7.1+`
        /// </summary>
        [Input("disableIssValidation")]
        public Input<bool>? DisableIssValidation { get; set; }

        /// <summary>
        /// Disable defaulting to the local CA cert and service account JWT when running in a Kubernetes pod. Requires Vault `v1.5.4+` or Vault auth kubernetes plugin `v0.7.1+`
        /// </summary>
        [Input("disableLocalCaJwt")]
        public Input<bool>? DisableLocalCaJwt { get; set; }

        /// <summary>
        /// JWT issuer. If no issuer is specified, `kubernetes.io/serviceaccount` will be used as the default issuer.
        /// </summary>
        [Input("issuer")]
        public Input<string>? Issuer { get; set; }

        /// <summary>
        /// PEM encoded CA cert for use by the TLS client used to talk with the Kubernetes API.
        /// </summary>
        [Input("kubernetesCaCert")]
        public Input<string>? KubernetesCaCert { get; set; }

        /// <summary>
        /// Host must be a host string, a host:port pair, or a URL to the base of the Kubernetes API server.
        /// </summary>
        [Input("kubernetesHost", required: true)]
        public Input<string> KubernetesHost { get; set; } = null!;

        [Input("pemKeys")]
        private InputList<string>? _pemKeys;

        /// <summary>
        /// List of PEM-formatted public keys or certificates used to verify the signatures of Kubernetes service account JWTs. If a certificate is given, its public key will be extracted. Not every installation of Kubernetes exposes these keys.
        /// </summary>
        public InputList<string> PemKeys
        {
            get => _pemKeys ?? (_pemKeys = new InputList<string>());
            set => _pemKeys = value;
        }

        /// <summary>
        /// A service account JWT used to access the TokenReview API to validate other JWTs during login. If not set the JWT used for login will be used to access the API.
        /// </summary>
        [Input("tokenReviewerJwt")]
        public Input<string>? TokenReviewerJwt { get; set; }

        public AuthBackendConfigArgs()
        {
        }
    }

    public sealed class AuthBackendConfigState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique name of the kubernetes backend to configure.
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        /// <summary>
        /// Disable JWT issuer validation. Allows to skip ISS validation. Requires Vault `v1.5.4+` or Vault auth kubernetes plugin `v0.7.1+`
        /// </summary>
        [Input("disableIssValidation")]
        public Input<bool>? DisableIssValidation { get; set; }

        /// <summary>
        /// Disable defaulting to the local CA cert and service account JWT when running in a Kubernetes pod. Requires Vault `v1.5.4+` or Vault auth kubernetes plugin `v0.7.1+`
        /// </summary>
        [Input("disableLocalCaJwt")]
        public Input<bool>? DisableLocalCaJwt { get; set; }

        /// <summary>
        /// JWT issuer. If no issuer is specified, `kubernetes.io/serviceaccount` will be used as the default issuer.
        /// </summary>
        [Input("issuer")]
        public Input<string>? Issuer { get; set; }

        /// <summary>
        /// PEM encoded CA cert for use by the TLS client used to talk with the Kubernetes API.
        /// </summary>
        [Input("kubernetesCaCert")]
        public Input<string>? KubernetesCaCert { get; set; }

        /// <summary>
        /// Host must be a host string, a host:port pair, or a URL to the base of the Kubernetes API server.
        /// </summary>
        [Input("kubernetesHost")]
        public Input<string>? KubernetesHost { get; set; }

        [Input("pemKeys")]
        private InputList<string>? _pemKeys;

        /// <summary>
        /// List of PEM-formatted public keys or certificates used to verify the signatures of Kubernetes service account JWTs. If a certificate is given, its public key will be extracted. Not every installation of Kubernetes exposes these keys.
        /// </summary>
        public InputList<string> PemKeys
        {
            get => _pemKeys ?? (_pemKeys = new InputList<string>());
            set => _pemKeys = value;
        }

        /// <summary>
        /// A service account JWT used to access the TokenReview API to validate other JWTs during login. If not set the JWT used for login will be used to access the API.
        /// </summary>
        [Input("tokenReviewerJwt")]
        public Input<string>? TokenReviewerJwt { get; set; }

        public AuthBackendConfigState()
        {
        }
    }
}
