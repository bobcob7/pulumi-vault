# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['AuthBackendArgs', 'AuthBackend']

@pulumi.input_type
class AuthBackendArgs:
    def __init__(__self__, *,
                 client_email: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[str]] = None,
                 custom_endpoint: Optional[pulumi.Input['AuthBackendCustomEndpointArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disable_remount: Optional[pulumi.Input[bool]] = None,
                 local: Optional[pulumi.Input[bool]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 private_key_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AuthBackend resource.
        :param pulumi.Input[str] client_email: The clients email associated with the credentials
        :param pulumi.Input[str] client_id: The Client ID of the credentials
        :param pulumi.Input[str] credentials: A JSON string containing the contents of a GCP credentials file. If this value is empty, Vault will try to use Application Default Credentials from the machine on which the Vault server is running.
        :param pulumi.Input['AuthBackendCustomEndpointArgs'] custom_endpoint: Specifies overrides to
               [service endpoints](https://cloud.google.com/apis/design/glossary#api_service_endpoint)
               used when making API requests. This allows specific requests made during authentication
               to target alternative service endpoints for use in [Private Google Access](https://cloud.google.com/vpc/docs/configure-private-google-access)
               environments. Requires Vault 1.11+.
        :param pulumi.Input[str] description: A description of the auth method.
        :param pulumi.Input[bool] disable_remount: If set, opts out of mount migration on path updates.
               See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        :param pulumi.Input[bool] local: Specifies if the auth method is local only.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: The path to mount the auth method — this defaults to 'gcp'.
        :param pulumi.Input[str] private_key_id: The ID of the private key from the credentials
        :param pulumi.Input[str] project_id: The GCP Project ID
        """
        if client_email is not None:
            pulumi.set(__self__, "client_email", client_email)
        if client_id is not None:
            pulumi.set(__self__, "client_id", client_id)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if custom_endpoint is not None:
            pulumi.set(__self__, "custom_endpoint", custom_endpoint)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disable_remount is not None:
            pulumi.set(__self__, "disable_remount", disable_remount)
        if local is not None:
            pulumi.set(__self__, "local", local)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if private_key_id is not None:
            pulumi.set(__self__, "private_key_id", private_key_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter(name="clientEmail")
    def client_email(self) -> Optional[pulumi.Input[str]]:
        """
        The clients email associated with the credentials
        """
        return pulumi.get(self, "client_email")

    @client_email.setter
    def client_email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_email", value)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Client ID of the credentials
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input[str]]:
        """
        A JSON string containing the contents of a GCP credentials file. If this value is empty, Vault will try to use Application Default Credentials from the machine on which the Vault server is running.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter(name="customEndpoint")
    def custom_endpoint(self) -> Optional[pulumi.Input['AuthBackendCustomEndpointArgs']]:
        """
        Specifies overrides to
        [service endpoints](https://cloud.google.com/apis/design/glossary#api_service_endpoint)
        used when making API requests. This allows specific requests made during authentication
        to target alternative service endpoints for use in [Private Google Access](https://cloud.google.com/vpc/docs/configure-private-google-access)
        environments. Requires Vault 1.11+.
        """
        return pulumi.get(self, "custom_endpoint")

    @custom_endpoint.setter
    def custom_endpoint(self, value: Optional[pulumi.Input['AuthBackendCustomEndpointArgs']]):
        pulumi.set(self, "custom_endpoint", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the auth method.
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
    def local(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies if the auth method is local only.
        """
        return pulumi.get(self, "local")

    @local.setter
    def local(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "local", value)

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
        The path to mount the auth method — this defaults to 'gcp'.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter(name="privateKeyId")
    def private_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the private key from the credentials
        """
        return pulumi.get(self, "private_key_id")

    @private_key_id.setter
    def private_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The GCP Project ID
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)


@pulumi.input_type
class _AuthBackendState:
    def __init__(__self__, *,
                 client_email: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[str]] = None,
                 custom_endpoint: Optional[pulumi.Input['AuthBackendCustomEndpointArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disable_remount: Optional[pulumi.Input[bool]] = None,
                 local: Optional[pulumi.Input[bool]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 private_key_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AuthBackend resources.
        :param pulumi.Input[str] client_email: The clients email associated with the credentials
        :param pulumi.Input[str] client_id: The Client ID of the credentials
        :param pulumi.Input[str] credentials: A JSON string containing the contents of a GCP credentials file. If this value is empty, Vault will try to use Application Default Credentials from the machine on which the Vault server is running.
        :param pulumi.Input['AuthBackendCustomEndpointArgs'] custom_endpoint: Specifies overrides to
               [service endpoints](https://cloud.google.com/apis/design/glossary#api_service_endpoint)
               used when making API requests. This allows specific requests made during authentication
               to target alternative service endpoints for use in [Private Google Access](https://cloud.google.com/vpc/docs/configure-private-google-access)
               environments. Requires Vault 1.11+.
        :param pulumi.Input[str] description: A description of the auth method.
        :param pulumi.Input[bool] disable_remount: If set, opts out of mount migration on path updates.
               See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        :param pulumi.Input[bool] local: Specifies if the auth method is local only.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: The path to mount the auth method — this defaults to 'gcp'.
        :param pulumi.Input[str] private_key_id: The ID of the private key from the credentials
        :param pulumi.Input[str] project_id: The GCP Project ID
        """
        if client_email is not None:
            pulumi.set(__self__, "client_email", client_email)
        if client_id is not None:
            pulumi.set(__self__, "client_id", client_id)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if custom_endpoint is not None:
            pulumi.set(__self__, "custom_endpoint", custom_endpoint)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disable_remount is not None:
            pulumi.set(__self__, "disable_remount", disable_remount)
        if local is not None:
            pulumi.set(__self__, "local", local)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if private_key_id is not None:
            pulumi.set(__self__, "private_key_id", private_key_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter(name="clientEmail")
    def client_email(self) -> Optional[pulumi.Input[str]]:
        """
        The clients email associated with the credentials
        """
        return pulumi.get(self, "client_email")

    @client_email.setter
    def client_email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_email", value)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Client ID of the credentials
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input[str]]:
        """
        A JSON string containing the contents of a GCP credentials file. If this value is empty, Vault will try to use Application Default Credentials from the machine on which the Vault server is running.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter(name="customEndpoint")
    def custom_endpoint(self) -> Optional[pulumi.Input['AuthBackendCustomEndpointArgs']]:
        """
        Specifies overrides to
        [service endpoints](https://cloud.google.com/apis/design/glossary#api_service_endpoint)
        used when making API requests. This allows specific requests made during authentication
        to target alternative service endpoints for use in [Private Google Access](https://cloud.google.com/vpc/docs/configure-private-google-access)
        environments. Requires Vault 1.11+.
        """
        return pulumi.get(self, "custom_endpoint")

    @custom_endpoint.setter
    def custom_endpoint(self, value: Optional[pulumi.Input['AuthBackendCustomEndpointArgs']]):
        pulumi.set(self, "custom_endpoint", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the auth method.
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
    def local(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies if the auth method is local only.
        """
        return pulumi.get(self, "local")

    @local.setter
    def local(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "local", value)

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
        The path to mount the auth method — this defaults to 'gcp'.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter(name="privateKeyId")
    def private_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the private key from the credentials
        """
        return pulumi.get(self, "private_key_id")

    @private_key_id.setter
    def private_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The GCP Project ID
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)


class AuthBackend(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_email: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[str]] = None,
                 custom_endpoint: Optional[pulumi.Input[pulumi.InputType['AuthBackendCustomEndpointArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disable_remount: Optional[pulumi.Input[bool]] = None,
                 local: Optional[pulumi.Input[bool]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 private_key_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource to configure the [GCP auth backend within Vault](https://www.vaultproject.io/docs/auth/gcp.html).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_vault as vault

        gcp = vault.gcp.AuthBackend("gcp",
            credentials=(lambda path: open(path).read())("vault-gcp-credentials.json"),
            custom_endpoint=vault.gcp.AuthBackendCustomEndpointArgs(
                api="www.googleapis.com",
                iam="iam.googleapis.com",
                crm="cloudresourcemanager.googleapis.com",
                compute="compute.googleapis.com",
            ))
        ```

        ## Import

        GCP authentication backends can be imported using the backend name, e.g.

        ```sh
         $ pulumi import vault:gcp/authBackend:AuthBackend gcp gcp
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] client_email: The clients email associated with the credentials
        :param pulumi.Input[str] client_id: The Client ID of the credentials
        :param pulumi.Input[str] credentials: A JSON string containing the contents of a GCP credentials file. If this value is empty, Vault will try to use Application Default Credentials from the machine on which the Vault server is running.
        :param pulumi.Input[pulumi.InputType['AuthBackendCustomEndpointArgs']] custom_endpoint: Specifies overrides to
               [service endpoints](https://cloud.google.com/apis/design/glossary#api_service_endpoint)
               used when making API requests. This allows specific requests made during authentication
               to target alternative service endpoints for use in [Private Google Access](https://cloud.google.com/vpc/docs/configure-private-google-access)
               environments. Requires Vault 1.11+.
        :param pulumi.Input[str] description: A description of the auth method.
        :param pulumi.Input[bool] disable_remount: If set, opts out of mount migration on path updates.
               See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        :param pulumi.Input[bool] local: Specifies if the auth method is local only.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: The path to mount the auth method — this defaults to 'gcp'.
        :param pulumi.Input[str] private_key_id: The ID of the private key from the credentials
        :param pulumi.Input[str] project_id: The GCP Project ID
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AuthBackendArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to configure the [GCP auth backend within Vault](https://www.vaultproject.io/docs/auth/gcp.html).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_vault as vault

        gcp = vault.gcp.AuthBackend("gcp",
            credentials=(lambda path: open(path).read())("vault-gcp-credentials.json"),
            custom_endpoint=vault.gcp.AuthBackendCustomEndpointArgs(
                api="www.googleapis.com",
                iam="iam.googleapis.com",
                crm="cloudresourcemanager.googleapis.com",
                compute="compute.googleapis.com",
            ))
        ```

        ## Import

        GCP authentication backends can be imported using the backend name, e.g.

        ```sh
         $ pulumi import vault:gcp/authBackend:AuthBackend gcp gcp
        ```

        :param str resource_name: The name of the resource.
        :param AuthBackendArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AuthBackendArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_email: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[str]] = None,
                 custom_endpoint: Optional[pulumi.Input[pulumi.InputType['AuthBackendCustomEndpointArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disable_remount: Optional[pulumi.Input[bool]] = None,
                 local: Optional[pulumi.Input[bool]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 private_key_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AuthBackendArgs.__new__(AuthBackendArgs)

            __props__.__dict__["client_email"] = client_email
            __props__.__dict__["client_id"] = client_id
            __props__.__dict__["credentials"] = None if credentials is None else pulumi.Output.secret(credentials)
            __props__.__dict__["custom_endpoint"] = custom_endpoint
            __props__.__dict__["description"] = description
            __props__.__dict__["disable_remount"] = disable_remount
            __props__.__dict__["local"] = local
            __props__.__dict__["namespace"] = namespace
            __props__.__dict__["path"] = path
            __props__.__dict__["private_key_id"] = private_key_id
            __props__.__dict__["project_id"] = project_id
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["credentials"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(AuthBackend, __self__).__init__(
            'vault:gcp/authBackend:AuthBackend',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            client_email: Optional[pulumi.Input[str]] = None,
            client_id: Optional[pulumi.Input[str]] = None,
            credentials: Optional[pulumi.Input[str]] = None,
            custom_endpoint: Optional[pulumi.Input[pulumi.InputType['AuthBackendCustomEndpointArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            disable_remount: Optional[pulumi.Input[bool]] = None,
            local: Optional[pulumi.Input[bool]] = None,
            namespace: Optional[pulumi.Input[str]] = None,
            path: Optional[pulumi.Input[str]] = None,
            private_key_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None) -> 'AuthBackend':
        """
        Get an existing AuthBackend resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] client_email: The clients email associated with the credentials
        :param pulumi.Input[str] client_id: The Client ID of the credentials
        :param pulumi.Input[str] credentials: A JSON string containing the contents of a GCP credentials file. If this value is empty, Vault will try to use Application Default Credentials from the machine on which the Vault server is running.
        :param pulumi.Input[pulumi.InputType['AuthBackendCustomEndpointArgs']] custom_endpoint: Specifies overrides to
               [service endpoints](https://cloud.google.com/apis/design/glossary#api_service_endpoint)
               used when making API requests. This allows specific requests made during authentication
               to target alternative service endpoints for use in [Private Google Access](https://cloud.google.com/vpc/docs/configure-private-google-access)
               environments. Requires Vault 1.11+.
        :param pulumi.Input[str] description: A description of the auth method.
        :param pulumi.Input[bool] disable_remount: If set, opts out of mount migration on path updates.
               See here for more info on [Mount Migration](https://www.vaultproject.io/docs/concepts/mount-migration)
        :param pulumi.Input[bool] local: Specifies if the auth method is local only.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[str] path: The path to mount the auth method — this defaults to 'gcp'.
        :param pulumi.Input[str] private_key_id: The ID of the private key from the credentials
        :param pulumi.Input[str] project_id: The GCP Project ID
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AuthBackendState.__new__(_AuthBackendState)

        __props__.__dict__["client_email"] = client_email
        __props__.__dict__["client_id"] = client_id
        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["custom_endpoint"] = custom_endpoint
        __props__.__dict__["description"] = description
        __props__.__dict__["disable_remount"] = disable_remount
        __props__.__dict__["local"] = local
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["path"] = path
        __props__.__dict__["private_key_id"] = private_key_id
        __props__.__dict__["project_id"] = project_id
        return AuthBackend(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clientEmail")
    def client_email(self) -> pulumi.Output[str]:
        """
        The clients email associated with the credentials
        """
        return pulumi.get(self, "client_email")

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Output[str]:
        """
        The Client ID of the credentials
        """
        return pulumi.get(self, "client_id")

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output[Optional[str]]:
        """
        A JSON string containing the contents of a GCP credentials file. If this value is empty, Vault will try to use Application Default Credentials from the machine on which the Vault server is running.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter(name="customEndpoint")
    def custom_endpoint(self) -> pulumi.Output[Optional['outputs.AuthBackendCustomEndpoint']]:
        """
        Specifies overrides to
        [service endpoints](https://cloud.google.com/apis/design/glossary#api_service_endpoint)
        used when making API requests. This allows specific requests made during authentication
        to target alternative service endpoints for use in [Private Google Access](https://cloud.google.com/vpc/docs/configure-private-google-access)
        environments. Requires Vault 1.11+.
        """
        return pulumi.get(self, "custom_endpoint")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A description of the auth method.
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
    def local(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies if the auth method is local only.
        """
        return pulumi.get(self, "local")

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
        The path to mount the auth method — this defaults to 'gcp'.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter(name="privateKeyId")
    def private_key_id(self) -> pulumi.Output[str]:
        """
        The ID of the private key from the credentials
        """
        return pulumi.get(self, "private_key_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The GCP Project ID
        """
        return pulumi.get(self, "project_id")

