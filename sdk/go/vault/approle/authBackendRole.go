// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package approle

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages an AppRole auth backend role in a Vault server. See the [Vault
// documentation](https://www.vaultproject.io/docs/auth/approle) for more
// information.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-vault/sdk/v3/go/vault/"
// 	"github.com/pulumi/pulumi-vault/sdk/v3/go/vault/appRole"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		approle, err := vault.NewAuthBackend(ctx, "approle", &vault.AuthBackendArgs{
// 			Type: pulumi.String("approle"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = appRole.NewAuthBackendRole(ctx, "example", &appRole.AuthBackendRoleArgs{
// 			Backend:  approle.Path,
// 			RoleName: pulumi.String("test-role"),
// 			TokenPolicies: pulumi.StringArray{
// 				pulumi.String("default"),
// 				pulumi.String("dev"),
// 				pulumi.String("prod"),
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
// AppRole authentication backend roles can be imported using the `path`, e.g.
//
// ```sh
//  $ pulumi import vault:appRole/authBackendRole:AuthBackendRole example auth/approle/role/test-role
// ```
type AuthBackendRole struct {
	pulumi.CustomResourceState

	// The unique name of the auth backend to configure.
	// Defaults to `approle`.
	Backend pulumi.StringPtrOutput `pulumi:"backend"`
	// Whether or not to require `secretId` to be
	// presented when logging in using this AppRole. Defaults to `true`.
	BindSecretId pulumi.BoolPtrOutput `pulumi:"bindSecretId"`
	// If set,
	// specifies blocks of IP addresses which can perform the login operation.
	//
	// Deprecated: use `secret_id_bound_cidrs` instead
	BoundCidrLists pulumi.StringArrayOutput `pulumi:"boundCidrLists"`
	// If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	//
	// Deprecated: use `token_period` instead if you are running Vault >= 1.2
	Period pulumi.IntPtrOutput `pulumi:"period"`
	// An array of strings
	// specifying the policies to be set on tokens issued using this role.
	//
	// Deprecated: use `token_policies` instead if you are running Vault >= 1.2
	Policies pulumi.StringArrayOutput `pulumi:"policies"`
	// The RoleID of this role. If not specified, one will be
	// auto-generated.
	RoleId pulumi.StringOutput `pulumi:"roleId"`
	// The name of the role.
	RoleName pulumi.StringOutput `pulumi:"roleName"`
	// If set,
	// specifies blocks of IP addresses which can perform the login operation.
	SecretIdBoundCidrs pulumi.StringArrayOutput `pulumi:"secretIdBoundCidrs"`
	// The number of times any particular SecretID
	// can be used to fetch a token from this AppRole, after which the SecretID will
	// expire. A value of zero will allow unlimited uses.
	SecretIdNumUses pulumi.IntPtrOutput `pulumi:"secretIdNumUses"`
	// The number of seconds after which any SecretID
	// expires.
	SecretIdTtl pulumi.IntPtrOutput `pulumi:"secretIdTtl"`
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
	// List of policies to encode onto generated tokens. Depending
	// on the auth method, this list may be supplemented by user/group/other values.
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
	err := ctx.RegisterResource("vault:appRole/authBackendRole:AuthBackendRole", name, args, &resource, opts...)
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
	err := ctx.ReadResource("vault:appRole/authBackendRole:AuthBackendRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthBackendRole resources.
type authBackendRoleState struct {
	// The unique name of the auth backend to configure.
	// Defaults to `approle`.
	Backend *string `pulumi:"backend"`
	// Whether or not to require `secretId` to be
	// presented when logging in using this AppRole. Defaults to `true`.
	BindSecretId *bool `pulumi:"bindSecretId"`
	// If set,
	// specifies blocks of IP addresses which can perform the login operation.
	//
	// Deprecated: use `secret_id_bound_cidrs` instead
	BoundCidrLists []string `pulumi:"boundCidrLists"`
	// If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	//
	// Deprecated: use `token_period` instead if you are running Vault >= 1.2
	Period *int `pulumi:"period"`
	// An array of strings
	// specifying the policies to be set on tokens issued using this role.
	//
	// Deprecated: use `token_policies` instead if you are running Vault >= 1.2
	Policies []string `pulumi:"policies"`
	// The RoleID of this role. If not specified, one will be
	// auto-generated.
	RoleId *string `pulumi:"roleId"`
	// The name of the role.
	RoleName *string `pulumi:"roleName"`
	// If set,
	// specifies blocks of IP addresses which can perform the login operation.
	SecretIdBoundCidrs []string `pulumi:"secretIdBoundCidrs"`
	// The number of times any particular SecretID
	// can be used to fetch a token from this AppRole, after which the SecretID will
	// expire. A value of zero will allow unlimited uses.
	SecretIdNumUses *int `pulumi:"secretIdNumUses"`
	// The number of seconds after which any SecretID
	// expires.
	SecretIdTtl *int `pulumi:"secretIdTtl"`
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
	// List of policies to encode onto generated tokens. Depending
	// on the auth method, this list may be supplemented by user/group/other values.
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
	// The unique name of the auth backend to configure.
	// Defaults to `approle`.
	Backend pulumi.StringPtrInput
	// Whether or not to require `secretId` to be
	// presented when logging in using this AppRole. Defaults to `true`.
	BindSecretId pulumi.BoolPtrInput
	// If set,
	// specifies blocks of IP addresses which can perform the login operation.
	//
	// Deprecated: use `secret_id_bound_cidrs` instead
	BoundCidrLists pulumi.StringArrayInput
	// If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	//
	// Deprecated: use `token_period` instead if you are running Vault >= 1.2
	Period pulumi.IntPtrInput
	// An array of strings
	// specifying the policies to be set on tokens issued using this role.
	//
	// Deprecated: use `token_policies` instead if you are running Vault >= 1.2
	Policies pulumi.StringArrayInput
	// The RoleID of this role. If not specified, one will be
	// auto-generated.
	RoleId pulumi.StringPtrInput
	// The name of the role.
	RoleName pulumi.StringPtrInput
	// If set,
	// specifies blocks of IP addresses which can perform the login operation.
	SecretIdBoundCidrs pulumi.StringArrayInput
	// The number of times any particular SecretID
	// can be used to fetch a token from this AppRole, after which the SecretID will
	// expire. A value of zero will allow unlimited uses.
	SecretIdNumUses pulumi.IntPtrInput
	// The number of seconds after which any SecretID
	// expires.
	SecretIdTtl pulumi.IntPtrInput
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
	// List of policies to encode onto generated tokens. Depending
	// on the auth method, this list may be supplemented by user/group/other values.
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
	// The unique name of the auth backend to configure.
	// Defaults to `approle`.
	Backend *string `pulumi:"backend"`
	// Whether or not to require `secretId` to be
	// presented when logging in using this AppRole. Defaults to `true`.
	BindSecretId *bool `pulumi:"bindSecretId"`
	// If set,
	// specifies blocks of IP addresses which can perform the login operation.
	//
	// Deprecated: use `secret_id_bound_cidrs` instead
	BoundCidrLists []string `pulumi:"boundCidrLists"`
	// If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	//
	// Deprecated: use `token_period` instead if you are running Vault >= 1.2
	Period *int `pulumi:"period"`
	// An array of strings
	// specifying the policies to be set on tokens issued using this role.
	//
	// Deprecated: use `token_policies` instead if you are running Vault >= 1.2
	Policies []string `pulumi:"policies"`
	// The RoleID of this role. If not specified, one will be
	// auto-generated.
	RoleId *string `pulumi:"roleId"`
	// The name of the role.
	RoleName string `pulumi:"roleName"`
	// If set,
	// specifies blocks of IP addresses which can perform the login operation.
	SecretIdBoundCidrs []string `pulumi:"secretIdBoundCidrs"`
	// The number of times any particular SecretID
	// can be used to fetch a token from this AppRole, after which the SecretID will
	// expire. A value of zero will allow unlimited uses.
	SecretIdNumUses *int `pulumi:"secretIdNumUses"`
	// The number of seconds after which any SecretID
	// expires.
	SecretIdTtl *int `pulumi:"secretIdTtl"`
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
	// List of policies to encode onto generated tokens. Depending
	// on the auth method, this list may be supplemented by user/group/other values.
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
	// The unique name of the auth backend to configure.
	// Defaults to `approle`.
	Backend pulumi.StringPtrInput
	// Whether or not to require `secretId` to be
	// presented when logging in using this AppRole. Defaults to `true`.
	BindSecretId pulumi.BoolPtrInput
	// If set,
	// specifies blocks of IP addresses which can perform the login operation.
	//
	// Deprecated: use `secret_id_bound_cidrs` instead
	BoundCidrLists pulumi.StringArrayInput
	// If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	//
	// Deprecated: use `token_period` instead if you are running Vault >= 1.2
	Period pulumi.IntPtrInput
	// An array of strings
	// specifying the policies to be set on tokens issued using this role.
	//
	// Deprecated: use `token_policies` instead if you are running Vault >= 1.2
	Policies pulumi.StringArrayInput
	// The RoleID of this role. If not specified, one will be
	// auto-generated.
	RoleId pulumi.StringPtrInput
	// The name of the role.
	RoleName pulumi.StringInput
	// If set,
	// specifies blocks of IP addresses which can perform the login operation.
	SecretIdBoundCidrs pulumi.StringArrayInput
	// The number of times any particular SecretID
	// can be used to fetch a token from this AppRole, after which the SecretID will
	// expire. A value of zero will allow unlimited uses.
	SecretIdNumUses pulumi.IntPtrInput
	// The number of seconds after which any SecretID
	// expires.
	SecretIdTtl pulumi.IntPtrInput
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
	// List of policies to encode onto generated tokens. Depending
	// on the auth method, this list may be supplemented by user/group/other values.
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

func init() {
	pulumi.RegisterOutputType(AuthBackendRoleOutput{})
}
