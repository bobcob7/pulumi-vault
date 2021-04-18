# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SecretBackendIntermediateSetSignedArgs', 'SecretBackendIntermediateSetSigned']

@pulumi.input_type
class SecretBackendIntermediateSetSignedArgs:
    def __init__(__self__, *,
                 backend: pulumi.Input[str],
                 certificate: pulumi.Input[str]):
        """
        The set of arguments for constructing a SecretBackendIntermediateSetSigned resource.
        :param pulumi.Input[str] backend: The PKI secret backend the resource belongs to.
        :param pulumi.Input[str] certificate: The certificate
        """
        pulumi.set(__self__, "backend", backend)
        pulumi.set(__self__, "certificate", certificate)

    @property
    @pulumi.getter
    def backend(self) -> pulumi.Input[str]:
        """
        The PKI secret backend the resource belongs to.
        """
        return pulumi.get(self, "backend")

    @backend.setter
    def backend(self, value: pulumi.Input[str]):
        pulumi.set(self, "backend", value)

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Input[str]:
        """
        The certificate
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificate", value)


@pulumi.input_type
class _SecretBackendIntermediateSetSignedState:
    def __init__(__self__, *,
                 backend: Optional[pulumi.Input[str]] = None,
                 certificate: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SecretBackendIntermediateSetSigned resources.
        :param pulumi.Input[str] backend: The PKI secret backend the resource belongs to.
        :param pulumi.Input[str] certificate: The certificate
        """
        if backend is not None:
            pulumi.set(__self__, "backend", backend)
        if certificate is not None:
            pulumi.set(__self__, "certificate", certificate)

    @property
    @pulumi.getter
    def backend(self) -> Optional[pulumi.Input[str]]:
        """
        The PKI secret backend the resource belongs to.
        """
        return pulumi.get(self, "backend")

    @backend.setter
    def backend(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backend", value)

    @property
    @pulumi.getter
    def certificate(self) -> Optional[pulumi.Input[str]]:
        """
        The certificate
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate", value)


class SecretBackendIntermediateSetSigned(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backend: Optional[pulumi.Input[str]] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a SecretBackendIntermediateSetSigned resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] backend: The PKI secret backend the resource belongs to.
        :param pulumi.Input[str] certificate: The certificate
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SecretBackendIntermediateSetSignedArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a SecretBackendIntermediateSetSigned resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param SecretBackendIntermediateSetSignedArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecretBackendIntermediateSetSignedArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backend: Optional[pulumi.Input[str]] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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
            __props__ = SecretBackendIntermediateSetSignedArgs.__new__(SecretBackendIntermediateSetSignedArgs)

            if backend is None and not opts.urn:
                raise TypeError("Missing required property 'backend'")
            __props__.__dict__["backend"] = backend
            if certificate is None and not opts.urn:
                raise TypeError("Missing required property 'certificate'")
            __props__.__dict__["certificate"] = certificate
        super(SecretBackendIntermediateSetSigned, __self__).__init__(
            'vault:pkiSecret/secretBackendIntermediateSetSigned:SecretBackendIntermediateSetSigned',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backend: Optional[pulumi.Input[str]] = None,
            certificate: Optional[pulumi.Input[str]] = None) -> 'SecretBackendIntermediateSetSigned':
        """
        Get an existing SecretBackendIntermediateSetSigned resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] backend: The PKI secret backend the resource belongs to.
        :param pulumi.Input[str] certificate: The certificate
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecretBackendIntermediateSetSignedState.__new__(_SecretBackendIntermediateSetSignedState)

        __props__.__dict__["backend"] = backend
        __props__.__dict__["certificate"] = certificate
        return SecretBackendIntermediateSetSigned(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def backend(self) -> pulumi.Output[str]:
        """
        The PKI secret backend the resource belongs to.
        """
        return pulumi.get(self, "backend")

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Output[str]:
        """
        The certificate
        """
        return pulumi.get(self, "certificate")

