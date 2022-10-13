# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['OidcKeyArgs', 'OidcKey']

@pulumi.input_type
class OidcKeyArgs:
    def __init__(__self__, *,
                 algorithm: Optional[pulumi.Input[str]] = None,
                 allowed_client_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 rotation_period: Optional[pulumi.Input[int]] = None,
                 verification_ttl: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a OidcKey resource.
        :param pulumi.Input[str] algorithm: Signing algorithm to use. Signing algorithm to use.
               Allowed values are: RS256 (default), RS384, RS512, ES256, ES384, ES512, EdDSA.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_client_ids: Array of role client ids allowed to use this key for signing. If empty, no roles are allowed. If "*", all roles are
               allowed.
        :param pulumi.Input[str] name: Name of the OIDC Key to create.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[int] rotation_period: How often to generate a new signing key in number of seconds
        :param pulumi.Input[int] verification_ttl: "Controls how long the public portion of a signing key will be
               available for verification after being rotated in seconds.
        """
        if algorithm is not None:
            pulumi.set(__self__, "algorithm", algorithm)
        if allowed_client_ids is not None:
            pulumi.set(__self__, "allowed_client_ids", allowed_client_ids)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if rotation_period is not None:
            pulumi.set(__self__, "rotation_period", rotation_period)
        if verification_ttl is not None:
            pulumi.set(__self__, "verification_ttl", verification_ttl)

    @property
    @pulumi.getter
    def algorithm(self) -> Optional[pulumi.Input[str]]:
        """
        Signing algorithm to use. Signing algorithm to use.
        Allowed values are: RS256 (default), RS384, RS512, ES256, ES384, ES512, EdDSA.
        """
        return pulumi.get(self, "algorithm")

    @algorithm.setter
    def algorithm(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "algorithm", value)

    @property
    @pulumi.getter(name="allowedClientIds")
    def allowed_client_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Array of role client ids allowed to use this key for signing. If empty, no roles are allowed. If "*", all roles are
        allowed.
        """
        return pulumi.get(self, "allowed_client_ids")

    @allowed_client_ids.setter
    def allowed_client_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_client_ids", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the OIDC Key to create.
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
        The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        *Available only for Vault Enterprise*.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace", value)

    @property
    @pulumi.getter(name="rotationPeriod")
    def rotation_period(self) -> Optional[pulumi.Input[int]]:
        """
        How often to generate a new signing key in number of seconds
        """
        return pulumi.get(self, "rotation_period")

    @rotation_period.setter
    def rotation_period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "rotation_period", value)

    @property
    @pulumi.getter(name="verificationTtl")
    def verification_ttl(self) -> Optional[pulumi.Input[int]]:
        """
        "Controls how long the public portion of a signing key will be
        available for verification after being rotated in seconds.
        """
        return pulumi.get(self, "verification_ttl")

    @verification_ttl.setter
    def verification_ttl(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "verification_ttl", value)


@pulumi.input_type
class _OidcKeyState:
    def __init__(__self__, *,
                 algorithm: Optional[pulumi.Input[str]] = None,
                 allowed_client_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 rotation_period: Optional[pulumi.Input[int]] = None,
                 verification_ttl: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering OidcKey resources.
        :param pulumi.Input[str] algorithm: Signing algorithm to use. Signing algorithm to use.
               Allowed values are: RS256 (default), RS384, RS512, ES256, ES384, ES512, EdDSA.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_client_ids: Array of role client ids allowed to use this key for signing. If empty, no roles are allowed. If "*", all roles are
               allowed.
        :param pulumi.Input[str] name: Name of the OIDC Key to create.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[int] rotation_period: How often to generate a new signing key in number of seconds
        :param pulumi.Input[int] verification_ttl: "Controls how long the public portion of a signing key will be
               available for verification after being rotated in seconds.
        """
        if algorithm is not None:
            pulumi.set(__self__, "algorithm", algorithm)
        if allowed_client_ids is not None:
            pulumi.set(__self__, "allowed_client_ids", allowed_client_ids)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if rotation_period is not None:
            pulumi.set(__self__, "rotation_period", rotation_period)
        if verification_ttl is not None:
            pulumi.set(__self__, "verification_ttl", verification_ttl)

    @property
    @pulumi.getter
    def algorithm(self) -> Optional[pulumi.Input[str]]:
        """
        Signing algorithm to use. Signing algorithm to use.
        Allowed values are: RS256 (default), RS384, RS512, ES256, ES384, ES512, EdDSA.
        """
        return pulumi.get(self, "algorithm")

    @algorithm.setter
    def algorithm(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "algorithm", value)

    @property
    @pulumi.getter(name="allowedClientIds")
    def allowed_client_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Array of role client ids allowed to use this key for signing. If empty, no roles are allowed. If "*", all roles are
        allowed.
        """
        return pulumi.get(self, "allowed_client_ids")

    @allowed_client_ids.setter
    def allowed_client_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_client_ids", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the OIDC Key to create.
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
        The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        *Available only for Vault Enterprise*.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace", value)

    @property
    @pulumi.getter(name="rotationPeriod")
    def rotation_period(self) -> Optional[pulumi.Input[int]]:
        """
        How often to generate a new signing key in number of seconds
        """
        return pulumi.get(self, "rotation_period")

    @rotation_period.setter
    def rotation_period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "rotation_period", value)

    @property
    @pulumi.getter(name="verificationTtl")
    def verification_ttl(self) -> Optional[pulumi.Input[int]]:
        """
        "Controls how long the public portion of a signing key will be
        available for verification after being rotated in seconds.
        """
        return pulumi.get(self, "verification_ttl")

    @verification_ttl.setter
    def verification_ttl(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "verification_ttl", value)


class OidcKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 algorithm: Optional[pulumi.Input[str]] = None,
                 allowed_client_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 rotation_period: Optional[pulumi.Input[int]] = None,
                 verification_ttl: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_vault as vault

        key = vault.identity.OidcKey("key", algorithm="RS256")
        role_oidc_role = vault.identity.OidcRole("roleOidcRole", key=key.name)
        role_oidc_key_allowed_client_id = vault.identity.OidcKeyAllowedClientID("roleOidcKeyAllowedClientID",
            key_name=key.name,
            allowed_client_id=role_oidc_role.client_id)
        ```

        ## Import

        The key can be imported with the key name, for example

        ```sh
         $ pulumi import vault:identity/oidcKey:OidcKey key key
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] algorithm: Signing algorithm to use. Signing algorithm to use.
               Allowed values are: RS256 (default), RS384, RS512, ES256, ES384, ES512, EdDSA.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_client_ids: Array of role client ids allowed to use this key for signing. If empty, no roles are allowed. If "*", all roles are
               allowed.
        :param pulumi.Input[str] name: Name of the OIDC Key to create.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[int] rotation_period: How often to generate a new signing key in number of seconds
        :param pulumi.Input[int] verification_ttl: "Controls how long the public portion of a signing key will be
               available for verification after being rotated in seconds.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[OidcKeyArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_vault as vault

        key = vault.identity.OidcKey("key", algorithm="RS256")
        role_oidc_role = vault.identity.OidcRole("roleOidcRole", key=key.name)
        role_oidc_key_allowed_client_id = vault.identity.OidcKeyAllowedClientID("roleOidcKeyAllowedClientID",
            key_name=key.name,
            allowed_client_id=role_oidc_role.client_id)
        ```

        ## Import

        The key can be imported with the key name, for example

        ```sh
         $ pulumi import vault:identity/oidcKey:OidcKey key key
        ```

        :param str resource_name: The name of the resource.
        :param OidcKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OidcKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 algorithm: Optional[pulumi.Input[str]] = None,
                 allowed_client_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 rotation_period: Optional[pulumi.Input[int]] = None,
                 verification_ttl: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OidcKeyArgs.__new__(OidcKeyArgs)

            __props__.__dict__["algorithm"] = algorithm
            __props__.__dict__["allowed_client_ids"] = allowed_client_ids
            __props__.__dict__["name"] = name
            __props__.__dict__["namespace"] = namespace
            __props__.__dict__["rotation_period"] = rotation_period
            __props__.__dict__["verification_ttl"] = verification_ttl
        super(OidcKey, __self__).__init__(
            'vault:identity/oidcKey:OidcKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            algorithm: Optional[pulumi.Input[str]] = None,
            allowed_client_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            namespace: Optional[pulumi.Input[str]] = None,
            rotation_period: Optional[pulumi.Input[int]] = None,
            verification_ttl: Optional[pulumi.Input[int]] = None) -> 'OidcKey':
        """
        Get an existing OidcKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] algorithm: Signing algorithm to use. Signing algorithm to use.
               Allowed values are: RS256 (default), RS384, RS512, ES256, ES384, ES512, EdDSA.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_client_ids: Array of role client ids allowed to use this key for signing. If empty, no roles are allowed. If "*", all roles are
               allowed.
        :param pulumi.Input[str] name: Name of the OIDC Key to create.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[int] rotation_period: How often to generate a new signing key in number of seconds
        :param pulumi.Input[int] verification_ttl: "Controls how long the public portion of a signing key will be
               available for verification after being rotated in seconds.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OidcKeyState.__new__(_OidcKeyState)

        __props__.__dict__["algorithm"] = algorithm
        __props__.__dict__["allowed_client_ids"] = allowed_client_ids
        __props__.__dict__["name"] = name
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["rotation_period"] = rotation_period
        __props__.__dict__["verification_ttl"] = verification_ttl
        return OidcKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def algorithm(self) -> pulumi.Output[Optional[str]]:
        """
        Signing algorithm to use. Signing algorithm to use.
        Allowed values are: RS256 (default), RS384, RS512, ES256, ES384, ES512, EdDSA.
        """
        return pulumi.get(self, "algorithm")

    @property
    @pulumi.getter(name="allowedClientIds")
    def allowed_client_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        Array of role client ids allowed to use this key for signing. If empty, no roles are allowed. If "*", all roles are
        allowed.
        """
        return pulumi.get(self, "allowed_client_ids")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the OIDC Key to create.
        """
        return pulumi.get(self, "name")

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
    @pulumi.getter(name="rotationPeriod")
    def rotation_period(self) -> pulumi.Output[Optional[int]]:
        """
        How often to generate a new signing key in number of seconds
        """
        return pulumi.get(self, "rotation_period")

    @property
    @pulumi.getter(name="verificationTtl")
    def verification_ttl(self) -> pulumi.Output[Optional[int]]:
        """
        "Controls how long the public portion of a signing key will be
        available for verification after being rotated in seconds.
        """
        return pulumi.get(self, "verification_ttl")

