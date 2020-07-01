# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetAccessCredentialsResult:
    """
    A collection of values returned by getAccessCredentials.
    """
    def __init__(__self__, access_key=None, backend=None, id=None, lease_duration=None, lease_id=None, lease_renewable=None, lease_start_time=None, role=None, role_arn=None, secret_key=None, security_token=None, type=None):
        if access_key and not isinstance(access_key, str):
            raise TypeError("Expected argument 'access_key' to be a str")
        __self__.access_key = access_key
        """
        The AWS Access Key ID returned by Vault.
        """
        if backend and not isinstance(backend, str):
            raise TypeError("Expected argument 'backend' to be a str")
        __self__.backend = backend
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The provider-assigned unique ID for this managed resource.
        """
        if lease_duration and not isinstance(lease_duration, float):
            raise TypeError("Expected argument 'lease_duration' to be a float")
        __self__.lease_duration = lease_duration
        """
        The duration of the secret lease, in seconds relative
        to the time the data was requested. Once this time has passed any plan
        generated with this data may fail to apply.
        """
        if lease_id and not isinstance(lease_id, str):
            raise TypeError("Expected argument 'lease_id' to be a str")
        __self__.lease_id = lease_id
        """
        The lease identifier assigned by Vault.
        """
        if lease_renewable and not isinstance(lease_renewable, bool):
            raise TypeError("Expected argument 'lease_renewable' to be a bool")
        __self__.lease_renewable = lease_renewable
        if lease_start_time and not isinstance(lease_start_time, str):
            raise TypeError("Expected argument 'lease_start_time' to be a str")
        __self__.lease_start_time = lease_start_time
        if role and not isinstance(role, str):
            raise TypeError("Expected argument 'role' to be a str")
        __self__.role = role
        if role_arn and not isinstance(role_arn, str):
            raise TypeError("Expected argument 'role_arn' to be a str")
        __self__.role_arn = role_arn
        if secret_key and not isinstance(secret_key, str):
            raise TypeError("Expected argument 'secret_key' to be a str")
        __self__.secret_key = secret_key
        """
        The AWS Secret Key returned by Vault.
        """
        if security_token and not isinstance(security_token, str):
            raise TypeError("Expected argument 'security_token' to be a str")
        __self__.security_token = security_token
        """
        The STS token returned by Vault, if any.
        """
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        __self__.type = type
class AwaitableGetAccessCredentialsResult(GetAccessCredentialsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccessCredentialsResult(
            access_key=self.access_key,
            backend=self.backend,
            id=self.id,
            lease_duration=self.lease_duration,
            lease_id=self.lease_id,
            lease_renewable=self.lease_renewable,
            lease_start_time=self.lease_start_time,
            role=self.role,
            role_arn=self.role_arn,
            secret_key=self.secret_key,
            security_token=self.security_token,
            type=self.type)

def get_access_credentials(backend=None,role=None,role_arn=None,type=None,opts=None):
    """
    Use this data source to access information about an existing resource.

    :param str backend: The path to the AWS secret backend to
           read credentials from, with no leading or trailing `/`s.
    :param str role: The name of the AWS secret backend role to read
           credentials from, with no leading or trailing `/`s.
    :param str role_arn: The specific AWS ARN to use
           from the configured role. If the role does not have multiple ARNs, this does
           not need to be specified.
    :param str type: The type of credentials to read. Defaults
           to `"creds"`, which just returns an AWS Access Key ID and Secret
           Key. Can also be set to `"sts"`, which will return a security token
           in addition to the keys.
    """
    __args__ = dict()


    __args__['backend'] = backend
    __args__['role'] = role
    __args__['roleArn'] = role_arn
    __args__['type'] = type
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('vault:aws/getAccessCredentials:getAccessCredentials', __args__, opts=opts).value

    return AwaitableGetAccessCredentialsResult(
        access_key=__ret__.get('accessKey'),
        backend=__ret__.get('backend'),
        id=__ret__.get('id'),
        lease_duration=__ret__.get('leaseDuration'),
        lease_id=__ret__.get('leaseId'),
        lease_renewable=__ret__.get('leaseRenewable'),
        lease_start_time=__ret__.get('leaseStartTime'),
        role=__ret__.get('role'),
        role_arn=__ret__.get('roleArn'),
        secret_key=__ret__.get('secretKey'),
        security_token=__ret__.get('securityToken'),
        type=__ret__.get('type'))
