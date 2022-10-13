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
    'GetSecretsV2ListResult',
    'AwaitableGetSecretsV2ListResult',
    'get_secrets_v2_list',
    'get_secrets_v2_list_output',
]

@pulumi.output_type
class GetSecretsV2ListResult:
    """
    A collection of values returned by getSecretsV2List.
    """
    def __init__(__self__, id=None, mount=None, name=None, names=None, namespace=None, path=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if mount and not isinstance(mount, str):
            raise TypeError("Expected argument 'mount' to be a str")
        pulumi.set(__self__, "mount", mount)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if namespace and not isinstance(namespace, str):
            raise TypeError("Expected argument 'namespace' to be a str")
        pulumi.set(__self__, "namespace", namespace)
        if path and not isinstance(path, str):
            raise TypeError("Expected argument 'path' to be a str")
        pulumi.set(__self__, "path", path)

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
    def name(self) -> Optional[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        List of all secret names listed under the given path.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter
    def namespace(self) -> Optional[str]:
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter
    def path(self) -> str:
        """
        Full path where the KV-V2 secrets are listed.
        """
        return pulumi.get(self, "path")


class AwaitableGetSecretsV2ListResult(GetSecretsV2ListResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSecretsV2ListResult(
            id=self.id,
            mount=self.mount,
            name=self.name,
            names=self.names,
            namespace=self.namespace,
            path=self.path)


def get_secrets_v2_list(mount: Optional[str] = None,
                        name: Optional[str] = None,
                        namespace: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSecretsV2ListResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import json
    import pulumi_vault as vault

    kvv2 = vault.Mount("kvv2",
        path="kvv2",
        type="kv",
        options={
            "version": "2",
        },
        description="KV Version 2 secret engine mount")
    aws_secret = vault.kv.SecretV2("awsSecret",
        mount=kvv2.path,
        data_json=json.dumps({
            "zip": "zap",
        }))
    azure_secret = vault.kv.SecretV2("azureSecret",
        mount=kvv2.path,
        data_json=json.dumps({
            "foo": "bar",
        }))
    nested_secret = vault.kv.SecretV2("nestedSecret",
        mount=kvv2.path,
        data_json=json.dumps({
            "password": "test",
        }))
    secrets = vault.kv.get_secrets_v2_list_output(mount=kvv2.path)
    nested_secrets = kvv2.path.apply(lambda path: vault.kv.get_secrets_v2_list_output(mount=path,
        name=vault_kv_secret_v2["test_2"]["name"]))
    ```
    ## Required Vault Capabilities

    Use of this resource requires the `read` capability on the given path.


    :param str mount: Path where KV-V2 engine is mounted.
    :param str name: Full name of the secret. For a nested secret
           the name is the nested path excluding the mount and data
           prefix. For example, for a secret at `kvv2/data/foo/bar/baz`
           the name is `foo/bar/baz`.
    :param str namespace: The namespace of the target resource.
           The value should not contain leading or trailing forward slashes.
           The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
           *Available only for Vault Enterprise*.
    """
    __args__ = dict()
    __args__['mount'] = mount
    __args__['name'] = name
    __args__['namespace'] = namespace
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('vault:kv/getSecretsV2List:getSecretsV2List', __args__, opts=opts, typ=GetSecretsV2ListResult).value

    return AwaitableGetSecretsV2ListResult(
        id=__ret__.id,
        mount=__ret__.mount,
        name=__ret__.name,
        names=__ret__.names,
        namespace=__ret__.namespace,
        path=__ret__.path)


@_utilities.lift_output_func(get_secrets_v2_list)
def get_secrets_v2_list_output(mount: Optional[pulumi.Input[str]] = None,
                               name: Optional[pulumi.Input[Optional[str]]] = None,
                               namespace: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSecretsV2ListResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import json
    import pulumi_vault as vault

    kvv2 = vault.Mount("kvv2",
        path="kvv2",
        type="kv",
        options={
            "version": "2",
        },
        description="KV Version 2 secret engine mount")
    aws_secret = vault.kv.SecretV2("awsSecret",
        mount=kvv2.path,
        data_json=json.dumps({
            "zip": "zap",
        }))
    azure_secret = vault.kv.SecretV2("azureSecret",
        mount=kvv2.path,
        data_json=json.dumps({
            "foo": "bar",
        }))
    nested_secret = vault.kv.SecretV2("nestedSecret",
        mount=kvv2.path,
        data_json=json.dumps({
            "password": "test",
        }))
    secrets = vault.kv.get_secrets_v2_list_output(mount=kvv2.path)
    nested_secrets = kvv2.path.apply(lambda path: vault.kv.get_secrets_v2_list_output(mount=path,
        name=vault_kv_secret_v2["test_2"]["name"]))
    ```
    ## Required Vault Capabilities

    Use of this resource requires the `read` capability on the given path.


    :param str mount: Path where KV-V2 engine is mounted.
    :param str name: Full name of the secret. For a nested secret
           the name is the nested path excluding the mount and data
           prefix. For example, for a secret at `kvv2/data/foo/bar/baz`
           the name is `foo/bar/baz`.
    :param str namespace: The namespace of the target resource.
           The value should not contain leading or trailing forward slashes.
           The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
           *Available only for Vault Enterprise*.
    """
    ...
