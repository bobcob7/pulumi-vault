// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.AppRole
{
    /// <summary>
    /// Manages an AppRole auth backend SecretID in a Vault server. See the [Vault
    /// documentation](https://www.vaultproject.io/docs/auth/approle) for more
    /// information.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Vault = Pulumi.Vault;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var approle = new Vault.AuthBackend("approle", new()
    ///     {
    ///         Type = "approle",
    ///     });
    /// 
    ///     var example = new Vault.AppRole.AuthBackendRole("example", new()
    ///     {
    ///         Backend = approle.Path,
    ///         RoleName = "test-role",
    ///         TokenPolicies = new[]
    ///         {
    ///             "default",
    ///             "dev",
    ///             "prod",
    ///         },
    ///     });
    /// 
    ///     var id = new Vault.AppRole.AuthBackendRoleSecretID("id", new()
    ///     {
    ///         Backend = approle.Path,
    ///         RoleName = example.RoleName,
    ///         Metadata = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["hello"] = "world",
    ///         }),
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [VaultResourceType("vault:appRole/authBackendRoleSecretID:AuthBackendRoleSecretID")]
    public partial class AuthBackendRoleSecretID : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The unique ID for this SecretID that can be safely logged.
        /// </summary>
        [Output("accessor")]
        public Output<string> Accessor { get; private set; } = null!;

        /// <summary>
        /// Unique name of the auth backend to configure.
        /// </summary>
        [Output("backend")]
        public Output<string?> Backend { get; private set; } = null!;

        /// <summary>
        /// If set, specifies blocks of IP addresses which can
        /// perform the login operation using this SecretID.
        /// </summary>
        [Output("cidrLists")]
        public Output<ImmutableArray<string>> CidrLists { get; private set; } = null!;

        /// <summary>
        /// A JSON-encoded string containing metadata in
        /// key-value pairs to be set on tokens issued with this SecretID.
        /// </summary>
        [Output("metadata")]
        public Output<string?> Metadata { get; private set; } = null!;

        /// <summary>
        /// The name of the role to create the SecretID for.
        /// </summary>
        [Output("roleName")]
        public Output<string> RoleName { get; private set; } = null!;

        /// <summary>
        /// The SecretID to be created. If set, uses "Push"
        /// mode.  Defaults to Vault auto-generating SecretIDs.
        /// </summary>
        [Output("secretId")]
        public Output<string> SecretId { get; private set; } = null!;

        /// <summary>
        /// Set to `true` to use the wrapped secret-id accessor as the resource ID.
        /// If `false` (default value), a fresh secret ID will be regenerated whenever the wrapping token is expired or
        /// invalidated through unwrapping.
        /// </summary>
        [Output("withWrappedAccessor")]
        public Output<bool?> WithWrappedAccessor { get; private set; } = null!;

        /// <summary>
        /// The unique ID for the response-wrapped SecretID that can
        /// be safely logged.
        /// </summary>
        [Output("wrappingAccessor")]
        public Output<string> WrappingAccessor { get; private set; } = null!;

        /// <summary>
        /// The token used to retrieve a response-wrapped SecretID.
        /// </summary>
        [Output("wrappingToken")]
        public Output<string> WrappingToken { get; private set; } = null!;

        /// <summary>
        /// If set, the SecretID response will be
        /// [response-wrapped](https://www.vaultproject.io/docs/concepts/response-wrapping)
        /// and available for the duration specified. Only a single unwrapping of the
        /// token is allowed.
        /// </summary>
        [Output("wrappingTtl")]
        public Output<string?> WrappingTtl { get; private set; } = null!;


        /// <summary>
        /// Create a AuthBackendRoleSecretID resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AuthBackendRoleSecretID(string name, AuthBackendRoleSecretIDArgs args, CustomResourceOptions? options = null)
            : base("vault:appRole/authBackendRoleSecretID:AuthBackendRoleSecretID", name, args ?? new AuthBackendRoleSecretIDArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AuthBackendRoleSecretID(string name, Input<string> id, AuthBackendRoleSecretIDState? state = null, CustomResourceOptions? options = null)
            : base("vault:appRole/authBackendRoleSecretID:AuthBackendRoleSecretID", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AuthBackendRoleSecretID resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AuthBackendRoleSecretID Get(string name, Input<string> id, AuthBackendRoleSecretIDState? state = null, CustomResourceOptions? options = null)
        {
            return new AuthBackendRoleSecretID(name, id, state, options);
        }
    }

    public sealed class AuthBackendRoleSecretIDArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique name of the auth backend to configure.
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        [Input("cidrLists")]
        private InputList<string>? _cidrLists;

        /// <summary>
        /// If set, specifies blocks of IP addresses which can
        /// perform the login operation using this SecretID.
        /// </summary>
        public InputList<string> CidrLists
        {
            get => _cidrLists ?? (_cidrLists = new InputList<string>());
            set => _cidrLists = value;
        }

        /// <summary>
        /// A JSON-encoded string containing metadata in
        /// key-value pairs to be set on tokens issued with this SecretID.
        /// </summary>
        [Input("metadata")]
        public Input<string>? Metadata { get; set; }

        /// <summary>
        /// The name of the role to create the SecretID for.
        /// </summary>
        [Input("roleName", required: true)]
        public Input<string> RoleName { get; set; } = null!;

        /// <summary>
        /// The SecretID to be created. If set, uses "Push"
        /// mode.  Defaults to Vault auto-generating SecretIDs.
        /// </summary>
        [Input("secretId")]
        public Input<string>? SecretId { get; set; }

        /// <summary>
        /// Set to `true` to use the wrapped secret-id accessor as the resource ID.
        /// If `false` (default value), a fresh secret ID will be regenerated whenever the wrapping token is expired or
        /// invalidated through unwrapping.
        /// </summary>
        [Input("withWrappedAccessor")]
        public Input<bool>? WithWrappedAccessor { get; set; }

        /// <summary>
        /// If set, the SecretID response will be
        /// [response-wrapped](https://www.vaultproject.io/docs/concepts/response-wrapping)
        /// and available for the duration specified. Only a single unwrapping of the
        /// token is allowed.
        /// </summary>
        [Input("wrappingTtl")]
        public Input<string>? WrappingTtl { get; set; }

        public AuthBackendRoleSecretIDArgs()
        {
        }
        public static new AuthBackendRoleSecretIDArgs Empty => new AuthBackendRoleSecretIDArgs();
    }

    public sealed class AuthBackendRoleSecretIDState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique ID for this SecretID that can be safely logged.
        /// </summary>
        [Input("accessor")]
        public Input<string>? Accessor { get; set; }

        /// <summary>
        /// Unique name of the auth backend to configure.
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        [Input("cidrLists")]
        private InputList<string>? _cidrLists;

        /// <summary>
        /// If set, specifies blocks of IP addresses which can
        /// perform the login operation using this SecretID.
        /// </summary>
        public InputList<string> CidrLists
        {
            get => _cidrLists ?? (_cidrLists = new InputList<string>());
            set => _cidrLists = value;
        }

        /// <summary>
        /// A JSON-encoded string containing metadata in
        /// key-value pairs to be set on tokens issued with this SecretID.
        /// </summary>
        [Input("metadata")]
        public Input<string>? Metadata { get; set; }

        /// <summary>
        /// The name of the role to create the SecretID for.
        /// </summary>
        [Input("roleName")]
        public Input<string>? RoleName { get; set; }

        /// <summary>
        /// The SecretID to be created. If set, uses "Push"
        /// mode.  Defaults to Vault auto-generating SecretIDs.
        /// </summary>
        [Input("secretId")]
        public Input<string>? SecretId { get; set; }

        /// <summary>
        /// Set to `true` to use the wrapped secret-id accessor as the resource ID.
        /// If `false` (default value), a fresh secret ID will be regenerated whenever the wrapping token is expired or
        /// invalidated through unwrapping.
        /// </summary>
        [Input("withWrappedAccessor")]
        public Input<bool>? WithWrappedAccessor { get; set; }

        /// <summary>
        /// The unique ID for the response-wrapped SecretID that can
        /// be safely logged.
        /// </summary>
        [Input("wrappingAccessor")]
        public Input<string>? WrappingAccessor { get; set; }

        /// <summary>
        /// The token used to retrieve a response-wrapped SecretID.
        /// </summary>
        [Input("wrappingToken")]
        public Input<string>? WrappingToken { get; set; }

        /// <summary>
        /// If set, the SecretID response will be
        /// [response-wrapped](https://www.vaultproject.io/docs/concepts/response-wrapping)
        /// and available for the duration specified. Only a single unwrapping of the
        /// token is allowed.
        /// </summary>
        [Input("wrappingTtl")]
        public Input<string>? WrappingTtl { get; set; }

        public AuthBackendRoleSecretIDState()
        {
        }
        public static new AuthBackendRoleSecretIDState Empty => new AuthBackendRoleSecretIDState();
    }
}
