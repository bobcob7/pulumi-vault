# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['GroupMemberEntityIdsArgs', 'GroupMemberEntityIds']

@pulumi.input_type
class GroupMemberEntityIdsArgs:
    def __init__(__self__, *,
                 group_id: pulumi.Input[str],
                 exclusive: Optional[pulumi.Input[bool]] = None,
                 member_entity_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a GroupMemberEntityIds resource.
        :param pulumi.Input[str] group_id: Group ID to assign member entities to.
        :param pulumi.Input[bool] exclusive: Defaults to `true`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] member_entity_ids: List of member entities that belong to the group
        """
        pulumi.set(__self__, "group_id", group_id)
        if exclusive is not None:
            pulumi.set(__self__, "exclusive", exclusive)
        if member_entity_ids is not None:
            pulumi.set(__self__, "member_entity_ids", member_entity_ids)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Input[str]:
        """
        Group ID to assign member entities to.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter
    def exclusive(self) -> Optional[pulumi.Input[bool]]:
        """
        Defaults to `true`.
        """
        return pulumi.get(self, "exclusive")

    @exclusive.setter
    def exclusive(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "exclusive", value)

    @property
    @pulumi.getter(name="memberEntityIds")
    def member_entity_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of member entities that belong to the group
        """
        return pulumi.get(self, "member_entity_ids")

    @member_entity_ids.setter
    def member_entity_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "member_entity_ids", value)


@pulumi.input_type
class _GroupMemberEntityIdsState:
    def __init__(__self__, *,
                 exclusive: Optional[pulumi.Input[bool]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 group_name: Optional[pulumi.Input[str]] = None,
                 member_entity_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering GroupMemberEntityIds resources.
        :param pulumi.Input[bool] exclusive: Defaults to `true`.
        :param pulumi.Input[str] group_id: Group ID to assign member entities to.
        :param pulumi.Input[str] group_name: The name of the group that are assigned the member entities.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] member_entity_ids: List of member entities that belong to the group
        """
        if exclusive is not None:
            pulumi.set(__self__, "exclusive", exclusive)
        if group_id is not None:
            pulumi.set(__self__, "group_id", group_id)
        if group_name is not None:
            pulumi.set(__self__, "group_name", group_name)
        if member_entity_ids is not None:
            pulumi.set(__self__, "member_entity_ids", member_entity_ids)

    @property
    @pulumi.getter
    def exclusive(self) -> Optional[pulumi.Input[bool]]:
        """
        Defaults to `true`.
        """
        return pulumi.get(self, "exclusive")

    @exclusive.setter
    def exclusive(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "exclusive", value)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> Optional[pulumi.Input[str]]:
        """
        Group ID to assign member entities to.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the group that are assigned the member entities.
        """
        return pulumi.get(self, "group_name")

    @group_name.setter
    def group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_name", value)

    @property
    @pulumi.getter(name="memberEntityIds")
    def member_entity_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of member entities that belong to the group
        """
        return pulumi.get(self, "member_entity_ids")

    @member_entity_ids.setter
    def member_entity_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "member_entity_ids", value)


class GroupMemberEntityIds(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 exclusive: Optional[pulumi.Input[bool]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 member_entity_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Manages member entities for an Identity Group for Vault. The [Identity secrets engine](https://www.vaultproject.io/docs/secrets/identity/index.html) is the identity management solution for Vault.

        ## Example Usage
        ### Exclusive Member Entities

        ```python
        import pulumi
        import pulumi_vault as vault

        internal = vault.identity.Group("internal",
            type="internal",
            external_member_entity_ids=True,
            metadata={
                "version": "2",
            })
        user = vault.identity.Entity("user")
        members = vault.identity.GroupMemberEntityIds("members",
            exclusive=True,
            member_entity_ids=[user.id],
            group_id=internal.id)
        ```
        ### Non-exclusive Member Entities

        ```python
        import pulumi
        import pulumi_vault as vault

        internal = vault.identity.Group("internal",
            type="internal",
            external_member_entity_ids=True,
            metadata={
                "version": "2",
            })
        test_user = vault.identity.Entity("testUser")
        second_test_user = vault.identity.Entity("secondTestUser")
        dev_user = vault.identity.Entity("devUser")
        test = vault.identity.GroupMemberEntityIds("test",
            member_entity_ids=[
                test_user.id,
                second_test_user.id,
            ],
            exclusive=False,
            group_id=internal.id)
        others = vault.identity.GroupMemberEntityIds("others",
            member_entity_ids=[dev_user.id],
            exclusive=False,
            group_id=internal.id)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] exclusive: Defaults to `true`.
        :param pulumi.Input[str] group_id: Group ID to assign member entities to.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] member_entity_ids: List of member entities that belong to the group
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GroupMemberEntityIdsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages member entities for an Identity Group for Vault. The [Identity secrets engine](https://www.vaultproject.io/docs/secrets/identity/index.html) is the identity management solution for Vault.

        ## Example Usage
        ### Exclusive Member Entities

        ```python
        import pulumi
        import pulumi_vault as vault

        internal = vault.identity.Group("internal",
            type="internal",
            external_member_entity_ids=True,
            metadata={
                "version": "2",
            })
        user = vault.identity.Entity("user")
        members = vault.identity.GroupMemberEntityIds("members",
            exclusive=True,
            member_entity_ids=[user.id],
            group_id=internal.id)
        ```
        ### Non-exclusive Member Entities

        ```python
        import pulumi
        import pulumi_vault as vault

        internal = vault.identity.Group("internal",
            type="internal",
            external_member_entity_ids=True,
            metadata={
                "version": "2",
            })
        test_user = vault.identity.Entity("testUser")
        second_test_user = vault.identity.Entity("secondTestUser")
        dev_user = vault.identity.Entity("devUser")
        test = vault.identity.GroupMemberEntityIds("test",
            member_entity_ids=[
                test_user.id,
                second_test_user.id,
            ],
            exclusive=False,
            group_id=internal.id)
        others = vault.identity.GroupMemberEntityIds("others",
            member_entity_ids=[dev_user.id],
            exclusive=False,
            group_id=internal.id)
        ```

        :param str resource_name: The name of the resource.
        :param GroupMemberEntityIdsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GroupMemberEntityIdsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 exclusive: Optional[pulumi.Input[bool]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 member_entity_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GroupMemberEntityIdsArgs.__new__(GroupMemberEntityIdsArgs)

            __props__.__dict__["exclusive"] = exclusive
            if group_id is None and not opts.urn:
                raise TypeError("Missing required property 'group_id'")
            __props__.__dict__["group_id"] = group_id
            __props__.__dict__["member_entity_ids"] = member_entity_ids
            __props__.__dict__["group_name"] = None
        super(GroupMemberEntityIds, __self__).__init__(
            'vault:identity/groupMemberEntityIds:GroupMemberEntityIds',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            exclusive: Optional[pulumi.Input[bool]] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            group_name: Optional[pulumi.Input[str]] = None,
            member_entity_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'GroupMemberEntityIds':
        """
        Get an existing GroupMemberEntityIds resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] exclusive: Defaults to `true`.
        :param pulumi.Input[str] group_id: Group ID to assign member entities to.
        :param pulumi.Input[str] group_name: The name of the group that are assigned the member entities.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] member_entity_ids: List of member entities that belong to the group
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GroupMemberEntityIdsState.__new__(_GroupMemberEntityIdsState)

        __props__.__dict__["exclusive"] = exclusive
        __props__.__dict__["group_id"] = group_id
        __props__.__dict__["group_name"] = group_name
        __props__.__dict__["member_entity_ids"] = member_entity_ids
        return GroupMemberEntityIds(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def exclusive(self) -> pulumi.Output[Optional[bool]]:
        """
        Defaults to `true`.
        """
        return pulumi.get(self, "exclusive")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[str]:
        """
        Group ID to assign member entities to.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> pulumi.Output[str]:
        """
        The name of the group that are assigned the member entities.
        """
        return pulumi.get(self, "group_name")

    @property
    @pulumi.getter(name="memberEntityIds")
    def member_entity_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of member entities that belong to the group
        """
        return pulumi.get(self, "member_entity_ids")

