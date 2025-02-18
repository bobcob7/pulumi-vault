// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.RabbitMQ.Outputs
{

    [OutputType]
    public sealed class SecretBackendRoleVhostTopicVhost
    {
        public readonly string Read;
        public readonly string Topic;
        public readonly string Write;

        [OutputConstructor]
        private SecretBackendRoleVhostTopicVhost(
            string read,

            string topic,

            string write)
        {
            Read = read;
            Topic = topic;
            Write = write;
        }
    }
}
