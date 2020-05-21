# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class AuthBackend(pulumi.CustomResource):
    accessor: pulumi.Output[str]
    """
    The mount accessor related to the auth mount. It is useful for integration with [Identity Secrets Engine](https://www.vaultproject.io/docs/secrets/identity/index.html).
    """
    base_url: pulumi.Output[str]
    """
    The API endpoint to use. Useful if you
    are running GitHub Enterprise or an API-compatible authentication server.
    """
    description: pulumi.Output[str]
    """
    Specifies the description of the mount.
    This overrides the current stored value, if any.
    """
    max_ttl: pulumi.Output[str]
    """
    (Optional; Deprecated, use `token_max_ttl` instead if you are running Vault >= 1.2) The maximum allowed lifetime of tokens
    issued using this role. This must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration).
    """
    organization: pulumi.Output[str]
    """
    The organization configured users must be part of.
    """
    path: pulumi.Output[str]
    """
    Path where the auth backend is mounted. Defaults to `auth/github`
    if not specified.
    """
    token_bound_cidrs: pulumi.Output[list]
    """
    (Optional) List of CIDR blocks; if set, specifies blocks of IP
    addresses which can authenticate successfully, and ties the resulting token to these blocks
    as well.
    """
    token_explicit_max_ttl: pulumi.Output[float]
    """
    (Optional) If set, will encode an
    [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
    onto the token in number of seconds. This is a hard cap even if `token_ttl` and
    `token_max_ttl` would otherwise allow a renewal.
    """
    token_max_ttl: pulumi.Output[float]
    """
    (Optional) The maximum lifetime for generated tokens in number of seconds.
    Its current value will be referenced at renewal time.
    """
    token_no_default_policy: pulumi.Output[bool]
    """
    (Optional) If set, the default policy will not be set on
    generated tokens; otherwise it will be added to the policies set in token_policies.
    """
    token_num_uses: pulumi.Output[float]
    """
    (Optional) The
    [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
    if any, in number of seconds to set on the token.
    """
    token_period: pulumi.Output[float]
    """
    (Optional) If set, indicates that the
    token generated using this role should never expire. The token should be renewed within the
    duration specified by this value. At each renewal, the token's TTL will be set to the
    value of this field. Specified in seconds.
    """
    token_policies: pulumi.Output[list]
    """
    (Optional) List of policies to encode onto generated tokens. Depending
    on the auth method, this list may be supplemented by user/group/other values.
    """
    token_ttl: pulumi.Output[float]
    """
    (Optional) The incremental lifetime for generated tokens in number of seconds.
    Its current value will be referenced at renewal time.
    """
    token_type: pulumi.Output[str]
    """
    Specifies the type of tokens that should be returned by
    the mount. Valid values are "default-service", "default-batch", "service", "batch".
    """
    ttl: pulumi.Output[str]
    """
    (Optional; Deprecated, use `token_ttl` instead if you are running Vault >= 1.2) The TTL period of tokens issued
    using this role. This must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration).
    """
    tune: pulumi.Output[dict]
    def __init__(__self__, resource_name, opts=None, base_url=None, description=None, max_ttl=None, organization=None, path=None, token_bound_cidrs=None, token_explicit_max_ttl=None, token_max_ttl=None, token_no_default_policy=None, token_num_uses=None, token_period=None, token_policies=None, token_ttl=None, token_type=None, ttl=None, tune=None, __props__=None, __name__=None, __opts__=None):
        """
        Manages a Github Auth mount in a Vault server. See the [Vault
        documentation](https://www.vaultproject.io/docs/auth/github/) for more
        information.

        ## Example Usage



        ```python
        import pulumi
        import pulumi_vault as vault

        example = vault.github.AuthBackend("example", organization="myorg")
        ```


        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] base_url: The API endpoint to use. Useful if you
               are running GitHub Enterprise or an API-compatible authentication server.
        :param pulumi.Input[str] description: Specifies the description of the mount.
               This overrides the current stored value, if any.
        :param pulumi.Input[str] max_ttl: (Optional; Deprecated, use `token_max_ttl` instead if you are running Vault >= 1.2) The maximum allowed lifetime of tokens
               issued using this role. This must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration).
        :param pulumi.Input[str] organization: The organization configured users must be part of.
        :param pulumi.Input[str] path: Path where the auth backend is mounted. Defaults to `auth/github`
               if not specified.
        :param pulumi.Input[list] token_bound_cidrs: (Optional) List of CIDR blocks; if set, specifies blocks of IP
               addresses which can authenticate successfully, and ties the resulting token to these blocks
               as well.
        :param pulumi.Input[float] token_explicit_max_ttl: (Optional) If set, will encode an
               [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
               onto the token in number of seconds. This is a hard cap even if `token_ttl` and
               `token_max_ttl` would otherwise allow a renewal.
        :param pulumi.Input[float] token_max_ttl: (Optional) The maximum lifetime for generated tokens in number of seconds.
               Its current value will be referenced at renewal time.
        :param pulumi.Input[bool] token_no_default_policy: (Optional) If set, the default policy will not be set on
               generated tokens; otherwise it will be added to the policies set in token_policies.
        :param pulumi.Input[float] token_num_uses: (Optional) The
               [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
               if any, in number of seconds to set on the token.
        :param pulumi.Input[float] token_period: (Optional) If set, indicates that the
               token generated using this role should never expire. The token should be renewed within the
               duration specified by this value. At each renewal, the token's TTL will be set to the
               value of this field. Specified in seconds.
        :param pulumi.Input[list] token_policies: (Optional) List of policies to encode onto generated tokens. Depending
               on the auth method, this list may be supplemented by user/group/other values.
        :param pulumi.Input[float] token_ttl: (Optional) The incremental lifetime for generated tokens in number of seconds.
               Its current value will be referenced at renewal time.
        :param pulumi.Input[str] token_type: Specifies the type of tokens that should be returned by
               the mount. Valid values are "default-service", "default-batch", "service", "batch".
        :param pulumi.Input[str] ttl: (Optional; Deprecated, use `token_ttl` instead if you are running Vault >= 1.2) The TTL period of tokens issued
               using this role. This must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration).

        The **tune** object supports the following:

          * `allowedResponseHeaders` (`pulumi.Input[list]`) - List of headers to whitelist and allowing
            a plugin to include them in the response.
          * `auditNonHmacRequestKeys` (`pulumi.Input[list]`) - Specifies the list of keys that will
            not be HMAC'd by audit devices in the request data object.
          * `auditNonHmacResponseKeys` (`pulumi.Input[list]`) - Specifies the list of keys that will
            not be HMAC'd by audit devices in the response data object.
          * `defaultLeaseTtl` (`pulumi.Input[str]`) - Specifies the default time-to-live.
            If set, this overrides the global default.
            Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
          * `listing_visibility` (`pulumi.Input[str]`) - Specifies whether to show this mount in
            the UI-specific listing endpoint. Valid values are "unauth" or "hidden".
          * `maxLeaseTtl` (`pulumi.Input[str]`) - Specifies the maximum time-to-live.
            If set, this overrides the global default.
            Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
          * `passthroughRequestHeaders` (`pulumi.Input[list]`) - List of headers to whitelist and
            pass from the request to the backend.
          * `token_type` (`pulumi.Input[str]`) - Specifies the type of tokens that should be returned by
            the mount. Valid values are "default-service", "default-batch", "service", "batch".
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

            __props__['base_url'] = base_url
            __props__['description'] = description
            __props__['max_ttl'] = max_ttl
            if organization is None:
                raise TypeError("Missing required property 'organization'")
            __props__['organization'] = organization
            __props__['path'] = path
            __props__['token_bound_cidrs'] = token_bound_cidrs
            __props__['token_explicit_max_ttl'] = token_explicit_max_ttl
            __props__['token_max_ttl'] = token_max_ttl
            __props__['token_no_default_policy'] = token_no_default_policy
            __props__['token_num_uses'] = token_num_uses
            __props__['token_period'] = token_period
            __props__['token_policies'] = token_policies
            __props__['token_ttl'] = token_ttl
            __props__['token_type'] = token_type
            __props__['ttl'] = ttl
            __props__['tune'] = tune
            __props__['accessor'] = None
        super(AuthBackend, __self__).__init__(
            'vault:github/authBackend:AuthBackend',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, accessor=None, base_url=None, description=None, max_ttl=None, organization=None, path=None, token_bound_cidrs=None, token_explicit_max_ttl=None, token_max_ttl=None, token_no_default_policy=None, token_num_uses=None, token_period=None, token_policies=None, token_ttl=None, token_type=None, ttl=None, tune=None):
        """
        Get an existing AuthBackend resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accessor: The mount accessor related to the auth mount. It is useful for integration with [Identity Secrets Engine](https://www.vaultproject.io/docs/secrets/identity/index.html).
        :param pulumi.Input[str] base_url: The API endpoint to use. Useful if you
               are running GitHub Enterprise or an API-compatible authentication server.
        :param pulumi.Input[str] description: Specifies the description of the mount.
               This overrides the current stored value, if any.
        :param pulumi.Input[str] max_ttl: (Optional; Deprecated, use `token_max_ttl` instead if you are running Vault >= 1.2) The maximum allowed lifetime of tokens
               issued using this role. This must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration).
        :param pulumi.Input[str] organization: The organization configured users must be part of.
        :param pulumi.Input[str] path: Path where the auth backend is mounted. Defaults to `auth/github`
               if not specified.
        :param pulumi.Input[list] token_bound_cidrs: (Optional) List of CIDR blocks; if set, specifies blocks of IP
               addresses which can authenticate successfully, and ties the resulting token to these blocks
               as well.
        :param pulumi.Input[float] token_explicit_max_ttl: (Optional) If set, will encode an
               [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
               onto the token in number of seconds. This is a hard cap even if `token_ttl` and
               `token_max_ttl` would otherwise allow a renewal.
        :param pulumi.Input[float] token_max_ttl: (Optional) The maximum lifetime for generated tokens in number of seconds.
               Its current value will be referenced at renewal time.
        :param pulumi.Input[bool] token_no_default_policy: (Optional) If set, the default policy will not be set on
               generated tokens; otherwise it will be added to the policies set in token_policies.
        :param pulumi.Input[float] token_num_uses: (Optional) The
               [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
               if any, in number of seconds to set on the token.
        :param pulumi.Input[float] token_period: (Optional) If set, indicates that the
               token generated using this role should never expire. The token should be renewed within the
               duration specified by this value. At each renewal, the token's TTL will be set to the
               value of this field. Specified in seconds.
        :param pulumi.Input[list] token_policies: (Optional) List of policies to encode onto generated tokens. Depending
               on the auth method, this list may be supplemented by user/group/other values.
        :param pulumi.Input[float] token_ttl: (Optional) The incremental lifetime for generated tokens in number of seconds.
               Its current value will be referenced at renewal time.
        :param pulumi.Input[str] token_type: Specifies the type of tokens that should be returned by
               the mount. Valid values are "default-service", "default-batch", "service", "batch".
        :param pulumi.Input[str] ttl: (Optional; Deprecated, use `token_ttl` instead if you are running Vault >= 1.2) The TTL period of tokens issued
               using this role. This must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration).

        The **tune** object supports the following:

          * `allowedResponseHeaders` (`pulumi.Input[list]`) - List of headers to whitelist and allowing
            a plugin to include them in the response.
          * `auditNonHmacRequestKeys` (`pulumi.Input[list]`) - Specifies the list of keys that will
            not be HMAC'd by audit devices in the request data object.
          * `auditNonHmacResponseKeys` (`pulumi.Input[list]`) - Specifies the list of keys that will
            not be HMAC'd by audit devices in the response data object.
          * `defaultLeaseTtl` (`pulumi.Input[str]`) - Specifies the default time-to-live.
            If set, this overrides the global default.
            Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
          * `listing_visibility` (`pulumi.Input[str]`) - Specifies whether to show this mount in
            the UI-specific listing endpoint. Valid values are "unauth" or "hidden".
          * `maxLeaseTtl` (`pulumi.Input[str]`) - Specifies the maximum time-to-live.
            If set, this overrides the global default.
            Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
          * `passthroughRequestHeaders` (`pulumi.Input[list]`) - List of headers to whitelist and
            pass from the request to the backend.
          * `token_type` (`pulumi.Input[str]`) - Specifies the type of tokens that should be returned by
            the mount. Valid values are "default-service", "default-batch", "service", "batch".
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["accessor"] = accessor
        __props__["base_url"] = base_url
        __props__["description"] = description
        __props__["max_ttl"] = max_ttl
        __props__["organization"] = organization
        __props__["path"] = path
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
        __props__["tune"] = tune
        return AuthBackend(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

