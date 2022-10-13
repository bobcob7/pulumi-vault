// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package consul

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Consul secrets role for a Consul secrets engine in Vault. Consul secret backends can then issue Consul tokens.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-vault/sdk/v5/go/vault/consul"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			test, err := consul.NewSecretBackend(ctx, "test", &consul.SecretBackendArgs{
//				Path:        pulumi.String("consul"),
//				Description: pulumi.String("Manages the Consul backend"),
//				Address:     pulumi.String("127.0.0.1:8500"),
//				Token:       pulumi.String("4240861b-ce3d-8530-115a-521ff070dd29"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = consul.NewSecretBackendRole(ctx, "example", &consul.SecretBackendRoleArgs{
//				Backend: test.Path,
//				ConsulPolicies: pulumi.StringArray{
//					pulumi.String("example-policy"),
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
// ## Note About Required Arguments
//
// *At least one* of the four arguments `consulPolicies`, `consulRoles`, `serviceIdentities`, or
// `nodeIdentities` is required for a token. If desired, any combination of the four arguments up-to and
// including all four, is valid.
//
// ## Import
//
// Consul secret backend roles can be imported using the `backend`, `/roles/`, and the `name` e.g.
//
// ```sh
//
//	$ pulumi import vault:consul/secretBackendRole:SecretBackendRole example consul/roles/my-role
//
// ```
type SecretBackendRole struct {
	pulumi.CustomResourceState

	// The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. One of `path` or `backend` is required.
	Backend pulumi.StringPtrOutput `pulumi:"backend"`
	// The Consul namespace that the token will be created in.
	// Applicable for Vault 1.10+ and Consul 1.7+".
	ConsulNamespace pulumi.StringOutput `pulumi:"consulNamespace"`
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> The list of Consul ACL policies to associate with these roles.
	ConsulPolicies pulumi.StringArrayOutput `pulumi:"consulPolicies"`
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul roles to attach to the token.
	// Applicable for Vault 1.10+ with Consul 1.5+.
	ConsulRoles pulumi.StringArrayOutput `pulumi:"consulRoles"`
	// Indicates that the token should not be replicated globally and instead be local to the current datacenter.
	Local pulumi.BoolPtrOutput `pulumi:"local"`
	// Maximum TTL for leases associated with this role, in seconds.
	MaxTtl pulumi.IntPtrOutput `pulumi:"maxTtl"`
	// The name of the Consul secrets engine role to create.
	Name pulumi.StringOutput `pulumi:"name"`
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace pulumi.StringPtrOutput `pulumi:"namespace"`
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul node
	// identities to attach to the token. Applicable for Vault 1.11+ with Consul 1.8+.
	NodeIdentities pulumi.StringArrayOutput `pulumi:"nodeIdentities"`
	// The admin partition that the token will be created in.
	// Applicable for Vault 1.10+ and Consul 1.11+".
	Partition pulumi.StringOutput `pulumi:"partition"`
	// The list of Consul ACL policies to associate with these roles.
	// **NOTE:** The new parameter `consulPolicies` should be used in favor of this. This parameter,
	// `policies`, remains supported for legacy users, but Vault has deprecated this field.
	Policies pulumi.StringArrayOutput `pulumi:"policies"`
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul
	// service identities to attach to the token. Applicable for Vault 1.11+ with Consul 1.5+.
	ServiceIdentities pulumi.StringArrayOutput `pulumi:"serviceIdentities"`
	// Specifies the type of token to create when using this role. Valid values are "client" or "management".
	// *Deprecated: Consul 1.11 and later removed the legacy ACL system which supported this field.*
	//
	// Deprecated: Consul 1.11 and later removed the legacy ACL system which supported this field.
	TokenType pulumi.StringPtrOutput `pulumi:"tokenType"`
	// Specifies the TTL for this role.
	Ttl pulumi.IntPtrOutput `pulumi:"ttl"`
}

// NewSecretBackendRole registers a new resource with the given unique name, arguments, and options.
func NewSecretBackendRole(ctx *pulumi.Context,
	name string, args *SecretBackendRoleArgs, opts ...pulumi.ResourceOption) (*SecretBackendRole, error) {
	if args == nil {
		args = &SecretBackendRoleArgs{}
	}

	var resource SecretBackendRole
	err := ctx.RegisterResource("vault:consul/secretBackendRole:SecretBackendRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecretBackendRole gets an existing SecretBackendRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecretBackendRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecretBackendRoleState, opts ...pulumi.ResourceOption) (*SecretBackendRole, error) {
	var resource SecretBackendRole
	err := ctx.ReadResource("vault:consul/secretBackendRole:SecretBackendRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecretBackendRole resources.
type secretBackendRoleState struct {
	// The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. One of `path` or `backend` is required.
	Backend *string `pulumi:"backend"`
	// The Consul namespace that the token will be created in.
	// Applicable for Vault 1.10+ and Consul 1.7+".
	ConsulNamespace *string `pulumi:"consulNamespace"`
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> The list of Consul ACL policies to associate with these roles.
	ConsulPolicies []string `pulumi:"consulPolicies"`
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul roles to attach to the token.
	// Applicable for Vault 1.10+ with Consul 1.5+.
	ConsulRoles []string `pulumi:"consulRoles"`
	// Indicates that the token should not be replicated globally and instead be local to the current datacenter.
	Local *bool `pulumi:"local"`
	// Maximum TTL for leases associated with this role, in seconds.
	MaxTtl *int `pulumi:"maxTtl"`
	// The name of the Consul secrets engine role to create.
	Name *string `pulumi:"name"`
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace *string `pulumi:"namespace"`
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul node
	// identities to attach to the token. Applicable for Vault 1.11+ with Consul 1.8+.
	NodeIdentities []string `pulumi:"nodeIdentities"`
	// The admin partition that the token will be created in.
	// Applicable for Vault 1.10+ and Consul 1.11+".
	Partition *string `pulumi:"partition"`
	// The list of Consul ACL policies to associate with these roles.
	// **NOTE:** The new parameter `consulPolicies` should be used in favor of this. This parameter,
	// `policies`, remains supported for legacy users, but Vault has deprecated this field.
	Policies []string `pulumi:"policies"`
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul
	// service identities to attach to the token. Applicable for Vault 1.11+ with Consul 1.5+.
	ServiceIdentities []string `pulumi:"serviceIdentities"`
	// Specifies the type of token to create when using this role. Valid values are "client" or "management".
	// *Deprecated: Consul 1.11 and later removed the legacy ACL system which supported this field.*
	//
	// Deprecated: Consul 1.11 and later removed the legacy ACL system which supported this field.
	TokenType *string `pulumi:"tokenType"`
	// Specifies the TTL for this role.
	Ttl *int `pulumi:"ttl"`
}

type SecretBackendRoleState struct {
	// The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. One of `path` or `backend` is required.
	Backend pulumi.StringPtrInput
	// The Consul namespace that the token will be created in.
	// Applicable for Vault 1.10+ and Consul 1.7+".
	ConsulNamespace pulumi.StringPtrInput
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> The list of Consul ACL policies to associate with these roles.
	ConsulPolicies pulumi.StringArrayInput
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul roles to attach to the token.
	// Applicable for Vault 1.10+ with Consul 1.5+.
	ConsulRoles pulumi.StringArrayInput
	// Indicates that the token should not be replicated globally and instead be local to the current datacenter.
	Local pulumi.BoolPtrInput
	// Maximum TTL for leases associated with this role, in seconds.
	MaxTtl pulumi.IntPtrInput
	// The name of the Consul secrets engine role to create.
	Name pulumi.StringPtrInput
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace pulumi.StringPtrInput
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul node
	// identities to attach to the token. Applicable for Vault 1.11+ with Consul 1.8+.
	NodeIdentities pulumi.StringArrayInput
	// The admin partition that the token will be created in.
	// Applicable for Vault 1.10+ and Consul 1.11+".
	Partition pulumi.StringPtrInput
	// The list of Consul ACL policies to associate with these roles.
	// **NOTE:** The new parameter `consulPolicies` should be used in favor of this. This parameter,
	// `policies`, remains supported for legacy users, but Vault has deprecated this field.
	Policies pulumi.StringArrayInput
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul
	// service identities to attach to the token. Applicable for Vault 1.11+ with Consul 1.5+.
	ServiceIdentities pulumi.StringArrayInput
	// Specifies the type of token to create when using this role. Valid values are "client" or "management".
	// *Deprecated: Consul 1.11 and later removed the legacy ACL system which supported this field.*
	//
	// Deprecated: Consul 1.11 and later removed the legacy ACL system which supported this field.
	TokenType pulumi.StringPtrInput
	// Specifies the TTL for this role.
	Ttl pulumi.IntPtrInput
}

func (SecretBackendRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*secretBackendRoleState)(nil)).Elem()
}

type secretBackendRoleArgs struct {
	// The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. One of `path` or `backend` is required.
	Backend *string `pulumi:"backend"`
	// The Consul namespace that the token will be created in.
	// Applicable for Vault 1.10+ and Consul 1.7+".
	ConsulNamespace *string `pulumi:"consulNamespace"`
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> The list of Consul ACL policies to associate with these roles.
	ConsulPolicies []string `pulumi:"consulPolicies"`
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul roles to attach to the token.
	// Applicable for Vault 1.10+ with Consul 1.5+.
	ConsulRoles []string `pulumi:"consulRoles"`
	// Indicates that the token should not be replicated globally and instead be local to the current datacenter.
	Local *bool `pulumi:"local"`
	// Maximum TTL for leases associated with this role, in seconds.
	MaxTtl *int `pulumi:"maxTtl"`
	// The name of the Consul secrets engine role to create.
	Name *string `pulumi:"name"`
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace *string `pulumi:"namespace"`
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul node
	// identities to attach to the token. Applicable for Vault 1.11+ with Consul 1.8+.
	NodeIdentities []string `pulumi:"nodeIdentities"`
	// The admin partition that the token will be created in.
	// Applicable for Vault 1.10+ and Consul 1.11+".
	Partition *string `pulumi:"partition"`
	// The list of Consul ACL policies to associate with these roles.
	// **NOTE:** The new parameter `consulPolicies` should be used in favor of this. This parameter,
	// `policies`, remains supported for legacy users, but Vault has deprecated this field.
	Policies []string `pulumi:"policies"`
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul
	// service identities to attach to the token. Applicable for Vault 1.11+ with Consul 1.5+.
	ServiceIdentities []string `pulumi:"serviceIdentities"`
	// Specifies the type of token to create when using this role. Valid values are "client" or "management".
	// *Deprecated: Consul 1.11 and later removed the legacy ACL system which supported this field.*
	//
	// Deprecated: Consul 1.11 and later removed the legacy ACL system which supported this field.
	TokenType *string `pulumi:"tokenType"`
	// Specifies the TTL for this role.
	Ttl *int `pulumi:"ttl"`
}

// The set of arguments for constructing a SecretBackendRole resource.
type SecretBackendRoleArgs struct {
	// The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. One of `path` or `backend` is required.
	Backend pulumi.StringPtrInput
	// The Consul namespace that the token will be created in.
	// Applicable for Vault 1.10+ and Consul 1.7+".
	ConsulNamespace pulumi.StringPtrInput
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> The list of Consul ACL policies to associate with these roles.
	ConsulPolicies pulumi.StringArrayInput
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul roles to attach to the token.
	// Applicable for Vault 1.10+ with Consul 1.5+.
	ConsulRoles pulumi.StringArrayInput
	// Indicates that the token should not be replicated globally and instead be local to the current datacenter.
	Local pulumi.BoolPtrInput
	// Maximum TTL for leases associated with this role, in seconds.
	MaxTtl pulumi.IntPtrInput
	// The name of the Consul secrets engine role to create.
	Name pulumi.StringPtrInput
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace pulumi.StringPtrInput
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul node
	// identities to attach to the token. Applicable for Vault 1.11+ with Consul 1.8+.
	NodeIdentities pulumi.StringArrayInput
	// The admin partition that the token will be created in.
	// Applicable for Vault 1.10+ and Consul 1.11+".
	Partition pulumi.StringPtrInput
	// The list of Consul ACL policies to associate with these roles.
	// **NOTE:** The new parameter `consulPolicies` should be used in favor of this. This parameter,
	// `policies`, remains supported for legacy users, but Vault has deprecated this field.
	Policies pulumi.StringArrayInput
	// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul
	// service identities to attach to the token. Applicable for Vault 1.11+ with Consul 1.5+.
	ServiceIdentities pulumi.StringArrayInput
	// Specifies the type of token to create when using this role. Valid values are "client" or "management".
	// *Deprecated: Consul 1.11 and later removed the legacy ACL system which supported this field.*
	//
	// Deprecated: Consul 1.11 and later removed the legacy ACL system which supported this field.
	TokenType pulumi.StringPtrInput
	// Specifies the TTL for this role.
	Ttl pulumi.IntPtrInput
}

func (SecretBackendRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*secretBackendRoleArgs)(nil)).Elem()
}

type SecretBackendRoleInput interface {
	pulumi.Input

	ToSecretBackendRoleOutput() SecretBackendRoleOutput
	ToSecretBackendRoleOutputWithContext(ctx context.Context) SecretBackendRoleOutput
}

func (*SecretBackendRole) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretBackendRole)(nil)).Elem()
}

func (i *SecretBackendRole) ToSecretBackendRoleOutput() SecretBackendRoleOutput {
	return i.ToSecretBackendRoleOutputWithContext(context.Background())
}

func (i *SecretBackendRole) ToSecretBackendRoleOutputWithContext(ctx context.Context) SecretBackendRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretBackendRoleOutput)
}

// SecretBackendRoleArrayInput is an input type that accepts SecretBackendRoleArray and SecretBackendRoleArrayOutput values.
// You can construct a concrete instance of `SecretBackendRoleArrayInput` via:
//
//	SecretBackendRoleArray{ SecretBackendRoleArgs{...} }
type SecretBackendRoleArrayInput interface {
	pulumi.Input

	ToSecretBackendRoleArrayOutput() SecretBackendRoleArrayOutput
	ToSecretBackendRoleArrayOutputWithContext(context.Context) SecretBackendRoleArrayOutput
}

type SecretBackendRoleArray []SecretBackendRoleInput

func (SecretBackendRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecretBackendRole)(nil)).Elem()
}

func (i SecretBackendRoleArray) ToSecretBackendRoleArrayOutput() SecretBackendRoleArrayOutput {
	return i.ToSecretBackendRoleArrayOutputWithContext(context.Background())
}

func (i SecretBackendRoleArray) ToSecretBackendRoleArrayOutputWithContext(ctx context.Context) SecretBackendRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretBackendRoleArrayOutput)
}

// SecretBackendRoleMapInput is an input type that accepts SecretBackendRoleMap and SecretBackendRoleMapOutput values.
// You can construct a concrete instance of `SecretBackendRoleMapInput` via:
//
//	SecretBackendRoleMap{ "key": SecretBackendRoleArgs{...} }
type SecretBackendRoleMapInput interface {
	pulumi.Input

	ToSecretBackendRoleMapOutput() SecretBackendRoleMapOutput
	ToSecretBackendRoleMapOutputWithContext(context.Context) SecretBackendRoleMapOutput
}

type SecretBackendRoleMap map[string]SecretBackendRoleInput

func (SecretBackendRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecretBackendRole)(nil)).Elem()
}

func (i SecretBackendRoleMap) ToSecretBackendRoleMapOutput() SecretBackendRoleMapOutput {
	return i.ToSecretBackendRoleMapOutputWithContext(context.Background())
}

func (i SecretBackendRoleMap) ToSecretBackendRoleMapOutputWithContext(ctx context.Context) SecretBackendRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretBackendRoleMapOutput)
}

type SecretBackendRoleOutput struct{ *pulumi.OutputState }

func (SecretBackendRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretBackendRole)(nil)).Elem()
}

func (o SecretBackendRoleOutput) ToSecretBackendRoleOutput() SecretBackendRoleOutput {
	return o
}

func (o SecretBackendRoleOutput) ToSecretBackendRoleOutputWithContext(ctx context.Context) SecretBackendRoleOutput {
	return o
}

// The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. One of `path` or `backend` is required.
func (o SecretBackendRoleOutput) Backend() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecretBackendRole) pulumi.StringPtrOutput { return v.Backend }).(pulumi.StringPtrOutput)
}

// The Consul namespace that the token will be created in.
// Applicable for Vault 1.10+ and Consul 1.7+".
func (o SecretBackendRoleOutput) ConsulNamespace() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretBackendRole) pulumi.StringOutput { return v.ConsulNamespace }).(pulumi.StringOutput)
}

// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> The list of Consul ACL policies to associate with these roles.
func (o SecretBackendRoleOutput) ConsulPolicies() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecretBackendRole) pulumi.StringArrayOutput { return v.ConsulPolicies }).(pulumi.StringArrayOutput)
}

// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul roles to attach to the token.
// Applicable for Vault 1.10+ with Consul 1.5+.
func (o SecretBackendRoleOutput) ConsulRoles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecretBackendRole) pulumi.StringArrayOutput { return v.ConsulRoles }).(pulumi.StringArrayOutput)
}

// Indicates that the token should not be replicated globally and instead be local to the current datacenter.
func (o SecretBackendRoleOutput) Local() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SecretBackendRole) pulumi.BoolPtrOutput { return v.Local }).(pulumi.BoolPtrOutput)
}

// Maximum TTL for leases associated with this role, in seconds.
func (o SecretBackendRoleOutput) MaxTtl() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *SecretBackendRole) pulumi.IntPtrOutput { return v.MaxTtl }).(pulumi.IntPtrOutput)
}

// The name of the Consul secrets engine role to create.
func (o SecretBackendRoleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretBackendRole) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The namespace to provision the resource in.
// The value should not contain leading or trailing forward slashes.
// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
// *Available only for Vault Enterprise*.
func (o SecretBackendRoleOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecretBackendRole) pulumi.StringPtrOutput { return v.Namespace }).(pulumi.StringPtrOutput)
}

// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul node
// identities to attach to the token. Applicable for Vault 1.11+ with Consul 1.8+.
func (o SecretBackendRoleOutput) NodeIdentities() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecretBackendRole) pulumi.StringArrayOutput { return v.NodeIdentities }).(pulumi.StringArrayOutput)
}

// The admin partition that the token will be created in.
// Applicable for Vault 1.10+ and Consul 1.11+".
func (o SecretBackendRoleOutput) Partition() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretBackendRole) pulumi.StringOutput { return v.Partition }).(pulumi.StringOutput)
}

// The list of Consul ACL policies to associate with these roles.
// **NOTE:** The new parameter `consulPolicies` should be used in favor of this. This parameter,
// `policies`, remains supported for legacy users, but Vault has deprecated this field.
func (o SecretBackendRoleOutput) Policies() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecretBackendRole) pulumi.StringArrayOutput { return v.Policies }).(pulumi.StringArrayOutput)
}

// <sup><a href="#note-about-required-arguments">SEE NOTE</a></sup> Set of Consul
// service identities to attach to the token. Applicable for Vault 1.11+ with Consul 1.5+.
func (o SecretBackendRoleOutput) ServiceIdentities() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecretBackendRole) pulumi.StringArrayOutput { return v.ServiceIdentities }).(pulumi.StringArrayOutput)
}

// Specifies the type of token to create when using this role. Valid values are "client" or "management".
// *Deprecated: Consul 1.11 and later removed the legacy ACL system which supported this field.*
//
// Deprecated: Consul 1.11 and later removed the legacy ACL system which supported this field.
func (o SecretBackendRoleOutput) TokenType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecretBackendRole) pulumi.StringPtrOutput { return v.TokenType }).(pulumi.StringPtrOutput)
}

// Specifies the TTL for this role.
func (o SecretBackendRoleOutput) Ttl() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *SecretBackendRole) pulumi.IntPtrOutput { return v.Ttl }).(pulumi.IntPtrOutput)
}

type SecretBackendRoleArrayOutput struct{ *pulumi.OutputState }

func (SecretBackendRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecretBackendRole)(nil)).Elem()
}

func (o SecretBackendRoleArrayOutput) ToSecretBackendRoleArrayOutput() SecretBackendRoleArrayOutput {
	return o
}

func (o SecretBackendRoleArrayOutput) ToSecretBackendRoleArrayOutputWithContext(ctx context.Context) SecretBackendRoleArrayOutput {
	return o
}

func (o SecretBackendRoleArrayOutput) Index(i pulumi.IntInput) SecretBackendRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SecretBackendRole {
		return vs[0].([]*SecretBackendRole)[vs[1].(int)]
	}).(SecretBackendRoleOutput)
}

type SecretBackendRoleMapOutput struct{ *pulumi.OutputState }

func (SecretBackendRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecretBackendRole)(nil)).Elem()
}

func (o SecretBackendRoleMapOutput) ToSecretBackendRoleMapOutput() SecretBackendRoleMapOutput {
	return o
}

func (o SecretBackendRoleMapOutput) ToSecretBackendRoleMapOutputWithContext(ctx context.Context) SecretBackendRoleMapOutput {
	return o
}

func (o SecretBackendRoleMapOutput) MapIndex(k pulumi.StringInput) SecretBackendRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SecretBackendRole {
		return vs[0].(map[string]*SecretBackendRole)[vs[1].(string)]
	}).(SecretBackendRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecretBackendRoleInput)(nil)).Elem(), &SecretBackendRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretBackendRoleArrayInput)(nil)).Elem(), SecretBackendRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretBackendRoleMapInput)(nil)).Elem(), SecretBackendRoleMap{})
	pulumi.RegisterOutputType(SecretBackendRoleOutput{})
	pulumi.RegisterOutputType(SecretBackendRoleArrayOutput{})
	pulumi.RegisterOutputType(SecretBackendRoleMapOutput{})
}
