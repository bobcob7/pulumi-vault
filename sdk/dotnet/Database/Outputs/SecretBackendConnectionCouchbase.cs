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
    public sealed class SecretBackendConnectionCouchbase
    {
        /// <summary>
        /// Required if `tls` is `true`. Specifies the certificate authority of the Couchbase server, as a PEM certificate that has been base64 encoded.
        /// </summary>
        public readonly string? Base64Pem;
        /// <summary>
        /// Required for Couchbase versions prior to 6.5.0. This is only used to verify vault's connection to the server.
        /// </summary>
        public readonly string? BucketName;
        /// <summary>
        /// A set of Couchbase URIs to connect to. Must use `couchbases://` scheme if `tls` is `true`.
        /// </summary>
        public readonly ImmutableArray<string> Hosts;
        /// <summary>
        /// Whether to skip verification of the server
        /// certificate when using TLS.
        /// </summary>
        public readonly bool? InsecureTls;
        /// <summary>
        /// The root credential password used in the connection URL.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// Whether to use TLS when connecting to Redis.
        /// </summary>
        public readonly bool? Tls;
        /// <summary>
        /// The root credential username used in the connection URL.
        /// </summary>
        public readonly string Username;
        /// <summary>
        /// - [Template](https://www.vaultproject.io/docs/concepts/username-templating) describing how dynamic usernames are generated.
        /// </summary>
        public readonly string? UsernameTemplate;

        [OutputConstructor]
        private SecretBackendConnectionCouchbase(
            string? base64Pem,

            string? bucketName,

            ImmutableArray<string> hosts,

            bool? insecureTls,

            string password,

            bool? tls,

            string username,

            string? usernameTemplate)
        {
            Base64Pem = base64Pem;
            BucketName = bucketName;
            Hosts = hosts;
            InsecureTls = insecureTls;
            Password = password;
            Tls = tls;
            Username = username;
            UsernameTemplate = usernameTemplate;
        }
    }
}
