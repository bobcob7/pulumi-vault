# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class CertAuthBackendRole(pulumi.CustomResource):
    allowed_common_names: pulumi.Output[list]
    """
    Allowed the common names for authenticated client certificates
    """
    allowed_dns_sans: pulumi.Output[list]
    """
    Allowed alternative dns names for authenticated client certificates
    """
    allowed_email_sans: pulumi.Output[list]
    """
    Allowed emails for authenticated client certificates
    """
    allowed_names: pulumi.Output[list]
    """
    Allowed subject names for authenticated client certificates
    """
    allowed_organization_units: pulumi.Output[list]
    """
    Allowed organization units for authenticated client certificates
    """
    allowed_uri_sans: pulumi.Output[list]
    """
    Allowed URIs for authenticated client certificates
    """
    backend: pulumi.Output[str]
    """
    Path to the mounted Cert auth backend
    """
    bound_cidrs: pulumi.Output[list]
    """
    Restriction usage of the
    certificates to client IPs falling within the range of the specified CIDRs
    """
    certificate: pulumi.Output[str]
    """
    CA certificate used to validate client certificates
    """
    display_name: pulumi.Output[str]
    """
    The name to display on tokens issued under this role.
    """
    max_ttl: pulumi.Output[str]
    """
    The maximum allowed lifetime of tokens
    issued using this role, provided as a number of seconds.
    """
    name: pulumi.Output[str]
    """
    Name of the role
    """
    period: pulumi.Output[str]
    """
    If set, indicates that the
    token generated using this role should never expire. The token should be renewed within the
    duration specified by this value. At each renewal, the token's TTL will be set to the
    value of this field. Specified in seconds.
    """
    policies: pulumi.Output[list]
    """
    An array of strings
    specifying the policies to be set on tokens issued using this role.
    """
    required_extensions: pulumi.Output[list]
    """
    TLS extensions required on client certificates
    """
    token_bound_cidrs: pulumi.Output[list]
    """
    List of CIDR blocks; if set, specifies blocks of IP
    addresses which can authenticate successfully, and ties the resulting token to these blocks
    as well.
    """
    token_explicit_max_ttl: pulumi.Output[float]
    """
    If set, will encode an
    [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
    onto the token in number of seconds. This is a hard cap even if `token_ttl` and
    `token_max_ttl` would otherwise allow a renewal.
    """
    token_max_ttl: pulumi.Output[float]
    """
    The maximum lifetime for generated tokens in number of seconds.
    Its current value will be referenced at renewal time.
    """
    token_no_default_policy: pulumi.Output[bool]
    """
    If set, the default policy will not be set on
    generated tokens; otherwise it will be added to the policies set in token_policies.
    """
    token_num_uses: pulumi.Output[float]
    """
    The
    [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
    if any, in number of seconds to set on the token.
    """
    token_period: pulumi.Output[float]
    """
    If set, indicates that the
    token generated using this role should never expire. The token should be renewed within the
    duration specified by this value. At each renewal, the token's TTL will be set to the
    value of this field. Specified in seconds.
    """
    token_policies: pulumi.Output[list]
    """
    List of policies to encode onto generated tokens. Depending
    on the auth method, this list may be supplemented by user/group/other values.
    """
    token_ttl: pulumi.Output[float]
    """
    The incremental lifetime for generated tokens in number of seconds.
    Its current value will be referenced at renewal time.
    """
    token_type: pulumi.Output[str]
    """
    The type of token that should be generated. Can be `service`,
    `batch`, or `default` to use the mount's tuned default (which unless changed will be
    `service` tokens). For token store roles, there are two additional possibilities:
    `default-service` and `default-batch` which specify the type to return unless the client
    requests a different type at generation time.
    """
    ttl: pulumi.Output[str]
    """
    The TTL period of tokens issued
    using this role, provided as a number of seconds.
    """
    def __init__(__self__, resource_name, opts=None, allowed_common_names=None, allowed_dns_sans=None, allowed_email_sans=None, allowed_names=None, allowed_organization_units=None, allowed_uri_sans=None, backend=None, bound_cidrs=None, certificate=None, display_name=None, max_ttl=None, name=None, period=None, policies=None, required_extensions=None, token_bound_cidrs=None, token_explicit_max_ttl=None, token_max_ttl=None, token_no_default_policy=None, token_num_uses=None, token_period=None, token_policies=None, token_ttl=None, token_type=None, ttl=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a resource to create a role in an [Cert auth backend within Vault](https://www.vaultproject.io/docs/auth/cert.html).

        ## Example Usage



        ```python
        import pulumi
        import pulumi_vault as vault

        cert_auth_backend = vault.AuthBackend("certAuthBackend",
            path="cert",
            type="cert")
        cert_cert_auth_backend_role = vault.CertAuthBackendRole("certCertAuthBackendRole",
            certificate=(lambda path: open(path).read())("/path/to/certs/ca-cert.pem"),
            backend=cert_auth_backend.path,
            allowed_names=[
                "foo.example.org",
                "baz.example.org",
            ],
            token_ttl=300,
            token_max_ttl=600,
            token_policies=["foo"])
        ```


        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[list] allowed_common_names: Allowed the common names for authenticated client certificates
        :param pulumi.Input[list] allowed_dns_sans: Allowed alternative dns names for authenticated client certificates
        :param pulumi.Input[list] allowed_email_sans: Allowed emails for authenticated client certificates
        :param pulumi.Input[list] allowed_names: Allowed subject names for authenticated client certificates
        :param pulumi.Input[list] allowed_organization_units: Allowed organization units for authenticated client certificates
        :param pulumi.Input[list] allowed_uri_sans: Allowed URIs for authenticated client certificates
        :param pulumi.Input[str] backend: Path to the mounted Cert auth backend
        :param pulumi.Input[list] bound_cidrs: Restriction usage of the
               certificates to client IPs falling within the range of the specified CIDRs
        :param pulumi.Input[str] certificate: CA certificate used to validate client certificates
        :param pulumi.Input[str] display_name: The name to display on tokens issued under this role.
        :param pulumi.Input[str] max_ttl: The maximum allowed lifetime of tokens
               issued using this role, provided as a number of seconds.
        :param pulumi.Input[str] name: Name of the role
        :param pulumi.Input[str] period: If set, indicates that the
               token generated using this role should never expire. The token should be renewed within the
               duration specified by this value. At each renewal, the token's TTL will be set to the
               value of this field. Specified in seconds.
        :param pulumi.Input[list] policies: An array of strings
               specifying the policies to be set on tokens issued using this role.
        :param pulumi.Input[list] required_extensions: TLS extensions required on client certificates
        :param pulumi.Input[list] token_bound_cidrs: List of CIDR blocks; if set, specifies blocks of IP
               addresses which can authenticate successfully, and ties the resulting token to these blocks
               as well.
        :param pulumi.Input[float] token_explicit_max_ttl: If set, will encode an
               [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
               onto the token in number of seconds. This is a hard cap even if `token_ttl` and
               `token_max_ttl` would otherwise allow a renewal.
        :param pulumi.Input[float] token_max_ttl: The maximum lifetime for generated tokens in number of seconds.
               Its current value will be referenced at renewal time.
        :param pulumi.Input[bool] token_no_default_policy: If set, the default policy will not be set on
               generated tokens; otherwise it will be added to the policies set in token_policies.
        :param pulumi.Input[float] token_num_uses: The
               [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
               if any, in number of seconds to set on the token.
        :param pulumi.Input[float] token_period: If set, indicates that the
               token generated using this role should never expire. The token should be renewed within the
               duration specified by this value. At each renewal, the token's TTL will be set to the
               value of this field. Specified in seconds.
        :param pulumi.Input[list] token_policies: List of policies to encode onto generated tokens. Depending
               on the auth method, this list may be supplemented by user/group/other values.
        :param pulumi.Input[float] token_ttl: The incremental lifetime for generated tokens in number of seconds.
               Its current value will be referenced at renewal time.
        :param pulumi.Input[str] token_type: The type of token that should be generated. Can be `service`,
               `batch`, or `default` to use the mount's tuned default (which unless changed will be
               `service` tokens). For token store roles, there are two additional possibilities:
               `default-service` and `default-batch` which specify the type to return unless the client
               requests a different type at generation time.
        :param pulumi.Input[str] ttl: The TTL period of tokens issued
               using this role, provided as a number of seconds.
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
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['allowed_common_names'] = allowed_common_names
            __props__['allowed_dns_sans'] = allowed_dns_sans
            __props__['allowed_email_sans'] = allowed_email_sans
            __props__['allowed_names'] = allowed_names
            __props__['allowed_organization_units'] = allowed_organization_units
            __props__['allowed_uri_sans'] = allowed_uri_sans
            __props__['backend'] = backend
            if bound_cidrs is not None:
                warnings.warn("use `token_bound_cidrs` instead if you are running Vault >= 1.2", DeprecationWarning)
                pulumi.log.warn("bound_cidrs is deprecated: use `token_bound_cidrs` instead if you are running Vault >= 1.2")
            __props__['bound_cidrs'] = bound_cidrs
            if certificate is None:
                raise TypeError("Missing required property 'certificate'")
            __props__['certificate'] = certificate
            __props__['display_name'] = display_name
            if max_ttl is not None:
                warnings.warn("use `token_max_ttl` instead if you are running Vault >= 1.2", DeprecationWarning)
                pulumi.log.warn("max_ttl is deprecated: use `token_max_ttl` instead if you are running Vault >= 1.2")
            __props__['max_ttl'] = max_ttl
            __props__['name'] = name
            if period is not None:
                warnings.warn("use `token_period` instead if you are running Vault >= 1.2", DeprecationWarning)
                pulumi.log.warn("period is deprecated: use `token_period` instead if you are running Vault >= 1.2")
            __props__['period'] = period
            if policies is not None:
                warnings.warn("use `token_policies` instead if you are running Vault >= 1.2", DeprecationWarning)
                pulumi.log.warn("policies is deprecated: use `token_policies` instead if you are running Vault >= 1.2")
            __props__['policies'] = policies
            __props__['required_extensions'] = required_extensions
            __props__['token_bound_cidrs'] = token_bound_cidrs
            __props__['token_explicit_max_ttl'] = token_explicit_max_ttl
            __props__['token_max_ttl'] = token_max_ttl
            __props__['token_no_default_policy'] = token_no_default_policy
            __props__['token_num_uses'] = token_num_uses
            __props__['token_period'] = token_period
            __props__['token_policies'] = token_policies
            __props__['token_ttl'] = token_ttl
            __props__['token_type'] = token_type
            if ttl is not None:
                warnings.warn("use `token_ttl` instead if you are running Vault >= 1.2", DeprecationWarning)
                pulumi.log.warn("ttl is deprecated: use `token_ttl` instead if you are running Vault >= 1.2")
            __props__['ttl'] = ttl
        super(CertAuthBackendRole, __self__).__init__(
            'vault:index/certAuthBackendRole:CertAuthBackendRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, allowed_common_names=None, allowed_dns_sans=None, allowed_email_sans=None, allowed_names=None, allowed_organization_units=None, allowed_uri_sans=None, backend=None, bound_cidrs=None, certificate=None, display_name=None, max_ttl=None, name=None, period=None, policies=None, required_extensions=None, token_bound_cidrs=None, token_explicit_max_ttl=None, token_max_ttl=None, token_no_default_policy=None, token_num_uses=None, token_period=None, token_policies=None, token_ttl=None, token_type=None, ttl=None):
        """
        Get an existing CertAuthBackendRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[list] allowed_common_names: Allowed the common names for authenticated client certificates
        :param pulumi.Input[list] allowed_dns_sans: Allowed alternative dns names for authenticated client certificates
        :param pulumi.Input[list] allowed_email_sans: Allowed emails for authenticated client certificates
        :param pulumi.Input[list] allowed_names: Allowed subject names for authenticated client certificates
        :param pulumi.Input[list] allowed_organization_units: Allowed organization units for authenticated client certificates
        :param pulumi.Input[list] allowed_uri_sans: Allowed URIs for authenticated client certificates
        :param pulumi.Input[str] backend: Path to the mounted Cert auth backend
        :param pulumi.Input[list] bound_cidrs: Restriction usage of the
               certificates to client IPs falling within the range of the specified CIDRs
        :param pulumi.Input[str] certificate: CA certificate used to validate client certificates
        :param pulumi.Input[str] display_name: The name to display on tokens issued under this role.
        :param pulumi.Input[str] max_ttl: The maximum allowed lifetime of tokens
               issued using this role, provided as a number of seconds.
        :param pulumi.Input[str] name: Name of the role
        :param pulumi.Input[str] period: If set, indicates that the
               token generated using this role should never expire. The token should be renewed within the
               duration specified by this value. At each renewal, the token's TTL will be set to the
               value of this field. Specified in seconds.
        :param pulumi.Input[list] policies: An array of strings
               specifying the policies to be set on tokens issued using this role.
        :param pulumi.Input[list] required_extensions: TLS extensions required on client certificates
        :param pulumi.Input[list] token_bound_cidrs: List of CIDR blocks; if set, specifies blocks of IP
               addresses which can authenticate successfully, and ties the resulting token to these blocks
               as well.
        :param pulumi.Input[float] token_explicit_max_ttl: If set, will encode an
               [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
               onto the token in number of seconds. This is a hard cap even if `token_ttl` and
               `token_max_ttl` would otherwise allow a renewal.
        :param pulumi.Input[float] token_max_ttl: The maximum lifetime for generated tokens in number of seconds.
               Its current value will be referenced at renewal time.
        :param pulumi.Input[bool] token_no_default_policy: If set, the default policy will not be set on
               generated tokens; otherwise it will be added to the policies set in token_policies.
        :param pulumi.Input[float] token_num_uses: The
               [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
               if any, in number of seconds to set on the token.
        :param pulumi.Input[float] token_period: If set, indicates that the
               token generated using this role should never expire. The token should be renewed within the
               duration specified by this value. At each renewal, the token's TTL will be set to the
               value of this field. Specified in seconds.
        :param pulumi.Input[list] token_policies: List of policies to encode onto generated tokens. Depending
               on the auth method, this list may be supplemented by user/group/other values.
        :param pulumi.Input[float] token_ttl: The incremental lifetime for generated tokens in number of seconds.
               Its current value will be referenced at renewal time.
        :param pulumi.Input[str] token_type: The type of token that should be generated. Can be `service`,
               `batch`, or `default` to use the mount's tuned default (which unless changed will be
               `service` tokens). For token store roles, there are two additional possibilities:
               `default-service` and `default-batch` which specify the type to return unless the client
               requests a different type at generation time.
        :param pulumi.Input[str] ttl: The TTL period of tokens issued
               using this role, provided as a number of seconds.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["allowed_common_names"] = allowed_common_names
        __props__["allowed_dns_sans"] = allowed_dns_sans
        __props__["allowed_email_sans"] = allowed_email_sans
        __props__["allowed_names"] = allowed_names
        __props__["allowed_organization_units"] = allowed_organization_units
        __props__["allowed_uri_sans"] = allowed_uri_sans
        __props__["backend"] = backend
        __props__["bound_cidrs"] = bound_cidrs
        __props__["certificate"] = certificate
        __props__["display_name"] = display_name
        __props__["max_ttl"] = max_ttl
        __props__["name"] = name
        __props__["period"] = period
        __props__["policies"] = policies
        __props__["required_extensions"] = required_extensions
        __props__["token_bound_cidrs"] = token_bound_cidrs
        __props__["token_explicit_max_ttl"] = token_explicit_max_ttl
        __props__["token_max_ttl"] = token_max_ttl
        __props__["token_no_default_policy"] = token_no_default_policy
        __props__["token_num_uses"] = token_num_uses
        __props__["token_period"] = token_period
        __props__["token_policies"] = token_policies
        __props__["token_ttl"] = token_ttl
        __props__["token_type"] = token_type
        __props__["ttl"] = ttl
        return CertAuthBackendRole(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

