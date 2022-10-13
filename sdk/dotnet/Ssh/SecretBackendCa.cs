// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.Ssh
{
    /// <summary>
    /// Provides a resource to manage CA information in an SSH secret backend
    /// [SSH secret backend within Vault](https://www.vaultproject.io/docs/secrets/ssh/index.html).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Vault = Pulumi.Vault;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Vault.Mount("example", new()
    ///     {
    ///         Type = "ssh",
    ///     });
    /// 
    ///     var foo = new Vault.Ssh.SecretBackendCa("foo", new()
    ///     {
    ///         Backend = example.Path,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// SSH secret backend CAs can be imported using the `path`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import vault:ssh/secretBackendCa:SecretBackendCa foo ssh
    /// ```
    /// </summary>
    [VaultResourceType("vault:ssh/secretBackendCa:SecretBackendCa")]
    public partial class SecretBackendCa : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The path where the SSH secret backend is mounted. Defaults to 'ssh'
        /// </summary>
        [Output("backend")]
        public Output<string?> Backend { get; private set; } = null!;

        /// <summary>
        /// Whether Vault should generate the signing key pair internally. Defaults to true
        /// </summary>
        [Output("generateSigningKey")]
        public Output<bool?> GenerateSigningKey { get; private set; } = null!;

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        /// <summary>
        /// The private key part the SSH CA key pair; required if generate_signing_key is false.
        /// </summary>
        [Output("privateKey")]
        public Output<string> PrivateKey { get; private set; } = null!;

        /// <summary>
        /// The public key part the SSH CA key pair; required if generate_signing_key is false.
        /// </summary>
        [Output("publicKey")]
        public Output<string> PublicKey { get; private set; } = null!;


        /// <summary>
        /// Create a SecretBackendCa resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecretBackendCa(string name, SecretBackendCaArgs? args = null, CustomResourceOptions? options = null)
            : base("vault:ssh/secretBackendCa:SecretBackendCa", name, args ?? new SecretBackendCaArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecretBackendCa(string name, Input<string> id, SecretBackendCaState? state = null, CustomResourceOptions? options = null)
            : base("vault:ssh/secretBackendCa:SecretBackendCa", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "privateKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SecretBackendCa resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecretBackendCa Get(string name, Input<string> id, SecretBackendCaState? state = null, CustomResourceOptions? options = null)
        {
            return new SecretBackendCa(name, id, state, options);
        }
    }

    public sealed class SecretBackendCaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The path where the SSH secret backend is mounted. Defaults to 'ssh'
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        /// <summary>
        /// Whether Vault should generate the signing key pair internally. Defaults to true
        /// </summary>
        [Input("generateSigningKey")]
        public Input<bool>? GenerateSigningKey { get; set; }

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("privateKey")]
        private Input<string>? _privateKey;

        /// <summary>
        /// The private key part the SSH CA key pair; required if generate_signing_key is false.
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The public key part the SSH CA key pair; required if generate_signing_key is false.
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        public SecretBackendCaArgs()
        {
        }
        public static new SecretBackendCaArgs Empty => new SecretBackendCaArgs();
    }

    public sealed class SecretBackendCaState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The path where the SSH secret backend is mounted. Defaults to 'ssh'
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        /// <summary>
        /// Whether Vault should generate the signing key pair internally. Defaults to true
        /// </summary>
        [Input("generateSigningKey")]
        public Input<bool>? GenerateSigningKey { get; set; }

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("privateKey")]
        private Input<string>? _privateKey;

        /// <summary>
        /// The private key part the SSH CA key pair; required if generate_signing_key is false.
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The public key part the SSH CA key pair; required if generate_signing_key is false.
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        public SecretBackendCaState()
        {
        }
        public static new SecretBackendCaState Empty => new SecretBackendCaState();
    }
}
