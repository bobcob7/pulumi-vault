// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.Database
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Vault = Pulumi.Vault;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var db = new Vault.Mount("db", new()
    ///     {
    ///         Path = "postgres",
    ///         Type = "database",
    ///     });
    /// 
    ///     var postgres = new Vault.Database.SecretBackendConnection("postgres", new()
    ///     {
    ///         Backend = db.Path,
    ///         AllowedRoles = new[]
    ///         {
    ///             "dev",
    ///             "prod",
    ///         },
    ///         Postgresql = new Vault.Database.Inputs.SecretBackendConnectionPostgresqlArgs
    ///         {
    ///             ConnectionUrl = "postgres://username:password@host:port/database",
    ///         },
    ///     });
    /// 
    ///     var role = new Vault.Database.SecretBackendRole("role", new()
    ///     {
    ///         Backend = db.Path,
    ///         DbName = postgres.Name,
    ///         CreationStatements = new[]
    ///         {
    ///             "CREATE ROLE \"{{name}}\" WITH LOGIN PASSWORD '{{password}}' VALID UNTIL '{{expiration}}';",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Database secret backend roles can be imported using the `backend`, `/roles/`, and the `name` e.g.
    /// 
    /// ```sh
    ///  $ pulumi import vault:database/secretBackendRole:SecretBackendRole example postgres/roles/my-role
    /// ```
    /// </summary>
    [VaultResourceType("vault:database/secretBackendRole:SecretBackendRole")]
    public partial class SecretBackendRole : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The unique name of the Vault mount to configure.
        /// </summary>
        [Output("backend")]
        public Output<string> Backend { get; private set; } = null!;

        /// <summary>
        /// The database statements to execute when
        /// creating a user.
        /// </summary>
        [Output("creationStatements")]
        public Output<ImmutableArray<string>> CreationStatements { get; private set; } = null!;

        /// <summary>
        /// The unique name of the database connection to use for
        /// the role.
        /// </summary>
        [Output("dbName")]
        public Output<string> DbName { get; private set; } = null!;

        /// <summary>
        /// The default number of seconds for leases for this
        /// role.
        /// </summary>
        [Output("defaultTtl")]
        public Output<int?> DefaultTtl { get; private set; } = null!;

        /// <summary>
        /// The maximum number of seconds for leases for this
        /// role.
        /// </summary>
        [Output("maxTtl")]
        public Output<int?> MaxTtl { get; private set; } = null!;

        /// <summary>
        /// A unique name to give the role.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured namespace.
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        /// <summary>
        /// The database statements to execute when
        /// renewing a user.
        /// </summary>
        [Output("renewStatements")]
        public Output<ImmutableArray<string>> RenewStatements { get; private set; } = null!;

        /// <summary>
        /// The database statements to execute when
        /// revoking a user.
        /// </summary>
        [Output("revocationStatements")]
        public Output<ImmutableArray<string>> RevocationStatements { get; private set; } = null!;

        /// <summary>
        /// The database statements to execute when
        /// rolling back creation due to an error.
        /// </summary>
        [Output("rollbackStatements")]
        public Output<ImmutableArray<string>> RollbackStatements { get; private set; } = null!;


        /// <summary>
        /// Create a SecretBackendRole resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecretBackendRole(string name, SecretBackendRoleArgs args, CustomResourceOptions? options = null)
            : base("vault:database/secretBackendRole:SecretBackendRole", name, args ?? new SecretBackendRoleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecretBackendRole(string name, Input<string> id, SecretBackendRoleState? state = null, CustomResourceOptions? options = null)
            : base("vault:database/secretBackendRole:SecretBackendRole", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SecretBackendRole resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecretBackendRole Get(string name, Input<string> id, SecretBackendRoleState? state = null, CustomResourceOptions? options = null)
        {
            return new SecretBackendRole(name, id, state, options);
        }
    }

    public sealed class SecretBackendRoleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique name of the Vault mount to configure.
        /// </summary>
        [Input("backend", required: true)]
        public Input<string> Backend { get; set; } = null!;

        [Input("creationStatements", required: true)]
        private InputList<string>? _creationStatements;

        /// <summary>
        /// The database statements to execute when
        /// creating a user.
        /// </summary>
        public InputList<string> CreationStatements
        {
            get => _creationStatements ?? (_creationStatements = new InputList<string>());
            set => _creationStatements = value;
        }

        /// <summary>
        /// The unique name of the database connection to use for
        /// the role.
        /// </summary>
        [Input("dbName", required: true)]
        public Input<string> DbName { get; set; } = null!;

        /// <summary>
        /// The default number of seconds for leases for this
        /// role.
        /// </summary>
        [Input("defaultTtl")]
        public Input<int>? DefaultTtl { get; set; }

        /// <summary>
        /// The maximum number of seconds for leases for this
        /// role.
        /// </summary>
        [Input("maxTtl")]
        public Input<int>? MaxTtl { get; set; }

        /// <summary>
        /// A unique name to give the role.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured namespace.
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("renewStatements")]
        private InputList<string>? _renewStatements;

        /// <summary>
        /// The database statements to execute when
        /// renewing a user.
        /// </summary>
        public InputList<string> RenewStatements
        {
            get => _renewStatements ?? (_renewStatements = new InputList<string>());
            set => _renewStatements = value;
        }

        [Input("revocationStatements")]
        private InputList<string>? _revocationStatements;

        /// <summary>
        /// The database statements to execute when
        /// revoking a user.
        /// </summary>
        public InputList<string> RevocationStatements
        {
            get => _revocationStatements ?? (_revocationStatements = new InputList<string>());
            set => _revocationStatements = value;
        }

        [Input("rollbackStatements")]
        private InputList<string>? _rollbackStatements;

        /// <summary>
        /// The database statements to execute when
        /// rolling back creation due to an error.
        /// </summary>
        public InputList<string> RollbackStatements
        {
            get => _rollbackStatements ?? (_rollbackStatements = new InputList<string>());
            set => _rollbackStatements = value;
        }

        public SecretBackendRoleArgs()
        {
        }
        public static new SecretBackendRoleArgs Empty => new SecretBackendRoleArgs();
    }

    public sealed class SecretBackendRoleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique name of the Vault mount to configure.
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        [Input("creationStatements")]
        private InputList<string>? _creationStatements;

        /// <summary>
        /// The database statements to execute when
        /// creating a user.
        /// </summary>
        public InputList<string> CreationStatements
        {
            get => _creationStatements ?? (_creationStatements = new InputList<string>());
            set => _creationStatements = value;
        }

        /// <summary>
        /// The unique name of the database connection to use for
        /// the role.
        /// </summary>
        [Input("dbName")]
        public Input<string>? DbName { get; set; }

        /// <summary>
        /// The default number of seconds for leases for this
        /// role.
        /// </summary>
        [Input("defaultTtl")]
        public Input<int>? DefaultTtl { get; set; }

        /// <summary>
        /// The maximum number of seconds for leases for this
        /// role.
        /// </summary>
        [Input("maxTtl")]
        public Input<int>? MaxTtl { get; set; }

        /// <summary>
        /// A unique name to give the role.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace to provision the resource in.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured namespace.
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("renewStatements")]
        private InputList<string>? _renewStatements;

        /// <summary>
        /// The database statements to execute when
        /// renewing a user.
        /// </summary>
        public InputList<string> RenewStatements
        {
            get => _renewStatements ?? (_renewStatements = new InputList<string>());
            set => _renewStatements = value;
        }

        [Input("revocationStatements")]
        private InputList<string>? _revocationStatements;

        /// <summary>
        /// The database statements to execute when
        /// revoking a user.
        /// </summary>
        public InputList<string> RevocationStatements
        {
            get => _revocationStatements ?? (_revocationStatements = new InputList<string>());
            set => _revocationStatements = value;
        }

        [Input("rollbackStatements")]
        private InputList<string>? _rollbackStatements;

        /// <summary>
        /// The database statements to execute when
        /// rolling back creation due to an error.
        /// </summary>
        public InputList<string> RollbackStatements
        {
            get => _rollbackStatements ?? (_rollbackStatements = new InputList<string>());
            set => _rollbackStatements = value;
        }

        public SecretBackendRoleState()
        {
        }
        public static new SecretBackendRoleState Empty => new SecretBackendRoleState();
    }
}
