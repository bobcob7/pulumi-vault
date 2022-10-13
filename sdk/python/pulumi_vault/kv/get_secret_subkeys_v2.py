# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetSecretSubkeysV2Result',
    'AwaitableGetSecretSubkeysV2Result',
    'get_secret_subkeys_v2',
    'get_secret_subkeys_v2_output',
]

@pulumi.output_type
class GetSecretSubkeysV2Result:
    """
    A collection of values returned by getSecretSubkeysV2.
    """
    def __init__(__self__, data=None, data_json=None, depth=None, id=None, mount=None, name=None, namespace=None, path=None, version=None):
        if data and not isinstance(data, dict):
            raise TypeError("Expected argument 'data' to be a dict")
        pulumi.set(__self__, "data", data)
        if data_json and not isinstance(data_json, str):
            raise TypeError("Expected argument 'data_json' to be a str")
        pulumi.set(__self__, "data_json", data_json)
        if depth and not isinstance(depth, int):
            raise TypeError("Expected argument 'depth' to be a int")
        pulumi.set(__self__, "depth", depth)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if mount and not isinstance(mount, str):
            raise TypeError("Expected argument 'mount' to be a str")
        pulumi.set(__self__, "mount", mount)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if namespace and not isinstance(namespace, str):
            raise TypeError("Expected argument 'namespace' to be a str")
        pulumi.set(__self__, "namespace", namespace)
        if path and not isinstance(path, str):
            raise TypeError("Expected argument 'path' to be a str")
        pulumi.set(__self__, "path", path)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def data(self) -> Mapping[str, Any]:
        return pulumi.get(self, "data")

    @property
    @pulumi.getter(name="dataJson")
    def data_json(self) -> str:
        return pulumi.get(self, "data_json")

    @property
    @pulumi.getter
    def depth(self) -> Optional[int]:
        return pulumi.get(self, "depth")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def mount(self) -> str:
        return pulumi.get(self, "mount")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def namespace(self) -> Optional[str]:
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter
    def path(self) -> str:
        return pulumi.get(self, "path")

    @property
    @pulumi.getter
    def version(self) -> Optional[int]:
        return pulumi.get(self, "version")


class AwaitableGetSecretSubkeysV2Result(GetSecretSubkeysV2Result):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSecretSubkeysV2Result(
            data=self.data,
            data_json=self.data_json,
            depth=self.depth,
            id=self.id,
            mount=self.mount,
            name=self.name,
            namespace=self.namespace,
            path=self.path,
            version=self.version)


def get_secret_subkeys_v2(depth: Optional[int] = None,
                          mount: Optional[str] = None,
                          name: Optional[str] = None,
                          namespace: Optional[str] = None,
                          version: Optional[int] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSecretSubkeysV2Result:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['depth'] = depth
    __args__['mount'] = mount
    __args__['name'] = name
    __args__['namespace'] = namespace
    __args__['version'] = version
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('vault:kv/getSecretSubkeysV2:getSecretSubkeysV2', __args__, opts=opts, typ=GetSecretSubkeysV2Result).value

    return AwaitableGetSecretSubkeysV2Result(
        data=__ret__.data,
        data_json=__ret__.data_json,
        depth=__ret__.depth,
        id=__ret__.id,
        mount=__ret__.mount,
        name=__ret__.name,
        namespace=__ret__.namespace,
        path=__ret__.path,
        version=__ret__.version)


@_utilities.lift_output_func(get_secret_subkeys_v2)
def get_secret_subkeys_v2_output(depth: Optional[pulumi.Input[Optional[int]]] = None,
                                 mount: Optional[pulumi.Input[str]] = None,
                                 name: Optional[pulumi.Input[str]] = None,
                                 namespace: Optional[pulumi.Input[Optional[str]]] = None,
                                 version: Optional[pulumi.Input[Optional[int]]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSecretSubkeysV2Result]:
    """
    Use this data source to access information about an existing resource.
    """
    ...
