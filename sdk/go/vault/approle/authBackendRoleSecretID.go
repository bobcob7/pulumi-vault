// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package approle

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an AppRole auth backend SecretID in a Vault server. See the [Vault
// documentation](https://www.vaultproject.io/docs/auth/approle) for more
// information.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-vault/sdk/v5/go/vault"
//	"github.com/pulumi/pulumi-vault/sdk/v5/go/vault/appRole"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			approle, err := vault.NewAuthBackend(ctx, "approle", &vault.AuthBackendArgs{
//				Type: pulumi.String("approle"),
//			})
//			if err != nil {
//				return err
//			}
//			example, err := appRole.NewAuthBackendRole(ctx, "example", &appRole.AuthBackendRoleArgs{
//				Backend:  approle.Path,
//				RoleName: pulumi.String("test-role"),
//				TokenPolicies: pulumi.StringArray{
//					pulumi.String("default"),
//					pulumi.String("dev"),
//					pulumi.String("prod"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"hello": "world",
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = appRole.NewAuthBackendRoleSecretID(ctx, "id", &appRole.AuthBackendRoleSecretIDArgs{
//				Backend:  approle.Path,
//				RoleName: example.RoleName,
//				Metadata: pulumi.String(json0),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type AuthBackendRoleSecretID struct {
	pulumi.CustomResourceState

	// The unique ID for this SecretID that can be safely logged.
	Accessor pulumi.StringOutput `pulumi:"accessor"`
	// Unique name of the auth backend to configure.
	Backend pulumi.StringPtrOutput `pulumi:"backend"`
	// If set, specifies blocks of IP addresses which can
	// perform the login operation using this SecretID.
	CidrLists pulumi.StringArrayOutput `pulumi:"cidrLists"`
	// A JSON-encoded string containing metadata in
	// key-value pairs to be set on tokens issued with this SecretID.
	Metadata pulumi.StringPtrOutput `pulumi:"metadata"`
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace pulumi.StringPtrOutput `pulumi:"namespace"`
	// The name of the role to create the SecretID for.
	RoleName pulumi.StringOutput `pulumi:"roleName"`
	// The SecretID to be created. If set, uses "Push"
	// mode.  Defaults to Vault auto-generating SecretIDs.
	SecretId pulumi.StringOutput `pulumi:"secretId"`
	// Set to `true` to use the wrapped secret-id accessor as the resource ID.
	// If `false` (default value), a fresh secret ID will be regenerated whenever the wrapping token is expired or
	// invalidated through unwrapping.
	WithWrappedAccessor pulumi.BoolPtrOutput `pulumi:"withWrappedAccessor"`
	// The unique ID for the response-wrapped SecretID that can
	// be safely logged.
	WrappingAccessor pulumi.StringOutput `pulumi:"wrappingAccessor"`
	// The token used to retrieve a response-wrapped SecretID.
	WrappingToken pulumi.StringOutput `pulumi:"wrappingToken"`
	// If set, the SecretID response will be
	// [response-wrapped](https://www.vaultproject.io/docs/concepts/response-wrapping)
	// and available for the duration specified. Only a single unwrapping of the
	// token is allowed.
	WrappingTtl pulumi.StringPtrOutput `pulumi:"wrappingTtl"`
}

// NewAuthBackendRoleSecretID registers a new resource with the given unique name, arguments, and options.
func NewAuthBackendRoleSecretID(ctx *pulumi.Context,
	name string, args *AuthBackendRoleSecretIDArgs, opts ...pulumi.ResourceOption) (*AuthBackendRoleSecretID, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RoleName == nil {
		return nil, errors.New("invalid value for required argument 'RoleName'")
	}
	if args.SecretId != nil {
		args.SecretId = pulumi.ToSecret(args.SecretId).(pulumi.StringPtrOutput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"secretId",
		"wrappingToken",
	})
	opts = append(opts, secrets)
	var resource AuthBackendRoleSecretID
	err := ctx.RegisterResource("vault:appRole/authBackendRoleSecretID:AuthBackendRoleSecretID", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthBackendRoleSecretID gets an existing AuthBackendRoleSecretID resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthBackendRoleSecretID(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthBackendRoleSecretIDState, opts ...pulumi.ResourceOption) (*AuthBackendRoleSecretID, error) {
	var resource AuthBackendRoleSecretID
	err := ctx.ReadResource("vault:appRole/authBackendRoleSecretID:AuthBackendRoleSecretID", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthBackendRoleSecretID resources.
type authBackendRoleSecretIDState struct {
	// The unique ID for this SecretID that can be safely logged.
	Accessor *string `pulumi:"accessor"`
	// Unique name of the auth backend to configure.
	Backend *string `pulumi:"backend"`
	// If set, specifies blocks of IP addresses which can
	// perform the login operation using this SecretID.
	CidrLists []string `pulumi:"cidrLists"`
	// A JSON-encoded string containing metadata in
	// key-value pairs to be set on tokens issued with this SecretID.
	Metadata *string `pulumi:"metadata"`
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace *string `pulumi:"namespace"`
	// The name of the role to create the SecretID for.
	RoleName *string `pulumi:"roleName"`
	// The SecretID to be created. If set, uses "Push"
	// mode.  Defaults to Vault auto-generating SecretIDs.
	SecretId *string `pulumi:"secretId"`
	// Set to `true` to use the wrapped secret-id accessor as the resource ID.
	// If `false` (default value), a fresh secret ID will be regenerated whenever the wrapping token is expired or
	// invalidated through unwrapping.
	WithWrappedAccessor *bool `pulumi:"withWrappedAccessor"`
	// The unique ID for the response-wrapped SecretID that can
	// be safely logged.
	WrappingAccessor *string `pulumi:"wrappingAccessor"`
	// The token used to retrieve a response-wrapped SecretID.
	WrappingToken *string `pulumi:"wrappingToken"`
	// If set, the SecretID response will be
	// [response-wrapped](https://www.vaultproject.io/docs/concepts/response-wrapping)
	// and available for the duration specified. Only a single unwrapping of the
	// token is allowed.
	WrappingTtl *string `pulumi:"wrappingTtl"`
}

type AuthBackendRoleSecretIDState struct {
	// The unique ID for this SecretID that can be safely logged.
	Accessor pulumi.StringPtrInput
	// Unique name of the auth backend to configure.
	Backend pulumi.StringPtrInput
	// If set, specifies blocks of IP addresses which can
	// perform the login operation using this SecretID.
	CidrLists pulumi.StringArrayInput
	// A JSON-encoded string containing metadata in
	// key-value pairs to be set on tokens issued with this SecretID.
	Metadata pulumi.StringPtrInput
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace pulumi.StringPtrInput
	// The name of the role to create the SecretID for.
	RoleName pulumi.StringPtrInput
	// The SecretID to be created. If set, uses "Push"
	// mode.  Defaults to Vault auto-generating SecretIDs.
	SecretId pulumi.StringPtrInput
	// Set to `true` to use the wrapped secret-id accessor as the resource ID.
	// If `false` (default value), a fresh secret ID will be regenerated whenever the wrapping token is expired or
	// invalidated through unwrapping.
	WithWrappedAccessor pulumi.BoolPtrInput
	// The unique ID for the response-wrapped SecretID that can
	// be safely logged.
	WrappingAccessor pulumi.StringPtrInput
	// The token used to retrieve a response-wrapped SecretID.
	WrappingToken pulumi.StringPtrInput
	// If set, the SecretID response will be
	// [response-wrapped](https://www.vaultproject.io/docs/concepts/response-wrapping)
	// and available for the duration specified. Only a single unwrapping of the
	// token is allowed.
	WrappingTtl pulumi.StringPtrInput
}

func (AuthBackendRoleSecretIDState) ElementType() reflect.Type {
	return reflect.TypeOf((*authBackendRoleSecretIDState)(nil)).Elem()
}

type authBackendRoleSecretIDArgs struct {
	// Unique name of the auth backend to configure.
	Backend *string `pulumi:"backend"`
	// If set, specifies blocks of IP addresses which can
	// perform the login operation using this SecretID.
	CidrLists []string `pulumi:"cidrLists"`
	// A JSON-encoded string containing metadata in
	// key-value pairs to be set on tokens issued with this SecretID.
	Metadata *string `pulumi:"metadata"`
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace *string `pulumi:"namespace"`
	// The name of the role to create the SecretID for.
	RoleName string `pulumi:"roleName"`
	// The SecretID to be created. If set, uses "Push"
	// mode.  Defaults to Vault auto-generating SecretIDs.
	SecretId *string `pulumi:"secretId"`
	// Set to `true` to use the wrapped secret-id accessor as the resource ID.
	// If `false` (default value), a fresh secret ID will be regenerated whenever the wrapping token is expired or
	// invalidated through unwrapping.
	WithWrappedAccessor *bool `pulumi:"withWrappedAccessor"`
	// If set, the SecretID response will be
	// [response-wrapped](https://www.vaultproject.io/docs/concepts/response-wrapping)
	// and available for the duration specified. Only a single unwrapping of the
	// token is allowed.
	WrappingTtl *string `pulumi:"wrappingTtl"`
}

// The set of arguments for constructing a AuthBackendRoleSecretID resource.
type AuthBackendRoleSecretIDArgs struct {
	// Unique name of the auth backend to configure.
	Backend pulumi.StringPtrInput
	// If set, specifies blocks of IP addresses which can
	// perform the login operation using this SecretID.
	CidrLists pulumi.StringArrayInput
	// A JSON-encoded string containing metadata in
	// key-value pairs to be set on tokens issued with this SecretID.
	Metadata pulumi.StringPtrInput
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace pulumi.StringPtrInput
	// The name of the role to create the SecretID for.
	RoleName pulumi.StringInput
	// The SecretID to be created. If set, uses "Push"
	// mode.  Defaults to Vault auto-generating SecretIDs.
	SecretId pulumi.StringPtrInput
	// Set to `true` to use the wrapped secret-id accessor as the resource ID.
	// If `false` (default value), a fresh secret ID will be regenerated whenever the wrapping token is expired or
	// invalidated through unwrapping.
	WithWrappedAccessor pulumi.BoolPtrInput
	// If set, the SecretID response will be
	// [response-wrapped](https://www.vaultproject.io/docs/concepts/response-wrapping)
	// and available for the duration specified. Only a single unwrapping of the
	// token is allowed.
	WrappingTtl pulumi.StringPtrInput
}

func (AuthBackendRoleSecretIDArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authBackendRoleSecretIDArgs)(nil)).Elem()
}

type AuthBackendRoleSecretIDInput interface {
	pulumi.Input

	ToAuthBackendRoleSecretIDOutput() AuthBackendRoleSecretIDOutput
	ToAuthBackendRoleSecretIDOutputWithContext(ctx context.Context) AuthBackendRoleSecretIDOutput
}

func (*AuthBackendRoleSecretID) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthBackendRoleSecretID)(nil)).Elem()
}

func (i *AuthBackendRoleSecretID) ToAuthBackendRoleSecretIDOutput() AuthBackendRoleSecretIDOutput {
	return i.ToAuthBackendRoleSecretIDOutputWithContext(context.Background())
}

func (i *AuthBackendRoleSecretID) ToAuthBackendRoleSecretIDOutputWithContext(ctx context.Context) AuthBackendRoleSecretIDOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendRoleSecretIDOutput)
}

// AuthBackendRoleSecretIDArrayInput is an input type that accepts AuthBackendRoleSecretIDArray and AuthBackendRoleSecretIDArrayOutput values.
// You can construct a concrete instance of `AuthBackendRoleSecretIDArrayInput` via:
//
//	AuthBackendRoleSecretIDArray{ AuthBackendRoleSecretIDArgs{...} }
type AuthBackendRoleSecretIDArrayInput interface {
	pulumi.Input

	ToAuthBackendRoleSecretIDArrayOutput() AuthBackendRoleSecretIDArrayOutput
	ToAuthBackendRoleSecretIDArrayOutputWithContext(context.Context) AuthBackendRoleSecretIDArrayOutput
}

type AuthBackendRoleSecretIDArray []AuthBackendRoleSecretIDInput

func (AuthBackendRoleSecretIDArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthBackendRoleSecretID)(nil)).Elem()
}

func (i AuthBackendRoleSecretIDArray) ToAuthBackendRoleSecretIDArrayOutput() AuthBackendRoleSecretIDArrayOutput {
	return i.ToAuthBackendRoleSecretIDArrayOutputWithContext(context.Background())
}

func (i AuthBackendRoleSecretIDArray) ToAuthBackendRoleSecretIDArrayOutputWithContext(ctx context.Context) AuthBackendRoleSecretIDArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendRoleSecretIDArrayOutput)
}

// AuthBackendRoleSecretIDMapInput is an input type that accepts AuthBackendRoleSecretIDMap and AuthBackendRoleSecretIDMapOutput values.
// You can construct a concrete instance of `AuthBackendRoleSecretIDMapInput` via:
//
//	AuthBackendRoleSecretIDMap{ "key": AuthBackendRoleSecretIDArgs{...} }
type AuthBackendRoleSecretIDMapInput interface {
	pulumi.Input

	ToAuthBackendRoleSecretIDMapOutput() AuthBackendRoleSecretIDMapOutput
	ToAuthBackendRoleSecretIDMapOutputWithContext(context.Context) AuthBackendRoleSecretIDMapOutput
}

type AuthBackendRoleSecretIDMap map[string]AuthBackendRoleSecretIDInput

func (AuthBackendRoleSecretIDMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthBackendRoleSecretID)(nil)).Elem()
}

func (i AuthBackendRoleSecretIDMap) ToAuthBackendRoleSecretIDMapOutput() AuthBackendRoleSecretIDMapOutput {
	return i.ToAuthBackendRoleSecretIDMapOutputWithContext(context.Background())
}

func (i AuthBackendRoleSecretIDMap) ToAuthBackendRoleSecretIDMapOutputWithContext(ctx context.Context) AuthBackendRoleSecretIDMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendRoleSecretIDMapOutput)
}

type AuthBackendRoleSecretIDOutput struct{ *pulumi.OutputState }

func (AuthBackendRoleSecretIDOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthBackendRoleSecretID)(nil)).Elem()
}

func (o AuthBackendRoleSecretIDOutput) ToAuthBackendRoleSecretIDOutput() AuthBackendRoleSecretIDOutput {
	return o
}

func (o AuthBackendRoleSecretIDOutput) ToAuthBackendRoleSecretIDOutputWithContext(ctx context.Context) AuthBackendRoleSecretIDOutput {
	return o
}

// The unique ID for this SecretID that can be safely logged.
func (o AuthBackendRoleSecretIDOutput) Accessor() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthBackendRoleSecretID) pulumi.StringOutput { return v.Accessor }).(pulumi.StringOutput)
}

// Unique name of the auth backend to configure.
func (o AuthBackendRoleSecretIDOutput) Backend() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendRoleSecretID) pulumi.StringPtrOutput { return v.Backend }).(pulumi.StringPtrOutput)
}

// If set, specifies blocks of IP addresses which can
// perform the login operation using this SecretID.
func (o AuthBackendRoleSecretIDOutput) CidrLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthBackendRoleSecretID) pulumi.StringArrayOutput { return v.CidrLists }).(pulumi.StringArrayOutput)
}

// A JSON-encoded string containing metadata in
// key-value pairs to be set on tokens issued with this SecretID.
func (o AuthBackendRoleSecretIDOutput) Metadata() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendRoleSecretID) pulumi.StringPtrOutput { return v.Metadata }).(pulumi.StringPtrOutput)
}

// The namespace to provision the resource in.
// The value should not contain leading or trailing forward slashes.
// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
// *Available only for Vault Enterprise*.
func (o AuthBackendRoleSecretIDOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendRoleSecretID) pulumi.StringPtrOutput { return v.Namespace }).(pulumi.StringPtrOutput)
}

// The name of the role to create the SecretID for.
func (o AuthBackendRoleSecretIDOutput) RoleName() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthBackendRoleSecretID) pulumi.StringOutput { return v.RoleName }).(pulumi.StringOutput)
}

// The SecretID to be created. If set, uses "Push"
// mode.  Defaults to Vault auto-generating SecretIDs.
func (o AuthBackendRoleSecretIDOutput) SecretId() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthBackendRoleSecretID) pulumi.StringOutput { return v.SecretId }).(pulumi.StringOutput)
}

// Set to `true` to use the wrapped secret-id accessor as the resource ID.
// If `false` (default value), a fresh secret ID will be regenerated whenever the wrapping token is expired or
// invalidated through unwrapping.
func (o AuthBackendRoleSecretIDOutput) WithWrappedAccessor() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AuthBackendRoleSecretID) pulumi.BoolPtrOutput { return v.WithWrappedAccessor }).(pulumi.BoolPtrOutput)
}

// The unique ID for the response-wrapped SecretID that can
// be safely logged.
func (o AuthBackendRoleSecretIDOutput) WrappingAccessor() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthBackendRoleSecretID) pulumi.StringOutput { return v.WrappingAccessor }).(pulumi.StringOutput)
}

// The token used to retrieve a response-wrapped SecretID.
func (o AuthBackendRoleSecretIDOutput) WrappingToken() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthBackendRoleSecretID) pulumi.StringOutput { return v.WrappingToken }).(pulumi.StringOutput)
}

// If set, the SecretID response will be
// [response-wrapped](https://www.vaultproject.io/docs/concepts/response-wrapping)
// and available for the duration specified. Only a single unwrapping of the
// token is allowed.
func (o AuthBackendRoleSecretIDOutput) WrappingTtl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendRoleSecretID) pulumi.StringPtrOutput { return v.WrappingTtl }).(pulumi.StringPtrOutput)
}

type AuthBackendRoleSecretIDArrayOutput struct{ *pulumi.OutputState }

func (AuthBackendRoleSecretIDArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthBackendRoleSecretID)(nil)).Elem()
}

func (o AuthBackendRoleSecretIDArrayOutput) ToAuthBackendRoleSecretIDArrayOutput() AuthBackendRoleSecretIDArrayOutput {
	return o
}

func (o AuthBackendRoleSecretIDArrayOutput) ToAuthBackendRoleSecretIDArrayOutputWithContext(ctx context.Context) AuthBackendRoleSecretIDArrayOutput {
	return o
}

func (o AuthBackendRoleSecretIDArrayOutput) Index(i pulumi.IntInput) AuthBackendRoleSecretIDOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthBackendRoleSecretID {
		return vs[0].([]*AuthBackendRoleSecretID)[vs[1].(int)]
	}).(AuthBackendRoleSecretIDOutput)
}

type AuthBackendRoleSecretIDMapOutput struct{ *pulumi.OutputState }

func (AuthBackendRoleSecretIDMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthBackendRoleSecretID)(nil)).Elem()
}

func (o AuthBackendRoleSecretIDMapOutput) ToAuthBackendRoleSecretIDMapOutput() AuthBackendRoleSecretIDMapOutput {
	return o
}

func (o AuthBackendRoleSecretIDMapOutput) ToAuthBackendRoleSecretIDMapOutputWithContext(ctx context.Context) AuthBackendRoleSecretIDMapOutput {
	return o
}

func (o AuthBackendRoleSecretIDMapOutput) MapIndex(k pulumi.StringInput) AuthBackendRoleSecretIDOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthBackendRoleSecretID {
		return vs[0].(map[string]*AuthBackendRoleSecretID)[vs[1].(string)]
	}).(AuthBackendRoleSecretIDOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendRoleSecretIDInput)(nil)).Elem(), &AuthBackendRoleSecretID{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendRoleSecretIDArrayInput)(nil)).Elem(), AuthBackendRoleSecretIDArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendRoleSecretIDMapInput)(nil)).Elem(), AuthBackendRoleSecretIDMap{})
	pulumi.RegisterOutputType(AuthBackendRoleSecretIDOutput{})
	pulumi.RegisterOutputType(AuthBackendRoleSecretIDArrayOutput{})
	pulumi.RegisterOutputType(AuthBackendRoleSecretIDMapOutput{})
}
