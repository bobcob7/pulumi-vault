// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vault

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Nomad secret backend can be imported using the `backend`, e.g.
//
// ```sh
//  $ pulumi import vault:index/nomadSecretBackend:NomadSecretBackend nomad nomad
// ```
type NomadSecretBackend struct {
	pulumi.CustomResourceState

	// Specifies the address of the Nomad instance, provided
	// as "protocol://host:port" like "http://127.0.0.1:4646".
	Address pulumi.StringPtrOutput `pulumi:"address"`
	// The unique path this backend should be mounted at. Must
	// not begin or end with a `/`. Defaults to `nomad`.
	Backend pulumi.StringPtrOutput `pulumi:"backend"`
	// CA certificate to use when verifying the Nomad server certificate, must be
	// x509 PEM encoded.
	CaCert pulumi.StringPtrOutput `pulumi:"caCert"`
	// Client certificate to provide to the Nomad server, must be x509 PEM encoded.
	ClientCert pulumi.StringPtrOutput `pulumi:"clientCert"`
	// Client certificate key to provide to the Nomad server, must be x509 PEM encoded.
	ClientKey pulumi.StringPtrOutput `pulumi:"clientKey"`
	// Default lease duration for secrets in seconds.
	DefaultLeaseTtlSeconds pulumi.IntOutput `pulumi:"defaultLeaseTtlSeconds"`
	// Human-friendly description of the mount for the Active Directory backend.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Mark the secrets engine as local-only. Local engines are not replicated or removed by
	// replication.Tolerance duration to use when checking the last rotation time.
	Local pulumi.BoolPtrOutput `pulumi:"local"`
	// Maximum possible lease duration for secrets in seconds.
	MaxLeaseTtlSeconds pulumi.IntOutput `pulumi:"maxLeaseTtlSeconds"`
	// Specifies the maximum length to use for the name of the Nomad token
	// generated with Generate Credential. If omitted, 0 is used and ignored, defaulting to the max value allowed
	// by the Nomad version.
	MaxTokenNameLength pulumi.IntOutput `pulumi:"maxTokenNameLength"`
	// Maximum possible lease duration for secrets in seconds.
	MaxTtl pulumi.IntOutput `pulumi:"maxTtl"`
	// Specifies the Nomad Management token to use.
	Token pulumi.StringPtrOutput `pulumi:"token"`
	// Specifies the ttl of the lease for the generated token.
	Ttl pulumi.IntOutput `pulumi:"ttl"`
}

// NewNomadSecretBackend registers a new resource with the given unique name, arguments, and options.
func NewNomadSecretBackend(ctx *pulumi.Context,
	name string, args *NomadSecretBackendArgs, opts ...pulumi.ResourceOption) (*NomadSecretBackend, error) {
	if args == nil {
		args = &NomadSecretBackendArgs{}
	}

	var resource NomadSecretBackend
	err := ctx.RegisterResource("vault:index/nomadSecretBackend:NomadSecretBackend", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNomadSecretBackend gets an existing NomadSecretBackend resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNomadSecretBackend(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NomadSecretBackendState, opts ...pulumi.ResourceOption) (*NomadSecretBackend, error) {
	var resource NomadSecretBackend
	err := ctx.ReadResource("vault:index/nomadSecretBackend:NomadSecretBackend", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NomadSecretBackend resources.
type nomadSecretBackendState struct {
	// Specifies the address of the Nomad instance, provided
	// as "protocol://host:port" like "http://127.0.0.1:4646".
	Address *string `pulumi:"address"`
	// The unique path this backend should be mounted at. Must
	// not begin or end with a `/`. Defaults to `nomad`.
	Backend *string `pulumi:"backend"`
	// CA certificate to use when verifying the Nomad server certificate, must be
	// x509 PEM encoded.
	CaCert *string `pulumi:"caCert"`
	// Client certificate to provide to the Nomad server, must be x509 PEM encoded.
	ClientCert *string `pulumi:"clientCert"`
	// Client certificate key to provide to the Nomad server, must be x509 PEM encoded.
	ClientKey *string `pulumi:"clientKey"`
	// Default lease duration for secrets in seconds.
	DefaultLeaseTtlSeconds *int `pulumi:"defaultLeaseTtlSeconds"`
	// Human-friendly description of the mount for the Active Directory backend.
	Description *string `pulumi:"description"`
	// Mark the secrets engine as local-only. Local engines are not replicated or removed by
	// replication.Tolerance duration to use when checking the last rotation time.
	Local *bool `pulumi:"local"`
	// Maximum possible lease duration for secrets in seconds.
	MaxLeaseTtlSeconds *int `pulumi:"maxLeaseTtlSeconds"`
	// Specifies the maximum length to use for the name of the Nomad token
	// generated with Generate Credential. If omitted, 0 is used and ignored, defaulting to the max value allowed
	// by the Nomad version.
	MaxTokenNameLength *int `pulumi:"maxTokenNameLength"`
	// Maximum possible lease duration for secrets in seconds.
	MaxTtl *int `pulumi:"maxTtl"`
	// Specifies the Nomad Management token to use.
	Token *string `pulumi:"token"`
	// Specifies the ttl of the lease for the generated token.
	Ttl *int `pulumi:"ttl"`
}

type NomadSecretBackendState struct {
	// Specifies the address of the Nomad instance, provided
	// as "protocol://host:port" like "http://127.0.0.1:4646".
	Address pulumi.StringPtrInput
	// The unique path this backend should be mounted at. Must
	// not begin or end with a `/`. Defaults to `nomad`.
	Backend pulumi.StringPtrInput
	// CA certificate to use when verifying the Nomad server certificate, must be
	// x509 PEM encoded.
	CaCert pulumi.StringPtrInput
	// Client certificate to provide to the Nomad server, must be x509 PEM encoded.
	ClientCert pulumi.StringPtrInput
	// Client certificate key to provide to the Nomad server, must be x509 PEM encoded.
	ClientKey pulumi.StringPtrInput
	// Default lease duration for secrets in seconds.
	DefaultLeaseTtlSeconds pulumi.IntPtrInput
	// Human-friendly description of the mount for the Active Directory backend.
	Description pulumi.StringPtrInput
	// Mark the secrets engine as local-only. Local engines are not replicated or removed by
	// replication.Tolerance duration to use when checking the last rotation time.
	Local pulumi.BoolPtrInput
	// Maximum possible lease duration for secrets in seconds.
	MaxLeaseTtlSeconds pulumi.IntPtrInput
	// Specifies the maximum length to use for the name of the Nomad token
	// generated with Generate Credential. If omitted, 0 is used and ignored, defaulting to the max value allowed
	// by the Nomad version.
	MaxTokenNameLength pulumi.IntPtrInput
	// Maximum possible lease duration for secrets in seconds.
	MaxTtl pulumi.IntPtrInput
	// Specifies the Nomad Management token to use.
	Token pulumi.StringPtrInput
	// Specifies the ttl of the lease for the generated token.
	Ttl pulumi.IntPtrInput
}

func (NomadSecretBackendState) ElementType() reflect.Type {
	return reflect.TypeOf((*nomadSecretBackendState)(nil)).Elem()
}

type nomadSecretBackendArgs struct {
	// Specifies the address of the Nomad instance, provided
	// as "protocol://host:port" like "http://127.0.0.1:4646".
	Address *string `pulumi:"address"`
	// The unique path this backend should be mounted at. Must
	// not begin or end with a `/`. Defaults to `nomad`.
	Backend *string `pulumi:"backend"`
	// CA certificate to use when verifying the Nomad server certificate, must be
	// x509 PEM encoded.
	CaCert *string `pulumi:"caCert"`
	// Client certificate to provide to the Nomad server, must be x509 PEM encoded.
	ClientCert *string `pulumi:"clientCert"`
	// Client certificate key to provide to the Nomad server, must be x509 PEM encoded.
	ClientKey *string `pulumi:"clientKey"`
	// Default lease duration for secrets in seconds.
	DefaultLeaseTtlSeconds *int `pulumi:"defaultLeaseTtlSeconds"`
	// Human-friendly description of the mount for the Active Directory backend.
	Description *string `pulumi:"description"`
	// Mark the secrets engine as local-only. Local engines are not replicated or removed by
	// replication.Tolerance duration to use when checking the last rotation time.
	Local *bool `pulumi:"local"`
	// Maximum possible lease duration for secrets in seconds.
	MaxLeaseTtlSeconds *int `pulumi:"maxLeaseTtlSeconds"`
	// Specifies the maximum length to use for the name of the Nomad token
	// generated with Generate Credential. If omitted, 0 is used and ignored, defaulting to the max value allowed
	// by the Nomad version.
	MaxTokenNameLength *int `pulumi:"maxTokenNameLength"`
	// Maximum possible lease duration for secrets in seconds.
	MaxTtl *int `pulumi:"maxTtl"`
	// Specifies the Nomad Management token to use.
	Token *string `pulumi:"token"`
	// Specifies the ttl of the lease for the generated token.
	Ttl *int `pulumi:"ttl"`
}

// The set of arguments for constructing a NomadSecretBackend resource.
type NomadSecretBackendArgs struct {
	// Specifies the address of the Nomad instance, provided
	// as "protocol://host:port" like "http://127.0.0.1:4646".
	Address pulumi.StringPtrInput
	// The unique path this backend should be mounted at. Must
	// not begin or end with a `/`. Defaults to `nomad`.
	Backend pulumi.StringPtrInput
	// CA certificate to use when verifying the Nomad server certificate, must be
	// x509 PEM encoded.
	CaCert pulumi.StringPtrInput
	// Client certificate to provide to the Nomad server, must be x509 PEM encoded.
	ClientCert pulumi.StringPtrInput
	// Client certificate key to provide to the Nomad server, must be x509 PEM encoded.
	ClientKey pulumi.StringPtrInput
	// Default lease duration for secrets in seconds.
	DefaultLeaseTtlSeconds pulumi.IntPtrInput
	// Human-friendly description of the mount for the Active Directory backend.
	Description pulumi.StringPtrInput
	// Mark the secrets engine as local-only. Local engines are not replicated or removed by
	// replication.Tolerance duration to use when checking the last rotation time.
	Local pulumi.BoolPtrInput
	// Maximum possible lease duration for secrets in seconds.
	MaxLeaseTtlSeconds pulumi.IntPtrInput
	// Specifies the maximum length to use for the name of the Nomad token
	// generated with Generate Credential. If omitted, 0 is used and ignored, defaulting to the max value allowed
	// by the Nomad version.
	MaxTokenNameLength pulumi.IntPtrInput
	// Maximum possible lease duration for secrets in seconds.
	MaxTtl pulumi.IntPtrInput
	// Specifies the Nomad Management token to use.
	Token pulumi.StringPtrInput
	// Specifies the ttl of the lease for the generated token.
	Ttl pulumi.IntPtrInput
}

func (NomadSecretBackendArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nomadSecretBackendArgs)(nil)).Elem()
}

type NomadSecretBackendInput interface {
	pulumi.Input

	ToNomadSecretBackendOutput() NomadSecretBackendOutput
	ToNomadSecretBackendOutputWithContext(ctx context.Context) NomadSecretBackendOutput
}

func (*NomadSecretBackend) ElementType() reflect.Type {
	return reflect.TypeOf((*NomadSecretBackend)(nil))
}

func (i *NomadSecretBackend) ToNomadSecretBackendOutput() NomadSecretBackendOutput {
	return i.ToNomadSecretBackendOutputWithContext(context.Background())
}

func (i *NomadSecretBackend) ToNomadSecretBackendOutputWithContext(ctx context.Context) NomadSecretBackendOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NomadSecretBackendOutput)
}

func (i *NomadSecretBackend) ToNomadSecretBackendPtrOutput() NomadSecretBackendPtrOutput {
	return i.ToNomadSecretBackendPtrOutputWithContext(context.Background())
}

func (i *NomadSecretBackend) ToNomadSecretBackendPtrOutputWithContext(ctx context.Context) NomadSecretBackendPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NomadSecretBackendPtrOutput)
}

type NomadSecretBackendPtrInput interface {
	pulumi.Input

	ToNomadSecretBackendPtrOutput() NomadSecretBackendPtrOutput
	ToNomadSecretBackendPtrOutputWithContext(ctx context.Context) NomadSecretBackendPtrOutput
}

type nomadSecretBackendPtrType NomadSecretBackendArgs

func (*nomadSecretBackendPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**NomadSecretBackend)(nil))
}

func (i *nomadSecretBackendPtrType) ToNomadSecretBackendPtrOutput() NomadSecretBackendPtrOutput {
	return i.ToNomadSecretBackendPtrOutputWithContext(context.Background())
}

func (i *nomadSecretBackendPtrType) ToNomadSecretBackendPtrOutputWithContext(ctx context.Context) NomadSecretBackendPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NomadSecretBackendPtrOutput)
}

// NomadSecretBackendArrayInput is an input type that accepts NomadSecretBackendArray and NomadSecretBackendArrayOutput values.
// You can construct a concrete instance of `NomadSecretBackendArrayInput` via:
//
//          NomadSecretBackendArray{ NomadSecretBackendArgs{...} }
type NomadSecretBackendArrayInput interface {
	pulumi.Input

	ToNomadSecretBackendArrayOutput() NomadSecretBackendArrayOutput
	ToNomadSecretBackendArrayOutputWithContext(context.Context) NomadSecretBackendArrayOutput
}

type NomadSecretBackendArray []NomadSecretBackendInput

func (NomadSecretBackendArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*NomadSecretBackend)(nil))
}

func (i NomadSecretBackendArray) ToNomadSecretBackendArrayOutput() NomadSecretBackendArrayOutput {
	return i.ToNomadSecretBackendArrayOutputWithContext(context.Background())
}

func (i NomadSecretBackendArray) ToNomadSecretBackendArrayOutputWithContext(ctx context.Context) NomadSecretBackendArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NomadSecretBackendArrayOutput)
}

// NomadSecretBackendMapInput is an input type that accepts NomadSecretBackendMap and NomadSecretBackendMapOutput values.
// You can construct a concrete instance of `NomadSecretBackendMapInput` via:
//
//          NomadSecretBackendMap{ "key": NomadSecretBackendArgs{...} }
type NomadSecretBackendMapInput interface {
	pulumi.Input

	ToNomadSecretBackendMapOutput() NomadSecretBackendMapOutput
	ToNomadSecretBackendMapOutputWithContext(context.Context) NomadSecretBackendMapOutput
}

type NomadSecretBackendMap map[string]NomadSecretBackendInput

func (NomadSecretBackendMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*NomadSecretBackend)(nil))
}

func (i NomadSecretBackendMap) ToNomadSecretBackendMapOutput() NomadSecretBackendMapOutput {
	return i.ToNomadSecretBackendMapOutputWithContext(context.Background())
}

func (i NomadSecretBackendMap) ToNomadSecretBackendMapOutputWithContext(ctx context.Context) NomadSecretBackendMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NomadSecretBackendMapOutput)
}

type NomadSecretBackendOutput struct {
	*pulumi.OutputState
}

func (NomadSecretBackendOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*NomadSecretBackend)(nil))
}

func (o NomadSecretBackendOutput) ToNomadSecretBackendOutput() NomadSecretBackendOutput {
	return o
}

func (o NomadSecretBackendOutput) ToNomadSecretBackendOutputWithContext(ctx context.Context) NomadSecretBackendOutput {
	return o
}

func (o NomadSecretBackendOutput) ToNomadSecretBackendPtrOutput() NomadSecretBackendPtrOutput {
	return o.ToNomadSecretBackendPtrOutputWithContext(context.Background())
}

func (o NomadSecretBackendOutput) ToNomadSecretBackendPtrOutputWithContext(ctx context.Context) NomadSecretBackendPtrOutput {
	return o.ApplyT(func(v NomadSecretBackend) *NomadSecretBackend {
		return &v
	}).(NomadSecretBackendPtrOutput)
}

type NomadSecretBackendPtrOutput struct {
	*pulumi.OutputState
}

func (NomadSecretBackendPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NomadSecretBackend)(nil))
}

func (o NomadSecretBackendPtrOutput) ToNomadSecretBackendPtrOutput() NomadSecretBackendPtrOutput {
	return o
}

func (o NomadSecretBackendPtrOutput) ToNomadSecretBackendPtrOutputWithContext(ctx context.Context) NomadSecretBackendPtrOutput {
	return o
}

type NomadSecretBackendArrayOutput struct{ *pulumi.OutputState }

func (NomadSecretBackendArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]NomadSecretBackend)(nil))
}

func (o NomadSecretBackendArrayOutput) ToNomadSecretBackendArrayOutput() NomadSecretBackendArrayOutput {
	return o
}

func (o NomadSecretBackendArrayOutput) ToNomadSecretBackendArrayOutputWithContext(ctx context.Context) NomadSecretBackendArrayOutput {
	return o
}

func (o NomadSecretBackendArrayOutput) Index(i pulumi.IntInput) NomadSecretBackendOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) NomadSecretBackend {
		return vs[0].([]NomadSecretBackend)[vs[1].(int)]
	}).(NomadSecretBackendOutput)
}

type NomadSecretBackendMapOutput struct{ *pulumi.OutputState }

func (NomadSecretBackendMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]NomadSecretBackend)(nil))
}

func (o NomadSecretBackendMapOutput) ToNomadSecretBackendMapOutput() NomadSecretBackendMapOutput {
	return o
}

func (o NomadSecretBackendMapOutput) ToNomadSecretBackendMapOutputWithContext(ctx context.Context) NomadSecretBackendMapOutput {
	return o
}

func (o NomadSecretBackendMapOutput) MapIndex(k pulumi.StringInput) NomadSecretBackendOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) NomadSecretBackend {
		return vs[0].(map[string]NomadSecretBackend)[vs[1].(string)]
	}).(NomadSecretBackendOutput)
}

func init() {
	pulumi.RegisterOutputType(NomadSecretBackendOutput{})
	pulumi.RegisterOutputType(NomadSecretBackendPtrOutput{})
	pulumi.RegisterOutputType(NomadSecretBackendArrayOutput{})
	pulumi.RegisterOutputType(NomadSecretBackendMapOutput{})
}
