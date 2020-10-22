# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['AuthBackendRole']


class AuthBackendRole(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 backend: Optional[pulumi.Input[str]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 token_bound_cidrs: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 token_explicit_max_ttl: Optional[pulumi.Input[float]] = None,
                 token_max_ttl: Optional[pulumi.Input[float]] = None,
                 token_no_default_policy: Optional[pulumi.Input[bool]] = None,
                 token_num_uses: Optional[pulumi.Input[float]] = None,
                 token_period: Optional[pulumi.Input[float]] = None,
                 token_policies: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 token_ttl: Optional[pulumi.Input[float]] = None,
                 token_type: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a AuthBackendRole resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The role's arn.
        :param pulumi.Input[str] backend: Auth backend.
        :param pulumi.Input[str] role: Name of the role. Must correspond with the name of the role reflected in the arn.
        :param pulumi.Input[List[pulumi.Input[str]]] token_bound_cidrs: Specifies the blocks of IP addresses which are allowed to use the generated token
        :param pulumi.Input[float] token_explicit_max_ttl: Generated Token's Explicit Maximum TTL in seconds
        :param pulumi.Input[float] token_max_ttl: The maximum lifetime of the generated token
        :param pulumi.Input[bool] token_no_default_policy: If true, the 'default' policy will not automatically be added to generated tokens
        :param pulumi.Input[float] token_num_uses: The maximum number of times a token may be used, a value of zero means unlimited
        :param pulumi.Input[float] token_period: Generated Token's Period
        :param pulumi.Input[List[pulumi.Input[str]]] token_policies: Generated Token's Policies
        :param pulumi.Input[float] token_ttl: The initial ttl of the token to generate in seconds
        :param pulumi.Input[str] token_type: The type of token to generate, service or batch
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

            if arn is None:
                raise TypeError("Missing required property 'arn'")
            __props__['arn'] = arn
            __props__['backend'] = backend
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
        super(AuthBackendRole, __self__).__init__(
            'vault:alicloud/authBackendRole:AuthBackendRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            backend: Optional[pulumi.Input[str]] = None,
            role: Optional[pulumi.Input[str]] = None,
            token_bound_cidrs: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            token_explicit_max_ttl: Optional[pulumi.Input[float]] = None,
            token_max_ttl: Optional[pulumi.Input[float]] = None,
            token_no_default_policy: Optional[pulumi.Input[bool]] = None,
            token_num_uses: Optional[pulumi.Input[float]] = None,
            token_period: Optional[pulumi.Input[float]] = None,
            token_policies: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            token_ttl: Optional[pulumi.Input[float]] = None,
            token_type: Optional[pulumi.Input[str]] = None) -> 'AuthBackendRole':
        """
        Get an existing AuthBackendRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The role's arn.
        :param pulumi.Input[str] backend: Auth backend.
        :param pulumi.Input[str] role: Name of the role. Must correspond with the name of the role reflected in the arn.
        :param pulumi.Input[List[pulumi.Input[str]]] token_bound_cidrs: Specifies the blocks of IP addresses which are allowed to use the generated token
        :param pulumi.Input[float] token_explicit_max_ttl: Generated Token's Explicit Maximum TTL in seconds
        :param pulumi.Input[float] token_max_ttl: The maximum lifetime of the generated token
        :param pulumi.Input[bool] token_no_default_policy: If true, the 'default' policy will not automatically be added to generated tokens
        :param pulumi.Input[float] token_num_uses: The maximum number of times a token may be used, a value of zero means unlimited
        :param pulumi.Input[float] token_period: Generated Token's Period
        :param pulumi.Input[List[pulumi.Input[str]]] token_policies: Generated Token's Policies
        :param pulumi.Input[float] token_ttl: The initial ttl of the token to generate in seconds
        :param pulumi.Input[str] token_type: The type of token to generate, service or batch
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["arn"] = arn
        __props__["backend"] = backend
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
        return AuthBackendRole(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The role's arn.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def backend(self) -> pulumi.Output[Optional[str]]:
        """
        Auth backend.
        """
        return pulumi.get(self, "backend")

    @property
    @pulumi.getter
    def role(self) -> pulumi.Output[str]:
        """
        Name of the role. Must correspond with the name of the role reflected in the arn.
        """
        return pulumi.get(self, "role")

    @property
    @pulumi.getter(name="tokenBoundCidrs")
    def token_bound_cidrs(self) -> pulumi.Output[Optional[List[str]]]:
        """
        Specifies the blocks of IP addresses which are allowed to use the generated token
        """
        return pulumi.get(self, "token_bound_cidrs")

    @property
    @pulumi.getter(name="tokenExplicitMaxTtl")
    def token_explicit_max_ttl(self) -> pulumi.Output[Optional[float]]:
        """
        Generated Token's Explicit Maximum TTL in seconds
        """
        return pulumi.get(self, "token_explicit_max_ttl")

    @property
    @pulumi.getter(name="tokenMaxTtl")
    def token_max_ttl(self) -> pulumi.Output[Optional[float]]:
        """
        The maximum lifetime of the generated token
        """
        return pulumi.get(self, "token_max_ttl")

    @property
    @pulumi.getter(name="tokenNoDefaultPolicy")
    def token_no_default_policy(self) -> pulumi.Output[Optional[bool]]:
        """
        If true, the 'default' policy will not automatically be added to generated tokens
        """
        return pulumi.get(self, "token_no_default_policy")

    @property
    @pulumi.getter(name="tokenNumUses")
    def token_num_uses(self) -> pulumi.Output[Optional[float]]:
        """
        The maximum number of times a token may be used, a value of zero means unlimited
        """
        return pulumi.get(self, "token_num_uses")

    @property
    @pulumi.getter(name="tokenPeriod")
    def token_period(self) -> pulumi.Output[Optional[float]]:
        """
        Generated Token's Period
        """
        return pulumi.get(self, "token_period")

    @property
    @pulumi.getter(name="tokenPolicies")
    def token_policies(self) -> pulumi.Output[Optional[List[str]]]:
        """
        Generated Token's Policies
        """
        return pulumi.get(self, "token_policies")

    @property
    @pulumi.getter(name="tokenTtl")
    def token_ttl(self) -> pulumi.Output[Optional[float]]:
        """
        The initial ttl of the token to generate in seconds
        """
        return pulumi.get(self, "token_ttl")

    @property
    @pulumi.getter(name="tokenType")
    def token_type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of token to generate, service or batch
        """
        return pulumi.get(self, "token_type")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

