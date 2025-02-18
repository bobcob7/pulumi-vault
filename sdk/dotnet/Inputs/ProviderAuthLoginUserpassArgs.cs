// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.Inputs
{

    public sealed class ProviderAuthLoginUserpassArgs : global::Pulumi.ResourceArgs
    {
        [Input("mount")]
        public Input<string>? Mount { get; set; }

        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("password")]
        public Input<string>? Password { get; set; }

        [Input("passwordFile")]
        public Input<string>? PasswordFile { get; set; }

        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public ProviderAuthLoginUserpassArgs()
        {
        }
        public static new ProviderAuthLoginUserpassArgs Empty => new ProviderAuthLoginUserpassArgs();
    }
}
