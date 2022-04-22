// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package okta

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to create a group in an
// [Okta auth backend within Vault](https://www.vaultproject.io/docs/auth/okta.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-vault/sdk/v5/go/vault/okta"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		example, err := okta.NewAuthBackend(ctx, "example", &okta.AuthBackendArgs{
// 			Path:         pulumi.String("group_okta"),
// 			Organization: pulumi.String("dummy"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = okta.NewAuthBackendGroup(ctx, "foo", &okta.AuthBackendGroupArgs{
// 			Path:      example.Path,
// 			GroupName: pulumi.String("foo"),
// 			Policies: pulumi.StringArray{
// 				pulumi.String("one"),
// 				pulumi.String("two"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Okta authentication backend groups can be imported using the format `backend/groupName` e.g.
//
// ```sh
//  $ pulumi import vault:okta/authBackendGroup:AuthBackendGroup foo okta/foo
// ```
type AuthBackendGroup struct {
	pulumi.CustomResourceState

	// Name of the group within the Okta
	GroupName pulumi.StringOutput `pulumi:"groupName"`
	// The path where the Okta auth backend is mounted
	Path pulumi.StringOutput `pulumi:"path"`
	// Vault policies to associate with this group
	Policies pulumi.StringArrayOutput `pulumi:"policies"`
}

// NewAuthBackendGroup registers a new resource with the given unique name, arguments, and options.
func NewAuthBackendGroup(ctx *pulumi.Context,
	name string, args *AuthBackendGroupArgs, opts ...pulumi.ResourceOption) (*AuthBackendGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GroupName == nil {
		return nil, errors.New("invalid value for required argument 'GroupName'")
	}
	if args.Path == nil {
		return nil, errors.New("invalid value for required argument 'Path'")
	}
	var resource AuthBackendGroup
	err := ctx.RegisterResource("vault:okta/authBackendGroup:AuthBackendGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthBackendGroup gets an existing AuthBackendGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthBackendGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthBackendGroupState, opts ...pulumi.ResourceOption) (*AuthBackendGroup, error) {
	var resource AuthBackendGroup
	err := ctx.ReadResource("vault:okta/authBackendGroup:AuthBackendGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthBackendGroup resources.
type authBackendGroupState struct {
	// Name of the group within the Okta
	GroupName *string `pulumi:"groupName"`
	// The path where the Okta auth backend is mounted
	Path *string `pulumi:"path"`
	// Vault policies to associate with this group
	Policies []string `pulumi:"policies"`
}

type AuthBackendGroupState struct {
	// Name of the group within the Okta
	GroupName pulumi.StringPtrInput
	// The path where the Okta auth backend is mounted
	Path pulumi.StringPtrInput
	// Vault policies to associate with this group
	Policies pulumi.StringArrayInput
}

func (AuthBackendGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*authBackendGroupState)(nil)).Elem()
}

type authBackendGroupArgs struct {
	// Name of the group within the Okta
	GroupName string `pulumi:"groupName"`
	// The path where the Okta auth backend is mounted
	Path string `pulumi:"path"`
	// Vault policies to associate with this group
	Policies []string `pulumi:"policies"`
}

// The set of arguments for constructing a AuthBackendGroup resource.
type AuthBackendGroupArgs struct {
	// Name of the group within the Okta
	GroupName pulumi.StringInput
	// The path where the Okta auth backend is mounted
	Path pulumi.StringInput
	// Vault policies to associate with this group
	Policies pulumi.StringArrayInput
}

func (AuthBackendGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authBackendGroupArgs)(nil)).Elem()
}

type AuthBackendGroupInput interface {
	pulumi.Input

	ToAuthBackendGroupOutput() AuthBackendGroupOutput
	ToAuthBackendGroupOutputWithContext(ctx context.Context) AuthBackendGroupOutput
}

func (*AuthBackendGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthBackendGroup)(nil)).Elem()
}

func (i *AuthBackendGroup) ToAuthBackendGroupOutput() AuthBackendGroupOutput {
	return i.ToAuthBackendGroupOutputWithContext(context.Background())
}

func (i *AuthBackendGroup) ToAuthBackendGroupOutputWithContext(ctx context.Context) AuthBackendGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendGroupOutput)
}

// AuthBackendGroupArrayInput is an input type that accepts AuthBackendGroupArray and AuthBackendGroupArrayOutput values.
// You can construct a concrete instance of `AuthBackendGroupArrayInput` via:
//
//          AuthBackendGroupArray{ AuthBackendGroupArgs{...} }
type AuthBackendGroupArrayInput interface {
	pulumi.Input

	ToAuthBackendGroupArrayOutput() AuthBackendGroupArrayOutput
	ToAuthBackendGroupArrayOutputWithContext(context.Context) AuthBackendGroupArrayOutput
}

type AuthBackendGroupArray []AuthBackendGroupInput

func (AuthBackendGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthBackendGroup)(nil)).Elem()
}

func (i AuthBackendGroupArray) ToAuthBackendGroupArrayOutput() AuthBackendGroupArrayOutput {
	return i.ToAuthBackendGroupArrayOutputWithContext(context.Background())
}

func (i AuthBackendGroupArray) ToAuthBackendGroupArrayOutputWithContext(ctx context.Context) AuthBackendGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendGroupArrayOutput)
}

// AuthBackendGroupMapInput is an input type that accepts AuthBackendGroupMap and AuthBackendGroupMapOutput values.
// You can construct a concrete instance of `AuthBackendGroupMapInput` via:
//
//          AuthBackendGroupMap{ "key": AuthBackendGroupArgs{...} }
type AuthBackendGroupMapInput interface {
	pulumi.Input

	ToAuthBackendGroupMapOutput() AuthBackendGroupMapOutput
	ToAuthBackendGroupMapOutputWithContext(context.Context) AuthBackendGroupMapOutput
}

type AuthBackendGroupMap map[string]AuthBackendGroupInput

func (AuthBackendGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthBackendGroup)(nil)).Elem()
}

func (i AuthBackendGroupMap) ToAuthBackendGroupMapOutput() AuthBackendGroupMapOutput {
	return i.ToAuthBackendGroupMapOutputWithContext(context.Background())
}

func (i AuthBackendGroupMap) ToAuthBackendGroupMapOutputWithContext(ctx context.Context) AuthBackendGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendGroupMapOutput)
}

type AuthBackendGroupOutput struct{ *pulumi.OutputState }

func (AuthBackendGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthBackendGroup)(nil)).Elem()
}

func (o AuthBackendGroupOutput) ToAuthBackendGroupOutput() AuthBackendGroupOutput {
	return o
}

func (o AuthBackendGroupOutput) ToAuthBackendGroupOutputWithContext(ctx context.Context) AuthBackendGroupOutput {
	return o
}

type AuthBackendGroupArrayOutput struct{ *pulumi.OutputState }

func (AuthBackendGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthBackendGroup)(nil)).Elem()
}

func (o AuthBackendGroupArrayOutput) ToAuthBackendGroupArrayOutput() AuthBackendGroupArrayOutput {
	return o
}

func (o AuthBackendGroupArrayOutput) ToAuthBackendGroupArrayOutputWithContext(ctx context.Context) AuthBackendGroupArrayOutput {
	return o
}

func (o AuthBackendGroupArrayOutput) Index(i pulumi.IntInput) AuthBackendGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthBackendGroup {
		return vs[0].([]*AuthBackendGroup)[vs[1].(int)]
	}).(AuthBackendGroupOutput)
}

type AuthBackendGroupMapOutput struct{ *pulumi.OutputState }

func (AuthBackendGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthBackendGroup)(nil)).Elem()
}

func (o AuthBackendGroupMapOutput) ToAuthBackendGroupMapOutput() AuthBackendGroupMapOutput {
	return o
}

func (o AuthBackendGroupMapOutput) ToAuthBackendGroupMapOutputWithContext(ctx context.Context) AuthBackendGroupMapOutput {
	return o
}

func (o AuthBackendGroupMapOutput) MapIndex(k pulumi.StringInput) AuthBackendGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthBackendGroup {
		return vs[0].(map[string]*AuthBackendGroup)[vs[1].(string)]
	}).(AuthBackendGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendGroupInput)(nil)).Elem(), &AuthBackendGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendGroupArrayInput)(nil)).Elem(), AuthBackendGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendGroupMapInput)(nil)).Elem(), AuthBackendGroupMap{})
	pulumi.RegisterOutputType(AuthBackendGroupOutput{})
	pulumi.RegisterOutputType(AuthBackendGroupArrayOutput{})
	pulumi.RegisterOutputType(AuthBackendGroupMapOutput{})
}
