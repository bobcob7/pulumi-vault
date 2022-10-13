// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.Identity
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
    ///     var test = new Vault.Identity.Entity("test", new()
    ///     {
    ///         Metadata = 
    ///         {
    ///             { "foo", "bar" },
    ///         },
    ///         Policies = new[]
    ///         {
    ///             "test",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Identity entity can be imported using the `id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import vault:identity/entity:Entity test "ae6f8ued-0f1a-9f6b-2915-1a2be20dc053"
    /// ```
    /// </summary>
    [VaultResourceType("vault:identity/entity:Entity")]
    public partial class Entity : global::Pulumi.CustomResource
    {
        /// <summary>
        /// True/false Is this entity currently disabled. Defaults to `false`
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// `false` by default. If set to `true`, this resource will ignore any policies return from Vault or specified in the resource. You can use `vault.identity.EntityPolicies` to manage policies for this entity in a decoupled manner.
        /// </summary>
        [Output("externalPolicies")]
        public Output<bool?> ExternalPolicies { get; private set; } = null!;

        /// <summary>
        /// A Map of additional metadata to associate with the user.
        /// </summary>
        [Output("metadata")]
        public Output<ImmutableDictionary<string, string>?> Metadata { get; private set; } = null!;

        /// <summary>
        /// Name of the identity entity to create.
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
        /// A list of policies to apply to the entity.
        /// </summary>
        [Output("policies")]
        public Output<ImmutableArray<string>> Policies { get; private set; } = null!;


        /// <summary>
        /// Create a Entity resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Entity(string name, EntityArgs? args = null, CustomResourceOptions? options = null)
            : base("vault:identity/entity:Entity", name, args ?? new EntityArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Entity(string name, Input<string> id, EntityState? state = null, CustomResourceOptions? options = null)
            : base("vault:identity/entity:Entity", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Entity resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Entity Get(string name, Input<string> id, EntityState? state = null, CustomResourceOptions? options = null)
        {
            return new Entity(name, id, state, options);
        }
    }

    public sealed class EntityArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// True/false Is this entity currently disabled. Defaults to `false`
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// `false` by default. If set to `true`, this resource will ignore any policies return from Vault or specified in the resource. You can use `vault.identity.EntityPolicies` to manage policies for this entity in a decoupled manner.
        /// </summary>
        [Input("externalPolicies")]
        public Input<bool>? ExternalPolicies { get; set; }

        [Input("metadata")]
        private InputMap<string>? _metadata;

        /// <summary>
        /// A Map of additional metadata to associate with the user.
        /// </summary>
        public InputMap<string> Metadata
        {
            get => _metadata ?? (_metadata = new InputMap<string>());
            set => _metadata = value;
        }

        /// <summary>
        /// Name of the identity entity to create.
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

        [Input("policies")]
        private InputList<string>? _policies;

        /// <summary>
        /// A list of policies to apply to the entity.
        /// </summary>
        public InputList<string> Policies
        {
            get => _policies ?? (_policies = new InputList<string>());
            set => _policies = value;
        }

        public EntityArgs()
        {
        }
        public static new EntityArgs Empty => new EntityArgs();
    }

    public sealed class EntityState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// True/false Is this entity currently disabled. Defaults to `false`
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// `false` by default. If set to `true`, this resource will ignore any policies return from Vault or specified in the resource. You can use `vault.identity.EntityPolicies` to manage policies for this entity in a decoupled manner.
        /// </summary>
        [Input("externalPolicies")]
        public Input<bool>? ExternalPolicies { get; set; }

        [Input("metadata")]
        private InputMap<string>? _metadata;

        /// <summary>
        /// A Map of additional metadata to associate with the user.
        /// </summary>
        public InputMap<string> Metadata
        {
            get => _metadata ?? (_metadata = new InputMap<string>());
            set => _metadata = value;
        }

        /// <summary>
        /// Name of the identity entity to create.
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

        [Input("policies")]
        private InputList<string>? _policies;

        /// <summary>
        /// A list of policies to apply to the entity.
        /// </summary>
        public InputList<string> Policies
        {
            get => _policies ?? (_policies = new InputList<string>());
            set => _policies = value;
        }

        public EntityState()
        {
        }
        public static new EntityState Empty => new EntityState();
    }
}
