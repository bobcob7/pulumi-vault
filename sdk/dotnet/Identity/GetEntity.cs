// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.Identity
{
    public static class GetEntity
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Vault = Pulumi.Vault;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var entity = Vault.Identity.GetEntity.Invoke(new()
        ///     {
        ///         EntityName = "entity_12345",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Required Vault Capabilities
        /// 
        /// Use of this resource requires the `create` capability on `/identity/lookup/entity`.
        /// </summary>
        public static Task<GetEntityResult> InvokeAsync(GetEntityArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEntityResult>("vault:identity/getEntity:getEntity", args ?? new GetEntityArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Vault = Pulumi.Vault;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var entity = Vault.Identity.GetEntity.Invoke(new()
        ///     {
        ///         EntityName = "entity_12345",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Required Vault Capabilities
        /// 
        /// Use of this resource requires the `create` capability on `/identity/lookup/entity`.
        /// </summary>
        public static Output<GetEntityResult> Invoke(GetEntityInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEntityResult>("vault:identity/getEntity:getEntity", args ?? new GetEntityInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEntityArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the alias.
        /// </summary>
        [Input("aliasId")]
        public string? AliasId { get; set; }

        /// <summary>
        /// Accessor of the mount to which the alias belongs to.
        /// This should be supplied in conjunction with `alias_name`.
        /// </summary>
        [Input("aliasMountAccessor")]
        public string? AliasMountAccessor { get; set; }

        /// <summary>
        /// Name of the alias. This should be supplied in conjunction with
        /// `alias_mount_accessor`.
        /// </summary>
        [Input("aliasName")]
        public string? AliasName { get; set; }

        /// <summary>
        /// ID of the entity.
        /// </summary>
        [Input("entityId")]
        public string? EntityId { get; set; }

        /// <summary>
        /// Name of the entity.
        /// </summary>
        [Input("entityName")]
        public string? EntityName { get; set; }

        /// <summary>
        /// The namespace of the target resource.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public string? Namespace { get; set; }

        public GetEntityArgs()
        {
        }
        public static new GetEntityArgs Empty => new GetEntityArgs();
    }

    public sealed class GetEntityInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the alias.
        /// </summary>
        [Input("aliasId")]
        public Input<string>? AliasId { get; set; }

        /// <summary>
        /// Accessor of the mount to which the alias belongs to.
        /// This should be supplied in conjunction with `alias_name`.
        /// </summary>
        [Input("aliasMountAccessor")]
        public Input<string>? AliasMountAccessor { get; set; }

        /// <summary>
        /// Name of the alias. This should be supplied in conjunction with
        /// `alias_mount_accessor`.
        /// </summary>
        [Input("aliasName")]
        public Input<string>? AliasName { get; set; }

        /// <summary>
        /// ID of the entity.
        /// </summary>
        [Input("entityId")]
        public Input<string>? EntityId { get; set; }

        /// <summary>
        /// Name of the entity.
        /// </summary>
        [Input("entityName")]
        public Input<string>? EntityName { get; set; }

        /// <summary>
        /// The namespace of the target resource.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        public GetEntityInvokeArgs()
        {
        }
        public static new GetEntityInvokeArgs Empty => new GetEntityInvokeArgs();
    }


    [OutputType]
    public sealed class GetEntityResult
    {
        public readonly string AliasId;
        public readonly string AliasMountAccessor;
        public readonly string AliasName;
        /// <summary>
        /// A list of entity alias. Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEntityAliasResult> Aliases;
        /// <summary>
        /// Creation time of the Alias
        /// </summary>
        public readonly string CreationTime;
        /// <summary>
        /// A string containing the full data payload retrieved from
        /// Vault, serialized in JSON format.
        /// </summary>
        public readonly string DataJson;
        /// <summary>
        /// List of Group IDs of which the entity is directly a member of
        /// </summary>
        public readonly ImmutableArray<string> DirectGroupIds;
        /// <summary>
        /// Whether the entity is disabled
        /// </summary>
        public readonly bool Disabled;
        public readonly string EntityId;
        public readonly string EntityName;
        /// <summary>
        /// List of all Group IDs of which the entity is a member of
        /// </summary>
        public readonly ImmutableArray<string> GroupIds;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of all Group IDs of which the entity is a member of transitively
        /// </summary>
        public readonly ImmutableArray<string> InheritedGroupIds;
        /// <summary>
        /// Last update time of the alias
        /// </summary>
        public readonly string LastUpdateTime;
        /// <summary>
        /// Other entity IDs which is merged with this entity
        /// </summary>
        public readonly ImmutableArray<string> MergedEntityIds;
        /// <summary>
        /// Arbitrary metadata
        /// </summary>
        public readonly ImmutableDictionary<string, object> Metadata;
        public readonly string? Namespace;
        /// <summary>
        /// Namespace of which the entity is part of
        /// </summary>
        public readonly string NamespaceId;
        /// <summary>
        /// List of policies attached to the entity
        /// </summary>
        public readonly ImmutableArray<string> Policies;

        [OutputConstructor]
        private GetEntityResult(
            string aliasId,

            string aliasMountAccessor,

            string aliasName,

            ImmutableArray<Outputs.GetEntityAliasResult> aliases,

            string creationTime,

            string dataJson,

            ImmutableArray<string> directGroupIds,

            bool disabled,

            string entityId,

            string entityName,

            ImmutableArray<string> groupIds,

            string id,

            ImmutableArray<string> inheritedGroupIds,

            string lastUpdateTime,

            ImmutableArray<string> mergedEntityIds,

            ImmutableDictionary<string, object> metadata,

            string? @namespace,

            string namespaceId,

            ImmutableArray<string> policies)
        {
            AliasId = aliasId;
            AliasMountAccessor = aliasMountAccessor;
            AliasName = aliasName;
            Aliases = aliases;
            CreationTime = creationTime;
            DataJson = dataJson;
            DirectGroupIds = directGroupIds;
            Disabled = disabled;
            EntityId = entityId;
            EntityName = entityName;
            GroupIds = groupIds;
            Id = id;
            InheritedGroupIds = inheritedGroupIds;
            LastUpdateTime = lastUpdateTime;
            MergedEntityIds = mergedEntityIds;
            Metadata = metadata;
            Namespace = @namespace;
            NamespaceId = namespaceId;
            Policies = policies;
        }
    }
}
