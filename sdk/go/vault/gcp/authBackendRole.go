// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gcp

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to create a role in an [GCP auth backend within Vault](https://www.vaultproject.io/docs/auth/gcp.html).
//
// ## Import
//
// GCP authentication roles can be imported using the `path`, e.g.
//
// ```sh
//  $ pulumi import vault:gcp/authBackendRole:AuthBackendRole my_role auth/gcp/role/my_role
// ```
type AuthBackendRole struct {
	pulumi.CustomResourceState

	AddGroupAliases pulumi.BoolOutput `pulumi:"addGroupAliases"`
	// A flag to determine if this role should allow GCE instances to authenticate by inferring service accounts from the GCE identity metadata token.
	AllowGceInference pulumi.BoolOutput `pulumi:"allowGceInference"`
	// Path to the mounted GCP auth backend
	Backend pulumi.StringPtrOutput `pulumi:"backend"`
	// The instance groups that an authorized instance must belong to in order to be authenticated. If specified, either `boundZones` or `boundRegions` must be set too.
	BoundInstanceGroups pulumi.StringArrayOutput `pulumi:"boundInstanceGroups"`
	// A comma-separated list of GCP labels formatted as `"key:value"` strings that must be set on authorized GCE instances. Because GCP labels are not currently ACL'd, we recommend that this be used in conjunction with other restrictions.
	BoundLabels pulumi.StringArrayOutput `pulumi:"boundLabels"`
	// GCP Projects that the role exists within
	BoundProjects pulumi.StringArrayOutput `pulumi:"boundProjects"`
	// The list of regions that a GCE instance must belong to in order to be authenticated. If boundInstanceGroups is provided, it is assumed to be a regional group and the group must belong to this region. If boundZones are provided, this attribute is ignored.
	BoundRegions pulumi.StringArrayOutput `pulumi:"boundRegions"`
	// GCP Service Accounts allowed to issue tokens under this role. (Note: **Required** if role is `iam`)
	BoundServiceAccounts pulumi.StringArrayOutput `pulumi:"boundServiceAccounts"`
	// The list of zones that a GCE instance must belong to in order to be authenticated. If boundInstanceGroups is provided, it is assumed to be a zonal group and the group must belong to this zone.
	BoundZones pulumi.StringArrayOutput `pulumi:"boundZones"`
	// The number of seconds past the time of authentication that the login param JWT must expire within. For example, if a user attempts to login with a token that expires within an hour and this is set to 15 minutes, Vault will return an error prompting the user to create a new signed JWT with a shorter `exp`. The GCE metadata tokens currently do not allow the `exp` claim to be customized.
	MaxJwtExp pulumi.StringOutput `pulumi:"maxJwtExp"`
	// Name of the GCP role
	Role pulumi.StringOutput `pulumi:"role"`
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
	// Type of GCP authentication role (either `gce` or `iam`)
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewAuthBackendRole registers a new resource with the given unique name, arguments, and options.
func NewAuthBackendRole(ctx *pulumi.Context,
	name string, args *AuthBackendRoleArgs, opts ...pulumi.ResourceOption) (*AuthBackendRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource AuthBackendRole
	err := ctx.RegisterResource("vault:gcp/authBackendRole:AuthBackendRole", name, args, &resource, opts...)
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
	err := ctx.ReadResource("vault:gcp/authBackendRole:AuthBackendRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthBackendRole resources.
type authBackendRoleState struct {
	AddGroupAliases *bool `pulumi:"addGroupAliases"`
	// A flag to determine if this role should allow GCE instances to authenticate by inferring service accounts from the GCE identity metadata token.
	AllowGceInference *bool `pulumi:"allowGceInference"`
	// Path to the mounted GCP auth backend
	Backend *string `pulumi:"backend"`
	// The instance groups that an authorized instance must belong to in order to be authenticated. If specified, either `boundZones` or `boundRegions` must be set too.
	BoundInstanceGroups []string `pulumi:"boundInstanceGroups"`
	// A comma-separated list of GCP labels formatted as `"key:value"` strings that must be set on authorized GCE instances. Because GCP labels are not currently ACL'd, we recommend that this be used in conjunction with other restrictions.
	BoundLabels []string `pulumi:"boundLabels"`
	// GCP Projects that the role exists within
	BoundProjects []string `pulumi:"boundProjects"`
	// The list of regions that a GCE instance must belong to in order to be authenticated. If boundInstanceGroups is provided, it is assumed to be a regional group and the group must belong to this region. If boundZones are provided, this attribute is ignored.
	BoundRegions []string `pulumi:"boundRegions"`
	// GCP Service Accounts allowed to issue tokens under this role. (Note: **Required** if role is `iam`)
	BoundServiceAccounts []string `pulumi:"boundServiceAccounts"`
	// The list of zones that a GCE instance must belong to in order to be authenticated. If boundInstanceGroups is provided, it is assumed to be a zonal group and the group must belong to this zone.
	BoundZones []string `pulumi:"boundZones"`
	// The number of seconds past the time of authentication that the login param JWT must expire within. For example, if a user attempts to login with a token that expires within an hour and this is set to 15 minutes, Vault will return an error prompting the user to create a new signed JWT with a shorter `exp`. The GCE metadata tokens currently do not allow the `exp` claim to be customized.
	MaxJwtExp *string `pulumi:"maxJwtExp"`
	// Name of the GCP role
	Role *string `pulumi:"role"`
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
	// Type of GCP authentication role (either `gce` or `iam`)
	Type *string `pulumi:"type"`
}

type AuthBackendRoleState struct {
	AddGroupAliases pulumi.BoolPtrInput
	// A flag to determine if this role should allow GCE instances to authenticate by inferring service accounts from the GCE identity metadata token.
	AllowGceInference pulumi.BoolPtrInput
	// Path to the mounted GCP auth backend
	Backend pulumi.StringPtrInput
	// The instance groups that an authorized instance must belong to in order to be authenticated. If specified, either `boundZones` or `boundRegions` must be set too.
	BoundInstanceGroups pulumi.StringArrayInput
	// A comma-separated list of GCP labels formatted as `"key:value"` strings that must be set on authorized GCE instances. Because GCP labels are not currently ACL'd, we recommend that this be used in conjunction with other restrictions.
	BoundLabels pulumi.StringArrayInput
	// GCP Projects that the role exists within
	BoundProjects pulumi.StringArrayInput
	// The list of regions that a GCE instance must belong to in order to be authenticated. If boundInstanceGroups is provided, it is assumed to be a regional group and the group must belong to this region. If boundZones are provided, this attribute is ignored.
	BoundRegions pulumi.StringArrayInput
	// GCP Service Accounts allowed to issue tokens under this role. (Note: **Required** if role is `iam`)
	BoundServiceAccounts pulumi.StringArrayInput
	// The list of zones that a GCE instance must belong to in order to be authenticated. If boundInstanceGroups is provided, it is assumed to be a zonal group and the group must belong to this zone.
	BoundZones pulumi.StringArrayInput
	// The number of seconds past the time of authentication that the login param JWT must expire within. For example, if a user attempts to login with a token that expires within an hour and this is set to 15 minutes, Vault will return an error prompting the user to create a new signed JWT with a shorter `exp`. The GCE metadata tokens currently do not allow the `exp` claim to be customized.
	MaxJwtExp pulumi.StringPtrInput
	// Name of the GCP role
	Role pulumi.StringPtrInput
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
	// Type of GCP authentication role (either `gce` or `iam`)
	Type pulumi.StringPtrInput
}

func (AuthBackendRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*authBackendRoleState)(nil)).Elem()
}

type authBackendRoleArgs struct {
	AddGroupAliases *bool `pulumi:"addGroupAliases"`
	// A flag to determine if this role should allow GCE instances to authenticate by inferring service accounts from the GCE identity metadata token.
	AllowGceInference *bool `pulumi:"allowGceInference"`
	// Path to the mounted GCP auth backend
	Backend *string `pulumi:"backend"`
	// The instance groups that an authorized instance must belong to in order to be authenticated. If specified, either `boundZones` or `boundRegions` must be set too.
	BoundInstanceGroups []string `pulumi:"boundInstanceGroups"`
	// A comma-separated list of GCP labels formatted as `"key:value"` strings that must be set on authorized GCE instances. Because GCP labels are not currently ACL'd, we recommend that this be used in conjunction with other restrictions.
	BoundLabels []string `pulumi:"boundLabels"`
	// GCP Projects that the role exists within
	BoundProjects []string `pulumi:"boundProjects"`
	// The list of regions that a GCE instance must belong to in order to be authenticated. If boundInstanceGroups is provided, it is assumed to be a regional group and the group must belong to this region. If boundZones are provided, this attribute is ignored.
	BoundRegions []string `pulumi:"boundRegions"`
	// GCP Service Accounts allowed to issue tokens under this role. (Note: **Required** if role is `iam`)
	BoundServiceAccounts []string `pulumi:"boundServiceAccounts"`
	// The list of zones that a GCE instance must belong to in order to be authenticated. If boundInstanceGroups is provided, it is assumed to be a zonal group and the group must belong to this zone.
	BoundZones []string `pulumi:"boundZones"`
	// The number of seconds past the time of authentication that the login param JWT must expire within. For example, if a user attempts to login with a token that expires within an hour and this is set to 15 minutes, Vault will return an error prompting the user to create a new signed JWT with a shorter `exp`. The GCE metadata tokens currently do not allow the `exp` claim to be customized.
	MaxJwtExp *string `pulumi:"maxJwtExp"`
	// Name of the GCP role
	Role string `pulumi:"role"`
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
	// Type of GCP authentication role (either `gce` or `iam`)
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a AuthBackendRole resource.
type AuthBackendRoleArgs struct {
	AddGroupAliases pulumi.BoolPtrInput
	// A flag to determine if this role should allow GCE instances to authenticate by inferring service accounts from the GCE identity metadata token.
	AllowGceInference pulumi.BoolPtrInput
	// Path to the mounted GCP auth backend
	Backend pulumi.StringPtrInput
	// The instance groups that an authorized instance must belong to in order to be authenticated. If specified, either `boundZones` or `boundRegions` must be set too.
	BoundInstanceGroups pulumi.StringArrayInput
	// A comma-separated list of GCP labels formatted as `"key:value"` strings that must be set on authorized GCE instances. Because GCP labels are not currently ACL'd, we recommend that this be used in conjunction with other restrictions.
	BoundLabels pulumi.StringArrayInput
	// GCP Projects that the role exists within
	BoundProjects pulumi.StringArrayInput
	// The list of regions that a GCE instance must belong to in order to be authenticated. If boundInstanceGroups is provided, it is assumed to be a regional group and the group must belong to this region. If boundZones are provided, this attribute is ignored.
	BoundRegions pulumi.StringArrayInput
	// GCP Service Accounts allowed to issue tokens under this role. (Note: **Required** if role is `iam`)
	BoundServiceAccounts pulumi.StringArrayInput
	// The list of zones that a GCE instance must belong to in order to be authenticated. If boundInstanceGroups is provided, it is assumed to be a zonal group and the group must belong to this zone.
	BoundZones pulumi.StringArrayInput
	// The number of seconds past the time of authentication that the login param JWT must expire within. For example, if a user attempts to login with a token that expires within an hour and this is set to 15 minutes, Vault will return an error prompting the user to create a new signed JWT with a shorter `exp`. The GCE metadata tokens currently do not allow the `exp` claim to be customized.
	MaxJwtExp pulumi.StringPtrInput
	// Name of the GCP role
	Role pulumi.StringInput
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
	// Type of GCP authentication role (either `gce` or `iam`)
	Type pulumi.StringInput
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
	return reflect.TypeOf((**AuthBackendRole)(nil)).Elem()
}

func (i *AuthBackendRole) ToAuthBackendRoleOutput() AuthBackendRoleOutput {
	return i.ToAuthBackendRoleOutputWithContext(context.Background())
}

func (i *AuthBackendRole) ToAuthBackendRoleOutputWithContext(ctx context.Context) AuthBackendRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendRoleOutput)
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
	return reflect.TypeOf((*[]*AuthBackendRole)(nil)).Elem()
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
	return reflect.TypeOf((*map[string]*AuthBackendRole)(nil)).Elem()
}

func (i AuthBackendRoleMap) ToAuthBackendRoleMapOutput() AuthBackendRoleMapOutput {
	return i.ToAuthBackendRoleMapOutputWithContext(context.Background())
}

func (i AuthBackendRoleMap) ToAuthBackendRoleMapOutputWithContext(ctx context.Context) AuthBackendRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendRoleMapOutput)
}

type AuthBackendRoleOutput struct{ *pulumi.OutputState }

func (AuthBackendRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthBackendRole)(nil)).Elem()
}

func (o AuthBackendRoleOutput) ToAuthBackendRoleOutput() AuthBackendRoleOutput {
	return o
}

func (o AuthBackendRoleOutput) ToAuthBackendRoleOutputWithContext(ctx context.Context) AuthBackendRoleOutput {
	return o
}

type AuthBackendRoleArrayOutput struct{ *pulumi.OutputState }

func (AuthBackendRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthBackendRole)(nil)).Elem()
}

func (o AuthBackendRoleArrayOutput) ToAuthBackendRoleArrayOutput() AuthBackendRoleArrayOutput {
	return o
}

func (o AuthBackendRoleArrayOutput) ToAuthBackendRoleArrayOutputWithContext(ctx context.Context) AuthBackendRoleArrayOutput {
	return o
}

func (o AuthBackendRoleArrayOutput) Index(i pulumi.IntInput) AuthBackendRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthBackendRole {
		return vs[0].([]*AuthBackendRole)[vs[1].(int)]
	}).(AuthBackendRoleOutput)
}

type AuthBackendRoleMapOutput struct{ *pulumi.OutputState }

func (AuthBackendRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthBackendRole)(nil)).Elem()
}

func (o AuthBackendRoleMapOutput) ToAuthBackendRoleMapOutput() AuthBackendRoleMapOutput {
	return o
}

func (o AuthBackendRoleMapOutput) ToAuthBackendRoleMapOutputWithContext(ctx context.Context) AuthBackendRoleMapOutput {
	return o
}

func (o AuthBackendRoleMapOutput) MapIndex(k pulumi.StringInput) AuthBackendRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthBackendRole {
		return vs[0].(map[string]*AuthBackendRole)[vs[1].(string)]
	}).(AuthBackendRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendRoleInput)(nil)).Elem(), &AuthBackendRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendRoleArrayInput)(nil)).Elem(), AuthBackendRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendRoleMapInput)(nil)).Elem(), AuthBackendRoleMap{})
	pulumi.RegisterOutputType(AuthBackendRoleOutput{})
	pulumi.RegisterOutputType(AuthBackendRoleArrayOutput{})
	pulumi.RegisterOutputType(AuthBackendRoleMapOutput{})
}
