// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pkisecret

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type SecretBackendIntermediateSetSigned struct {
	pulumi.CustomResourceState

	// The PKI secret backend the resource belongs to.
	Backend pulumi.StringOutput `pulumi:"backend"`
	// The certificate
	Certificate pulumi.StringOutput `pulumi:"certificate"`
}

// NewSecretBackendIntermediateSetSigned registers a new resource with the given unique name, arguments, and options.
func NewSecretBackendIntermediateSetSigned(ctx *pulumi.Context,
	name string, args *SecretBackendIntermediateSetSignedArgs, opts ...pulumi.ResourceOption) (*SecretBackendIntermediateSetSigned, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Backend == nil {
		return nil, errors.New("invalid value for required argument 'Backend'")
	}
	if args.Certificate == nil {
		return nil, errors.New("invalid value for required argument 'Certificate'")
	}
	var resource SecretBackendIntermediateSetSigned
	err := ctx.RegisterResource("vault:pkiSecret/secretBackendIntermediateSetSigned:SecretBackendIntermediateSetSigned", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecretBackendIntermediateSetSigned gets an existing SecretBackendIntermediateSetSigned resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecretBackendIntermediateSetSigned(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecretBackendIntermediateSetSignedState, opts ...pulumi.ResourceOption) (*SecretBackendIntermediateSetSigned, error) {
	var resource SecretBackendIntermediateSetSigned
	err := ctx.ReadResource("vault:pkiSecret/secretBackendIntermediateSetSigned:SecretBackendIntermediateSetSigned", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecretBackendIntermediateSetSigned resources.
type secretBackendIntermediateSetSignedState struct {
	// The PKI secret backend the resource belongs to.
	Backend *string `pulumi:"backend"`
	// The certificate
	Certificate *string `pulumi:"certificate"`
}

type SecretBackendIntermediateSetSignedState struct {
	// The PKI secret backend the resource belongs to.
	Backend pulumi.StringPtrInput
	// The certificate
	Certificate pulumi.StringPtrInput
}

func (SecretBackendIntermediateSetSignedState) ElementType() reflect.Type {
	return reflect.TypeOf((*secretBackendIntermediateSetSignedState)(nil)).Elem()
}

type secretBackendIntermediateSetSignedArgs struct {
	// The PKI secret backend the resource belongs to.
	Backend string `pulumi:"backend"`
	// The certificate
	Certificate string `pulumi:"certificate"`
}

// The set of arguments for constructing a SecretBackendIntermediateSetSigned resource.
type SecretBackendIntermediateSetSignedArgs struct {
	// The PKI secret backend the resource belongs to.
	Backend pulumi.StringInput
	// The certificate
	Certificate pulumi.StringInput
}

func (SecretBackendIntermediateSetSignedArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*secretBackendIntermediateSetSignedArgs)(nil)).Elem()
}

type SecretBackendIntermediateSetSignedInput interface {
	pulumi.Input

	ToSecretBackendIntermediateSetSignedOutput() SecretBackendIntermediateSetSignedOutput
	ToSecretBackendIntermediateSetSignedOutputWithContext(ctx context.Context) SecretBackendIntermediateSetSignedOutput
}

func (*SecretBackendIntermediateSetSigned) ElementType() reflect.Type {
	return reflect.TypeOf((*SecretBackendIntermediateSetSigned)(nil))
}

func (i *SecretBackendIntermediateSetSigned) ToSecretBackendIntermediateSetSignedOutput() SecretBackendIntermediateSetSignedOutput {
	return i.ToSecretBackendIntermediateSetSignedOutputWithContext(context.Background())
}

func (i *SecretBackendIntermediateSetSigned) ToSecretBackendIntermediateSetSignedOutputWithContext(ctx context.Context) SecretBackendIntermediateSetSignedOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretBackendIntermediateSetSignedOutput)
}

func (i *SecretBackendIntermediateSetSigned) ToSecretBackendIntermediateSetSignedPtrOutput() SecretBackendIntermediateSetSignedPtrOutput {
	return i.ToSecretBackendIntermediateSetSignedPtrOutputWithContext(context.Background())
}

func (i *SecretBackendIntermediateSetSigned) ToSecretBackendIntermediateSetSignedPtrOutputWithContext(ctx context.Context) SecretBackendIntermediateSetSignedPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretBackendIntermediateSetSignedPtrOutput)
}

type SecretBackendIntermediateSetSignedPtrInput interface {
	pulumi.Input

	ToSecretBackendIntermediateSetSignedPtrOutput() SecretBackendIntermediateSetSignedPtrOutput
	ToSecretBackendIntermediateSetSignedPtrOutputWithContext(ctx context.Context) SecretBackendIntermediateSetSignedPtrOutput
}

type secretBackendIntermediateSetSignedPtrType SecretBackendIntermediateSetSignedArgs

func (*secretBackendIntermediateSetSignedPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretBackendIntermediateSetSigned)(nil))
}

func (i *secretBackendIntermediateSetSignedPtrType) ToSecretBackendIntermediateSetSignedPtrOutput() SecretBackendIntermediateSetSignedPtrOutput {
	return i.ToSecretBackendIntermediateSetSignedPtrOutputWithContext(context.Background())
}

func (i *secretBackendIntermediateSetSignedPtrType) ToSecretBackendIntermediateSetSignedPtrOutputWithContext(ctx context.Context) SecretBackendIntermediateSetSignedPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretBackendIntermediateSetSignedPtrOutput)
}

// SecretBackendIntermediateSetSignedArrayInput is an input type that accepts SecretBackendIntermediateSetSignedArray and SecretBackendIntermediateSetSignedArrayOutput values.
// You can construct a concrete instance of `SecretBackendIntermediateSetSignedArrayInput` via:
//
//          SecretBackendIntermediateSetSignedArray{ SecretBackendIntermediateSetSignedArgs{...} }
type SecretBackendIntermediateSetSignedArrayInput interface {
	pulumi.Input

	ToSecretBackendIntermediateSetSignedArrayOutput() SecretBackendIntermediateSetSignedArrayOutput
	ToSecretBackendIntermediateSetSignedArrayOutputWithContext(context.Context) SecretBackendIntermediateSetSignedArrayOutput
}

type SecretBackendIntermediateSetSignedArray []SecretBackendIntermediateSetSignedInput

func (SecretBackendIntermediateSetSignedArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*SecretBackendIntermediateSetSigned)(nil))
}

func (i SecretBackendIntermediateSetSignedArray) ToSecretBackendIntermediateSetSignedArrayOutput() SecretBackendIntermediateSetSignedArrayOutput {
	return i.ToSecretBackendIntermediateSetSignedArrayOutputWithContext(context.Background())
}

func (i SecretBackendIntermediateSetSignedArray) ToSecretBackendIntermediateSetSignedArrayOutputWithContext(ctx context.Context) SecretBackendIntermediateSetSignedArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretBackendIntermediateSetSignedArrayOutput)
}

// SecretBackendIntermediateSetSignedMapInput is an input type that accepts SecretBackendIntermediateSetSignedMap and SecretBackendIntermediateSetSignedMapOutput values.
// You can construct a concrete instance of `SecretBackendIntermediateSetSignedMapInput` via:
//
//          SecretBackendIntermediateSetSignedMap{ "key": SecretBackendIntermediateSetSignedArgs{...} }
type SecretBackendIntermediateSetSignedMapInput interface {
	pulumi.Input

	ToSecretBackendIntermediateSetSignedMapOutput() SecretBackendIntermediateSetSignedMapOutput
	ToSecretBackendIntermediateSetSignedMapOutputWithContext(context.Context) SecretBackendIntermediateSetSignedMapOutput
}

type SecretBackendIntermediateSetSignedMap map[string]SecretBackendIntermediateSetSignedInput

func (SecretBackendIntermediateSetSignedMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*SecretBackendIntermediateSetSigned)(nil))
}

func (i SecretBackendIntermediateSetSignedMap) ToSecretBackendIntermediateSetSignedMapOutput() SecretBackendIntermediateSetSignedMapOutput {
	return i.ToSecretBackendIntermediateSetSignedMapOutputWithContext(context.Background())
}

func (i SecretBackendIntermediateSetSignedMap) ToSecretBackendIntermediateSetSignedMapOutputWithContext(ctx context.Context) SecretBackendIntermediateSetSignedMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretBackendIntermediateSetSignedMapOutput)
}

type SecretBackendIntermediateSetSignedOutput struct {
	*pulumi.OutputState
}

func (SecretBackendIntermediateSetSignedOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*SecretBackendIntermediateSetSigned)(nil))
}

func (o SecretBackendIntermediateSetSignedOutput) ToSecretBackendIntermediateSetSignedOutput() SecretBackendIntermediateSetSignedOutput {
	return o
}

func (o SecretBackendIntermediateSetSignedOutput) ToSecretBackendIntermediateSetSignedOutputWithContext(ctx context.Context) SecretBackendIntermediateSetSignedOutput {
	return o
}

func (o SecretBackendIntermediateSetSignedOutput) ToSecretBackendIntermediateSetSignedPtrOutput() SecretBackendIntermediateSetSignedPtrOutput {
	return o.ToSecretBackendIntermediateSetSignedPtrOutputWithContext(context.Background())
}

func (o SecretBackendIntermediateSetSignedOutput) ToSecretBackendIntermediateSetSignedPtrOutputWithContext(ctx context.Context) SecretBackendIntermediateSetSignedPtrOutput {
	return o.ApplyT(func(v SecretBackendIntermediateSetSigned) *SecretBackendIntermediateSetSigned {
		return &v
	}).(SecretBackendIntermediateSetSignedPtrOutput)
}

type SecretBackendIntermediateSetSignedPtrOutput struct {
	*pulumi.OutputState
}

func (SecretBackendIntermediateSetSignedPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretBackendIntermediateSetSigned)(nil))
}

func (o SecretBackendIntermediateSetSignedPtrOutput) ToSecretBackendIntermediateSetSignedPtrOutput() SecretBackendIntermediateSetSignedPtrOutput {
	return o
}

func (o SecretBackendIntermediateSetSignedPtrOutput) ToSecretBackendIntermediateSetSignedPtrOutputWithContext(ctx context.Context) SecretBackendIntermediateSetSignedPtrOutput {
	return o
}

type SecretBackendIntermediateSetSignedArrayOutput struct{ *pulumi.OutputState }

func (SecretBackendIntermediateSetSignedArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]SecretBackendIntermediateSetSigned)(nil))
}

func (o SecretBackendIntermediateSetSignedArrayOutput) ToSecretBackendIntermediateSetSignedArrayOutput() SecretBackendIntermediateSetSignedArrayOutput {
	return o
}

func (o SecretBackendIntermediateSetSignedArrayOutput) ToSecretBackendIntermediateSetSignedArrayOutputWithContext(ctx context.Context) SecretBackendIntermediateSetSignedArrayOutput {
	return o
}

func (o SecretBackendIntermediateSetSignedArrayOutput) Index(i pulumi.IntInput) SecretBackendIntermediateSetSignedOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) SecretBackendIntermediateSetSigned {
		return vs[0].([]SecretBackendIntermediateSetSigned)[vs[1].(int)]
	}).(SecretBackendIntermediateSetSignedOutput)
}

type SecretBackendIntermediateSetSignedMapOutput struct{ *pulumi.OutputState }

func (SecretBackendIntermediateSetSignedMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]SecretBackendIntermediateSetSigned)(nil))
}

func (o SecretBackendIntermediateSetSignedMapOutput) ToSecretBackendIntermediateSetSignedMapOutput() SecretBackendIntermediateSetSignedMapOutput {
	return o
}

func (o SecretBackendIntermediateSetSignedMapOutput) ToSecretBackendIntermediateSetSignedMapOutputWithContext(ctx context.Context) SecretBackendIntermediateSetSignedMapOutput {
	return o
}

func (o SecretBackendIntermediateSetSignedMapOutput) MapIndex(k pulumi.StringInput) SecretBackendIntermediateSetSignedOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) SecretBackendIntermediateSetSigned {
		return vs[0].(map[string]SecretBackendIntermediateSetSigned)[vs[1].(string)]
	}).(SecretBackendIntermediateSetSignedOutput)
}

func init() {
	pulumi.RegisterOutputType(SecretBackendIntermediateSetSignedOutput{})
	pulumi.RegisterOutputType(SecretBackendIntermediateSetSignedPtrOutput{})
	pulumi.RegisterOutputType(SecretBackendIntermediateSetSignedArrayOutput{})
	pulumi.RegisterOutputType(SecretBackendIntermediateSetSignedMapOutput{})
}
