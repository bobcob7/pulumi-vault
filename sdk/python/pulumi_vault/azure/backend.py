# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['BackendArgs', 'Backend']

@pulumi.input_type
class BackendArgs:
    def __init__(__self__, *,
                 subscription_id: pulumi.Input[str],
                 tenant_id: pulumi.Input[str],
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_secret: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disable_remount: Optional[pulumi.Input[bool]] = None,
                 environment: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 use_microsoft_graph_api: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a Backend resource.
        :param pulumi.Input[str] subscription_id: - The subscription id for the Azure Active Directory.
        :param pulumi.Input[str] tenant_id: - The tenant id for the Azure Active Directory.
        :param pulumi.Input[str] client_id: - The OAuth2 client id to connect to Azure.
        :param pulumi.Input[str] client_secret: - The OAuth2 client secret to connect to Azure.
        :param pulumi.Input[str] description: Human-friendly description of the mount for the backend.
        :param pulumi.Input[bool] disable_remount: If set, opts out of mount migration on path updates.
               See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        :param pulumi.Input[str] environment: - The Azure environment.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: - The unique path this backend should be mounted at. Defaults to `azure`.
        :param pulumi.Input[bool] use_microsoft_graph_api: - Indicates whether the secrets engine should use 
               the Microsoft Graph API. This parameter has been deprecated and will be ignored in `vault-1.12+`.
               For more information, please refer to the [Vault docs](https://developer.hashicorp.com/vault/api-docs/secret/azure#use_microsoft_graph_api)
        """
        pulumi.set(__self__, "subscription_id", subscription_id)
        pulumi.set(__self__, "tenant_id", tenant_id)
        if client_id is not None:
            pulumi.set(__self__, "client_id", client_id)
        if client_secret is not None:
            pulumi.set(__self__, "client_secret", client_secret)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disable_remount is not None:
            pulumi.set(__self__, "disable_remount", disable_remount)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if use_microsoft_graph_api is not None:
            pulumi.set(__self__, "use_microsoft_graph_api", use_microsoft_graph_api)

    @property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> pulumi.Input[str]:
        """
        - The subscription id for the Azure Active Directory.
        """
        return pulumi.get(self, "subscription_id")

    @subscription_id.setter
    def subscription_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "subscription_id", value)

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> pulumi.Input[str]:
        """
        - The tenant id for the Azure Active Directory.
        """
        return pulumi.get(self, "tenant_id")

    @tenant_id.setter
    def tenant_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "tenant_id", value)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[str]]:
        """
        - The OAuth2 client id to connect to Azure.
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> Optional[pulumi.Input[str]]:
        """
        - The OAuth2 client secret to connect to Azure.
        """
        return pulumi.get(self, "client_secret")

    @client_secret.setter
    def client_secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_secret", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Human-friendly description of the mount for the backend.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="disableRemount")
    def disable_remount(self) -> Optional[pulumi.Input[bool]]:
        """
        If set, opts out of mount migration on path updates.
        See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        """
        return pulumi.get(self, "disable_remount")

    @disable_remount.setter
    def disable_remount(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disable_remount", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input[str]]:
        """
        - The Azure environment.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment", value)

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
        - The unique path this backend should be mounted at. Defaults to `azure`.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter(name="useMicrosoftGraphApi")
    def use_microsoft_graph_api(self) -> Optional[pulumi.Input[bool]]:
        """
        - Indicates whether the secrets engine should use 
        the Microsoft Graph API. This parameter has been deprecated and will be ignored in `vault-1.12+`.
        For more information, please refer to the [Vault docs](https://developer.hashicorp.com/vault/api-docs/secret/azure#use_microsoft_graph_api)
        """
        return pulumi.get(self, "use_microsoft_graph_api")

    @use_microsoft_graph_api.setter
    def use_microsoft_graph_api(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_microsoft_graph_api", value)


@pulumi.input_type
class _BackendState:
    def __init__(__self__, *,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_secret: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disable_remount: Optional[pulumi.Input[bool]] = None,
                 environment: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 subscription_id: Optional[pulumi.Input[str]] = None,
                 tenant_id: Optional[pulumi.Input[str]] = None,
                 use_microsoft_graph_api: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering Backend resources.
        :param pulumi.Input[str] client_id: - The OAuth2 client id to connect to Azure.
        :param pulumi.Input[str] client_secret: - The OAuth2 client secret to connect to Azure.
        :param pulumi.Input[str] description: Human-friendly description of the mount for the backend.
        :param pulumi.Input[bool] disable_remount: If set, opts out of mount migration on path updates.
               See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        :param pulumi.Input[str] environment: - The Azure environment.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: - The unique path this backend should be mounted at. Defaults to `azure`.
        :param pulumi.Input[str] subscription_id: - The subscription id for the Azure Active Directory.
        :param pulumi.Input[str] tenant_id: - The tenant id for the Azure Active Directory.
        :param pulumi.Input[bool] use_microsoft_graph_api: - Indicates whether the secrets engine should use 
               the Microsoft Graph API. This parameter has been deprecated and will be ignored in `vault-1.12+`.
               For more information, please refer to the [Vault docs](https://developer.hashicorp.com/vault/api-docs/secret/azure#use_microsoft_graph_api)
        """
        if client_id is not None:
            pulumi.set(__self__, "client_id", client_id)
        if client_secret is not None:
            pulumi.set(__self__, "client_secret", client_secret)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disable_remount is not None:
            pulumi.set(__self__, "disable_remount", disable_remount)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if subscription_id is not None:
            pulumi.set(__self__, "subscription_id", subscription_id)
        if tenant_id is not None:
            pulumi.set(__self__, "tenant_id", tenant_id)
        if use_microsoft_graph_api is not None:
            pulumi.set(__self__, "use_microsoft_graph_api", use_microsoft_graph_api)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[str]]:
        """
        - The OAuth2 client id to connect to Azure.
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> Optional[pulumi.Input[str]]:
        """
        - The OAuth2 client secret to connect to Azure.
        """
        return pulumi.get(self, "client_secret")

    @client_secret.setter
    def client_secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_secret", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Human-friendly description of the mount for the backend.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="disableRemount")
    def disable_remount(self) -> Optional[pulumi.Input[bool]]:
        """
        If set, opts out of mount migration on path updates.
        See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        """
        return pulumi.get(self, "disable_remount")

    @disable_remount.setter
    def disable_remount(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disable_remount", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input[str]]:
        """
        - The Azure environment.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment", value)

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
        - The unique path this backend should be mounted at. Defaults to `azure`.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> Optional[pulumi.Input[str]]:
        """
        - The subscription id for the Azure Active Directory.
        """
        return pulumi.get(self, "subscription_id")

    @subscription_id.setter
    def subscription_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subscription_id", value)

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> Optional[pulumi.Input[str]]:
        """
        - The tenant id for the Azure Active Directory.
        """
        return pulumi.get(self, "tenant_id")

    @tenant_id.setter
    def tenant_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tenant_id", value)

    @property
    @pulumi.getter(name="useMicrosoftGraphApi")
    def use_microsoft_graph_api(self) -> Optional[pulumi.Input[bool]]:
        """
        - Indicates whether the secrets engine should use 
        the Microsoft Graph API. This parameter has been deprecated and will be ignored in `vault-1.12+`.
        For more information, please refer to the [Vault docs](https://developer.hashicorp.com/vault/api-docs/secret/azure#use_microsoft_graph_api)
        """
        return pulumi.get(self, "use_microsoft_graph_api")

    @use_microsoft_graph_api.setter
    def use_microsoft_graph_api(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_microsoft_graph_api", value)


class Backend(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_secret: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disable_remount: Optional[pulumi.Input[bool]] = None,
                 environment: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 subscription_id: Optional[pulumi.Input[str]] = None,
                 tenant_id: Optional[pulumi.Input[str]] = None,
                 use_microsoft_graph_api: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        ## Example Usage
        ### *Vault-1.9 And Above*

        ```python
        import pulumi
        import pulumi_vault as vault

        azure = vault.azure.Backend("azure",
            client_id="11111111-2222-3333-4444-333333333333",
            client_secret="12345678901234567890",
            environment="AzurePublicCloud",
            subscription_id="11111111-2222-3333-4444-111111111111",
            tenant_id="11111111-2222-3333-4444-222222222222",
            use_microsoft_graph_api=True)
        ```
        ### *Vault-1.8 And Below*

        ```python
        import pulumi
        import pulumi_vault as vault

        azure = vault.azure.Backend("azure",
            client_id="11111111-2222-3333-4444-333333333333",
            client_secret="12345678901234567890",
            environment="AzurePublicCloud",
            subscription_id="11111111-2222-3333-4444-111111111111",
            tenant_id="11111111-2222-3333-4444-222222222222",
            use_microsoft_graph_api=False)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] client_id: - The OAuth2 client id to connect to Azure.
        :param pulumi.Input[str] client_secret: - The OAuth2 client secret to connect to Azure.
        :param pulumi.Input[str] description: Human-friendly description of the mount for the backend.
        :param pulumi.Input[bool] disable_remount: If set, opts out of mount migration on path updates.
               See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        :param pulumi.Input[str] environment: - The Azure environment.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: - The unique path this backend should be mounted at. Defaults to `azure`.
        :param pulumi.Input[str] subscription_id: - The subscription id for the Azure Active Directory.
        :param pulumi.Input[str] tenant_id: - The tenant id for the Azure Active Directory.
        :param pulumi.Input[bool] use_microsoft_graph_api: - Indicates whether the secrets engine should use 
               the Microsoft Graph API. This parameter has been deprecated and will be ignored in `vault-1.12+`.
               For more information, please refer to the [Vault docs](https://developer.hashicorp.com/vault/api-docs/secret/azure#use_microsoft_graph_api)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BackendArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage
        ### *Vault-1.9 And Above*

        ```python
        import pulumi
        import pulumi_vault as vault

        azure = vault.azure.Backend("azure",
            client_id="11111111-2222-3333-4444-333333333333",
            client_secret="12345678901234567890",
            environment="AzurePublicCloud",
            subscription_id="11111111-2222-3333-4444-111111111111",
            tenant_id="11111111-2222-3333-4444-222222222222",
            use_microsoft_graph_api=True)
        ```
        ### *Vault-1.8 And Below*

        ```python
        import pulumi
        import pulumi_vault as vault

        azure = vault.azure.Backend("azure",
            client_id="11111111-2222-3333-4444-333333333333",
            client_secret="12345678901234567890",
            environment="AzurePublicCloud",
            subscription_id="11111111-2222-3333-4444-111111111111",
            tenant_id="11111111-2222-3333-4444-222222222222",
            use_microsoft_graph_api=False)
        ```

        :param str resource_name: The name of the resource.
        :param BackendArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BackendArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_secret: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disable_remount: Optional[pulumi.Input[bool]] = None,
                 environment: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 subscription_id: Optional[pulumi.Input[str]] = None,
                 tenant_id: Optional[pulumi.Input[str]] = None,
                 use_microsoft_graph_api: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BackendArgs.__new__(BackendArgs)

            __props__.__dict__["client_id"] = None if client_id is None else pulumi.Output.secret(client_id)
            __props__.__dict__["client_secret"] = None if client_secret is None else pulumi.Output.secret(client_secret)
            __props__.__dict__["description"] = description
            __props__.__dict__["disable_remount"] = disable_remount
            __props__.__dict__["environment"] = environment
            __props__.__dict__["namespace"] = namespace
            __props__.__dict__["path"] = path
            if subscription_id is None and not opts.urn:
                raise TypeError("Missing required property 'subscription_id'")
            __props__.__dict__["subscription_id"] = None if subscription_id is None else pulumi.Output.secret(subscription_id)
            if tenant_id is None and not opts.urn:
                raise TypeError("Missing required property 'tenant_id'")
            __props__.__dict__["tenant_id"] = None if tenant_id is None else pulumi.Output.secret(tenant_id)
            __props__.__dict__["use_microsoft_graph_api"] = use_microsoft_graph_api
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["clientId", "clientSecret", "subscriptionId", "tenantId"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Backend, __self__).__init__(
            'vault:azure/backend:Backend',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            client_id: Optional[pulumi.Input[str]] = None,
            client_secret: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            disable_remount: Optional[pulumi.Input[bool]] = None,
            environment: Optional[pulumi.Input[str]] = None,
            namespace: Optional[pulumi.Input[str]] = None,
            path: Optional[pulumi.Input[str]] = None,
            subscription_id: Optional[pulumi.Input[str]] = None,
            tenant_id: Optional[pulumi.Input[str]] = None,
            use_microsoft_graph_api: Optional[pulumi.Input[bool]] = None) -> 'Backend':
        """
        Get an existing Backend resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] client_id: - The OAuth2 client id to connect to Azure.
        :param pulumi.Input[str] client_secret: - The OAuth2 client secret to connect to Azure.
        :param pulumi.Input[str] description: Human-friendly description of the mount for the backend.
        :param pulumi.Input[bool] disable_remount: If set, opts out of mount migration on path updates.
               See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        :param pulumi.Input[str] environment: - The Azure environment.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: - The unique path this backend should be mounted at. Defaults to `azure`.
        :param pulumi.Input[str] subscription_id: - The subscription id for the Azure Active Directory.
        :param pulumi.Input[str] tenant_id: - The tenant id for the Azure Active Directory.
        :param pulumi.Input[bool] use_microsoft_graph_api: - Indicates whether the secrets engine should use 
               the Microsoft Graph API. This parameter has been deprecated and will be ignored in `vault-1.12+`.
               For more information, please refer to the [Vault docs](https://developer.hashicorp.com/vault/api-docs/secret/azure#use_microsoft_graph_api)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BackendState.__new__(_BackendState)

        __props__.__dict__["client_id"] = client_id
        __props__.__dict__["client_secret"] = client_secret
        __props__.__dict__["description"] = description
        __props__.__dict__["disable_remount"] = disable_remount
        __props__.__dict__["environment"] = environment
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["path"] = path
        __props__.__dict__["subscription_id"] = subscription_id
        __props__.__dict__["tenant_id"] = tenant_id
        __props__.__dict__["use_microsoft_graph_api"] = use_microsoft_graph_api
        return Backend(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Output[Optional[str]]:
        """
        - The OAuth2 client id to connect to Azure.
        """
        return pulumi.get(self, "client_id")

    @property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> pulumi.Output[Optional[str]]:
        """
        - The OAuth2 client secret to connect to Azure.
        """
        return pulumi.get(self, "client_secret")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Human-friendly description of the mount for the backend.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="disableRemount")
    def disable_remount(self) -> pulumi.Output[Optional[bool]]:
        """
        If set, opts out of mount migration on path updates.
        See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        """
        return pulumi.get(self, "disable_remount")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output[Optional[str]]:
        """
        - The Azure environment.
        """
        return pulumi.get(self, "environment")

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
    def path(self) -> pulumi.Output[Optional[str]]:
        """
        - The unique path this backend should be mounted at. Defaults to `azure`.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> pulumi.Output[str]:
        """
        - The subscription id for the Azure Active Directory.
        """
        return pulumi.get(self, "subscription_id")

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> pulumi.Output[str]:
        """
        - The tenant id for the Azure Active Directory.
        """
        return pulumi.get(self, "tenant_id")

    @property
    @pulumi.getter(name="useMicrosoftGraphApi")
    def use_microsoft_graph_api(self) -> pulumi.Output[bool]:
        """
        - Indicates whether the secrets engine should use 
        the Microsoft Graph API. This parameter has been deprecated and will be ignored in `vault-1.12+`.
        For more information, please refer to the [Vault docs](https://developer.hashicorp.com/vault/api-docs/secret/azure#use_microsoft_graph_api)
        """
        return pulumi.get(self, "use_microsoft_graph_api")

