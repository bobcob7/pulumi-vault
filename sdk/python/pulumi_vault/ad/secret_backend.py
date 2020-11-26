# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['SecretBackend']


class SecretBackend(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 anonymous_group_search: Optional[pulumi.Input[bool]] = None,
                 backend: Optional[pulumi.Input[str]] = None,
                 binddn: Optional[pulumi.Input[str]] = None,
                 bindpass: Optional[pulumi.Input[str]] = None,
                 case_sensitive_names: Optional[pulumi.Input[bool]] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 client_tls_cert: Optional[pulumi.Input[str]] = None,
                 client_tls_key: Optional[pulumi.Input[str]] = None,
                 default_lease_ttl_seconds: Optional[pulumi.Input[int]] = None,
                 deny_null_bind: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 discoverdn: Optional[pulumi.Input[bool]] = None,
                 formatter: Optional[pulumi.Input[str]] = None,
                 groupattr: Optional[pulumi.Input[str]] = None,
                 groupdn: Optional[pulumi.Input[str]] = None,
                 groupfilter: Optional[pulumi.Input[str]] = None,
                 insecure_tls: Optional[pulumi.Input[bool]] = None,
                 last_rotation_tolerance: Optional[pulumi.Input[int]] = None,
                 length: Optional[pulumi.Input[int]] = None,
                 local: Optional[pulumi.Input[bool]] = None,
                 max_lease_ttl_seconds: Optional[pulumi.Input[int]] = None,
                 max_ttl: Optional[pulumi.Input[int]] = None,
                 password_policy: Optional[pulumi.Input[str]] = None,
                 request_timeout: Optional[pulumi.Input[int]] = None,
                 starttls: Optional[pulumi.Input[bool]] = None,
                 tls_max_version: Optional[pulumi.Input[str]] = None,
                 tls_min_version: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None,
                 upndomain: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 use_pre111_group_cn_behavior: Optional[pulumi.Input[bool]] = None,
                 use_token_groups: Optional[pulumi.Input[bool]] = None,
                 userattr: Optional[pulumi.Input[str]] = None,
                 userdn: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        ## Import

        AD secret backend can be imported using the `backend`, e.g.

        ```sh
         $ pulumi import vault:ad/secretBackend:SecretBackend ad ad
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] anonymous_group_search: Use anonymous binds when performing LDAP group searches
               (if true the initial credentials will still be used for the initial connection test).
        :param pulumi.Input[str] backend: The unique path this backend should be mounted at. Must
               not begin or end with a `/`. Defaults to `ad`.
        :param pulumi.Input[str] binddn: Distinguished name of object to bind when performing user and group search.
        :param pulumi.Input[str] bindpass: Password to use along with binddn when performing user search.
        :param pulumi.Input[bool] case_sensitive_names: If set, user and group names assigned to policies within the
               backend will be case sensitive. Otherwise, names will be normalized to lower case.
        :param pulumi.Input[str] certificate: CA certificate to use when verifying LDAP server certificate, must be
               x509 PEM encoded.
        :param pulumi.Input[str] client_tls_cert: Client certificate to provide to the LDAP server, must be x509 PEM encoded.
        :param pulumi.Input[str] client_tls_key: Client certificate key to provide to the LDAP server, must be x509 PEM encoded.
        :param pulumi.Input[int] default_lease_ttl_seconds: Default lease duration for secrets in seconds.
        :param pulumi.Input[bool] deny_null_bind: Denies an unauthenticated LDAP bind request if the user's password is empty;
               defaults to true.
        :param pulumi.Input[str] description: Human-friendly description of the mount for the Active Directory backend.
        :param pulumi.Input[bool] discoverdn: Use anonymous bind to discover the bind Distinguished Name of a user.
        :param pulumi.Input[str] formatter: Text to insert the password into, ex. "customPrefix{{PASSWORD}}customSuffix". This
               setting is deprecated and should instead use `password_policy`.
        :param pulumi.Input[str] groupattr: LDAP attribute to follow on objects returned by <groupfilter> in order to enumerate
               user group membership. Examples: `cn` or `memberOf`, etc. Defaults to `cn`.
        :param pulumi.Input[str] groupdn: LDAP search base to use for group membership search (eg: ou=Groups,dc=example,dc=org).
        :param pulumi.Input[str] groupfilter: Go template for querying group membership of user (optional) The template can access
               the following context variables: UserDN, Username. Defaults to `(|(memberUid={{.Username}})(member={{.UserDN}})(uniqueMember={{.UserDN}}))`
        :param pulumi.Input[bool] insecure_tls: Skip LDAP server SSL Certificate verification. This is not recommended for production.
               Defaults to `false`.
        :param pulumi.Input[int] last_rotation_tolerance: The number of seconds after a Vault rotation where, if Active Directory
               shows a later rotation, it should be considered out-of-band
        :param pulumi.Input[int] length: The desired length of passwords that Vault generates. This
               setting is deprecated and should instead use `password_policy`.
        :param pulumi.Input[bool] local: Mark the secrets engine as local-only. Local engines are not replicated or removed by
               replication.Tolerance duration to use when checking the last rotation time.
        :param pulumi.Input[int] max_lease_ttl_seconds: Maximum possible lease duration for secrets in seconds.
        :param pulumi.Input[int] max_ttl: In seconds, the maximum password time-to-live.
        :param pulumi.Input[str] password_policy: Name of the password policy to use to generate passwords.
        :param pulumi.Input[int] request_timeout: Timeout, in seconds, for the connection when making requests against the server
               before returning back an error.
        :param pulumi.Input[bool] starttls: Issue a StartTLS command after establishing unencrypted connection.
        :param pulumi.Input[str] tls_max_version: Maximum TLS version to use. Accepted values are `tls10`, `tls11`,
               `tls12` or `tls13`. Defaults to `tls12`.
        :param pulumi.Input[str] tls_min_version: Minimum TLS version to use. Accepted values are `tls10`, `tls11`,
               `tls12` or `tls13`. Defaults to `tls12`.
        :param pulumi.Input[int] ttl: In seconds, the default password time-to-live.
        :param pulumi.Input[str] upndomain: Enables userPrincipalDomain login with [username]@UPNDomain.
        :param pulumi.Input[str] url: LDAP URL to connect to. Multiple URLs can be specified by concatenating
               them with commas; they will be tried in-order. Defaults to `ldap://127.0.0.1`.
        :param pulumi.Input[bool] use_pre111_group_cn_behavior: In Vault 1.1.1 a fix for handling group CN values of
               different cases unfortunately introduced a regression that could cause previously defined groups
               to not be found due to a change in the resulting name. If set true, the pre-1.1.1 behavior for
               matching group CNs will be used. This is only needed in some upgrade scenarios for backwards
               compatibility. It is enabled by default if the config is upgraded but disabled by default on
               new configurations.
        :param pulumi.Input[bool] use_token_groups: If true, use the Active Directory tokenGroups constructed attribute of the
               user to find the group memberships. This will find all security groups including nested ones.
        :param pulumi.Input[str] userattr: Attribute used when searching users. Defaults to `cn`.
        :param pulumi.Input[str] userdn: LDAP domain to use for users (eg: ou=People,dc=example,dc=org)`.
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

            __props__['anonymous_group_search'] = anonymous_group_search
            __props__['backend'] = backend
            if binddn is None:
                raise TypeError("Missing required property 'binddn'")
            __props__['binddn'] = binddn
            if bindpass is None:
                raise TypeError("Missing required property 'bindpass'")
            __props__['bindpass'] = bindpass
            __props__['case_sensitive_names'] = case_sensitive_names
            __props__['certificate'] = certificate
            __props__['client_tls_cert'] = client_tls_cert
            __props__['client_tls_key'] = client_tls_key
            __props__['default_lease_ttl_seconds'] = default_lease_ttl_seconds
            __props__['deny_null_bind'] = deny_null_bind
            __props__['description'] = description
            __props__['discoverdn'] = discoverdn
            if formatter is not None:
                warnings.warn("""Formatter is deprecated and password_policy should be used with Vault >= 1.5.""", DeprecationWarning)
                pulumi.log.warn("formatter is deprecated: Formatter is deprecated and password_policy should be used with Vault >= 1.5.")
            __props__['formatter'] = formatter
            __props__['groupattr'] = groupattr
            __props__['groupdn'] = groupdn
            __props__['groupfilter'] = groupfilter
            __props__['insecure_tls'] = insecure_tls
            __props__['last_rotation_tolerance'] = last_rotation_tolerance
            if length is not None:
                warnings.warn("""Length is deprecated and password_policy should be used with Vault >= 1.5.""", DeprecationWarning)
                pulumi.log.warn("length is deprecated: Length is deprecated and password_policy should be used with Vault >= 1.5.")
            __props__['length'] = length
            __props__['local'] = local
            __props__['max_lease_ttl_seconds'] = max_lease_ttl_seconds
            __props__['max_ttl'] = max_ttl
            __props__['password_policy'] = password_policy
            __props__['request_timeout'] = request_timeout
            __props__['starttls'] = starttls
            __props__['tls_max_version'] = tls_max_version
            __props__['tls_min_version'] = tls_min_version
            __props__['ttl'] = ttl
            __props__['upndomain'] = upndomain
            __props__['url'] = url
            __props__['use_pre111_group_cn_behavior'] = use_pre111_group_cn_behavior
            __props__['use_token_groups'] = use_token_groups
            __props__['userattr'] = userattr
            __props__['userdn'] = userdn
        super(SecretBackend, __self__).__init__(
            'vault:ad/secretBackend:SecretBackend',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            anonymous_group_search: Optional[pulumi.Input[bool]] = None,
            backend: Optional[pulumi.Input[str]] = None,
            binddn: Optional[pulumi.Input[str]] = None,
            bindpass: Optional[pulumi.Input[str]] = None,
            case_sensitive_names: Optional[pulumi.Input[bool]] = None,
            certificate: Optional[pulumi.Input[str]] = None,
            client_tls_cert: Optional[pulumi.Input[str]] = None,
            client_tls_key: Optional[pulumi.Input[str]] = None,
            default_lease_ttl_seconds: Optional[pulumi.Input[int]] = None,
            deny_null_bind: Optional[pulumi.Input[bool]] = None,
            description: Optional[pulumi.Input[str]] = None,
            discoverdn: Optional[pulumi.Input[bool]] = None,
            formatter: Optional[pulumi.Input[str]] = None,
            groupattr: Optional[pulumi.Input[str]] = None,
            groupdn: Optional[pulumi.Input[str]] = None,
            groupfilter: Optional[pulumi.Input[str]] = None,
            insecure_tls: Optional[pulumi.Input[bool]] = None,
            last_rotation_tolerance: Optional[pulumi.Input[int]] = None,
            length: Optional[pulumi.Input[int]] = None,
            local: Optional[pulumi.Input[bool]] = None,
            max_lease_ttl_seconds: Optional[pulumi.Input[int]] = None,
            max_ttl: Optional[pulumi.Input[int]] = None,
            password_policy: Optional[pulumi.Input[str]] = None,
            request_timeout: Optional[pulumi.Input[int]] = None,
            starttls: Optional[pulumi.Input[bool]] = None,
            tls_max_version: Optional[pulumi.Input[str]] = None,
            tls_min_version: Optional[pulumi.Input[str]] = None,
            ttl: Optional[pulumi.Input[int]] = None,
            upndomain: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None,
            use_pre111_group_cn_behavior: Optional[pulumi.Input[bool]] = None,
            use_token_groups: Optional[pulumi.Input[bool]] = None,
            userattr: Optional[pulumi.Input[str]] = None,
            userdn: Optional[pulumi.Input[str]] = None) -> 'SecretBackend':
        """
        Get an existing SecretBackend resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] anonymous_group_search: Use anonymous binds when performing LDAP group searches
               (if true the initial credentials will still be used for the initial connection test).
        :param pulumi.Input[str] backend: The unique path this backend should be mounted at. Must
               not begin or end with a `/`. Defaults to `ad`.
        :param pulumi.Input[str] binddn: Distinguished name of object to bind when performing user and group search.
        :param pulumi.Input[str] bindpass: Password to use along with binddn when performing user search.
        :param pulumi.Input[bool] case_sensitive_names: If set, user and group names assigned to policies within the
               backend will be case sensitive. Otherwise, names will be normalized to lower case.
        :param pulumi.Input[str] certificate: CA certificate to use when verifying LDAP server certificate, must be
               x509 PEM encoded.
        :param pulumi.Input[str] client_tls_cert: Client certificate to provide to the LDAP server, must be x509 PEM encoded.
        :param pulumi.Input[str] client_tls_key: Client certificate key to provide to the LDAP server, must be x509 PEM encoded.
        :param pulumi.Input[int] default_lease_ttl_seconds: Default lease duration for secrets in seconds.
        :param pulumi.Input[bool] deny_null_bind: Denies an unauthenticated LDAP bind request if the user's password is empty;
               defaults to true.
        :param pulumi.Input[str] description: Human-friendly description of the mount for the Active Directory backend.
        :param pulumi.Input[bool] discoverdn: Use anonymous bind to discover the bind Distinguished Name of a user.
        :param pulumi.Input[str] formatter: Text to insert the password into, ex. "customPrefix{{PASSWORD}}customSuffix". This
               setting is deprecated and should instead use `password_policy`.
        :param pulumi.Input[str] groupattr: LDAP attribute to follow on objects returned by <groupfilter> in order to enumerate
               user group membership. Examples: `cn` or `memberOf`, etc. Defaults to `cn`.
        :param pulumi.Input[str] groupdn: LDAP search base to use for group membership search (eg: ou=Groups,dc=example,dc=org).
        :param pulumi.Input[str] groupfilter: Go template for querying group membership of user (optional) The template can access
               the following context variables: UserDN, Username. Defaults to `(|(memberUid={{.Username}})(member={{.UserDN}})(uniqueMember={{.UserDN}}))`
        :param pulumi.Input[bool] insecure_tls: Skip LDAP server SSL Certificate verification. This is not recommended for production.
               Defaults to `false`.
        :param pulumi.Input[int] last_rotation_tolerance: The number of seconds after a Vault rotation where, if Active Directory
               shows a later rotation, it should be considered out-of-band
        :param pulumi.Input[int] length: The desired length of passwords that Vault generates. This
               setting is deprecated and should instead use `password_policy`.
        :param pulumi.Input[bool] local: Mark the secrets engine as local-only. Local engines are not replicated or removed by
               replication.Tolerance duration to use when checking the last rotation time.
        :param pulumi.Input[int] max_lease_ttl_seconds: Maximum possible lease duration for secrets in seconds.
        :param pulumi.Input[int] max_ttl: In seconds, the maximum password time-to-live.
        :param pulumi.Input[str] password_policy: Name of the password policy to use to generate passwords.
        :param pulumi.Input[int] request_timeout: Timeout, in seconds, for the connection when making requests against the server
               before returning back an error.
        :param pulumi.Input[bool] starttls: Issue a StartTLS command after establishing unencrypted connection.
        :param pulumi.Input[str] tls_max_version: Maximum TLS version to use. Accepted values are `tls10`, `tls11`,
               `tls12` or `tls13`. Defaults to `tls12`.
        :param pulumi.Input[str] tls_min_version: Minimum TLS version to use. Accepted values are `tls10`, `tls11`,
               `tls12` or `tls13`. Defaults to `tls12`.
        :param pulumi.Input[int] ttl: In seconds, the default password time-to-live.
        :param pulumi.Input[str] upndomain: Enables userPrincipalDomain login with [username]@UPNDomain.
        :param pulumi.Input[str] url: LDAP URL to connect to. Multiple URLs can be specified by concatenating
               them with commas; they will be tried in-order. Defaults to `ldap://127.0.0.1`.
        :param pulumi.Input[bool] use_pre111_group_cn_behavior: In Vault 1.1.1 a fix for handling group CN values of
               different cases unfortunately introduced a regression that could cause previously defined groups
               to not be found due to a change in the resulting name. If set true, the pre-1.1.1 behavior for
               matching group CNs will be used. This is only needed in some upgrade scenarios for backwards
               compatibility. It is enabled by default if the config is upgraded but disabled by default on
               new configurations.
        :param pulumi.Input[bool] use_token_groups: If true, use the Active Directory tokenGroups constructed attribute of the
               user to find the group memberships. This will find all security groups including nested ones.
        :param pulumi.Input[str] userattr: Attribute used when searching users. Defaults to `cn`.
        :param pulumi.Input[str] userdn: LDAP domain to use for users (eg: ou=People,dc=example,dc=org)`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["anonymous_group_search"] = anonymous_group_search
        __props__["backend"] = backend
        __props__["binddn"] = binddn
        __props__["bindpass"] = bindpass
        __props__["case_sensitive_names"] = case_sensitive_names
        __props__["certificate"] = certificate
        __props__["client_tls_cert"] = client_tls_cert
        __props__["client_tls_key"] = client_tls_key
        __props__["default_lease_ttl_seconds"] = default_lease_ttl_seconds
        __props__["deny_null_bind"] = deny_null_bind
        __props__["description"] = description
        __props__["discoverdn"] = discoverdn
        __props__["formatter"] = formatter
        __props__["groupattr"] = groupattr
        __props__["groupdn"] = groupdn
        __props__["groupfilter"] = groupfilter
        __props__["insecure_tls"] = insecure_tls
        __props__["last_rotation_tolerance"] = last_rotation_tolerance
        __props__["length"] = length
        __props__["local"] = local
        __props__["max_lease_ttl_seconds"] = max_lease_ttl_seconds
        __props__["max_ttl"] = max_ttl
        __props__["password_policy"] = password_policy
        __props__["request_timeout"] = request_timeout
        __props__["starttls"] = starttls
        __props__["tls_max_version"] = tls_max_version
        __props__["tls_min_version"] = tls_min_version
        __props__["ttl"] = ttl
        __props__["upndomain"] = upndomain
        __props__["url"] = url
        __props__["use_pre111_group_cn_behavior"] = use_pre111_group_cn_behavior
        __props__["use_token_groups"] = use_token_groups
        __props__["userattr"] = userattr
        __props__["userdn"] = userdn
        return SecretBackend(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="anonymousGroupSearch")
    def anonymous_group_search(self) -> pulumi.Output[Optional[bool]]:
        """
        Use anonymous binds when performing LDAP group searches
        (if true the initial credentials will still be used for the initial connection test).
        """
        return pulumi.get(self, "anonymous_group_search")

    @property
    @pulumi.getter
    def backend(self) -> pulumi.Output[Optional[str]]:
        """
        The unique path this backend should be mounted at. Must
        not begin or end with a `/`. Defaults to `ad`.
        """
        return pulumi.get(self, "backend")

    @property
    @pulumi.getter
    def binddn(self) -> pulumi.Output[str]:
        """
        Distinguished name of object to bind when performing user and group search.
        """
        return pulumi.get(self, "binddn")

    @property
    @pulumi.getter
    def bindpass(self) -> pulumi.Output[str]:
        """
        Password to use along with binddn when performing user search.
        """
        return pulumi.get(self, "bindpass")

    @property
    @pulumi.getter(name="caseSensitiveNames")
    def case_sensitive_names(self) -> pulumi.Output[Optional[bool]]:
        """
        If set, user and group names assigned to policies within the
        backend will be case sensitive. Otherwise, names will be normalized to lower case.
        """
        return pulumi.get(self, "case_sensitive_names")

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Output[Optional[str]]:
        """
        CA certificate to use when verifying LDAP server certificate, must be
        x509 PEM encoded.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter(name="clientTlsCert")
    def client_tls_cert(self) -> pulumi.Output[Optional[str]]:
        """
        Client certificate to provide to the LDAP server, must be x509 PEM encoded.
        """
        return pulumi.get(self, "client_tls_cert")

    @property
    @pulumi.getter(name="clientTlsKey")
    def client_tls_key(self) -> pulumi.Output[Optional[str]]:
        """
        Client certificate key to provide to the LDAP server, must be x509 PEM encoded.
        """
        return pulumi.get(self, "client_tls_key")

    @property
    @pulumi.getter(name="defaultLeaseTtlSeconds")
    def default_lease_ttl_seconds(self) -> pulumi.Output[int]:
        """
        Default lease duration for secrets in seconds.
        """
        return pulumi.get(self, "default_lease_ttl_seconds")

    @property
    @pulumi.getter(name="denyNullBind")
    def deny_null_bind(self) -> pulumi.Output[Optional[bool]]:
        """
        Denies an unauthenticated LDAP bind request if the user's password is empty;
        defaults to true.
        """
        return pulumi.get(self, "deny_null_bind")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Human-friendly description of the mount for the Active Directory backend.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def discoverdn(self) -> pulumi.Output[Optional[bool]]:
        """
        Use anonymous bind to discover the bind Distinguished Name of a user.
        """
        return pulumi.get(self, "discoverdn")

    @property
    @pulumi.getter
    def formatter(self) -> pulumi.Output[str]:
        """
        Text to insert the password into, ex. "customPrefix{{PASSWORD}}customSuffix". This
        setting is deprecated and should instead use `password_policy`.
        """
        return pulumi.get(self, "formatter")

    @property
    @pulumi.getter
    def groupattr(self) -> pulumi.Output[Optional[str]]:
        """
        LDAP attribute to follow on objects returned by <groupfilter> in order to enumerate
        user group membership. Examples: `cn` or `memberOf`, etc. Defaults to `cn`.
        """
        return pulumi.get(self, "groupattr")

    @property
    @pulumi.getter
    def groupdn(self) -> pulumi.Output[Optional[str]]:
        """
        LDAP search base to use for group membership search (eg: ou=Groups,dc=example,dc=org).
        """
        return pulumi.get(self, "groupdn")

    @property
    @pulumi.getter
    def groupfilter(self) -> pulumi.Output[Optional[str]]:
        """
        Go template for querying group membership of user (optional) The template can access
        the following context variables: UserDN, Username. Defaults to `(|(memberUid={{.Username}})(member={{.UserDN}})(uniqueMember={{.UserDN}}))`
        """
        return pulumi.get(self, "groupfilter")

    @property
    @pulumi.getter(name="insecureTls")
    def insecure_tls(self) -> pulumi.Output[Optional[bool]]:
        """
        Skip LDAP server SSL Certificate verification. This is not recommended for production.
        Defaults to `false`.
        """
        return pulumi.get(self, "insecure_tls")

    @property
    @pulumi.getter(name="lastRotationTolerance")
    def last_rotation_tolerance(self) -> pulumi.Output[int]:
        """
        The number of seconds after a Vault rotation where, if Active Directory
        shows a later rotation, it should be considered out-of-band
        """
        return pulumi.get(self, "last_rotation_tolerance")

    @property
    @pulumi.getter
    def length(self) -> pulumi.Output[int]:
        """
        The desired length of passwords that Vault generates. This
        setting is deprecated and should instead use `password_policy`.
        """
        return pulumi.get(self, "length")

    @property
    @pulumi.getter
    def local(self) -> pulumi.Output[Optional[bool]]:
        """
        Mark the secrets engine as local-only. Local engines are not replicated or removed by
        replication.Tolerance duration to use when checking the last rotation time.
        """
        return pulumi.get(self, "local")

    @property
    @pulumi.getter(name="maxLeaseTtlSeconds")
    def max_lease_ttl_seconds(self) -> pulumi.Output[int]:
        """
        Maximum possible lease duration for secrets in seconds.
        """
        return pulumi.get(self, "max_lease_ttl_seconds")

    @property
    @pulumi.getter(name="maxTtl")
    def max_ttl(self) -> pulumi.Output[int]:
        """
        In seconds, the maximum password time-to-live.
        """
        return pulumi.get(self, "max_ttl")

    @property
    @pulumi.getter(name="passwordPolicy")
    def password_policy(self) -> pulumi.Output[Optional[str]]:
        """
        Name of the password policy to use to generate passwords.
        """
        return pulumi.get(self, "password_policy")

    @property
    @pulumi.getter(name="requestTimeout")
    def request_timeout(self) -> pulumi.Output[Optional[int]]:
        """
        Timeout, in seconds, for the connection when making requests against the server
        before returning back an error.
        """
        return pulumi.get(self, "request_timeout")

    @property
    @pulumi.getter
    def starttls(self) -> pulumi.Output[bool]:
        """
        Issue a StartTLS command after establishing unencrypted connection.
        """
        return pulumi.get(self, "starttls")

    @property
    @pulumi.getter(name="tlsMaxVersion")
    def tls_max_version(self) -> pulumi.Output[str]:
        """
        Maximum TLS version to use. Accepted values are `tls10`, `tls11`,
        `tls12` or `tls13`. Defaults to `tls12`.
        """
        return pulumi.get(self, "tls_max_version")

    @property
    @pulumi.getter(name="tlsMinVersion")
    def tls_min_version(self) -> pulumi.Output[str]:
        """
        Minimum TLS version to use. Accepted values are `tls10`, `tls11`,
        `tls12` or `tls13`. Defaults to `tls12`.
        """
        return pulumi.get(self, "tls_min_version")

    @property
    @pulumi.getter
    def ttl(self) -> pulumi.Output[int]:
        """
        In seconds, the default password time-to-live.
        """
        return pulumi.get(self, "ttl")

    @property
    @pulumi.getter
    def upndomain(self) -> pulumi.Output[str]:
        """
        Enables userPrincipalDomain login with [username]@UPNDomain.
        """
        return pulumi.get(self, "upndomain")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[Optional[str]]:
        """
        LDAP URL to connect to. Multiple URLs can be specified by concatenating
        them with commas; they will be tried in-order. Defaults to `ldap://127.0.0.1`.
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter(name="usePre111GroupCnBehavior")
    def use_pre111_group_cn_behavior(self) -> pulumi.Output[bool]:
        """
        In Vault 1.1.1 a fix for handling group CN values of
        different cases unfortunately introduced a regression that could cause previously defined groups
        to not be found due to a change in the resulting name. If set true, the pre-1.1.1 behavior for
        matching group CNs will be used. This is only needed in some upgrade scenarios for backwards
        compatibility. It is enabled by default if the config is upgraded but disabled by default on
        new configurations.
        """
        return pulumi.get(self, "use_pre111_group_cn_behavior")

    @property
    @pulumi.getter(name="useTokenGroups")
    def use_token_groups(self) -> pulumi.Output[Optional[bool]]:
        """
        If true, use the Active Directory tokenGroups constructed attribute of the
        user to find the group memberships. This will find all security groups including nested ones.
        """
        return pulumi.get(self, "use_token_groups")

    @property
    @pulumi.getter
    def userattr(self) -> pulumi.Output[Optional[str]]:
        """
        Attribute used when searching users. Defaults to `cn`.
        """
        return pulumi.get(self, "userattr")

    @property
    @pulumi.getter
    def userdn(self) -> pulumi.Output[Optional[str]]:
        """
        LDAP domain to use for users (eg: ou=People,dc=example,dc=org)`.
        """
        return pulumi.get(self, "userdn")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

