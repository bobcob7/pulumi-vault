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
    public sealed class SecretBackendConnectionRedisElasticache
    {
        /// <summary>
        /// The root credential password used in the connection URL.
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// The region where the ElastiCache cluster is hosted. If omitted Vault tries to infer from the environment instead.
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// The URL for Elasticsearch's API. https requires certificate
        /// by trusted CA if used.
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// The root credential username used in the connection URL.
        /// </summary>
        public readonly string? Username;

        [OutputConstructor]
        private SecretBackendConnectionRedisElasticache(
            string? password,

            string? region,

            string url,

            string? username)
        {
            Password = password;
            Region = region;
            Url = url;
            Username = username;
        }
    }
}
