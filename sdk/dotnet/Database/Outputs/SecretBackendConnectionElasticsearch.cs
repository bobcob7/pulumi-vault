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
    public sealed class SecretBackendConnectionElasticsearch
    {
        /// <summary>
        /// The path to a PEM-encoded CA cert file to use to verify the Elasticsearch server's identity.
        /// </summary>
        public readonly string? CaCert;
        /// <summary>
        /// The path to a directory of PEM-encoded CA cert files to use to verify the Elasticsearch server's identity.
        /// </summary>
        public readonly string? CaPath;
        /// <summary>
        /// The path to the certificate for the Elasticsearch client to present for communication.
        /// </summary>
        public readonly string? ClientCert;
        /// <summary>
        /// The path to the key for the Elasticsearch client to use for communication.
        /// </summary>
        public readonly string? ClientKey;
        /// <summary>
        /// Whether to disable certificate verification.
        /// </summary>
        public readonly bool? Insecure;
        /// <summary>
        /// The root credential password used in the connection URL.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// This, if set, is used to set the SNI host when connecting via TLS.
        /// </summary>
        public readonly string? TlsServerName;
        /// <summary>
        /// The URL for Elasticsearch's API. https requires certificate
        /// by trusted CA if used.
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// The root credential username used in the connection URL.
        /// </summary>
        public readonly string Username;
        /// <summary>
        /// - [Template](https://www.vaultproject.io/docs/concepts/username-templating) describing how dynamic usernames are generated.
        /// </summary>
        public readonly string? UsernameTemplate;

        [OutputConstructor]
        private SecretBackendConnectionElasticsearch(
            string? caCert,

            string? caPath,

            string? clientCert,

            string? clientKey,

            bool? insecure,

            string password,

            string? tlsServerName,

            string url,

            string username,

            string? usernameTemplate)
        {
            CaCert = caCert;
            CaPath = caPath;
            ClientCert = clientCert;
            ClientKey = clientKey;
            Insecure = insecure;
            Password = password;
            TlsServerName = tlsServerName;
            Url = url;
            Username = username;
            UsernameTemplate = usernameTemplate;
        }
    }
}
