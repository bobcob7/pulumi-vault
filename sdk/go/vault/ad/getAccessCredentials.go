// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ad

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetAccessCredentials(ctx *pulumi.Context, args *GetAccessCredentialsArgs, opts ...pulumi.InvokeOption) (*GetAccessCredentialsResult, error) {
	var rv GetAccessCredentialsResult
	err := ctx.Invoke("vault:ad/getAccessCredentials:getAccessCredentials", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccessCredentials.
type GetAccessCredentialsArgs struct {
	// The path to the AD secret backend to
	// read credentials from, with no leading or trailing `/`s.
	Backend string `pulumi:"backend"`
	// The name of the AD secret backend role to read
	// credentials from, with no leading or trailing `/`s.
	Role string `pulumi:"role"`
}

// A collection of values returned by getAccessCredentials.
type GetAccessCredentialsResult struct {
	Backend string `pulumi:"backend"`
	// The current set password on the Active Directory service account.
	CurrentPassword string `pulumi:"currentPassword"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The current set password on the Active Directory service account, provided because AD is eventually consistent.
	LastPassword string `pulumi:"lastPassword"`
	Role         string `pulumi:"role"`
	// The Active Directory service account username.
	Username string `pulumi:"username"`
}

func GetAccessCredentialsOutput(ctx *pulumi.Context, args GetAccessCredentialsOutputArgs, opts ...pulumi.InvokeOption) GetAccessCredentialsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAccessCredentialsResult, error) {
			args := v.(GetAccessCredentialsArgs)
			r, err := GetAccessCredentials(ctx, &args, opts...)
			var s GetAccessCredentialsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAccessCredentialsResultOutput)
}

// A collection of arguments for invoking getAccessCredentials.
type GetAccessCredentialsOutputArgs struct {
	// The path to the AD secret backend to
	// read credentials from, with no leading or trailing `/`s.
	Backend pulumi.StringInput `pulumi:"backend"`
	// The name of the AD secret backend role to read
	// credentials from, with no leading or trailing `/`s.
	Role pulumi.StringInput `pulumi:"role"`
}

func (GetAccessCredentialsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccessCredentialsArgs)(nil)).Elem()
}

// A collection of values returned by getAccessCredentials.
type GetAccessCredentialsResultOutput struct{ *pulumi.OutputState }

func (GetAccessCredentialsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccessCredentialsResult)(nil)).Elem()
}

func (o GetAccessCredentialsResultOutput) ToGetAccessCredentialsResultOutput() GetAccessCredentialsResultOutput {
	return o
}

func (o GetAccessCredentialsResultOutput) ToGetAccessCredentialsResultOutputWithContext(ctx context.Context) GetAccessCredentialsResultOutput {
	return o
}

func (o GetAccessCredentialsResultOutput) Backend() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessCredentialsResult) string { return v.Backend }).(pulumi.StringOutput)
}

// The current set password on the Active Directory service account.
func (o GetAccessCredentialsResultOutput) CurrentPassword() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessCredentialsResult) string { return v.CurrentPassword }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAccessCredentialsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessCredentialsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The current set password on the Active Directory service account, provided because AD is eventually consistent.
func (o GetAccessCredentialsResultOutput) LastPassword() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessCredentialsResult) string { return v.LastPassword }).(pulumi.StringOutput)
}

func (o GetAccessCredentialsResultOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessCredentialsResult) string { return v.Role }).(pulumi.StringOutput)
}

// The Active Directory service account username.
func (o GetAccessCredentialsResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessCredentialsResult) string { return v.Username }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAccessCredentialsResultOutput{})
}
