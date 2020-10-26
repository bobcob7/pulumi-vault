// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pkisecret

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Allows setting the duration for which the generated CRL should be marked valid. If the CRL is disabled, it will return a signed but zero-length CRL for any request. If enabled, it will re-build the CRL.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-vault/sdk/v3/go/vault"
// 	"github.com/pulumi/pulumi-vault/sdk/v3/go/vault/pkiSecret"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		pki, err := vault.NewMount(ctx, "pki", &vault.MountArgs{
// 			DefaultLeaseTtlSeconds: pulumi.Int(3600),
// 			MaxLeaseTtlSeconds:     pulumi.Int(86400),
// 			Path:                   pulumi.String(fmt.Sprintf("%v%v", "%", "s")),
// 			Type:                   pulumi.String("pki"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = pkiSecret.NewSecretBackendCrlConfig(ctx, "crlConfig", &pkiSecret.SecretBackendCrlConfigArgs{
// 			Backend: pki.Path,
// 			Disable: pulumi.Bool(false),
// 			Expiry:  pulumi.String("72h"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type SecretBackendCrlConfig struct {
	pulumi.CustomResourceState

	// The path the PKI secret backend is mounted at, with no leading or trailing `/`s.
	Backend pulumi.StringOutput `pulumi:"backend"`
	// Disables or enables CRL building.
	Disable pulumi.BoolPtrOutput `pulumi:"disable"`
	// Specifies the time until expiration.
	Expiry pulumi.StringPtrOutput `pulumi:"expiry"`
}

// NewSecretBackendCrlConfig registers a new resource with the given unique name, arguments, and options.
func NewSecretBackendCrlConfig(ctx *pulumi.Context,
	name string, args *SecretBackendCrlConfigArgs, opts ...pulumi.ResourceOption) (*SecretBackendCrlConfig, error) {
	if args == nil || args.Backend == nil {
		return nil, errors.New("missing required argument 'Backend'")
	}
	if args == nil {
		args = &SecretBackendCrlConfigArgs{}
	}
	var resource SecretBackendCrlConfig
	err := ctx.RegisterResource("vault:pkiSecret/secretBackendCrlConfig:SecretBackendCrlConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecretBackendCrlConfig gets an existing SecretBackendCrlConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecretBackendCrlConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecretBackendCrlConfigState, opts ...pulumi.ResourceOption) (*SecretBackendCrlConfig, error) {
	var resource SecretBackendCrlConfig
	err := ctx.ReadResource("vault:pkiSecret/secretBackendCrlConfig:SecretBackendCrlConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecretBackendCrlConfig resources.
type secretBackendCrlConfigState struct {
	// The path the PKI secret backend is mounted at, with no leading or trailing `/`s.
	Backend *string `pulumi:"backend"`
	// Disables or enables CRL building.
	Disable *bool `pulumi:"disable"`
	// Specifies the time until expiration.
	Expiry *string `pulumi:"expiry"`
}

type SecretBackendCrlConfigState struct {
	// The path the PKI secret backend is mounted at, with no leading or trailing `/`s.
	Backend pulumi.StringPtrInput
	// Disables or enables CRL building.
	Disable pulumi.BoolPtrInput
	// Specifies the time until expiration.
	Expiry pulumi.StringPtrInput
}

func (SecretBackendCrlConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*secretBackendCrlConfigState)(nil)).Elem()
}

type secretBackendCrlConfigArgs struct {
	// The path the PKI secret backend is mounted at, with no leading or trailing `/`s.
	Backend string `pulumi:"backend"`
	// Disables or enables CRL building.
	Disable *bool `pulumi:"disable"`
	// Specifies the time until expiration.
	Expiry *string `pulumi:"expiry"`
}

// The set of arguments for constructing a SecretBackendCrlConfig resource.
type SecretBackendCrlConfigArgs struct {
	// The path the PKI secret backend is mounted at, with no leading or trailing `/`s.
	Backend pulumi.StringInput
	// Disables or enables CRL building.
	Disable pulumi.BoolPtrInput
	// Specifies the time until expiration.
	Expiry pulumi.StringPtrInput
}

func (SecretBackendCrlConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*secretBackendCrlConfigArgs)(nil)).Elem()
}
