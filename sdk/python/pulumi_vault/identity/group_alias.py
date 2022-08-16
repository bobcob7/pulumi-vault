# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['GroupAliasArgs', 'GroupAlias']

@pulumi.input_type
class GroupAliasArgs:
    def __init__(__self__, *,
                 canonical_id: pulumi.Input[str],
                 mount_accessor: pulumi.Input[str],
                 name: pulumi.Input[str]):
        """
        The set of arguments for constructing a GroupAlias resource.
        :param pulumi.Input[str] canonical_id: ID of the group to which this is an alias.
        :param pulumi.Input[str] mount_accessor: Mount accessor of the authentication backend to which this alias belongs to.
        :param pulumi.Input[str] name: Name of the group alias to create.
        """
        pulumi.set(__self__, "canonical_id", canonical_id)
        pulumi.set(__self__, "mount_accessor", mount_accessor)
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="canonicalId")
    def canonical_id(self) -> pulumi.Input[str]:
        """
        ID of the group to which this is an alias.
        """
        return pulumi.get(self, "canonical_id")

    @canonical_id.setter
    def canonical_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "canonical_id", value)

    @property
    @pulumi.getter(name="mountAccessor")
    def mount_accessor(self) -> pulumi.Input[str]:
        """
        Mount accessor of the authentication backend to which this alias belongs to.
        """
        return pulumi.get(self, "mount_accessor")

    @mount_accessor.setter
    def mount_accessor(self, value: pulumi.Input[str]):
        pulumi.set(self, "mount_accessor", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Name of the group alias to create.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _GroupAliasState:
    def __init__(__self__, *,
                 canonical_id: Optional[pulumi.Input[str]] = None,
                 mount_accessor: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering GroupAlias resources.
        :param pulumi.Input[str] canonical_id: ID of the group to which this is an alias.
        :param pulumi.Input[str] mount_accessor: Mount accessor of the authentication backend to which this alias belongs to.
        :param pulumi.Input[str] name: Name of the group alias to create.
        """
        if canonical_id is not None:
            pulumi.set(__self__, "canonical_id", canonical_id)
        if mount_accessor is not None:
            pulumi.set(__self__, "mount_accessor", mount_accessor)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="canonicalId")
    def canonical_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the group to which this is an alias.
        """
        return pulumi.get(self, "canonical_id")

    @canonical_id.setter
    def canonical_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "canonical_id", value)

    @property
    @pulumi.getter(name="mountAccessor")
    def mount_accessor(self) -> Optional[pulumi.Input[str]]:
        """
        Mount accessor of the authentication backend to which this alias belongs to.
        """
        return pulumi.get(self, "mount_accessor")

    @mount_accessor.setter
    def mount_accessor(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mount_accessor", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the group alias to create.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class GroupAlias(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 canonical_id: Optional[pulumi.Input[str]] = None,
                 mount_accessor: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates an Identity Group Alias for Vault. The [Identity secrets engine](https://www.vaultproject.io/docs/secrets/identity/index.html) is the identity management solution for Vault.

        Group aliases allows entity membership in external groups to be managed semi-automatically. External group serves as a mapping to a group that is outside of the identity store. External groups can have one (and only one) alias. This alias should map to a notion of group that is outside of the identity store. For example, groups in LDAP, and teams in GitHub. A username in LDAP, belonging to a group in LDAP, can get its entity ID added as a member of a group in Vault automatically during logins and token renewals. This works only if the group in Vault is an external group and has an alias that maps to the group in LDAP. If the user is removed from the group in LDAP, that change gets reflected in Vault only upon the subsequent login or renewal operation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_vault as vault

        group = vault.identity.Group("group",
            type="external",
            policies=["test"])
        github = vault.AuthBackend("github",
            type="github",
            path="github")
        group_alias = vault.identity.GroupAlias("group-alias",
            name="Github_Team_Slug",
            mount_accessor=github.accessor,
            canonical_id=group.id)
        ```

        ## Import

        The group alias can be imported with the group alias `id`, for example

        ```sh
         $ pulumi import vault:identity/groupAlias:GroupAlias group-alias id
        ```

         Group aliases can also be imported using the UUID of the alias record, e.g.

        ```sh
         $ pulumi import vault:identity/groupAlias:GroupAlias alias_name 63104e20-88e4-11eb-8d04-cf7ac9d60157
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] canonical_id: ID of the group to which this is an alias.
        :param pulumi.Input[str] mount_accessor: Mount accessor of the authentication backend to which this alias belongs to.
        :param pulumi.Input[str] name: Name of the group alias to create.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GroupAliasArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates an Identity Group Alias for Vault. The [Identity secrets engine](https://www.vaultproject.io/docs/secrets/identity/index.html) is the identity management solution for Vault.

        Group aliases allows entity membership in external groups to be managed semi-automatically. External group serves as a mapping to a group that is outside of the identity store. External groups can have one (and only one) alias. This alias should map to a notion of group that is outside of the identity store. For example, groups in LDAP, and teams in GitHub. A username in LDAP, belonging to a group in LDAP, can get its entity ID added as a member of a group in Vault automatically during logins and token renewals. This works only if the group in Vault is an external group and has an alias that maps to the group in LDAP. If the user is removed from the group in LDAP, that change gets reflected in Vault only upon the subsequent login or renewal operation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_vault as vault

        group = vault.identity.Group("group",
            type="external",
            policies=["test"])
        github = vault.AuthBackend("github",
            type="github",
            path="github")
        group_alias = vault.identity.GroupAlias("group-alias",
            name="Github_Team_Slug",
            mount_accessor=github.accessor,
            canonical_id=group.id)
        ```

        ## Import

        The group alias can be imported with the group alias `id`, for example

        ```sh
         $ pulumi import vault:identity/groupAlias:GroupAlias group-alias id
        ```

         Group aliases can also be imported using the UUID of the alias record, e.g.

        ```sh
         $ pulumi import vault:identity/groupAlias:GroupAlias alias_name 63104e20-88e4-11eb-8d04-cf7ac9d60157
        ```

        :param str resource_name: The name of the resource.
        :param GroupAliasArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GroupAliasArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 canonical_id: Optional[pulumi.Input[str]] = None,
                 mount_accessor: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GroupAliasArgs.__new__(GroupAliasArgs)

            if canonical_id is None and not opts.urn:
                raise TypeError("Missing required property 'canonical_id'")
            __props__.__dict__["canonical_id"] = canonical_id
            if mount_accessor is None and not opts.urn:
                raise TypeError("Missing required property 'mount_accessor'")
            __props__.__dict__["mount_accessor"] = mount_accessor
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
        super(GroupAlias, __self__).__init__(
            'vault:identity/groupAlias:GroupAlias',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            canonical_id: Optional[pulumi.Input[str]] = None,
            mount_accessor: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'GroupAlias':
        """
        Get an existing GroupAlias resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] canonical_id: ID of the group to which this is an alias.
        :param pulumi.Input[str] mount_accessor: Mount accessor of the authentication backend to which this alias belongs to.
        :param pulumi.Input[str] name: Name of the group alias to create.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GroupAliasState.__new__(_GroupAliasState)

        __props__.__dict__["canonical_id"] = canonical_id
        __props__.__dict__["mount_accessor"] = mount_accessor
        __props__.__dict__["name"] = name
        return GroupAlias(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="canonicalId")
    def canonical_id(self) -> pulumi.Output[str]:
        """
        ID of the group to which this is an alias.
        """
        return pulumi.get(self, "canonical_id")

    @property
    @pulumi.getter(name="mountAccessor")
    def mount_accessor(self) -> pulumi.Output[str]:
        """
        Mount accessor of the authentication backend to which this alias belongs to.
        """
        return pulumi.get(self, "mount_accessor")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the group alias to create.
        """
        return pulumi.get(self, "name")

