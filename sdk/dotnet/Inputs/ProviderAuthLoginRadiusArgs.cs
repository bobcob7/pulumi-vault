// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.Inputs
{

    public sealed class ProviderAuthLoginRadiusArgs : global::Pulumi.ResourceArgs
    {
        [Input("mount")]
        public Input<string>? Mount { get; set; }

        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("password", required: true)]
        public Input<string> Password { get; set; } = null!;

        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public ProviderAuthLoginRadiusArgs()
        {
        }
        public static new ProviderAuthLoginRadiusArgs Empty => new ProviderAuthLoginRadiusArgs();
    }
}
