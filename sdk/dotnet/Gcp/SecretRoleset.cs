// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.Gcp
{
    /// <summary>
    /// Creates a Roleset in the [GCP Secrets Engine](https://www.vaultproject.io/docs/secrets/gcp/index.html) for Vault.
    /// 
    /// Each Roleset is [tied](https://www.vaultproject.io/docs/secrets/gcp/index.html#service-accounts-are-tied-to-rolesets) to a Service Account, and can have one or more [bindings](https://www.vaultproject.io/docs/secrets/gcp/index.html#roleset-bindings) associated with it.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-vault/blob/master/website/docs/r/gcp_secret_roleset.html.md.
    /// </summary>
    public partial class SecretRoleset : Pulumi.CustomResource
    {
        /// <summary>
        /// Path where the GCP Secrets Engine is mounted
        /// </summary>
        [Output("backend")]
        public Output<string> Backend { get; private set; } = null!;

        /// <summary>
        /// Bindings to create for this roleset. This can be specified multiple times for multiple bindings. Structure is documented below.
        /// </summary>
        [Output("bindings")]
        public Output<ImmutableArray<Outputs.SecretRolesetBindings>> Bindings { get; private set; } = null!;

        /// <summary>
        /// Name of the GCP project that this roleset's service account will belong to.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Name of the Roleset to create
        /// </summary>
        [Output("roleset")]
        public Output<string> Roleset { get; private set; } = null!;

        /// <summary>
        /// Type of secret generated for this role set. Accepted values: `access_token`, `service_account_key`. Defaults to `access_token`.
        /// </summary>
        [Output("secretType")]
        public Output<string> SecretType { get; private set; } = null!;

        /// <summary>
        /// Email of the service account created by Vault for this Roleset
        /// </summary>
        [Output("serviceAccountEmail")]
        public Output<string> ServiceAccountEmail { get; private set; } = null!;

        /// <summary>
        /// List of OAuth scopes to assign to `access_token` secrets generated under this role set (`access_token` role sets only).
        /// </summary>
        [Output("tokenScopes")]
        public Output<ImmutableArray<string>> TokenScopes { get; private set; } = null!;


        /// <summary>
        /// Create a SecretRoleset resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecretRoleset(string name, SecretRolesetArgs args, CustomResourceOptions? options = null)
            : base("vault:gcp/secretRoleset:SecretRoleset", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private SecretRoleset(string name, Input<string> id, SecretRolesetState? state = null, CustomResourceOptions? options = null)
            : base("vault:gcp/secretRoleset:SecretRoleset", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SecretRoleset resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecretRoleset Get(string name, Input<string> id, SecretRolesetState? state = null, CustomResourceOptions? options = null)
        {
            return new SecretRoleset(name, id, state, options);
        }
    }

    public sealed class SecretRolesetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Path where the GCP Secrets Engine is mounted
        /// </summary>
        [Input("backend", required: true)]
        public Input<string> Backend { get; set; } = null!;

        [Input("bindings", required: true)]
        private InputList<Inputs.SecretRolesetBindingsArgs>? _bindings;

        /// <summary>
        /// Bindings to create for this roleset. This can be specified multiple times for multiple bindings. Structure is documented below.
        /// </summary>
        public InputList<Inputs.SecretRolesetBindingsArgs> Bindings
        {
            get => _bindings ?? (_bindings = new InputList<Inputs.SecretRolesetBindingsArgs>());
            set => _bindings = value;
        }

        /// <summary>
        /// Name of the GCP project that this roleset's service account will belong to.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Name of the Roleset to create
        /// </summary>
        [Input("roleset", required: true)]
        public Input<string> Roleset { get; set; } = null!;

        /// <summary>
        /// Type of secret generated for this role set. Accepted values: `access_token`, `service_account_key`. Defaults to `access_token`.
        /// </summary>
        [Input("secretType")]
        public Input<string>? SecretType { get; set; }

        [Input("tokenScopes")]
        private InputList<string>? _tokenScopes;

        /// <summary>
        /// List of OAuth scopes to assign to `access_token` secrets generated under this role set (`access_token` role sets only).
        /// </summary>
        public InputList<string> TokenScopes
        {
            get => _tokenScopes ?? (_tokenScopes = new InputList<string>());
            set => _tokenScopes = value;
        }

        public SecretRolesetArgs()
        {
        }
    }

    public sealed class SecretRolesetState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Path where the GCP Secrets Engine is mounted
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        [Input("bindings")]
        private InputList<Inputs.SecretRolesetBindingsGetArgs>? _bindings;

        /// <summary>
        /// Bindings to create for this roleset. This can be specified multiple times for multiple bindings. Structure is documented below.
        /// </summary>
        public InputList<Inputs.SecretRolesetBindingsGetArgs> Bindings
        {
            get => _bindings ?? (_bindings = new InputList<Inputs.SecretRolesetBindingsGetArgs>());
            set => _bindings = value;
        }

        /// <summary>
        /// Name of the GCP project that this roleset's service account will belong to.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Name of the Roleset to create
        /// </summary>
        [Input("roleset")]
        public Input<string>? Roleset { get; set; }

        /// <summary>
        /// Type of secret generated for this role set. Accepted values: `access_token`, `service_account_key`. Defaults to `access_token`.
        /// </summary>
        [Input("secretType")]
        public Input<string>? SecretType { get; set; }

        /// <summary>
        /// Email of the service account created by Vault for this Roleset
        /// </summary>
        [Input("serviceAccountEmail")]
        public Input<string>? ServiceAccountEmail { get; set; }

        [Input("tokenScopes")]
        private InputList<string>? _tokenScopes;

        /// <summary>
        /// List of OAuth scopes to assign to `access_token` secrets generated under this role set (`access_token` role sets only).
        /// </summary>
        public InputList<string> TokenScopes
        {
            get => _tokenScopes ?? (_tokenScopes = new InputList<string>());
            set => _tokenScopes = value;
        }

        public SecretRolesetState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class SecretRolesetBindingsArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Resource or resource path for which IAM policy information will be bound. The resource path may be specified in a few different [formats](https://www.vaultproject.io/docs/secrets/gcp/index.html#roleset-bindings).
        /// </summary>
        [Input("resource", required: true)]
        public Input<string> Resource { get; set; } = null!;

        [Input("roles", required: true)]
        private InputList<string>? _roles;

        /// <summary>
        /// List of [GCP IAM roles](https://cloud.google.com/iam/docs/understanding-roles) for the resource.
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        public SecretRolesetBindingsArgs()
        {
        }
    }

    public sealed class SecretRolesetBindingsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Resource or resource path for which IAM policy information will be bound. The resource path may be specified in a few different [formats](https://www.vaultproject.io/docs/secrets/gcp/index.html#roleset-bindings).
        /// </summary>
        [Input("resource", required: true)]
        public Input<string> Resource { get; set; } = null!;

        [Input("roles", required: true)]
        private InputList<string>? _roles;

        /// <summary>
        /// List of [GCP IAM roles](https://cloud.google.com/iam/docs/understanding-roles) for the resource.
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        public SecretRolesetBindingsGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class SecretRolesetBindings
    {
        /// <summary>
        /// Resource or resource path for which IAM policy information will be bound. The resource path may be specified in a few different [formats](https://www.vaultproject.io/docs/secrets/gcp/index.html#roleset-bindings).
        /// </summary>
        public readonly string Resource;
        /// <summary>
        /// List of [GCP IAM roles](https://cloud.google.com/iam/docs/understanding-roles) for the resource.
        /// </summary>
        public readonly ImmutableArray<string> Roles;

        [OutputConstructor]
        private SecretRolesetBindings(
            string resource,
            ImmutableArray<string> roles)
        {
            Resource = resource;
            Roles = roles;
        }
    }
    }
}
