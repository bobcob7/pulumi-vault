// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.Database.Inputs
{

    public sealed class SecretBackendConnectionMysqlGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the Redshift DSN. See
        /// the [Vault
        /// docs](https://www.vaultproject.io/api-docs/secret/databases/redshift#sample-payload)
        /// for an example.
        /// </summary>
        [Input("connectionUrl")]
        public Input<string>? ConnectionUrl { get; set; }

        /// <summary>
        /// The maximum amount of time a connection may be reused.
        /// </summary>
        [Input("maxConnectionLifetime")]
        public Input<int>? MaxConnectionLifetime { get; set; }

        /// <summary>
        /// The maximum number of idle connections to
        /// the database.
        /// </summary>
        [Input("maxIdleConnections")]
        public Input<int>? MaxIdleConnections { get; set; }

        /// <summary>
        /// The maximum number of open connections to
        /// the database.
        /// </summary>
        [Input("maxOpenConnections")]
        public Input<int>? MaxOpenConnections { get; set; }

        /// <summary>
        /// x509 CA file for validating the certificate presented by the MySQL server. Must be PEM encoded.
        /// </summary>
        [Input("tlsCa")]
        public Input<string>? TlsCa { get; set; }

        /// <summary>
        /// x509 certificate for connecting to the database. This must be a PEM encoded version of the private key and the certificate combined.
        /// </summary>
        [Input("tlsCertificateKey")]
        public Input<string>? TlsCertificateKey { get; set; }

        /// <summary>
        /// - [Template](https://www.vaultproject.io/docs/concepts/username-templating) describing how dynamic usernames are generated.
        /// </summary>
        [Input("usernameTemplate")]
        public Input<string>? UsernameTemplate { get; set; }

        public SecretBackendConnectionMysqlGetArgs()
        {
        }
    }
}
