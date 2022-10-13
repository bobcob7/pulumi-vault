# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['MfaTotpArgs', 'MfaTotp']

@pulumi.input_type
class MfaTotpArgs:
    def __init__(__self__, *,
                 issuer: pulumi.Input[str],
                 algorithm: Optional[pulumi.Input[str]] = None,
                 digits: Optional[pulumi.Input[int]] = None,
                 key_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 qr_size: Optional[pulumi.Input[int]] = None,
                 skew: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a MfaTotp resource.
        :param pulumi.Input[str] issuer: `(string: <required>)` - The name of the key's issuing organization.
        :param pulumi.Input[str] algorithm: `(string)` - Specifies the hashing algorithm used to generate the TOTP code.
               Options include `SHA1`, `SHA256` and `SHA512`
        :param pulumi.Input[int] digits: `(int)` - The number of digits in the generated TOTP token.
               This value can either be 6 or 8.
        :param pulumi.Input[int] key_size: `(int)` - Specifies the size in bytes of the generated key.
        :param pulumi.Input[str] name: `(string: <required>)` – Name of the MFA method.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[int] period: `(int)` - The length of time used to generate a counter for the TOTP token calculation.
        :param pulumi.Input[int] qr_size: `(int)` - The pixel size of the generated square QR code.
        :param pulumi.Input[int] skew: `(int)` - The number of delay periods that are allowed when validating a TOTP token.
               This value can either be 0 or 1.
        """
        pulumi.set(__self__, "issuer", issuer)
        if algorithm is not None:
            pulumi.set(__self__, "algorithm", algorithm)
        if digits is not None:
            pulumi.set(__self__, "digits", digits)
        if key_size is not None:
            pulumi.set(__self__, "key_size", key_size)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if period is not None:
            pulumi.set(__self__, "period", period)
        if qr_size is not None:
            pulumi.set(__self__, "qr_size", qr_size)
        if skew is not None:
            pulumi.set(__self__, "skew", skew)

    @property
    @pulumi.getter
    def issuer(self) -> pulumi.Input[str]:
        """
        `(string: <required>)` - The name of the key's issuing organization.
        """
        return pulumi.get(self, "issuer")

    @issuer.setter
    def issuer(self, value: pulumi.Input[str]):
        pulumi.set(self, "issuer", value)

    @property
    @pulumi.getter
    def algorithm(self) -> Optional[pulumi.Input[str]]:
        """
        `(string)` - Specifies the hashing algorithm used to generate the TOTP code.
        Options include `SHA1`, `SHA256` and `SHA512`
        """
        return pulumi.get(self, "algorithm")

    @algorithm.setter
    def algorithm(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "algorithm", value)

    @property
    @pulumi.getter
    def digits(self) -> Optional[pulumi.Input[int]]:
        """
        `(int)` - The number of digits in the generated TOTP token.
        This value can either be 6 or 8.
        """
        return pulumi.get(self, "digits")

    @digits.setter
    def digits(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "digits", value)

    @property
    @pulumi.getter(name="keySize")
    def key_size(self) -> Optional[pulumi.Input[int]]:
        """
        `(int)` - Specifies the size in bytes of the generated key.
        """
        return pulumi.get(self, "key_size")

    @key_size.setter
    def key_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "key_size", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` – Name of the MFA method.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[str]]:
        """
        The namespace to provision the resource in.
        The value should not contain leading or trailing forward slashes.
        The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        *Available only for Vault Enterprise*.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace", value)

    @property
    @pulumi.getter
    def period(self) -> Optional[pulumi.Input[int]]:
        """
        `(int)` - The length of time used to generate a counter for the TOTP token calculation.
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter(name="qrSize")
    def qr_size(self) -> Optional[pulumi.Input[int]]:
        """
        `(int)` - The pixel size of the generated square QR code.
        """
        return pulumi.get(self, "qr_size")

    @qr_size.setter
    def qr_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "qr_size", value)

    @property
    @pulumi.getter
    def skew(self) -> Optional[pulumi.Input[int]]:
        """
        `(int)` - The number of delay periods that are allowed when validating a TOTP token.
        This value can either be 0 or 1.
        """
        return pulumi.get(self, "skew")

    @skew.setter
    def skew(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "skew", value)


@pulumi.input_type
class _MfaTotpState:
    def __init__(__self__, *,
                 algorithm: Optional[pulumi.Input[str]] = None,
                 digits: Optional[pulumi.Input[int]] = None,
                 issuer: Optional[pulumi.Input[str]] = None,
                 key_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 qr_size: Optional[pulumi.Input[int]] = None,
                 skew: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering MfaTotp resources.
        :param pulumi.Input[str] algorithm: `(string)` - Specifies the hashing algorithm used to generate the TOTP code.
               Options include `SHA1`, `SHA256` and `SHA512`
        :param pulumi.Input[int] digits: `(int)` - The number of digits in the generated TOTP token.
               This value can either be 6 or 8.
        :param pulumi.Input[str] issuer: `(string: <required>)` - The name of the key's issuing organization.
        :param pulumi.Input[int] key_size: `(int)` - Specifies the size in bytes of the generated key.
        :param pulumi.Input[str] name: `(string: <required>)` – Name of the MFA method.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[int] period: `(int)` - The length of time used to generate a counter for the TOTP token calculation.
        :param pulumi.Input[int] qr_size: `(int)` - The pixel size of the generated square QR code.
        :param pulumi.Input[int] skew: `(int)` - The number of delay periods that are allowed when validating a TOTP token.
               This value can either be 0 or 1.
        """
        if algorithm is not None:
            pulumi.set(__self__, "algorithm", algorithm)
        if digits is not None:
            pulumi.set(__self__, "digits", digits)
        if issuer is not None:
            pulumi.set(__self__, "issuer", issuer)
        if key_size is not None:
            pulumi.set(__self__, "key_size", key_size)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if period is not None:
            pulumi.set(__self__, "period", period)
        if qr_size is not None:
            pulumi.set(__self__, "qr_size", qr_size)
        if skew is not None:
            pulumi.set(__self__, "skew", skew)

    @property
    @pulumi.getter
    def algorithm(self) -> Optional[pulumi.Input[str]]:
        """
        `(string)` - Specifies the hashing algorithm used to generate the TOTP code.
        Options include `SHA1`, `SHA256` and `SHA512`
        """
        return pulumi.get(self, "algorithm")

    @algorithm.setter
    def algorithm(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "algorithm", value)

    @property
    @pulumi.getter
    def digits(self) -> Optional[pulumi.Input[int]]:
        """
        `(int)` - The number of digits in the generated TOTP token.
        This value can either be 6 or 8.
        """
        return pulumi.get(self, "digits")

    @digits.setter
    def digits(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "digits", value)

    @property
    @pulumi.getter
    def issuer(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` - The name of the key's issuing organization.
        """
        return pulumi.get(self, "issuer")

    @issuer.setter
    def issuer(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "issuer", value)

    @property
    @pulumi.getter(name="keySize")
    def key_size(self) -> Optional[pulumi.Input[int]]:
        """
        `(int)` - Specifies the size in bytes of the generated key.
        """
        return pulumi.get(self, "key_size")

    @key_size.setter
    def key_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "key_size", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        `(string: <required>)` – Name of the MFA method.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[str]]:
        """
        The namespace to provision the resource in.
        The value should not contain leading or trailing forward slashes.
        The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        *Available only for Vault Enterprise*.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace", value)

    @property
    @pulumi.getter
    def period(self) -> Optional[pulumi.Input[int]]:
        """
        `(int)` - The length of time used to generate a counter for the TOTP token calculation.
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter(name="qrSize")
    def qr_size(self) -> Optional[pulumi.Input[int]]:
        """
        `(int)` - The pixel size of the generated square QR code.
        """
        return pulumi.get(self, "qr_size")

    @qr_size.setter
    def qr_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "qr_size", value)

    @property
    @pulumi.getter
    def skew(self) -> Optional[pulumi.Input[int]]:
        """
        `(int)` - The number of delay periods that are allowed when validating a TOTP token.
        This value can either be 0 or 1.
        """
        return pulumi.get(self, "skew")

    @skew.setter
    def skew(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "skew", value)


class MfaTotp(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 algorithm: Optional[pulumi.Input[str]] = None,
                 digits: Optional[pulumi.Input[int]] = None,
                 issuer: Optional[pulumi.Input[str]] = None,
                 key_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 qr_size: Optional[pulumi.Input[int]] = None,
                 skew: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a resource to manage [TOTP MFA](https://www.vaultproject.io/docs/enterprise/mfa/mfa-totp).

        **Note** this feature is available only with Vault Enterprise.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_vault as vault

        my_totp = vault.MfaTotp("myTotp",
            algorithm="SHA256",
            digits=8,
            issuer="hashicorp",
            key_size=20,
            period=60)
        ```

        ## Import

        Mounts can be imported using the `path`, e.g.

        ```sh
         $ pulumi import vault:index/mfaTotp:MfaTotp my_totp my_totp
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] algorithm: `(string)` - Specifies the hashing algorithm used to generate the TOTP code.
               Options include `SHA1`, `SHA256` and `SHA512`
        :param pulumi.Input[int] digits: `(int)` - The number of digits in the generated TOTP token.
               This value can either be 6 or 8.
        :param pulumi.Input[str] issuer: `(string: <required>)` - The name of the key's issuing organization.
        :param pulumi.Input[int] key_size: `(int)` - Specifies the size in bytes of the generated key.
        :param pulumi.Input[str] name: `(string: <required>)` – Name of the MFA method.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[int] period: `(int)` - The length of time used to generate a counter for the TOTP token calculation.
        :param pulumi.Input[int] qr_size: `(int)` - The pixel size of the generated square QR code.
        :param pulumi.Input[int] skew: `(int)` - The number of delay periods that are allowed when validating a TOTP token.
               This value can either be 0 or 1.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MfaTotpArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage [TOTP MFA](https://www.vaultproject.io/docs/enterprise/mfa/mfa-totp).

        **Note** this feature is available only with Vault Enterprise.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_vault as vault

        my_totp = vault.MfaTotp("myTotp",
            algorithm="SHA256",
            digits=8,
            issuer="hashicorp",
            key_size=20,
            period=60)
        ```

        ## Import

        Mounts can be imported using the `path`, e.g.

        ```sh
         $ pulumi import vault:index/mfaTotp:MfaTotp my_totp my_totp
        ```

        :param str resource_name: The name of the resource.
        :param MfaTotpArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MfaTotpArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 algorithm: Optional[pulumi.Input[str]] = None,
                 digits: Optional[pulumi.Input[int]] = None,
                 issuer: Optional[pulumi.Input[str]] = None,
                 key_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 qr_size: Optional[pulumi.Input[int]] = None,
                 skew: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MfaTotpArgs.__new__(MfaTotpArgs)

            __props__.__dict__["algorithm"] = algorithm
            __props__.__dict__["digits"] = digits
            if issuer is None and not opts.urn:
                raise TypeError("Missing required property 'issuer'")
            __props__.__dict__["issuer"] = issuer
            __props__.__dict__["key_size"] = key_size
            __props__.__dict__["name"] = name
            __props__.__dict__["namespace"] = namespace
            __props__.__dict__["period"] = period
            __props__.__dict__["qr_size"] = qr_size
            __props__.__dict__["skew"] = skew
        super(MfaTotp, __self__).__init__(
            'vault:index/mfaTotp:MfaTotp',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            algorithm: Optional[pulumi.Input[str]] = None,
            digits: Optional[pulumi.Input[int]] = None,
            issuer: Optional[pulumi.Input[str]] = None,
            key_size: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            namespace: Optional[pulumi.Input[str]] = None,
            period: Optional[pulumi.Input[int]] = None,
            qr_size: Optional[pulumi.Input[int]] = None,
            skew: Optional[pulumi.Input[int]] = None) -> 'MfaTotp':
        """
        Get an existing MfaTotp resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] algorithm: `(string)` - Specifies the hashing algorithm used to generate the TOTP code.
               Options include `SHA1`, `SHA256` and `SHA512`
        :param pulumi.Input[int] digits: `(int)` - The number of digits in the generated TOTP token.
               This value can either be 6 or 8.
        :param pulumi.Input[str] issuer: `(string: <required>)` - The name of the key's issuing organization.
        :param pulumi.Input[int] key_size: `(int)` - Specifies the size in bytes of the generated key.
        :param pulumi.Input[str] name: `(string: <required>)` – Name of the MFA method.
        :param pulumi.Input[str] namespace: The namespace to provision the resource in.
               The value should not contain leading or trailing forward slashes.
               The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
               *Available only for Vault Enterprise*.
        :param pulumi.Input[int] period: `(int)` - The length of time used to generate a counter for the TOTP token calculation.
        :param pulumi.Input[int] qr_size: `(int)` - The pixel size of the generated square QR code.
        :param pulumi.Input[int] skew: `(int)` - The number of delay periods that are allowed when validating a TOTP token.
               This value can either be 0 or 1.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MfaTotpState.__new__(_MfaTotpState)

        __props__.__dict__["algorithm"] = algorithm
        __props__.__dict__["digits"] = digits
        __props__.__dict__["issuer"] = issuer
        __props__.__dict__["key_size"] = key_size
        __props__.__dict__["name"] = name
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["period"] = period
        __props__.__dict__["qr_size"] = qr_size
        __props__.__dict__["skew"] = skew
        return MfaTotp(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def algorithm(self) -> pulumi.Output[Optional[str]]:
        """
        `(string)` - Specifies the hashing algorithm used to generate the TOTP code.
        Options include `SHA1`, `SHA256` and `SHA512`
        """
        return pulumi.get(self, "algorithm")

    @property
    @pulumi.getter
    def digits(self) -> pulumi.Output[Optional[int]]:
        """
        `(int)` - The number of digits in the generated TOTP token.
        This value can either be 6 or 8.
        """
        return pulumi.get(self, "digits")

    @property
    @pulumi.getter
    def issuer(self) -> pulumi.Output[str]:
        """
        `(string: <required>)` - The name of the key's issuing organization.
        """
        return pulumi.get(self, "issuer")

    @property
    @pulumi.getter(name="keySize")
    def key_size(self) -> pulumi.Output[Optional[int]]:
        """
        `(int)` - Specifies the size in bytes of the generated key.
        """
        return pulumi.get(self, "key_size")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        `(string: <required>)` – Name of the MFA method.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def namespace(self) -> pulumi.Output[Optional[str]]:
        """
        The namespace to provision the resource in.
        The value should not contain leading or trailing forward slashes.
        The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        *Available only for Vault Enterprise*.
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter
    def period(self) -> pulumi.Output[Optional[int]]:
        """
        `(int)` - The length of time used to generate a counter for the TOTP token calculation.
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter(name="qrSize")
    def qr_size(self) -> pulumi.Output[Optional[int]]:
        """
        `(int)` - The pixel size of the generated square QR code.
        """
        return pulumi.get(self, "qr_size")

    @property
    @pulumi.getter
    def skew(self) -> pulumi.Output[Optional[int]]:
        """
        `(int)` - The number of delay periods that are allowed when validating a TOTP token.
        This value can either be 0 or 1.
        """
        return pulumi.get(self, "skew")

