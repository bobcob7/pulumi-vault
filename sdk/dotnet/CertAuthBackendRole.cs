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
    /// Provides a resource to create a role in an [Cert auth backend within Vault](https://www.vaultproject.io/docs/auth/cert.html).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.IO;
    /// using Pulumi;
    /// using Vault = Pulumi.Vault;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var certAuthBackend = new Vault.AuthBackend("certAuthBackend", new()
    ///     {
    ///         Path = "cert",
    ///         Type = "cert",
    ///     });
    /// 
    ///     var certCertAuthBackendRole = new Vault.CertAuthBackendRole("certCertAuthBackendRole", new()
    ///     {
    ///         Certificate = File.ReadAllText("/path/to/certs/ca-cert.pem"),
    ///         Backend = certAuthBackend.Path,
    ///         AllowedNames = new[]
    ///         {
    ///             "foo.example.org",
    ///             "baz.example.org",
    ///         },
    ///         TokenTtl = 300,
    ///         TokenMaxTtl = 600,
    ///         TokenPolicies = new[]
    ///         {
    ///             "foo",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [VaultResourceType("vault:index/certAuthBackendRole:CertAuthBackendRole")]
    public partial class CertAuthBackendRole : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Allowed the common names for authenticated client certificates
        /// </summary>
        [Output("allowedCommonNames")]
        public Output<ImmutableArray<string>> AllowedCommonNames { get; private set; } = null!;

        /// <summary>
        /// Allowed alternative dns names for authenticated client certificates
        /// </summary>
        [Output("allowedDnsSans")]
        public Output<ImmutableArray<string>> AllowedDnsSans { get; private set; } = null!;

        /// <summary>
        /// Allowed emails for authenticated client certificates
        /// </summary>
        [Output("allowedEmailSans")]
        public Output<ImmutableArray<string>> AllowedEmailSans { get; private set; } = null!;

        /// <summary>
        /// Allowed subject names for authenticated client certificates
        /// </summary>
        [Output("allowedNames")]
        public Output<ImmutableArray<string>> AllowedNames { get; private set; } = null!;

        [Output("allowedOrganizationUnits")]
        public Output<ImmutableArray<string>> AllowedOrganizationUnits { get; private set; } = null!;

        /// <summary>
        /// Allowed organization units for authenticated client certificates.
        /// *In previous provider releases this field was incorrectly named `allowed_organization_units`, please update accordingly*
        /// </summary>
        [Output("allowedOrganizationalUnits")]
        public Output<ImmutableArray<string>> AllowedOrganizationalUnits { get; private set; } = null!;

        /// <summary>
        /// Allowed URIs for authenticated client certificates
        /// </summary>
        [Output("allowedUriSans")]
        public Output<ImmutableArray<string>> AllowedUriSans { get; private set; } = null!;

        /// <summary>
        /// Path to the mounted Cert auth backend
        /// </summary>
        [Output("backend")]
        public Output<string?> Backend { get; private set; } = null!;

        /// <summary>
        /// CA certificate used to validate client certificates
        /// </summary>
        [Output("certificate")]
        public Output<string> Certificate { get; private set; } = null!;

        /// <summary>
        /// The name to display on tokens issued under this role.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Name of the role
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        /// <summary>
        /// TLS extensions required on client certificates
        /// </summary>
        [Output("requiredExtensions")]
        public Output<ImmutableArray<string>> RequiredExtensions { get; private set; } = null!;

        /// <summary>
        /// List of CIDR blocks; if set, specifies blocks of IP
        /// addresses which can authenticate successfully, and ties the resulting token to these blocks
        /// as well.
        /// </summary>
        [Output("tokenBoundCidrs")]
        public Output<ImmutableArray<string>> TokenBoundCidrs { get; private set; } = null!;

        /// <summary>
        /// If set, will encode an
        /// [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
        /// onto the token in number of seconds. This is a hard cap even if `token_ttl` and
        /// `token_max_ttl` would otherwise allow a renewal.
        /// </summary>
        [Output("tokenExplicitMaxTtl")]
        public Output<int?> TokenExplicitMaxTtl { get; private set; } = null!;

        /// <summary>
        /// The maximum lifetime for generated tokens in number of seconds.
        /// Its current value will be referenced at renewal time.
        /// </summary>
        [Output("tokenMaxTtl")]
        public Output<int?> TokenMaxTtl { get; private set; } = null!;

        /// <summary>
        /// If set, the default policy will not be set on
        /// generated tokens; otherwise it will be added to the policies set in token_policies.
        /// </summary>
        [Output("tokenNoDefaultPolicy")]
        public Output<bool?> TokenNoDefaultPolicy { get; private set; } = null!;

        /// <summary>
        /// The [maximum number](https://www.vaultproject.io/api-docs/auth/cert#token_num_uses)
        /// of times a generated token may be used (within its lifetime); 0 means unlimited.
        /// </summary>
        [Output("tokenNumUses")]
        public Output<int?> TokenNumUses { get; private set; } = null!;

        /// <summary>
        /// If set, indicates that the
        /// token generated using this role should never expire. The token should be renewed within the
        /// duration specified by this value. At each renewal, the token's TTL will be set to the
        /// value of this field. Specified in seconds.
        /// </summary>
        [Output("tokenPeriod")]
        public Output<int?> TokenPeriod { get; private set; } = null!;

        /// <summary>
        /// List of policies to encode onto generated tokens. Depending
        /// on the auth method, this list may be supplemented by user/group/other values.
        /// </summary>
        [Output("tokenPolicies")]
        public Output<ImmutableArray<string>> TokenPolicies { get; private set; } = null!;

        /// <summary>
        /// The incremental lifetime for generated tokens in number of seconds.
        /// Its current value will be referenced at renewal time.
        /// </summary>
        [Output("tokenTtl")]
        public Output<int?> TokenTtl { get; private set; } = null!;

        /// <summary>
        /// The type of token that should be generated. Can be `service`,
        /// `batch`, or `default` to use the mount's tuned default (which unless changed will be
        /// `service` tokens). For token store roles, there are two additional possibilities:
        /// `default-service` and `default-batch` which specify the type to return unless the client
        /// requests a different type at generation time.
        /// </summary>
        [Output("tokenType")]
        public Output<string?> TokenType { get; private set; } = null!;


        /// <summary>
        /// Create a CertAuthBackendRole resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CertAuthBackendRole(string name, CertAuthBackendRoleArgs args, CustomResourceOptions? options = null)
            : base("vault:index/certAuthBackendRole:CertAuthBackendRole", name, args ?? new CertAuthBackendRoleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CertAuthBackendRole(string name, Input<string> id, CertAuthBackendRoleState? state = null, CustomResourceOptions? options = null)
            : base("vault:index/certAuthBackendRole:CertAuthBackendRole", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CertAuthBackendRole resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CertAuthBackendRole Get(string name, Input<string> id, CertAuthBackendRoleState? state = null, CustomResourceOptions? options = null)
        {
            return new CertAuthBackendRole(name, id, state, options);
        }
    }

    public sealed class CertAuthBackendRoleArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedCommonNames")]
        private InputList<string>? _allowedCommonNames;

        /// <summary>
        /// Allowed the common names for authenticated client certificates
        /// </summary>
        public InputList<string> AllowedCommonNames
        {
            get => _allowedCommonNames ?? (_allowedCommonNames = new InputList<string>());
            set => _allowedCommonNames = value;
        }

        [Input("allowedDnsSans")]
        private InputList<string>? _allowedDnsSans;

        /// <summary>
        /// Allowed alternative dns names for authenticated client certificates
        /// </summary>
        public InputList<string> AllowedDnsSans
        {
            get => _allowedDnsSans ?? (_allowedDnsSans = new InputList<string>());
            set => _allowedDnsSans = value;
        }

        [Input("allowedEmailSans")]
        private InputList<string>? _allowedEmailSans;

        /// <summary>
        /// Allowed emails for authenticated client certificates
        /// </summary>
        public InputList<string> AllowedEmailSans
        {
            get => _allowedEmailSans ?? (_allowedEmailSans = new InputList<string>());
            set => _allowedEmailSans = value;
        }

        [Input("allowedNames")]
        private InputList<string>? _allowedNames;

        /// <summary>
        /// Allowed subject names for authenticated client certificates
        /// </summary>
        public InputList<string> AllowedNames
        {
            get => _allowedNames ?? (_allowedNames = new InputList<string>());
            set => _allowedNames = value;
        }

        [Input("allowedOrganizationUnits")]
        private InputList<string>? _allowedOrganizationUnits;
        [Obsolete(@"Use allowed_organizational_units")]
        public InputList<string> AllowedOrganizationUnits
        {
            get => _allowedOrganizationUnits ?? (_allowedOrganizationUnits = new InputList<string>());
            set => _allowedOrganizationUnits = value;
        }

        [Input("allowedOrganizationalUnits")]
        private InputList<string>? _allowedOrganizationalUnits;

        /// <summary>
        /// Allowed organization units for authenticated client certificates.
        /// *In previous provider releases this field was incorrectly named `allowed_organization_units`, please update accordingly*
        /// </summary>
        public InputList<string> AllowedOrganizationalUnits
        {
            get => _allowedOrganizationalUnits ?? (_allowedOrganizationalUnits = new InputList<string>());
            set => _allowedOrganizationalUnits = value;
        }

        [Input("allowedUriSans")]
        private InputList<string>? _allowedUriSans;

        /// <summary>
        /// Allowed URIs for authenticated client certificates
        /// </summary>
        public InputList<string> AllowedUriSans
        {
            get => _allowedUriSans ?? (_allowedUriSans = new InputList<string>());
            set => _allowedUriSans = value;
        }

        /// <summary>
        /// Path to the mounted Cert auth backend
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        /// <summary>
        /// CA certificate used to validate client certificates
        /// </summary>
        [Input("certificate", required: true)]
        public Input<string> Certificate { get; set; } = null!;

        /// <summary>
        /// The name to display on tokens issued under this role.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Name of the role
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("requiredExtensions")]
        private InputList<string>? _requiredExtensions;

        /// <summary>
        /// TLS extensions required on client certificates
        /// </summary>
        public InputList<string> RequiredExtensions
        {
            get => _requiredExtensions ?? (_requiredExtensions = new InputList<string>());
            set => _requiredExtensions = value;
        }

        [Input("tokenBoundCidrs")]
        private InputList<string>? _tokenBoundCidrs;

        /// <summary>
        /// List of CIDR blocks; if set, specifies blocks of IP
        /// addresses which can authenticate successfully, and ties the resulting token to these blocks
        /// as well.
        /// </summary>
        public InputList<string> TokenBoundCidrs
        {
            get => _tokenBoundCidrs ?? (_tokenBoundCidrs = new InputList<string>());
            set => _tokenBoundCidrs = value;
        }

        /// <summary>
        /// If set, will encode an
        /// [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
        /// onto the token in number of seconds. This is a hard cap even if `token_ttl` and
        /// `token_max_ttl` would otherwise allow a renewal.
        /// </summary>
        [Input("tokenExplicitMaxTtl")]
        public Input<int>? TokenExplicitMaxTtl { get; set; }

        /// <summary>
        /// The maximum lifetime for generated tokens in number of seconds.
        /// Its current value will be referenced at renewal time.
        /// </summary>
        [Input("tokenMaxTtl")]
        public Input<int>? TokenMaxTtl { get; set; }

        /// <summary>
        /// If set, the default policy will not be set on
        /// generated tokens; otherwise it will be added to the policies set in token_policies.
        /// </summary>
        [Input("tokenNoDefaultPolicy")]
        public Input<bool>? TokenNoDefaultPolicy { get; set; }

        /// <summary>
        /// The [maximum number](https://www.vaultproject.io/api-docs/auth/cert#token_num_uses)
        /// of times a generated token may be used (within its lifetime); 0 means unlimited.
        /// </summary>
        [Input("tokenNumUses")]
        public Input<int>? TokenNumUses { get; set; }

        /// <summary>
        /// If set, indicates that the
        /// token generated using this role should never expire. The token should be renewed within the
        /// duration specified by this value. At each renewal, the token's TTL will be set to the
        /// value of this field. Specified in seconds.
        /// </summary>
        [Input("tokenPeriod")]
        public Input<int>? TokenPeriod { get; set; }

        [Input("tokenPolicies")]
        private InputList<string>? _tokenPolicies;

        /// <summary>
        /// List of policies to encode onto generated tokens. Depending
        /// on the auth method, this list may be supplemented by user/group/other values.
        /// </summary>
        public InputList<string> TokenPolicies
        {
            get => _tokenPolicies ?? (_tokenPolicies = new InputList<string>());
            set => _tokenPolicies = value;
        }

        /// <summary>
        /// The incremental lifetime for generated tokens in number of seconds.
        /// Its current value will be referenced at renewal time.
        /// </summary>
        [Input("tokenTtl")]
        public Input<int>? TokenTtl { get; set; }

        /// <summary>
        /// The type of token that should be generated. Can be `service`,
        /// `batch`, or `default` to use the mount's tuned default (which unless changed will be
        /// `service` tokens). For token store roles, there are two additional possibilities:
        /// `default-service` and `default-batch` which specify the type to return unless the client
        /// requests a different type at generation time.
        /// </summary>
        [Input("tokenType")]
        public Input<string>? TokenType { get; set; }

        public CertAuthBackendRoleArgs()
        {
        }
        public static new CertAuthBackendRoleArgs Empty => new CertAuthBackendRoleArgs();
    }

    public sealed class CertAuthBackendRoleState : global::Pulumi.ResourceArgs
    {
        [Input("allowedCommonNames")]
        private InputList<string>? _allowedCommonNames;

        /// <summary>
        /// Allowed the common names for authenticated client certificates
        /// </summary>
        public InputList<string> AllowedCommonNames
        {
            get => _allowedCommonNames ?? (_allowedCommonNames = new InputList<string>());
            set => _allowedCommonNames = value;
        }

        [Input("allowedDnsSans")]
        private InputList<string>? _allowedDnsSans;

        /// <summary>
        /// Allowed alternative dns names for authenticated client certificates
        /// </summary>
        public InputList<string> AllowedDnsSans
        {
            get => _allowedDnsSans ?? (_allowedDnsSans = new InputList<string>());
            set => _allowedDnsSans = value;
        }

        [Input("allowedEmailSans")]
        private InputList<string>? _allowedEmailSans;

        /// <summary>
        /// Allowed emails for authenticated client certificates
        /// </summary>
        public InputList<string> AllowedEmailSans
        {
            get => _allowedEmailSans ?? (_allowedEmailSans = new InputList<string>());
            set => _allowedEmailSans = value;
        }

        [Input("allowedNames")]
        private InputList<string>? _allowedNames;

        /// <summary>
        /// Allowed subject names for authenticated client certificates
        /// </summary>
        public InputList<string> AllowedNames
        {
            get => _allowedNames ?? (_allowedNames = new InputList<string>());
            set => _allowedNames = value;
        }

        [Input("allowedOrganizationUnits")]
        private InputList<string>? _allowedOrganizationUnits;
        [Obsolete(@"Use allowed_organizational_units")]
        public InputList<string> AllowedOrganizationUnits
        {
            get => _allowedOrganizationUnits ?? (_allowedOrganizationUnits = new InputList<string>());
            set => _allowedOrganizationUnits = value;
        }

        [Input("allowedOrganizationalUnits")]
        private InputList<string>? _allowedOrganizationalUnits;

        /// <summary>
        /// Allowed organization units for authenticated client certificates.
        /// *In previous provider releases this field was incorrectly named `allowed_organization_units`, please update accordingly*
        /// </summary>
        public InputList<string> AllowedOrganizationalUnits
        {
            get => _allowedOrganizationalUnits ?? (_allowedOrganizationalUnits = new InputList<string>());
            set => _allowedOrganizationalUnits = value;
        }

        [Input("allowedUriSans")]
        private InputList<string>? _allowedUriSans;

        /// <summary>
        /// Allowed URIs for authenticated client certificates
        /// </summary>
        public InputList<string> AllowedUriSans
        {
            get => _allowedUriSans ?? (_allowedUriSans = new InputList<string>());
            set => _allowedUriSans = value;
        }

        /// <summary>
        /// Path to the mounted Cert auth backend
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        /// <summary>
        /// CA certificate used to validate client certificates
        /// </summary>
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        /// <summary>
        /// The name to display on tokens issued under this role.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Name of the role
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("requiredExtensions")]
        private InputList<string>? _requiredExtensions;

        /// <summary>
        /// TLS extensions required on client certificates
        /// </summary>
        public InputList<string> RequiredExtensions
        {
            get => _requiredExtensions ?? (_requiredExtensions = new InputList<string>());
            set => _requiredExtensions = value;
        }

        [Input("tokenBoundCidrs")]
        private InputList<string>? _tokenBoundCidrs;

        /// <summary>
        /// List of CIDR blocks; if set, specifies blocks of IP
        /// addresses which can authenticate successfully, and ties the resulting token to these blocks
        /// as well.
        /// </summary>
        public InputList<string> TokenBoundCidrs
        {
            get => _tokenBoundCidrs ?? (_tokenBoundCidrs = new InputList<string>());
            set => _tokenBoundCidrs = value;
        }

        /// <summary>
        /// If set, will encode an
        /// [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
        /// onto the token in number of seconds. This is a hard cap even if `token_ttl` and
        /// `token_max_ttl` would otherwise allow a renewal.
        /// </summary>
        [Input("tokenExplicitMaxTtl")]
        public Input<int>? TokenExplicitMaxTtl { get; set; }

        /// <summary>
        /// The maximum lifetime for generated tokens in number of seconds.
        /// Its current value will be referenced at renewal time.
        /// </summary>
        [Input("tokenMaxTtl")]
        public Input<int>? TokenMaxTtl { get; set; }

        /// <summary>
        /// If set, the default policy will not be set on
        /// generated tokens; otherwise it will be added to the policies set in token_policies.
        /// </summary>
        [Input("tokenNoDefaultPolicy")]
        public Input<bool>? TokenNoDefaultPolicy { get; set; }

        /// <summary>
        /// The [maximum number](https://www.vaultproject.io/api-docs/auth/cert#token_num_uses)
        /// of times a generated token may be used (within its lifetime); 0 means unlimited.
        /// </summary>
        [Input("tokenNumUses")]
        public Input<int>? TokenNumUses { get; set; }

        /// <summary>
        /// If set, indicates that the
        /// token generated using this role should never expire. The token should be renewed within the
        /// duration specified by this value. At each renewal, the token's TTL will be set to the
        /// value of this field. Specified in seconds.
        /// </summary>
        [Input("tokenPeriod")]
        public Input<int>? TokenPeriod { get; set; }

        [Input("tokenPolicies")]
        private InputList<string>? _tokenPolicies;

        /// <summary>
        /// List of policies to encode onto generated tokens. Depending
        /// on the auth method, this list may be supplemented by user/group/other values.
        /// </summary>
        public InputList<string> TokenPolicies
        {
            get => _tokenPolicies ?? (_tokenPolicies = new InputList<string>());
            set => _tokenPolicies = value;
        }

        /// <summary>
        /// The incremental lifetime for generated tokens in number of seconds.
        /// Its current value will be referenced at renewal time.
        /// </summary>
        [Input("tokenTtl")]
        public Input<int>? TokenTtl { get; set; }

        /// <summary>
        /// The type of token that should be generated. Can be `service`,
        /// `batch`, or `default` to use the mount's tuned default (which unless changed will be
        /// `service` tokens). For token store roles, there are two additional possibilities:
        /// `default-service` and `default-batch` which specify the type to return unless the client
        /// requests a different type at generation time.
        /// </summary>
        [Input("tokenType")]
        public Input<string>? TokenType { get; set; }

        public CertAuthBackendRoleState()
        {
        }
        public static new CertAuthBackendRoleState Empty => new CertAuthBackendRoleState();
    }
}
