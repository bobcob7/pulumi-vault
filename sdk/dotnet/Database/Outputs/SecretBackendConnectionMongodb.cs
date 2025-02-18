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
    public sealed class SecretBackendConnectionMongodb
    {
        /// <summary>
        /// Specifies the Redshift DSN. See
        /// the [Vault
        /// docs](https://www.vaultproject.io/api-docs/secret/databases/redshift#sample-payload)
        /// for an example.
        /// </summary>
        public readonly string? ConnectionUrl;
        /// <summary>
        /// The maximum amount of time a connection may be reused.
        /// </summary>
        public readonly int? MaxConnectionLifetime;
        /// <summary>
        /// The maximum number of idle connections to
        /// the database.
        /// </summary>
        public readonly int? MaxIdleConnections;
        /// <summary>
        /// The maximum number of open connections to
        /// the database.
        /// </summary>
        public readonly int? MaxOpenConnections;
        /// <summary>
        /// The root credential password used in the connection URL.
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// The root credential username used in the connection URL.
        /// </summary>
        public readonly string? Username;
        /// <summary>
        /// - [Template](https://www.vaultproject.io/docs/concepts/username-templating) describing how dynamic usernames are generated.
        /// </summary>
        public readonly string? UsernameTemplate;

        [OutputConstructor]
        private SecretBackendConnectionMongodb(
            string? connectionUrl,

            int? maxConnectionLifetime,

            int? maxIdleConnections,

            int? maxOpenConnections,

            string? password,

            string? username,

            string? usernameTemplate)
        {
            ConnectionUrl = connectionUrl;
            MaxConnectionLifetime = maxConnectionLifetime;
            MaxIdleConnections = maxIdleConnections;
            MaxOpenConnections = maxOpenConnections;
            Password = password;
            Username = username;
            UsernameTemplate = usernameTemplate;
        }
    }
}
