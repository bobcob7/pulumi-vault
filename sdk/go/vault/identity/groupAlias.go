// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package identity

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates an Identity Group Alias for Vault. The [Identity secrets engine](https://www.vaultproject.io/docs/secrets/identity/index.html) is the identity management solution for Vault.
//
// Group aliases allows entity membership in external groups to be managed semi-automatically. External group serves as a mapping to a group that is outside of the identity store. External groups can have one (and only one) alias. This alias should map to a notion of group that is outside of the identity store. For example, groups in LDAP, and teams in GitHub. A username in LDAP, belonging to a group in LDAP, can get its entity ID added as a member of a group in Vault automatically during logins and token renewals. This works only if the group in Vault is an external group and has an alias that maps to the group in LDAP. If the user is removed from the group in LDAP, that change gets reflected in Vault only upon the subsequent login or renewal operation.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-vault/sdk/v5/go/vault"
//	"github.com/pulumi/pulumi-vault/sdk/v5/go/vault/identity"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			group, err := identity.NewGroup(ctx, "group", &identity.GroupArgs{
//				Type: pulumi.String("external"),
//				Policies: pulumi.StringArray{
//					pulumi.String("test"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			github, err := vault.NewAuthBackend(ctx, "github", &vault.AuthBackendArgs{
//				Type: pulumi.String("github"),
//				Path: pulumi.String("github"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = identity.NewGroupAlias(ctx, "group-alias", &identity.GroupAliasArgs{
//				Name:          pulumi.String("Github_Team_Slug"),
//				MountAccessor: github.Accessor,
//				CanonicalId:   group.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// # The group alias can be imported with the group alias `id`, for example
//
// ```sh
//
//	$ pulumi import vault:identity/groupAlias:GroupAlias group-alias id
//
// ```
//
//	Group aliases can also be imported using the UUID of the alias record, e.g.
//
// ```sh
//
//	$ pulumi import vault:identity/groupAlias:GroupAlias alias_name 63104e20-88e4-11eb-8d04-cf7ac9d60157
//
// ```
type GroupAlias struct {
	pulumi.CustomResourceState

	// ID of the group to which this is an alias.
	CanonicalId pulumi.StringOutput `pulumi:"canonicalId"`
	// Mount accessor of the authentication backend to which this alias belongs to.
	MountAccessor pulumi.StringOutput `pulumi:"mountAccessor"`
	// Name of the group alias to create.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewGroupAlias registers a new resource with the given unique name, arguments, and options.
func NewGroupAlias(ctx *pulumi.Context,
	name string, args *GroupAliasArgs, opts ...pulumi.ResourceOption) (*GroupAlias, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CanonicalId == nil {
		return nil, errors.New("invalid value for required argument 'CanonicalId'")
	}
	if args.MountAccessor == nil {
		return nil, errors.New("invalid value for required argument 'MountAccessor'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	var resource GroupAlias
	err := ctx.RegisterResource("vault:identity/groupAlias:GroupAlias", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGroupAlias gets an existing GroupAlias resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGroupAlias(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GroupAliasState, opts ...pulumi.ResourceOption) (*GroupAlias, error) {
	var resource GroupAlias
	err := ctx.ReadResource("vault:identity/groupAlias:GroupAlias", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GroupAlias resources.
type groupAliasState struct {
	// ID of the group to which this is an alias.
	CanonicalId *string `pulumi:"canonicalId"`
	// Mount accessor of the authentication backend to which this alias belongs to.
	MountAccessor *string `pulumi:"mountAccessor"`
	// Name of the group alias to create.
	Name *string `pulumi:"name"`
}

type GroupAliasState struct {
	// ID of the group to which this is an alias.
	CanonicalId pulumi.StringPtrInput
	// Mount accessor of the authentication backend to which this alias belongs to.
	MountAccessor pulumi.StringPtrInput
	// Name of the group alias to create.
	Name pulumi.StringPtrInput
}

func (GroupAliasState) ElementType() reflect.Type {
	return reflect.TypeOf((*groupAliasState)(nil)).Elem()
}

type groupAliasArgs struct {
	// ID of the group to which this is an alias.
	CanonicalId string `pulumi:"canonicalId"`
	// Mount accessor of the authentication backend to which this alias belongs to.
	MountAccessor string `pulumi:"mountAccessor"`
	// Name of the group alias to create.
	Name string `pulumi:"name"`
}

// The set of arguments for constructing a GroupAlias resource.
type GroupAliasArgs struct {
	// ID of the group to which this is an alias.
	CanonicalId pulumi.StringInput
	// Mount accessor of the authentication backend to which this alias belongs to.
	MountAccessor pulumi.StringInput
	// Name of the group alias to create.
	Name pulumi.StringInput
}

func (GroupAliasArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*groupAliasArgs)(nil)).Elem()
}

type GroupAliasInput interface {
	pulumi.Input

	ToGroupAliasOutput() GroupAliasOutput
	ToGroupAliasOutputWithContext(ctx context.Context) GroupAliasOutput
}

func (*GroupAlias) ElementType() reflect.Type {
	return reflect.TypeOf((**GroupAlias)(nil)).Elem()
}

func (i *GroupAlias) ToGroupAliasOutput() GroupAliasOutput {
	return i.ToGroupAliasOutputWithContext(context.Background())
}

func (i *GroupAlias) ToGroupAliasOutputWithContext(ctx context.Context) GroupAliasOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupAliasOutput)
}

// GroupAliasArrayInput is an input type that accepts GroupAliasArray and GroupAliasArrayOutput values.
// You can construct a concrete instance of `GroupAliasArrayInput` via:
//
//	GroupAliasArray{ GroupAliasArgs{...} }
type GroupAliasArrayInput interface {
	pulumi.Input

	ToGroupAliasArrayOutput() GroupAliasArrayOutput
	ToGroupAliasArrayOutputWithContext(context.Context) GroupAliasArrayOutput
}

type GroupAliasArray []GroupAliasInput

func (GroupAliasArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GroupAlias)(nil)).Elem()
}

func (i GroupAliasArray) ToGroupAliasArrayOutput() GroupAliasArrayOutput {
	return i.ToGroupAliasArrayOutputWithContext(context.Background())
}

func (i GroupAliasArray) ToGroupAliasArrayOutputWithContext(ctx context.Context) GroupAliasArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupAliasArrayOutput)
}

// GroupAliasMapInput is an input type that accepts GroupAliasMap and GroupAliasMapOutput values.
// You can construct a concrete instance of `GroupAliasMapInput` via:
//
//	GroupAliasMap{ "key": GroupAliasArgs{...} }
type GroupAliasMapInput interface {
	pulumi.Input

	ToGroupAliasMapOutput() GroupAliasMapOutput
	ToGroupAliasMapOutputWithContext(context.Context) GroupAliasMapOutput
}

type GroupAliasMap map[string]GroupAliasInput

func (GroupAliasMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GroupAlias)(nil)).Elem()
}

func (i GroupAliasMap) ToGroupAliasMapOutput() GroupAliasMapOutput {
	return i.ToGroupAliasMapOutputWithContext(context.Background())
}

func (i GroupAliasMap) ToGroupAliasMapOutputWithContext(ctx context.Context) GroupAliasMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupAliasMapOutput)
}

type GroupAliasOutput struct{ *pulumi.OutputState }

func (GroupAliasOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GroupAlias)(nil)).Elem()
}

func (o GroupAliasOutput) ToGroupAliasOutput() GroupAliasOutput {
	return o
}

func (o GroupAliasOutput) ToGroupAliasOutputWithContext(ctx context.Context) GroupAliasOutput {
	return o
}

// ID of the group to which this is an alias.
func (o GroupAliasOutput) CanonicalId() pulumi.StringOutput {
	return o.ApplyT(func(v *GroupAlias) pulumi.StringOutput { return v.CanonicalId }).(pulumi.StringOutput)
}

// Mount accessor of the authentication backend to which this alias belongs to.
func (o GroupAliasOutput) MountAccessor() pulumi.StringOutput {
	return o.ApplyT(func(v *GroupAlias) pulumi.StringOutput { return v.MountAccessor }).(pulumi.StringOutput)
}

// Name of the group alias to create.
func (o GroupAliasOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GroupAlias) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type GroupAliasArrayOutput struct{ *pulumi.OutputState }

func (GroupAliasArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GroupAlias)(nil)).Elem()
}

func (o GroupAliasArrayOutput) ToGroupAliasArrayOutput() GroupAliasArrayOutput {
	return o
}

func (o GroupAliasArrayOutput) ToGroupAliasArrayOutputWithContext(ctx context.Context) GroupAliasArrayOutput {
	return o
}

func (o GroupAliasArrayOutput) Index(i pulumi.IntInput) GroupAliasOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GroupAlias {
		return vs[0].([]*GroupAlias)[vs[1].(int)]
	}).(GroupAliasOutput)
}

type GroupAliasMapOutput struct{ *pulumi.OutputState }

func (GroupAliasMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GroupAlias)(nil)).Elem()
}

func (o GroupAliasMapOutput) ToGroupAliasMapOutput() GroupAliasMapOutput {
	return o
}

func (o GroupAliasMapOutput) ToGroupAliasMapOutputWithContext(ctx context.Context) GroupAliasMapOutput {
	return o
}

func (o GroupAliasMapOutput) MapIndex(k pulumi.StringInput) GroupAliasOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GroupAlias {
		return vs[0].(map[string]*GroupAlias)[vs[1].(string)]
	}).(GroupAliasOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GroupAliasInput)(nil)).Elem(), &GroupAlias{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupAliasArrayInput)(nil)).Elem(), GroupAliasArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupAliasMapInput)(nil)).Elem(), GroupAliasMap{})
	pulumi.RegisterOutputType(GroupAliasOutput{})
	pulumi.RegisterOutputType(GroupAliasArrayOutput{})
	pulumi.RegisterOutputType(GroupAliasMapOutput{})
}
