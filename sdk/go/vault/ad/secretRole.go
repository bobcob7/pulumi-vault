// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ad

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type SecretRole struct {
	pulumi.CustomResourceState

	// The mount path for the AD backend.
	Backend pulumi.StringOutput `pulumi:"backend"`
	// Last time Vault rotated this service account's password.
	LastVaultRotation pulumi.StringOutput `pulumi:"lastVaultRotation"`
	// Last time Vault set this service account's password.
	PasswordLastSet pulumi.StringOutput `pulumi:"passwordLastSet"`
	// Name of the role.
	Role pulumi.StringOutput `pulumi:"role"`
	// The username/logon name for the service account with which this role will be associated.
	ServiceAccountName pulumi.StringOutput `pulumi:"serviceAccountName"`
	// In seconds, the default password time-to-live.
	Ttl pulumi.IntPtrOutput `pulumi:"ttl"`
}

// NewSecretRole registers a new resource with the given unique name, arguments, and options.
func NewSecretRole(ctx *pulumi.Context,
	name string, args *SecretRoleArgs, opts ...pulumi.ResourceOption) (*SecretRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Backend == nil {
		return nil, errors.New("invalid value for required argument 'Backend'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.ServiceAccountName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceAccountName'")
	}
	var resource SecretRole
	err := ctx.RegisterResource("vault:ad/secretRole:SecretRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecretRole gets an existing SecretRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecretRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecretRoleState, opts ...pulumi.ResourceOption) (*SecretRole, error) {
	var resource SecretRole
	err := ctx.ReadResource("vault:ad/secretRole:SecretRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecretRole resources.
type secretRoleState struct {
	// The mount path for the AD backend.
	Backend *string `pulumi:"backend"`
	// Last time Vault rotated this service account's password.
	LastVaultRotation *string `pulumi:"lastVaultRotation"`
	// Last time Vault set this service account's password.
	PasswordLastSet *string `pulumi:"passwordLastSet"`
	// Name of the role.
	Role *string `pulumi:"role"`
	// The username/logon name for the service account with which this role will be associated.
	ServiceAccountName *string `pulumi:"serviceAccountName"`
	// In seconds, the default password time-to-live.
	Ttl *int `pulumi:"ttl"`
}

type SecretRoleState struct {
	// The mount path for the AD backend.
	Backend pulumi.StringPtrInput
	// Last time Vault rotated this service account's password.
	LastVaultRotation pulumi.StringPtrInput
	// Last time Vault set this service account's password.
	PasswordLastSet pulumi.StringPtrInput
	// Name of the role.
	Role pulumi.StringPtrInput
	// The username/logon name for the service account with which this role will be associated.
	ServiceAccountName pulumi.StringPtrInput
	// In seconds, the default password time-to-live.
	Ttl pulumi.IntPtrInput
}

func (SecretRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*secretRoleState)(nil)).Elem()
}

type secretRoleArgs struct {
	// The mount path for the AD backend.
	Backend string `pulumi:"backend"`
	// Name of the role.
	Role string `pulumi:"role"`
	// The username/logon name for the service account with which this role will be associated.
	ServiceAccountName string `pulumi:"serviceAccountName"`
	// In seconds, the default password time-to-live.
	Ttl *int `pulumi:"ttl"`
}

// The set of arguments for constructing a SecretRole resource.
type SecretRoleArgs struct {
	// The mount path for the AD backend.
	Backend pulumi.StringInput
	// Name of the role.
	Role pulumi.StringInput
	// The username/logon name for the service account with which this role will be associated.
	ServiceAccountName pulumi.StringInput
	// In seconds, the default password time-to-live.
	Ttl pulumi.IntPtrInput
}

func (SecretRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*secretRoleArgs)(nil)).Elem()
}

type SecretRoleInput interface {
	pulumi.Input

	ToSecretRoleOutput() SecretRoleOutput
	ToSecretRoleOutputWithContext(ctx context.Context) SecretRoleOutput
}

func (*SecretRole) ElementType() reflect.Type {
	return reflect.TypeOf((*SecretRole)(nil))
}

func (i *SecretRole) ToSecretRoleOutput() SecretRoleOutput {
	return i.ToSecretRoleOutputWithContext(context.Background())
}

func (i *SecretRole) ToSecretRoleOutputWithContext(ctx context.Context) SecretRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretRoleOutput)
}

func (i *SecretRole) ToSecretRolePtrOutput() SecretRolePtrOutput {
	return i.ToSecretRolePtrOutputWithContext(context.Background())
}

func (i *SecretRole) ToSecretRolePtrOutputWithContext(ctx context.Context) SecretRolePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretRolePtrOutput)
}

type SecretRolePtrInput interface {
	pulumi.Input

	ToSecretRolePtrOutput() SecretRolePtrOutput
	ToSecretRolePtrOutputWithContext(ctx context.Context) SecretRolePtrOutput
}

type secretRolePtrType SecretRoleArgs

func (*secretRolePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretRole)(nil))
}

func (i *secretRolePtrType) ToSecretRolePtrOutput() SecretRolePtrOutput {
	return i.ToSecretRolePtrOutputWithContext(context.Background())
}

func (i *secretRolePtrType) ToSecretRolePtrOutputWithContext(ctx context.Context) SecretRolePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretRolePtrOutput)
}

// SecretRoleArrayInput is an input type that accepts SecretRoleArray and SecretRoleArrayOutput values.
// You can construct a concrete instance of `SecretRoleArrayInput` via:
//
//          SecretRoleArray{ SecretRoleArgs{...} }
type SecretRoleArrayInput interface {
	pulumi.Input

	ToSecretRoleArrayOutput() SecretRoleArrayOutput
	ToSecretRoleArrayOutputWithContext(context.Context) SecretRoleArrayOutput
}

type SecretRoleArray []SecretRoleInput

func (SecretRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*SecretRole)(nil))
}

func (i SecretRoleArray) ToSecretRoleArrayOutput() SecretRoleArrayOutput {
	return i.ToSecretRoleArrayOutputWithContext(context.Background())
}

func (i SecretRoleArray) ToSecretRoleArrayOutputWithContext(ctx context.Context) SecretRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretRoleArrayOutput)
}

// SecretRoleMapInput is an input type that accepts SecretRoleMap and SecretRoleMapOutput values.
// You can construct a concrete instance of `SecretRoleMapInput` via:
//
//          SecretRoleMap{ "key": SecretRoleArgs{...} }
type SecretRoleMapInput interface {
	pulumi.Input

	ToSecretRoleMapOutput() SecretRoleMapOutput
	ToSecretRoleMapOutputWithContext(context.Context) SecretRoleMapOutput
}

type SecretRoleMap map[string]SecretRoleInput

func (SecretRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*SecretRole)(nil))
}

func (i SecretRoleMap) ToSecretRoleMapOutput() SecretRoleMapOutput {
	return i.ToSecretRoleMapOutputWithContext(context.Background())
}

func (i SecretRoleMap) ToSecretRoleMapOutputWithContext(ctx context.Context) SecretRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretRoleMapOutput)
}

type SecretRoleOutput struct {
	*pulumi.OutputState
}

func (SecretRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*SecretRole)(nil))
}

func (o SecretRoleOutput) ToSecretRoleOutput() SecretRoleOutput {
	return o
}

func (o SecretRoleOutput) ToSecretRoleOutputWithContext(ctx context.Context) SecretRoleOutput {
	return o
}

func (o SecretRoleOutput) ToSecretRolePtrOutput() SecretRolePtrOutput {
	return o.ToSecretRolePtrOutputWithContext(context.Background())
}

func (o SecretRoleOutput) ToSecretRolePtrOutputWithContext(ctx context.Context) SecretRolePtrOutput {
	return o.ApplyT(func(v SecretRole) *SecretRole {
		return &v
	}).(SecretRolePtrOutput)
}

type SecretRolePtrOutput struct {
	*pulumi.OutputState
}

func (SecretRolePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretRole)(nil))
}

func (o SecretRolePtrOutput) ToSecretRolePtrOutput() SecretRolePtrOutput {
	return o
}

func (o SecretRolePtrOutput) ToSecretRolePtrOutputWithContext(ctx context.Context) SecretRolePtrOutput {
	return o
}

type SecretRoleArrayOutput struct{ *pulumi.OutputState }

func (SecretRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]SecretRole)(nil))
}

func (o SecretRoleArrayOutput) ToSecretRoleArrayOutput() SecretRoleArrayOutput {
	return o
}

func (o SecretRoleArrayOutput) ToSecretRoleArrayOutputWithContext(ctx context.Context) SecretRoleArrayOutput {
	return o
}

func (o SecretRoleArrayOutput) Index(i pulumi.IntInput) SecretRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) SecretRole {
		return vs[0].([]SecretRole)[vs[1].(int)]
	}).(SecretRoleOutput)
}

type SecretRoleMapOutput struct{ *pulumi.OutputState }

func (SecretRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]SecretRole)(nil))
}

func (o SecretRoleMapOutput) ToSecretRoleMapOutput() SecretRoleMapOutput {
	return o
}

func (o SecretRoleMapOutput) ToSecretRoleMapOutputWithContext(ctx context.Context) SecretRoleMapOutput {
	return o
}

func (o SecretRoleMapOutput) MapIndex(k pulumi.StringInput) SecretRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) SecretRole {
		return vs[0].(map[string]SecretRole)[vs[1].(string)]
	}).(SecretRoleOutput)
}

func init() {
	pulumi.RegisterOutputType(SecretRoleOutput{})
	pulumi.RegisterOutputType(SecretRolePtrOutput{})
	pulumi.RegisterOutputType(SecretRoleArrayOutput{})
	pulumi.RegisterOutputType(SecretRoleMapOutput{})
}
