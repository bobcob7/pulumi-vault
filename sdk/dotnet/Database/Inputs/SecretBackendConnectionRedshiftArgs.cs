// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.Database.Inputs
{

    public sealed class SecretBackendConnectionRedshiftArgs : global::Pulumi.ResourceArgs
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
        /// Disable special character escaping in username and password.
        /// </summary>
        [Input("disableEscaping")]
        public Input<bool>? DisableEscaping { get; set; }

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

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The root credential password used in the connection URL.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The root credential username used in the connection URL.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// - [Template](https://www.vaultproject.io/docs/concepts/username-templating) describing how dynamic usernames are generated.
        /// </summary>
        [Input("usernameTemplate")]
        public Input<string>? UsernameTemplate { get; set; }

        public SecretBackendConnectionRedshiftArgs()
        {
        }
        public static new SecretBackendConnectionRedshiftArgs Empty => new SecretBackendConnectionRedshiftArgs();
    }
}
