# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['EndpointArgs', 'Endpoint']

@pulumi.input_type
class EndpointArgs:
    def __init__(__self__, *,
                 data_json: pulumi.Input[str],
                 path: pulumi.Input[str],
                 disable_delete: Optional[pulumi.Input[bool]] = None,
                 disable_read: Optional[pulumi.Input[bool]] = None,
                 ignore_absent_fields: Optional[pulumi.Input[bool]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 write_fields: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Endpoint resource.
        :param pulumi.Input[str] data_json: String containing a JSON-encoded object that will be
               written to the given path as the secret data.
        :param pulumi.Input[str] path: The full logical path at which to write the given
               data. Consult each backend's documentation to see which endpoints
               support the `PUT` methods and to determine whether they also support
               `DELETE` and `GET`.
        :param pulumi.Input[bool] disable_delete: Don't attempt to delete the path from Vault if true
        :param pulumi.Input[bool] disable_read: True/false. Set this to true if your vault
               authentication is not able to read the data or if the endpoint does
               not support the `GET` method. Setting this to `true` will break drift
               detection. You should set this to `true` for endpoints that are
               write-only. Defaults to false.
        :param pulumi.Input[bool] ignore_absent_fields: When reading, disregard fields not present in data_json
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] write_fields: Top-level fields returned by write to persist in state
        """
        pulumi.set(__self__, "data_json", data_json)
        pulumi.set(__self__, "path", path)
        if disable_delete is not None:
            pulumi.set(__self__, "disable_delete", disable_delete)
        if disable_read is not None:
            pulumi.set(__self__, "disable_read", disable_read)
        if ignore_absent_fields is not None:
            pulumi.set(__self__, "ignore_absent_fields", ignore_absent_fields)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if write_fields is not None:
            pulumi.set(__self__, "write_fields", write_fields)

    @property
    @pulumi.getter(name="dataJson")
    def data_json(self) -> pulumi.Input[str]:
        """
        String containing a JSON-encoded object that will be
        written to the given path as the secret data.
        """
        return pulumi.get(self, "data_json")

    @data_json.setter
    def data_json(self, value: pulumi.Input[str]):
        pulumi.set(self, "data_json", value)

    @property
    @pulumi.getter
    def path(self) -> pulumi.Input[str]:
        """
        The full logical path at which to write the given
        data. Consult each backend's documentation to see which endpoints
        support the `PUT` methods and to determine whether they also support
        `DELETE` and `GET`.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: pulumi.Input[str]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter(name="disableDelete")
    def disable_delete(self) -> Optional[pulumi.Input[bool]]:
        """
        Don't attempt to delete the path from Vault if true
        """
        return pulumi.get(self, "disable_delete")

    @disable_delete.setter
    def disable_delete(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disable_delete", value)

    @property
    @pulumi.getter(name="disableRead")
    def disable_read(self) -> Optional[pulumi.Input[bool]]:
        """
        True/false. Set this to true if your vault
        authentication is not able to read the data or if the endpoint does
        not support the `GET` method. Setting this to `true` will break drift
        detection. You should set this to `true` for endpoints that are
        write-only. Defaults to false.
        """
        return pulumi.get(self, "disable_read")

    @disable_read.setter
    def disable_read(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disable_read", value)

    @property
    @pulumi.getter(name="ignoreAbsentFields")
    def ignore_absent_fields(self) -> Optional[pulumi.Input[bool]]:
        """
        When reading, disregard fields not present in data_json
        """
        return pulumi.get(self, "ignore_absent_fields")

    @ignore_absent_fields.setter
    def ignore_absent_fields(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ignore_absent_fields", value)

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
    @pulumi.getter(name="writeFields")
    def write_fields(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Top-level fields returned by write to persist in state
        """
        return pulumi.get(self, "write_fields")

    @write_fields.setter
    def write_fields(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "write_fields", value)


@pulumi.input_type
class _EndpointState:
    def __init__(__self__, *,
                 data_json: Optional[pulumi.Input[str]] = None,
                 disable_delete: Optional[pulumi.Input[bool]] = None,
                 disable_read: Optional[pulumi.Input[bool]] = None,
                 ignore_absent_fields: Optional[pulumi.Input[bool]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 write_data: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 write_data_json: Optional[pulumi.Input[str]] = None,
                 write_fields: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Endpoint resources.
        :param pulumi.Input[str] data_json: String containing a JSON-encoded object that will be
               written to the given path as the secret data.
        :param pulumi.Input[bool] disable_delete: Don't attempt to delete the path from Vault if true
        :param pulumi.Input[bool] disable_read: True/false. Set this to true if your vault
               authentication is not able to read the data or if the endpoint does
               not support the `GET` method. Setting this to `true` will break drift
               detection. You should set this to `true` for endpoints that are
               write-only. Defaults to false.
        :param pulumi.Input[bool] ignore_absent_fields: When reading, disregard fields not present in data_json
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: The full logical path at which to write the given
               data. Consult each backend's documentation to see which endpoints
               support the `PUT` methods and to determine whether they also support
               `DELETE` and `GET`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] write_data: Map of strings returned by write operation
        :param pulumi.Input[str] write_data_json: JSON data returned by write operation
        :param pulumi.Input[Sequence[pulumi.Input[str]]] write_fields: Top-level fields returned by write to persist in state
        """
        if data_json is not None:
            pulumi.set(__self__, "data_json", data_json)
        if disable_delete is not None:
            pulumi.set(__self__, "disable_delete", disable_delete)
        if disable_read is not None:
            pulumi.set(__self__, "disable_read", disable_read)
        if ignore_absent_fields is not None:
            pulumi.set(__self__, "ignore_absent_fields", ignore_absent_fields)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if write_data is not None:
            pulumi.set(__self__, "write_data", write_data)
        if write_data_json is not None:
            pulumi.set(__self__, "write_data_json", write_data_json)
        if write_fields is not None:
            pulumi.set(__self__, "write_fields", write_fields)

    @property
    @pulumi.getter(name="dataJson")
    def data_json(self) -> Optional[pulumi.Input[str]]:
        """
        String containing a JSON-encoded object that will be
        written to the given path as the secret data.
        """
        return pulumi.get(self, "data_json")

    @data_json.setter
    def data_json(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "data_json", value)

    @property
    @pulumi.getter(name="disableDelete")
    def disable_delete(self) -> Optional[pulumi.Input[bool]]:
        """
        Don't attempt to delete the path from Vault if true
        """
        return pulumi.get(self, "disable_delete")

    @disable_delete.setter
    def disable_delete(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disable_delete", value)

    @property
    @pulumi.getter(name="disableRead")
    def disable_read(self) -> Optional[pulumi.Input[bool]]:
        """
        True/false. Set this to true if your vault
        authentication is not able to read the data or if the endpoint does
        not support the `GET` method. Setting this to `true` will break drift
        detection. You should set this to `true` for endpoints that are
        write-only. Defaults to false.
        """
        return pulumi.get(self, "disable_read")

    @disable_read.setter
    def disable_read(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disable_read", value)

    @property
    @pulumi.getter(name="ignoreAbsentFields")
    def ignore_absent_fields(self) -> Optional[pulumi.Input[bool]]:
        """
        When reading, disregard fields not present in data_json
        """
        return pulumi.get(self, "ignore_absent_fields")

    @ignore_absent_fields.setter
    def ignore_absent_fields(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ignore_absent_fields", value)

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
        The full logical path at which to write the given
        data. Consult each backend's documentation to see which endpoints
        support the `PUT` methods and to determine whether they also support
        `DELETE` and `GET`.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter(name="writeData")
    def write_data(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of strings returned by write operation
        """
        return pulumi.get(self, "write_data")

    @write_data.setter
    def write_data(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "write_data", value)

    @property
    @pulumi.getter(name="writeDataJson")
    def write_data_json(self) -> Optional[pulumi.Input[str]]:
        """
        JSON data returned by write operation
        """
        return pulumi.get(self, "write_data_json")

    @write_data_json.setter
    def write_data_json(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "write_data_json", value)

    @property
    @pulumi.getter(name="writeFields")
    def write_fields(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Top-level fields returned by write to persist in state
        """
        return pulumi.get(self, "write_fields")

    @write_fields.setter
    def write_fields(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "write_fields", value)


class Endpoint(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_json: Optional[pulumi.Input[str]] = None,
                 disable_delete: Optional[pulumi.Input[bool]] = None,
                 disable_read: Optional[pulumi.Input[bool]] = None,
                 ignore_absent_fields: Optional[pulumi.Input[bool]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 write_fields: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        ## Required Vault Capabilities

        Use of this resource requires the `create` or `update` capability
        (depending on whether the resource already exists) on the given path. If
        `disable_delete` is false, the `delete` capbility is also required. If
        `disable_delete` is false, the `read` capbility is required.

        ## Import

        Import is not supported for this resource.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] data_json: String containing a JSON-encoded object that will be
               written to the given path as the secret data.
        :param pulumi.Input[bool] disable_delete: Don't attempt to delete the path from Vault if true
        :param pulumi.Input[bool] disable_read: True/false. Set this to true if your vault
               authentication is not able to read the data or if the endpoint does
               not support the `GET` method. Setting this to `true` will break drift
               detection. You should set this to `true` for endpoints that are
               write-only. Defaults to false.
        :param pulumi.Input[bool] ignore_absent_fields: When reading, disregard fields not present in data_json
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: The full logical path at which to write the given
               data. Consult each backend's documentation to see which endpoints
               support the `PUT` methods and to determine whether they also support
               `DELETE` and `GET`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] write_fields: Top-level fields returned by write to persist in state
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EndpointArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Required Vault Capabilities

        Use of this resource requires the `create` or `update` capability
        (depending on whether the resource already exists) on the given path. If
        `disable_delete` is false, the `delete` capbility is also required. If
        `disable_delete` is false, the `read` capbility is required.

        ## Import

        Import is not supported for this resource.

        :param str resource_name: The name of the resource.
        :param EndpointArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EndpointArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_json: Optional[pulumi.Input[str]] = None,
                 disable_delete: Optional[pulumi.Input[bool]] = None,
                 disable_read: Optional[pulumi.Input[bool]] = None,
                 ignore_absent_fields: Optional[pulumi.Input[bool]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 write_fields: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EndpointArgs.__new__(EndpointArgs)

            if data_json is None and not opts.urn:
                raise TypeError("Missing required property 'data_json'")
            __props__.__dict__["data_json"] = None if data_json is None else pulumi.Output.secret(data_json)
            __props__.__dict__["disable_delete"] = disable_delete
            __props__.__dict__["disable_read"] = disable_read
            __props__.__dict__["ignore_absent_fields"] = ignore_absent_fields
            __props__.__dict__["namespace"] = namespace
            if path is None and not opts.urn:
                raise TypeError("Missing required property 'path'")
            __props__.__dict__["path"] = path
            __props__.__dict__["write_fields"] = write_fields
            __props__.__dict__["write_data"] = None
            __props__.__dict__["write_data_json"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["dataJson"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Endpoint, __self__).__init__(
            'vault:generic/endpoint:Endpoint',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            data_json: Optional[pulumi.Input[str]] = None,
            disable_delete: Optional[pulumi.Input[bool]] = None,
            disable_read: Optional[pulumi.Input[bool]] = None,
            ignore_absent_fields: Optional[pulumi.Input[bool]] = None,
            namespace: Optional[pulumi.Input[str]] = None,
            path: Optional[pulumi.Input[str]] = None,
            write_data: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            write_data_json: Optional[pulumi.Input[str]] = None,
            write_fields: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'Endpoint':
        """
        Get an existing Endpoint resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] data_json: String containing a JSON-encoded object that will be
               written to the given path as the secret data.
        :param pulumi.Input[bool] disable_delete: Don't attempt to delete the path from Vault if true
        :param pulumi.Input[bool] disable_read: True/false. Set this to true if your vault
               authentication is not able to read the data or if the endpoint does
               not support the `GET` method. Setting this to `true` will break drift
               detection. You should set this to `true` for endpoints that are
               write-only. Defaults to false.
        :param pulumi.Input[bool] ignore_absent_fields: When reading, disregard fields not present in data_json
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: The full logical path at which to write the given
               data. Consult each backend's documentation to see which endpoints
               support the `PUT` methods and to determine whether they also support
               `DELETE` and `GET`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] write_data: Map of strings returned by write operation
        :param pulumi.Input[str] write_data_json: JSON data returned by write operation
        :param pulumi.Input[Sequence[pulumi.Input[str]]] write_fields: Top-level fields returned by write to persist in state
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EndpointState.__new__(_EndpointState)

        __props__.__dict__["data_json"] = data_json
        __props__.__dict__["disable_delete"] = disable_delete
        __props__.__dict__["disable_read"] = disable_read
        __props__.__dict__["ignore_absent_fields"] = ignore_absent_fields
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["path"] = path
        __props__.__dict__["write_data"] = write_data
        __props__.__dict__["write_data_json"] = write_data_json
        __props__.__dict__["write_fields"] = write_fields
        return Endpoint(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dataJson")
    def data_json(self) -> pulumi.Output[str]:
        """
        String containing a JSON-encoded object that will be
        written to the given path as the secret data.
        """
        return pulumi.get(self, "data_json")

    @property
    @pulumi.getter(name="disableDelete")
    def disable_delete(self) -> pulumi.Output[Optional[bool]]:
        """
        Don't attempt to delete the path from Vault if true
        """
        return pulumi.get(self, "disable_delete")

    @property
    @pulumi.getter(name="disableRead")
    def disable_read(self) -> pulumi.Output[Optional[bool]]:
        """
        True/false. Set this to true if your vault
        authentication is not able to read the data or if the endpoint does
        not support the `GET` method. Setting this to `true` will break drift
        detection. You should set this to `true` for endpoints that are
        write-only. Defaults to false.
        """
        return pulumi.get(self, "disable_read")

    @property
    @pulumi.getter(name="ignoreAbsentFields")
    def ignore_absent_fields(self) -> pulumi.Output[Optional[bool]]:
        """
        When reading, disregard fields not present in data_json
        """
        return pulumi.get(self, "ignore_absent_fields")

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
        The full logical path at which to write the given
        data. Consult each backend's documentation to see which endpoints
        support the `PUT` methods and to determine whether they also support
        `DELETE` and `GET`.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter(name="writeData")
    def write_data(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of strings returned by write operation
        """
        return pulumi.get(self, "write_data")

    @property
    @pulumi.getter(name="writeDataJson")
    def write_data_json(self) -> pulumi.Output[str]:
        """
        JSON data returned by write operation
        """
        return pulumi.get(self, "write_data_json")

    @property
    @pulumi.getter(name="writeFields")
    def write_fields(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Top-level fields returned by write to persist in state
        """
        return pulumi.get(self, "write_fields")

