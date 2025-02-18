# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'KeysAwArgs',
    'KeysAzureArgs',
    'KeysPkcArgs',
]

@pulumi.input_type
class KeysAwArgs:
    def __init__(__self__, *,
                 access_key: pulumi.Input[str],
                 key_bits: pulumi.Input[str],
                 key_type: pulumi.Input[str],
                 kms_key: pulumi.Input[str],
                 name: pulumi.Input[str],
                 secret_key: pulumi.Input[str],
                 allow_generate_key: Optional[pulumi.Input[bool]] = None,
                 allow_replace_key: Optional[pulumi.Input[bool]] = None,
                 allow_store_key: Optional[pulumi.Input[bool]] = None,
                 any_mount: Optional[pulumi.Input[bool]] = None,
                 curve: Optional[pulumi.Input[str]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 uuid: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] access_key: The AWS access key to use.
        :param pulumi.Input[str] key_bits: Supplies the size in bits of the key when using `CKM_RSA_PKCS_PSS`,
               `CKM_RSA_PKCS_OAEP` or `CKM_RSA_PKCS` as a value for `mechanism`. Required if
               `allow_generate_key` is `true`.
        :param pulumi.Input[str] key_type: The type of key to use.
        :param pulumi.Input[str] kms_key: An identifier for the key.
        :param pulumi.Input[str] name: A unique lowercase name that serves as identifying the key.
        :param pulumi.Input[str] secret_key: The AWS access key to use.
        :param pulumi.Input[bool] allow_generate_key: If no existing key can be found in 
               the referenced backend, instructs Vault to generate a key within the backend.
        :param pulumi.Input[bool] allow_replace_key: Controls the ability for Vault to replace through
               generation or importing a key into the configured backend even
               if a key is present, if set to `false` those operations are forbidden
               if a key exists.
        :param pulumi.Input[bool] allow_store_key: Controls the ability for Vault to import a key to the
               configured backend, if `false`, those operations will be forbidden.
        :param pulumi.Input[bool] any_mount: If `true`, allows usage from any mount point within the
               namespace.
        :param pulumi.Input[str] curve: Supplies the curve value when using the `CKM_ECDSA` mechanism.
               Required if `allow_generate_key` is `true`.
        :param pulumi.Input[str] endpoint: Used to specify a custom AWS endpoint.
        :param pulumi.Input[str] region: The AWS region where the keys are stored (or will be stored).
        """
        pulumi.set(__self__, "access_key", access_key)
        pulumi.set(__self__, "key_bits", key_bits)
        pulumi.set(__self__, "key_type", key_type)
        pulumi.set(__self__, "kms_key", kms_key)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "secret_key", secret_key)
        if allow_generate_key is not None:
            pulumi.set(__self__, "allow_generate_key", allow_generate_key)
        if allow_replace_key is not None:
            pulumi.set(__self__, "allow_replace_key", allow_replace_key)
        if allow_store_key is not None:
            pulumi.set(__self__, "allow_store_key", allow_store_key)
        if any_mount is not None:
            pulumi.set(__self__, "any_mount", any_mount)
        if curve is not None:
            pulumi.set(__self__, "curve", curve)
        if endpoint is not None:
            pulumi.set(__self__, "endpoint", endpoint)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if uuid is not None:
            pulumi.set(__self__, "uuid", uuid)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> pulumi.Input[str]:
        """
        The AWS access key to use.
        """
        return pulumi.get(self, "access_key")

    @access_key.setter
    def access_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "access_key", value)

    @property
    @pulumi.getter(name="keyBits")
    def key_bits(self) -> pulumi.Input[str]:
        """
        Supplies the size in bits of the key when using `CKM_RSA_PKCS_PSS`,
        `CKM_RSA_PKCS_OAEP` or `CKM_RSA_PKCS` as a value for `mechanism`. Required if
        `allow_generate_key` is `true`.
        """
        return pulumi.get(self, "key_bits")

    @key_bits.setter
    def key_bits(self, value: pulumi.Input[str]):
        pulumi.set(self, "key_bits", value)

    @property
    @pulumi.getter(name="keyType")
    def key_type(self) -> pulumi.Input[str]:
        """
        The type of key to use.
        """
        return pulumi.get(self, "key_type")

    @key_type.setter
    def key_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "key_type", value)

    @property
    @pulumi.getter(name="kmsKey")
    def kms_key(self) -> pulumi.Input[str]:
        """
        An identifier for the key.
        """
        return pulumi.get(self, "kms_key")

    @kms_key.setter
    def kms_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "kms_key", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        A unique lowercase name that serves as identifying the key.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> pulumi.Input[str]:
        """
        The AWS access key to use.
        """
        return pulumi.get(self, "secret_key")

    @secret_key.setter
    def secret_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "secret_key", value)

    @property
    @pulumi.getter(name="allowGenerateKey")
    def allow_generate_key(self) -> Optional[pulumi.Input[bool]]:
        """
        If no existing key can be found in 
        the referenced backend, instructs Vault to generate a key within the backend.
        """
        return pulumi.get(self, "allow_generate_key")

    @allow_generate_key.setter
    def allow_generate_key(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_generate_key", value)

    @property
    @pulumi.getter(name="allowReplaceKey")
    def allow_replace_key(self) -> Optional[pulumi.Input[bool]]:
        """
        Controls the ability for Vault to replace through
        generation or importing a key into the configured backend even
        if a key is present, if set to `false` those operations are forbidden
        if a key exists.
        """
        return pulumi.get(self, "allow_replace_key")

    @allow_replace_key.setter
    def allow_replace_key(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_replace_key", value)

    @property
    @pulumi.getter(name="allowStoreKey")
    def allow_store_key(self) -> Optional[pulumi.Input[bool]]:
        """
        Controls the ability for Vault to import a key to the
        configured backend, if `false`, those operations will be forbidden.
        """
        return pulumi.get(self, "allow_store_key")

    @allow_store_key.setter
    def allow_store_key(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_store_key", value)

    @property
    @pulumi.getter(name="anyMount")
    def any_mount(self) -> Optional[pulumi.Input[bool]]:
        """
        If `true`, allows usage from any mount point within the
        namespace.
        """
        return pulumi.get(self, "any_mount")

    @any_mount.setter
    def any_mount(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "any_mount", value)

    @property
    @pulumi.getter
    def curve(self) -> Optional[pulumi.Input[str]]:
        """
        Supplies the curve value when using the `CKM_ECDSA` mechanism.
        Required if `allow_generate_key` is `true`.
        """
        return pulumi.get(self, "curve")

    @curve.setter
    def curve(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "curve", value)

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        Used to specify a custom AWS endpoint.
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS region where the keys are stored (or will be stored).
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def uuid(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "uuid")

    @uuid.setter
    def uuid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uuid", value)


@pulumi.input_type
class KeysAzureArgs:
    def __init__(__self__, *,
                 client_id: pulumi.Input[str],
                 client_secret: pulumi.Input[str],
                 key_name: pulumi.Input[str],
                 key_type: pulumi.Input[str],
                 name: pulumi.Input[str],
                 tenant_id: pulumi.Input[str],
                 vault_name: pulumi.Input[str],
                 allow_generate_key: Optional[pulumi.Input[bool]] = None,
                 allow_replace_key: Optional[pulumi.Input[bool]] = None,
                 allow_store_key: Optional[pulumi.Input[bool]] = None,
                 any_mount: Optional[pulumi.Input[bool]] = None,
                 environment: Optional[pulumi.Input[str]] = None,
                 key_bits: Optional[pulumi.Input[str]] = None,
                 resource: Optional[pulumi.Input[str]] = None,
                 uuid: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] client_id: The client id for credentials to query the Azure APIs.
        :param pulumi.Input[str] client_secret: The client secret for credentials to query the Azure APIs.
        :param pulumi.Input[str] key_name: The Key Vault key to use for encryption and decryption.
        :param pulumi.Input[str] key_type: The type of key to use.
        :param pulumi.Input[str] name: A unique lowercase name that serves as identifying the key.
        :param pulumi.Input[str] tenant_id: The tenant id for the Azure Active Directory organization.
        :param pulumi.Input[str] vault_name: The Key Vault vault to use for encryption and decryption.
        :param pulumi.Input[bool] allow_generate_key: If no existing key can be found in 
               the referenced backend, instructs Vault to generate a key within the backend.
        :param pulumi.Input[bool] allow_replace_key: Controls the ability for Vault to replace through
               generation or importing a key into the configured backend even
               if a key is present, if set to `false` those operations are forbidden
               if a key exists.
        :param pulumi.Input[bool] allow_store_key: Controls the ability for Vault to import a key to the
               configured backend, if `false`, those operations will be forbidden.
        :param pulumi.Input[bool] any_mount: If `true`, allows usage from any mount point within the
               namespace.
        :param pulumi.Input[str] environment: The Azure Cloud environment API endpoints to use.
        :param pulumi.Input[str] key_bits: Supplies the size in bits of the key when using `CKM_RSA_PKCS_PSS`,
               `CKM_RSA_PKCS_OAEP` or `CKM_RSA_PKCS` as a value for `mechanism`. Required if
               `allow_generate_key` is `true`.
        :param pulumi.Input[str] resource: The Azure Key Vault resource's DNS Suffix to connect to.
        """
        pulumi.set(__self__, "client_id", client_id)
        pulumi.set(__self__, "client_secret", client_secret)
        pulumi.set(__self__, "key_name", key_name)
        pulumi.set(__self__, "key_type", key_type)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "tenant_id", tenant_id)
        pulumi.set(__self__, "vault_name", vault_name)
        if allow_generate_key is not None:
            pulumi.set(__self__, "allow_generate_key", allow_generate_key)
        if allow_replace_key is not None:
            pulumi.set(__self__, "allow_replace_key", allow_replace_key)
        if allow_store_key is not None:
            pulumi.set(__self__, "allow_store_key", allow_store_key)
        if any_mount is not None:
            pulumi.set(__self__, "any_mount", any_mount)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if key_bits is not None:
            pulumi.set(__self__, "key_bits", key_bits)
        if resource is not None:
            pulumi.set(__self__, "resource", resource)
        if uuid is not None:
            pulumi.set(__self__, "uuid", uuid)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Input[str]:
        """
        The client id for credentials to query the Azure APIs.
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> pulumi.Input[str]:
        """
        The client secret for credentials to query the Azure APIs.
        """
        return pulumi.get(self, "client_secret")

    @client_secret.setter
    def client_secret(self, value: pulumi.Input[str]):
        pulumi.set(self, "client_secret", value)

    @property
    @pulumi.getter(name="keyName")
    def key_name(self) -> pulumi.Input[str]:
        """
        The Key Vault key to use for encryption and decryption.
        """
        return pulumi.get(self, "key_name")

    @key_name.setter
    def key_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "key_name", value)

    @property
    @pulumi.getter(name="keyType")
    def key_type(self) -> pulumi.Input[str]:
        """
        The type of key to use.
        """
        return pulumi.get(self, "key_type")

    @key_type.setter
    def key_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "key_type", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        A unique lowercase name that serves as identifying the key.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> pulumi.Input[str]:
        """
        The tenant id for the Azure Active Directory organization.
        """
        return pulumi.get(self, "tenant_id")

    @tenant_id.setter
    def tenant_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "tenant_id", value)

    @property
    @pulumi.getter(name="vaultName")
    def vault_name(self) -> pulumi.Input[str]:
        """
        The Key Vault vault to use for encryption and decryption.
        """
        return pulumi.get(self, "vault_name")

    @vault_name.setter
    def vault_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "vault_name", value)

    @property
    @pulumi.getter(name="allowGenerateKey")
    def allow_generate_key(self) -> Optional[pulumi.Input[bool]]:
        """
        If no existing key can be found in 
        the referenced backend, instructs Vault to generate a key within the backend.
        """
        return pulumi.get(self, "allow_generate_key")

    @allow_generate_key.setter
    def allow_generate_key(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_generate_key", value)

    @property
    @pulumi.getter(name="allowReplaceKey")
    def allow_replace_key(self) -> Optional[pulumi.Input[bool]]:
        """
        Controls the ability for Vault to replace through
        generation or importing a key into the configured backend even
        if a key is present, if set to `false` those operations are forbidden
        if a key exists.
        """
        return pulumi.get(self, "allow_replace_key")

    @allow_replace_key.setter
    def allow_replace_key(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_replace_key", value)

    @property
    @pulumi.getter(name="allowStoreKey")
    def allow_store_key(self) -> Optional[pulumi.Input[bool]]:
        """
        Controls the ability for Vault to import a key to the
        configured backend, if `false`, those operations will be forbidden.
        """
        return pulumi.get(self, "allow_store_key")

    @allow_store_key.setter
    def allow_store_key(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_store_key", value)

    @property
    @pulumi.getter(name="anyMount")
    def any_mount(self) -> Optional[pulumi.Input[bool]]:
        """
        If `true`, allows usage from any mount point within the
        namespace.
        """
        return pulumi.get(self, "any_mount")

    @any_mount.setter
    def any_mount(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "any_mount", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input[str]]:
        """
        The Azure Cloud environment API endpoints to use.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter(name="keyBits")
    def key_bits(self) -> Optional[pulumi.Input[str]]:
        """
        Supplies the size in bits of the key when using `CKM_RSA_PKCS_PSS`,
        `CKM_RSA_PKCS_OAEP` or `CKM_RSA_PKCS` as a value for `mechanism`. Required if
        `allow_generate_key` is `true`.
        """
        return pulumi.get(self, "key_bits")

    @key_bits.setter
    def key_bits(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key_bits", value)

    @property
    @pulumi.getter
    def resource(self) -> Optional[pulumi.Input[str]]:
        """
        The Azure Key Vault resource's DNS Suffix to connect to.
        """
        return pulumi.get(self, "resource")

    @resource.setter
    def resource(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource", value)

    @property
    @pulumi.getter
    def uuid(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "uuid")

    @uuid.setter
    def uuid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uuid", value)


@pulumi.input_type
class KeysPkcArgs:
    def __init__(__self__, *,
                 key_id: pulumi.Input[str],
                 key_label: pulumi.Input[str],
                 library: pulumi.Input[str],
                 mechanism: pulumi.Input[str],
                 name: pulumi.Input[str],
                 pin: pulumi.Input[str],
                 allow_generate_key: Optional[pulumi.Input[bool]] = None,
                 allow_replace_key: Optional[pulumi.Input[bool]] = None,
                 allow_store_key: Optional[pulumi.Input[bool]] = None,
                 any_mount: Optional[pulumi.Input[bool]] = None,
                 curve: Optional[pulumi.Input[str]] = None,
                 force_rw_session: Optional[pulumi.Input[str]] = None,
                 key_bits: Optional[pulumi.Input[str]] = None,
                 slot: Optional[pulumi.Input[str]] = None,
                 token_label: Optional[pulumi.Input[str]] = None,
                 uuid: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] key_id: The id of a PKCS#11 key to use.
        :param pulumi.Input[str] key_label: The label of the key to use.
        :param pulumi.Input[str] library: The name of the kms_library stanza to use from Vault's config
               to lookup the local library path.
        :param pulumi.Input[str] mechanism: The encryption/decryption mechanism to use, specified as a
               hexadecimal (prefixed by 0x) string.
        :param pulumi.Input[str] name: A unique lowercase name that serves as identifying the key.
        :param pulumi.Input[str] pin: The PIN for login.
        :param pulumi.Input[bool] allow_generate_key: If no existing key can be found in 
               the referenced backend, instructs Vault to generate a key within the backend.
        :param pulumi.Input[bool] allow_replace_key: Controls the ability for Vault to replace through
               generation or importing a key into the configured backend even
               if a key is present, if set to `false` those operations are forbidden
               if a key exists.
        :param pulumi.Input[bool] allow_store_key: Controls the ability for Vault to import a key to the
               configured backend, if `false`, those operations will be forbidden.
        :param pulumi.Input[bool] any_mount: If `true`, allows usage from any mount point within the
               namespace.
        :param pulumi.Input[str] curve: Supplies the curve value when using the `CKM_ECDSA` mechanism.
               Required if `allow_generate_key` is `true`.
        :param pulumi.Input[str] force_rw_session: Force all operations to open up a read-write session to
               the HSM.
        :param pulumi.Input[str] key_bits: Supplies the size in bits of the key when using `CKM_RSA_PKCS_PSS`,
               `CKM_RSA_PKCS_OAEP` or `CKM_RSA_PKCS` as a value for `mechanism`. Required if
               `allow_generate_key` is `true`.
        :param pulumi.Input[str] slot: The slot number to use, specified as a string in a decimal format
               (e.g. `2305843009213693953`).
        :param pulumi.Input[str] token_label: The slot token label to use.
        """
        pulumi.set(__self__, "key_id", key_id)
        pulumi.set(__self__, "key_label", key_label)
        pulumi.set(__self__, "library", library)
        pulumi.set(__self__, "mechanism", mechanism)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "pin", pin)
        if allow_generate_key is not None:
            pulumi.set(__self__, "allow_generate_key", allow_generate_key)
        if allow_replace_key is not None:
            pulumi.set(__self__, "allow_replace_key", allow_replace_key)
        if allow_store_key is not None:
            pulumi.set(__self__, "allow_store_key", allow_store_key)
        if any_mount is not None:
            pulumi.set(__self__, "any_mount", any_mount)
        if curve is not None:
            pulumi.set(__self__, "curve", curve)
        if force_rw_session is not None:
            pulumi.set(__self__, "force_rw_session", force_rw_session)
        if key_bits is not None:
            pulumi.set(__self__, "key_bits", key_bits)
        if slot is not None:
            pulumi.set(__self__, "slot", slot)
        if token_label is not None:
            pulumi.set(__self__, "token_label", token_label)
        if uuid is not None:
            pulumi.set(__self__, "uuid", uuid)

    @property
    @pulumi.getter(name="keyId")
    def key_id(self) -> pulumi.Input[str]:
        """
        The id of a PKCS#11 key to use.
        """
        return pulumi.get(self, "key_id")

    @key_id.setter
    def key_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "key_id", value)

    @property
    @pulumi.getter(name="keyLabel")
    def key_label(self) -> pulumi.Input[str]:
        """
        The label of the key to use.
        """
        return pulumi.get(self, "key_label")

    @key_label.setter
    def key_label(self, value: pulumi.Input[str]):
        pulumi.set(self, "key_label", value)

    @property
    @pulumi.getter
    def library(self) -> pulumi.Input[str]:
        """
        The name of the kms_library stanza to use from Vault's config
        to lookup the local library path.
        """
        return pulumi.get(self, "library")

    @library.setter
    def library(self, value: pulumi.Input[str]):
        pulumi.set(self, "library", value)

    @property
    @pulumi.getter
    def mechanism(self) -> pulumi.Input[str]:
        """
        The encryption/decryption mechanism to use, specified as a
        hexadecimal (prefixed by 0x) string.
        """
        return pulumi.get(self, "mechanism")

    @mechanism.setter
    def mechanism(self, value: pulumi.Input[str]):
        pulumi.set(self, "mechanism", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        A unique lowercase name that serves as identifying the key.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def pin(self) -> pulumi.Input[str]:
        """
        The PIN for login.
        """
        return pulumi.get(self, "pin")

    @pin.setter
    def pin(self, value: pulumi.Input[str]):
        pulumi.set(self, "pin", value)

    @property
    @pulumi.getter(name="allowGenerateKey")
    def allow_generate_key(self) -> Optional[pulumi.Input[bool]]:
        """
        If no existing key can be found in 
        the referenced backend, instructs Vault to generate a key within the backend.
        """
        return pulumi.get(self, "allow_generate_key")

    @allow_generate_key.setter
    def allow_generate_key(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_generate_key", value)

    @property
    @pulumi.getter(name="allowReplaceKey")
    def allow_replace_key(self) -> Optional[pulumi.Input[bool]]:
        """
        Controls the ability for Vault to replace through
        generation or importing a key into the configured backend even
        if a key is present, if set to `false` those operations are forbidden
        if a key exists.
        """
        return pulumi.get(self, "allow_replace_key")

    @allow_replace_key.setter
    def allow_replace_key(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_replace_key", value)

    @property
    @pulumi.getter(name="allowStoreKey")
    def allow_store_key(self) -> Optional[pulumi.Input[bool]]:
        """
        Controls the ability for Vault to import a key to the
        configured backend, if `false`, those operations will be forbidden.
        """
        return pulumi.get(self, "allow_store_key")

    @allow_store_key.setter
    def allow_store_key(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_store_key", value)

    @property
    @pulumi.getter(name="anyMount")
    def any_mount(self) -> Optional[pulumi.Input[bool]]:
        """
        If `true`, allows usage from any mount point within the
        namespace.
        """
        return pulumi.get(self, "any_mount")

    @any_mount.setter
    def any_mount(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "any_mount", value)

    @property
    @pulumi.getter
    def curve(self) -> Optional[pulumi.Input[str]]:
        """
        Supplies the curve value when using the `CKM_ECDSA` mechanism.
        Required if `allow_generate_key` is `true`.
        """
        return pulumi.get(self, "curve")

    @curve.setter
    def curve(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "curve", value)

    @property
    @pulumi.getter(name="forceRwSession")
    def force_rw_session(self) -> Optional[pulumi.Input[str]]:
        """
        Force all operations to open up a read-write session to
        the HSM.
        """
        return pulumi.get(self, "force_rw_session")

    @force_rw_session.setter
    def force_rw_session(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "force_rw_session", value)

    @property
    @pulumi.getter(name="keyBits")
    def key_bits(self) -> Optional[pulumi.Input[str]]:
        """
        Supplies the size in bits of the key when using `CKM_RSA_PKCS_PSS`,
        `CKM_RSA_PKCS_OAEP` or `CKM_RSA_PKCS` as a value for `mechanism`. Required if
        `allow_generate_key` is `true`.
        """
        return pulumi.get(self, "key_bits")

    @key_bits.setter
    def key_bits(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key_bits", value)

    @property
    @pulumi.getter
    def slot(self) -> Optional[pulumi.Input[str]]:
        """
        The slot number to use, specified as a string in a decimal format
        (e.g. `2305843009213693953`).
        """
        return pulumi.get(self, "slot")

    @slot.setter
    def slot(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slot", value)

    @property
    @pulumi.getter(name="tokenLabel")
    def token_label(self) -> Optional[pulumi.Input[str]]:
        """
        The slot token label to use.
        """
        return pulumi.get(self, "token_label")

    @token_label.setter
    def token_label(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token_label", value)

    @property
    @pulumi.getter
    def uuid(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "uuid")

    @uuid.setter
    def uuid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uuid", value)


