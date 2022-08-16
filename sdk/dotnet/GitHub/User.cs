// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.GitHub
{
    /// <summary>
    /// Manages policy mappings for Github Users authenticated via Github. See the [Vault
    /// documentation](https://www.vaultproject.io/docs/auth/github/) for more
    /// information.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Vault = Pulumi.Vault;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Vault.GitHub.AuthBackend("example", new()
    ///     {
    ///         Organization = "myorg",
    ///     });
    /// 
    ///     var tfUser = new Vault.GitHub.User("tfUser", new()
    ///     {
    ///         Backend = example.Id,
    ///         UserName = "john.doe",
    ///         Policies = new[]
    ///         {
    ///             "developer",
    ///             "read-only",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Github user mappings can be imported using the `path`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import vault:github/user:User tf_user auth/github/map/users/john.doe
    /// ```
    /// </summary>
    [VaultResourceType("vault:github/user:User")]
    public partial class User : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Path where the github auth backend is mounted. Defaults to `github`
        /// if not specified.
        /// </summary>
        [Output("backend")]
        public Output<string?> Backend { get; private set; } = null!;

        /// <summary>
        /// An array of strings specifying the policies to be set on tokens issued
        /// using this role.
        /// </summary>
        [Output("policies")]
        public Output<ImmutableArray<string>> Policies { get; private set; } = null!;

        /// <summary>
        /// GitHub user name.
        /// </summary>
        [Output("user")]
        public Output<string> UserName { get; private set; } = null!;


        /// <summary>
        /// Create a User resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public User(string name, UserArgs args, CustomResourceOptions? options = null)
            : base("vault:github/user:User", name, args ?? new UserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private User(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
            : base("vault:github/user:User", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing User resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static User Get(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
        {
            return new User(name, id, state, options);
        }
    }

    public sealed class UserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Path where the github auth backend is mounted. Defaults to `github`
        /// if not specified.
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        [Input("policies")]
        private InputList<string>? _policies;

        /// <summary>
        /// An array of strings specifying the policies to be set on tokens issued
        /// using this role.
        /// </summary>
        public InputList<string> Policies
        {
            get => _policies ?? (_policies = new InputList<string>());
            set => _policies = value;
        }

        /// <summary>
        /// GitHub user name.
        /// </summary>
        [Input("user", required: true)]
        public Input<string> UserName { get; set; } = null!;

        public UserArgs()
        {
        }
        public static new UserArgs Empty => new UserArgs();
    }

    public sealed class UserState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Path where the github auth backend is mounted. Defaults to `github`
        /// if not specified.
        /// </summary>
        [Input("backend")]
        public Input<string>? Backend { get; set; }

        [Input("policies")]
        private InputList<string>? _policies;

        /// <summary>
        /// An array of strings specifying the policies to be set on tokens issued
        /// using this role.
        /// </summary>
        public InputList<string> Policies
        {
            get => _policies ?? (_policies = new InputList<string>());
            set => _policies = value;
        }

        /// <summary>
        /// GitHub user name.
        /// </summary>
        [Input("user")]
        public Input<string>? UserName { get; set; }

        public UserState()
        {
        }
        public static new UserState Empty => new UserState();
    }
}
