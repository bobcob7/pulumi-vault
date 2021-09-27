# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

# Export this package's modules as members:
from .audit import *
from .auth_backend import *
from .cert_auth_backend_role import *
from .egp_policy import *
from .get_auth_backend import *
from .get_nomad_access_token import *
from .get_policy_document import *
from .mfa_duo import *
from .mount import *
from .namespace import *
from .nomad_secret_backend import *
from .nomad_secret_role import *
from .password_policy import *
from .policy import *
from .provider import *
from .quota_lease_count import *
from .quota_rate_limit import *
from .raft_snapshot_agent_config import *
from .rgp_policy import *
from .token import *
from ._inputs import *
from . import outputs

# Make subpackages available:
from . import (
    ad,
    alicloud,
    approle,
    aws,
    azure,
    config,
    consul,
    database,
    gcp,
    generic,
    github,
    identity,
    jwt,
    kubernetes,
    ldap,
    okta,
    pkisecret,
    rabbitmq,
    ssh,
    tokenauth,
    transform,
    transit,
)

def _register_module():
    import pulumi
    from . import _utilities


    class Module(pulumi.runtime.ResourceModule):
        _version = _utilities.get_semver_version()

        def version(self):
            return Module._version

        def construct(self, name: str, typ: str, urn: str) -> pulumi.Resource:
            if typ == "vault:index/audit:Audit":
                return Audit(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "vault:index/authBackend:AuthBackend":
                return AuthBackend(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "vault:index/certAuthBackendRole:CertAuthBackendRole":
                return CertAuthBackendRole(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "vault:index/egpPolicy:EgpPolicy":
                return EgpPolicy(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "vault:index/mfaDuo:MfaDuo":
                return MfaDuo(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "vault:index/mount:Mount":
                return Mount(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "vault:index/namespace:Namespace":
                return Namespace(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "vault:index/nomadSecretBackend:NomadSecretBackend":
                return NomadSecretBackend(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "vault:index/nomadSecretRole:NomadSecretRole":
                return NomadSecretRole(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "vault:index/passwordPolicy:PasswordPolicy":
                return PasswordPolicy(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "vault:index/policy:Policy":
                return Policy(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "vault:index/quotaLeaseCount:QuotaLeaseCount":
                return QuotaLeaseCount(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "vault:index/quotaRateLimit:QuotaRateLimit":
                return QuotaRateLimit(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "vault:index/raftSnapshotAgentConfig:RaftSnapshotAgentConfig":
                return RaftSnapshotAgentConfig(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "vault:index/rgpPolicy:RgpPolicy":
                return RgpPolicy(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "vault:index/token:Token":
                return Token(name, pulumi.ResourceOptions(urn=urn))
            else:
                raise Exception(f"unknown resource type {typ}")


    _module_instance = Module()
    pulumi.runtime.register_resource_module("vault", "index/audit", _module_instance)
    pulumi.runtime.register_resource_module("vault", "index/authBackend", _module_instance)
    pulumi.runtime.register_resource_module("vault", "index/certAuthBackendRole", _module_instance)
    pulumi.runtime.register_resource_module("vault", "index/egpPolicy", _module_instance)
    pulumi.runtime.register_resource_module("vault", "index/mfaDuo", _module_instance)
    pulumi.runtime.register_resource_module("vault", "index/mount", _module_instance)
    pulumi.runtime.register_resource_module("vault", "index/namespace", _module_instance)
    pulumi.runtime.register_resource_module("vault", "index/nomadSecretBackend", _module_instance)
    pulumi.runtime.register_resource_module("vault", "index/nomadSecretRole", _module_instance)
    pulumi.runtime.register_resource_module("vault", "index/passwordPolicy", _module_instance)
    pulumi.runtime.register_resource_module("vault", "index/policy", _module_instance)
    pulumi.runtime.register_resource_module("vault", "index/quotaLeaseCount", _module_instance)
    pulumi.runtime.register_resource_module("vault", "index/quotaRateLimit", _module_instance)
    pulumi.runtime.register_resource_module("vault", "index/raftSnapshotAgentConfig", _module_instance)
    pulumi.runtime.register_resource_module("vault", "index/rgpPolicy", _module_instance)
    pulumi.runtime.register_resource_module("vault", "index/token", _module_instance)


    class Package(pulumi.runtime.ResourcePackage):
        _version = _utilities.get_semver_version()

        def version(self):
            return Package._version

        def construct_provider(self, name: str, typ: str, urn: str) -> pulumi.ProviderResource:
            if typ != "pulumi:providers:vault":
                raise Exception(f"unknown provider type {typ}")
            return Provider(name, pulumi.ResourceOptions(urn=urn))


    pulumi.runtime.register_resource_package("vault", Package())

_register_module()
