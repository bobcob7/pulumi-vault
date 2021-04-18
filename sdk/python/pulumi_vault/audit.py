# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AuditArgs', 'Audit']

@pulumi.input_type
class AuditArgs:
    def __init__(__self__, *,
                 options: pulumi.Input[Mapping[str, pulumi.Input[str]]],
                 type: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 local: Optional[pulumi.Input[bool]] = None,
                 path: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Audit resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] options: Configuration options to pass to the audit device itself.
        :param pulumi.Input[str] type: Type of the audit device, such as 'file'.
        :param pulumi.Input[str] description: Human-friendly description of the audit device.
        :param pulumi.Input[bool] local: Specifies if the audit device is a local only. Local audit devices are not replicated nor (if a secondary) removed by replication.
        :param pulumi.Input[str] path: The path to mount the audit device. This defaults to the type.
        """
        pulumi.set(__self__, "options", options)
        pulumi.set(__self__, "type", type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if local is not None:
            pulumi.set(__self__, "local", local)
        if path is not None:
            pulumi.set(__self__, "path", path)

    @property
    @pulumi.getter
    def options(self) -> pulumi.Input[Mapping[str, pulumi.Input[str]]]:
        """
        Configuration options to pass to the audit device itself.
        """
        return pulumi.get(self, "options")

    @options.setter
    def options(self, value: pulumi.Input[Mapping[str, pulumi.Input[str]]]):
        pulumi.set(self, "options", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Type of the audit device, such as 'file'.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Human-friendly description of the audit device.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def local(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies if the audit device is a local only. Local audit devices are not replicated nor (if a secondary) removed by replication.
        """
        return pulumi.get(self, "local")

    @local.setter
    def local(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "local", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        The path to mount the audit device. This defaults to the type.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)


@pulumi.input_type
class _AuditState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 local: Optional[pulumi.Input[bool]] = None,
                 options: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Audit resources.
        :param pulumi.Input[str] description: Human-friendly description of the audit device.
        :param pulumi.Input[bool] local: Specifies if the audit device is a local only. Local audit devices are not replicated nor (if a secondary) removed by replication.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] options: Configuration options to pass to the audit device itself.
        :param pulumi.Input[str] path: The path to mount the audit device. This defaults to the type.
        :param pulumi.Input[str] type: Type of the audit device, such as 'file'.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if local is not None:
            pulumi.set(__self__, "local", local)
        if options is not None:
            pulumi.set(__self__, "options", options)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Human-friendly description of the audit device.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def local(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies if the audit device is a local only. Local audit devices are not replicated nor (if a secondary) removed by replication.
        """
        return pulumi.get(self, "local")

    @local.setter
    def local(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "local", value)

    @property
    @pulumi.getter
    def options(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Configuration options to pass to the audit device itself.
        """
        return pulumi.get(self, "options")

    @options.setter
    def options(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "options", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        The path to mount the audit device. This defaults to the type.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the audit device, such as 'file'.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class Audit(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 local: Optional[pulumi.Input[bool]] = None,
                 options: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        ## Example Usage
        ### File Audit Device)

        ```python
        import pulumi
        import pulumi_vault as vault

        test = vault.Audit("test",
            options={
                "file_path": "C:/temp/audit.txt",
            },
            type="file")
        ```
        ### Socket Audit Device)

        ```python
        import pulumi
        import pulumi_vault as vault

        test = vault.Audit("test",
            local=False,
            options={
                "address": "127.0.0.1:8000",
                "description": "application x socket",
                "socket_type": "tcp",
            },
            path="app_socket",
            type="socket")
        ```

        ## Import

        Audit devices can be imported using the `path`, e.g.

        ```sh
         $ pulumi import vault:index/audit:Audit test syslog
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Human-friendly description of the audit device.
        :param pulumi.Input[bool] local: Specifies if the audit device is a local only. Local audit devices are not replicated nor (if a secondary) removed by replication.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] options: Configuration options to pass to the audit device itself.
        :param pulumi.Input[str] path: The path to mount the audit device. This defaults to the type.
        :param pulumi.Input[str] type: Type of the audit device, such as 'file'.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AuditArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage
        ### File Audit Device)

        ```python
        import pulumi
        import pulumi_vault as vault

        test = vault.Audit("test",
            options={
                "file_path": "C:/temp/audit.txt",
            },
            type="file")
        ```
        ### Socket Audit Device)

        ```python
        import pulumi
        import pulumi_vault as vault

        test = vault.Audit("test",
            local=False,
            options={
                "address": "127.0.0.1:8000",
                "description": "application x socket",
                "socket_type": "tcp",
            },
            path="app_socket",
            type="socket")
        ```

        ## Import

        Audit devices can be imported using the `path`, e.g.

        ```sh
         $ pulumi import vault:index/audit:Audit test syslog
        ```

        :param str resource_name: The name of the resource.
        :param AuditArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AuditArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 local: Optional[pulumi.Input[bool]] = None,
                 options: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
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
            __props__ = AuditArgs.__new__(AuditArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["local"] = local
            if options is None and not opts.urn:
                raise TypeError("Missing required property 'options'")
            __props__.__dict__["options"] = options
            __props__.__dict__["path"] = path
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        super(Audit, __self__).__init__(
            'vault:index/audit:Audit',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            local: Optional[pulumi.Input[bool]] = None,
            options: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            path: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'Audit':
        """
        Get an existing Audit resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Human-friendly description of the audit device.
        :param pulumi.Input[bool] local: Specifies if the audit device is a local only. Local audit devices are not replicated nor (if a secondary) removed by replication.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] options: Configuration options to pass to the audit device itself.
        :param pulumi.Input[str] path: The path to mount the audit device. This defaults to the type.
        :param pulumi.Input[str] type: Type of the audit device, such as 'file'.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AuditState.__new__(_AuditState)

        __props__.__dict__["description"] = description
        __props__.__dict__["local"] = local
        __props__.__dict__["options"] = options
        __props__.__dict__["path"] = path
        __props__.__dict__["type"] = type
        return Audit(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Human-friendly description of the audit device.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def local(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies if the audit device is a local only. Local audit devices are not replicated nor (if a secondary) removed by replication.
        """
        return pulumi.get(self, "local")

    @property
    @pulumi.getter
    def options(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Configuration options to pass to the audit device itself.
        """
        return pulumi.get(self, "options")

    @property
    @pulumi.getter
    def path(self) -> pulumi.Output[str]:
        """
        The path to mount the audit device. This defaults to the type.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of the audit device, such as 'file'.
        """
        return pulumi.get(self, "type")

