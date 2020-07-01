# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables


class AuthBackendRoleSecretID(pulumi.CustomResource):
    accessor: pulumi.Output[str]
    """
    The unique ID for this SecretID that can be safely logged.
    """
    backend: pulumi.Output[str]
    """
    Unique name of the auth backend to configure.
    """
    cidr_lists: pulumi.Output[list]
    """
    If set, specifies blocks of IP addresses which can
    perform the login operation using this SecretID.
    """
    metadata: pulumi.Output[str]
    """
    A JSON-encoded string containing metadata in
    key-value pairs to be set on tokens issued with this SecretID.
    """
    role_name: pulumi.Output[str]
    """
    The name of the role to create the SecretID for.
    """
    secret_id: pulumi.Output[str]
    """
    The SecretID to be created. If set, uses "Push"
    mode.  Defaults to Vault auto-generating SecretIDs.
    """
    wrapping_accessor: pulumi.Output[str]
    """
    The unique ID for the response-wrapped SecretID that can
    be safely logged.
    """
    wrapping_token: pulumi.Output[str]
    """
    The token used to retrieve a response-wrapped SecretID.
    """
    wrapping_ttl: pulumi.Output[str]
    """
    If set, the SecretID response will be
    [response-wrapped](https://www.vaultproject.io/docs/concepts/response-wrapping)
    and available for the duration specified. Only a single unwrapping of the
    token is allowed.
    """
    def __init__(__self__, resource_name, opts=None, backend=None, cidr_lists=None, metadata=None, role_name=None, secret_id=None, wrapping_ttl=None, __props__=None, __name__=None, __opts__=None):
        """
        Manages an AppRole auth backend SecretID in a Vault server. See the [Vault
        documentation](https://www.vaultproject.io/docs/auth/approle) for more
        information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_vault as vault

        approle = vault.AuthBackend("approle", type="approle")
        example = vault.app_role.AuthBackendRole("example",
            backend=approle.path,
            policies=[
                "default",
                "dev",
                "prod",
            ],
            role_name="test-role")
        id = vault.app_role.AuthBackendRoleSecretID("id",
            backend=approle.path,
            metadata=\"\"\"{
          "hello": "world"
        }

        \"\"\",
            role_name=example.role_name)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] backend: Unique name of the auth backend to configure.
        :param pulumi.Input[list] cidr_lists: If set, specifies blocks of IP addresses which can
               perform the login operation using this SecretID.
        :param pulumi.Input[str] metadata: A JSON-encoded string containing metadata in
               key-value pairs to be set on tokens issued with this SecretID.
        :param pulumi.Input[str] role_name: The name of the role to create the SecretID for.
        :param pulumi.Input[str] secret_id: The SecretID to be created. If set, uses "Push"
               mode.  Defaults to Vault auto-generating SecretIDs.
        :param pulumi.Input[str] wrapping_ttl: If set, the SecretID response will be
               [response-wrapped](https://www.vaultproject.io/docs/concepts/response-wrapping)
               and available for the duration specified. Only a single unwrapping of the
               token is allowed.
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

            __props__['backend'] = backend
            __props__['cidr_lists'] = cidr_lists
            __props__['metadata'] = metadata
            if role_name is None:
                raise TypeError("Missing required property 'role_name'")
            __props__['role_name'] = role_name
            __props__['secret_id'] = secret_id
            __props__['wrapping_ttl'] = wrapping_ttl
            __props__['accessor'] = None
            __props__['wrapping_accessor'] = None
            __props__['wrapping_token'] = None
        super(AuthBackendRoleSecretID, __self__).__init__(
            'vault:appRole/authBackendRoleSecretID:AuthBackendRoleSecretID',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, accessor=None, backend=None, cidr_lists=None, metadata=None, role_name=None, secret_id=None, wrapping_accessor=None, wrapping_token=None, wrapping_ttl=None):
        """
        Get an existing AuthBackendRoleSecretID resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accessor: The unique ID for this SecretID that can be safely logged.
        :param pulumi.Input[str] backend: Unique name of the auth backend to configure.
        :param pulumi.Input[list] cidr_lists: If set, specifies blocks of IP addresses which can
               perform the login operation using this SecretID.
        :param pulumi.Input[str] metadata: A JSON-encoded string containing metadata in
               key-value pairs to be set on tokens issued with this SecretID.
        :param pulumi.Input[str] role_name: The name of the role to create the SecretID for.
        :param pulumi.Input[str] secret_id: The SecretID to be created. If set, uses "Push"
               mode.  Defaults to Vault auto-generating SecretIDs.
        :param pulumi.Input[str] wrapping_accessor: The unique ID for the response-wrapped SecretID that can
               be safely logged.
        :param pulumi.Input[str] wrapping_token: The token used to retrieve a response-wrapped SecretID.
        :param pulumi.Input[str] wrapping_ttl: If set, the SecretID response will be
               [response-wrapped](https://www.vaultproject.io/docs/concepts/response-wrapping)
               and available for the duration specified. Only a single unwrapping of the
               token is allowed.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["accessor"] = accessor
        __props__["backend"] = backend
        __props__["cidr_lists"] = cidr_lists
        __props__["metadata"] = metadata
        __props__["role_name"] = role_name
        __props__["secret_id"] = secret_id
        __props__["wrapping_accessor"] = wrapping_accessor
        __props__["wrapping_token"] = wrapping_token
        __props__["wrapping_ttl"] = wrapping_ttl
        return AuthBackendRoleSecretID(resource_name, opts=opts, __props__=__props__)

    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
