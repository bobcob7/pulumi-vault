# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['AuthBackend']


class AuthBackend(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bound_issuer: Optional[pulumi.Input[str]] = None,
                 default_role: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 jwks_ca_pem: Optional[pulumi.Input[str]] = None,
                 jwks_url: Optional[pulumi.Input[str]] = None,
                 jwt_supported_algs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 jwt_validation_pubkeys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 oidc_client_id: Optional[pulumi.Input[str]] = None,
                 oidc_client_secret: Optional[pulumi.Input[str]] = None,
                 oidc_discovery_ca_pem: Optional[pulumi.Input[str]] = None,
                 oidc_discovery_url: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 tune: Optional[pulumi.Input[pulumi.InputType['AuthBackendTuneArgs']]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a resource for managing an
        [JWT auth backend within Vault](https://www.vaultproject.io/docs/auth/jwt.html).

        ## Example Usage

        Manage JWT auth backend:

        ```python
        import pulumi
        import pulumi_vault as vault

        example = vault.jwt.AuthBackend("example",
            bound_issuer="https://myco.auth0.com/",
            description="Demonstration of the Terraform JWT auth backend",
            oidc_discovery_url="https://myco.auth0.com/",
            path="jwt")
        ```

        Manage OIDC auth backend:

        ```python
        import pulumi
        import pulumi_vault as vault

        example = vault.jwt.AuthBackend("example",
            bound_issuer="https://myco.auth0.com/",
            description="Demonstration of the Terraform JWT auth backend",
            oidc_client_id="1234567890",
            oidc_client_secret="secret123456",
            oidc_discovery_url="https://myco.auth0.com/",
            path="oidc",
            tune=vault.jwt.AuthBackendTuneArgs(
                listing_visibility="unauth",
            ),
            type="oidc")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bound_issuer: The value against which to match the iss claim in a JWT
        :param pulumi.Input[str] default_role: The default role to use if none is provided during login
        :param pulumi.Input[str] description: The description of the auth backend
        :param pulumi.Input[str] jwks_ca_pem: The CA certificate or chain of certificates, in PEM format, to use to validate connections to the JWKS URL. If not set, system certificates are used.
        :param pulumi.Input[str] jwks_url: JWKS URL to use to authenticate signatures. Cannot be used with "oidc_discovery_url" or "jwt_validation_pubkeys".
        :param pulumi.Input[Sequence[pulumi.Input[str]]] jwt_supported_algs: A list of supported signing algorithms. Vault 1.1.0 defaults to [RS256] but future or past versions of Vault may differ
        :param pulumi.Input[Sequence[pulumi.Input[str]]] jwt_validation_pubkeys: A list of PEM-encoded public keys to use to authenticate signatures locally. Cannot be used in combination with `oidc_discovery_url`
        :param pulumi.Input[str] oidc_client_id: Client ID used for OIDC backends
        :param pulumi.Input[str] oidc_client_secret: Client Secret used for OIDC backends
        :param pulumi.Input[str] oidc_discovery_ca_pem: The CA certificate or chain of certificates, in PEM format, to use to validate connections to the OIDC Discovery URL. If not set, system certificates are used
        :param pulumi.Input[str] oidc_discovery_url: The OIDC Discovery URL, without any .well-known component (base path). Cannot be used in combination with `jwt_validation_pubkeys`
        :param pulumi.Input[str] path: Path to mount the JWT/OIDC auth backend
        :param pulumi.Input[str] type: Type of auth backend. Should be one of `jwt` or `oidc`. Default - `jwt`
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['bound_issuer'] = bound_issuer
            __props__['default_role'] = default_role
            __props__['description'] = description
            __props__['jwks_ca_pem'] = jwks_ca_pem
            __props__['jwks_url'] = jwks_url
            __props__['jwt_supported_algs'] = jwt_supported_algs
            __props__['jwt_validation_pubkeys'] = jwt_validation_pubkeys
            __props__['oidc_client_id'] = oidc_client_id
            __props__['oidc_client_secret'] = oidc_client_secret
            __props__['oidc_discovery_ca_pem'] = oidc_discovery_ca_pem
            __props__['oidc_discovery_url'] = oidc_discovery_url
            __props__['path'] = path
            __props__['tune'] = tune
            __props__['type'] = type
            __props__['accessor'] = None
        super(AuthBackend, __self__).__init__(
            'vault:jwt/authBackend:AuthBackend',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            accessor: Optional[pulumi.Input[str]] = None,
            bound_issuer: Optional[pulumi.Input[str]] = None,
            default_role: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            jwks_ca_pem: Optional[pulumi.Input[str]] = None,
            jwks_url: Optional[pulumi.Input[str]] = None,
            jwt_supported_algs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            jwt_validation_pubkeys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            oidc_client_id: Optional[pulumi.Input[str]] = None,
            oidc_client_secret: Optional[pulumi.Input[str]] = None,
            oidc_discovery_ca_pem: Optional[pulumi.Input[str]] = None,
            oidc_discovery_url: Optional[pulumi.Input[str]] = None,
            path: Optional[pulumi.Input[str]] = None,
            tune: Optional[pulumi.Input[pulumi.InputType['AuthBackendTuneArgs']]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'AuthBackend':
        """
        Get an existing AuthBackend resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accessor: The accessor of the JWT auth backend
        :param pulumi.Input[str] bound_issuer: The value against which to match the iss claim in a JWT
        :param pulumi.Input[str] default_role: The default role to use if none is provided during login
        :param pulumi.Input[str] description: The description of the auth backend
        :param pulumi.Input[str] jwks_ca_pem: The CA certificate or chain of certificates, in PEM format, to use to validate connections to the JWKS URL. If not set, system certificates are used.
        :param pulumi.Input[str] jwks_url: JWKS URL to use to authenticate signatures. Cannot be used with "oidc_discovery_url" or "jwt_validation_pubkeys".
        :param pulumi.Input[Sequence[pulumi.Input[str]]] jwt_supported_algs: A list of supported signing algorithms. Vault 1.1.0 defaults to [RS256] but future or past versions of Vault may differ
        :param pulumi.Input[Sequence[pulumi.Input[str]]] jwt_validation_pubkeys: A list of PEM-encoded public keys to use to authenticate signatures locally. Cannot be used in combination with `oidc_discovery_url`
        :param pulumi.Input[str] oidc_client_id: Client ID used for OIDC backends
        :param pulumi.Input[str] oidc_client_secret: Client Secret used for OIDC backends
        :param pulumi.Input[str] oidc_discovery_ca_pem: The CA certificate or chain of certificates, in PEM format, to use to validate connections to the OIDC Discovery URL. If not set, system certificates are used
        :param pulumi.Input[str] oidc_discovery_url: The OIDC Discovery URL, without any .well-known component (base path). Cannot be used in combination with `jwt_validation_pubkeys`
        :param pulumi.Input[str] path: Path to mount the JWT/OIDC auth backend
        :param pulumi.Input[str] type: Type of auth backend. Should be one of `jwt` or `oidc`. Default - `jwt`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["accessor"] = accessor
        __props__["bound_issuer"] = bound_issuer
        __props__["default_role"] = default_role
        __props__["description"] = description
        __props__["jwks_ca_pem"] = jwks_ca_pem
        __props__["jwks_url"] = jwks_url
        __props__["jwt_supported_algs"] = jwt_supported_algs
        __props__["jwt_validation_pubkeys"] = jwt_validation_pubkeys
        __props__["oidc_client_id"] = oidc_client_id
        __props__["oidc_client_secret"] = oidc_client_secret
        __props__["oidc_discovery_ca_pem"] = oidc_discovery_ca_pem
        __props__["oidc_discovery_url"] = oidc_discovery_url
        __props__["path"] = path
        __props__["tune"] = tune
        __props__["type"] = type
        return AuthBackend(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def accessor(self) -> pulumi.Output[str]:
        """
        The accessor of the JWT auth backend
        """
        return pulumi.get(self, "accessor")

    @property
    @pulumi.getter(name="boundIssuer")
    def bound_issuer(self) -> pulumi.Output[Optional[str]]:
        """
        The value against which to match the iss claim in a JWT
        """
        return pulumi.get(self, "bound_issuer")

    @property
    @pulumi.getter(name="defaultRole")
    def default_role(self) -> pulumi.Output[Optional[str]]:
        """
        The default role to use if none is provided during login
        """
        return pulumi.get(self, "default_role")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the auth backend
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="jwksCaPem")
    def jwks_ca_pem(self) -> pulumi.Output[Optional[str]]:
        """
        The CA certificate or chain of certificates, in PEM format, to use to validate connections to the JWKS URL. If not set, system certificates are used.
        """
        return pulumi.get(self, "jwks_ca_pem")

    @property
    @pulumi.getter(name="jwksUrl")
    def jwks_url(self) -> pulumi.Output[Optional[str]]:
        """
        JWKS URL to use to authenticate signatures. Cannot be used with "oidc_discovery_url" or "jwt_validation_pubkeys".
        """
        return pulumi.get(self, "jwks_url")

    @property
    @pulumi.getter(name="jwtSupportedAlgs")
    def jwt_supported_algs(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of supported signing algorithms. Vault 1.1.0 defaults to [RS256] but future or past versions of Vault may differ
        """
        return pulumi.get(self, "jwt_supported_algs")

    @property
    @pulumi.getter(name="jwtValidationPubkeys")
    def jwt_validation_pubkeys(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of PEM-encoded public keys to use to authenticate signatures locally. Cannot be used in combination with `oidc_discovery_url`
        """
        return pulumi.get(self, "jwt_validation_pubkeys")

    @property
    @pulumi.getter(name="oidcClientId")
    def oidc_client_id(self) -> pulumi.Output[Optional[str]]:
        """
        Client ID used for OIDC backends
        """
        return pulumi.get(self, "oidc_client_id")

    @property
    @pulumi.getter(name="oidcClientSecret")
    def oidc_client_secret(self) -> pulumi.Output[Optional[str]]:
        """
        Client Secret used for OIDC backends
        """
        return pulumi.get(self, "oidc_client_secret")

    @property
    @pulumi.getter(name="oidcDiscoveryCaPem")
    def oidc_discovery_ca_pem(self) -> pulumi.Output[Optional[str]]:
        """
        The CA certificate or chain of certificates, in PEM format, to use to validate connections to the OIDC Discovery URL. If not set, system certificates are used
        """
        return pulumi.get(self, "oidc_discovery_ca_pem")

    @property
    @pulumi.getter(name="oidcDiscoveryUrl")
    def oidc_discovery_url(self) -> pulumi.Output[Optional[str]]:
        """
        The OIDC Discovery URL, without any .well-known component (base path). Cannot be used in combination with `jwt_validation_pubkeys`
        """
        return pulumi.get(self, "oidc_discovery_url")

    @property
    @pulumi.getter
    def path(self) -> pulumi.Output[Optional[str]]:
        """
        Path to mount the JWT/OIDC auth backend
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter
    def tune(self) -> pulumi.Output['outputs.AuthBackendTune']:
        return pulumi.get(self, "tune")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        Type of auth backend. Should be one of `jwt` or `oidc`. Default - `jwt`
        """
        return pulumi.get(self, "type")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

