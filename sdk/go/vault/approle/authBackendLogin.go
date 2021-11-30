// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package approle

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Logs into Vault using the AppRole auth backend. See the [Vault
// documentation](https://www.vaultproject.io/docs/auth/approle) for more
// information.
type AuthBackendLogin struct {
	pulumi.CustomResourceState

	// The accessor for the token.
	Accessor pulumi.StringOutput `pulumi:"accessor"`
	// The unique path of the Vault backend to log in with.
	Backend pulumi.StringPtrOutput `pulumi:"backend"`
	// The Vault token created.
	ClientToken pulumi.StringOutput `pulumi:"clientToken"`
	// How long the token is valid for, in seconds.
	LeaseDuration pulumi.IntOutput `pulumi:"leaseDuration"`
	// The date and time the lease started, in RFC 3339 format.
	LeaseStarted pulumi.StringOutput `pulumi:"leaseStarted"`
	// The metadata associated with the token.
	Metadata pulumi.StringMapOutput `pulumi:"metadata"`
	// A list of policies applied to the token.
	Policies pulumi.StringArrayOutput `pulumi:"policies"`
	// Whether the token is renewable or not.
	Renewable pulumi.BoolOutput `pulumi:"renewable"`
	// The ID of the role to log in with.
	RoleId pulumi.StringOutput `pulumi:"roleId"`
	// The secret ID of the role to log in with. Required
	// unless `bindSecretId` is set to false on the role.
	SecretId pulumi.StringPtrOutput `pulumi:"secretId"`
}

// NewAuthBackendLogin registers a new resource with the given unique name, arguments, and options.
func NewAuthBackendLogin(ctx *pulumi.Context,
	name string, args *AuthBackendLoginArgs, opts ...pulumi.ResourceOption) (*AuthBackendLogin, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RoleId == nil {
		return nil, errors.New("invalid value for required argument 'RoleId'")
	}
	var resource AuthBackendLogin
	err := ctx.RegisterResource("vault:appRole/authBackendLogin:AuthBackendLogin", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthBackendLogin gets an existing AuthBackendLogin resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthBackendLogin(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthBackendLoginState, opts ...pulumi.ResourceOption) (*AuthBackendLogin, error) {
	var resource AuthBackendLogin
	err := ctx.ReadResource("vault:appRole/authBackendLogin:AuthBackendLogin", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthBackendLogin resources.
type authBackendLoginState struct {
	// The accessor for the token.
	Accessor *string `pulumi:"accessor"`
	// The unique path of the Vault backend to log in with.
	Backend *string `pulumi:"backend"`
	// The Vault token created.
	ClientToken *string `pulumi:"clientToken"`
	// How long the token is valid for, in seconds.
	LeaseDuration *int `pulumi:"leaseDuration"`
	// The date and time the lease started, in RFC 3339 format.
	LeaseStarted *string `pulumi:"leaseStarted"`
	// The metadata associated with the token.
	Metadata map[string]string `pulumi:"metadata"`
	// A list of policies applied to the token.
	Policies []string `pulumi:"policies"`
	// Whether the token is renewable or not.
	Renewable *bool `pulumi:"renewable"`
	// The ID of the role to log in with.
	RoleId *string `pulumi:"roleId"`
	// The secret ID of the role to log in with. Required
	// unless `bindSecretId` is set to false on the role.
	SecretId *string `pulumi:"secretId"`
}

type AuthBackendLoginState struct {
	// The accessor for the token.
	Accessor pulumi.StringPtrInput
	// The unique path of the Vault backend to log in with.
	Backend pulumi.StringPtrInput
	// The Vault token created.
	ClientToken pulumi.StringPtrInput
	// How long the token is valid for, in seconds.
	LeaseDuration pulumi.IntPtrInput
	// The date and time the lease started, in RFC 3339 format.
	LeaseStarted pulumi.StringPtrInput
	// The metadata associated with the token.
	Metadata pulumi.StringMapInput
	// A list of policies applied to the token.
	Policies pulumi.StringArrayInput
	// Whether the token is renewable or not.
	Renewable pulumi.BoolPtrInput
	// The ID of the role to log in with.
	RoleId pulumi.StringPtrInput
	// The secret ID of the role to log in with. Required
	// unless `bindSecretId` is set to false on the role.
	SecretId pulumi.StringPtrInput
}

func (AuthBackendLoginState) ElementType() reflect.Type {
	return reflect.TypeOf((*authBackendLoginState)(nil)).Elem()
}

type authBackendLoginArgs struct {
	// The unique path of the Vault backend to log in with.
	Backend *string `pulumi:"backend"`
	// The ID of the role to log in with.
	RoleId string `pulumi:"roleId"`
	// The secret ID of the role to log in with. Required
	// unless `bindSecretId` is set to false on the role.
	SecretId *string `pulumi:"secretId"`
}

// The set of arguments for constructing a AuthBackendLogin resource.
type AuthBackendLoginArgs struct {
	// The unique path of the Vault backend to log in with.
	Backend pulumi.StringPtrInput
	// The ID of the role to log in with.
	RoleId pulumi.StringInput
	// The secret ID of the role to log in with. Required
	// unless `bindSecretId` is set to false on the role.
	SecretId pulumi.StringPtrInput
}

func (AuthBackendLoginArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authBackendLoginArgs)(nil)).Elem()
}

type AuthBackendLoginInput interface {
	pulumi.Input

	ToAuthBackendLoginOutput() AuthBackendLoginOutput
	ToAuthBackendLoginOutputWithContext(ctx context.Context) AuthBackendLoginOutput
}

func (*AuthBackendLogin) ElementType() reflect.Type {
	return reflect.TypeOf((*AuthBackendLogin)(nil))
}

func (i *AuthBackendLogin) ToAuthBackendLoginOutput() AuthBackendLoginOutput {
	return i.ToAuthBackendLoginOutputWithContext(context.Background())
}

func (i *AuthBackendLogin) ToAuthBackendLoginOutputWithContext(ctx context.Context) AuthBackendLoginOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendLoginOutput)
}

func (i *AuthBackendLogin) ToAuthBackendLoginPtrOutput() AuthBackendLoginPtrOutput {
	return i.ToAuthBackendLoginPtrOutputWithContext(context.Background())
}

func (i *AuthBackendLogin) ToAuthBackendLoginPtrOutputWithContext(ctx context.Context) AuthBackendLoginPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendLoginPtrOutput)
}

type AuthBackendLoginPtrInput interface {
	pulumi.Input

	ToAuthBackendLoginPtrOutput() AuthBackendLoginPtrOutput
	ToAuthBackendLoginPtrOutputWithContext(ctx context.Context) AuthBackendLoginPtrOutput
}

type authBackendLoginPtrType AuthBackendLoginArgs

func (*authBackendLoginPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthBackendLogin)(nil))
}

func (i *authBackendLoginPtrType) ToAuthBackendLoginPtrOutput() AuthBackendLoginPtrOutput {
	return i.ToAuthBackendLoginPtrOutputWithContext(context.Background())
}

func (i *authBackendLoginPtrType) ToAuthBackendLoginPtrOutputWithContext(ctx context.Context) AuthBackendLoginPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendLoginPtrOutput)
}

// AuthBackendLoginArrayInput is an input type that accepts AuthBackendLoginArray and AuthBackendLoginArrayOutput values.
// You can construct a concrete instance of `AuthBackendLoginArrayInput` via:
//
//          AuthBackendLoginArray{ AuthBackendLoginArgs{...} }
type AuthBackendLoginArrayInput interface {
	pulumi.Input

	ToAuthBackendLoginArrayOutput() AuthBackendLoginArrayOutput
	ToAuthBackendLoginArrayOutputWithContext(context.Context) AuthBackendLoginArrayOutput
}

type AuthBackendLoginArray []AuthBackendLoginInput

func (AuthBackendLoginArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthBackendLogin)(nil)).Elem()
}

func (i AuthBackendLoginArray) ToAuthBackendLoginArrayOutput() AuthBackendLoginArrayOutput {
	return i.ToAuthBackendLoginArrayOutputWithContext(context.Background())
}

func (i AuthBackendLoginArray) ToAuthBackendLoginArrayOutputWithContext(ctx context.Context) AuthBackendLoginArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendLoginArrayOutput)
}

// AuthBackendLoginMapInput is an input type that accepts AuthBackendLoginMap and AuthBackendLoginMapOutput values.
// You can construct a concrete instance of `AuthBackendLoginMapInput` via:
//
//          AuthBackendLoginMap{ "key": AuthBackendLoginArgs{...} }
type AuthBackendLoginMapInput interface {
	pulumi.Input

	ToAuthBackendLoginMapOutput() AuthBackendLoginMapOutput
	ToAuthBackendLoginMapOutputWithContext(context.Context) AuthBackendLoginMapOutput
}

type AuthBackendLoginMap map[string]AuthBackendLoginInput

func (AuthBackendLoginMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthBackendLogin)(nil)).Elem()
}

func (i AuthBackendLoginMap) ToAuthBackendLoginMapOutput() AuthBackendLoginMapOutput {
	return i.ToAuthBackendLoginMapOutputWithContext(context.Background())
}

func (i AuthBackendLoginMap) ToAuthBackendLoginMapOutputWithContext(ctx context.Context) AuthBackendLoginMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendLoginMapOutput)
}

type AuthBackendLoginOutput struct{ *pulumi.OutputState }

func (AuthBackendLoginOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AuthBackendLogin)(nil))
}

func (o AuthBackendLoginOutput) ToAuthBackendLoginOutput() AuthBackendLoginOutput {
	return o
}

func (o AuthBackendLoginOutput) ToAuthBackendLoginOutputWithContext(ctx context.Context) AuthBackendLoginOutput {
	return o
}

func (o AuthBackendLoginOutput) ToAuthBackendLoginPtrOutput() AuthBackendLoginPtrOutput {
	return o.ToAuthBackendLoginPtrOutputWithContext(context.Background())
}

func (o AuthBackendLoginOutput) ToAuthBackendLoginPtrOutputWithContext(ctx context.Context) AuthBackendLoginPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v AuthBackendLogin) *AuthBackendLogin {
		return &v
	}).(AuthBackendLoginPtrOutput)
}

type AuthBackendLoginPtrOutput struct{ *pulumi.OutputState }

func (AuthBackendLoginPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthBackendLogin)(nil))
}

func (o AuthBackendLoginPtrOutput) ToAuthBackendLoginPtrOutput() AuthBackendLoginPtrOutput {
	return o
}

func (o AuthBackendLoginPtrOutput) ToAuthBackendLoginPtrOutputWithContext(ctx context.Context) AuthBackendLoginPtrOutput {
	return o
}

func (o AuthBackendLoginPtrOutput) Elem() AuthBackendLoginOutput {
	return o.ApplyT(func(v *AuthBackendLogin) AuthBackendLogin {
		if v != nil {
			return *v
		}
		var ret AuthBackendLogin
		return ret
	}).(AuthBackendLoginOutput)
}

type AuthBackendLoginArrayOutput struct{ *pulumi.OutputState }

func (AuthBackendLoginArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AuthBackendLogin)(nil))
}

func (o AuthBackendLoginArrayOutput) ToAuthBackendLoginArrayOutput() AuthBackendLoginArrayOutput {
	return o
}

func (o AuthBackendLoginArrayOutput) ToAuthBackendLoginArrayOutputWithContext(ctx context.Context) AuthBackendLoginArrayOutput {
	return o
}

func (o AuthBackendLoginArrayOutput) Index(i pulumi.IntInput) AuthBackendLoginOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AuthBackendLogin {
		return vs[0].([]AuthBackendLogin)[vs[1].(int)]
	}).(AuthBackendLoginOutput)
}

type AuthBackendLoginMapOutput struct{ *pulumi.OutputState }

func (AuthBackendLoginMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AuthBackendLogin)(nil))
}

func (o AuthBackendLoginMapOutput) ToAuthBackendLoginMapOutput() AuthBackendLoginMapOutput {
	return o
}

func (o AuthBackendLoginMapOutput) ToAuthBackendLoginMapOutputWithContext(ctx context.Context) AuthBackendLoginMapOutput {
	return o
}

func (o AuthBackendLoginMapOutput) MapIndex(k pulumi.StringInput) AuthBackendLoginOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AuthBackendLogin {
		return vs[0].(map[string]AuthBackendLogin)[vs[1].(string)]
	}).(AuthBackendLoginOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendLoginInput)(nil)).Elem(), &AuthBackendLogin{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendLoginPtrInput)(nil)).Elem(), &AuthBackendLogin{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendLoginArrayInput)(nil)).Elem(), AuthBackendLoginArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendLoginMapInput)(nil)).Elem(), AuthBackendLoginMap{})
	pulumi.RegisterOutputType(AuthBackendLoginOutput{})
	pulumi.RegisterOutputType(AuthBackendLoginPtrOutput{})
	pulumi.RegisterOutputType(AuthBackendLoginArrayOutput{})
	pulumi.RegisterOutputType(AuthBackendLoginMapOutput{})
}
