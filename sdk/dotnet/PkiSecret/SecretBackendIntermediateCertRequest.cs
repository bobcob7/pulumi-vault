// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.PkiSecret
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Vault = Pulumi.Vault;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Vault.PkiSecret.SecretBackendIntermediateCertRequest("test", new()
    ///     {
    ///         Backend = vault_mount.Pki.Path,
    ///         Type = "internal",
    ///         CommonName = "app.my.domain",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             vault_mount.Pki,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [VaultResourceType("vault:pkiSecret/secretBackendIntermediateCertRequest:SecretBackendIntermediateCertRequest")]
    public partial class SecretBackendIntermediateCertRequest : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of alternative names
        /// </summary>
        [Output("altNames")]
        public Output<ImmutableArray<string>> AltNames { get; private set; } = null!;

        /// <summary>
        /// The PKI secret backend the resource belongs to.
        /// </summary>
        [Output("backend")]
        public Output<string> Backend { get; private set; } = null!;

        /// <summary>
        /// CN of intermediate to create
        /// </summary>
        [Output("commonName")]
        public Output<string> CommonName { get; private set; } = null!;

        /// <summary>
        /// The country
        /// </summary>
        [Output("country")]
        public Output<string?> Country { get; private set; } = null!;

        /// <summary>
        /// The CSR
        /// </summary>
        [Output("csr")]
        public Output<string> Csr { get; private set; } = null!;

        /// <summary>
        /// Flag to exclude CN from SANs
        /// </summary>
        [Output("excludeCnFromSans")]
        public Output<bool?> ExcludeCnFromSans { get; private set; } = null!;

        /// <summary>
        /// The format of data
        /// </summary>
        [Output("format")]
        public Output<string?> Format { get; private set; } = null!;

        /// <summary>
        /// List of alternative IPs
        /// </summary>
        [Output("ipSans")]
        public Output<ImmutableArray<string>> IpSans { get; private set; } = null!;

        /// <summary>
        /// The number of bits to use
        /// </summary>
        [Output("keyBits")]
        public Output<int?> KeyBits { get; private set; } = null!;

        /// <summary>
        /// The desired key type
        /// </summary>
        [Output("keyType")]
        public Output<string?> KeyType { get; private set; } = null!;

        /// <summary>
        /// The locality
        /// </summary>
        [Output("locality")]
        public Output<string?> Locality { get; private set; } = null!;

        /// <summary>
        /// The ID of the previously configured managed key. This field is
        /// required if `type` is `kms` and it conflicts with `managed_key_name`
        /// </summary>
        [Output("managedKeyId")]
        public Output<string?> ManagedKeyId { get; private set; } = null!;

        /// <summary>
        /// The name of the previously configured managed key. This field is
        /// required if `type` is `kms`  and it conflicts with `managed_key_id`
        /// </summary>
        [Output("managedKeyName")]
        public Output<string?> ManagedKeyName { get; private set; } = null!;

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        /// <summary>
        /// The organization
        /// </summary>
        [Output("organization")]
        public Output<string?> Organization { get; private set; } = null!;

        /// <summary>
        /// List of other SANs
        /// </summary>
        [Output("otherSans")]
        public Output<ImmutableArray<string>> OtherSans { get; private set; } = null!;

        /// <summary>
        /// The organization unit
        /// </summary>
        [Output("ou")]
        public Output<string?> Ou { get; private set; } = null!;

        /// <summary>
        /// The postal code
        /// </summary>
        [Output("postalCode")]
        public Output<string?> PostalCode { get; private set; } = null!;

        /// <summary>
        /// The private key
        /// </summary>
        [Output("privateKey")]
        public Output<string> PrivateKey { get; private set; } = null!;

        /// <summary>
        /// The private key format
        /// </summary>
        [Output("privateKeyFormat")]
        public Output<string?> PrivateKeyFormat { get; private set; } = null!;

        /// <summary>
        /// The private key type
        /// </summary>
        [Output("privateKeyType")]
        public Output<string> PrivateKeyType { get; private set; } = null!;

        /// <summary>
        /// The province
        /// </summary>
        [Output("province")]
        public Output<string?> Province { get; private set; } = null!;

        /// <summary>
        /// The street address
        /// </summary>
        [Output("streetAddress")]
        public Output<string?> StreetAddress { get; private set; } = null!;

        /// <summary>
        /// Type of intermediate to create. Must be either \"exported\" or \"internal\"
        /// or \"kms\"
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// List of alternative URIs
        /// </summary>
        [Output("uriSans")]
        public Output<ImmutableArray<string>> UriSans { get; private set; } = null!;


        /// <summary>
        /// Create a SecretBackendIntermediateCertRequest resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecretBackendIntermediateCertRequest(string name, SecretBackendIntermediateCertRequestArgs args, CustomResourceOptions? options = null)
            : base("vault:pkiSecret/secretBackendIntermediateCertRequest:SecretBackendIntermediateCertRequest", name, args ?? new SecretBackendIntermediateCertRequestArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecretBackendIntermediateCertRequest(string name, Input<string> id, SecretBackendIntermediateCertRequestState? state = null, CustomResourceOptions? options = null)
            : base("vault:pkiSecret/secretBackendIntermediateCertRequest:SecretBackendIntermediateCertRequest", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SecretBackendIntermediateCertRequest resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecretBackendIntermediateCertRequest Get(string name, Input<string> id, SecretBackendIntermediateCertRequestState? state = null, CustomResourceOptions? options = null)
        {
            return new SecretBackendIntermediateCertRequest(name, id, state, options);
        }
    }

    public sealed class SecretBackendIntermediateCertRequestArgs : global::Pulumi.ResourceArgs
    {
        [Input("altNames")]
        private InputList<string>? _altNames;

        /// <summary>
        /// List of alternative names
        /// </summary>
        public InputList<string> AltNames
        {
            get => _altNames ?? (_altNames = new InputList<string>());
            set => _altNames = value;
        }

        /// <summary>
        /// The PKI secret backend the resource belongs to.
        /// </summary>
        [Input("backend", required: true)]
        public Input<string> Backend { get; set; } = null!;

        /// <summary>
        /// CN of intermediate to create
        /// </summary>
        [Input("commonName", required: true)]
        public Input<string> CommonName { get; set; } = null!;

        /// <summary>
        /// The country
        /// </summary>
        [Input("country")]
        public Input<string>? Country { get; set; }

        /// <summary>
        /// Flag to exclude CN from SANs
        /// </summary>
        [Input("excludeCnFromSans")]
        public Input<bool>? ExcludeCnFromSans { get; set; }

        /// <summary>
        /// The format of data
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        [Input("ipSans")]
        private InputList<string>? _ipSans;

        /// <summary>
        /// List of alternative IPs
        /// </summary>
        public InputList<string> IpSans
        {
            get => _ipSans ?? (_ipSans = new InputList<string>());
            set => _ipSans = value;
        }

        /// <summary>
        /// The number of bits to use
        /// </summary>
        [Input("keyBits")]
        public Input<int>? KeyBits { get; set; }

        /// <summary>
        /// The desired key type
        /// </summary>
        [Input("keyType")]
        public Input<string>? KeyType { get; set; }

        /// <summary>
        /// The locality
        /// </summary>
        [Input("locality")]
        public Input<string>? Locality { get; set; }

        /// <summary>
        /// The ID of the previously configured managed key. This field is
        /// required if `type` is `kms` and it conflicts with `managed_key_name`
        /// </summary>
        [Input("managedKeyId")]
        public Input<string>? ManagedKeyId { get; set; }

        /// <summary>
        /// The name of the previously configured managed key. This field is
        /// required if `type` is `kms`  and it conflicts with `managed_key_id`
        /// </summary>
        [Input("managedKeyName")]
        public Input<string>? ManagedKeyName { get; set; }

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// The organization
        /// </summary>
        [Input("organization")]
        public Input<string>? Organization { get; set; }

        [Input("otherSans")]
        private InputList<string>? _otherSans;

        /// <summary>
        /// List of other SANs
        /// </summary>
        public InputList<string> OtherSans
        {
            get => _otherSans ?? (_otherSans = new InputList<string>());
            set => _otherSans = value;
        }

        /// <summary>
        /// The organization unit
        /// </summary>
        [Input("ou")]
        public Input<string>? Ou { get; set; }

        /// <summary>
        /// The postal code
        /// </summary>
        [Input("postalCode")]
        public Input<string>? PostalCode { get; set; }

        /// <summary>
        /// The private key format
        /// </summary>
        [Input("privateKeyFormat")]
        public Input<string>? PrivateKeyFormat { get; set; }

        /// <summary>
        /// The province
        /// </summary>
        [Input("province")]
        public Input<string>? Province { get; set; }

        /// <summary>
        /// The street address
        /// </summary>
        [Input("streetAddress")]
        public Input<string>? StreetAddress { get; set; }

        /// <summary>
        /// Type of intermediate to create. Must be either \"exported\" or \"internal\"
        /// or \"kms\"
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("uriSans")]
        private InputList<string>? _uriSans;

        /// <summary>
        /// List of alternative URIs
        /// </summary>
        public InputList<string> UriSans
        {
            get => _uriSans ?? (_uriSans = new InputList<string>());
            set => _uriSans = value;
        }

        public SecretBackendIntermediateCertRequestArgs()
        {
        }
        public static new SecretBackendIntermediateCertRequestArgs Empty => new SecretBackendIntermediateCertRequestArgs();
    }

    public sealed class SecretBackendIntermediateCertRequestState : global::Pulumi.ResourceArgs
    {
        [Input("altNames")]
        private InputList<string>? _altNames;

        /// <summary>
        /// List of alternative names
        /// </summary>
        public InputList<string> AltNames
        {
            get => _altNames ?? (_altNames = new InputList<string>());
            set => _altNames = value;
        }

        /// <summary>
        /// The PKI secret backend the resource belongs to.
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        /// <summary>
        /// CN of intermediate to create
        /// </summary>
        [Input("commonName")]
        public Input<string>? CommonName { get; set; }

        /// <summary>
        /// The country
        /// </summary>
        [Input("country")]
        public Input<string>? Country { get; set; }

        /// <summary>
        /// The CSR
        /// </summary>
        [Input("csr")]
        public Input<string>? Csr { get; set; }

        /// <summary>
        /// Flag to exclude CN from SANs
        /// </summary>
        [Input("excludeCnFromSans")]
        public Input<bool>? ExcludeCnFromSans { get; set; }

        /// <summary>
        /// The format of data
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        [Input("ipSans")]
        private InputList<string>? _ipSans;

        /// <summary>
        /// List of alternative IPs
        /// </summary>
        public InputList<string> IpSans
        {
            get => _ipSans ?? (_ipSans = new InputList<string>());
            set => _ipSans = value;
        }

        /// <summary>
        /// The number of bits to use
        /// </summary>
        [Input("keyBits")]
        public Input<int>? KeyBits { get; set; }

        /// <summary>
        /// The desired key type
        /// </summary>
        [Input("keyType")]
        public Input<string>? KeyType { get; set; }

        /// <summary>
        /// The locality
        /// </summary>
        [Input("locality")]
        public Input<string>? Locality { get; set; }

        /// <summary>
        /// The ID of the previously configured managed key. This field is
        /// required if `type` is `kms` and it conflicts with `managed_key_name`
        /// </summary>
        [Input("managedKeyId")]
        public Input<string>? ManagedKeyId { get; set; }

        /// <summary>
        /// The name of the previously configured managed key. This field is
        /// required if `type` is `kms`  and it conflicts with `managed_key_id`
        /// </summary>
        [Input("managedKeyName")]
        public Input<string>? ManagedKeyName { get; set; }

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// The organization
        /// </summary>
        [Input("organization")]
        public Input<string>? Organization { get; set; }

        [Input("otherSans")]
        private InputList<string>? _otherSans;

        /// <summary>
        /// List of other SANs
        /// </summary>
        public InputList<string> OtherSans
        {
            get => _otherSans ?? (_otherSans = new InputList<string>());
            set => _otherSans = value;
        }

        /// <summary>
        /// The organization unit
        /// </summary>
        [Input("ou")]
        public Input<string>? Ou { get; set; }

        /// <summary>
        /// The postal code
        /// </summary>
        [Input("postalCode")]
        public Input<string>? PostalCode { get; set; }

        [Input("privateKey")]
        private Input<string>? _privateKey;

        /// <summary>
        /// The private key
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
        /// The private key format
        /// </summary>
        [Input("privateKeyFormat")]
        public Input<string>? PrivateKeyFormat { get; set; }

        /// <summary>
        /// The private key type
        /// </summary>
        [Input("privateKeyType")]
        public Input<string>? PrivateKeyType { get; set; }

        /// <summary>
        /// The province
        /// </summary>
        [Input("province")]
        public Input<string>? Province { get; set; }

        /// <summary>
        /// The street address
        /// </summary>
        [Input("streetAddress")]
        public Input<string>? StreetAddress { get; set; }

        /// <summary>
        /// Type of intermediate to create. Must be either \"exported\" or \"internal\"
        /// or \"kms\"
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("uriSans")]
        private InputList<string>? _uriSans;

        /// <summary>
        /// List of alternative URIs
        /// </summary>
        public InputList<string> UriSans
        {
            get => _uriSans ?? (_uriSans = new InputList<string>());
            set => _uriSans = value;
        }

        public SecretBackendIntermediateCertRequestState()
        {
        }
        public static new SecretBackendIntermediateCertRequestState Empty => new SecretBackendIntermediateCertRequestState();
    }
}
