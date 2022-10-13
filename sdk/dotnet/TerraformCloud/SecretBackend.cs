// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.TerraformCloud
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
    ///     var test = new Vault.TerraformCloud.SecretBackend("test", new()
    ///     {
    ///         Backend = "terraform",
    ///         Description = "Manages the Terraform Cloud backend",
    ///         Token = "V0idfhi2iksSDU234ucdbi2nidsi...",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Terraform Cloud secret backends can be imported using the `backend`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import vault:terraformcloud/secretBackend:SecretBackend example terraform
    /// ```
    /// </summary>
    [VaultResourceType("vault:terraformcloud/secretBackend:SecretBackend")]
    public partial class SecretBackend : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the address of the Terraform Cloud instance, provided as "host:port" like "127.0.0.1:8500".
        /// </summary>
        [Output("address")]
        public Output<string?> Address { get; private set; } = null!;

        /// <summary>
        /// Unique name of the Vault Terraform Cloud mount to configure
        /// </summary>
        [Output("backend")]
        public Output<string?> Backend { get; private set; } = null!;

        /// <summary>
        /// Specifies the base path for the Terraform Cloud or Enterprise API.
        /// </summary>
        [Output("basePath")]
        public Output<string?> BasePath { get; private set; } = null!;

        /// <summary>
        /// The default TTL for credentials issued by this backend.
        /// </summary>
        [Output("defaultLeaseTtlSeconds")]
        public Output<int?> DefaultLeaseTtlSeconds { get; private set; } = null!;

        /// <summary>
        /// A human-friendly description for this backend.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// If set, opts out of mount migration on path updates.
        /// See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        /// </summary>
        [Output("disableRemount")]
        public Output<bool?> DisableRemount { get; private set; } = null!;

        /// <summary>
        /// The maximum TTL that can be requested
        /// for credentials issued by this backend.
        /// </summary>
        [Output("maxLeaseTtlSeconds")]
        public Output<int?> MaxLeaseTtlSeconds { get; private set; } = null!;

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured namespace.
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        /// <summary>
        /// Specifies the Terraform Cloud access token to use.
        /// </summary>
        [Output("token")]
        public Output<string?> Token { get; private set; } = null!;


        /// <summary>
        /// Create a SecretBackend resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecretBackend(string name, SecretBackendArgs? args = null, CustomResourceOptions? options = null)
            : base("vault:terraformcloud/secretBackend:SecretBackend", name, args ?? new SecretBackendArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecretBackend(string name, Input<string> id, SecretBackendState? state = null, CustomResourceOptions? options = null)
            : base("vault:terraformcloud/secretBackend:SecretBackend", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "token",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SecretBackend resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecretBackend Get(string name, Input<string> id, SecretBackendState? state = null, CustomResourceOptions? options = null)
        {
            return new SecretBackend(name, id, state, options);
        }
    }

    public sealed class SecretBackendArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the address of the Terraform Cloud instance, provided as "host:port" like "127.0.0.1:8500".
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// Unique name of the Vault Terraform Cloud mount to configure
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        /// <summary>
        /// Specifies the base path for the Terraform Cloud or Enterprise API.
        /// </summary>
        [Input("basePath")]
        public Input<string>? BasePath { get; set; }

        /// <summary>
        /// The default TTL for credentials issued by this backend.
        /// </summary>
        [Input("defaultLeaseTtlSeconds")]
        public Input<int>? DefaultLeaseTtlSeconds { get; set; }

        /// <summary>
        /// A human-friendly description for this backend.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// If set, opts out of mount migration on path updates.
        /// See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        /// </summary>
        [Input("disableRemount")]
        public Input<bool>? DisableRemount { get; set; }

        /// <summary>
        /// The maximum TTL that can be requested
        /// for credentials issued by this backend.
        /// </summary>
        [Input("maxLeaseTtlSeconds")]
        public Input<int>? MaxLeaseTtlSeconds { get; set; }

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured namespace.
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("token")]
        private Input<string>? _token;

        /// <summary>
        /// Specifies the Terraform Cloud access token to use.
        /// </summary>
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public SecretBackendArgs()
        {
        }
        public static new SecretBackendArgs Empty => new SecretBackendArgs();
    }

    public sealed class SecretBackendState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the address of the Terraform Cloud instance, provided as "host:port" like "127.0.0.1:8500".
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// Unique name of the Vault Terraform Cloud mount to configure
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        /// <summary>
        /// Specifies the base path for the Terraform Cloud or Enterprise API.
        /// </summary>
        [Input("basePath")]
        public Input<string>? BasePath { get; set; }

        /// <summary>
        /// The default TTL for credentials issued by this backend.
        /// </summary>
        [Input("defaultLeaseTtlSeconds")]
        public Input<int>? DefaultLeaseTtlSeconds { get; set; }

        /// <summary>
        /// A human-friendly description for this backend.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// If set, opts out of mount migration on path updates.
        /// See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        /// </summary>
        [Input("disableRemount")]
        public Input<bool>? DisableRemount { get; set; }

        /// <summary>
        /// The maximum TTL that can be requested
        /// for credentials issued by this backend.
        /// </summary>
        [Input("maxLeaseTtlSeconds")]
        public Input<int>? MaxLeaseTtlSeconds { get; set; }

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured namespace.
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("token")]
        private Input<string>? _token;

        /// <summary>
        /// Specifies the Terraform Cloud access token to use.
        /// </summary>
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public SecretBackendState()
        {
        }
        public static new SecretBackendState Empty => new SecretBackendState();
    }
}
