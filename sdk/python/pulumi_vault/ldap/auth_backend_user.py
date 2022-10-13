# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AuthBackendUserArgs', 'AuthBackendUser']

@pulumi.input_type
class AuthBackendUserArgs:
    def __init__(__self__, *,
                 username: pulumi.Input[str],
                 backend: Optional[pulumi.Input[str]] = None,
                 groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a AuthBackendUser resource.
        :param pulumi.Input[str] username: The LDAP username
        :param pulumi.Input[str] backend: Path to the authentication backend
        :param pulumi.Input[Sequence[pulumi.Input[str]]] groups: Override LDAP groups which should be granted to user
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policies: Policies which should be granted to user
        """
        pulumi.set(__self__, "username", username)
        if backend is not None:
            pulumi.set(__self__, "backend", backend)
        if groups is not None:
            pulumi.set(__self__, "groups", groups)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if policies is not None:
            pulumi.set(__self__, "policies", policies)

    @property
    @pulumi.getter
    def username(self) -> pulumi.Input[str]:
        """
        The LDAP username
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: pulumi.Input[str]):
        pulumi.set(self, "username", value)

    @property
    @pulumi.getter
    def backend(self) -> Optional[pulumi.Input[str]]:
        """
        Path to the authentication backend
        """
        return pulumi.get(self, "backend")

    @backend.setter
    def backend(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backend", value)

    @property
    @pulumi.getter
    def groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Override LDAP groups which should be granted to user
        """
        return pulumi.get(self, "groups")

    @groups.setter
    def groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "groups", value)

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
    def policies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Policies which should be granted to user
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "policies", value)


@pulumi.input_type
class _AuthBackendUserState:
    def __init__(__self__, *,
                 backend: Optional[pulumi.Input[str]] = None,
                 groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AuthBackendUser resources.
        :param pulumi.Input[str] backend: Path to the authentication backend
        :param pulumi.Input[Sequence[pulumi.Input[str]]] groups: Override LDAP groups which should be granted to user
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policies: Policies which should be granted to user
        :param pulumi.Input[str] username: The LDAP username
        """
        if backend is not None:
            pulumi.set(__self__, "backend", backend)
        if groups is not None:
            pulumi.set(__self__, "groups", groups)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if policies is not None:
            pulumi.set(__self__, "policies", policies)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def backend(self) -> Optional[pulumi.Input[str]]:
        """
        Path to the authentication backend
        """
        return pulumi.get(self, "backend")

    @backend.setter
    def backend(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backend", value)

    @property
    @pulumi.getter
    def groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Override LDAP groups which should be granted to user
        """
        return pulumi.get(self, "groups")

    @groups.setter
    def groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "groups", value)

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
    def policies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Policies which should be granted to user
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "policies", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        The LDAP username
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)


class AuthBackendUser(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backend: Optional[pulumi.Input[str]] = None,
                 groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource to create a user in an [LDAP auth backend within Vault](https://www.vaultproject.io/docs/auth/ldap.html).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_vault as vault

        ldap = vault.ldap.AuthBackend("ldap",
            path="ldap",
            url="ldaps://dc-01.example.org",
            userdn="OU=Users,OU=Accounts,DC=example,DC=org",
            userattr="sAMAccountName",
            upndomain="EXAMPLE.ORG",
            discoverdn=False,
            groupdn="OU=Groups,DC=example,DC=org",
            groupfilter="(&(objectClass=group)(member:1.2.840.113556.1.4.1941:={{.UserDN}}))")
        user = vault.ldap.AuthBackendUser("user",
            username="test-user",
            policies=[
                "dba",
                "sysops",
            ],
            backend=ldap.path)
        ```

        ## Import

        LDAP authentication backend users can be imported using the `path`, e.g.

        ```sh
         $ pulumi import vault:ldap/authBackendUser:AuthBackendUser foo auth/ldap/users/foo
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] backend: Path to the authentication backend
        :param pulumi.Input[Sequence[pulumi.Input[str]]] groups: Override LDAP groups which should be granted to user
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policies: Policies which should be granted to user
        :param pulumi.Input[str] username: The LDAP username
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AuthBackendUserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to create a user in an [LDAP auth backend within Vault](https://www.vaultproject.io/docs/auth/ldap.html).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_vault as vault

        ldap = vault.ldap.AuthBackend("ldap",
            path="ldap",
            url="ldaps://dc-01.example.org",
            userdn="OU=Users,OU=Accounts,DC=example,DC=org",
            userattr="sAMAccountName",
            upndomain="EXAMPLE.ORG",
            discoverdn=False,
            groupdn="OU=Groups,DC=example,DC=org",
            groupfilter="(&(objectClass=group)(member:1.2.840.113556.1.4.1941:={{.UserDN}}))")
        user = vault.ldap.AuthBackendUser("user",
            username="test-user",
            policies=[
                "dba",
                "sysops",
            ],
            backend=ldap.path)
        ```

        ## Import

        LDAP authentication backend users can be imported using the `path`, e.g.

        ```sh
         $ pulumi import vault:ldap/authBackendUser:AuthBackendUser foo auth/ldap/users/foo
        ```

        :param str resource_name: The name of the resource.
        :param AuthBackendUserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AuthBackendUserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backend: Optional[pulumi.Input[str]] = None,
                 groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AuthBackendUserArgs.__new__(AuthBackendUserArgs)

            __props__.__dict__["backend"] = backend
            __props__.__dict__["groups"] = groups
            __props__.__dict__["namespace"] = namespace
            __props__.__dict__["policies"] = policies
            if username is None and not opts.urn:
                raise TypeError("Missing required property 'username'")
            __props__.__dict__["username"] = username
        super(AuthBackendUser, __self__).__init__(
            'vault:ldap/authBackendUser:AuthBackendUser',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backend: Optional[pulumi.Input[str]] = None,
            groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            namespace: Optional[pulumi.Input[str]] = None,
            policies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            username: Optional[pulumi.Input[str]] = None) -> 'AuthBackendUser':
        """
        Get an existing AuthBackendUser resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] backend: Path to the authentication backend
        :param pulumi.Input[Sequence[pulumi.Input[str]]] groups: Override LDAP groups which should be granted to user
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policies: Policies which should be granted to user
        :param pulumi.Input[str] username: The LDAP username
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AuthBackendUserState.__new__(_AuthBackendUserState)

        __props__.__dict__["backend"] = backend
        __props__.__dict__["groups"] = groups
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["policies"] = policies
        __props__.__dict__["username"] = username
        return AuthBackendUser(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def backend(self) -> pulumi.Output[Optional[str]]:
        """
        Path to the authentication backend
        """
        return pulumi.get(self, "backend")

    @property
    @pulumi.getter
    def groups(self) -> pulumi.Output[Sequence[str]]:
        """
        Override LDAP groups which should be granted to user
        """
        return pulumi.get(self, "groups")

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
    def policies(self) -> pulumi.Output[Sequence[str]]:
        """
        Policies which should be granted to user
        """
        return pulumi.get(self, "policies")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[str]:
        """
        The LDAP username
        """
        return pulumi.get(self, "username")

