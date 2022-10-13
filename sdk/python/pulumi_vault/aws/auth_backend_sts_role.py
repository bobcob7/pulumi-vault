# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AuthBackendStsRoleArgs', 'AuthBackendStsRole']

@pulumi.input_type
class AuthBackendStsRoleArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 sts_role: pulumi.Input[str],
                 backend: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AuthBackendStsRole resource.
        :param pulumi.Input[str] account_id: The AWS account ID to configure the STS role for.
        :param pulumi.Input[str] sts_role: The STS role to assume when verifying requests made
               by EC2 instances in the account specified by `account_id`.
        :param pulumi.Input[str] backend: The path the AWS auth backend being configured was
               mounted at.  Defaults to `aws`.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "sts_role", sts_role)
        if backend is not None:
            pulumi.set(__self__, "backend", backend)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The AWS account ID to configure the STS role for.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="stsRole")
    def sts_role(self) -> pulumi.Input[str]:
        """
        The STS role to assume when verifying requests made
        by EC2 instances in the account specified by `account_id`.
        """
        return pulumi.get(self, "sts_role")

    @sts_role.setter
    def sts_role(self, value: pulumi.Input[str]):
        pulumi.set(self, "sts_role", value)

    @property
    @pulumi.getter
    def backend(self) -> Optional[pulumi.Input[str]]:
        """
        The path the AWS auth backend being configured was
        mounted at.  Defaults to `aws`.
        """
        return pulumi.get(self, "backend")

    @backend.setter
    def backend(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backend", value)

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


@pulumi.input_type
class _AuthBackendStsRoleState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 backend: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 sts_role: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AuthBackendStsRole resources.
        :param pulumi.Input[str] account_id: The AWS account ID to configure the STS role for.
        :param pulumi.Input[str] backend: The path the AWS auth backend being configured was
               mounted at.  Defaults to `aws`.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] sts_role: The STS role to assume when verifying requests made
               by EC2 instances in the account specified by `account_id`.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if backend is not None:
            pulumi.set(__self__, "backend", backend)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if sts_role is not None:
            pulumi.set(__self__, "sts_role", sts_role)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS account ID to configure the STS role for.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def backend(self) -> Optional[pulumi.Input[str]]:
        """
        The path the AWS auth backend being configured was
        mounted at.  Defaults to `aws`.
        """
        return pulumi.get(self, "backend")

    @backend.setter
    def backend(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backend", value)

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
    @pulumi.getter(name="stsRole")
    def sts_role(self) -> Optional[pulumi.Input[str]]:
        """
        The STS role to assume when verifying requests made
        by EC2 instances in the account specified by `account_id`.
        """
        return pulumi.get(self, "sts_role")

    @sts_role.setter
    def sts_role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sts_role", value)


class AuthBackendStsRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 backend: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 sts_role: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_vault as vault

        aws = vault.AuthBackend("aws", type="aws")
        role = vault.aws.AuthBackendStsRole("role",
            backend=aws.path,
            account_id="1234567890",
            sts_role="arn:aws:iam::1234567890:role/my-role")
        ```

        ## Import

        AWS auth backend STS roles can be imported using `auth/`, the `backend` path, `/config/sts/`, and the `account_id` e.g.

        ```sh
         $ pulumi import vault:aws/authBackendStsRole:AuthBackendStsRole example auth/aws/config/sts/1234567890
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The AWS account ID to configure the STS role for.
        :param pulumi.Input[str] backend: The path the AWS auth backend being configured was
               mounted at.  Defaults to `aws`.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] sts_role: The STS role to assume when verifying requests made
               by EC2 instances in the account specified by `account_id`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AuthBackendStsRoleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_vault as vault

        aws = vault.AuthBackend("aws", type="aws")
        role = vault.aws.AuthBackendStsRole("role",
            backend=aws.path,
            account_id="1234567890",
            sts_role="arn:aws:iam::1234567890:role/my-role")
        ```

        ## Import

        AWS auth backend STS roles can be imported using `auth/`, the `backend` path, `/config/sts/`, and the `account_id` e.g.

        ```sh
         $ pulumi import vault:aws/authBackendStsRole:AuthBackendStsRole example auth/aws/config/sts/1234567890
        ```

        :param str resource_name: The name of the resource.
        :param AuthBackendStsRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AuthBackendStsRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 backend: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 sts_role: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AuthBackendStsRoleArgs.__new__(AuthBackendStsRoleArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["backend"] = backend
            __props__.__dict__["namespace"] = namespace
            if sts_role is None and not opts.urn:
                raise TypeError("Missing required property 'sts_role'")
            __props__.__dict__["sts_role"] = sts_role
        super(AuthBackendStsRole, __self__).__init__(
            'vault:aws/authBackendStsRole:AuthBackendStsRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            backend: Optional[pulumi.Input[str]] = None,
            namespace: Optional[pulumi.Input[str]] = None,
            sts_role: Optional[pulumi.Input[str]] = None) -> 'AuthBackendStsRole':
        """
        Get an existing AuthBackendStsRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The AWS account ID to configure the STS role for.
        :param pulumi.Input[str] backend: The path the AWS auth backend being configured was
               mounted at.  Defaults to `aws`.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] sts_role: The STS role to assume when verifying requests made
               by EC2 instances in the account specified by `account_id`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AuthBackendStsRoleState.__new__(_AuthBackendStsRoleState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["backend"] = backend
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["sts_role"] = sts_role
        return AuthBackendStsRole(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The AWS account ID to configure the STS role for.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def backend(self) -> pulumi.Output[Optional[str]]:
        """
        The path the AWS auth backend being configured was
        mounted at.  Defaults to `aws`.
        """
        return pulumi.get(self, "backend")

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
    @pulumi.getter(name="stsRole")
    def sts_role(self) -> pulumi.Output[str]:
        """
        The STS role to assume when verifying requests made
        by EC2 instances in the account specified by `account_id`.
        """
        return pulumi.get(self, "sts_role")

