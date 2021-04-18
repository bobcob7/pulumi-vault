// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package tokenauth

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages Token auth backend role in a Vault server. See the [Vault
// documentation](https://www.vaultproject.io/docs/auth/token.html) for more
// information.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-vault/sdk/v4/go/vault/tokenauth"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := tokenauth.NewAuthBackendRole(ctx, "example", &tokenauth.AuthBackendRoleArgs{
// 			AllowedPolicies: pulumi.StringArray{
// 				pulumi.String("dev"),
// 				pulumi.String("test"),
// 			},
// 			DisallowedPolicies: pulumi.StringArray{
// 				pulumi.String("default"),
// 			},
// 			ExplicitMaxTtl: pulumi.String("115200"),
// 			Orphan:         pulumi.Bool(true),
// 			PathSuffix:     pulumi.String("path-suffix"),
// 			Period:         pulumi.String("86400"),
// 			Renewable:      pulumi.Bool(true),
// 			RoleName:       pulumi.String("my-role"),
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
// Token auth backend roles can be imported with `auth/token/roles/` followed by the `role_name`, e.g.
//
// ```sh
//  $ pulumi import vault:tokenauth/authBackendRole:AuthBackendRole example auth/token/roles/my-role
// ```
type AuthBackendRole struct {
	pulumi.CustomResourceState

	// List of allowed policies for given role.
	AllowedPolicies pulumi.StringArrayOutput `pulumi:"allowedPolicies"`
	// If set, a list of
	// CIDRs valid as the source address for login requests. This value is also encoded into any resulting token.
	//
	// Deprecated: use `token_bound_cidrs` instead if you are running Vault >= 1.2
	BoundCidrs pulumi.StringArrayOutput `pulumi:"boundCidrs"`
	// List of disallowed policies for given role.
	DisallowedPolicies pulumi.StringArrayOutput `pulumi:"disallowedPolicies"`
	// If set, the
	// token will have an explicit max TTL set upon it.
	//
	// Deprecated: use `token_explicit_max_ttl` instead if you are running Vault >= 1.2
	ExplicitMaxTtl pulumi.StringPtrOutput `pulumi:"explicitMaxTtl"`
	// If true, tokens created against this policy will be orphan tokens.
	Orphan pulumi.BoolPtrOutput `pulumi:"orphan"`
	// Tokens created against this role will have the given suffix as part of their path in addition to the role name.
	PathSuffix pulumi.StringPtrOutput `pulumi:"pathSuffix"`
	// If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	//
	// Deprecated: use `token_period` instead if you are running Vault >= 1.2
	Period pulumi.StringPtrOutput `pulumi:"period"`
	// Wether to disable the ability of the token to be renewed past its initial TTL.
	Renewable pulumi.BoolPtrOutput `pulumi:"renewable"`
	// The name of the role.
	RoleName pulumi.StringOutput `pulumi:"roleName"`
	// List of CIDR blocks; if set, specifies blocks of IP
	// addresses which can authenticate successfully, and ties the resulting token to these blocks
	// as well.
	TokenBoundCidrs pulumi.StringArrayOutput `pulumi:"tokenBoundCidrs"`
	// If set, will encode an
	// [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
	// onto the token in number of seconds. This is a hard cap even if `tokenTtl` and
	// `tokenMaxTtl` would otherwise allow a renewal.
	TokenExplicitMaxTtl pulumi.IntPtrOutput `pulumi:"tokenExplicitMaxTtl"`
	// The maximum lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenMaxTtl pulumi.IntPtrOutput `pulumi:"tokenMaxTtl"`
	// If set, the default policy will not be set on
	// generated tokens; otherwise it will be added to the policies set in token_policies.
	TokenNoDefaultPolicy pulumi.BoolPtrOutput `pulumi:"tokenNoDefaultPolicy"`
	// The
	// [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
	// if any, in number of seconds to set on the token.
	TokenNumUses pulumi.IntPtrOutput `pulumi:"tokenNumUses"`
	// If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	TokenPeriod pulumi.IntPtrOutput `pulumi:"tokenPeriod"`
	// Generated Token's Policies
	TokenPolicies pulumi.StringArrayOutput `pulumi:"tokenPolicies"`
	// The incremental lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenTtl pulumi.IntPtrOutput `pulumi:"tokenTtl"`
	// The type of token that should be generated. Can be `service`,
	// `batch`, or `default` to use the mount's tuned default (which unless changed will be
	// `service` tokens). For token store roles, there are two additional possibilities:
	// `default-service` and `default-batch` which specify the type to return unless the client
	// requests a different type at generation time.
	TokenType pulumi.StringPtrOutput `pulumi:"tokenType"`
}

// NewAuthBackendRole registers a new resource with the given unique name, arguments, and options.
func NewAuthBackendRole(ctx *pulumi.Context,
	name string, args *AuthBackendRoleArgs, opts ...pulumi.ResourceOption) (*AuthBackendRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RoleName == nil {
		return nil, errors.New("invalid value for required argument 'RoleName'")
	}
	var resource AuthBackendRole
	err := ctx.RegisterResource("vault:tokenauth/authBackendRole:AuthBackendRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthBackendRole gets an existing AuthBackendRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthBackendRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthBackendRoleState, opts ...pulumi.ResourceOption) (*AuthBackendRole, error) {
	var resource AuthBackendRole
	err := ctx.ReadResource("vault:tokenauth/authBackendRole:AuthBackendRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthBackendRole resources.
type authBackendRoleState struct {
	// List of allowed policies for given role.
	AllowedPolicies []string `pulumi:"allowedPolicies"`
	// If set, a list of
	// CIDRs valid as the source address for login requests. This value is also encoded into any resulting token.
	//
	// Deprecated: use `token_bound_cidrs` instead if you are running Vault >= 1.2
	BoundCidrs []string `pulumi:"boundCidrs"`
	// List of disallowed policies for given role.
	DisallowedPolicies []string `pulumi:"disallowedPolicies"`
	// If set, the
	// token will have an explicit max TTL set upon it.
	//
	// Deprecated: use `token_explicit_max_ttl` instead if you are running Vault >= 1.2
	ExplicitMaxTtl *string `pulumi:"explicitMaxTtl"`
	// If true, tokens created against this policy will be orphan tokens.
	Orphan *bool `pulumi:"orphan"`
	// Tokens created against this role will have the given suffix as part of their path in addition to the role name.
	PathSuffix *string `pulumi:"pathSuffix"`
	// If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	//
	// Deprecated: use `token_period` instead if you are running Vault >= 1.2
	Period *string `pulumi:"period"`
	// Wether to disable the ability of the token to be renewed past its initial TTL.
	Renewable *bool `pulumi:"renewable"`
	// The name of the role.
	RoleName *string `pulumi:"roleName"`
	// List of CIDR blocks; if set, specifies blocks of IP
	// addresses which can authenticate successfully, and ties the resulting token to these blocks
	// as well.
	TokenBoundCidrs []string `pulumi:"tokenBoundCidrs"`
	// If set, will encode an
	// [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
	// onto the token in number of seconds. This is a hard cap even if `tokenTtl` and
	// `tokenMaxTtl` would otherwise allow a renewal.
	TokenExplicitMaxTtl *int `pulumi:"tokenExplicitMaxTtl"`
	// The maximum lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenMaxTtl *int `pulumi:"tokenMaxTtl"`
	// If set, the default policy will not be set on
	// generated tokens; otherwise it will be added to the policies set in token_policies.
	TokenNoDefaultPolicy *bool `pulumi:"tokenNoDefaultPolicy"`
	// The
	// [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
	// if any, in number of seconds to set on the token.
	TokenNumUses *int `pulumi:"tokenNumUses"`
	// If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	TokenPeriod *int `pulumi:"tokenPeriod"`
	// Generated Token's Policies
	TokenPolicies []string `pulumi:"tokenPolicies"`
	// The incremental lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenTtl *int `pulumi:"tokenTtl"`
	// The type of token that should be generated. Can be `service`,
	// `batch`, or `default` to use the mount's tuned default (which unless changed will be
	// `service` tokens). For token store roles, there are two additional possibilities:
	// `default-service` and `default-batch` which specify the type to return unless the client
	// requests a different type at generation time.
	TokenType *string `pulumi:"tokenType"`
}

type AuthBackendRoleState struct {
	// List of allowed policies for given role.
	AllowedPolicies pulumi.StringArrayInput
	// If set, a list of
	// CIDRs valid as the source address for login requests. This value is also encoded into any resulting token.
	//
	// Deprecated: use `token_bound_cidrs` instead if you are running Vault >= 1.2
	BoundCidrs pulumi.StringArrayInput
	// List of disallowed policies for given role.
	DisallowedPolicies pulumi.StringArrayInput
	// If set, the
	// token will have an explicit max TTL set upon it.
	//
	// Deprecated: use `token_explicit_max_ttl` instead if you are running Vault >= 1.2
	ExplicitMaxTtl pulumi.StringPtrInput
	// If true, tokens created against this policy will be orphan tokens.
	Orphan pulumi.BoolPtrInput
	// Tokens created against this role will have the given suffix as part of their path in addition to the role name.
	PathSuffix pulumi.StringPtrInput
	// If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	//
	// Deprecated: use `token_period` instead if you are running Vault >= 1.2
	Period pulumi.StringPtrInput
	// Wether to disable the ability of the token to be renewed past its initial TTL.
	Renewable pulumi.BoolPtrInput
	// The name of the role.
	RoleName pulumi.StringPtrInput
	// List of CIDR blocks; if set, specifies blocks of IP
	// addresses which can authenticate successfully, and ties the resulting token to these blocks
	// as well.
	TokenBoundCidrs pulumi.StringArrayInput
	// If set, will encode an
	// [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
	// onto the token in number of seconds. This is a hard cap even if `tokenTtl` and
	// `tokenMaxTtl` would otherwise allow a renewal.
	TokenExplicitMaxTtl pulumi.IntPtrInput
	// The maximum lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenMaxTtl pulumi.IntPtrInput
	// If set, the default policy will not be set on
	// generated tokens; otherwise it will be added to the policies set in token_policies.
	TokenNoDefaultPolicy pulumi.BoolPtrInput
	// The
	// [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
	// if any, in number of seconds to set on the token.
	TokenNumUses pulumi.IntPtrInput
	// If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	TokenPeriod pulumi.IntPtrInput
	// Generated Token's Policies
	TokenPolicies pulumi.StringArrayInput
	// The incremental lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenTtl pulumi.IntPtrInput
	// The type of token that should be generated. Can be `service`,
	// `batch`, or `default` to use the mount's tuned default (which unless changed will be
	// `service` tokens). For token store roles, there are two additional possibilities:
	// `default-service` and `default-batch` which specify the type to return unless the client
	// requests a different type at generation time.
	TokenType pulumi.StringPtrInput
}

func (AuthBackendRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*authBackendRoleState)(nil)).Elem()
}

type authBackendRoleArgs struct {
	// List of allowed policies for given role.
	AllowedPolicies []string `pulumi:"allowedPolicies"`
	// If set, a list of
	// CIDRs valid as the source address for login requests. This value is also encoded into any resulting token.
	//
	// Deprecated: use `token_bound_cidrs` instead if you are running Vault >= 1.2
	BoundCidrs []string `pulumi:"boundCidrs"`
	// List of disallowed policies for given role.
	DisallowedPolicies []string `pulumi:"disallowedPolicies"`
	// If set, the
	// token will have an explicit max TTL set upon it.
	//
	// Deprecated: use `token_explicit_max_ttl` instead if you are running Vault >= 1.2
	ExplicitMaxTtl *string `pulumi:"explicitMaxTtl"`
	// If true, tokens created against this policy will be orphan tokens.
	Orphan *bool `pulumi:"orphan"`
	// Tokens created against this role will have the given suffix as part of their path in addition to the role name.
	PathSuffix *string `pulumi:"pathSuffix"`
	// If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	//
	// Deprecated: use `token_period` instead if you are running Vault >= 1.2
	Period *string `pulumi:"period"`
	// Wether to disable the ability of the token to be renewed past its initial TTL.
	Renewable *bool `pulumi:"renewable"`
	// The name of the role.
	RoleName string `pulumi:"roleName"`
	// List of CIDR blocks; if set, specifies blocks of IP
	// addresses which can authenticate successfully, and ties the resulting token to these blocks
	// as well.
	TokenBoundCidrs []string `pulumi:"tokenBoundCidrs"`
	// If set, will encode an
	// [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
	// onto the token in number of seconds. This is a hard cap even if `tokenTtl` and
	// `tokenMaxTtl` would otherwise allow a renewal.
	TokenExplicitMaxTtl *int `pulumi:"tokenExplicitMaxTtl"`
	// The maximum lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenMaxTtl *int `pulumi:"tokenMaxTtl"`
	// If set, the default policy will not be set on
	// generated tokens; otherwise it will be added to the policies set in token_policies.
	TokenNoDefaultPolicy *bool `pulumi:"tokenNoDefaultPolicy"`
	// The
	// [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
	// if any, in number of seconds to set on the token.
	TokenNumUses *int `pulumi:"tokenNumUses"`
	// If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	TokenPeriod *int `pulumi:"tokenPeriod"`
	// Generated Token's Policies
	TokenPolicies []string `pulumi:"tokenPolicies"`
	// The incremental lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenTtl *int `pulumi:"tokenTtl"`
	// The type of token that should be generated. Can be `service`,
	// `batch`, or `default` to use the mount's tuned default (which unless changed will be
	// `service` tokens). For token store roles, there are two additional possibilities:
	// `default-service` and `default-batch` which specify the type to return unless the client
	// requests a different type at generation time.
	TokenType *string `pulumi:"tokenType"`
}

// The set of arguments for constructing a AuthBackendRole resource.
type AuthBackendRoleArgs struct {
	// List of allowed policies for given role.
	AllowedPolicies pulumi.StringArrayInput
	// If set, a list of
	// CIDRs valid as the source address for login requests. This value is also encoded into any resulting token.
	//
	// Deprecated: use `token_bound_cidrs` instead if you are running Vault >= 1.2
	BoundCidrs pulumi.StringArrayInput
	// List of disallowed policies for given role.
	DisallowedPolicies pulumi.StringArrayInput
	// If set, the
	// token will have an explicit max TTL set upon it.
	//
	// Deprecated: use `token_explicit_max_ttl` instead if you are running Vault >= 1.2
	ExplicitMaxTtl pulumi.StringPtrInput
	// If true, tokens created against this policy will be orphan tokens.
	Orphan pulumi.BoolPtrInput
	// Tokens created against this role will have the given suffix as part of their path in addition to the role name.
	PathSuffix pulumi.StringPtrInput
	// If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	//
	// Deprecated: use `token_period` instead if you are running Vault >= 1.2
	Period pulumi.StringPtrInput
	// Wether to disable the ability of the token to be renewed past its initial TTL.
	Renewable pulumi.BoolPtrInput
	// The name of the role.
	RoleName pulumi.StringInput
	// List of CIDR blocks; if set, specifies blocks of IP
	// addresses which can authenticate successfully, and ties the resulting token to these blocks
	// as well.
	TokenBoundCidrs pulumi.StringArrayInput
	// If set, will encode an
	// [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
	// onto the token in number of seconds. This is a hard cap even if `tokenTtl` and
	// `tokenMaxTtl` would otherwise allow a renewal.
	TokenExplicitMaxTtl pulumi.IntPtrInput
	// The maximum lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenMaxTtl pulumi.IntPtrInput
	// If set, the default policy will not be set on
	// generated tokens; otherwise it will be added to the policies set in token_policies.
	TokenNoDefaultPolicy pulumi.BoolPtrInput
	// The
	// [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
	// if any, in number of seconds to set on the token.
	TokenNumUses pulumi.IntPtrInput
	// If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	TokenPeriod pulumi.IntPtrInput
	// Generated Token's Policies
	TokenPolicies pulumi.StringArrayInput
	// The incremental lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenTtl pulumi.IntPtrInput
	// The type of token that should be generated. Can be `service`,
	// `batch`, or `default` to use the mount's tuned default (which unless changed will be
	// `service` tokens). For token store roles, there are two additional possibilities:
	// `default-service` and `default-batch` which specify the type to return unless the client
	// requests a different type at generation time.
	TokenType pulumi.StringPtrInput
}

func (AuthBackendRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authBackendRoleArgs)(nil)).Elem()
}

type AuthBackendRoleInput interface {
	pulumi.Input

	ToAuthBackendRoleOutput() AuthBackendRoleOutput
	ToAuthBackendRoleOutputWithContext(ctx context.Context) AuthBackendRoleOutput
}

func (*AuthBackendRole) ElementType() reflect.Type {
	return reflect.TypeOf((*AuthBackendRole)(nil))
}

func (i *AuthBackendRole) ToAuthBackendRoleOutput() AuthBackendRoleOutput {
	return i.ToAuthBackendRoleOutputWithContext(context.Background())
}

func (i *AuthBackendRole) ToAuthBackendRoleOutputWithContext(ctx context.Context) AuthBackendRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendRoleOutput)
}

func (i *AuthBackendRole) ToAuthBackendRolePtrOutput() AuthBackendRolePtrOutput {
	return i.ToAuthBackendRolePtrOutputWithContext(context.Background())
}

func (i *AuthBackendRole) ToAuthBackendRolePtrOutputWithContext(ctx context.Context) AuthBackendRolePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendRolePtrOutput)
}

type AuthBackendRolePtrInput interface {
	pulumi.Input

	ToAuthBackendRolePtrOutput() AuthBackendRolePtrOutput
	ToAuthBackendRolePtrOutputWithContext(ctx context.Context) AuthBackendRolePtrOutput
}

type authBackendRolePtrType AuthBackendRoleArgs

func (*authBackendRolePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthBackendRole)(nil))
}

func (i *authBackendRolePtrType) ToAuthBackendRolePtrOutput() AuthBackendRolePtrOutput {
	return i.ToAuthBackendRolePtrOutputWithContext(context.Background())
}

func (i *authBackendRolePtrType) ToAuthBackendRolePtrOutputWithContext(ctx context.Context) AuthBackendRolePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendRolePtrOutput)
}

// AuthBackendRoleArrayInput is an input type that accepts AuthBackendRoleArray and AuthBackendRoleArrayOutput values.
// You can construct a concrete instance of `AuthBackendRoleArrayInput` via:
//
//          AuthBackendRoleArray{ AuthBackendRoleArgs{...} }
type AuthBackendRoleArrayInput interface {
	pulumi.Input

	ToAuthBackendRoleArrayOutput() AuthBackendRoleArrayOutput
	ToAuthBackendRoleArrayOutputWithContext(context.Context) AuthBackendRoleArrayOutput
}

type AuthBackendRoleArray []AuthBackendRoleInput

func (AuthBackendRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*AuthBackendRole)(nil))
}

func (i AuthBackendRoleArray) ToAuthBackendRoleArrayOutput() AuthBackendRoleArrayOutput {
	return i.ToAuthBackendRoleArrayOutputWithContext(context.Background())
}

func (i AuthBackendRoleArray) ToAuthBackendRoleArrayOutputWithContext(ctx context.Context) AuthBackendRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendRoleArrayOutput)
}

// AuthBackendRoleMapInput is an input type that accepts AuthBackendRoleMap and AuthBackendRoleMapOutput values.
// You can construct a concrete instance of `AuthBackendRoleMapInput` via:
//
//          AuthBackendRoleMap{ "key": AuthBackendRoleArgs{...} }
type AuthBackendRoleMapInput interface {
	pulumi.Input

	ToAuthBackendRoleMapOutput() AuthBackendRoleMapOutput
	ToAuthBackendRoleMapOutputWithContext(context.Context) AuthBackendRoleMapOutput
}

type AuthBackendRoleMap map[string]AuthBackendRoleInput

func (AuthBackendRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*AuthBackendRole)(nil))
}

func (i AuthBackendRoleMap) ToAuthBackendRoleMapOutput() AuthBackendRoleMapOutput {
	return i.ToAuthBackendRoleMapOutputWithContext(context.Background())
}

func (i AuthBackendRoleMap) ToAuthBackendRoleMapOutputWithContext(ctx context.Context) AuthBackendRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendRoleMapOutput)
}

type AuthBackendRoleOutput struct {
	*pulumi.OutputState
}

func (AuthBackendRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AuthBackendRole)(nil))
}

func (o AuthBackendRoleOutput) ToAuthBackendRoleOutput() AuthBackendRoleOutput {
	return o
}

func (o AuthBackendRoleOutput) ToAuthBackendRoleOutputWithContext(ctx context.Context) AuthBackendRoleOutput {
	return o
}

func (o AuthBackendRoleOutput) ToAuthBackendRolePtrOutput() AuthBackendRolePtrOutput {
	return o.ToAuthBackendRolePtrOutputWithContext(context.Background())
}

func (o AuthBackendRoleOutput) ToAuthBackendRolePtrOutputWithContext(ctx context.Context) AuthBackendRolePtrOutput {
	return o.ApplyT(func(v AuthBackendRole) *AuthBackendRole {
		return &v
	}).(AuthBackendRolePtrOutput)
}

type AuthBackendRolePtrOutput struct {
	*pulumi.OutputState
}

func (AuthBackendRolePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthBackendRole)(nil))
}

func (o AuthBackendRolePtrOutput) ToAuthBackendRolePtrOutput() AuthBackendRolePtrOutput {
	return o
}

func (o AuthBackendRolePtrOutput) ToAuthBackendRolePtrOutputWithContext(ctx context.Context) AuthBackendRolePtrOutput {
	return o
}

type AuthBackendRoleArrayOutput struct{ *pulumi.OutputState }

func (AuthBackendRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AuthBackendRole)(nil))
}

func (o AuthBackendRoleArrayOutput) ToAuthBackendRoleArrayOutput() AuthBackendRoleArrayOutput {
	return o
}

func (o AuthBackendRoleArrayOutput) ToAuthBackendRoleArrayOutputWithContext(ctx context.Context) AuthBackendRoleArrayOutput {
	return o
}

func (o AuthBackendRoleArrayOutput) Index(i pulumi.IntInput) AuthBackendRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AuthBackendRole {
		return vs[0].([]AuthBackendRole)[vs[1].(int)]
	}).(AuthBackendRoleOutput)
}

type AuthBackendRoleMapOutput struct{ *pulumi.OutputState }

func (AuthBackendRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AuthBackendRole)(nil))
}

func (o AuthBackendRoleMapOutput) ToAuthBackendRoleMapOutput() AuthBackendRoleMapOutput {
	return o
}

func (o AuthBackendRoleMapOutput) ToAuthBackendRoleMapOutputWithContext(ctx context.Context) AuthBackendRoleMapOutput {
	return o
}

func (o AuthBackendRoleMapOutput) MapIndex(k pulumi.StringInput) AuthBackendRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AuthBackendRole {
		return vs[0].(map[string]AuthBackendRole)[vs[1].(string)]
	}).(AuthBackendRoleOutput)
}

func init() {
	pulumi.RegisterOutputType(AuthBackendRoleOutput{})
	pulumi.RegisterOutputType(AuthBackendRolePtrOutput{})
	pulumi.RegisterOutputType(AuthBackendRoleArrayOutput{})
	pulumi.RegisterOutputType(AuthBackendRoleMapOutput{})
}
