// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package consul

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages a Consul secrets role for a Consul secrets engine in Vault. Consul secret backends can then issue Consul tokens.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-vault/sdk/v3/go/vault/consul"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		test, err := consul.NewSecretBackend(ctx, "test", &consul.SecretBackendArgs{
// 			Path:        pulumi.String("consul"),
// 			Description: pulumi.String("Manages the Consul backend"),
// 			Address:     pulumi.String("127.0.0.1:8500"),
// 			Token:       pulumi.String("4240861b-ce3d-8530-115a-521ff070dd29"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = consul.NewSecretBackendRole(ctx, "example", &consul.SecretBackendRoleArgs{
// 			Backend: test.Path,
// 			Policies: pulumi.StringArray{
// 				pulumi.String("example-policy"),
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
// Consul secret backend roles can be imported using the `backend`, `/roles/`, and the `name` e.g.
//
// ```sh
//  $ pulumi import vault:consul/secretBackendRole:SecretBackendRole example consul/roles/my-role
// ```
type SecretBackendRole struct {
	pulumi.CustomResourceState

	// The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. One of `path` or `backend` is required.
	Backend pulumi.StringPtrOutput `pulumi:"backend"`
	// Indicates that the token should not be replicated globally and instead be local to the current datacenter.
	Local pulumi.BoolPtrOutput `pulumi:"local"`
	// Maximum TTL for leases associated with this role, in seconds.
	MaxTtl pulumi.IntPtrOutput `pulumi:"maxTtl"`
	// The name of the Consul secrets engine role to create.
	Name pulumi.StringOutput `pulumi:"name"`
	// The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. **Deprecated**
	//
	// Deprecated: use `backend` instead
	Path pulumi.StringPtrOutput `pulumi:"path"`
	// The list of Consul ACL policies to associate with these roles.
	Policies pulumi.StringArrayOutput `pulumi:"policies"`
	// Specifies the type of token to create when using this role. Valid values are "client" or "management".
	TokenType pulumi.StringPtrOutput `pulumi:"tokenType"`
	// Specifies the TTL for this role.
	Ttl pulumi.IntPtrOutput `pulumi:"ttl"`
}

// NewSecretBackendRole registers a new resource with the given unique name, arguments, and options.
func NewSecretBackendRole(ctx *pulumi.Context,
	name string, args *SecretBackendRoleArgs, opts ...pulumi.ResourceOption) (*SecretBackendRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Policies == nil {
		return nil, errors.New("invalid value for required argument 'Policies'")
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
	// Indicates that the token should not be replicated globally and instead be local to the current datacenter.
	Local *bool `pulumi:"local"`
	// Maximum TTL for leases associated with this role, in seconds.
	MaxTtl *int `pulumi:"maxTtl"`
	// The name of the Consul secrets engine role to create.
	Name *string `pulumi:"name"`
	// The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. **Deprecated**
	//
	// Deprecated: use `backend` instead
	Path *string `pulumi:"path"`
	// The list of Consul ACL policies to associate with these roles.
	Policies []string `pulumi:"policies"`
	// Specifies the type of token to create when using this role. Valid values are "client" or "management".
	TokenType *string `pulumi:"tokenType"`
	// Specifies the TTL for this role.
	Ttl *int `pulumi:"ttl"`
}

type SecretBackendRoleState struct {
	// The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. One of `path` or `backend` is required.
	Backend pulumi.StringPtrInput
	// Indicates that the token should not be replicated globally and instead be local to the current datacenter.
	Local pulumi.BoolPtrInput
	// Maximum TTL for leases associated with this role, in seconds.
	MaxTtl pulumi.IntPtrInput
	// The name of the Consul secrets engine role to create.
	Name pulumi.StringPtrInput
	// The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. **Deprecated**
	//
	// Deprecated: use `backend` instead
	Path pulumi.StringPtrInput
	// The list of Consul ACL policies to associate with these roles.
	Policies pulumi.StringArrayInput
	// Specifies the type of token to create when using this role. Valid values are "client" or "management".
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
	// Indicates that the token should not be replicated globally and instead be local to the current datacenter.
	Local *bool `pulumi:"local"`
	// Maximum TTL for leases associated with this role, in seconds.
	MaxTtl *int `pulumi:"maxTtl"`
	// The name of the Consul secrets engine role to create.
	Name *string `pulumi:"name"`
	// The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. **Deprecated**
	//
	// Deprecated: use `backend` instead
	Path *string `pulumi:"path"`
	// The list of Consul ACL policies to associate with these roles.
	Policies []string `pulumi:"policies"`
	// Specifies the type of token to create when using this role. Valid values are "client" or "management".
	TokenType *string `pulumi:"tokenType"`
	// Specifies the TTL for this role.
	Ttl *int `pulumi:"ttl"`
}

// The set of arguments for constructing a SecretBackendRole resource.
type SecretBackendRoleArgs struct {
	// The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. One of `path` or `backend` is required.
	Backend pulumi.StringPtrInput
	// Indicates that the token should not be replicated globally and instead be local to the current datacenter.
	Local pulumi.BoolPtrInput
	// Maximum TTL for leases associated with this role, in seconds.
	MaxTtl pulumi.IntPtrInput
	// The name of the Consul secrets engine role to create.
	Name pulumi.StringPtrInput
	// The unique name of an existing Consul secrets backend mount. Must not begin or end with a `/`. **Deprecated**
	//
	// Deprecated: use `backend` instead
	Path pulumi.StringPtrInput
	// The list of Consul ACL policies to associate with these roles.
	Policies pulumi.StringArrayInput
	// Specifies the type of token to create when using this role. Valid values are "client" or "management".
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
	return reflect.TypeOf((*SecretBackendRole)(nil))
}

func (i *SecretBackendRole) ToSecretBackendRoleOutput() SecretBackendRoleOutput {
	return i.ToSecretBackendRoleOutputWithContext(context.Background())
}

func (i *SecretBackendRole) ToSecretBackendRoleOutputWithContext(ctx context.Context) SecretBackendRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretBackendRoleOutput)
}

type SecretBackendRoleOutput struct {
	*pulumi.OutputState
}

func (SecretBackendRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*SecretBackendRole)(nil))
}

func (o SecretBackendRoleOutput) ToSecretBackendRoleOutput() SecretBackendRoleOutput {
	return o
}

func (o SecretBackendRoleOutput) ToSecretBackendRoleOutputWithContext(ctx context.Context) SecretBackendRoleOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(SecretBackendRoleOutput{})
}
