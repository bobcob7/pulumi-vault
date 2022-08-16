# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from ._inputs import *

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 address: pulumi.Input[str],
                 token: pulumi.Input[str],
                 add_address_to_env: Optional[pulumi.Input[str]] = None,
                 auth_logins: Optional[pulumi.Input[Sequence[pulumi.Input['ProviderAuthLoginArgs']]]] = None,
                 ca_cert_dir: Optional[pulumi.Input[str]] = None,
                 ca_cert_file: Optional[pulumi.Input[str]] = None,
                 client_auths: Optional[pulumi.Input[Sequence[pulumi.Input['ProviderClientAuthArgs']]]] = None,
                 headers: Optional[pulumi.Input[Sequence[pulumi.Input['ProviderHeaderArgs']]]] = None,
                 max_lease_ttl_seconds: Optional[pulumi.Input[int]] = None,
                 max_retries: Optional[pulumi.Input[int]] = None,
                 max_retries_ccc: Optional[pulumi.Input[int]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 skip_child_token: Optional[pulumi.Input[bool]] = None,
                 skip_tls_verify: Optional[pulumi.Input[bool]] = None,
                 tls_server_name: Optional[pulumi.Input[str]] = None,
                 token_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Provider resource.
        :param pulumi.Input[str] address: URL of the root of the target Vault server.
        :param pulumi.Input[str] token: Token to use to authenticate to Vault.
        :param pulumi.Input[str] add_address_to_env: If true, adds the value of the `address` argument to the Terraform process environment.
        :param pulumi.Input[Sequence[pulumi.Input['ProviderAuthLoginArgs']]] auth_logins: Login to vault with an existing auth method using auth/<mount>/login
        :param pulumi.Input[str] ca_cert_dir: Path to directory containing CA certificate files to validate the server's certificate.
        :param pulumi.Input[str] ca_cert_file: Path to a CA certificate file to validate the server's certificate.
        :param pulumi.Input[Sequence[pulumi.Input['ProviderClientAuthArgs']]] client_auths: Client authentication credentials.
        :param pulumi.Input[Sequence[pulumi.Input['ProviderHeaderArgs']]] headers: The headers to send with each Vault request.
        :param pulumi.Input[int] max_lease_ttl_seconds: Maximum TTL for secret leases requested by this provider.
        :param pulumi.Input[int] max_retries: Maximum number of retries when a 5xx error code is encountered.
        :param pulumi.Input[int] max_retries_ccc: Maximum number of retries for Client Controlled Consistency related operations
        :param pulumi.Input[str] namespace: The namespace to use. Available only for Vault Enterprise.
        :param pulumi.Input[bool] skip_child_token: Set this to true to prevent the creation of ephemeral child token used by this provider.
        :param pulumi.Input[bool] skip_tls_verify: Set this to true only if the target Vault server is an insecure development instance.
        :param pulumi.Input[str] tls_server_name: Name to use as the SNI host when connecting via TLS.
        :param pulumi.Input[str] token_name: Token name to use for creating the Vault child token.
        """
        pulumi.set(__self__, "address", address)
        pulumi.set(__self__, "token", token)
        if add_address_to_env is not None:
            pulumi.set(__self__, "add_address_to_env", add_address_to_env)
        if auth_logins is not None:
            pulumi.set(__self__, "auth_logins", auth_logins)
        if ca_cert_dir is not None:
            pulumi.set(__self__, "ca_cert_dir", ca_cert_dir)
        if ca_cert_file is not None:
            pulumi.set(__self__, "ca_cert_file", ca_cert_file)
        if client_auths is not None:
            pulumi.set(__self__, "client_auths", client_auths)
        if headers is not None:
            pulumi.set(__self__, "headers", headers)
        if max_lease_ttl_seconds is None:
            max_lease_ttl_seconds = (_utilities.get_env_int('TERRAFORM_VAULT_MAX_TTL') or 1200)
        if max_lease_ttl_seconds is not None:
            pulumi.set(__self__, "max_lease_ttl_seconds", max_lease_ttl_seconds)
        if max_retries is None:
            max_retries = (_utilities.get_env_int('VAULT_MAX_RETRIES') or 2)
        if max_retries is not None:
            pulumi.set(__self__, "max_retries", max_retries)
        if max_retries_ccc is not None:
            pulumi.set(__self__, "max_retries_ccc", max_retries_ccc)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if skip_child_token is not None:
            pulumi.set(__self__, "skip_child_token", skip_child_token)
        if skip_tls_verify is None:
            skip_tls_verify = _utilities.get_env_bool('VAULT_SKIP_VERIFY')
        if skip_tls_verify is not None:
            pulumi.set(__self__, "skip_tls_verify", skip_tls_verify)
        if tls_server_name is not None:
            pulumi.set(__self__, "tls_server_name", tls_server_name)
        if token_name is not None:
            pulumi.set(__self__, "token_name", token_name)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Input[str]:
        """
        URL of the root of the target Vault server.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: pulumi.Input[str]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter
    def token(self) -> pulumi.Input[str]:
        """
        Token to use to authenticate to Vault.
        """
        return pulumi.get(self, "token")

    @token.setter
    def token(self, value: pulumi.Input[str]):
        pulumi.set(self, "token", value)

    @property
    @pulumi.getter(name="addAddressToEnv")
    def add_address_to_env(self) -> Optional[pulumi.Input[str]]:
        """
        If true, adds the value of the `address` argument to the Terraform process environment.
        """
        return pulumi.get(self, "add_address_to_env")

    @add_address_to_env.setter
    def add_address_to_env(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "add_address_to_env", value)

    @property
    @pulumi.getter(name="authLogins")
    def auth_logins(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ProviderAuthLoginArgs']]]]:
        """
        Login to vault with an existing auth method using auth/<mount>/login
        """
        return pulumi.get(self, "auth_logins")

    @auth_logins.setter
    def auth_logins(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ProviderAuthLoginArgs']]]]):
        pulumi.set(self, "auth_logins", value)

    @property
    @pulumi.getter(name="caCertDir")
    def ca_cert_dir(self) -> Optional[pulumi.Input[str]]:
        """
        Path to directory containing CA certificate files to validate the server's certificate.
        """
        return pulumi.get(self, "ca_cert_dir")

    @ca_cert_dir.setter
    def ca_cert_dir(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ca_cert_dir", value)

    @property
    @pulumi.getter(name="caCertFile")
    def ca_cert_file(self) -> Optional[pulumi.Input[str]]:
        """
        Path to a CA certificate file to validate the server's certificate.
        """
        return pulumi.get(self, "ca_cert_file")

    @ca_cert_file.setter
    def ca_cert_file(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ca_cert_file", value)

    @property
    @pulumi.getter(name="clientAuths")
    def client_auths(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ProviderClientAuthArgs']]]]:
        """
        Client authentication credentials.
        """
        return pulumi.get(self, "client_auths")

    @client_auths.setter
    def client_auths(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ProviderClientAuthArgs']]]]):
        pulumi.set(self, "client_auths", value)

    @property
    @pulumi.getter
    def headers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ProviderHeaderArgs']]]]:
        """
        The headers to send with each Vault request.
        """
        return pulumi.get(self, "headers")

    @headers.setter
    def headers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ProviderHeaderArgs']]]]):
        pulumi.set(self, "headers", value)

    @property
    @pulumi.getter(name="maxLeaseTtlSeconds")
    def max_lease_ttl_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum TTL for secret leases requested by this provider.
        """
        return pulumi.get(self, "max_lease_ttl_seconds")

    @max_lease_ttl_seconds.setter
    def max_lease_ttl_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_lease_ttl_seconds", value)

    @property
    @pulumi.getter(name="maxRetries")
    def max_retries(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum number of retries when a 5xx error code is encountered.
        """
        return pulumi.get(self, "max_retries")

    @max_retries.setter
    def max_retries(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_retries", value)

    @property
    @pulumi.getter(name="maxRetriesCcc")
    def max_retries_ccc(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum number of retries for Client Controlled Consistency related operations
        """
        return pulumi.get(self, "max_retries_ccc")

    @max_retries_ccc.setter
    def max_retries_ccc(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_retries_ccc", value)

    @property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[str]]:
        """
        The namespace to use. Available only for Vault Enterprise.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace", value)

    @property
    @pulumi.getter(name="skipChildToken")
    def skip_child_token(self) -> Optional[pulumi.Input[bool]]:
        """
        Set this to true to prevent the creation of ephemeral child token used by this provider.
        """
        return pulumi.get(self, "skip_child_token")

    @skip_child_token.setter
    def skip_child_token(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_child_token", value)

    @property
    @pulumi.getter(name="skipTlsVerify")
    def skip_tls_verify(self) -> Optional[pulumi.Input[bool]]:
        """
        Set this to true only if the target Vault server is an insecure development instance.
        """
        return pulumi.get(self, "skip_tls_verify")

    @skip_tls_verify.setter
    def skip_tls_verify(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_tls_verify", value)

    @property
    @pulumi.getter(name="tlsServerName")
    def tls_server_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name to use as the SNI host when connecting via TLS.
        """
        return pulumi.get(self, "tls_server_name")

    @tls_server_name.setter
    def tls_server_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tls_server_name", value)

    @property
    @pulumi.getter(name="tokenName")
    def token_name(self) -> Optional[pulumi.Input[str]]:
        """
        Token name to use for creating the Vault child token.
        """
        return pulumi.get(self, "token_name")

    @token_name.setter
    def token_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token_name", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 add_address_to_env: Optional[pulumi.Input[str]] = None,
                 address: Optional[pulumi.Input[str]] = None,
                 auth_logins: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProviderAuthLoginArgs']]]]] = None,
                 ca_cert_dir: Optional[pulumi.Input[str]] = None,
                 ca_cert_file: Optional[pulumi.Input[str]] = None,
                 client_auths: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProviderClientAuthArgs']]]]] = None,
                 headers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProviderHeaderArgs']]]]] = None,
                 max_lease_ttl_seconds: Optional[pulumi.Input[int]] = None,
                 max_retries: Optional[pulumi.Input[int]] = None,
                 max_retries_ccc: Optional[pulumi.Input[int]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 skip_child_token: Optional[pulumi.Input[bool]] = None,
                 skip_tls_verify: Optional[pulumi.Input[bool]] = None,
                 tls_server_name: Optional[pulumi.Input[str]] = None,
                 token: Optional[pulumi.Input[str]] = None,
                 token_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The provider type for the vault package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] add_address_to_env: If true, adds the value of the `address` argument to the Terraform process environment.
        :param pulumi.Input[str] address: URL of the root of the target Vault server.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProviderAuthLoginArgs']]]] auth_logins: Login to vault with an existing auth method using auth/<mount>/login
        :param pulumi.Input[str] ca_cert_dir: Path to directory containing CA certificate files to validate the server's certificate.
        :param pulumi.Input[str] ca_cert_file: Path to a CA certificate file to validate the server's certificate.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProviderClientAuthArgs']]]] client_auths: Client authentication credentials.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProviderHeaderArgs']]]] headers: The headers to send with each Vault request.
        :param pulumi.Input[int] max_lease_ttl_seconds: Maximum TTL for secret leases requested by this provider.
        :param pulumi.Input[int] max_retries: Maximum number of retries when a 5xx error code is encountered.
        :param pulumi.Input[int] max_retries_ccc: Maximum number of retries for Client Controlled Consistency related operations
        :param pulumi.Input[str] namespace: The namespace to use. Available only for Vault Enterprise.
        :param pulumi.Input[bool] skip_child_token: Set this to true to prevent the creation of ephemeral child token used by this provider.
        :param pulumi.Input[bool] skip_tls_verify: Set this to true only if the target Vault server is an insecure development instance.
        :param pulumi.Input[str] tls_server_name: Name to use as the SNI host when connecting via TLS.
        :param pulumi.Input[str] token: Token to use to authenticate to Vault.
        :param pulumi.Input[str] token_name: Token name to use for creating the Vault child token.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProviderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the vault package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 add_address_to_env: Optional[pulumi.Input[str]] = None,
                 address: Optional[pulumi.Input[str]] = None,
                 auth_logins: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProviderAuthLoginArgs']]]]] = None,
                 ca_cert_dir: Optional[pulumi.Input[str]] = None,
                 ca_cert_file: Optional[pulumi.Input[str]] = None,
                 client_auths: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProviderClientAuthArgs']]]]] = None,
                 headers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProviderHeaderArgs']]]]] = None,
                 max_lease_ttl_seconds: Optional[pulumi.Input[int]] = None,
                 max_retries: Optional[pulumi.Input[int]] = None,
                 max_retries_ccc: Optional[pulumi.Input[int]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 skip_child_token: Optional[pulumi.Input[bool]] = None,
                 skip_tls_verify: Optional[pulumi.Input[bool]] = None,
                 tls_server_name: Optional[pulumi.Input[str]] = None,
                 token: Optional[pulumi.Input[str]] = None,
                 token_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            __props__.__dict__["add_address_to_env"] = add_address_to_env
            if address is None and not opts.urn:
                raise TypeError("Missing required property 'address'")
            __props__.__dict__["address"] = address
            __props__.__dict__["auth_logins"] = pulumi.Output.from_input(auth_logins).apply(pulumi.runtime.to_json) if auth_logins is not None else None
            __props__.__dict__["ca_cert_dir"] = ca_cert_dir
            __props__.__dict__["ca_cert_file"] = ca_cert_file
            __props__.__dict__["client_auths"] = pulumi.Output.from_input(client_auths).apply(pulumi.runtime.to_json) if client_auths is not None else None
            __props__.__dict__["headers"] = pulumi.Output.from_input(headers).apply(pulumi.runtime.to_json) if headers is not None else None
            if max_lease_ttl_seconds is None:
                max_lease_ttl_seconds = (_utilities.get_env_int('TERRAFORM_VAULT_MAX_TTL') or 1200)
            __props__.__dict__["max_lease_ttl_seconds"] = pulumi.Output.from_input(max_lease_ttl_seconds).apply(pulumi.runtime.to_json) if max_lease_ttl_seconds is not None else None
            if max_retries is None:
                max_retries = (_utilities.get_env_int('VAULT_MAX_RETRIES') or 2)
            __props__.__dict__["max_retries"] = pulumi.Output.from_input(max_retries).apply(pulumi.runtime.to_json) if max_retries is not None else None
            __props__.__dict__["max_retries_ccc"] = pulumi.Output.from_input(max_retries_ccc).apply(pulumi.runtime.to_json) if max_retries_ccc is not None else None
            __props__.__dict__["namespace"] = namespace
            __props__.__dict__["skip_child_token"] = pulumi.Output.from_input(skip_child_token).apply(pulumi.runtime.to_json) if skip_child_token is not None else None
            if skip_tls_verify is None:
                skip_tls_verify = _utilities.get_env_bool('VAULT_SKIP_VERIFY')
            __props__.__dict__["skip_tls_verify"] = pulumi.Output.from_input(skip_tls_verify).apply(pulumi.runtime.to_json) if skip_tls_verify is not None else None
            __props__.__dict__["tls_server_name"] = tls_server_name
            if token is None and not opts.urn:
                raise TypeError("Missing required property 'token'")
            __props__.__dict__["token"] = token
            __props__.__dict__["token_name"] = token_name
        super(Provider, __self__).__init__(
            'vault',
            resource_name,
            __props__,
            opts)

    @property
    @pulumi.getter(name="addAddressToEnv")
    def add_address_to_env(self) -> pulumi.Output[Optional[str]]:
        """
        If true, adds the value of the `address` argument to the Terraform process environment.
        """
        return pulumi.get(self, "add_address_to_env")

    @property
    @pulumi.getter
    def address(self) -> pulumi.Output[str]:
        """
        URL of the root of the target Vault server.
        """
        return pulumi.get(self, "address")

    @property
    @pulumi.getter(name="caCertDir")
    def ca_cert_dir(self) -> pulumi.Output[Optional[str]]:
        """
        Path to directory containing CA certificate files to validate the server's certificate.
        """
        return pulumi.get(self, "ca_cert_dir")

    @property
    @pulumi.getter(name="caCertFile")
    def ca_cert_file(self) -> pulumi.Output[Optional[str]]:
        """
        Path to a CA certificate file to validate the server's certificate.
        """
        return pulumi.get(self, "ca_cert_file")

    @property
    @pulumi.getter
    def namespace(self) -> pulumi.Output[Optional[str]]:
        """
        The namespace to use. Available only for Vault Enterprise.
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter(name="tlsServerName")
    def tls_server_name(self) -> pulumi.Output[Optional[str]]:
        """
        Name to use as the SNI host when connecting via TLS.
        """
        return pulumi.get(self, "tls_server_name")

    @property
    @pulumi.getter
    def token(self) -> pulumi.Output[str]:
        """
        Token to use to authenticate to Vault.
        """
        return pulumi.get(self, "token")

    @property
    @pulumi.getter(name="tokenName")
    def token_name(self) -> pulumi.Output[Optional[str]]:
        """
        Token name to use for creating the Vault child token.
        """
        return pulumi.get(self, "token_name")

