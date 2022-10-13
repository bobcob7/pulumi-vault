# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['AuthBackendArgs', 'AuthBackend']

@pulumi.input_type
class AuthBackendArgs:
    def __init__(__self__, *,
                 type: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 disable_remount: Optional[pulumi.Input[bool]] = None,
                 local: Optional[pulumi.Input[bool]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 tune: Optional[pulumi.Input['AuthBackendTuneArgs']] = None):
        """
        The set of arguments for constructing a AuthBackend resource.
        :param pulumi.Input[str] type: The name of the auth method type.
        :param pulumi.Input[str] description: A description of the auth method.
        :param pulumi.Input[bool] disable_remount: If set, opts out of mount migration on path updates.
               See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        :param pulumi.Input[bool] local: Specifies if the auth method is local only.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: The path to mount the auth method — this defaults to the name of the type.
        :param pulumi.Input['AuthBackendTuneArgs'] tune: Extra configuration block. Structure is documented below.
        """
        pulumi.set(__self__, "type", type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disable_remount is not None:
            pulumi.set(__self__, "disable_remount", disable_remount)
        if local is not None:
            pulumi.set(__self__, "local", local)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if tune is not None:
            pulumi.set(__self__, "tune", tune)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The name of the auth method type.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the auth method.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="disableRemount")
    def disable_remount(self) -> Optional[pulumi.Input[bool]]:
        """
        If set, opts out of mount migration on path updates.
        See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        """
        return pulumi.get(self, "disable_remount")

    @disable_remount.setter
    def disable_remount(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disable_remount", value)

    @property
    @pulumi.getter
    def local(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies if the auth method is local only.
        """
        return pulumi.get(self, "local")

    @local.setter
    def local(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "local", value)

    @property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[str]]:
        """
        The namespace to provision the resource in.
        The value should not contain leading or trailing forward slashes.
        The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
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
        The path to mount the auth method — this defaults to the name of the type.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter
    def tune(self) -> Optional[pulumi.Input['AuthBackendTuneArgs']]:
        """
        Extra configuration block. Structure is documented below.
        """
        return pulumi.get(self, "tune")

    @tune.setter
    def tune(self, value: Optional[pulumi.Input['AuthBackendTuneArgs']]):
        pulumi.set(self, "tune", value)


@pulumi.input_type
class _AuthBackendState:
    def __init__(__self__, *,
                 accessor: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disable_remount: Optional[pulumi.Input[bool]] = None,
                 local: Optional[pulumi.Input[bool]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 tune: Optional[pulumi.Input['AuthBackendTuneArgs']] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AuthBackend resources.
        :param pulumi.Input[str] accessor: The accessor for this auth method
        :param pulumi.Input[str] description: A description of the auth method.
        :param pulumi.Input[bool] disable_remount: If set, opts out of mount migration on path updates.
               See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        :param pulumi.Input[bool] local: Specifies if the auth method is local only.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: The path to mount the auth method — this defaults to the name of the type.
        :param pulumi.Input['AuthBackendTuneArgs'] tune: Extra configuration block. Structure is documented below.
        :param pulumi.Input[str] type: The name of the auth method type.
        """
        if accessor is not None:
            pulumi.set(__self__, "accessor", accessor)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disable_remount is not None:
            pulumi.set(__self__, "disable_remount", disable_remount)
        if local is not None:
            pulumi.set(__self__, "local", local)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if tune is not None:
            pulumi.set(__self__, "tune", tune)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def accessor(self) -> Optional[pulumi.Input[str]]:
        """
        The accessor for this auth method
        """
        return pulumi.get(self, "accessor")

    @accessor.setter
    def accessor(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "accessor", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the auth method.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="disableRemount")
    def disable_remount(self) -> Optional[pulumi.Input[bool]]:
        """
        If set, opts out of mount migration on path updates.
        See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        """
        return pulumi.get(self, "disable_remount")

    @disable_remount.setter
    def disable_remount(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disable_remount", value)

    @property
    @pulumi.getter
    def local(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies if the auth method is local only.
        """
        return pulumi.get(self, "local")

    @local.setter
    def local(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "local", value)

    @property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[str]]:
        """
        The namespace to provision the resource in.
        The value should not contain leading or trailing forward slashes.
        The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
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
        The path to mount the auth method — this defaults to the name of the type.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter
    def tune(self) -> Optional[pulumi.Input['AuthBackendTuneArgs']]:
        """
        Extra configuration block. Structure is documented below.
        """
        return pulumi.get(self, "tune")

    @tune.setter
    def tune(self, value: Optional[pulumi.Input['AuthBackendTuneArgs']]):
        pulumi.set(self, "tune", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the auth method type.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class AuthBackend(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disable_remount: Optional[pulumi.Input[bool]] = None,
                 local: Optional[pulumi.Input[bool]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 tune: Optional[pulumi.Input[pulumi.InputType['AuthBackendTuneArgs']]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        Auth methods can be imported using the `path`, e.g.

        ```sh
         $ pulumi import vault:index/authBackend:AuthBackend example github
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A description of the auth method.
        :param pulumi.Input[bool] disable_remount: If set, opts out of mount migration on path updates.
               See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        :param pulumi.Input[bool] local: Specifies if the auth method is local only.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: The path to mount the auth method — this defaults to the name of the type.
        :param pulumi.Input[pulumi.InputType['AuthBackendTuneArgs']] tune: Extra configuration block. Structure is documented below.
        :param pulumi.Input[str] type: The name of the auth method type.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AuthBackendArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        Auth methods can be imported using the `path`, e.g.

        ```sh
         $ pulumi import vault:index/authBackend:AuthBackend example github
        ```

        :param str resource_name: The name of the resource.
        :param AuthBackendArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AuthBackendArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disable_remount: Optional[pulumi.Input[bool]] = None,
                 local: Optional[pulumi.Input[bool]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 tune: Optional[pulumi.Input[pulumi.InputType['AuthBackendTuneArgs']]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AuthBackendArgs.__new__(AuthBackendArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["disable_remount"] = disable_remount
            __props__.__dict__["local"] = local
            __props__.__dict__["namespace"] = namespace
            __props__.__dict__["path"] = path
            __props__.__dict__["tune"] = tune
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["accessor"] = None
        super(AuthBackend, __self__).__init__(
            'vault:index/authBackend:AuthBackend',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            accessor: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            disable_remount: Optional[pulumi.Input[bool]] = None,
            local: Optional[pulumi.Input[bool]] = None,
            namespace: Optional[pulumi.Input[str]] = None,
            path: Optional[pulumi.Input[str]] = None,
            tune: Optional[pulumi.Input[pulumi.InputType['AuthBackendTuneArgs']]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'AuthBackend':
        """
        Get an existing AuthBackend resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accessor: The accessor for this auth method
        :param pulumi.Input[str] description: A description of the auth method.
        :param pulumi.Input[bool] disable_remount: If set, opts out of mount migration on path updates.
               See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        :param pulumi.Input[bool] local: Specifies if the auth method is local only.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: The path to mount the auth method — this defaults to the name of the type.
        :param pulumi.Input[pulumi.InputType['AuthBackendTuneArgs']] tune: Extra configuration block. Structure is documented below.
        :param pulumi.Input[str] type: The name of the auth method type.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AuthBackendState.__new__(_AuthBackendState)

        __props__.__dict__["accessor"] = accessor
        __props__.__dict__["description"] = description
        __props__.__dict__["disable_remount"] = disable_remount
        __props__.__dict__["local"] = local
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["path"] = path
        __props__.__dict__["tune"] = tune
        __props__.__dict__["type"] = type
        return AuthBackend(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def accessor(self) -> pulumi.Output[str]:
        """
        The accessor for this auth method
        """
        return pulumi.get(self, "accessor")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A description of the auth method.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="disableRemount")
    def disable_remount(self) -> pulumi.Output[Optional[bool]]:
        """
        If set, opts out of mount migration on path updates.
        See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        """
        return pulumi.get(self, "disable_remount")

    @property
    @pulumi.getter
    def local(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies if the auth method is local only.
        """
        return pulumi.get(self, "local")

    @property
    @pulumi.getter
    def namespace(self) -> pulumi.Output[Optional[str]]:
        """
        The namespace to provision the resource in.
        The value should not contain leading or trailing forward slashes.
        The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        *Available only for Vault Enterprise*.
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter
    def path(self) -> pulumi.Output[str]:
        """
        The path to mount the auth method — this defaults to the name of the type.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter
    def tune(self) -> pulumi.Output['outputs.AuthBackendTune']:
        """
        Extra configuration block. Structure is documented below.
        """
        return pulumi.get(self, "tune")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The name of the auth method type.
        """
        return pulumi.get(self, "type")

