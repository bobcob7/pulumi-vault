// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package generic

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Generic secrets can be imported using the `path`, e.g.
//
// ```sh
//  $ pulumi import vault:generic/secret:Secret example secret/foo
// ```
type Secret struct {
	pulumi.CustomResourceState

	// A mapping whose keys are the top-level data keys returned from
	// Vault and whose values are the corresponding values. This map can only
	// represent string data, so any non-string values returned from Vault are
	// serialized as JSON.
	Data pulumi.MapOutput `pulumi:"data"`
	// String containing a JSON-encoded object that will be
	// written as the secret data at the given path.
	DataJson pulumi.StringOutput `pulumi:"dataJson"`
	// true/false.  Only applicable for kv-v2 stores.
	// If set to `true`, permanently deletes all versions for
	// the specified key. The default behavior is to only delete the latest version of the
	// secret.
	DeleteAllVersions pulumi.BoolPtrOutput `pulumi:"deleteAllVersions"`
	// true/false. Set this to true if your vault
	// authentication is not able to read the data. Setting this to `true` will
	// break drift detection. Defaults to false.
	DisableRead pulumi.BoolPtrOutput `pulumi:"disableRead"`
	// The full logical path at which to write the given data.
	// To write data into the "generic" secret backend mounted in Vault by default,
	// this should be prefixed with `secret/`. Writing to other backends with this
	// resource is possible; consult each backend's documentation to see which
	// endpoints support the `PUT` and `DELETE` methods.
	Path pulumi.StringOutput `pulumi:"path"`
}

// NewSecret registers a new resource with the given unique name, arguments, and options.
func NewSecret(ctx *pulumi.Context,
	name string, args *SecretArgs, opts ...pulumi.ResourceOption) (*Secret, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataJson == nil {
		return nil, errors.New("invalid value for required argument 'DataJson'")
	}
	if args.Path == nil {
		return nil, errors.New("invalid value for required argument 'Path'")
	}
	var resource Secret
	err := ctx.RegisterResource("vault:generic/secret:Secret", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecret gets an existing Secret resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecret(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecretState, opts ...pulumi.ResourceOption) (*Secret, error) {
	var resource Secret
	err := ctx.ReadResource("vault:generic/secret:Secret", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Secret resources.
type secretState struct {
	// A mapping whose keys are the top-level data keys returned from
	// Vault and whose values are the corresponding values. This map can only
	// represent string data, so any non-string values returned from Vault are
	// serialized as JSON.
	Data map[string]interface{} `pulumi:"data"`
	// String containing a JSON-encoded object that will be
	// written as the secret data at the given path.
	DataJson *string `pulumi:"dataJson"`
	// true/false.  Only applicable for kv-v2 stores.
	// If set to `true`, permanently deletes all versions for
	// the specified key. The default behavior is to only delete the latest version of the
	// secret.
	DeleteAllVersions *bool `pulumi:"deleteAllVersions"`
	// true/false. Set this to true if your vault
	// authentication is not able to read the data. Setting this to `true` will
	// break drift detection. Defaults to false.
	DisableRead *bool `pulumi:"disableRead"`
	// The full logical path at which to write the given data.
	// To write data into the "generic" secret backend mounted in Vault by default,
	// this should be prefixed with `secret/`. Writing to other backends with this
	// resource is possible; consult each backend's documentation to see which
	// endpoints support the `PUT` and `DELETE` methods.
	Path *string `pulumi:"path"`
}

type SecretState struct {
	// A mapping whose keys are the top-level data keys returned from
	// Vault and whose values are the corresponding values. This map can only
	// represent string data, so any non-string values returned from Vault are
	// serialized as JSON.
	Data pulumi.MapInput
	// String containing a JSON-encoded object that will be
	// written as the secret data at the given path.
	DataJson pulumi.StringPtrInput
	// true/false.  Only applicable for kv-v2 stores.
	// If set to `true`, permanently deletes all versions for
	// the specified key. The default behavior is to only delete the latest version of the
	// secret.
	DeleteAllVersions pulumi.BoolPtrInput
	// true/false. Set this to true if your vault
	// authentication is not able to read the data. Setting this to `true` will
	// break drift detection. Defaults to false.
	DisableRead pulumi.BoolPtrInput
	// The full logical path at which to write the given data.
	// To write data into the "generic" secret backend mounted in Vault by default,
	// this should be prefixed with `secret/`. Writing to other backends with this
	// resource is possible; consult each backend's documentation to see which
	// endpoints support the `PUT` and `DELETE` methods.
	Path pulumi.StringPtrInput
}

func (SecretState) ElementType() reflect.Type {
	return reflect.TypeOf((*secretState)(nil)).Elem()
}

type secretArgs struct {
	// String containing a JSON-encoded object that will be
	// written as the secret data at the given path.
	DataJson string `pulumi:"dataJson"`
	// true/false.  Only applicable for kv-v2 stores.
	// If set to `true`, permanently deletes all versions for
	// the specified key. The default behavior is to only delete the latest version of the
	// secret.
	DeleteAllVersions *bool `pulumi:"deleteAllVersions"`
	// true/false. Set this to true if your vault
	// authentication is not able to read the data. Setting this to `true` will
	// break drift detection. Defaults to false.
	DisableRead *bool `pulumi:"disableRead"`
	// The full logical path at which to write the given data.
	// To write data into the "generic" secret backend mounted in Vault by default,
	// this should be prefixed with `secret/`. Writing to other backends with this
	// resource is possible; consult each backend's documentation to see which
	// endpoints support the `PUT` and `DELETE` methods.
	Path string `pulumi:"path"`
}

// The set of arguments for constructing a Secret resource.
type SecretArgs struct {
	// String containing a JSON-encoded object that will be
	// written as the secret data at the given path.
	DataJson pulumi.StringInput
	// true/false.  Only applicable for kv-v2 stores.
	// If set to `true`, permanently deletes all versions for
	// the specified key. The default behavior is to only delete the latest version of the
	// secret.
	DeleteAllVersions pulumi.BoolPtrInput
	// true/false. Set this to true if your vault
	// authentication is not able to read the data. Setting this to `true` will
	// break drift detection. Defaults to false.
	DisableRead pulumi.BoolPtrInput
	// The full logical path at which to write the given data.
	// To write data into the "generic" secret backend mounted in Vault by default,
	// this should be prefixed with `secret/`. Writing to other backends with this
	// resource is possible; consult each backend's documentation to see which
	// endpoints support the `PUT` and `DELETE` methods.
	Path pulumi.StringInput
}

func (SecretArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*secretArgs)(nil)).Elem()
}

type SecretInput interface {
	pulumi.Input

	ToSecretOutput() SecretOutput
	ToSecretOutputWithContext(ctx context.Context) SecretOutput
}

func (*Secret) ElementType() reflect.Type {
	return reflect.TypeOf((**Secret)(nil)).Elem()
}

func (i *Secret) ToSecretOutput() SecretOutput {
	return i.ToSecretOutputWithContext(context.Background())
}

func (i *Secret) ToSecretOutputWithContext(ctx context.Context) SecretOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretOutput)
}

// SecretArrayInput is an input type that accepts SecretArray and SecretArrayOutput values.
// You can construct a concrete instance of `SecretArrayInput` via:
//
//          SecretArray{ SecretArgs{...} }
type SecretArrayInput interface {
	pulumi.Input

	ToSecretArrayOutput() SecretArrayOutput
	ToSecretArrayOutputWithContext(context.Context) SecretArrayOutput
}

type SecretArray []SecretInput

func (SecretArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Secret)(nil)).Elem()
}

func (i SecretArray) ToSecretArrayOutput() SecretArrayOutput {
	return i.ToSecretArrayOutputWithContext(context.Background())
}

func (i SecretArray) ToSecretArrayOutputWithContext(ctx context.Context) SecretArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretArrayOutput)
}

// SecretMapInput is an input type that accepts SecretMap and SecretMapOutput values.
// You can construct a concrete instance of `SecretMapInput` via:
//
//          SecretMap{ "key": SecretArgs{...} }
type SecretMapInput interface {
	pulumi.Input

	ToSecretMapOutput() SecretMapOutput
	ToSecretMapOutputWithContext(context.Context) SecretMapOutput
}

type SecretMap map[string]SecretInput

func (SecretMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Secret)(nil)).Elem()
}

func (i SecretMap) ToSecretMapOutput() SecretMapOutput {
	return i.ToSecretMapOutputWithContext(context.Background())
}

func (i SecretMap) ToSecretMapOutputWithContext(ctx context.Context) SecretMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretMapOutput)
}

type SecretOutput struct{ *pulumi.OutputState }

func (SecretOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Secret)(nil)).Elem()
}

func (o SecretOutput) ToSecretOutput() SecretOutput {
	return o
}

func (o SecretOutput) ToSecretOutputWithContext(ctx context.Context) SecretOutput {
	return o
}

type SecretArrayOutput struct{ *pulumi.OutputState }

func (SecretArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Secret)(nil)).Elem()
}

func (o SecretArrayOutput) ToSecretArrayOutput() SecretArrayOutput {
	return o
}

func (o SecretArrayOutput) ToSecretArrayOutputWithContext(ctx context.Context) SecretArrayOutput {
	return o
}

func (o SecretArrayOutput) Index(i pulumi.IntInput) SecretOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Secret {
		return vs[0].([]*Secret)[vs[1].(int)]
	}).(SecretOutput)
}

type SecretMapOutput struct{ *pulumi.OutputState }

func (SecretMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Secret)(nil)).Elem()
}

func (o SecretMapOutput) ToSecretMapOutput() SecretMapOutput {
	return o
}

func (o SecretMapOutput) ToSecretMapOutputWithContext(ctx context.Context) SecretMapOutput {
	return o
}

func (o SecretMapOutput) MapIndex(k pulumi.StringInput) SecretOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Secret {
		return vs[0].(map[string]*Secret)[vs[1].(string)]
	}).(SecretOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecretInput)(nil)).Elem(), &Secret{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretArrayInput)(nil)).Elem(), SecretArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretMapInput)(nil)).Elem(), SecretMap{})
	pulumi.RegisterOutputType(SecretOutput{})
	pulumi.RegisterOutputType(SecretArrayOutput{})
	pulumi.RegisterOutputType(SecretMapOutput{})
}
