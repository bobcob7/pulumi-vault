# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['MfaPingidArgs', 'MfaPingid']

@pulumi.input_type
class MfaPingidArgs:
    def __init__(__self__, *,
                 mount_accessor: pulumi.Input[str],
                 settings_file_base64: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 username_format: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a MfaPingid resource.
        :param pulumi.Input[str] mount_accessor: `(string: <required>)` - The mount to tie this method to for use in automatic mappings. 
               The mapping will use the Name field of Aliases associated with this mount as the username in the mapping.
        :param pulumi.Input[str] settings_file_base64: `(string: <required>)` - A base64-encoded third-party settings file retrieved
               from PingID's configuration page.
        :param pulumi.Input[str] name: `(string: <required>)` – Name of the MFA method.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] username_format: `(string)` - A format string for mapping Identity names to MFA method names. 
               Values to substitute should be placed in `{{}}`. For example, `"{{alias.name}}@example.com"`.
               If blank, the Alias's Name field will be used as-is. Currently-supported mappings:
               - alias.name: The name returned by the mount configured via the `mount_accessor` parameter
               - entity.name: The name configured for the Entity
               - alias.metadata.`<key>`: The value of the Alias's metadata parameter
               - entity.metadata.`<key>`: The value of the Entity's metadata parameter
        """
        pulumi.set(__self__, "mount_accessor", mount_accessor)
        pulumi.set(__self__, "settings_file_base64", settings_file_base64)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if username_format is not None:
            pulumi.set(__self__, "username_format", username_format)

    @property
    @pulumi.getter(name="mountAccessor")
    def mount_accessor(self) -> pulumi.Input[str]:
        """
        `(string: <required>)` - The mount to tie this method to for use in automatic mappings. 
        The mapping will use the Name field of Aliases associated with this mount as the username in the mapping.
        """
        return pulumi.get(self, "mount_accessor")

    @mount_accessor.setter
    def mount_accessor(self, value: pulumi.Input[str]):
        pulumi.set(self, "mount_accessor", value)

    @property
    @pulumi.getter(name="settingsFileBase64")
    def settings_file_base64(self) -> pulumi.Input[str]:
        """
        `(string: <required>)` - A base64-encoded third-party settings file retrieved
        from PingID's configuration page.
        """
        return pulumi.get(self, "settings_file_base64")

    @settings_file_base64.setter
    def settings_file_base64(self, value: pulumi.Input[str]):
        pulumi.set(self, "settings_file_base64", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` – Name of the MFA method.
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
    @pulumi.getter(name="usernameFormat")
    def username_format(self) -> Optional[pulumi.Input[str]]:
        """
        `(string)` - A format string for mapping Identity names to MFA method names. 
        Values to substitute should be placed in `{{}}`. For example, `"{{alias.name}}@example.com"`.
        If blank, the Alias's Name field will be used as-is. Currently-supported mappings:
        - alias.name: The name returned by the mount configured via the `mount_accessor` parameter
        - entity.name: The name configured for the Entity
        - alias.metadata.`<key>`: The value of the Alias's metadata parameter
        - entity.metadata.`<key>`: The value of the Entity's metadata parameter
        """
        return pulumi.get(self, "username_format")

    @username_format.setter
    def username_format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username_format", value)


@pulumi.input_type
class _MfaPingidState:
    def __init__(__self__, *,
                 admin_url: Optional[pulumi.Input[str]] = None,
                 authenticator_url: Optional[pulumi.Input[str]] = None,
                 idp_url: Optional[pulumi.Input[str]] = None,
                 mount_accessor: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 namespace_id: Optional[pulumi.Input[str]] = None,
                 org_alias: Optional[pulumi.Input[str]] = None,
                 settings_file_base64: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 use_signature: Optional[pulumi.Input[bool]] = None,
                 username_format: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MfaPingid resources.
        :param pulumi.Input[str] admin_url: Admin URL computed by Vault.
        :param pulumi.Input[str] authenticator_url: Authenticator URL computed by Vault.
        :param pulumi.Input[str] idp_url: IDP URL computed by Vault.
        :param pulumi.Input[str] mount_accessor: `(string: <required>)` - The mount to tie this method to for use in automatic mappings. 
               The mapping will use the Name field of Aliases associated with this mount as the username in the mapping.
        :param pulumi.Input[str] name: `(string: <required>)` – Name of the MFA method.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] namespace_id: Namespace ID computed by Vault.
        :param pulumi.Input[str] org_alias: Org Alias computed by Vault.
        :param pulumi.Input[str] settings_file_base64: `(string: <required>)` - A base64-encoded third-party settings file retrieved
               from PingID's configuration page.
        :param pulumi.Input[str] type: Type of configuration computed by Vault.
        :param pulumi.Input[bool] use_signature: If set, enables use of PingID signature. Computed by Vault
        :param pulumi.Input[str] username_format: `(string)` - A format string for mapping Identity names to MFA method names. 
               Values to substitute should be placed in `{{}}`. For example, `"{{alias.name}}@example.com"`.
               If blank, the Alias's Name field will be used as-is. Currently-supported mappings:
               - alias.name: The name returned by the mount configured via the `mount_accessor` parameter
               - entity.name: The name configured for the Entity
               - alias.metadata.`<key>`: The value of the Alias's metadata parameter
               - entity.metadata.`<key>`: The value of the Entity's metadata parameter
        """
        if admin_url is not None:
            pulumi.set(__self__, "admin_url", admin_url)
        if authenticator_url is not None:
            pulumi.set(__self__, "authenticator_url", authenticator_url)
        if idp_url is not None:
            pulumi.set(__self__, "idp_url", idp_url)
        if mount_accessor is not None:
            pulumi.set(__self__, "mount_accessor", mount_accessor)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if namespace_id is not None:
            pulumi.set(__self__, "namespace_id", namespace_id)
        if org_alias is not None:
            pulumi.set(__self__, "org_alias", org_alias)
        if settings_file_base64 is not None:
            pulumi.set(__self__, "settings_file_base64", settings_file_base64)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if use_signature is not None:
            pulumi.set(__self__, "use_signature", use_signature)
        if username_format is not None:
            pulumi.set(__self__, "username_format", username_format)

    @property
    @pulumi.getter(name="adminUrl")
    def admin_url(self) -> Optional[pulumi.Input[str]]:
        """
        Admin URL computed by Vault.
        """
        return pulumi.get(self, "admin_url")

    @admin_url.setter
    def admin_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "admin_url", value)

    @property
    @pulumi.getter(name="authenticatorUrl")
    def authenticator_url(self) -> Optional[pulumi.Input[str]]:
        """
        Authenticator URL computed by Vault.
        """
        return pulumi.get(self, "authenticator_url")

    @authenticator_url.setter
    def authenticator_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "authenticator_url", value)

    @property
    @pulumi.getter(name="idpUrl")
    def idp_url(self) -> Optional[pulumi.Input[str]]:
        """
        IDP URL computed by Vault.
        """
        return pulumi.get(self, "idp_url")

    @idp_url.setter
    def idp_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "idp_url", value)

    @property
    @pulumi.getter(name="mountAccessor")
    def mount_accessor(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` - The mount to tie this method to for use in automatic mappings. 
        The mapping will use the Name field of Aliases associated with this mount as the username in the mapping.
        """
        return pulumi.get(self, "mount_accessor")

    @mount_accessor.setter
    def mount_accessor(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mount_accessor", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` – Name of the MFA method.
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
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> Optional[pulumi.Input[str]]:
        """
        Namespace ID computed by Vault.
        """
        return pulumi.get(self, "namespace_id")

    @namespace_id.setter
    def namespace_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace_id", value)

    @property
    @pulumi.getter(name="orgAlias")
    def org_alias(self) -> Optional[pulumi.Input[str]]:
        """
        Org Alias computed by Vault.
        """
        return pulumi.get(self, "org_alias")

    @org_alias.setter
    def org_alias(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_alias", value)

    @property
    @pulumi.getter(name="settingsFileBase64")
    def settings_file_base64(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` - A base64-encoded third-party settings file retrieved
        from PingID's configuration page.
        """
        return pulumi.get(self, "settings_file_base64")

    @settings_file_base64.setter
    def settings_file_base64(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "settings_file_base64", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of configuration computed by Vault.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="useSignature")
    def use_signature(self) -> Optional[pulumi.Input[bool]]:
        """
        If set, enables use of PingID signature. Computed by Vault
        """
        return pulumi.get(self, "use_signature")

    @use_signature.setter
    def use_signature(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_signature", value)

    @property
    @pulumi.getter(name="usernameFormat")
    def username_format(self) -> Optional[pulumi.Input[str]]:
        """
        `(string)` - A format string for mapping Identity names to MFA method names. 
        Values to substitute should be placed in `{{}}`. For example, `"{{alias.name}}@example.com"`.
        If blank, the Alias's Name field will be used as-is. Currently-supported mappings:
        - alias.name: The name returned by the mount configured via the `mount_accessor` parameter
        - entity.name: The name configured for the Entity
        - alias.metadata.`<key>`: The value of the Alias's metadata parameter
        - entity.metadata.`<key>`: The value of the Entity's metadata parameter
        """
        return pulumi.get(self, "username_format")

    @username_format.setter
    def username_format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username_format", value)


class MfaPingid(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 mount_accessor: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 settings_file_base64: Optional[pulumi.Input[str]] = None,
                 username_format: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource to manage [PingID MFA](https://www.vaultproject.io/docs/enterprise/mfa/mfa-pingid).

        **Note** this feature is available only with Vault Enterprise.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_vault as vault

        config = pulumi.Config()
        settings_file = config.require_object("settingsFile")
        userpass = vault.AuthBackend("userpass",
            type="userpass",
            path="userpass")
        my_pingid = vault.MfaPingid("myPingid",
            mount_accessor=userpass.accessor,
            username_format="user@example.com",
            settings_file_base64=settings_file)
        ```

        ## Import

        Mounts can be imported using the `path`, e.g.

        ```sh
         $ pulumi import vault:index/mfaPingid:MfaPingid my_pingid my_pingid
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] mount_accessor: `(string: <required>)` - The mount to tie this method to for use in automatic mappings. 
               The mapping will use the Name field of Aliases associated with this mount as the username in the mapping.
        :param pulumi.Input[str] name: `(string: <required>)` – Name of the MFA method.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] settings_file_base64: `(string: <required>)` - A base64-encoded third-party settings file retrieved
               from PingID's configuration page.
        :param pulumi.Input[str] username_format: `(string)` - A format string for mapping Identity names to MFA method names. 
               Values to substitute should be placed in `{{}}`. For example, `"{{alias.name}}@example.com"`.
               If blank, the Alias's Name field will be used as-is. Currently-supported mappings:
               - alias.name: The name returned by the mount configured via the `mount_accessor` parameter
               - entity.name: The name configured for the Entity
               - alias.metadata.`<key>`: The value of the Alias's metadata parameter
               - entity.metadata.`<key>`: The value of the Entity's metadata parameter
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MfaPingidArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage [PingID MFA](https://www.vaultproject.io/docs/enterprise/mfa/mfa-pingid).

        **Note** this feature is available only with Vault Enterprise.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_vault as vault

        config = pulumi.Config()
        settings_file = config.require_object("settingsFile")
        userpass = vault.AuthBackend("userpass",
            type="userpass",
            path="userpass")
        my_pingid = vault.MfaPingid("myPingid",
            mount_accessor=userpass.accessor,
            username_format="user@example.com",
            settings_file_base64=settings_file)
        ```

        ## Import

        Mounts can be imported using the `path`, e.g.

        ```sh
         $ pulumi import vault:index/mfaPingid:MfaPingid my_pingid my_pingid
        ```

        :param str resource_name: The name of the resource.
        :param MfaPingidArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MfaPingidArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 mount_accessor: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 settings_file_base64: Optional[pulumi.Input[str]] = None,
                 username_format: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MfaPingidArgs.__new__(MfaPingidArgs)

            if mount_accessor is None and not opts.urn:
                raise TypeError("Missing required property 'mount_accessor'")
            __props__.__dict__["mount_accessor"] = mount_accessor
            __props__.__dict__["name"] = name
            __props__.__dict__["namespace"] = namespace
            if settings_file_base64 is None and not opts.urn:
                raise TypeError("Missing required property 'settings_file_base64'")
            __props__.__dict__["settings_file_base64"] = settings_file_base64
            __props__.__dict__["username_format"] = username_format
            __props__.__dict__["admin_url"] = None
            __props__.__dict__["authenticator_url"] = None
            __props__.__dict__["idp_url"] = None
            __props__.__dict__["namespace_id"] = None
            __props__.__dict__["org_alias"] = None
            __props__.__dict__["type"] = None
            __props__.__dict__["use_signature"] = None
        super(MfaPingid, __self__).__init__(
            'vault:index/mfaPingid:MfaPingid',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            admin_url: Optional[pulumi.Input[str]] = None,
            authenticator_url: Optional[pulumi.Input[str]] = None,
            idp_url: Optional[pulumi.Input[str]] = None,
            mount_accessor: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            namespace: Optional[pulumi.Input[str]] = None,
            namespace_id: Optional[pulumi.Input[str]] = None,
            org_alias: Optional[pulumi.Input[str]] = None,
            settings_file_base64: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            use_signature: Optional[pulumi.Input[bool]] = None,
            username_format: Optional[pulumi.Input[str]] = None) -> 'MfaPingid':
        """
        Get an existing MfaPingid resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] admin_url: Admin URL computed by Vault.
        :param pulumi.Input[str] authenticator_url: Authenticator URL computed by Vault.
        :param pulumi.Input[str] idp_url: IDP URL computed by Vault.
        :param pulumi.Input[str] mount_accessor: `(string: <required>)` - The mount to tie this method to for use in automatic mappings. 
               The mapping will use the Name field of Aliases associated with this mount as the username in the mapping.
        :param pulumi.Input[str] name: `(string: <required>)` – Name of the MFA method.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] namespace_id: Namespace ID computed by Vault.
        :param pulumi.Input[str] org_alias: Org Alias computed by Vault.
        :param pulumi.Input[str] settings_file_base64: `(string: <required>)` - A base64-encoded third-party settings file retrieved
               from PingID's configuration page.
        :param pulumi.Input[str] type: Type of configuration computed by Vault.
        :param pulumi.Input[bool] use_signature: If set, enables use of PingID signature. Computed by Vault
        :param pulumi.Input[str] username_format: `(string)` - A format string for mapping Identity names to MFA method names. 
               Values to substitute should be placed in `{{}}`. For example, `"{{alias.name}}@example.com"`.
               If blank, the Alias's Name field will be used as-is. Currently-supported mappings:
               - alias.name: The name returned by the mount configured via the `mount_accessor` parameter
               - entity.name: The name configured for the Entity
               - alias.metadata.`<key>`: The value of the Alias's metadata parameter
               - entity.metadata.`<key>`: The value of the Entity's metadata parameter
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MfaPingidState.__new__(_MfaPingidState)

        __props__.__dict__["admin_url"] = admin_url
        __props__.__dict__["authenticator_url"] = authenticator_url
        __props__.__dict__["idp_url"] = idp_url
        __props__.__dict__["mount_accessor"] = mount_accessor
        __props__.__dict__["name"] = name
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["namespace_id"] = namespace_id
        __props__.__dict__["org_alias"] = org_alias
        __props__.__dict__["settings_file_base64"] = settings_file_base64
        __props__.__dict__["type"] = type
        __props__.__dict__["use_signature"] = use_signature
        __props__.__dict__["username_format"] = username_format
        return MfaPingid(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="adminUrl")
    def admin_url(self) -> pulumi.Output[str]:
        """
        Admin URL computed by Vault.
        """
        return pulumi.get(self, "admin_url")

    @property
    @pulumi.getter(name="authenticatorUrl")
    def authenticator_url(self) -> pulumi.Output[str]:
        """
        Authenticator URL computed by Vault.
        """
        return pulumi.get(self, "authenticator_url")

    @property
    @pulumi.getter(name="idpUrl")
    def idp_url(self) -> pulumi.Output[str]:
        """
        IDP URL computed by Vault.
        """
        return pulumi.get(self, "idp_url")

    @property
    @pulumi.getter(name="mountAccessor")
    def mount_accessor(self) -> pulumi.Output[str]:
        """
        `(string: <required>)` - The mount to tie this method to for use in automatic mappings. 
        The mapping will use the Name field of Aliases associated with this mount as the username in the mapping.
        """
        return pulumi.get(self, "mount_accessor")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        `(string: <required>)` – Name of the MFA method.
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
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> pulumi.Output[str]:
        """
        Namespace ID computed by Vault.
        """
        return pulumi.get(self, "namespace_id")

    @property
    @pulumi.getter(name="orgAlias")
    def org_alias(self) -> pulumi.Output[str]:
        """
        Org Alias computed by Vault.
        """
        return pulumi.get(self, "org_alias")

    @property
    @pulumi.getter(name="settingsFileBase64")
    def settings_file_base64(self) -> pulumi.Output[str]:
        """
        `(string: <required>)` - A base64-encoded third-party settings file retrieved
        from PingID's configuration page.
        """
        return pulumi.get(self, "settings_file_base64")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of configuration computed by Vault.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="useSignature")
    def use_signature(self) -> pulumi.Output[bool]:
        """
        If set, enables use of PingID signature. Computed by Vault
        """
        return pulumi.get(self, "use_signature")

    @property
    @pulumi.getter(name="usernameFormat")
    def username_format(self) -> pulumi.Output[Optional[str]]:
        """
        `(string)` - A format string for mapping Identity names to MFA method names. 
        Values to substitute should be placed in `{{}}`. For example, `"{{alias.name}}@example.com"`.
        If blank, the Alias's Name field will be used as-is. Currently-supported mappings:
        - alias.name: The name returned by the mount configured via the `mount_accessor` parameter
        - entity.name: The name configured for the Entity
        - alias.metadata.`<key>`: The value of the Alias's metadata parameter
        - entity.metadata.`<key>`: The value of the Entity's metadata parameter
        """
        return pulumi.get(self, "username_format")

