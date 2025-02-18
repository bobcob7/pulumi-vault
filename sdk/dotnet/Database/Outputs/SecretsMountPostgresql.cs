// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.Database.Outputs
{

    [OutputType]
    public sealed class SecretsMountPostgresql
    {
        /// <summary>
        /// A list of roles that are allowed to use this
        /// connection.
        /// </summary>
        public readonly ImmutableArray<string> AllowedRoles;
        /// <summary>
        /// A URL containing connection information.  
        /// See [Vault docs](https://www.vaultproject.io/api-docs/secret/databases/snowflake#sample-payload)
        /// </summary>
        public readonly string? ConnectionUrl;
        /// <summary>
        /// A map of sensitive data to pass to the endpoint. Useful for templated connection strings.
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Data;
        /// <summary>
        /// Disable special character escaping in username and password.
        /// </summary>
        public readonly bool? DisableEscaping;
        /// <summary>
        /// The maximum number of seconds to keep
        /// a connection alive for.
        /// </summary>
        public readonly int? MaxConnectionLifetime;
        /// <summary>
        /// The maximum number of idle connections to
        /// maintain.
        /// </summary>
        public readonly int? MaxIdleConnections;
        /// <summary>
        /// The maximum number of open connections to
        /// use.
        /// </summary>
        public readonly int? MaxOpenConnections;
        public readonly string Name;
        /// <summary>
        /// The password to be used in the connection.
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// Specifies the name of the plugin to use.
        /// </summary>
        public readonly string? PluginName;
        /// <summary>
        /// A list of database statements to be executed to rotate the root user's credentials.
        /// </summary>
        public readonly ImmutableArray<string> RootRotationStatements;
        /// <summary>
        /// The username to be used in the connection (the account admin level).
        /// </summary>
        public readonly string? Username;
        /// <summary>
        /// - [Template](https://www.vaultproject.io/docs/concepts/username-templating) describing how dynamic usernames are generated.
        /// </summary>
        public readonly string? UsernameTemplate;
        /// <summary>
        /// Whether the connection should be verified on
        /// initial configuration or not.
        /// </summary>
        public readonly bool? VerifyConnection;

        [OutputConstructor]
        private SecretsMountPostgresql(
            ImmutableArray<string> allowedRoles,

            string? connectionUrl,

            ImmutableDictionary<string, object>? data,

            bool? disableEscaping,

            int? maxConnectionLifetime,

            int? maxIdleConnections,

            int? maxOpenConnections,

            string name,

            string? password,

            string? pluginName,

            ImmutableArray<string> rootRotationStatements,

            string? username,

            string? usernameTemplate,

            bool? verifyConnection)
        {
            AllowedRoles = allowedRoles;
            ConnectionUrl = connectionUrl;
            Data = data;
            DisableEscaping = disableEscaping;
            MaxConnectionLifetime = maxConnectionLifetime;
            MaxIdleConnections = maxIdleConnections;
            MaxOpenConnections = maxOpenConnections;
            Name = name;
            Password = password;
            PluginName = pluginName;
            RootRotationStatements = rootRotationStatements;
            Username = username;
            UsernameTemplate = usernameTemplate;
            VerifyConnection = verifyConnection;
        }
    }
}
