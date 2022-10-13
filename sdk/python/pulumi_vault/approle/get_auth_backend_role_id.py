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
    'GetAuthBackendRoleIdResult',
    'AwaitableGetAuthBackendRoleIdResult',
    'get_auth_backend_role_id',
    'get_auth_backend_role_id_output',
]

@pulumi.output_type
class GetAuthBackendRoleIdResult:
    """
    A collection of values returned by getAuthBackendRoleId.
    """
    def __init__(__self__, backend=None, id=None, namespace=None, role_id=None, role_name=None):
        if backend and not isinstance(backend, str):
            raise TypeError("Expected argument 'backend' to be a str")
        pulumi.set(__self__, "backend", backend)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if namespace and not isinstance(namespace, str):
            raise TypeError("Expected argument 'namespace' to be a str")
        pulumi.set(__self__, "namespace", namespace)
        if role_id and not isinstance(role_id, str):
            raise TypeError("Expected argument 'role_id' to be a str")
        pulumi.set(__self__, "role_id", role_id)
        if role_name and not isinstance(role_name, str):
            raise TypeError("Expected argument 'role_name' to be a str")
        pulumi.set(__self__, "role_name", role_name)

    @property
    @pulumi.getter
    def backend(self) -> Optional[str]:
        return pulumi.get(self, "backend")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def namespace(self) -> Optional[str]:
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter(name="roleId")
    def role_id(self) -> str:
        """
        The RoleID of the role.
        """
        return pulumi.get(self, "role_id")

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> str:
        return pulumi.get(self, "role_name")


class AwaitableGetAuthBackendRoleIdResult(GetAuthBackendRoleIdResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAuthBackendRoleIdResult(
            backend=self.backend,
            id=self.id,
            namespace=self.namespace,
            role_id=self.role_id,
            role_name=self.role_name)


def get_auth_backend_role_id(backend: Optional[str] = None,
                             namespace: Optional[str] = None,
                             role_name: Optional[str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAuthBackendRoleIdResult:
    """
    Reads the Role ID of an AppRole from a Vault server.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_vault as vault

    role = vault.appRole.get_auth_backend_role_id(backend="my-approle-backend",
        role_name="my-role")
    pulumi.export("role-id", role.role_id)
    ```


    :param str backend: The unique name for the AppRole backend the role to
           retrieve a RoleID for resides in. Defaults to "approle".
    :param str namespace: The namespace of the target resource.
           The value should not contain leading or trailing forward slashes.
           The `namespace` is always relative to the provider's configured namespace.
           *Available only for Vault Enterprise*.
    :param str role_name: The name of the role to retrieve the Role ID for.
    """
    __args__ = dict()
    __args__['backend'] = backend
    __args__['namespace'] = namespace
    __args__['roleName'] = role_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('vault:appRole/getAuthBackendRoleId:getAuthBackendRoleId', __args__, opts=opts, typ=GetAuthBackendRoleIdResult).value

    return AwaitableGetAuthBackendRoleIdResult(
        backend=__ret__.backend,
        id=__ret__.id,
        namespace=__ret__.namespace,
        role_id=__ret__.role_id,
        role_name=__ret__.role_name)


@_utilities.lift_output_func(get_auth_backend_role_id)
def get_auth_backend_role_id_output(backend: Optional[pulumi.Input[Optional[str]]] = None,
                                    namespace: Optional[pulumi.Input[Optional[str]]] = None,
                                    role_name: Optional[pulumi.Input[str]] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAuthBackendRoleIdResult]:
    """
    Reads the Role ID of an AppRole from a Vault server.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_vault as vault

    role = vault.appRole.get_auth_backend_role_id(backend="my-approle-backend",
        role_name="my-role")
    pulumi.export("role-id", role.role_id)
    ```


    :param str backend: The unique name for the AppRole backend the role to
           retrieve a RoleID for resides in. Defaults to "approle".
    :param str namespace: The namespace of the target resource.
           The value should not contain leading or trailing forward slashes.
           The `namespace` is always relative to the provider's configured namespace.
           *Available only for Vault Enterprise*.
    :param str role_name: The name of the role to retrieve the Role ID for.
    """
    ...
