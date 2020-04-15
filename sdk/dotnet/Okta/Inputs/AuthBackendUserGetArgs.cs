// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.Okta.Inputs
{

    public sealed class AuthBackendUserGetArgs : Pulumi.ResourceArgs
    {
        [Input("groups", required: true)]
        private InputList<string>? _groups;

        /// <summary>
        /// List of Okta groups to associate with this user
        /// </summary>
        public InputList<string> Groups
        {
            get => _groups ?? (_groups = new InputList<string>());
            set => _groups = value;
        }

        [Input("policies")]
        private InputList<string>? _policies;

        /// <summary>
        /// List of Vault policies to associate with this user
        /// </summary>
        public InputList<string> Policies
        {
            get => _policies ?? (_policies = new InputList<string>());
            set => _policies = value;
        }

        /// <summary>
        /// Name of the user within Okta
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public AuthBackendUserGetArgs()
        {
        }
    }
}
