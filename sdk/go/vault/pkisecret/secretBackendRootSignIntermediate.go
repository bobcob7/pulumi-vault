// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pkisecret

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates PKI certificate.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-vault/sdk/v5/go/vault/pkiSecret"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := pkiSecret.NewSecretBackendRootSignIntermediate(ctx, "root", &pkiSecret.SecretBackendRootSignIntermediateArgs{
// 			Backend:           pulumi.Any(vault_mount.Root.Path),
// 			Csr:               pulumi.Any(vault_pki_secret_backend_intermediate_cert_request.Intermediate.Csr),
// 			CommonName:        pulumi.String("Intermediate CA"),
// 			ExcludeCnFromSans: pulumi.Bool(true),
// 			Ou:                pulumi.String("My OU"),
// 			Organization:      pulumi.String("My organization"),
// 		}, pulumi.DependsOn([]pulumi.Resource{
// 			vault_pki_secret_backend_intermediate_cert_request.Intermediate,
// 		}))
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type SecretBackendRootSignIntermediate struct {
	pulumi.CustomResourceState

	// List of alternative names
	AltNames pulumi.StringArrayOutput `pulumi:"altNames"`
	// The PKI secret backend the resource belongs to.
	Backend pulumi.StringOutput `pulumi:"backend"`
	// The CA chain
	CaChain pulumi.StringOutput `pulumi:"caChain"`
	// The certificate
	Certificate pulumi.StringOutput `pulumi:"certificate"`
	// CN of intermediate to create
	CommonName pulumi.StringOutput `pulumi:"commonName"`
	// The country
	Country pulumi.StringPtrOutput `pulumi:"country"`
	// The CSR
	Csr pulumi.StringOutput `pulumi:"csr"`
	// Flag to exclude CN from SANs
	ExcludeCnFromSans pulumi.BoolPtrOutput `pulumi:"excludeCnFromSans"`
	// The format of data
	Format pulumi.StringPtrOutput `pulumi:"format"`
	// List of alternative IPs
	IpSans pulumi.StringArrayOutput `pulumi:"ipSans"`
	// The issuing CA
	IssuingCa pulumi.StringOutput `pulumi:"issuingCa"`
	// The locality
	Locality pulumi.StringPtrOutput `pulumi:"locality"`
	// The maximum path length to encode in the generated certificate
	MaxPathLength pulumi.IntPtrOutput `pulumi:"maxPathLength"`
	// The organization
	Organization pulumi.StringPtrOutput `pulumi:"organization"`
	// List of other SANs
	OtherSans pulumi.StringArrayOutput `pulumi:"otherSans"`
	// The organization unit
	Ou pulumi.StringPtrOutput `pulumi:"ou"`
	// List of domains for which certificates are allowed to be issued
	PermittedDnsDomains pulumi.StringArrayOutput `pulumi:"permittedDnsDomains"`
	// The postal code
	PostalCode pulumi.StringPtrOutput `pulumi:"postalCode"`
	// The province
	Province pulumi.StringPtrOutput `pulumi:"province"`
	// The serial
	Serial pulumi.StringOutput `pulumi:"serial"`
	// The street address
	StreetAddress pulumi.StringPtrOutput `pulumi:"streetAddress"`
	// Time to live
	Ttl pulumi.StringPtrOutput `pulumi:"ttl"`
	// List of alternative URIs
	UriSans pulumi.StringArrayOutput `pulumi:"uriSans"`
	// Preserve CSR values
	UseCsrValues pulumi.BoolPtrOutput `pulumi:"useCsrValues"`
}

// NewSecretBackendRootSignIntermediate registers a new resource with the given unique name, arguments, and options.
func NewSecretBackendRootSignIntermediate(ctx *pulumi.Context,
	name string, args *SecretBackendRootSignIntermediateArgs, opts ...pulumi.ResourceOption) (*SecretBackendRootSignIntermediate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Backend == nil {
		return nil, errors.New("invalid value for required argument 'Backend'")
	}
	if args.CommonName == nil {
		return nil, errors.New("invalid value for required argument 'CommonName'")
	}
	if args.Csr == nil {
		return nil, errors.New("invalid value for required argument 'Csr'")
	}
	var resource SecretBackendRootSignIntermediate
	err := ctx.RegisterResource("vault:pkiSecret/secretBackendRootSignIntermediate:SecretBackendRootSignIntermediate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecretBackendRootSignIntermediate gets an existing SecretBackendRootSignIntermediate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecretBackendRootSignIntermediate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecretBackendRootSignIntermediateState, opts ...pulumi.ResourceOption) (*SecretBackendRootSignIntermediate, error) {
	var resource SecretBackendRootSignIntermediate
	err := ctx.ReadResource("vault:pkiSecret/secretBackendRootSignIntermediate:SecretBackendRootSignIntermediate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecretBackendRootSignIntermediate resources.
type secretBackendRootSignIntermediateState struct {
	// List of alternative names
	AltNames []string `pulumi:"altNames"`
	// The PKI secret backend the resource belongs to.
	Backend *string `pulumi:"backend"`
	// The CA chain
	CaChain *string `pulumi:"caChain"`
	// The certificate
	Certificate *string `pulumi:"certificate"`
	// CN of intermediate to create
	CommonName *string `pulumi:"commonName"`
	// The country
	Country *string `pulumi:"country"`
	// The CSR
	Csr *string `pulumi:"csr"`
	// Flag to exclude CN from SANs
	ExcludeCnFromSans *bool `pulumi:"excludeCnFromSans"`
	// The format of data
	Format *string `pulumi:"format"`
	// List of alternative IPs
	IpSans []string `pulumi:"ipSans"`
	// The issuing CA
	IssuingCa *string `pulumi:"issuingCa"`
	// The locality
	Locality *string `pulumi:"locality"`
	// The maximum path length to encode in the generated certificate
	MaxPathLength *int `pulumi:"maxPathLength"`
	// The organization
	Organization *string `pulumi:"organization"`
	// List of other SANs
	OtherSans []string `pulumi:"otherSans"`
	// The organization unit
	Ou *string `pulumi:"ou"`
	// List of domains for which certificates are allowed to be issued
	PermittedDnsDomains []string `pulumi:"permittedDnsDomains"`
	// The postal code
	PostalCode *string `pulumi:"postalCode"`
	// The province
	Province *string `pulumi:"province"`
	// The serial
	Serial *string `pulumi:"serial"`
	// The street address
	StreetAddress *string `pulumi:"streetAddress"`
	// Time to live
	Ttl *string `pulumi:"ttl"`
	// List of alternative URIs
	UriSans []string `pulumi:"uriSans"`
	// Preserve CSR values
	UseCsrValues *bool `pulumi:"useCsrValues"`
}

type SecretBackendRootSignIntermediateState struct {
	// List of alternative names
	AltNames pulumi.StringArrayInput
	// The PKI secret backend the resource belongs to.
	Backend pulumi.StringPtrInput
	// The CA chain
	CaChain pulumi.StringPtrInput
	// The certificate
	Certificate pulumi.StringPtrInput
	// CN of intermediate to create
	CommonName pulumi.StringPtrInput
	// The country
	Country pulumi.StringPtrInput
	// The CSR
	Csr pulumi.StringPtrInput
	// Flag to exclude CN from SANs
	ExcludeCnFromSans pulumi.BoolPtrInput
	// The format of data
	Format pulumi.StringPtrInput
	// List of alternative IPs
	IpSans pulumi.StringArrayInput
	// The issuing CA
	IssuingCa pulumi.StringPtrInput
	// The locality
	Locality pulumi.StringPtrInput
	// The maximum path length to encode in the generated certificate
	MaxPathLength pulumi.IntPtrInput
	// The organization
	Organization pulumi.StringPtrInput
	// List of other SANs
	OtherSans pulumi.StringArrayInput
	// The organization unit
	Ou pulumi.StringPtrInput
	// List of domains for which certificates are allowed to be issued
	PermittedDnsDomains pulumi.StringArrayInput
	// The postal code
	PostalCode pulumi.StringPtrInput
	// The province
	Province pulumi.StringPtrInput
	// The serial
	Serial pulumi.StringPtrInput
	// The street address
	StreetAddress pulumi.StringPtrInput
	// Time to live
	Ttl pulumi.StringPtrInput
	// List of alternative URIs
	UriSans pulumi.StringArrayInput
	// Preserve CSR values
	UseCsrValues pulumi.BoolPtrInput
}

func (SecretBackendRootSignIntermediateState) ElementType() reflect.Type {
	return reflect.TypeOf((*secretBackendRootSignIntermediateState)(nil)).Elem()
}

type secretBackendRootSignIntermediateArgs struct {
	// List of alternative names
	AltNames []string `pulumi:"altNames"`
	// The PKI secret backend the resource belongs to.
	Backend string `pulumi:"backend"`
	// CN of intermediate to create
	CommonName string `pulumi:"commonName"`
	// The country
	Country *string `pulumi:"country"`
	// The CSR
	Csr string `pulumi:"csr"`
	// Flag to exclude CN from SANs
	ExcludeCnFromSans *bool `pulumi:"excludeCnFromSans"`
	// The format of data
	Format *string `pulumi:"format"`
	// List of alternative IPs
	IpSans []string `pulumi:"ipSans"`
	// The locality
	Locality *string `pulumi:"locality"`
	// The maximum path length to encode in the generated certificate
	MaxPathLength *int `pulumi:"maxPathLength"`
	// The organization
	Organization *string `pulumi:"organization"`
	// List of other SANs
	OtherSans []string `pulumi:"otherSans"`
	// The organization unit
	Ou *string `pulumi:"ou"`
	// List of domains for which certificates are allowed to be issued
	PermittedDnsDomains []string `pulumi:"permittedDnsDomains"`
	// The postal code
	PostalCode *string `pulumi:"postalCode"`
	// The province
	Province *string `pulumi:"province"`
	// The street address
	StreetAddress *string `pulumi:"streetAddress"`
	// Time to live
	Ttl *string `pulumi:"ttl"`
	// List of alternative URIs
	UriSans []string `pulumi:"uriSans"`
	// Preserve CSR values
	UseCsrValues *bool `pulumi:"useCsrValues"`
}

// The set of arguments for constructing a SecretBackendRootSignIntermediate resource.
type SecretBackendRootSignIntermediateArgs struct {
	// List of alternative names
	AltNames pulumi.StringArrayInput
	// The PKI secret backend the resource belongs to.
	Backend pulumi.StringInput
	// CN of intermediate to create
	CommonName pulumi.StringInput
	// The country
	Country pulumi.StringPtrInput
	// The CSR
	Csr pulumi.StringInput
	// Flag to exclude CN from SANs
	ExcludeCnFromSans pulumi.BoolPtrInput
	// The format of data
	Format pulumi.StringPtrInput
	// List of alternative IPs
	IpSans pulumi.StringArrayInput
	// The locality
	Locality pulumi.StringPtrInput
	// The maximum path length to encode in the generated certificate
	MaxPathLength pulumi.IntPtrInput
	// The organization
	Organization pulumi.StringPtrInput
	// List of other SANs
	OtherSans pulumi.StringArrayInput
	// The organization unit
	Ou pulumi.StringPtrInput
	// List of domains for which certificates are allowed to be issued
	PermittedDnsDomains pulumi.StringArrayInput
	// The postal code
	PostalCode pulumi.StringPtrInput
	// The province
	Province pulumi.StringPtrInput
	// The street address
	StreetAddress pulumi.StringPtrInput
	// Time to live
	Ttl pulumi.StringPtrInput
	// List of alternative URIs
	UriSans pulumi.StringArrayInput
	// Preserve CSR values
	UseCsrValues pulumi.BoolPtrInput
}

func (SecretBackendRootSignIntermediateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*secretBackendRootSignIntermediateArgs)(nil)).Elem()
}

type SecretBackendRootSignIntermediateInput interface {
	pulumi.Input

	ToSecretBackendRootSignIntermediateOutput() SecretBackendRootSignIntermediateOutput
	ToSecretBackendRootSignIntermediateOutputWithContext(ctx context.Context) SecretBackendRootSignIntermediateOutput
}

func (*SecretBackendRootSignIntermediate) ElementType() reflect.Type {
	return reflect.TypeOf((*SecretBackendRootSignIntermediate)(nil))
}

func (i *SecretBackendRootSignIntermediate) ToSecretBackendRootSignIntermediateOutput() SecretBackendRootSignIntermediateOutput {
	return i.ToSecretBackendRootSignIntermediateOutputWithContext(context.Background())
}

func (i *SecretBackendRootSignIntermediate) ToSecretBackendRootSignIntermediateOutputWithContext(ctx context.Context) SecretBackendRootSignIntermediateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretBackendRootSignIntermediateOutput)
}

func (i *SecretBackendRootSignIntermediate) ToSecretBackendRootSignIntermediatePtrOutput() SecretBackendRootSignIntermediatePtrOutput {
	return i.ToSecretBackendRootSignIntermediatePtrOutputWithContext(context.Background())
}

func (i *SecretBackendRootSignIntermediate) ToSecretBackendRootSignIntermediatePtrOutputWithContext(ctx context.Context) SecretBackendRootSignIntermediatePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretBackendRootSignIntermediatePtrOutput)
}

type SecretBackendRootSignIntermediatePtrInput interface {
	pulumi.Input

	ToSecretBackendRootSignIntermediatePtrOutput() SecretBackendRootSignIntermediatePtrOutput
	ToSecretBackendRootSignIntermediatePtrOutputWithContext(ctx context.Context) SecretBackendRootSignIntermediatePtrOutput
}

type secretBackendRootSignIntermediatePtrType SecretBackendRootSignIntermediateArgs

func (*secretBackendRootSignIntermediatePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretBackendRootSignIntermediate)(nil))
}

func (i *secretBackendRootSignIntermediatePtrType) ToSecretBackendRootSignIntermediatePtrOutput() SecretBackendRootSignIntermediatePtrOutput {
	return i.ToSecretBackendRootSignIntermediatePtrOutputWithContext(context.Background())
}

func (i *secretBackendRootSignIntermediatePtrType) ToSecretBackendRootSignIntermediatePtrOutputWithContext(ctx context.Context) SecretBackendRootSignIntermediatePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretBackendRootSignIntermediatePtrOutput)
}

// SecretBackendRootSignIntermediateArrayInput is an input type that accepts SecretBackendRootSignIntermediateArray and SecretBackendRootSignIntermediateArrayOutput values.
// You can construct a concrete instance of `SecretBackendRootSignIntermediateArrayInput` via:
//
//          SecretBackendRootSignIntermediateArray{ SecretBackendRootSignIntermediateArgs{...} }
type SecretBackendRootSignIntermediateArrayInput interface {
	pulumi.Input

	ToSecretBackendRootSignIntermediateArrayOutput() SecretBackendRootSignIntermediateArrayOutput
	ToSecretBackendRootSignIntermediateArrayOutputWithContext(context.Context) SecretBackendRootSignIntermediateArrayOutput
}

type SecretBackendRootSignIntermediateArray []SecretBackendRootSignIntermediateInput

func (SecretBackendRootSignIntermediateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecretBackendRootSignIntermediate)(nil)).Elem()
}

func (i SecretBackendRootSignIntermediateArray) ToSecretBackendRootSignIntermediateArrayOutput() SecretBackendRootSignIntermediateArrayOutput {
	return i.ToSecretBackendRootSignIntermediateArrayOutputWithContext(context.Background())
}

func (i SecretBackendRootSignIntermediateArray) ToSecretBackendRootSignIntermediateArrayOutputWithContext(ctx context.Context) SecretBackendRootSignIntermediateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretBackendRootSignIntermediateArrayOutput)
}

// SecretBackendRootSignIntermediateMapInput is an input type that accepts SecretBackendRootSignIntermediateMap and SecretBackendRootSignIntermediateMapOutput values.
// You can construct a concrete instance of `SecretBackendRootSignIntermediateMapInput` via:
//
//          SecretBackendRootSignIntermediateMap{ "key": SecretBackendRootSignIntermediateArgs{...} }
type SecretBackendRootSignIntermediateMapInput interface {
	pulumi.Input

	ToSecretBackendRootSignIntermediateMapOutput() SecretBackendRootSignIntermediateMapOutput
	ToSecretBackendRootSignIntermediateMapOutputWithContext(context.Context) SecretBackendRootSignIntermediateMapOutput
}

type SecretBackendRootSignIntermediateMap map[string]SecretBackendRootSignIntermediateInput

func (SecretBackendRootSignIntermediateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecretBackendRootSignIntermediate)(nil)).Elem()
}

func (i SecretBackendRootSignIntermediateMap) ToSecretBackendRootSignIntermediateMapOutput() SecretBackendRootSignIntermediateMapOutput {
	return i.ToSecretBackendRootSignIntermediateMapOutputWithContext(context.Background())
}

func (i SecretBackendRootSignIntermediateMap) ToSecretBackendRootSignIntermediateMapOutputWithContext(ctx context.Context) SecretBackendRootSignIntermediateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretBackendRootSignIntermediateMapOutput)
}

type SecretBackendRootSignIntermediateOutput struct{ *pulumi.OutputState }

func (SecretBackendRootSignIntermediateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*SecretBackendRootSignIntermediate)(nil))
}

func (o SecretBackendRootSignIntermediateOutput) ToSecretBackendRootSignIntermediateOutput() SecretBackendRootSignIntermediateOutput {
	return o
}

func (o SecretBackendRootSignIntermediateOutput) ToSecretBackendRootSignIntermediateOutputWithContext(ctx context.Context) SecretBackendRootSignIntermediateOutput {
	return o
}

func (o SecretBackendRootSignIntermediateOutput) ToSecretBackendRootSignIntermediatePtrOutput() SecretBackendRootSignIntermediatePtrOutput {
	return o.ToSecretBackendRootSignIntermediatePtrOutputWithContext(context.Background())
}

func (o SecretBackendRootSignIntermediateOutput) ToSecretBackendRootSignIntermediatePtrOutputWithContext(ctx context.Context) SecretBackendRootSignIntermediatePtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v SecretBackendRootSignIntermediate) *SecretBackendRootSignIntermediate {
		return &v
	}).(SecretBackendRootSignIntermediatePtrOutput)
}

type SecretBackendRootSignIntermediatePtrOutput struct{ *pulumi.OutputState }

func (SecretBackendRootSignIntermediatePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretBackendRootSignIntermediate)(nil))
}

func (o SecretBackendRootSignIntermediatePtrOutput) ToSecretBackendRootSignIntermediatePtrOutput() SecretBackendRootSignIntermediatePtrOutput {
	return o
}

func (o SecretBackendRootSignIntermediatePtrOutput) ToSecretBackendRootSignIntermediatePtrOutputWithContext(ctx context.Context) SecretBackendRootSignIntermediatePtrOutput {
	return o
}

func (o SecretBackendRootSignIntermediatePtrOutput) Elem() SecretBackendRootSignIntermediateOutput {
	return o.ApplyT(func(v *SecretBackendRootSignIntermediate) SecretBackendRootSignIntermediate {
		if v != nil {
			return *v
		}
		var ret SecretBackendRootSignIntermediate
		return ret
	}).(SecretBackendRootSignIntermediateOutput)
}

type SecretBackendRootSignIntermediateArrayOutput struct{ *pulumi.OutputState }

func (SecretBackendRootSignIntermediateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]SecretBackendRootSignIntermediate)(nil))
}

func (o SecretBackendRootSignIntermediateArrayOutput) ToSecretBackendRootSignIntermediateArrayOutput() SecretBackendRootSignIntermediateArrayOutput {
	return o
}

func (o SecretBackendRootSignIntermediateArrayOutput) ToSecretBackendRootSignIntermediateArrayOutputWithContext(ctx context.Context) SecretBackendRootSignIntermediateArrayOutput {
	return o
}

func (o SecretBackendRootSignIntermediateArrayOutput) Index(i pulumi.IntInput) SecretBackendRootSignIntermediateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) SecretBackendRootSignIntermediate {
		return vs[0].([]SecretBackendRootSignIntermediate)[vs[1].(int)]
	}).(SecretBackendRootSignIntermediateOutput)
}

type SecretBackendRootSignIntermediateMapOutput struct{ *pulumi.OutputState }

func (SecretBackendRootSignIntermediateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]SecretBackendRootSignIntermediate)(nil))
}

func (o SecretBackendRootSignIntermediateMapOutput) ToSecretBackendRootSignIntermediateMapOutput() SecretBackendRootSignIntermediateMapOutput {
	return o
}

func (o SecretBackendRootSignIntermediateMapOutput) ToSecretBackendRootSignIntermediateMapOutputWithContext(ctx context.Context) SecretBackendRootSignIntermediateMapOutput {
	return o
}

func (o SecretBackendRootSignIntermediateMapOutput) MapIndex(k pulumi.StringInput) SecretBackendRootSignIntermediateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) SecretBackendRootSignIntermediate {
		return vs[0].(map[string]SecretBackendRootSignIntermediate)[vs[1].(string)]
	}).(SecretBackendRootSignIntermediateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecretBackendRootSignIntermediateInput)(nil)).Elem(), &SecretBackendRootSignIntermediate{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretBackendRootSignIntermediatePtrInput)(nil)).Elem(), &SecretBackendRootSignIntermediate{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretBackendRootSignIntermediateArrayInput)(nil)).Elem(), SecretBackendRootSignIntermediateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretBackendRootSignIntermediateMapInput)(nil)).Elem(), SecretBackendRootSignIntermediateMap{})
	pulumi.RegisterOutputType(SecretBackendRootSignIntermediateOutput{})
	pulumi.RegisterOutputType(SecretBackendRootSignIntermediatePtrOutput{})
	pulumi.RegisterOutputType(SecretBackendRootSignIntermediateArrayOutput{})
	pulumi.RegisterOutputType(SecretBackendRootSignIntermediateMapOutput{})
}
