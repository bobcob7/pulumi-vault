// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.Generic
{
    public static class GetSecret
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Generic secret
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Vault = Pulumi.Vault;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var rundeckAuth = Vault.Generic.GetSecret.Invoke(new()
        ///     {
        ///         Path = "secret/rundeck_auth",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Required Vault Capabilities
        /// 
        /// Use of this resource requires the `read` capability on the given path.
        /// </summary>
        public static Task<GetSecretResult> InvokeAsync(GetSecretArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSecretResult>("vault:generic/getSecret:getSecret", args ?? new GetSecretArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Generic secret
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Vault = Pulumi.Vault;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var rundeckAuth = Vault.Generic.GetSecret.Invoke(new()
        ///     {
        ///         Path = "secret/rundeck_auth",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Required Vault Capabilities
        /// 
        /// Use of this resource requires the `read` capability on the given path.
        /// </summary>
        public static Output<GetSecretResult> Invoke(GetSecretInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSecretResult>("vault:generic/getSecret:getSecret", args ?? new GetSecretInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSecretArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The namespace of the target resource.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public string? Namespace { get; set; }

        /// <summary>
        /// The full logical path from which to request data.
        /// To read data from the "generic" secret backend mounted in Vault by
        /// default, this should be prefixed with `secret/`. Reading from other backends
        /// with this data source is possible; consult each backend's documentation
        /// to see which endpoints support the `GET` method.
        /// </summary>
        [Input("path", required: true)]
        public string Path { get; set; } = null!;

        /// <summary>
        /// The version of the secret to read. This is used by the
        /// Vault KV secrets engine - version 2 to indicate which version of the secret
        /// to read.
        /// </summary>
        [Input("version")]
        public int? Version { get; set; }

        [Input("withLeaseStartTime")]
        public bool? WithLeaseStartTime { get; set; }

        public GetSecretArgs()
        {
        }
        public static new GetSecretArgs Empty => new GetSecretArgs();
    }

    public sealed class GetSecretInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The namespace of the target resource.
        /// The value should not contain leading or trailing forward slashes.
        /// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
        /// *Available only for Vault Enterprise*.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// The full logical path from which to request data.
        /// To read data from the "generic" secret backend mounted in Vault by
        /// default, this should be prefixed with `secret/`. Reading from other backends
        /// with this data source is possible; consult each backend's documentation
        /// to see which endpoints support the `GET` method.
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        /// <summary>
        /// The version of the secret to read. This is used by the
        /// Vault KV secrets engine - version 2 to indicate which version of the secret
        /// to read.
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        [Input("withLeaseStartTime")]
        public Input<bool>? WithLeaseStartTime { get; set; }

        public GetSecretInvokeArgs()
        {
        }
        public static new GetSecretInvokeArgs Empty => new GetSecretInvokeArgs();
    }


    [OutputType]
    public sealed class GetSecretResult
    {
        /// <summary>
        /// A mapping whose keys are the top-level data keys returned from
        /// Vault and whose values are the corresponding values. This map can only
        /// represent string data, so any non-string values returned from Vault are
        /// serialized as JSON.
        /// </summary>
        public readonly ImmutableDictionary<string, object> Data;
        /// <summary>
        /// A string containing the full data payload retrieved from
        /// Vault, serialized in JSON format.
        /// </summary>
        public readonly string DataJson;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The duration of the secret lease, in seconds relative
        /// to the time the data was requested. Once this time has passed any plan
        /// generated with this data may fail to apply.
        /// </summary>
        public readonly int LeaseDuration;
        /// <summary>
        /// The lease identifier assigned by Vault, if any.
        /// </summary>
        public readonly string LeaseId;
        public readonly bool LeaseRenewable;
        public readonly string LeaseStartTime;
        public readonly string? Namespace;
        public readonly string Path;
        public readonly int? Version;
        public readonly bool? WithLeaseStartTime;

        [OutputConstructor]
        private GetSecretResult(
            ImmutableDictionary<string, object> data,

            string dataJson,

            string id,

            int leaseDuration,

            string leaseId,

            bool leaseRenewable,

            string leaseStartTime,

            string? @namespace,

            string path,

            int? version,

            bool? withLeaseStartTime)
        {
            Data = data;
            DataJson = dataJson;
            Id = id;
            LeaseDuration = leaseDuration;
            LeaseId = leaseId;
            LeaseRenewable = leaseRenewable;
            LeaseStartTime = leaseStartTime;
            Namespace = @namespace;
            Path = path;
            Version = version;
            WithLeaseStartTime = withLeaseStartTime;
        }
    }
}
