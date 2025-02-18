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
    ///         Description = "This is an example mount",
    ///         Path = "dummy",
    ///         Type = "generic",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Vault = Pulumi.Vault;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var kvv2_example = new Vault.Mount("kvv2-example", new()
    ///     {
    ///         Description = "This is an example KV Version 2 secret engine mount",
    ///         Path = "version2-example",
    ///         Type = "kv-v2",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Vault = Pulumi.Vault;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var transit_example = new Vault.Mount("transit-example", new()
    ///     {
    ///         Description = "This is an example transit secret engine mount",
    ///         Options = 
    ///         {
    ///             { "convergent_encryption", false },
    ///         },
    ///         Path = "transit-example",
    ///         Type = "transit",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Vault = Pulumi.Vault;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var pki_example = new Vault.Mount("pki-example", new()
    ///     {
    ///         DefaultLeaseTtlSeconds = 3600,
    ///         Description = "This is an example PKI mount",
    ///         MaxLeaseTtlSeconds = 86400,
    ///         Path = "pki-example",
    ///         Type = "pki",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Mounts can be imported using the `path`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import vault:index/mount:Mount example dummy
    /// ```
    /// </summary>
    [VaultResourceType("vault:index/mount:Mount")]
    public partial class Mount : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The accessor for this mount.
        /// </summary>
        [Output("accessor")]
        public Output<string> Accessor { get; private set; } = null!;

        /// <summary>
        /// Set of managed key registry entry names that the mount in question is allowed to access
        /// </summary>
        [Output("allowedManagedKeys")]
        public Output<ImmutableArray<string>> AllowedManagedKeys { get; private set; } = null!;

        /// <summary>
        /// Specifies the list of keys that will not be HMAC'd by audit devices in the request data object.
        /// </summary>
        [Output("auditNonHmacRequestKeys")]
        public Output<ImmutableArray<string>> AuditNonHmacRequestKeys { get; private set; } = null!;

        /// <summary>
        /// Specifies the list of keys that will not be HMAC'd by audit devices in the response data object.
        /// </summary>
        [Output("auditNonHmacResponseKeys")]
        public Output<ImmutableArray<string>> AuditNonHmacResponseKeys { get; private set; } = null!;

        /// <summary>
        /// Default lease duration for tokens and secrets in seconds
        /// </summary>
        [Output("defaultLeaseTtlSeconds")]
        public Output<int> DefaultLeaseTtlSeconds { get; private set; } = null!;

        /// <summary>
        /// Human-friendly description of the mount
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Boolean flag that can be explicitly set to true to enable the secrets engine to access Vault's external entropy source
        /// </summary>
        [Output("externalEntropyAccess")]
        public Output<bool?> ExternalEntropyAccess { get; private set; } = null!;

        /// <summary>
        /// Boolean flag that can be explicitly set to true to enforce local mount in HA environment
        /// </summary>
        [Output("local")]
        public Output<bool?> Local { get; private set; } = null!;

        /// <summary>
        /// Maximum possible lease duration for tokens and secrets in seconds
        /// </summary>
        [Output("maxLeaseTtlSeconds")]
        public Output<int> MaxLeaseTtlSeconds { get; private set; } = null!;

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        /// <summary>
        /// Specifies mount type specific options that are passed to the backend
        /// </summary>
        [Output("options")]
        public Output<ImmutableDictionary<string, object>?> Options { get; private set; } = null!;

        /// <summary>
        /// Where the secret backend will be mounted
        /// </summary>
        [Output("path")]
        public Output<string> Path { get; private set; } = null!;

        /// <summary>
        /// Boolean flag that can be explicitly set to true to enable seal wrapping for the mount, causing values stored by the mount to be wrapped by the seal's encryption capability
        /// </summary>
        [Output("sealWrap")]
        public Output<bool> SealWrap { get; private set; } = null!;

        /// <summary>
        /// Type of the backend, such as "aws"
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Mount resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Mount(string name, MountArgs args, CustomResourceOptions? options = null)
            : base("vault:index/mount:Mount", name, args ?? new MountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Mount(string name, Input<string> id, MountState? state = null, CustomResourceOptions? options = null)
            : base("vault:index/mount:Mount", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Mount resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Mount Get(string name, Input<string> id, MountState? state = null, CustomResourceOptions? options = null)
        {
            return new Mount(name, id, state, options);
        }
    }

    public sealed class MountArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedManagedKeys")]
        private InputList<string>? _allowedManagedKeys;

        /// <summary>
        /// Set of managed key registry entry names that the mount in question is allowed to access
        /// </summary>
        public InputList<string> AllowedManagedKeys
        {
            get => _allowedManagedKeys ?? (_allowedManagedKeys = new InputList<string>());
            set => _allowedManagedKeys = value;
        }

        [Input("auditNonHmacRequestKeys")]
        private InputList<string>? _auditNonHmacRequestKeys;

        /// <summary>
        /// Specifies the list of keys that will not be HMAC'd by audit devices in the request data object.
        /// </summary>
        public InputList<string> AuditNonHmacRequestKeys
        {
            get => _auditNonHmacRequestKeys ?? (_auditNonHmacRequestKeys = new InputList<string>());
            set => _auditNonHmacRequestKeys = value;
        }

        [Input("auditNonHmacResponseKeys")]
        private InputList<string>? _auditNonHmacResponseKeys;

        /// <summary>
        /// Specifies the list of keys that will not be HMAC'd by audit devices in the response data object.
        /// </summary>
        public InputList<string> AuditNonHmacResponseKeys
        {
            get => _auditNonHmacResponseKeys ?? (_auditNonHmacResponseKeys = new InputList<string>());
            set => _auditNonHmacResponseKeys = value;
        }

        /// <summary>
        /// Default lease duration for tokens and secrets in seconds
        /// </summary>
        [Input("defaultLeaseTtlSeconds")]
        public Input<int>? DefaultLeaseTtlSeconds { get; set; }

        /// <summary>
        /// Human-friendly description of the mount
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Boolean flag that can be explicitly set to true to enable the secrets engine to access Vault's external entropy source
        /// </summary>
        [Input("externalEntropyAccess")]
        public Input<bool>? ExternalEntropyAccess { get; set; }

        /// <summary>
        /// Boolean flag that can be explicitly set to true to enforce local mount in HA environment
        /// </summary>
        [Input("local")]
        public Input<bool>? Local { get; set; }

        /// <summary>
        /// Maximum possible lease duration for tokens and secrets in seconds
        /// </summary>
        [Input("maxLeaseTtlSeconds")]
        public Input<int>? MaxLeaseTtlSeconds { get; set; }

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("options")]
        private InputMap<object>? _options;

        /// <summary>
        /// Specifies mount type specific options that are passed to the backend
        /// </summary>
        public InputMap<object> Options
        {
            get => _options ?? (_options = new InputMap<object>());
            set => _options = value;
        }

        /// <summary>
        /// Where the secret backend will be mounted
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        /// <summary>
        /// Boolean flag that can be explicitly set to true to enable seal wrapping for the mount, causing values stored by the mount to be wrapped by the seal's encryption capability
        /// </summary>
        [Input("sealWrap")]
        public Input<bool>? SealWrap { get; set; }

        /// <summary>
        /// Type of the backend, such as "aws"
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public MountArgs()
        {
        }
        public static new MountArgs Empty => new MountArgs();
    }

    public sealed class MountState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The accessor for this mount.
        /// </summary>
        [Input("accessor")]
        public Input<string>? Accessor { get; set; }

        [Input("allowedManagedKeys")]
        private InputList<string>? _allowedManagedKeys;

        /// <summary>
        /// Set of managed key registry entry names that the mount in question is allowed to access
        /// </summary>
        public InputList<string> AllowedManagedKeys
        {
            get => _allowedManagedKeys ?? (_allowedManagedKeys = new InputList<string>());
            set => _allowedManagedKeys = value;
        }

        [Input("auditNonHmacRequestKeys")]
        private InputList<string>? _auditNonHmacRequestKeys;

        /// <summary>
        /// Specifies the list of keys that will not be HMAC'd by audit devices in the request data object.
        /// </summary>
        public InputList<string> AuditNonHmacRequestKeys
        {
            get => _auditNonHmacRequestKeys ?? (_auditNonHmacRequestKeys = new InputList<string>());
            set => _auditNonHmacRequestKeys = value;
        }

        [Input("auditNonHmacResponseKeys")]
        private InputList<string>? _auditNonHmacResponseKeys;

        /// <summary>
        /// Specifies the list of keys that will not be HMAC'd by audit devices in the response data object.
        /// </summary>
        public InputList<string> AuditNonHmacResponseKeys
        {
            get => _auditNonHmacResponseKeys ?? (_auditNonHmacResponseKeys = new InputList<string>());
            set => _auditNonHmacResponseKeys = value;
        }

        /// <summary>
        /// Default lease duration for tokens and secrets in seconds
        /// </summary>
        [Input("defaultLeaseTtlSeconds")]
        public Input<int>? DefaultLeaseTtlSeconds { get; set; }

        /// <summary>
        /// Human-friendly description of the mount
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Boolean flag that can be explicitly set to true to enable the secrets engine to access Vault's external entropy source
        /// </summary>
        [Input("externalEntropyAccess")]
        public Input<bool>? ExternalEntropyAccess { get; set; }

        /// <summary>
        /// Boolean flag that can be explicitly set to true to enforce local mount in HA environment
        /// </summary>
        [Input("local")]
        public Input<bool>? Local { get; set; }

        /// <summary>
        /// Maximum possible lease duration for tokens and secrets in seconds
        /// </summary>
        [Input("maxLeaseTtlSeconds")]
        public Input<int>? MaxLeaseTtlSeconds { get; set; }

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("options")]
        private InputMap<object>? _options;

        /// <summary>
        /// Specifies mount type specific options that are passed to the backend
        /// </summary>
        public InputMap<object> Options
        {
            get => _options ?? (_options = new InputMap<object>());
            set => _options = value;
        }

        /// <summary>
        /// Where the secret backend will be mounted
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// Boolean flag that can be explicitly set to true to enable seal wrapping for the mount, causing values stored by the mount to be wrapped by the seal's encryption capability
        /// </summary>
        [Input("sealWrap")]
        public Input<bool>? SealWrap { get; set; }

        /// <summary>
        /// Type of the backend, such as "aws"
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public MountState()
        {
        }
        public static new MountState Empty => new MountState();
    }
}
