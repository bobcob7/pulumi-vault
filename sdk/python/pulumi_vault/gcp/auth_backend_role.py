# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class AuthBackendRole(pulumi.CustomResource):
    add_group_aliases: pulumi.Output[bool]
    allow_gce_inference: pulumi.Output[bool]
    """
    A flag to determine if this role should allow GCE instances to authenticate by inferring service accounts from the GCE identity metadata token.
    """
    backend: pulumi.Output[str]
    """
    Path to the mounted GCP auth backend
    """
    bound_instance_groups: pulumi.Output[list]
    """
    The instance groups that an authorized instance must belong to in order to be authenticated. If specified, either `bound_zones` or `bound_regions` must be set too.
    """
    bound_labels: pulumi.Output[list]
    """
    A comma-separated list of GCP labels formatted as `"key:value"` strings that must be set on authorized GCE instances. Because GCP labels are not currently ACL'd, we recommend that this be used in conjunction with other restrictions.
    """
    bound_projects: pulumi.Output[list]
    """
    GCP Projects that the role exists within
    """
    bound_regions: pulumi.Output[list]
    """
    The list of regions that a GCE instance must belong to in order to be authenticated. If bound_instance_groups is provided, it is assumed to be a regional group and the group must belong to this region. If bound_zones are provided, this attribute is ignored.
    """
    bound_service_accounts: pulumi.Output[list]
    """
    GCP Service Accounts allowed to issue tokens under this role. (Note: **Required** if role is `iam`)
    """
    bound_zones: pulumi.Output[list]
    """
    The list of zones that a GCE instance must belong to in order to be authenticated. If bound_instance_groups is provided, it is assumed to be a zonal group and the group must belong to this zone.
    """
    max_jwt_exp: pulumi.Output[str]
    """
    The number of seconds past the time of authentication that the login param JWT must expire within. For example, if a user attempts to login with a token that expires within an hour and this is set to 15 minutes, Vault will return an error prompting the user to create a new signed JWT with a shorter `exp`. The GCE metadata tokens currently do not allow the `exp` claim to be customized.
    """
    max_ttl: pulumi.Output[str]
    """
    The maximum allowed lifetime of tokens
    issued using this role, provided as a number of seconds.
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
    role: pulumi.Output[str]
    """
    Name of the GCP role
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
    type: pulumi.Output[str]
    """
    Type of GCP authentication role (either `gce` or `iam`)
    """
    def __init__(__self__, resource_name, opts=None, add_group_aliases=None, allow_gce_inference=None, backend=None, bound_instance_groups=None, bound_labels=None, bound_projects=None, bound_regions=None, bound_service_accounts=None, bound_zones=None, max_jwt_exp=None, max_ttl=None, period=None, policies=None, role=None, token_bound_cidrs=None, token_explicit_max_ttl=None, token_max_ttl=None, token_no_default_policy=None, token_num_uses=None, token_period=None, token_policies=None, token_ttl=None, token_type=None, ttl=None, type=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a resource to create a role in an [GCP auth backend within Vault](https://www.vaultproject.io/docs/auth/gcp.html).

        ## Example Usage



        ```python
        import pulumi
        import pulumi_vault as vault

        gcp_auth_backend = vault.AuthBackend("gcpAuthBackend",
            path="gcp",
            type="gcp")
        gcp_auth_backend_role = vault.gcp.AuthBackendRole("gcpAuthBackendRole",
            backend=gcp_auth_backend.path,
            project_id="foo-bar-baz",
            bound_service_accounts=["database-server@foo-bar-baz.iam.gserviceaccount.com"],
            token_policies=["database-server"])
        ```


        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_gce_inference: A flag to determine if this role should allow GCE instances to authenticate by inferring service accounts from the GCE identity metadata token.
        :param pulumi.Input[str] backend: Path to the mounted GCP auth backend
        :param pulumi.Input[list] bound_instance_groups: The instance groups that an authorized instance must belong to in order to be authenticated. If specified, either `bound_zones` or `bound_regions` must be set too.
        :param pulumi.Input[list] bound_labels: A comma-separated list of GCP labels formatted as `"key:value"` strings that must be set on authorized GCE instances. Because GCP labels are not currently ACL'd, we recommend that this be used in conjunction with other restrictions.
        :param pulumi.Input[list] bound_projects: GCP Projects that the role exists within
        :param pulumi.Input[list] bound_regions: The list of regions that a GCE instance must belong to in order to be authenticated. If bound_instance_groups is provided, it is assumed to be a regional group and the group must belong to this region. If bound_zones are provided, this attribute is ignored.
        :param pulumi.Input[list] bound_service_accounts: GCP Service Accounts allowed to issue tokens under this role. (Note: **Required** if role is `iam`)
        :param pulumi.Input[list] bound_zones: The list of zones that a GCE instance must belong to in order to be authenticated. If bound_instance_groups is provided, it is assumed to be a zonal group and the group must belong to this zone.
        :param pulumi.Input[str] max_jwt_exp: The number of seconds past the time of authentication that the login param JWT must expire within. For example, if a user attempts to login with a token that expires within an hour and this is set to 15 minutes, Vault will return an error prompting the user to create a new signed JWT with a shorter `exp`. The GCE metadata tokens currently do not allow the `exp` claim to be customized.
        :param pulumi.Input[str] max_ttl: The maximum allowed lifetime of tokens
               issued using this role, provided as a number of seconds.
        :param pulumi.Input[str] period: If set, indicates that the
               token generated using this role should never expire. The token should be renewed within the
               duration specified by this value. At each renewal, the token's TTL will be set to the
               value of this field. Specified in seconds.
        :param pulumi.Input[list] policies: An array of strings
               specifying the policies to be set on tokens issued using this role.
        :param pulumi.Input[str] role: Name of the GCP role
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
        :param pulumi.Input[str] type: Type of GCP authentication role (either `gce` or `iam`)
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

            __props__['add_group_aliases'] = add_group_aliases
            __props__['allow_gce_inference'] = allow_gce_inference
            __props__['backend'] = backend
            __props__['bound_instance_groups'] = bound_instance_groups
            __props__['bound_labels'] = bound_labels
            __props__['bound_projects'] = bound_projects
            __props__['bound_regions'] = bound_regions
            __props__['bound_service_accounts'] = bound_service_accounts
            __props__['bound_zones'] = bound_zones
            __props__['max_jwt_exp'] = max_jwt_exp
            if max_ttl is not None:
                warnings.warn("use `token_max_ttl` instead if you are running Vault >= 1.2", DeprecationWarning)
                pulumi.log.warn("max_ttl is deprecated: use `token_max_ttl` instead if you are running Vault >= 1.2")
            __props__['max_ttl'] = max_ttl
            if period is not None:
                warnings.warn("use `token_period` instead if you are running Vault >= 1.2", DeprecationWarning)
                pulumi.log.warn("period is deprecated: use `token_period` instead if you are running Vault >= 1.2")
            __props__['period'] = period
            if policies is not None:
                warnings.warn("use `token_policies` instead if you are running Vault >= 1.2", DeprecationWarning)
                pulumi.log.warn("policies is deprecated: use `token_policies` instead if you are running Vault >= 1.2")
            __props__['policies'] = policies
            if role is None:
                raise TypeError("Missing required property 'role'")
            __props__['role'] = role
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
            if type is None:
                raise TypeError("Missing required property 'type'")
            __props__['type'] = type
        super(AuthBackendRole, __self__).__init__(
            'vault:gcp/authBackendRole:AuthBackendRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, add_group_aliases=None, allow_gce_inference=None, backend=None, bound_instance_groups=None, bound_labels=None, bound_projects=None, bound_regions=None, bound_service_accounts=None, bound_zones=None, max_jwt_exp=None, max_ttl=None, period=None, policies=None, role=None, token_bound_cidrs=None, token_explicit_max_ttl=None, token_max_ttl=None, token_no_default_policy=None, token_num_uses=None, token_period=None, token_policies=None, token_ttl=None, token_type=None, ttl=None, type=None):
        """
        Get an existing AuthBackendRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_gce_inference: A flag to determine if this role should allow GCE instances to authenticate by inferring service accounts from the GCE identity metadata token.
        :param pulumi.Input[str] backend: Path to the mounted GCP auth backend
        :param pulumi.Input[list] bound_instance_groups: The instance groups that an authorized instance must belong to in order to be authenticated. If specified, either `bound_zones` or `bound_regions` must be set too.
        :param pulumi.Input[list] bound_labels: A comma-separated list of GCP labels formatted as `"key:value"` strings that must be set on authorized GCE instances. Because GCP labels are not currently ACL'd, we recommend that this be used in conjunction with other restrictions.
        :param pulumi.Input[list] bound_projects: GCP Projects that the role exists within
        :param pulumi.Input[list] bound_regions: The list of regions that a GCE instance must belong to in order to be authenticated. If bound_instance_groups is provided, it is assumed to be a regional group and the group must belong to this region. If bound_zones are provided, this attribute is ignored.
        :param pulumi.Input[list] bound_service_accounts: GCP Service Accounts allowed to issue tokens under this role. (Note: **Required** if role is `iam`)
        :param pulumi.Input[list] bound_zones: The list of zones that a GCE instance must belong to in order to be authenticated. If bound_instance_groups is provided, it is assumed to be a zonal group and the group must belong to this zone.
        :param pulumi.Input[str] max_jwt_exp: The number of seconds past the time of authentication that the login param JWT must expire within. For example, if a user attempts to login with a token that expires within an hour and this is set to 15 minutes, Vault will return an error prompting the user to create a new signed JWT with a shorter `exp`. The GCE metadata tokens currently do not allow the `exp` claim to be customized.
        :param pulumi.Input[str] max_ttl: The maximum allowed lifetime of tokens
               issued using this role, provided as a number of seconds.
        :param pulumi.Input[str] period: If set, indicates that the
               token generated using this role should never expire. The token should be renewed within the
               duration specified by this value. At each renewal, the token's TTL will be set to the
               value of this field. Specified in seconds.
        :param pulumi.Input[list] policies: An array of strings
               specifying the policies to be set on tokens issued using this role.
        :param pulumi.Input[str] role: Name of the GCP role
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
        :param pulumi.Input[str] type: Type of GCP authentication role (either `gce` or `iam`)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["add_group_aliases"] = add_group_aliases
        __props__["allow_gce_inference"] = allow_gce_inference
        __props__["backend"] = backend
        __props__["bound_instance_groups"] = bound_instance_groups
        __props__["bound_labels"] = bound_labels
        __props__["bound_projects"] = bound_projects
        __props__["bound_regions"] = bound_regions
        __props__["bound_service_accounts"] = bound_service_accounts
        __props__["bound_zones"] = bound_zones
        __props__["max_jwt_exp"] = max_jwt_exp
        __props__["max_ttl"] = max_ttl
        __props__["period"] = period
        __props__["policies"] = policies
        __props__["role"] = role
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
        __props__["type"] = type
        return AuthBackendRole(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

