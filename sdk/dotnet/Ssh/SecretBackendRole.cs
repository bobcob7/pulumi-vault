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
    /// Provides a resource to manage roles in an SSH secret backend
    /// [SSH secret backend within Vault](https://www.vaultproject.io/docs/secrets/ssh/index.html).
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
    ///         var example = new Vault.Mount("example", new Vault.MountArgs
    ///         {
    ///             Type = "ssh",
    ///         });
    ///         var foo = new Vault.Ssh.SecretBackendRole("foo", new Vault.Ssh.SecretBackendRoleArgs
    ///         {
    ///             AllowUserCertificates = true,
    ///             Backend = example.Path,
    ///             KeyType = "ca",
    ///         });
    ///         var bar = new Vault.Ssh.SecretBackendRole("bar", new Vault.Ssh.SecretBackendRoleArgs
    ///         {
    ///             AllowedUsers = "default,baz",
    ///             Backend = example.Path,
    ///             CidrList = "0.0.0.0/0",
    ///             DefaultUser = "default",
    ///             KeyType = "otp",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class SecretBackendRole : Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies if host certificates that are requested are allowed to use the base domains listed in `allowed_domains`.
        /// </summary>
        [Output("allowBareDomains")]
        public Output<bool?> AllowBareDomains { get; private set; } = null!;

        /// <summary>
        /// Specifies if certificates are allowed to be signed for use as a 'host'.
        /// </summary>
        [Output("allowHostCertificates")]
        public Output<bool?> AllowHostCertificates { get; private set; } = null!;

        /// <summary>
        /// Specifies if host certificates that are requested are allowed to be subdomains of those listed in `allowed_domains`.
        /// </summary>
        [Output("allowSubdomains")]
        public Output<bool?> AllowSubdomains { get; private set; } = null!;

        /// <summary>
        /// Specifies if certificates are allowed to be signed for use as a 'user'.
        /// </summary>
        [Output("allowUserCertificates")]
        public Output<bool?> AllowUserCertificates { get; private set; } = null!;

        /// <summary>
        /// Specifies if users can override the key ID for a signed certificate with the `key_id` field.
        /// </summary>
        [Output("allowUserKeyIds")]
        public Output<bool?> AllowUserKeyIds { get; private set; } = null!;

        /// <summary>
        /// Specifies a comma-separated list of critical options that certificates can have when signed.
        /// </summary>
        [Output("allowedCriticalOptions")]
        public Output<string?> AllowedCriticalOptions { get; private set; } = null!;

        /// <summary>
        /// The list of domains for which a client can request a host certificate.
        /// </summary>
        [Output("allowedDomains")]
        public Output<string?> AllowedDomains { get; private set; } = null!;

        /// <summary>
        /// Specifies a comma-separated list of extensions that certificates can have when signed.
        /// </summary>
        [Output("allowedExtensions")]
        public Output<string?> AllowedExtensions { get; private set; } = null!;

        /// <summary>
        /// Specifies a map of ssh key types and their expected sizes which are allowed to be signed by the CA type.
        /// </summary>
        [Output("allowedUserKeyLengths")]
        public Output<ImmutableDictionary<string, object>?> AllowedUserKeyLengths { get; private set; } = null!;

        /// <summary>
        /// Specifies a comma-separated list of usernames that are to be allowed, only if certain usernames are to be allowed.
        /// </summary>
        [Output("allowedUsers")]
        public Output<string?> AllowedUsers { get; private set; } = null!;

        /// <summary>
        /// The path where the SSH secret backend is mounted.
        /// </summary>
        [Output("backend")]
        public Output<string> Backend { get; private set; } = null!;

        /// <summary>
        /// The comma-separated string of CIDR blocks for which this role is applicable.
        /// </summary>
        [Output("cidrList")]
        public Output<string?> CidrList { get; private set; } = null!;

        /// <summary>
        /// Specifies a map of critical options that certificates have when signed.
        /// </summary>
        [Output("defaultCriticalOptions")]
        public Output<ImmutableDictionary<string, object>?> DefaultCriticalOptions { get; private set; } = null!;

        /// <summary>
        /// Specifies a map of extensions that certificates have when signed.
        /// </summary>
        [Output("defaultExtensions")]
        public Output<ImmutableDictionary<string, object>?> DefaultExtensions { get; private set; } = null!;

        /// <summary>
        /// Specifies the default username for which a credential will be generated.
        /// </summary>
        [Output("defaultUser")]
        public Output<string?> DefaultUser { get; private set; } = null!;

        /// <summary>
        /// Specifies a custom format for the key id of a signed certificate.
        /// </summary>
        [Output("keyIdFormat")]
        public Output<string?> KeyIdFormat { get; private set; } = null!;

        /// <summary>
        /// Specifies the type of credentials generated by this role. This can be either `otp`, `dynamic` or `ca`.
        /// </summary>
        [Output("keyType")]
        public Output<string> KeyType { get; private set; } = null!;

        /// <summary>
        /// Specifies the maximum Time To Live value.
        /// </summary>
        [Output("maxTtl")]
        public Output<string> MaxTtl { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the role to create.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the Time To Live value.
        /// </summary>
        [Output("ttl")]
        public Output<string> Ttl { get; private set; } = null!;


        /// <summary>
        /// Create a SecretBackendRole resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecretBackendRole(string name, SecretBackendRoleArgs args, CustomResourceOptions? options = null)
            : base("vault:ssh/secretBackendRole:SecretBackendRole", name, args ?? new SecretBackendRoleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecretBackendRole(string name, Input<string> id, SecretBackendRoleState? state = null, CustomResourceOptions? options = null)
            : base("vault:ssh/secretBackendRole:SecretBackendRole", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SecretBackendRole resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecretBackendRole Get(string name, Input<string> id, SecretBackendRoleState? state = null, CustomResourceOptions? options = null)
        {
            return new SecretBackendRole(name, id, state, options);
        }
    }

    public sealed class SecretBackendRoleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies if host certificates that are requested are allowed to use the base domains listed in `allowed_domains`.
        /// </summary>
        [Input("allowBareDomains")]
        public Input<bool>? AllowBareDomains { get; set; }

        /// <summary>
        /// Specifies if certificates are allowed to be signed for use as a 'host'.
        /// </summary>
        [Input("allowHostCertificates")]
        public Input<bool>? AllowHostCertificates { get; set; }

        /// <summary>
        /// Specifies if host certificates that are requested are allowed to be subdomains of those listed in `allowed_domains`.
        /// </summary>
        [Input("allowSubdomains")]
        public Input<bool>? AllowSubdomains { get; set; }

        /// <summary>
        /// Specifies if certificates are allowed to be signed for use as a 'user'.
        /// </summary>
        [Input("allowUserCertificates")]
        public Input<bool>? AllowUserCertificates { get; set; }

        /// <summary>
        /// Specifies if users can override the key ID for a signed certificate with the `key_id` field.
        /// </summary>
        [Input("allowUserKeyIds")]
        public Input<bool>? AllowUserKeyIds { get; set; }

        /// <summary>
        /// Specifies a comma-separated list of critical options that certificates can have when signed.
        /// </summary>
        [Input("allowedCriticalOptions")]
        public Input<string>? AllowedCriticalOptions { get; set; }

        /// <summary>
        /// The list of domains for which a client can request a host certificate.
        /// </summary>
        [Input("allowedDomains")]
        public Input<string>? AllowedDomains { get; set; }

        /// <summary>
        /// Specifies a comma-separated list of extensions that certificates can have when signed.
        /// </summary>
        [Input("allowedExtensions")]
        public Input<string>? AllowedExtensions { get; set; }

        [Input("allowedUserKeyLengths")]
        private InputMap<object>? _allowedUserKeyLengths;

        /// <summary>
        /// Specifies a map of ssh key types and their expected sizes which are allowed to be signed by the CA type.
        /// </summary>
        public InputMap<object> AllowedUserKeyLengths
        {
            get => _allowedUserKeyLengths ?? (_allowedUserKeyLengths = new InputMap<object>());
            set => _allowedUserKeyLengths = value;
        }

        /// <summary>
        /// Specifies a comma-separated list of usernames that are to be allowed, only if certain usernames are to be allowed.
        /// </summary>
        [Input("allowedUsers")]
        public Input<string>? AllowedUsers { get; set; }

        /// <summary>
        /// The path where the SSH secret backend is mounted.
        /// </summary>
        [Input("backend", required: true)]
        public Input<string> Backend { get; set; } = null!;

        /// <summary>
        /// The comma-separated string of CIDR blocks for which this role is applicable.
        /// </summary>
        [Input("cidrList")]
        public Input<string>? CidrList { get; set; }

        [Input("defaultCriticalOptions")]
        private InputMap<object>? _defaultCriticalOptions;

        /// <summary>
        /// Specifies a map of critical options that certificates have when signed.
        /// </summary>
        public InputMap<object> DefaultCriticalOptions
        {
            get => _defaultCriticalOptions ?? (_defaultCriticalOptions = new InputMap<object>());
            set => _defaultCriticalOptions = value;
        }

        [Input("defaultExtensions")]
        private InputMap<object>? _defaultExtensions;

        /// <summary>
        /// Specifies a map of extensions that certificates have when signed.
        /// </summary>
        public InputMap<object> DefaultExtensions
        {
            get => _defaultExtensions ?? (_defaultExtensions = new InputMap<object>());
            set => _defaultExtensions = value;
        }

        /// <summary>
        /// Specifies the default username for which a credential will be generated.
        /// </summary>
        [Input("defaultUser")]
        public Input<string>? DefaultUser { get; set; }

        /// <summary>
        /// Specifies a custom format for the key id of a signed certificate.
        /// </summary>
        [Input("keyIdFormat")]
        public Input<string>? KeyIdFormat { get; set; }

        /// <summary>
        /// Specifies the type of credentials generated by this role. This can be either `otp`, `dynamic` or `ca`.
        /// </summary>
        [Input("keyType", required: true)]
        public Input<string> KeyType { get; set; } = null!;

        /// <summary>
        /// Specifies the maximum Time To Live value.
        /// </summary>
        [Input("maxTtl")]
        public Input<string>? MaxTtl { get; set; }

        /// <summary>
        /// Specifies the name of the role to create.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the Time To Live value.
        /// </summary>
        [Input("ttl")]
        public Input<string>? Ttl { get; set; }

        public SecretBackendRoleArgs()
        {
        }
    }

    public sealed class SecretBackendRoleState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies if host certificates that are requested are allowed to use the base domains listed in `allowed_domains`.
        /// </summary>
        [Input("allowBareDomains")]
        public Input<bool>? AllowBareDomains { get; set; }

        /// <summary>
        /// Specifies if certificates are allowed to be signed for use as a 'host'.
        /// </summary>
        [Input("allowHostCertificates")]
        public Input<bool>? AllowHostCertificates { get; set; }

        /// <summary>
        /// Specifies if host certificates that are requested are allowed to be subdomains of those listed in `allowed_domains`.
        /// </summary>
        [Input("allowSubdomains")]
        public Input<bool>? AllowSubdomains { get; set; }

        /// <summary>
        /// Specifies if certificates are allowed to be signed for use as a 'user'.
        /// </summary>
        [Input("allowUserCertificates")]
        public Input<bool>? AllowUserCertificates { get; set; }

        /// <summary>
        /// Specifies if users can override the key ID for a signed certificate with the `key_id` field.
        /// </summary>
        [Input("allowUserKeyIds")]
        public Input<bool>? AllowUserKeyIds { get; set; }

        /// <summary>
        /// Specifies a comma-separated list of critical options that certificates can have when signed.
        /// </summary>
        [Input("allowedCriticalOptions")]
        public Input<string>? AllowedCriticalOptions { get; set; }

        /// <summary>
        /// The list of domains for which a client can request a host certificate.
        /// </summary>
        [Input("allowedDomains")]
        public Input<string>? AllowedDomains { get; set; }

        /// <summary>
        /// Specifies a comma-separated list of extensions that certificates can have when signed.
        /// </summary>
        [Input("allowedExtensions")]
        public Input<string>? AllowedExtensions { get; set; }

        [Input("allowedUserKeyLengths")]
        private InputMap<object>? _allowedUserKeyLengths;

        /// <summary>
        /// Specifies a map of ssh key types and their expected sizes which are allowed to be signed by the CA type.
        /// </summary>
        public InputMap<object> AllowedUserKeyLengths
        {
            get => _allowedUserKeyLengths ?? (_allowedUserKeyLengths = new InputMap<object>());
            set => _allowedUserKeyLengths = value;
        }

        /// <summary>
        /// Specifies a comma-separated list of usernames that are to be allowed, only if certain usernames are to be allowed.
        /// </summary>
        [Input("allowedUsers")]
        public Input<string>? AllowedUsers { get; set; }

        /// <summary>
        /// The path where the SSH secret backend is mounted.
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        /// <summary>
        /// The comma-separated string of CIDR blocks for which this role is applicable.
        /// </summary>
        [Input("cidrList")]
        public Input<string>? CidrList { get; set; }

        [Input("defaultCriticalOptions")]
        private InputMap<object>? _defaultCriticalOptions;

        /// <summary>
        /// Specifies a map of critical options that certificates have when signed.
        /// </summary>
        public InputMap<object> DefaultCriticalOptions
        {
            get => _defaultCriticalOptions ?? (_defaultCriticalOptions = new InputMap<object>());
            set => _defaultCriticalOptions = value;
        }

        [Input("defaultExtensions")]
        private InputMap<object>? _defaultExtensions;

        /// <summary>
        /// Specifies a map of extensions that certificates have when signed.
        /// </summary>
        public InputMap<object> DefaultExtensions
        {
            get => _defaultExtensions ?? (_defaultExtensions = new InputMap<object>());
            set => _defaultExtensions = value;
        }

        /// <summary>
        /// Specifies the default username for which a credential will be generated.
        /// </summary>
        [Input("defaultUser")]
        public Input<string>? DefaultUser { get; set; }

        /// <summary>
        /// Specifies a custom format for the key id of a signed certificate.
        /// </summary>
        [Input("keyIdFormat")]
        public Input<string>? KeyIdFormat { get; set; }

        /// <summary>
        /// Specifies the type of credentials generated by this role. This can be either `otp`, `dynamic` or `ca`.
        /// </summary>
        [Input("keyType")]
        public Input<string>? KeyType { get; set; }

        /// <summary>
        /// Specifies the maximum Time To Live value.
        /// </summary>
        [Input("maxTtl")]
        public Input<string>? MaxTtl { get; set; }

        /// <summary>
        /// Specifies the name of the role to create.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the Time To Live value.
        /// </summary>
        [Input("ttl")]
        public Input<string>? Ttl { get; set; }

        public SecretBackendRoleState()
        {
        }
    }
}
