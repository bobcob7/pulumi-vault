// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.GitHub
{
    /// <summary>
    /// Manages a GitHub Auth mount in a Vault server. See the [Vault
    /// documentation](https://www.vaultproject.io/docs/auth/github/) for more
    /// information.
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
    ///     var example = new Vault.GitHub.AuthBackend("example", new()
    ///     {
    ///         Organization = "myorg",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// GitHub authentication mounts can be imported using the `path`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import vault:github/authBackend:AuthBackend example github
    /// ```
    /// </summary>
    [VaultResourceType("vault:github/authBackend:AuthBackend")]
    public partial class AuthBackend : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The mount accessor related to the auth mount. It is useful for integration with [Identity Secrets Engine](https://www.vaultproject.io/docs/secrets/identity/index.html).
        /// </summary>
        [Output("accessor")]
        public Output<string> Accessor { get; private set; } = null!;

        /// <summary>
        /// The API endpoint to use. Useful if you
        /// are running GitHub Enterprise or an API-compatible authentication server.
        /// </summary>
        [Output("baseUrl")]
        public Output<string?> BaseUrl { get; private set; } = null!;

        /// <summary>
        /// Specifies the description of the mount.
        /// This overrides the current stored value, if any.
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
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        /// <summary>
        /// The organization configured users must be part of.
        /// </summary>
        [Output("organization")]
        public Output<string> Organization { get; private set; } = null!;

        /// <summary>
        /// The ID of the organization users must be part of.
        /// Vault will attempt to fetch and set this value if it is not provided. (Vault 1.10+)
        /// </summary>
        [Output("organizationId")]
        public Output<int> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// Path where the auth backend is mounted. Defaults to `auth/github`
        /// if not specified.
        /// </summary>
        [Output("path")]
        public Output<string?> Path { get; private set; } = null!;

        /// <summary>
        /// (Optional) List of CIDR blocks; if set, specifies blocks of IP
        /// addresses which can authenticate successfully, and ties the resulting token to these blocks
        /// as well.
        /// </summary>
        [Output("tokenBoundCidrs")]
        public Output<ImmutableArray<string>> TokenBoundCidrs { get; private set; } = null!;

        /// <summary>
        /// (Optional) If set, will encode an
        /// [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
        /// onto the token in number of seconds. This is a hard cap even if `token_ttl` and
        /// `token_max_ttl` would otherwise allow a renewal.
        /// </summary>
        [Output("tokenExplicitMaxTtl")]
        public Output<int?> TokenExplicitMaxTtl { get; private set; } = null!;

        /// <summary>
        /// (Optional) The maximum lifetime for generated tokens in number of seconds.
        /// Its current value will be referenced at renewal time.
        /// </summary>
        [Output("tokenMaxTtl")]
        public Output<int?> TokenMaxTtl { get; private set; } = null!;

        /// <summary>
        /// (Optional) If set, the default policy will not be set on
        /// generated tokens; otherwise it will be added to the policies set in token_policies.
        /// </summary>
        [Output("tokenNoDefaultPolicy")]
        public Output<bool?> TokenNoDefaultPolicy { get; private set; } = null!;

        /// <summary>
        /// (Optional) The [maximum number](https://www.vaultproject.io/api-docs/github#token_num_uses)
        /// of times a generated token may be used (within its lifetime); 0 means unlimited.
        /// </summary>
        [Output("tokenNumUses")]
        public Output<int?> TokenNumUses { get; private set; } = null!;

        /// <summary>
        /// (Optional) If set, indicates that the
        /// token generated using this role should never expire. The token should be renewed within the
        /// duration specified by this value. At each renewal, the token's TTL will be set to the
        /// value of this field. Specified in seconds.
        /// </summary>
        [Output("tokenPeriod")]
        public Output<int?> TokenPeriod { get; private set; } = null!;

        /// <summary>
        /// (Optional) List of policies to encode onto generated tokens. Depending
        /// on the auth method, this list may be supplemented by user/group/other values.
        /// </summary>
        [Output("tokenPolicies")]
        public Output<ImmutableArray<string>> TokenPolicies { get; private set; } = null!;

        /// <summary>
        /// (Optional) The incremental lifetime for generated tokens in number of seconds.
        /// Its current value will be referenced at renewal time.
        /// </summary>
        [Output("tokenTtl")]
        public Output<int?> TokenTtl { get; private set; } = null!;

        /// <summary>
        /// Specifies the type of tokens that should be returned by
        /// the mount. Valid values are "default-service", "default-batch", "service", "batch".
        /// </summary>
        [Output("tokenType")]
        public Output<string?> TokenType { get; private set; } = null!;

        /// <summary>
        /// Extra configuration block. Structure is documented below.
        /// </summary>
        [Output("tune")]
        public Output<Outputs.AuthBackendTune> Tune { get; private set; } = null!;


        /// <summary>
        /// Create a AuthBackend resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AuthBackend(string name, AuthBackendArgs args, CustomResourceOptions? options = null)
            : base("vault:github/authBackend:AuthBackend", name, args ?? new AuthBackendArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AuthBackend(string name, Input<string> id, AuthBackendState? state = null, CustomResourceOptions? options = null)
            : base("vault:github/authBackend:AuthBackend", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AuthBackend resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AuthBackend Get(string name, Input<string> id, AuthBackendState? state = null, CustomResourceOptions? options = null)
        {
            return new AuthBackend(name, id, state, options);
        }
    }

    public sealed class AuthBackendArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The API endpoint to use. Useful if you
        /// are running GitHub Enterprise or an API-compatible authentication server.
        /// </summary>
        [Input("baseUrl")]
        public Input<string>? BaseUrl { get; set; }

        /// <summary>
        /// Specifies the description of the mount.
        /// This overrides the current stored value, if any.
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
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// The organization configured users must be part of.
        /// </summary>
        [Input("organization", required: true)]
        public Input<string> Organization { get; set; } = null!;

        /// <summary>
        /// The ID of the organization users must be part of.
        /// Vault will attempt to fetch and set this value if it is not provided. (Vault 1.10+)
        /// </summary>
        [Input("organizationId")]
        public Input<int>? OrganizationId { get; set; }

        /// <summary>
        /// Path where the auth backend is mounted. Defaults to `auth/github`
        /// if not specified.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        [Input("tokenBoundCidrs")]
        private InputList<string>? _tokenBoundCidrs;

        /// <summary>
        /// (Optional) List of CIDR blocks; if set, specifies blocks of IP
        /// addresses which can authenticate successfully, and ties the resulting token to these blocks
        /// as well.
        /// </summary>
        public InputList<string> TokenBoundCidrs
        {
            get => _tokenBoundCidrs ?? (_tokenBoundCidrs = new InputList<string>());
            set => _tokenBoundCidrs = value;
        }

        /// <summary>
        /// (Optional) If set, will encode an
        /// [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
        /// onto the token in number of seconds. This is a hard cap even if `token_ttl` and
        /// `token_max_ttl` would otherwise allow a renewal.
        /// </summary>
        [Input("tokenExplicitMaxTtl")]
        public Input<int>? TokenExplicitMaxTtl { get; set; }

        /// <summary>
        /// (Optional) The maximum lifetime for generated tokens in number of seconds.
        /// Its current value will be referenced at renewal time.
        /// </summary>
        [Input("tokenMaxTtl")]
        public Input<int>? TokenMaxTtl { get; set; }

        /// <summary>
        /// (Optional) If set, the default policy will not be set on
        /// generated tokens; otherwise it will be added to the policies set in token_policies.
        /// </summary>
        [Input("tokenNoDefaultPolicy")]
        public Input<bool>? TokenNoDefaultPolicy { get; set; }

        /// <summary>
        /// (Optional) The [maximum number](https://www.vaultproject.io/api-docs/github#token_num_uses)
        /// of times a generated token may be used (within its lifetime); 0 means unlimited.
        /// </summary>
        [Input("tokenNumUses")]
        public Input<int>? TokenNumUses { get; set; }

        /// <summary>
        /// (Optional) If set, indicates that the
        /// token generated using this role should never expire. The token should be renewed within the
        /// duration specified by this value. At each renewal, the token's TTL will be set to the
        /// value of this field. Specified in seconds.
        /// </summary>
        [Input("tokenPeriod")]
        public Input<int>? TokenPeriod { get; set; }

        [Input("tokenPolicies")]
        private InputList<string>? _tokenPolicies;

        /// <summary>
        /// (Optional) List of policies to encode onto generated tokens. Depending
        /// on the auth method, this list may be supplemented by user/group/other values.
        /// </summary>
        public InputList<string> TokenPolicies
        {
            get => _tokenPolicies ?? (_tokenPolicies = new InputList<string>());
            set => _tokenPolicies = value;
        }

        /// <summary>
        /// (Optional) The incremental lifetime for generated tokens in number of seconds.
        /// Its current value will be referenced at renewal time.
        /// </summary>
        [Input("tokenTtl")]
        public Input<int>? TokenTtl { get; set; }

        /// <summary>
        /// Specifies the type of tokens that should be returned by
        /// the mount. Valid values are "default-service", "default-batch", "service", "batch".
        /// </summary>
        [Input("tokenType")]
        public Input<string>? TokenType { get; set; }

        /// <summary>
        /// Extra configuration block. Structure is documented below.
        /// </summary>
        [Input("tune")]
        public Input<Inputs.AuthBackendTuneArgs>? Tune { get; set; }

        public AuthBackendArgs()
        {
        }
        public static new AuthBackendArgs Empty => new AuthBackendArgs();
    }

    public sealed class AuthBackendState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The mount accessor related to the auth mount. It is useful for integration with [Identity Secrets Engine](https://www.vaultproject.io/docs/secrets/identity/index.html).
        /// </summary>
        [Input("accessor")]
        public Input<string>? Accessor { get; set; }

        /// <summary>
        /// The API endpoint to use. Useful if you
        /// are running GitHub Enterprise or an API-compatible authentication server.
        /// </summary>
        [Input("baseUrl")]
        public Input<string>? BaseUrl { get; set; }

        /// <summary>
        /// Specifies the description of the mount.
        /// This overrides the current stored value, if any.
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
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// The organization configured users must be part of.
        /// </summary>
        [Input("organization")]
        public Input<string>? Organization { get; set; }

        /// <summary>
        /// The ID of the organization users must be part of.
        /// Vault will attempt to fetch and set this value if it is not provided. (Vault 1.10+)
        /// </summary>
        [Input("organizationId")]
        public Input<int>? OrganizationId { get; set; }

        /// <summary>
        /// Path where the auth backend is mounted. Defaults to `auth/github`
        /// if not specified.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        [Input("tokenBoundCidrs")]
        private InputList<string>? _tokenBoundCidrs;

        /// <summary>
        /// (Optional) List of CIDR blocks; if set, specifies blocks of IP
        /// addresses which can authenticate successfully, and ties the resulting token to these blocks
        /// as well.
        /// </summary>
        public InputList<string> TokenBoundCidrs
        {
            get => _tokenBoundCidrs ?? (_tokenBoundCidrs = new InputList<string>());
            set => _tokenBoundCidrs = value;
        }

        /// <summary>
        /// (Optional) If set, will encode an
        /// [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
        /// onto the token in number of seconds. This is a hard cap even if `token_ttl` and
        /// `token_max_ttl` would otherwise allow a renewal.
        /// </summary>
        [Input("tokenExplicitMaxTtl")]
        public Input<int>? TokenExplicitMaxTtl { get; set; }

        /// <summary>
        /// (Optional) The maximum lifetime for generated tokens in number of seconds.
        /// Its current value will be referenced at renewal time.
        /// </summary>
        [Input("tokenMaxTtl")]
        public Input<int>? TokenMaxTtl { get; set; }

        /// <summary>
        /// (Optional) If set, the default policy will not be set on
        /// generated tokens; otherwise it will be added to the policies set in token_policies.
        /// </summary>
        [Input("tokenNoDefaultPolicy")]
        public Input<bool>? TokenNoDefaultPolicy { get; set; }

        /// <summary>
        /// (Optional) The [maximum number](https://www.vaultproject.io/api-docs/github#token_num_uses)
        /// of times a generated token may be used (within its lifetime); 0 means unlimited.
        /// </summary>
        [Input("tokenNumUses")]
        public Input<int>? TokenNumUses { get; set; }

        /// <summary>
        /// (Optional) If set, indicates that the
        /// token generated using this role should never expire. The token should be renewed within the
        /// duration specified by this value. At each renewal, the token's TTL will be set to the
        /// value of this field. Specified in seconds.
        /// </summary>
        [Input("tokenPeriod")]
        public Input<int>? TokenPeriod { get; set; }

        [Input("tokenPolicies")]
        private InputList<string>? _tokenPolicies;

        /// <summary>
        /// (Optional) List of policies to encode onto generated tokens. Depending
        /// on the auth method, this list may be supplemented by user/group/other values.
        /// </summary>
        public InputList<string> TokenPolicies
        {
            get => _tokenPolicies ?? (_tokenPolicies = new InputList<string>());
            set => _tokenPolicies = value;
        }

        /// <summary>
        /// (Optional) The incremental lifetime for generated tokens in number of seconds.
        /// Its current value will be referenced at renewal time.
        /// </summary>
        [Input("tokenTtl")]
        public Input<int>? TokenTtl { get; set; }

        /// <summary>
        /// Specifies the type of tokens that should be returned by
        /// the mount. Valid values are "default-service", "default-batch", "service", "batch".
        /// </summary>
        [Input("tokenType")]
        public Input<string>? TokenType { get; set; }

        /// <summary>
        /// Extra configuration block. Structure is documented below.
        /// </summary>
        [Input("tune")]
        public Input<Inputs.AuthBackendTuneGetArgs>? Tune { get; set; }

        public AuthBackendState()
        {
        }
        public static new AuthBackendState Empty => new AuthBackendState();
    }
}
