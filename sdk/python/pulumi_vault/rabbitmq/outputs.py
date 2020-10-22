# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = [
    'SecretBackendRoleVhost',
]

@pulumi.output_type
class SecretBackendRoleVhost(dict):
    def __init__(__self__, *,
                 configure: str,
                 host: str,
                 read: str,
                 write: str):
        pulumi.set(__self__, "configure", configure)
        pulumi.set(__self__, "host", host)
        pulumi.set(__self__, "read", read)
        pulumi.set(__self__, "write", write)

    @property
    @pulumi.getter
    def configure(self) -> str:
        return pulumi.get(self, "configure")

    @property
    @pulumi.getter
    def host(self) -> str:
        return pulumi.get(self, "host")

    @property
    @pulumi.getter
    def read(self) -> str:
        return pulumi.get(self, "read")

    @property
    @pulumi.getter
    def write(self) -> str:
        return pulumi.get(self, "write")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


