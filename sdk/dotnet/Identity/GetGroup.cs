// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.Identity
{
    public static partial class Invokes
    {
        /// <summary>
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-vault/blob/master/website/docs/d/identity_group.html.markdown.
        /// </summary>
        public static Task<GetGroupResult> GetGroup(GetGroupArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetGroupResult>("vault:identity/getGroup:getGroup", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetGroupArgs : Pulumi.InvokeArgs
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
        /// ID of the group.
        /// </summary>
        [Input("groupId")]
        public string? GroupId { get; set; }

        /// <summary>
        /// Name of the group.
        /// </summary>
        [Input("groupName")]
        public string? GroupName { get; set; }

        public GetGroupArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetGroupResult
    {
        /// <summary>
        /// Canonical ID of the Alias
        /// </summary>
        public readonly string AliasCanonicalId;
        /// <summary>
        /// Creation time of the Alias
        /// </summary>
        public readonly string AliasCreationTime;
        public readonly string AliasId;
        /// <summary>
        /// Last update time of the alias
        /// </summary>
        public readonly string AliasLastUpdateTime;
        /// <summary>
        /// List of canonical IDs merged with this alias
        /// </summary>
        public readonly ImmutableArray<string> AliasMergedFromCanonicalIds;
        /// <summary>
        /// Arbitrary metadata
        /// </summary>
        public readonly ImmutableDictionary<string, object> AliasMetadata;
        public readonly string AliasMountAccessor;
        /// <summary>
        /// Authentication mount path which this alias belongs to
        /// </summary>
        public readonly string AliasMountPath;
        /// <summary>
        /// Authentication mount type which this alias belongs to
        /// </summary>
        public readonly string AliasMountType;
        public readonly string AliasName;
        /// <summary>
        /// Creation timestamp of the group
        /// </summary>
        public readonly string CreationTime;
        /// <summary>
        /// A string containing the full data payload retrieved from
        /// Vault, serialized in JSON format.
        /// </summary>
        public readonly string DataJson;
        public readonly string GroupId;
        public readonly string GroupName;
        /// <summary>
        /// Last updated time of the group
        /// </summary>
        public readonly string LastUpdateTime;
        /// <summary>
        /// List of Entity IDs which are members of this group
        /// </summary>
        public readonly ImmutableArray<string> MemberEntityIds;
        /// <summary>
        /// List of Group IDs which are members of this group
        /// </summary>
        public readonly ImmutableArray<string> MemberGroupIds;
        /// <summary>
        /// Arbitrary metadata
        /// </summary>
        public readonly ImmutableDictionary<string, object> Metadata;
        /// <summary>
        /// Modify index of the group
        /// </summary>
        public readonly int ModifyIndex;
        /// <summary>
        /// Namespace of which the group is part of
        /// </summary>
        public readonly string NamespaceId;
        /// <summary>
        /// List of Group IDs which are parents of this group.
        /// </summary>
        public readonly ImmutableArray<string> ParentGroupIds;
        /// <summary>
        /// List of policies attached to the group
        /// </summary>
        public readonly ImmutableArray<string> Policies;
        /// <summary>
        /// Type of group
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetGroupResult(
            string aliasCanonicalId,
            string aliasCreationTime,
            string aliasId,
            string aliasLastUpdateTime,
            ImmutableArray<string> aliasMergedFromCanonicalIds,
            ImmutableDictionary<string, object> aliasMetadata,
            string aliasMountAccessor,
            string aliasMountPath,
            string aliasMountType,
            string aliasName,
            string creationTime,
            string dataJson,
            string groupId,
            string groupName,
            string lastUpdateTime,
            ImmutableArray<string> memberEntityIds,
            ImmutableArray<string> memberGroupIds,
            ImmutableDictionary<string, object> metadata,
            int modifyIndex,
            string namespaceId,
            ImmutableArray<string> parentGroupIds,
            ImmutableArray<string> policies,
            string type,
            string id)
        {
            AliasCanonicalId = aliasCanonicalId;
            AliasCreationTime = aliasCreationTime;
            AliasId = aliasId;
            AliasLastUpdateTime = aliasLastUpdateTime;
            AliasMergedFromCanonicalIds = aliasMergedFromCanonicalIds;
            AliasMetadata = aliasMetadata;
            AliasMountAccessor = aliasMountAccessor;
            AliasMountPath = aliasMountPath;
            AliasMountType = aliasMountType;
            AliasName = aliasName;
            CreationTime = creationTime;
            DataJson = dataJson;
            GroupId = groupId;
            GroupName = groupName;
            LastUpdateTime = lastUpdateTime;
            MemberEntityIds = memberEntityIds;
            MemberGroupIds = memberGroupIds;
            Metadata = metadata;
            ModifyIndex = modifyIndex;
            NamespaceId = namespaceId;
            ParentGroupIds = parentGroupIds;
            Policies = policies;
            Type = type;
            Id = id;
        }
    }
}
