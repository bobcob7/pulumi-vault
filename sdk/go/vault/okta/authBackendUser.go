// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package okta

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a resource to create a user in an
// [Okta auth backend within Vault](https://www.vaultproject.io/docs/auth/okta.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-vault/sdk/v2/go/vault/okta"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		example, err := okta.NewAuthBackend(ctx, "example", &okta.AuthBackendArgs{
// 			Organization: pulumi.String("dummy"),
// 			Path:         pulumi.String("user_okta"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = okta.NewAuthBackendUser(ctx, "foo", &okta.AuthBackendUserArgs{
// 			Groups: pulumi.StringArray{
// 				pulumi.String("one"),
// 				pulumi.String("two"),
// 			},
// 			Path:     example.Path,
// 			Username: pulumi.String("foo"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type AuthBackendUser struct {
	pulumi.CustomResourceState

	// List of Okta groups to associate with this user
	Groups pulumi.StringArrayOutput `pulumi:"groups"`
	// The path where the Okta auth backend is mounted
	Path pulumi.StringOutput `pulumi:"path"`
	// List of Vault policies to associate with this user
	Policies pulumi.StringArrayOutput `pulumi:"policies"`
	// Name of the user within Okta
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewAuthBackendUser registers a new resource with the given unique name, arguments, and options.
func NewAuthBackendUser(ctx *pulumi.Context,
	name string, args *AuthBackendUserArgs, opts ...pulumi.ResourceOption) (*AuthBackendUser, error) {
	if args == nil || args.Path == nil {
		return nil, errors.New("missing required argument 'Path'")
	}
	if args == nil || args.Username == nil {
		return nil, errors.New("missing required argument 'Username'")
	}
	if args == nil {
		args = &AuthBackendUserArgs{}
	}
	var resource AuthBackendUser
	err := ctx.RegisterResource("vault:okta/authBackendUser:AuthBackendUser", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthBackendUser gets an existing AuthBackendUser resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthBackendUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthBackendUserState, opts ...pulumi.ResourceOption) (*AuthBackendUser, error) {
	var resource AuthBackendUser
	err := ctx.ReadResource("vault:okta/authBackendUser:AuthBackendUser", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthBackendUser resources.
type authBackendUserState struct {
	// List of Okta groups to associate with this user
	Groups []string `pulumi:"groups"`
	// The path where the Okta auth backend is mounted
	Path *string `pulumi:"path"`
	// List of Vault policies to associate with this user
	Policies []string `pulumi:"policies"`
	// Name of the user within Okta
	Username *string `pulumi:"username"`
}

type AuthBackendUserState struct {
	// List of Okta groups to associate with this user
	Groups pulumi.StringArrayInput
	// The path where the Okta auth backend is mounted
	Path pulumi.StringPtrInput
	// List of Vault policies to associate with this user
	Policies pulumi.StringArrayInput
	// Name of the user within Okta
	Username pulumi.StringPtrInput
}

func (AuthBackendUserState) ElementType() reflect.Type {
	return reflect.TypeOf((*authBackendUserState)(nil)).Elem()
}

type authBackendUserArgs struct {
	// List of Okta groups to associate with this user
	Groups []string `pulumi:"groups"`
	// The path where the Okta auth backend is mounted
	Path string `pulumi:"path"`
	// List of Vault policies to associate with this user
	Policies []string `pulumi:"policies"`
	// Name of the user within Okta
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a AuthBackendUser resource.
type AuthBackendUserArgs struct {
	// List of Okta groups to associate with this user
	Groups pulumi.StringArrayInput
	// The path where the Okta auth backend is mounted
	Path pulumi.StringInput
	// List of Vault policies to associate with this user
	Policies pulumi.StringArrayInput
	// Name of the user within Okta
	Username pulumi.StringInput
}

func (AuthBackendUserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authBackendUserArgs)(nil)).Elem()
}
