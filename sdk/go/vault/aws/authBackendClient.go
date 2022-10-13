// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aws

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
//
//	"github.com/pulumi/pulumi-vault/sdk/v5/go/vault"
//	"github.com/pulumi/pulumi-vault/sdk/v5/go/vault/aws"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleAuthBackend, err := vault.NewAuthBackend(ctx, "exampleAuthBackend", &vault.AuthBackendArgs{
//				Type: pulumi.String("aws"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = aws.NewAuthBackendClient(ctx, "exampleAuthBackendClient", &aws.AuthBackendClientArgs{
//				Backend:   exampleAuthBackend.Path,
//				AccessKey: pulumi.String("INSERT_AWS_ACCESS_KEY"),
//				SecretKey: pulumi.String("INSERT_AWS_SECRET_KEY"),
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
// AWS auth backend clients can be imported using `auth/`, the `backend` path, and `/config/client` e.g.
//
// ```sh
//
//	$ pulumi import vault:aws/authBackendClient:AuthBackendClient example auth/aws/config/client
//
// ```
type AuthBackendClient struct {
	pulumi.CustomResourceState

	// The AWS access key that Vault should use for the
	// auth backend.
	AccessKey pulumi.StringPtrOutput `pulumi:"accessKey"`
	// The path the AWS auth backend being configured was
	// mounted at.  Defaults to `aws`.
	Backend pulumi.StringPtrOutput `pulumi:"backend"`
	// Override the URL Vault uses when making EC2 API
	// calls.
	Ec2Endpoint pulumi.StringPtrOutput `pulumi:"ec2Endpoint"`
	// Override the URL Vault uses when making IAM API
	// calls.
	IamEndpoint pulumi.StringPtrOutput `pulumi:"iamEndpoint"`
	// The value to require in the
	// `X-Vault-AWS-IAM-Server-ID` header as part of `GetCallerIdentity` requests
	// that are used in the IAM auth method.
	IamServerIdHeaderValue pulumi.StringPtrOutput `pulumi:"iamServerIdHeaderValue"`
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace pulumi.StringPtrOutput `pulumi:"namespace"`
	// The AWS secret key that Vault should use for the
	// auth backend.
	SecretKey pulumi.StringPtrOutput `pulumi:"secretKey"`
	// Override the URL Vault uses when making STS API
	// calls.
	StsEndpoint pulumi.StringPtrOutput `pulumi:"stsEndpoint"`
	// Override the default region when making STS API
	// calls. The `stsEndpoint` argument must be set when using `stsRegion`.
	StsRegion pulumi.StringPtrOutput `pulumi:"stsRegion"`
}

// NewAuthBackendClient registers a new resource with the given unique name, arguments, and options.
func NewAuthBackendClient(ctx *pulumi.Context,
	name string, args *AuthBackendClientArgs, opts ...pulumi.ResourceOption) (*AuthBackendClient, error) {
	if args == nil {
		args = &AuthBackendClientArgs{}
	}

	if args.AccessKey != nil {
		args.AccessKey = pulumi.ToSecret(args.AccessKey).(pulumi.StringPtrOutput)
	}
	if args.SecretKey != nil {
		args.SecretKey = pulumi.ToSecret(args.SecretKey).(pulumi.StringPtrOutput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"accessKey",
		"secretKey",
	})
	opts = append(opts, secrets)
	var resource AuthBackendClient
	err := ctx.RegisterResource("vault:aws/authBackendClient:AuthBackendClient", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthBackendClient gets an existing AuthBackendClient resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthBackendClient(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthBackendClientState, opts ...pulumi.ResourceOption) (*AuthBackendClient, error) {
	var resource AuthBackendClient
	err := ctx.ReadResource("vault:aws/authBackendClient:AuthBackendClient", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthBackendClient resources.
type authBackendClientState struct {
	// The AWS access key that Vault should use for the
	// auth backend.
	AccessKey *string `pulumi:"accessKey"`
	// The path the AWS auth backend being configured was
	// mounted at.  Defaults to `aws`.
	Backend *string `pulumi:"backend"`
	// Override the URL Vault uses when making EC2 API
	// calls.
	Ec2Endpoint *string `pulumi:"ec2Endpoint"`
	// Override the URL Vault uses when making IAM API
	// calls.
	IamEndpoint *string `pulumi:"iamEndpoint"`
	// The value to require in the
	// `X-Vault-AWS-IAM-Server-ID` header as part of `GetCallerIdentity` requests
	// that are used in the IAM auth method.
	IamServerIdHeaderValue *string `pulumi:"iamServerIdHeaderValue"`
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace *string `pulumi:"namespace"`
	// The AWS secret key that Vault should use for the
	// auth backend.
	SecretKey *string `pulumi:"secretKey"`
	// Override the URL Vault uses when making STS API
	// calls.
	StsEndpoint *string `pulumi:"stsEndpoint"`
	// Override the default region when making STS API
	// calls. The `stsEndpoint` argument must be set when using `stsRegion`.
	StsRegion *string `pulumi:"stsRegion"`
}

type AuthBackendClientState struct {
	// The AWS access key that Vault should use for the
	// auth backend.
	AccessKey pulumi.StringPtrInput
	// The path the AWS auth backend being configured was
	// mounted at.  Defaults to `aws`.
	Backend pulumi.StringPtrInput
	// Override the URL Vault uses when making EC2 API
	// calls.
	Ec2Endpoint pulumi.StringPtrInput
	// Override the URL Vault uses when making IAM API
	// calls.
	IamEndpoint pulumi.StringPtrInput
	// The value to require in the
	// `X-Vault-AWS-IAM-Server-ID` header as part of `GetCallerIdentity` requests
	// that are used in the IAM auth method.
	IamServerIdHeaderValue pulumi.StringPtrInput
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace pulumi.StringPtrInput
	// The AWS secret key that Vault should use for the
	// auth backend.
	SecretKey pulumi.StringPtrInput
	// Override the URL Vault uses when making STS API
	// calls.
	StsEndpoint pulumi.StringPtrInput
	// Override the default region when making STS API
	// calls. The `stsEndpoint` argument must be set when using `stsRegion`.
	StsRegion pulumi.StringPtrInput
}

func (AuthBackendClientState) ElementType() reflect.Type {
	return reflect.TypeOf((*authBackendClientState)(nil)).Elem()
}

type authBackendClientArgs struct {
	// The AWS access key that Vault should use for the
	// auth backend.
	AccessKey *string `pulumi:"accessKey"`
	// The path the AWS auth backend being configured was
	// mounted at.  Defaults to `aws`.
	Backend *string `pulumi:"backend"`
	// Override the URL Vault uses when making EC2 API
	// calls.
	Ec2Endpoint *string `pulumi:"ec2Endpoint"`
	// Override the URL Vault uses when making IAM API
	// calls.
	IamEndpoint *string `pulumi:"iamEndpoint"`
	// The value to require in the
	// `X-Vault-AWS-IAM-Server-ID` header as part of `GetCallerIdentity` requests
	// that are used in the IAM auth method.
	IamServerIdHeaderValue *string `pulumi:"iamServerIdHeaderValue"`
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace *string `pulumi:"namespace"`
	// The AWS secret key that Vault should use for the
	// auth backend.
	SecretKey *string `pulumi:"secretKey"`
	// Override the URL Vault uses when making STS API
	// calls.
	StsEndpoint *string `pulumi:"stsEndpoint"`
	// Override the default region when making STS API
	// calls. The `stsEndpoint` argument must be set when using `stsRegion`.
	StsRegion *string `pulumi:"stsRegion"`
}

// The set of arguments for constructing a AuthBackendClient resource.
type AuthBackendClientArgs struct {
	// The AWS access key that Vault should use for the
	// auth backend.
	AccessKey pulumi.StringPtrInput
	// The path the AWS auth backend being configured was
	// mounted at.  Defaults to `aws`.
	Backend pulumi.StringPtrInput
	// Override the URL Vault uses when making EC2 API
	// calls.
	Ec2Endpoint pulumi.StringPtrInput
	// Override the URL Vault uses when making IAM API
	// calls.
	IamEndpoint pulumi.StringPtrInput
	// The value to require in the
	// `X-Vault-AWS-IAM-Server-ID` header as part of `GetCallerIdentity` requests
	// that are used in the IAM auth method.
	IamServerIdHeaderValue pulumi.StringPtrInput
	// The namespace to provision the resource in.
	// The value should not contain leading or trailing forward slashes.
	// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
	// *Available only for Vault Enterprise*.
	Namespace pulumi.StringPtrInput
	// The AWS secret key that Vault should use for the
	// auth backend.
	SecretKey pulumi.StringPtrInput
	// Override the URL Vault uses when making STS API
	// calls.
	StsEndpoint pulumi.StringPtrInput
	// Override the default region when making STS API
	// calls. The `stsEndpoint` argument must be set when using `stsRegion`.
	StsRegion pulumi.StringPtrInput
}

func (AuthBackendClientArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authBackendClientArgs)(nil)).Elem()
}

type AuthBackendClientInput interface {
	pulumi.Input

	ToAuthBackendClientOutput() AuthBackendClientOutput
	ToAuthBackendClientOutputWithContext(ctx context.Context) AuthBackendClientOutput
}

func (*AuthBackendClient) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthBackendClient)(nil)).Elem()
}

func (i *AuthBackendClient) ToAuthBackendClientOutput() AuthBackendClientOutput {
	return i.ToAuthBackendClientOutputWithContext(context.Background())
}

func (i *AuthBackendClient) ToAuthBackendClientOutputWithContext(ctx context.Context) AuthBackendClientOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendClientOutput)
}

// AuthBackendClientArrayInput is an input type that accepts AuthBackendClientArray and AuthBackendClientArrayOutput values.
// You can construct a concrete instance of `AuthBackendClientArrayInput` via:
//
//	AuthBackendClientArray{ AuthBackendClientArgs{...} }
type AuthBackendClientArrayInput interface {
	pulumi.Input

	ToAuthBackendClientArrayOutput() AuthBackendClientArrayOutput
	ToAuthBackendClientArrayOutputWithContext(context.Context) AuthBackendClientArrayOutput
}

type AuthBackendClientArray []AuthBackendClientInput

func (AuthBackendClientArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthBackendClient)(nil)).Elem()
}

func (i AuthBackendClientArray) ToAuthBackendClientArrayOutput() AuthBackendClientArrayOutput {
	return i.ToAuthBackendClientArrayOutputWithContext(context.Background())
}

func (i AuthBackendClientArray) ToAuthBackendClientArrayOutputWithContext(ctx context.Context) AuthBackendClientArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendClientArrayOutput)
}

// AuthBackendClientMapInput is an input type that accepts AuthBackendClientMap and AuthBackendClientMapOutput values.
// You can construct a concrete instance of `AuthBackendClientMapInput` via:
//
//	AuthBackendClientMap{ "key": AuthBackendClientArgs{...} }
type AuthBackendClientMapInput interface {
	pulumi.Input

	ToAuthBackendClientMapOutput() AuthBackendClientMapOutput
	ToAuthBackendClientMapOutputWithContext(context.Context) AuthBackendClientMapOutput
}

type AuthBackendClientMap map[string]AuthBackendClientInput

func (AuthBackendClientMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthBackendClient)(nil)).Elem()
}

func (i AuthBackendClientMap) ToAuthBackendClientMapOutput() AuthBackendClientMapOutput {
	return i.ToAuthBackendClientMapOutputWithContext(context.Background())
}

func (i AuthBackendClientMap) ToAuthBackendClientMapOutputWithContext(ctx context.Context) AuthBackendClientMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendClientMapOutput)
}

type AuthBackendClientOutput struct{ *pulumi.OutputState }

func (AuthBackendClientOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthBackendClient)(nil)).Elem()
}

func (o AuthBackendClientOutput) ToAuthBackendClientOutput() AuthBackendClientOutput {
	return o
}

func (o AuthBackendClientOutput) ToAuthBackendClientOutputWithContext(ctx context.Context) AuthBackendClientOutput {
	return o
}

// The AWS access key that Vault should use for the
// auth backend.
func (o AuthBackendClientOutput) AccessKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendClient) pulumi.StringPtrOutput { return v.AccessKey }).(pulumi.StringPtrOutput)
}

// The path the AWS auth backend being configured was
// mounted at.  Defaults to `aws`.
func (o AuthBackendClientOutput) Backend() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendClient) pulumi.StringPtrOutput { return v.Backend }).(pulumi.StringPtrOutput)
}

// Override the URL Vault uses when making EC2 API
// calls.
func (o AuthBackendClientOutput) Ec2Endpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendClient) pulumi.StringPtrOutput { return v.Ec2Endpoint }).(pulumi.StringPtrOutput)
}

// Override the URL Vault uses when making IAM API
// calls.
func (o AuthBackendClientOutput) IamEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendClient) pulumi.StringPtrOutput { return v.IamEndpoint }).(pulumi.StringPtrOutput)
}

// The value to require in the
// `X-Vault-AWS-IAM-Server-ID` header as part of `GetCallerIdentity` requests
// that are used in the IAM auth method.
func (o AuthBackendClientOutput) IamServerIdHeaderValue() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendClient) pulumi.StringPtrOutput { return v.IamServerIdHeaderValue }).(pulumi.StringPtrOutput)
}

// The namespace to provision the resource in.
// The value should not contain leading or trailing forward slashes.
// The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
// *Available only for Vault Enterprise*.
func (o AuthBackendClientOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendClient) pulumi.StringPtrOutput { return v.Namespace }).(pulumi.StringPtrOutput)
}

// The AWS secret key that Vault should use for the
// auth backend.
func (o AuthBackendClientOutput) SecretKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendClient) pulumi.StringPtrOutput { return v.SecretKey }).(pulumi.StringPtrOutput)
}

// Override the URL Vault uses when making STS API
// calls.
func (o AuthBackendClientOutput) StsEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendClient) pulumi.StringPtrOutput { return v.StsEndpoint }).(pulumi.StringPtrOutput)
}

// Override the default region when making STS API
// calls. The `stsEndpoint` argument must be set when using `stsRegion`.
func (o AuthBackendClientOutput) StsRegion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendClient) pulumi.StringPtrOutput { return v.StsRegion }).(pulumi.StringPtrOutput)
}

type AuthBackendClientArrayOutput struct{ *pulumi.OutputState }

func (AuthBackendClientArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthBackendClient)(nil)).Elem()
}

func (o AuthBackendClientArrayOutput) ToAuthBackendClientArrayOutput() AuthBackendClientArrayOutput {
	return o
}

func (o AuthBackendClientArrayOutput) ToAuthBackendClientArrayOutputWithContext(ctx context.Context) AuthBackendClientArrayOutput {
	return o
}

func (o AuthBackendClientArrayOutput) Index(i pulumi.IntInput) AuthBackendClientOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthBackendClient {
		return vs[0].([]*AuthBackendClient)[vs[1].(int)]
	}).(AuthBackendClientOutput)
}

type AuthBackendClientMapOutput struct{ *pulumi.OutputState }

func (AuthBackendClientMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthBackendClient)(nil)).Elem()
}

func (o AuthBackendClientMapOutput) ToAuthBackendClientMapOutput() AuthBackendClientMapOutput {
	return o
}

func (o AuthBackendClientMapOutput) ToAuthBackendClientMapOutputWithContext(ctx context.Context) AuthBackendClientMapOutput {
	return o
}

func (o AuthBackendClientMapOutput) MapIndex(k pulumi.StringInput) AuthBackendClientOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthBackendClient {
		return vs[0].(map[string]*AuthBackendClient)[vs[1].(string)]
	}).(AuthBackendClientOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendClientInput)(nil)).Elem(), &AuthBackendClient{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendClientArrayInput)(nil)).Elem(), AuthBackendClientArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendClientMapInput)(nil)).Elem(), AuthBackendClientMap{})
	pulumi.RegisterOutputType(AuthBackendClientOutput{})
	pulumi.RegisterOutputType(AuthBackendClientArrayOutput{})
	pulumi.RegisterOutputType(AuthBackendClientMapOutput{})
}
