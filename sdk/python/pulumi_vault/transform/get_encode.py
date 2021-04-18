# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetEncodeResult',
    'AwaitableGetEncodeResult',
    'get_encode',
]

@pulumi.output_type
class GetEncodeResult:
    """
    A collection of values returned by getEncode.
    """
    def __init__(__self__, batch_inputs=None, batch_results=None, encoded_value=None, id=None, path=None, role_name=None, transformation=None, tweak=None, value=None):
        if batch_inputs and not isinstance(batch_inputs, list):
            raise TypeError("Expected argument 'batch_inputs' to be a list")
        pulumi.set(__self__, "batch_inputs", batch_inputs)
        if batch_results and not isinstance(batch_results, list):
            raise TypeError("Expected argument 'batch_results' to be a list")
        pulumi.set(__self__, "batch_results", batch_results)
        if encoded_value and not isinstance(encoded_value, str):
            raise TypeError("Expected argument 'encoded_value' to be a str")
        pulumi.set(__self__, "encoded_value", encoded_value)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if path and not isinstance(path, str):
            raise TypeError("Expected argument 'path' to be a str")
        pulumi.set(__self__, "path", path)
        if role_name and not isinstance(role_name, str):
            raise TypeError("Expected argument 'role_name' to be a str")
        pulumi.set(__self__, "role_name", role_name)
        if transformation and not isinstance(transformation, str):
            raise TypeError("Expected argument 'transformation' to be a str")
        pulumi.set(__self__, "transformation", transformation)
        if tweak and not isinstance(tweak, str):
            raise TypeError("Expected argument 'tweak' to be a str")
        pulumi.set(__self__, "tweak", tweak)
        if value and not isinstance(value, str):
            raise TypeError("Expected argument 'value' to be a str")
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter(name="batchInputs")
    def batch_inputs(self) -> Optional[Sequence[Mapping[str, Any]]]:
        return pulumi.get(self, "batch_inputs")

    @property
    @pulumi.getter(name="batchResults")
    def batch_results(self) -> Sequence[Mapping[str, Any]]:
        return pulumi.get(self, "batch_results")

    @property
    @pulumi.getter(name="encodedValue")
    def encoded_value(self) -> str:
        return pulumi.get(self, "encoded_value")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def path(self) -> str:
        return pulumi.get(self, "path")

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> str:
        return pulumi.get(self, "role_name")

    @property
    @pulumi.getter
    def transformation(self) -> Optional[str]:
        return pulumi.get(self, "transformation")

    @property
    @pulumi.getter
    def tweak(self) -> Optional[str]:
        return pulumi.get(self, "tweak")

    @property
    @pulumi.getter
    def value(self) -> Optional[str]:
        return pulumi.get(self, "value")


class AwaitableGetEncodeResult(GetEncodeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEncodeResult(
            batch_inputs=self.batch_inputs,
            batch_results=self.batch_results,
            encoded_value=self.encoded_value,
            id=self.id,
            path=self.path,
            role_name=self.role_name,
            transformation=self.transformation,
            tweak=self.tweak,
            value=self.value)


def get_encode(batch_inputs: Optional[Sequence[Mapping[str, Any]]] = None,
               batch_results: Optional[Sequence[Mapping[str, Any]]] = None,
               encoded_value: Optional[str] = None,
               path: Optional[str] = None,
               role_name: Optional[str] = None,
               transformation: Optional[str] = None,
               tweak: Optional[str] = None,
               value: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEncodeResult:
    """
    This data source supports the "/transform/encode/{role_name}" Vault endpoint.

    It encodes the provided value using a named role.


    :param Sequence[Mapping[str, Any]] batch_inputs: Specifies a list of items to be encoded in a single batch. If this parameter is set, the parameters 'value', 'transformation' and 'tweak' will be ignored. Each batch item within the list can specify these parameters instead.
    :param Sequence[Mapping[str, Any]] batch_results: The result of encoding a batch.
    :param str encoded_value: The result of encoding a value.
    :param str path: Path to where the back-end is mounted within Vault.
    :param str role_name: The name of the role.
    :param str transformation: The transformation to perform. If no value is provided and the role contains a single transformation, this value will be inferred from the role.
    :param str tweak: The tweak value to use. Only applicable for FPE transformations
    :param str value: The value in which to encode.
    """
    __args__ = dict()
    __args__['batchInputs'] = batch_inputs
    __args__['batchResults'] = batch_results
    __args__['encodedValue'] = encoded_value
    __args__['path'] = path
    __args__['roleName'] = role_name
    __args__['transformation'] = transformation
    __args__['tweak'] = tweak
    __args__['value'] = value
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('vault:transform/getEncode:getEncode', __args__, opts=opts, typ=GetEncodeResult).value

    return AwaitableGetEncodeResult(
        batch_inputs=__ret__.batch_inputs,
        batch_results=__ret__.batch_results,
        encoded_value=__ret__.encoded_value,
        id=__ret__.id,
        path=__ret__.path,
        role_name=__ret__.role_name,
        transformation=__ret__.transformation,
        tweak=__ret__.tweak,
        value=__ret__.value)
