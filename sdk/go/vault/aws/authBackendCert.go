// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aws

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// AWS auth backend certificates can be imported using `auth/`, the `backend` path, `/config/certificate/`, and the `cert_name` e.g.
//
// ```sh
//
//	$ pulumi import vault:aws/authBackendCert:AuthBackendCert example auth/aws/config/certificate/my-cert
//
// ```
type AuthBackendCert struct {
	pulumi.CustomResourceState

	// The  Base64 encoded AWS Public key required to
	// verify PKCS7 signature of the EC2 instance metadata. You can find this key in
	// the [AWS
	// documentation](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-identity-documents.html).
	AwsPublicCert pulumi.StringOutput `pulumi:"awsPublicCert"`
	// The path the AWS auth backend being configured was
	// mounted at.  Defaults to `aws`.
	Backend pulumi.StringPtrOutput `pulumi:"backend"`
	// The name of the certificate.
	CertName pulumi.StringOutput `pulumi:"certName"`
	// Either "pkcs7" or "identity", indicating the type of
	// document which can be verified using the given certificate. Defaults to
	// "pkcs7".
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewAuthBackendCert registers a new resource with the given unique name, arguments, and options.
func NewAuthBackendCert(ctx *pulumi.Context,
	name string, args *AuthBackendCertArgs, opts ...pulumi.ResourceOption) (*AuthBackendCert, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AwsPublicCert == nil {
		return nil, errors.New("invalid value for required argument 'AwsPublicCert'")
	}
	if args.CertName == nil {
		return nil, errors.New("invalid value for required argument 'CertName'")
	}
	var resource AuthBackendCert
	err := ctx.RegisterResource("vault:aws/authBackendCert:AuthBackendCert", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthBackendCert gets an existing AuthBackendCert resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthBackendCert(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthBackendCertState, opts ...pulumi.ResourceOption) (*AuthBackendCert, error) {
	var resource AuthBackendCert
	err := ctx.ReadResource("vault:aws/authBackendCert:AuthBackendCert", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthBackendCert resources.
type authBackendCertState struct {
	// The  Base64 encoded AWS Public key required to
	// verify PKCS7 signature of the EC2 instance metadata. You can find this key in
	// the [AWS
	// documentation](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-identity-documents.html).
	AwsPublicCert *string `pulumi:"awsPublicCert"`
	// The path the AWS auth backend being configured was
	// mounted at.  Defaults to `aws`.
	Backend *string `pulumi:"backend"`
	// The name of the certificate.
	CertName *string `pulumi:"certName"`
	// Either "pkcs7" or "identity", indicating the type of
	// document which can be verified using the given certificate. Defaults to
	// "pkcs7".
	Type *string `pulumi:"type"`
}

type AuthBackendCertState struct {
	// The  Base64 encoded AWS Public key required to
	// verify PKCS7 signature of the EC2 instance metadata. You can find this key in
	// the [AWS
	// documentation](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-identity-documents.html).
	AwsPublicCert pulumi.StringPtrInput
	// The path the AWS auth backend being configured was
	// mounted at.  Defaults to `aws`.
	Backend pulumi.StringPtrInput
	// The name of the certificate.
	CertName pulumi.StringPtrInput
	// Either "pkcs7" or "identity", indicating the type of
	// document which can be verified using the given certificate. Defaults to
	// "pkcs7".
	Type pulumi.StringPtrInput
}

func (AuthBackendCertState) ElementType() reflect.Type {
	return reflect.TypeOf((*authBackendCertState)(nil)).Elem()
}

type authBackendCertArgs struct {
	// The  Base64 encoded AWS Public key required to
	// verify PKCS7 signature of the EC2 instance metadata. You can find this key in
	// the [AWS
	// documentation](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-identity-documents.html).
	AwsPublicCert string `pulumi:"awsPublicCert"`
	// The path the AWS auth backend being configured was
	// mounted at.  Defaults to `aws`.
	Backend *string `pulumi:"backend"`
	// The name of the certificate.
	CertName string `pulumi:"certName"`
	// Either "pkcs7" or "identity", indicating the type of
	// document which can be verified using the given certificate. Defaults to
	// "pkcs7".
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a AuthBackendCert resource.
type AuthBackendCertArgs struct {
	// The  Base64 encoded AWS Public key required to
	// verify PKCS7 signature of the EC2 instance metadata. You can find this key in
	// the [AWS
	// documentation](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-identity-documents.html).
	AwsPublicCert pulumi.StringInput
	// The path the AWS auth backend being configured was
	// mounted at.  Defaults to `aws`.
	Backend pulumi.StringPtrInput
	// The name of the certificate.
	CertName pulumi.StringInput
	// Either "pkcs7" or "identity", indicating the type of
	// document which can be verified using the given certificate. Defaults to
	// "pkcs7".
	Type pulumi.StringPtrInput
}

func (AuthBackendCertArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authBackendCertArgs)(nil)).Elem()
}

type AuthBackendCertInput interface {
	pulumi.Input

	ToAuthBackendCertOutput() AuthBackendCertOutput
	ToAuthBackendCertOutputWithContext(ctx context.Context) AuthBackendCertOutput
}

func (*AuthBackendCert) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthBackendCert)(nil)).Elem()
}

func (i *AuthBackendCert) ToAuthBackendCertOutput() AuthBackendCertOutput {
	return i.ToAuthBackendCertOutputWithContext(context.Background())
}

func (i *AuthBackendCert) ToAuthBackendCertOutputWithContext(ctx context.Context) AuthBackendCertOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendCertOutput)
}

// AuthBackendCertArrayInput is an input type that accepts AuthBackendCertArray and AuthBackendCertArrayOutput values.
// You can construct a concrete instance of `AuthBackendCertArrayInput` via:
//
//	AuthBackendCertArray{ AuthBackendCertArgs{...} }
type AuthBackendCertArrayInput interface {
	pulumi.Input

	ToAuthBackendCertArrayOutput() AuthBackendCertArrayOutput
	ToAuthBackendCertArrayOutputWithContext(context.Context) AuthBackendCertArrayOutput
}

type AuthBackendCertArray []AuthBackendCertInput

func (AuthBackendCertArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthBackendCert)(nil)).Elem()
}

func (i AuthBackendCertArray) ToAuthBackendCertArrayOutput() AuthBackendCertArrayOutput {
	return i.ToAuthBackendCertArrayOutputWithContext(context.Background())
}

func (i AuthBackendCertArray) ToAuthBackendCertArrayOutputWithContext(ctx context.Context) AuthBackendCertArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendCertArrayOutput)
}

// AuthBackendCertMapInput is an input type that accepts AuthBackendCertMap and AuthBackendCertMapOutput values.
// You can construct a concrete instance of `AuthBackendCertMapInput` via:
//
//	AuthBackendCertMap{ "key": AuthBackendCertArgs{...} }
type AuthBackendCertMapInput interface {
	pulumi.Input

	ToAuthBackendCertMapOutput() AuthBackendCertMapOutput
	ToAuthBackendCertMapOutputWithContext(context.Context) AuthBackendCertMapOutput
}

type AuthBackendCertMap map[string]AuthBackendCertInput

func (AuthBackendCertMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthBackendCert)(nil)).Elem()
}

func (i AuthBackendCertMap) ToAuthBackendCertMapOutput() AuthBackendCertMapOutput {
	return i.ToAuthBackendCertMapOutputWithContext(context.Background())
}

func (i AuthBackendCertMap) ToAuthBackendCertMapOutputWithContext(ctx context.Context) AuthBackendCertMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendCertMapOutput)
}

type AuthBackendCertOutput struct{ *pulumi.OutputState }

func (AuthBackendCertOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthBackendCert)(nil)).Elem()
}

func (o AuthBackendCertOutput) ToAuthBackendCertOutput() AuthBackendCertOutput {
	return o
}

func (o AuthBackendCertOutput) ToAuthBackendCertOutputWithContext(ctx context.Context) AuthBackendCertOutput {
	return o
}

// The  Base64 encoded AWS Public key required to
// verify PKCS7 signature of the EC2 instance metadata. You can find this key in
// the [AWS
// documentation](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-identity-documents.html).
func (o AuthBackendCertOutput) AwsPublicCert() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthBackendCert) pulumi.StringOutput { return v.AwsPublicCert }).(pulumi.StringOutput)
}

// The path the AWS auth backend being configured was
// mounted at.  Defaults to `aws`.
func (o AuthBackendCertOutput) Backend() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendCert) pulumi.StringPtrOutput { return v.Backend }).(pulumi.StringPtrOutput)
}

// The name of the certificate.
func (o AuthBackendCertOutput) CertName() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthBackendCert) pulumi.StringOutput { return v.CertName }).(pulumi.StringOutput)
}

// Either "pkcs7" or "identity", indicating the type of
// document which can be verified using the given certificate. Defaults to
// "pkcs7".
func (o AuthBackendCertOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendCert) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

type AuthBackendCertArrayOutput struct{ *pulumi.OutputState }

func (AuthBackendCertArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthBackendCert)(nil)).Elem()
}

func (o AuthBackendCertArrayOutput) ToAuthBackendCertArrayOutput() AuthBackendCertArrayOutput {
	return o
}

func (o AuthBackendCertArrayOutput) ToAuthBackendCertArrayOutputWithContext(ctx context.Context) AuthBackendCertArrayOutput {
	return o
}

func (o AuthBackendCertArrayOutput) Index(i pulumi.IntInput) AuthBackendCertOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthBackendCert {
		return vs[0].([]*AuthBackendCert)[vs[1].(int)]
	}).(AuthBackendCertOutput)
}

type AuthBackendCertMapOutput struct{ *pulumi.OutputState }

func (AuthBackendCertMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthBackendCert)(nil)).Elem()
}

func (o AuthBackendCertMapOutput) ToAuthBackendCertMapOutput() AuthBackendCertMapOutput {
	return o
}

func (o AuthBackendCertMapOutput) ToAuthBackendCertMapOutputWithContext(ctx context.Context) AuthBackendCertMapOutput {
	return o
}

func (o AuthBackendCertMapOutput) MapIndex(k pulumi.StringInput) AuthBackendCertOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthBackendCert {
		return vs[0].(map[string]*AuthBackendCert)[vs[1].(string)]
	}).(AuthBackendCertOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendCertInput)(nil)).Elem(), &AuthBackendCert{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendCertArrayInput)(nil)).Elem(), AuthBackendCertArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthBackendCertMapInput)(nil)).Elem(), AuthBackendCertMap{})
	pulumi.RegisterOutputType(AuthBackendCertOutput{})
	pulumi.RegisterOutputType(AuthBackendCertArrayOutput{})
	pulumi.RegisterOutputType(AuthBackendCertMapOutput{})
}
