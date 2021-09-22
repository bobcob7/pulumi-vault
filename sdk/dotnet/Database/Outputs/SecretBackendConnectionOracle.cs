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
    public sealed class SecretBackendConnectionOracle
    {
        /// <summary>
        /// A URL containing connection information. See
        /// the [Vault
        /// docs](https://www.vaultproject.io/api-docs/secret/databases/snowflake#sample-payload)
        /// for an example.
        /// </summary>
        public readonly string? ConnectionUrl;
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
        /// <summary>
        /// - [Template](https://www.vaultproject.io/docs/concepts/username-templating) describing how dynamic usernames are generated.
        /// </summary>
        public readonly string? UsernameTemplate;

        [OutputConstructor]
        private SecretBackendConnectionOracle(
            string? connectionUrl,

            int? maxConnectionLifetime,

            int? maxIdleConnections,

            int? maxOpenConnections,

            string? usernameTemplate)
        {
            ConnectionUrl = connectionUrl;
            MaxConnectionLifetime = maxConnectionLifetime;
            MaxIdleConnections = maxIdleConnections;
            MaxOpenConnections = maxOpenConnections;
            UsernameTemplate = usernameTemplate;
        }
    }
}
