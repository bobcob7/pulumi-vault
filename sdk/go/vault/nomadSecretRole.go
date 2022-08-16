// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vault

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			config, err := vault.NewNomadSecretBackend(ctx, "config", &vault.NomadSecretBackendArgs{
//				Backend:                pulumi.String("nomad"),
//				Description:            pulumi.String("test description"),
//				DefaultLeaseTtlSeconds: pulumi.Int(3600),
//				MaxLeaseTtlSeconds:     pulumi.Int(7200),
//				Address:                pulumi.String("https://127.0.0.1:4646"),
//				Token:                  pulumi.String("ae20ceaa-..."),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = vault.NewNomadSecretRole(ctx, "test", &vault.NomadSecretRoleArgs{
//				Backend: config.Backend,
//				Role:    pulumi.String("test"),
//				Type:    pulumi.String("client"),
//				Policies: pulumi.StringArray{
//					pulumi.String("readonly"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Nomad secret role can be imported using the `backend`, e.g.
//
// ```sh
//
//	$ pulumi import vault:index/nomadSecretRole:NomadSecretRole bob nomad/role/bob
//
// ```
type NomadSecretRole struct {
	pulumi.CustomResourceState

	// The unique path this backend should be mounted at. Must
	// not begin or end with a `/`. Defaults to `nomad`.
	Backend pulumi.StringOutput `pulumi:"backend"`
	// Specifies if the generated token should be global. Defaults to
	// false.
	Global pulumi.BoolOutput `pulumi:"global"`
	// List of policies attached to the generated token. This setting is only used
	// when `type` is 'client'.
	Policies pulumi.StringArrayOutput `pulumi:"policies"`
	// The name to identify this role within the backend.
	// Must be unique within the backend.
	Role pulumi.StringOutput `pulumi:"role"`
	// Specifies the type of token to create when using this role. Valid
	// settings are 'client' and 'management'. Defaults to 'client'.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewNomadSecretRole registers a new resource with the given unique name, arguments, and options.
func NewNomadSecretRole(ctx *pulumi.Context,
	name string, args *NomadSecretRoleArgs, opts ...pulumi.ResourceOption) (*NomadSecretRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Backend == nil {
		return nil, errors.New("invalid value for required argument 'Backend'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	var resource NomadSecretRole
	err := ctx.RegisterResource("vault:index/nomadSecretRole:NomadSecretRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNomadSecretRole gets an existing NomadSecretRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNomadSecretRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NomadSecretRoleState, opts ...pulumi.ResourceOption) (*NomadSecretRole, error) {
	var resource NomadSecretRole
	err := ctx.ReadResource("vault:index/nomadSecretRole:NomadSecretRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NomadSecretRole resources.
type nomadSecretRoleState struct {
	// The unique path this backend should be mounted at. Must
	// not begin or end with a `/`. Defaults to `nomad`.
	Backend *string `pulumi:"backend"`
	// Specifies if the generated token should be global. Defaults to
	// false.
	Global *bool `pulumi:"global"`
	// List of policies attached to the generated token. This setting is only used
	// when `type` is 'client'.
	Policies []string `pulumi:"policies"`
	// The name to identify this role within the backend.
	// Must be unique within the backend.
	Role *string `pulumi:"role"`
	// Specifies the type of token to create when using this role. Valid
	// settings are 'client' and 'management'. Defaults to 'client'.
	Type *string `pulumi:"type"`
}

type NomadSecretRoleState struct {
	// The unique path this backend should be mounted at. Must
	// not begin or end with a `/`. Defaults to `nomad`.
	Backend pulumi.StringPtrInput
	// Specifies if the generated token should be global. Defaults to
	// false.
	Global pulumi.BoolPtrInput
	// List of policies attached to the generated token. This setting is only used
	// when `type` is 'client'.
	Policies pulumi.StringArrayInput
	// The name to identify this role within the backend.
	// Must be unique within the backend.
	Role pulumi.StringPtrInput
	// Specifies the type of token to create when using this role. Valid
	// settings are 'client' and 'management'. Defaults to 'client'.
	Type pulumi.StringPtrInput
}

func (NomadSecretRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*nomadSecretRoleState)(nil)).Elem()
}

type nomadSecretRoleArgs struct {
	// The unique path this backend should be mounted at. Must
	// not begin or end with a `/`. Defaults to `nomad`.
	Backend string `pulumi:"backend"`
	// Specifies if the generated token should be global. Defaults to
	// false.
	Global *bool `pulumi:"global"`
	// List of policies attached to the generated token. This setting is only used
	// when `type` is 'client'.
	Policies []string `pulumi:"policies"`
	// The name to identify this role within the backend.
	// Must be unique within the backend.
	Role string `pulumi:"role"`
	// Specifies the type of token to create when using this role. Valid
	// settings are 'client' and 'management'. Defaults to 'client'.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a NomadSecretRole resource.
type NomadSecretRoleArgs struct {
	// The unique path this backend should be mounted at. Must
	// not begin or end with a `/`. Defaults to `nomad`.
	Backend pulumi.StringInput
	// Specifies if the generated token should be global. Defaults to
	// false.
	Global pulumi.BoolPtrInput
	// List of policies attached to the generated token. This setting is only used
	// when `type` is 'client'.
	Policies pulumi.StringArrayInput
	// The name to identify this role within the backend.
	// Must be unique within the backend.
	Role pulumi.StringInput
	// Specifies the type of token to create when using this role. Valid
	// settings are 'client' and 'management'. Defaults to 'client'.
	Type pulumi.StringPtrInput
}

func (NomadSecretRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nomadSecretRoleArgs)(nil)).Elem()
}

type NomadSecretRoleInput interface {
	pulumi.Input

	ToNomadSecretRoleOutput() NomadSecretRoleOutput
	ToNomadSecretRoleOutputWithContext(ctx context.Context) NomadSecretRoleOutput
}

func (*NomadSecretRole) ElementType() reflect.Type {
	return reflect.TypeOf((**NomadSecretRole)(nil)).Elem()
}

func (i *NomadSecretRole) ToNomadSecretRoleOutput() NomadSecretRoleOutput {
	return i.ToNomadSecretRoleOutputWithContext(context.Background())
}

func (i *NomadSecretRole) ToNomadSecretRoleOutputWithContext(ctx context.Context) NomadSecretRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NomadSecretRoleOutput)
}

// NomadSecretRoleArrayInput is an input type that accepts NomadSecretRoleArray and NomadSecretRoleArrayOutput values.
// You can construct a concrete instance of `NomadSecretRoleArrayInput` via:
//
//	NomadSecretRoleArray{ NomadSecretRoleArgs{...} }
type NomadSecretRoleArrayInput interface {
	pulumi.Input

	ToNomadSecretRoleArrayOutput() NomadSecretRoleArrayOutput
	ToNomadSecretRoleArrayOutputWithContext(context.Context) NomadSecretRoleArrayOutput
}

type NomadSecretRoleArray []NomadSecretRoleInput

func (NomadSecretRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NomadSecretRole)(nil)).Elem()
}

func (i NomadSecretRoleArray) ToNomadSecretRoleArrayOutput() NomadSecretRoleArrayOutput {
	return i.ToNomadSecretRoleArrayOutputWithContext(context.Background())
}

func (i NomadSecretRoleArray) ToNomadSecretRoleArrayOutputWithContext(ctx context.Context) NomadSecretRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NomadSecretRoleArrayOutput)
}

// NomadSecretRoleMapInput is an input type that accepts NomadSecretRoleMap and NomadSecretRoleMapOutput values.
// You can construct a concrete instance of `NomadSecretRoleMapInput` via:
//
//	NomadSecretRoleMap{ "key": NomadSecretRoleArgs{...} }
type NomadSecretRoleMapInput interface {
	pulumi.Input

	ToNomadSecretRoleMapOutput() NomadSecretRoleMapOutput
	ToNomadSecretRoleMapOutputWithContext(context.Context) NomadSecretRoleMapOutput
}

type NomadSecretRoleMap map[string]NomadSecretRoleInput

func (NomadSecretRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NomadSecretRole)(nil)).Elem()
}

func (i NomadSecretRoleMap) ToNomadSecretRoleMapOutput() NomadSecretRoleMapOutput {
	return i.ToNomadSecretRoleMapOutputWithContext(context.Background())
}

func (i NomadSecretRoleMap) ToNomadSecretRoleMapOutputWithContext(ctx context.Context) NomadSecretRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NomadSecretRoleMapOutput)
}

type NomadSecretRoleOutput struct{ *pulumi.OutputState }

func (NomadSecretRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NomadSecretRole)(nil)).Elem()
}

func (o NomadSecretRoleOutput) ToNomadSecretRoleOutput() NomadSecretRoleOutput {
	return o
}

func (o NomadSecretRoleOutput) ToNomadSecretRoleOutputWithContext(ctx context.Context) NomadSecretRoleOutput {
	return o
}

// The unique path this backend should be mounted at. Must
// not begin or end with a `/`. Defaults to `nomad`.
func (o NomadSecretRoleOutput) Backend() pulumi.StringOutput {
	return o.ApplyT(func(v *NomadSecretRole) pulumi.StringOutput { return v.Backend }).(pulumi.StringOutput)
}

// Specifies if the generated token should be global. Defaults to
// false.
func (o NomadSecretRoleOutput) Global() pulumi.BoolOutput {
	return o.ApplyT(func(v *NomadSecretRole) pulumi.BoolOutput { return v.Global }).(pulumi.BoolOutput)
}

// List of policies attached to the generated token. This setting is only used
// when `type` is 'client'.
func (o NomadSecretRoleOutput) Policies() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *NomadSecretRole) pulumi.StringArrayOutput { return v.Policies }).(pulumi.StringArrayOutput)
}

// The name to identify this role within the backend.
// Must be unique within the backend.
func (o NomadSecretRoleOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *NomadSecretRole) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// Specifies the type of token to create when using this role. Valid
// settings are 'client' and 'management'. Defaults to 'client'.
func (o NomadSecretRoleOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *NomadSecretRole) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type NomadSecretRoleArrayOutput struct{ *pulumi.OutputState }

func (NomadSecretRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NomadSecretRole)(nil)).Elem()
}

func (o NomadSecretRoleArrayOutput) ToNomadSecretRoleArrayOutput() NomadSecretRoleArrayOutput {
	return o
}

func (o NomadSecretRoleArrayOutput) ToNomadSecretRoleArrayOutputWithContext(ctx context.Context) NomadSecretRoleArrayOutput {
	return o
}

func (o NomadSecretRoleArrayOutput) Index(i pulumi.IntInput) NomadSecretRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NomadSecretRole {
		return vs[0].([]*NomadSecretRole)[vs[1].(int)]
	}).(NomadSecretRoleOutput)
}

type NomadSecretRoleMapOutput struct{ *pulumi.OutputState }

func (NomadSecretRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NomadSecretRole)(nil)).Elem()
}

func (o NomadSecretRoleMapOutput) ToNomadSecretRoleMapOutput() NomadSecretRoleMapOutput {
	return o
}

func (o NomadSecretRoleMapOutput) ToNomadSecretRoleMapOutputWithContext(ctx context.Context) NomadSecretRoleMapOutput {
	return o
}

func (o NomadSecretRoleMapOutput) MapIndex(k pulumi.StringInput) NomadSecretRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NomadSecretRole {
		return vs[0].(map[string]*NomadSecretRole)[vs[1].(string)]
	}).(NomadSecretRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NomadSecretRoleInput)(nil)).Elem(), &NomadSecretRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*NomadSecretRoleArrayInput)(nil)).Elem(), NomadSecretRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NomadSecretRoleMapInput)(nil)).Elem(), NomadSecretRoleMap{})
	pulumi.RegisterOutputType(NomadSecretRoleOutput{})
	pulumi.RegisterOutputType(NomadSecretRoleArrayOutput{})
	pulumi.RegisterOutputType(NomadSecretRoleMapOutput{})
}
