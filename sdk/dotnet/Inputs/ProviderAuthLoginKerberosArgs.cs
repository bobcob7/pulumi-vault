// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.Inputs
{

    public sealed class ProviderAuthLoginKerberosArgs : global::Pulumi.ResourceArgs
    {
        [Input("disableFastNegotiation")]
        public Input<bool>? DisableFastNegotiation { get; set; }

        [Input("keytabPath")]
        public Input<string>? KeytabPath { get; set; }

        [Input("krb5confPath")]
        public Input<string>? Krb5confPath { get; set; }

        [Input("mount")]
        public Input<string>? Mount { get; set; }

        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("realm")]
        public Input<string>? Realm { get; set; }

        [Input("removeInstanceName")]
        public Input<bool>? RemoveInstanceName { get; set; }

        [Input("service")]
        public Input<string>? Service { get; set; }

        [Input("token")]
        public Input<string>? Token { get; set; }

        [Input("username")]
        public Input<string>? Username { get; set; }

        public ProviderAuthLoginKerberosArgs()
        {
        }
        public static new ProviderAuthLoginKerberosArgs Empty => new ProviderAuthLoginKerberosArgs();
    }
}
