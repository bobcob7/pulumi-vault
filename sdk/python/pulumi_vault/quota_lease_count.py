# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['QuotaLeaseCountArgs', 'QuotaLeaseCount']

@pulumi.input_type
class QuotaLeaseCountArgs:
    def __init__(__self__, *,
                 max_leases: pulumi.Input[int],
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a QuotaLeaseCount resource.
        :param pulumi.Input[int] max_leases: The maximum number of leases to be allowed by the quota
               rule. The `max_leases` must be positive.
        :param pulumi.Input[str] name: Name of the rate limit quota
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured namespace.
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: Path of the mount or namespace to apply the quota. A blank path configures a
               global rate limit quota. For example `namespace1/` adds a quota to a full namespace,
               `namespace1/auth/userpass` adds a `quota` to `userpass` in `namespace1`.
               Updating this field on an existing quota can have "moving" effects. For example, updating
               `auth/userpass` to `namespace1/auth/userpass` moves this quota from being a global mount quota to
               a namespace specific mount quota. **Note, namespaces are supported in Enterprise only.**
        """
        pulumi.set(__self__, "max_leases", max_leases)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if path is not None:
            pulumi.set(__self__, "path", path)

    @property
    @pulumi.getter(name="maxLeases")
    def max_leases(self) -> pulumi.Input[int]:
        """
        The maximum number of leases to be allowed by the quota
        rule. The `max_leases` must be positive.
        """
        return pulumi.get(self, "max_leases")

    @max_leases.setter
    def max_leases(self, value: pulumi.Input[int]):
        pulumi.set(self, "max_leases", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the rate limit quota
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[str]]:
        """
        The namespace to provision the resource in.
        The value should not contain leading or trailing forward slashes.
        The `namespace` is always relative to the provider's configured namespace.
        *Available only for Vault Enterprise*.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        Path of the mount or namespace to apply the quota. A blank path configures a
        global rate limit quota. For example `namespace1/` adds a quota to a full namespace,
        `namespace1/auth/userpass` adds a `quota` to `userpass` in `namespace1`.
        Updating this field on an existing quota can have "moving" effects. For example, updating
        `auth/userpass` to `namespace1/auth/userpass` moves this quota from being a global mount quota to
        a namespace specific mount quota. **Note, namespaces are supported in Enterprise only.**
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)


@pulumi.input_type
class _QuotaLeaseCountState:
    def __init__(__self__, *,
                 max_leases: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering QuotaLeaseCount resources.
        :param pulumi.Input[int] max_leases: The maximum number of leases to be allowed by the quota
               rule. The `max_leases` must be positive.
        :param pulumi.Input[str] name: Name of the rate limit quota
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured namespace.
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: Path of the mount or namespace to apply the quota. A blank path configures a
               global rate limit quota. For example `namespace1/` adds a quota to a full namespace,
               `namespace1/auth/userpass` adds a `quota` to `userpass` in `namespace1`.
               Updating this field on an existing quota can have "moving" effects. For example, updating
               `auth/userpass` to `namespace1/auth/userpass` moves this quota from being a global mount quota to
               a namespace specific mount quota. **Note, namespaces are supported in Enterprise only.**
        """
        if max_leases is not None:
            pulumi.set(__self__, "max_leases", max_leases)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if path is not None:
            pulumi.set(__self__, "path", path)

    @property
    @pulumi.getter(name="maxLeases")
    def max_leases(self) -> Optional[pulumi.Input[int]]:
        """
        The maximum number of leases to be allowed by the quota
        rule. The `max_leases` must be positive.
        """
        return pulumi.get(self, "max_leases")

    @max_leases.setter
    def max_leases(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_leases", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the rate limit quota
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[str]]:
        """
        The namespace to provision the resource in.
        The value should not contain leading or trailing forward slashes.
        The `namespace` is always relative to the provider's configured namespace.
        *Available only for Vault Enterprise*.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        Path of the mount or namespace to apply the quota. A blank path configures a
        global rate limit quota. For example `namespace1/` adds a quota to a full namespace,
        `namespace1/auth/userpass` adds a `quota` to `userpass` in `namespace1`.
        Updating this field on an existing quota can have "moving" effects. For example, updating
        `auth/userpass` to `namespace1/auth/userpass` moves this quota from being a global mount quota to
        a namespace specific mount quota. **Note, namespaces are supported in Enterprise only.**
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)


class QuotaLeaseCount(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 max_leases: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manage lease count quotas which enforce the number of leases that can be created.
        A lease count quota can be created at the root level or defined on a namespace or mount by
        specifying a path when creating the quota.

        See [Vault's Documentation](https://www.vaultproject.io/docs/enterprise/lease-count-quotas) for more
        information.

        **Note** this feature is available only with Vault Enterprise.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_vault as vault

        global_ = vault.QuotaLeaseCount("global",
            max_leases=100,
            path="")
        ```

        ## Import

        Lease count quotas can be imported using their names

        ```sh
         $ pulumi import vault:index/quotaLeaseCount:QuotaLeaseCount global global
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] max_leases: The maximum number of leases to be allowed by the quota
               rule. The `max_leases` must be positive.
        :param pulumi.Input[str] name: Name of the rate limit quota
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured namespace.
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: Path of the mount or namespace to apply the quota. A blank path configures a
               global rate limit quota. For example `namespace1/` adds a quota to a full namespace,
               `namespace1/auth/userpass` adds a `quota` to `userpass` in `namespace1`.
               Updating this field on an existing quota can have "moving" effects. For example, updating
               `auth/userpass` to `namespace1/auth/userpass` moves this quota from being a global mount quota to
               a namespace specific mount quota. **Note, namespaces are supported in Enterprise only.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: QuotaLeaseCountArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manage lease count quotas which enforce the number of leases that can be created.
        A lease count quota can be created at the root level or defined on a namespace or mount by
        specifying a path when creating the quota.

        See [Vault's Documentation](https://www.vaultproject.io/docs/enterprise/lease-count-quotas) for more
        information.

        **Note** this feature is available only with Vault Enterprise.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_vault as vault

        global_ = vault.QuotaLeaseCount("global",
            max_leases=100,
            path="")
        ```

        ## Import

        Lease count quotas can be imported using their names

        ```sh
         $ pulumi import vault:index/quotaLeaseCount:QuotaLeaseCount global global
        ```

        :param str resource_name: The name of the resource.
        :param QuotaLeaseCountArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(QuotaLeaseCountArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 max_leases: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = QuotaLeaseCountArgs.__new__(QuotaLeaseCountArgs)

            if max_leases is None and not opts.urn:
                raise TypeError("Missing required property 'max_leases'")
            __props__.__dict__["max_leases"] = max_leases
            __props__.__dict__["name"] = name
            __props__.__dict__["namespace"] = namespace
            __props__.__dict__["path"] = path
        super(QuotaLeaseCount, __self__).__init__(
            'vault:index/quotaLeaseCount:QuotaLeaseCount',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            max_leases: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            namespace: Optional[pulumi.Input[str]] = None,
            path: Optional[pulumi.Input[str]] = None) -> 'QuotaLeaseCount':
        """
        Get an existing QuotaLeaseCount resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] max_leases: The maximum number of leases to be allowed by the quota
               rule. The `max_leases` must be positive.
        :param pulumi.Input[str] name: Name of the rate limit quota
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured namespace.
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: Path of the mount or namespace to apply the quota. A blank path configures a
               global rate limit quota. For example `namespace1/` adds a quota to a full namespace,
               `namespace1/auth/userpass` adds a `quota` to `userpass` in `namespace1`.
               Updating this field on an existing quota can have "moving" effects. For example, updating
               `auth/userpass` to `namespace1/auth/userpass` moves this quota from being a global mount quota to
               a namespace specific mount quota. **Note, namespaces are supported in Enterprise only.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _QuotaLeaseCountState.__new__(_QuotaLeaseCountState)

        __props__.__dict__["max_leases"] = max_leases
        __props__.__dict__["name"] = name
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["path"] = path
        return QuotaLeaseCount(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="maxLeases")
    def max_leases(self) -> pulumi.Output[int]:
        """
        The maximum number of leases to be allowed by the quota
        rule. The `max_leases` must be positive.
        """
        return pulumi.get(self, "max_leases")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the rate limit quota
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def namespace(self) -> pulumi.Output[Optional[str]]:
        """
        The namespace to provision the resource in.
        The value should not contain leading or trailing forward slashes.
        The `namespace` is always relative to the provider's configured namespace.
        *Available only for Vault Enterprise*.
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter
    def path(self) -> pulumi.Output[Optional[str]]:
        """
        Path of the mount or namespace to apply the quota. A blank path configures a
        global rate limit quota. For example `namespace1/` adds a quota to a full namespace,
        `namespace1/auth/userpass` adds a `quota` to `userpass` in `namespace1`.
        Updating this field on an existing quota can have "moving" effects. For example, updating
        `auth/userpass` to `namespace1/auth/userpass` moves this quota from being a global mount quota to
        a namespace specific mount quota. **Note, namespaces are supported in Enterprise only.**
        """
        return pulumi.get(self, "path")

