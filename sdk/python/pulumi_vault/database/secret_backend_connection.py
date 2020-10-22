# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['SecretBackendConnection']


class SecretBackendConnection(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allowed_roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 backend: Optional[pulumi.Input[str]] = None,
                 cassandra: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionCassandraArgs']]] = None,
                 data: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 elasticsearch: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionElasticsearchArgs']]] = None,
                 hana: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionHanaArgs']]] = None,
                 mongodb: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionMongodbArgs']]] = None,
                 mongodbatlas: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionMongodbatlasArgs']]] = None,
                 mssql: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionMssqlArgs']]] = None,
                 mysql: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionMysqlArgs']]] = None,
                 mysql_aurora: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionMysqlAuroraArgs']]] = None,
                 mysql_legacy: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionMysqlLegacyArgs']]] = None,
                 mysql_rds: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionMysqlRdsArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oracle: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionOracleArgs']]] = None,
                 postgresql: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionPostgresqlArgs']]] = None,
                 root_rotation_statements: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 verify_connection: Optional[pulumi.Input[bool]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a SecretBackendConnection resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_roles: A list of roles that are allowed to use this
               connection.
        :param pulumi.Input[str] backend: The unique name of the Vault mount to configure.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionCassandraArgs']] cassandra: A nested block containing configuration options for Cassandra connections.
        :param pulumi.Input[Mapping[str, Any]] data: A map of sensitive data to pass to the endpoint. Useful for templated connection strings.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionElasticsearchArgs']] elasticsearch: A nested block containing configuration options for Elasticsearch connections.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionHanaArgs']] hana: A nested block containing configuration options for SAP HanaDB connections.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionMongodbArgs']] mongodb: A nested block containing configuration options for MongoDB connections.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionMongodbatlasArgs']] mongodbatlas: Connection parameters for the mongodbatlas-database-plugin plugin.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionMssqlArgs']] mssql: A nested block containing configuration options for MSSQL connections.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionMysqlArgs']] mysql: A nested block containing configuration options for MySQL connections.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionMysqlAuroraArgs']] mysql_aurora: A nested block containing configuration options for Aurora MySQL connections.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionMysqlLegacyArgs']] mysql_legacy: A nested block containing configuration options for legacy MySQL connections.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionMysqlRdsArgs']] mysql_rds: A nested block containing configuration options for RDS MySQL connections.
        :param pulumi.Input[str] name: A unique name to give the database connection.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionOracleArgs']] oracle: A nested block containing configuration options for Oracle connections.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionPostgresqlArgs']] postgresql: A nested block containing configuration options for PostgreSQL connections.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] root_rotation_statements: A list of database statements to be executed to rotate the root user's credentials.
        :param pulumi.Input[bool] verify_connection: Whether the connection should be verified on
               initial configuration or not.
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

            __props__['allowed_roles'] = allowed_roles
            if backend is None:
                raise TypeError("Missing required property 'backend'")
            __props__['backend'] = backend
            __props__['cassandra'] = cassandra
            __props__['data'] = data
            __props__['elasticsearch'] = elasticsearch
            __props__['hana'] = hana
            __props__['mongodb'] = mongodb
            __props__['mongodbatlas'] = mongodbatlas
            __props__['mssql'] = mssql
            __props__['mysql'] = mysql
            __props__['mysql_aurora'] = mysql_aurora
            __props__['mysql_legacy'] = mysql_legacy
            __props__['mysql_rds'] = mysql_rds
            __props__['name'] = name
            __props__['oracle'] = oracle
            __props__['postgresql'] = postgresql
            __props__['root_rotation_statements'] = root_rotation_statements
            __props__['verify_connection'] = verify_connection
        super(SecretBackendConnection, __self__).__init__(
            'vault:database/secretBackendConnection:SecretBackendConnection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allowed_roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            backend: Optional[pulumi.Input[str]] = None,
            cassandra: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionCassandraArgs']]] = None,
            data: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            elasticsearch: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionElasticsearchArgs']]] = None,
            hana: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionHanaArgs']]] = None,
            mongodb: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionMongodbArgs']]] = None,
            mongodbatlas: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionMongodbatlasArgs']]] = None,
            mssql: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionMssqlArgs']]] = None,
            mysql: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionMysqlArgs']]] = None,
            mysql_aurora: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionMysqlAuroraArgs']]] = None,
            mysql_legacy: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionMysqlLegacyArgs']]] = None,
            mysql_rds: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionMysqlRdsArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            oracle: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionOracleArgs']]] = None,
            postgresql: Optional[pulumi.Input[pulumi.InputType['SecretBackendConnectionPostgresqlArgs']]] = None,
            root_rotation_statements: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            verify_connection: Optional[pulumi.Input[bool]] = None) -> 'SecretBackendConnection':
        """
        Get an existing SecretBackendConnection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_roles: A list of roles that are allowed to use this
               connection.
        :param pulumi.Input[str] backend: The unique name of the Vault mount to configure.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionCassandraArgs']] cassandra: A nested block containing configuration options for Cassandra connections.
        :param pulumi.Input[Mapping[str, Any]] data: A map of sensitive data to pass to the endpoint. Useful for templated connection strings.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionElasticsearchArgs']] elasticsearch: A nested block containing configuration options for Elasticsearch connections.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionHanaArgs']] hana: A nested block containing configuration options for SAP HanaDB connections.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionMongodbArgs']] mongodb: A nested block containing configuration options for MongoDB connections.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionMongodbatlasArgs']] mongodbatlas: Connection parameters for the mongodbatlas-database-plugin plugin.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionMssqlArgs']] mssql: A nested block containing configuration options for MSSQL connections.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionMysqlArgs']] mysql: A nested block containing configuration options for MySQL connections.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionMysqlAuroraArgs']] mysql_aurora: A nested block containing configuration options for Aurora MySQL connections.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionMysqlLegacyArgs']] mysql_legacy: A nested block containing configuration options for legacy MySQL connections.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionMysqlRdsArgs']] mysql_rds: A nested block containing configuration options for RDS MySQL connections.
        :param pulumi.Input[str] name: A unique name to give the database connection.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionOracleArgs']] oracle: A nested block containing configuration options for Oracle connections.
        :param pulumi.Input[pulumi.InputType['SecretBackendConnectionPostgresqlArgs']] postgresql: A nested block containing configuration options for PostgreSQL connections.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] root_rotation_statements: A list of database statements to be executed to rotate the root user's credentials.
        :param pulumi.Input[bool] verify_connection: Whether the connection should be verified on
               initial configuration or not.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["allowed_roles"] = allowed_roles
        __props__["backend"] = backend
        __props__["cassandra"] = cassandra
        __props__["data"] = data
        __props__["elasticsearch"] = elasticsearch
        __props__["hana"] = hana
        __props__["mongodb"] = mongodb
        __props__["mongodbatlas"] = mongodbatlas
        __props__["mssql"] = mssql
        __props__["mysql"] = mysql
        __props__["mysql_aurora"] = mysql_aurora
        __props__["mysql_legacy"] = mysql_legacy
        __props__["mysql_rds"] = mysql_rds
        __props__["name"] = name
        __props__["oracle"] = oracle
        __props__["postgresql"] = postgresql
        __props__["root_rotation_statements"] = root_rotation_statements
        __props__["verify_connection"] = verify_connection
        return SecretBackendConnection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowedRoles")
    def allowed_roles(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of roles that are allowed to use this
        connection.
        """
        return pulumi.get(self, "allowed_roles")

    @property
    @pulumi.getter
    def backend(self) -> pulumi.Output[str]:
        """
        The unique name of the Vault mount to configure.
        """
        return pulumi.get(self, "backend")

    @property
    @pulumi.getter
    def cassandra(self) -> pulumi.Output[Optional['outputs.SecretBackendConnectionCassandra']]:
        """
        A nested block containing configuration options for Cassandra connections.
        """
        return pulumi.get(self, "cassandra")

    @property
    @pulumi.getter
    def data(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A map of sensitive data to pass to the endpoint. Useful for templated connection strings.
        """
        return pulumi.get(self, "data")

    @property
    @pulumi.getter
    def elasticsearch(self) -> pulumi.Output[Optional['outputs.SecretBackendConnectionElasticsearch']]:
        """
        A nested block containing configuration options for Elasticsearch connections.
        """
        return pulumi.get(self, "elasticsearch")

    @property
    @pulumi.getter
    def hana(self) -> pulumi.Output[Optional['outputs.SecretBackendConnectionHana']]:
        """
        A nested block containing configuration options for SAP HanaDB connections.
        """
        return pulumi.get(self, "hana")

    @property
    @pulumi.getter
    def mongodb(self) -> pulumi.Output[Optional['outputs.SecretBackendConnectionMongodb']]:
        """
        A nested block containing configuration options for MongoDB connections.
        """
        return pulumi.get(self, "mongodb")

    @property
    @pulumi.getter
    def mongodbatlas(self) -> pulumi.Output[Optional['outputs.SecretBackendConnectionMongodbatlas']]:
        """
        Connection parameters for the mongodbatlas-database-plugin plugin.
        """
        return pulumi.get(self, "mongodbatlas")

    @property
    @pulumi.getter
    def mssql(self) -> pulumi.Output[Optional['outputs.SecretBackendConnectionMssql']]:
        """
        A nested block containing configuration options for MSSQL connections.
        """
        return pulumi.get(self, "mssql")

    @property
    @pulumi.getter
    def mysql(self) -> pulumi.Output[Optional['outputs.SecretBackendConnectionMysql']]:
        """
        A nested block containing configuration options for MySQL connections.
        """
        return pulumi.get(self, "mysql")

    @property
    @pulumi.getter(name="mysqlAurora")
    def mysql_aurora(self) -> pulumi.Output[Optional['outputs.SecretBackendConnectionMysqlAurora']]:
        """
        A nested block containing configuration options for Aurora MySQL connections.
        """
        return pulumi.get(self, "mysql_aurora")

    @property
    @pulumi.getter(name="mysqlLegacy")
    def mysql_legacy(self) -> pulumi.Output[Optional['outputs.SecretBackendConnectionMysqlLegacy']]:
        """
        A nested block containing configuration options for legacy MySQL connections.
        """
        return pulumi.get(self, "mysql_legacy")

    @property
    @pulumi.getter(name="mysqlRds")
    def mysql_rds(self) -> pulumi.Output[Optional['outputs.SecretBackendConnectionMysqlRds']]:
        """
        A nested block containing configuration options for RDS MySQL connections.
        """
        return pulumi.get(self, "mysql_rds")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A unique name to give the database connection.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def oracle(self) -> pulumi.Output[Optional['outputs.SecretBackendConnectionOracle']]:
        """
        A nested block containing configuration options for Oracle connections.
        """
        return pulumi.get(self, "oracle")

    @property
    @pulumi.getter
    def postgresql(self) -> pulumi.Output[Optional['outputs.SecretBackendConnectionPostgresql']]:
        """
        A nested block containing configuration options for PostgreSQL connections.
        """
        return pulumi.get(self, "postgresql")

    @property
    @pulumi.getter(name="rootRotationStatements")
    def root_rotation_statements(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of database statements to be executed to rotate the root user's credentials.
        """
        return pulumi.get(self, "root_rotation_statements")

    @property
    @pulumi.getter(name="verifyConnection")
    def verify_connection(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether the connection should be verified on
        initial configuration or not.
        """
        return pulumi.get(self, "verify_connection")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

