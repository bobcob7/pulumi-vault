# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = [
    'GetEntityAliasResult',
]

@pulumi.output_type
class GetEntityAliasResult(dict):
    def __init__(__self__, *,
                 canonical_id: str,
                 creation_time: str,
                 id: str,
                 last_update_time: str,
                 merged_from_canonical_ids: List[str],
                 metadata: Mapping[str, Any],
                 mount_accessor: str,
                 mount_path: str,
                 mount_type: str,
                 name: str):
        """
        :param str canonical_id: Canonical ID of the Alias
        :param str creation_time: Creation time of the Alias
        :param str id: ID of the alias
        :param str last_update_time: Last update time of the alias
        :param List[str] merged_from_canonical_ids: List of canonical IDs merged with this alias
        :param Mapping[str, Any] metadata: Arbitrary metadata
        :param str mount_accessor: Authentication mount acccessor which this alias belongs to
        :param str mount_path: Authentication mount path which this alias belongs to
        :param str mount_type: Authentication mount type which this alias belongs to
        :param str name: Name of the alias
        """
        pulumi.set(__self__, "canonical_id", canonical_id)
        pulumi.set(__self__, "creation_time", creation_time)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "last_update_time", last_update_time)
        pulumi.set(__self__, "merged_from_canonical_ids", merged_from_canonical_ids)
        pulumi.set(__self__, "metadata", metadata)
        pulumi.set(__self__, "mount_accessor", mount_accessor)
        pulumi.set(__self__, "mount_path", mount_path)
        pulumi.set(__self__, "mount_type", mount_type)
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="canonicalId")
    def canonical_id(self) -> str:
        """
        Canonical ID of the Alias
        """
        return pulumi.get(self, "canonical_id")

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> str:
        """
        Creation time of the Alias
        """
        return pulumi.get(self, "creation_time")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        ID of the alias
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="lastUpdateTime")
    def last_update_time(self) -> str:
        """
        Last update time of the alias
        """
        return pulumi.get(self, "last_update_time")

    @property
    @pulumi.getter(name="mergedFromCanonicalIds")
    def merged_from_canonical_ids(self) -> List[str]:
        """
        List of canonical IDs merged with this alias
        """
        return pulumi.get(self, "merged_from_canonical_ids")

    @property
    @pulumi.getter
    def metadata(self) -> Mapping[str, Any]:
        """
        Arbitrary metadata
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter(name="mountAccessor")
    def mount_accessor(self) -> str:
        """
        Authentication mount acccessor which this alias belongs to
        """
        return pulumi.get(self, "mount_accessor")

    @property
    @pulumi.getter(name="mountPath")
    def mount_path(self) -> str:
        """
        Authentication mount path which this alias belongs to
        """
        return pulumi.get(self, "mount_path")

    @property
    @pulumi.getter(name="mountType")
    def mount_type(self) -> str:
        """
        Authentication mount type which this alias belongs to
        """
        return pulumi.get(self, "mount_type")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the alias
        """
        return pulumi.get(self, "name")


