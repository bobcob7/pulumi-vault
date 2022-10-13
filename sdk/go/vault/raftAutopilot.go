// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vault

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Autopilot enables automated workflows for managing Raft clusters. The
// current feature set includes 3 main features: Server Stabilization, Dead
// Server Cleanup and State API. **These three features are introduced in
// Vault 1.7.**
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-vault/sdk/v5/go/vault"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := vault.NewRaftAutopilot(ctx, "autopilot", &vault.RaftAutopilotArgs{
//				CleanupDeadServers:             pulumi.Bool(true),
//				DeadServerLastContactThreshold: pulumi.String("24h0m0s"),
//				LastContactThreshold:           pulumi.String("10s"),
//				MaxTrailingLogs:                pulumi.Int(1000),
//				MinQuorum:                      pulumi.Int(3),
//				ServerStabilizationTime:        pulumi.String("10s"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type RaftAutopilot struct {
	pulumi.CustomResourceState

	// Specifies whether to remove dead server nodes
	// periodically or when a new server joins. This requires that `min-quorum` is also set.
	CleanupDeadServers pulumi.BoolPtrOutput `pulumi:"cleanupDeadServers"`
	// Limit the amount of time a
	// server can go without leader contact before being considered failed. This only takes
	// effect when `cleanupDeadServers` is set.
	DeadServerLastContactThreshold pulumi.StringPtrOutput `pulumi:"deadServerLastContactThreshold"`
	// Limit the amount of time a server can go
	// without leader contact before being considered unhealthy.
	LastContactThreshold pulumi.StringPtrOutput `pulumi:"lastContactThreshold"`
	// Maximum number of log entries in the Raft log
	// that a server can be behind its leader before being considered unhealthy.
	MaxTrailingLogs pulumi.IntPtrOutput `pulumi:"maxTrailingLogs"`
	// Minimum number of servers allowed in a cluster before
	// autopilot can prune dead servers. This should at least be 3. Applicable only for
	// voting nodes.
	MinQuorum pulumi.IntPtrOutput `pulumi:"minQuorum"`
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace pulumi.StringPtrOutput `pulumi:"namespace"`
	// Minimum amount of time a server must be
	// stable in the 'healthy' state before being added to the cluster.
	ServerStabilizationTime pulumi.StringPtrOutput `pulumi:"serverStabilizationTime"`
}

// NewRaftAutopilot registers a new resource with the given unique name, arguments, and options.
func NewRaftAutopilot(ctx *pulumi.Context,
	name string, args *RaftAutopilotArgs, opts ...pulumi.ResourceOption) (*RaftAutopilot, error) {
	if args == nil {
		args = &RaftAutopilotArgs{}
	}

	var resource RaftAutopilot
	err := ctx.RegisterResource("vault:index/raftAutopilot:RaftAutopilot", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRaftAutopilot gets an existing RaftAutopilot resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRaftAutopilot(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RaftAutopilotState, opts ...pulumi.ResourceOption) (*RaftAutopilot, error) {
	var resource RaftAutopilot
	err := ctx.ReadResource("vault:index/raftAutopilot:RaftAutopilot", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RaftAutopilot resources.
type raftAutopilotState struct {
	// Specifies whether to remove dead server nodes
	// periodically or when a new server joins. This requires that `min-quorum` is also set.
	CleanupDeadServers *bool `pulumi:"cleanupDeadServers"`
	// Limit the amount of time a
	// server can go without leader contact before being considered failed. This only takes
	// effect when `cleanupDeadServers` is set.
	DeadServerLastContactThreshold *string `pulumi:"deadServerLastContactThreshold"`
	// Limit the amount of time a server can go
	// without leader contact before being considered unhealthy.
	LastContactThreshold *string `pulumi:"lastContactThreshold"`
	// Maximum number of log entries in the Raft log
	// that a server can be behind its leader before being considered unhealthy.
	MaxTrailingLogs *int `pulumi:"maxTrailingLogs"`
	// Minimum number of servers allowed in a cluster before
	// autopilot can prune dead servers. This should at least be 3. Applicable only for
	// voting nodes.
	MinQuorum *int `pulumi:"minQuorum"`
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace *string `pulumi:"namespace"`
	// Minimum amount of time a server must be
	// stable in the 'healthy' state before being added to the cluster.
	ServerStabilizationTime *string `pulumi:"serverStabilizationTime"`
}

type RaftAutopilotState struct {
	// Specifies whether to remove dead server nodes
	// periodically or when a new server joins. This requires that `min-quorum` is also set.
	CleanupDeadServers pulumi.BoolPtrInput
	// Limit the amount of time a
	// server can go without leader contact before being considered failed. This only takes
	// effect when `cleanupDeadServers` is set.
	DeadServerLastContactThreshold pulumi.StringPtrInput
	// Limit the amount of time a server can go
	// without leader contact before being considered unhealthy.
	LastContactThreshold pulumi.StringPtrInput
	// Maximum number of log entries in the Raft log
	// that a server can be behind its leader before being considered unhealthy.
	MaxTrailingLogs pulumi.IntPtrInput
	// Minimum number of servers allowed in a cluster before
	// autopilot can prune dead servers. This should at least be 3. Applicable only for
	// voting nodes.
	MinQuorum pulumi.IntPtrInput
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace pulumi.StringPtrInput
	// Minimum amount of time a server must be
	// stable in the 'healthy' state before being added to the cluster.
	ServerStabilizationTime pulumi.StringPtrInput
}

func (RaftAutopilotState) ElementType() reflect.Type {
	return reflect.TypeOf((*raftAutopilotState)(nil)).Elem()
}

type raftAutopilotArgs struct {
	// Specifies whether to remove dead server nodes
	// periodically or when a new server joins. This requires that `min-quorum` is also set.
	CleanupDeadServers *bool `pulumi:"cleanupDeadServers"`
	// Limit the amount of time a
	// server can go without leader contact before being considered failed. This only takes
	// effect when `cleanupDeadServers` is set.
	DeadServerLastContactThreshold *string `pulumi:"deadServerLastContactThreshold"`
	// Limit the amount of time a server can go
	// without leader contact before being considered unhealthy.
	LastContactThreshold *string `pulumi:"lastContactThreshold"`
	// Maximum number of log entries in the Raft log
	// that a server can be behind its leader before being considered unhealthy.
	MaxTrailingLogs *int `pulumi:"maxTrailingLogs"`
	// Minimum number of servers allowed in a cluster before
	// autopilot can prune dead servers. This should at least be 3. Applicable only for
	// voting nodes.
	MinQuorum *int `pulumi:"minQuorum"`
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace *string `pulumi:"namespace"`
	// Minimum amount of time a server must be
	// stable in the 'healthy' state before being added to the cluster.
	ServerStabilizationTime *string `pulumi:"serverStabilizationTime"`
}

// The set of arguments for constructing a RaftAutopilot resource.
type RaftAutopilotArgs struct {
	// Specifies whether to remove dead server nodes
	// periodically or when a new server joins. This requires that `min-quorum` is also set.
	CleanupDeadServers pulumi.BoolPtrInput
	// Limit the amount of time a
	// server can go without leader contact before being considered failed. This only takes
	// effect when `cleanupDeadServers` is set.
	DeadServerLastContactThreshold pulumi.StringPtrInput
	// Limit the amount of time a server can go
	// without leader contact before being considered unhealthy.
	LastContactThreshold pulumi.StringPtrInput
	// Maximum number of log entries in the Raft log
	// that a server can be behind its leader before being considered unhealthy.
	MaxTrailingLogs pulumi.IntPtrInput
	// Minimum number of servers allowed in a cluster before
	// autopilot can prune dead servers. This should at least be 3. Applicable only for
	// voting nodes.
	MinQuorum pulumi.IntPtrInput
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace pulumi.StringPtrInput
	// Minimum amount of time a server must be
	// stable in the 'healthy' state before being added to the cluster.
	ServerStabilizationTime pulumi.StringPtrInput
}

func (RaftAutopilotArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*raftAutopilotArgs)(nil)).Elem()
}

type RaftAutopilotInput interface {
	pulumi.Input

	ToRaftAutopilotOutput() RaftAutopilotOutput
	ToRaftAutopilotOutputWithContext(ctx context.Context) RaftAutopilotOutput
}

func (*RaftAutopilot) ElementType() reflect.Type {
	return reflect.TypeOf((**RaftAutopilot)(nil)).Elem()
}

func (i *RaftAutopilot) ToRaftAutopilotOutput() RaftAutopilotOutput {
	return i.ToRaftAutopilotOutputWithContext(context.Background())
}

func (i *RaftAutopilot) ToRaftAutopilotOutputWithContext(ctx context.Context) RaftAutopilotOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RaftAutopilotOutput)
}

// RaftAutopilotArrayInput is an input type that accepts RaftAutopilotArray and RaftAutopilotArrayOutput values.
// You can construct a concrete instance of `RaftAutopilotArrayInput` via:
//
//	RaftAutopilotArray{ RaftAutopilotArgs{...} }
type RaftAutopilotArrayInput interface {
	pulumi.Input

	ToRaftAutopilotArrayOutput() RaftAutopilotArrayOutput
	ToRaftAutopilotArrayOutputWithContext(context.Context) RaftAutopilotArrayOutput
}

type RaftAutopilotArray []RaftAutopilotInput

func (RaftAutopilotArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RaftAutopilot)(nil)).Elem()
}

func (i RaftAutopilotArray) ToRaftAutopilotArrayOutput() RaftAutopilotArrayOutput {
	return i.ToRaftAutopilotArrayOutputWithContext(context.Background())
}

func (i RaftAutopilotArray) ToRaftAutopilotArrayOutputWithContext(ctx context.Context) RaftAutopilotArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RaftAutopilotArrayOutput)
}

// RaftAutopilotMapInput is an input type that accepts RaftAutopilotMap and RaftAutopilotMapOutput values.
// You can construct a concrete instance of `RaftAutopilotMapInput` via:
//
//	RaftAutopilotMap{ "key": RaftAutopilotArgs{...} }
type RaftAutopilotMapInput interface {
	pulumi.Input

	ToRaftAutopilotMapOutput() RaftAutopilotMapOutput
	ToRaftAutopilotMapOutputWithContext(context.Context) RaftAutopilotMapOutput
}

type RaftAutopilotMap map[string]RaftAutopilotInput

func (RaftAutopilotMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RaftAutopilot)(nil)).Elem()
}

func (i RaftAutopilotMap) ToRaftAutopilotMapOutput() RaftAutopilotMapOutput {
	return i.ToRaftAutopilotMapOutputWithContext(context.Background())
}

func (i RaftAutopilotMap) ToRaftAutopilotMapOutputWithContext(ctx context.Context) RaftAutopilotMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RaftAutopilotMapOutput)
}

type RaftAutopilotOutput struct{ *pulumi.OutputState }

func (RaftAutopilotOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RaftAutopilot)(nil)).Elem()
}

func (o RaftAutopilotOutput) ToRaftAutopilotOutput() RaftAutopilotOutput {
	return o
}

func (o RaftAutopilotOutput) ToRaftAutopilotOutputWithContext(ctx context.Context) RaftAutopilotOutput {
	return o
}

// Specifies whether to remove dead server nodes
// periodically or when a new server joins. This requires that `min-quorum` is also set.
func (o RaftAutopilotOutput) CleanupDeadServers() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RaftAutopilot) pulumi.BoolPtrOutput { return v.CleanupDeadServers }).(pulumi.BoolPtrOutput)
}

// Limit the amount of time a
// server can go without leader contact before being considered failed. This only takes
// effect when `cleanupDeadServers` is set.
func (o RaftAutopilotOutput) DeadServerLastContactThreshold() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RaftAutopilot) pulumi.StringPtrOutput { return v.DeadServerLastContactThreshold }).(pulumi.StringPtrOutput)
}

// Limit the amount of time a server can go
// without leader contact before being considered unhealthy.
func (o RaftAutopilotOutput) LastContactThreshold() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RaftAutopilot) pulumi.StringPtrOutput { return v.LastContactThreshold }).(pulumi.StringPtrOutput)
}

// Maximum number of log entries in the Raft log
// that a server can be behind its leader before being considered unhealthy.
func (o RaftAutopilotOutput) MaxTrailingLogs() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RaftAutopilot) pulumi.IntPtrOutput { return v.MaxTrailingLogs }).(pulumi.IntPtrOutput)
}

// Minimum number of servers allowed in a cluster before
// autopilot can prune dead servers. This should at least be 3. Applicable only for
// voting nodes.
func (o RaftAutopilotOutput) MinQuorum() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RaftAutopilot) pulumi.IntPtrOutput { return v.MinQuorum }).(pulumi.IntPtrOutput)
}

// The namespace to provision the resource in.
// The value should not contain leading or trailing forward slashes.
// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
// *Available only for Vault Enterprise*.
func (o RaftAutopilotOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RaftAutopilot) pulumi.StringPtrOutput { return v.Namespace }).(pulumi.StringPtrOutput)
}

// Minimum amount of time a server must be
// stable in the 'healthy' state before being added to the cluster.
func (o RaftAutopilotOutput) ServerStabilizationTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RaftAutopilot) pulumi.StringPtrOutput { return v.ServerStabilizationTime }).(pulumi.StringPtrOutput)
}

type RaftAutopilotArrayOutput struct{ *pulumi.OutputState }

func (RaftAutopilotArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RaftAutopilot)(nil)).Elem()
}

func (o RaftAutopilotArrayOutput) ToRaftAutopilotArrayOutput() RaftAutopilotArrayOutput {
	return o
}

func (o RaftAutopilotArrayOutput) ToRaftAutopilotArrayOutputWithContext(ctx context.Context) RaftAutopilotArrayOutput {
	return o
}

func (o RaftAutopilotArrayOutput) Index(i pulumi.IntInput) RaftAutopilotOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RaftAutopilot {
		return vs[0].([]*RaftAutopilot)[vs[1].(int)]
	}).(RaftAutopilotOutput)
}

type RaftAutopilotMapOutput struct{ *pulumi.OutputState }

func (RaftAutopilotMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RaftAutopilot)(nil)).Elem()
}

func (o RaftAutopilotMapOutput) ToRaftAutopilotMapOutput() RaftAutopilotMapOutput {
	return o
}

func (o RaftAutopilotMapOutput) ToRaftAutopilotMapOutputWithContext(ctx context.Context) RaftAutopilotMapOutput {
	return o
}

func (o RaftAutopilotMapOutput) MapIndex(k pulumi.StringInput) RaftAutopilotOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RaftAutopilot {
		return vs[0].(map[string]*RaftAutopilot)[vs[1].(string)]
	}).(RaftAutopilotOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RaftAutopilotInput)(nil)).Elem(), &RaftAutopilot{})
	pulumi.RegisterInputType(reflect.TypeOf((*RaftAutopilotArrayInput)(nil)).Elem(), RaftAutopilotArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RaftAutopilotMapInput)(nil)).Elem(), RaftAutopilotMap{})
	pulumi.RegisterOutputType(RaftAutopilotOutput{})
	pulumi.RegisterOutputType(RaftAutopilotArrayOutput{})
	pulumi.RegisterOutputType(RaftAutopilotMapOutput{})
}
