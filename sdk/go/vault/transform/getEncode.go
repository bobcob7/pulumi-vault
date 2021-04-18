// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package transform

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source supports the "/transform/encode/{role_name}" Vault endpoint.
//
// It encodes the provided value using a named role.
func GetEncode(ctx *pulumi.Context, args *GetEncodeArgs, opts ...pulumi.InvokeOption) (*GetEncodeResult, error) {
	var rv GetEncodeResult
	err := ctx.Invoke("vault:transform/getEncode:getEncode", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEncode.
type GetEncodeArgs struct {
	// Specifies a list of items to be encoded in a single batch. If this parameter is set, the parameters 'value', 'transformation' and 'tweak' will be ignored. Each batch item within the list can specify these parameters instead.
	BatchInputs []map[string]interface{} `pulumi:"batchInputs"`
	// The result of encoding a batch.
	BatchResults []map[string]interface{} `pulumi:"batchResults"`
	// The result of encoding a value.
	EncodedValue *string `pulumi:"encodedValue"`
	// Path to where the back-end is mounted within Vault.
	Path string `pulumi:"path"`
	// The name of the role.
	RoleName string `pulumi:"roleName"`
	// The transformation to perform. If no value is provided and the role contains a single transformation, this value will be inferred from the role.
	Transformation *string `pulumi:"transformation"`
	// The tweak value to use. Only applicable for FPE transformations
	Tweak *string `pulumi:"tweak"`
	// The value in which to encode.
	Value *string `pulumi:"value"`
}

// A collection of values returned by getEncode.
type GetEncodeResult struct {
	BatchInputs  []map[string]interface{} `pulumi:"batchInputs"`
	BatchResults []map[string]interface{} `pulumi:"batchResults"`
	EncodedValue string                   `pulumi:"encodedValue"`
	// The provider-assigned unique ID for this managed resource.
	Id             string  `pulumi:"id"`
	Path           string  `pulumi:"path"`
	RoleName       string  `pulumi:"roleName"`
	Transformation *string `pulumi:"transformation"`
	Tweak          *string `pulumi:"tweak"`
	Value          *string `pulumi:"value"`
}
