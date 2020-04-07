// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package identity

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Manages policies for an Identity Entity for Vault. The [Identity secrets engine](https://www.vaultproject.io/docs/secrets/identity/index.html) is the identity management solution for Vault.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-vault/blob/master/website/docs/r/identity_entity_policies.html.md.
type EntityPolicies struct {
	pulumi.CustomResourceState

	// Entity ID to assign policies to.
	EntityId pulumi.StringOutput `pulumi:"entityId"`
	// The name of the entity that are assigned the policies.
	EntityName pulumi.StringOutput `pulumi:"entityName"`
	// Defaults to `true`.
	Exclusive pulumi.BoolPtrOutput `pulumi:"exclusive"`
	// List of policies to assign to the entity
	Policies pulumi.StringArrayOutput `pulumi:"policies"`
}

// NewEntityPolicies registers a new resource with the given unique name, arguments, and options.
func NewEntityPolicies(ctx *pulumi.Context,
	name string, args *EntityPoliciesArgs, opts ...pulumi.ResourceOption) (*EntityPolicies, error) {
	if args == nil || args.EntityId == nil {
		return nil, errors.New("missing required argument 'EntityId'")
	}
	if args == nil || args.Policies == nil {
		return nil, errors.New("missing required argument 'Policies'")
	}
	if args == nil {
		args = &EntityPoliciesArgs{}
	}
	var resource EntityPolicies
	err := ctx.RegisterResource("vault:identity/entityPolicies:EntityPolicies", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEntityPolicies gets an existing EntityPolicies resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEntityPolicies(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EntityPoliciesState, opts ...pulumi.ResourceOption) (*EntityPolicies, error) {
	var resource EntityPolicies
	err := ctx.ReadResource("vault:identity/entityPolicies:EntityPolicies", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EntityPolicies resources.
type entityPoliciesState struct {
	// Entity ID to assign policies to.
	EntityId *string `pulumi:"entityId"`
	// The name of the entity that are assigned the policies.
	EntityName *string `pulumi:"entityName"`
	// Defaults to `true`.
	Exclusive *bool `pulumi:"exclusive"`
	// List of policies to assign to the entity
	Policies []string `pulumi:"policies"`
}

type EntityPoliciesState struct {
	// Entity ID to assign policies to.
	EntityId pulumi.StringPtrInput
	// The name of the entity that are assigned the policies.
	EntityName pulumi.StringPtrInput
	// Defaults to `true`.
	Exclusive pulumi.BoolPtrInput
	// List of policies to assign to the entity
	Policies pulumi.StringArrayInput
}

func (EntityPoliciesState) ElementType() reflect.Type {
	return reflect.TypeOf((*entityPoliciesState)(nil)).Elem()
}

type entityPoliciesArgs struct {
	// Entity ID to assign policies to.
	EntityId string `pulumi:"entityId"`
	// Defaults to `true`.
	Exclusive *bool `pulumi:"exclusive"`
	// List of policies to assign to the entity
	Policies []string `pulumi:"policies"`
}

// The set of arguments for constructing a EntityPolicies resource.
type EntityPoliciesArgs struct {
	// Entity ID to assign policies to.
	EntityId pulumi.StringInput
	// Defaults to `true`.
	Exclusive pulumi.BoolPtrInput
	// List of policies to assign to the entity
	Policies pulumi.StringArrayInput
}

func (EntityPoliciesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*entityPoliciesArgs)(nil)).Elem()
}
