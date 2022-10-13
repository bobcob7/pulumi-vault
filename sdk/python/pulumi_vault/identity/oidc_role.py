# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['OidcRoleArgs', 'OidcRole']

@pulumi.input_type
class OidcRoleArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 client_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 template: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a OidcRole resource.
        :param pulumi.Input[str] key: A configured named key, the key must already exist
               before tokens can be issued.
        :param pulumi.Input[str] client_id: The value that will be included in the `aud` field of all the OIDC identity
               tokens issued by this role
        :param pulumi.Input[str] name: Name of the OIDC Role to create.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] template: The template string to use for generating tokens. This may be in
               string-ified JSON or base64 format. See the
               [documentation](https://www.vaultproject.io/docs/secrets/identity/index.html#token-contents-and-templates)
               for the template format.
        :param pulumi.Input[int] ttl: TTL of the tokens generated against the role in number of seconds.
        """
        pulumi.set(__self__, "key", key)
        if client_id is not None:
            pulumi.set(__self__, "client_id", client_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if template is not None:
            pulumi.set(__self__, "template", template)
        if ttl is not None:
            pulumi.set(__self__, "ttl", ttl)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        A configured named key, the key must already exist
        before tokens can be issued.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[str]]:
        """
        The value that will be included in the `aud` field of all the OIDC identity
        tokens issued by this role
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the OIDC Role to create.
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
    @pulumi.getter
    def template(self) -> Optional[pulumi.Input[str]]:
        """
        The template string to use for generating tokens. This may be in
        string-ified JSON or base64 format. See the
        [documentation](https://www.vaultproject.io/docs/secrets/identity/index.html#token-contents-and-templates)
        for the template format.
        """
        return pulumi.get(self, "template")

    @template.setter
    def template(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "template", value)

    @property
    @pulumi.getter
    def ttl(self) -> Optional[pulumi.Input[int]]:
        """
        TTL of the tokens generated against the role in number of seconds.
        """
        return pulumi.get(self, "ttl")

    @ttl.setter
    def ttl(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ttl", value)


@pulumi.input_type
class _OidcRoleState:
    def __init__(__self__, *,
                 client_id: Optional[pulumi.Input[str]] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 template: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering OidcRole resources.
        :param pulumi.Input[str] client_id: The value that will be included in the `aud` field of all the OIDC identity
               tokens issued by this role
        :param pulumi.Input[str] key: A configured named key, the key must already exist
               before tokens can be issued.
        :param pulumi.Input[str] name: Name of the OIDC Role to create.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] template: The template string to use for generating tokens. This may be in
               string-ified JSON or base64 format. See the
               [documentation](https://www.vaultproject.io/docs/secrets/identity/index.html#token-contents-and-templates)
               for the template format.
        :param pulumi.Input[int] ttl: TTL of the tokens generated against the role in number of seconds.
        """
        if client_id is not None:
            pulumi.set(__self__, "client_id", client_id)
        if key is not None:
            pulumi.set(__self__, "key", key)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if template is not None:
            pulumi.set(__self__, "template", template)
        if ttl is not None:
            pulumi.set(__self__, "ttl", ttl)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[str]]:
        """
        The value that will be included in the `aud` field of all the OIDC identity
        tokens issued by this role
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[str]]:
        """
        A configured named key, the key must already exist
        before tokens can be issued.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the OIDC Role to create.
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
    @pulumi.getter
    def template(self) -> Optional[pulumi.Input[str]]:
        """
        The template string to use for generating tokens. This may be in
        string-ified JSON or base64 format. See the
        [documentation](https://www.vaultproject.io/docs/secrets/identity/index.html#token-contents-and-templates)
        for the template format.
        """
        return pulumi.get(self, "template")

    @template.setter
    def template(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "template", value)

    @property
    @pulumi.getter
    def ttl(self) -> Optional[pulumi.Input[int]]:
        """
        TTL of the tokens generated against the role in number of seconds.
        """
        return pulumi.get(self, "ttl")

    @ttl.setter
    def ttl(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ttl", value)


class OidcRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 template: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        ## Example Usage

        You need to create a role with a named key.
        At creation time, the key can be created independently of the role. However, the key must
        exist before the role can be used to issue tokens. You must also configure the key with the
        role's Client ID to allow the role to use the key.

        ```python
        import pulumi
        import pulumi_vault as vault

        config = pulumi.Config()
        key = config.get("key")
        if key is None:
            key = "key"
        role = vault.identity.OidcRole("role", key=key)
        key_oidc_key = vault.identity.OidcKey("keyOidcKey",
            algorithm="RS256",
            allowed_client_ids=[role.client_id])
        ```

        If you want to create the key first before creating the role, you can use a separate
        resource to configure the allowed Client ID on
        the key.

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

        The key can be imported with the role name, for example

        ```sh
         $ pulumi import vault:identity/oidcRole:OidcRole role role
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] client_id: The value that will be included in the `aud` field of all the OIDC identity
               tokens issued by this role
        :param pulumi.Input[str] key: A configured named key, the key must already exist
               before tokens can be issued.
        :param pulumi.Input[str] name: Name of the OIDC Role to create.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] template: The template string to use for generating tokens. This may be in
               string-ified JSON or base64 format. See the
               [documentation](https://www.vaultproject.io/docs/secrets/identity/index.html#token-contents-and-templates)
               for the template format.
        :param pulumi.Input[int] ttl: TTL of the tokens generated against the role in number of seconds.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OidcRoleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        You need to create a role with a named key.
        At creation time, the key can be created independently of the role. However, the key must
        exist before the role can be used to issue tokens. You must also configure the key with the
        role's Client ID to allow the role to use the key.

        ```python
        import pulumi
        import pulumi_vault as vault

        config = pulumi.Config()
        key = config.get("key")
        if key is None:
            key = "key"
        role = vault.identity.OidcRole("role", key=key)
        key_oidc_key = vault.identity.OidcKey("keyOidcKey",
            algorithm="RS256",
            allowed_client_ids=[role.client_id])
        ```

        If you want to create the key first before creating the role, you can use a separate
        resource to configure the allowed Client ID on
        the key.

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

        The key can be imported with the role name, for example

        ```sh
         $ pulumi import vault:identity/oidcRole:OidcRole role role
        ```

        :param str resource_name: The name of the resource.
        :param OidcRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OidcRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 template: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OidcRoleArgs.__new__(OidcRoleArgs)

            __props__.__dict__["client_id"] = client_id
            if key is None and not opts.urn:
                raise TypeError("Missing required property 'key'")
            __props__.__dict__["key"] = key
            __props__.__dict__["name"] = name
            __props__.__dict__["namespace"] = namespace
            __props__.__dict__["template"] = template
            __props__.__dict__["ttl"] = ttl
        super(OidcRole, __self__).__init__(
            'vault:identity/oidcRole:OidcRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            client_id: Optional[pulumi.Input[str]] = None,
            key: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            namespace: Optional[pulumi.Input[str]] = None,
            template: Optional[pulumi.Input[str]] = None,
            ttl: Optional[pulumi.Input[int]] = None) -> 'OidcRole':
        """
        Get an existing OidcRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] client_id: The value that will be included in the `aud` field of all the OIDC identity
               tokens issued by this role
        :param pulumi.Input[str] key: A configured named key, the key must already exist
               before tokens can be issued.
        :param pulumi.Input[str] name: Name of the OIDC Role to create.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] template: The template string to use for generating tokens. This may be in
               string-ified JSON or base64 format. See the
               [documentation](https://www.vaultproject.io/docs/secrets/identity/index.html#token-contents-and-templates)
               for the template format.
        :param pulumi.Input[int] ttl: TTL of the tokens generated against the role in number of seconds.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OidcRoleState.__new__(_OidcRoleState)

        __props__.__dict__["client_id"] = client_id
        __props__.__dict__["key"] = key
        __props__.__dict__["name"] = name
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["template"] = template
        __props__.__dict__["ttl"] = ttl
        return OidcRole(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Output[str]:
        """
        The value that will be included in the `aud` field of all the OIDC identity
        tokens issued by this role
        """
        return pulumi.get(self, "client_id")

    @property
    @pulumi.getter
    def key(self) -> pulumi.Output[str]:
        """
        A configured named key, the key must already exist
        before tokens can be issued.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the OIDC Role to create.
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
    @pulumi.getter
    def template(self) -> pulumi.Output[Optional[str]]:
        """
        The template string to use for generating tokens. This may be in
        string-ified JSON or base64 format. See the
        [documentation](https://www.vaultproject.io/docs/secrets/identity/index.html#token-contents-and-templates)
        for the template format.
        """
        return pulumi.get(self, "template")

    @property
    @pulumi.getter
    def ttl(self) -> pulumi.Output[Optional[int]]:
        """
        TTL of the tokens generated against the role in number of seconds.
        """
        return pulumi.get(self, "ttl")

