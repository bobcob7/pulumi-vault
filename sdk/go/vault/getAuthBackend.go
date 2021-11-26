// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vault

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-vault/sdk/v5/go/vault"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := vault.LookupAuthBackend(ctx, &GetAuthBackendArgs{
// 			Path: "userpass",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupAuthBackend(ctx *pulumi.Context, args *LookupAuthBackendArgs, opts ...pulumi.InvokeOption) (*LookupAuthBackendResult, error) {
	var rv LookupAuthBackendResult
	err := ctx.Invoke("vault:index/getAuthBackend:getAuthBackend", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAuthBackend.
type LookupAuthBackendArgs struct {
	// The auth backend mount point.
	Path string `pulumi:"path"`
}

// A collection of values returned by getAuthBackend.
type LookupAuthBackendResult struct {
	// The accessor for this auth method
	Accessor string `pulumi:"accessor"`
	// The default lease duration in seconds.
	DefaultLeaseTtlSeconds int `pulumi:"defaultLeaseTtlSeconds"`
	// A description of the auth method.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Specifies whether to show this mount in the UI-specific listing endpoint.
	ListingVisibility string `pulumi:"listingVisibility"`
	// Specifies if the auth method is local only.
	Local bool `pulumi:"local"`
	// The maximum lease duration in seconds.
	MaxLeaseTtlSeconds int    `pulumi:"maxLeaseTtlSeconds"`
	Path               string `pulumi:"path"`
	// The name of the auth method type.
	Type string `pulumi:"type"`
}

func LookupAuthBackendOutput(ctx *pulumi.Context, args LookupAuthBackendOutputArgs, opts ...pulumi.InvokeOption) LookupAuthBackendResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAuthBackendResult, error) {
			args := v.(LookupAuthBackendArgs)
			r, err := LookupAuthBackend(ctx, &args, opts...)
			return *r, err
		}).(LookupAuthBackendResultOutput)
}

// A collection of arguments for invoking getAuthBackend.
type LookupAuthBackendOutputArgs struct {
	// The auth backend mount point.
	Path pulumi.StringInput `pulumi:"path"`
}

func (LookupAuthBackendOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAuthBackendArgs)(nil)).Elem()
}

// A collection of values returned by getAuthBackend.
type LookupAuthBackendResultOutput struct{ *pulumi.OutputState }

func (LookupAuthBackendResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAuthBackendResult)(nil)).Elem()
}

func (o LookupAuthBackendResultOutput) ToLookupAuthBackendResultOutput() LookupAuthBackendResultOutput {
	return o
}

func (o LookupAuthBackendResultOutput) ToLookupAuthBackendResultOutputWithContext(ctx context.Context) LookupAuthBackendResultOutput {
	return o
}

// The accessor for this auth method
func (o LookupAuthBackendResultOutput) Accessor() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthBackendResult) string { return v.Accessor }).(pulumi.StringOutput)
}

// The default lease duration in seconds.
func (o LookupAuthBackendResultOutput) DefaultLeaseTtlSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v LookupAuthBackendResult) int { return v.DefaultLeaseTtlSeconds }).(pulumi.IntOutput)
}

// A description of the auth method.
func (o LookupAuthBackendResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthBackendResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAuthBackendResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthBackendResult) string { return v.Id }).(pulumi.StringOutput)
}

// Specifies whether to show this mount in the UI-specific listing endpoint.
func (o LookupAuthBackendResultOutput) ListingVisibility() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthBackendResult) string { return v.ListingVisibility }).(pulumi.StringOutput)
}

// Specifies if the auth method is local only.
func (o LookupAuthBackendResultOutput) Local() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAuthBackendResult) bool { return v.Local }).(pulumi.BoolOutput)
}

// The maximum lease duration in seconds.
func (o LookupAuthBackendResultOutput) MaxLeaseTtlSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v LookupAuthBackendResult) int { return v.MaxLeaseTtlSeconds }).(pulumi.IntOutput)
}

func (o LookupAuthBackendResultOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthBackendResult) string { return v.Path }).(pulumi.StringOutput)
}

// The name of the auth method type.
func (o LookupAuthBackendResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthBackendResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAuthBackendResultOutput{})
}
