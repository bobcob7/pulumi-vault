// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package transit

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This is a data source which can be used to decrypt ciphertext using a Vault Transit key.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-vault/sdk/v4/go/vault/transit"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := transit.GetDecrypt(ctx, &transit.GetDecryptArgs{
// 			Backend:    "transit",
// 			Ciphertext: "vault:v1:S3GtnJ5GUNCWV+/pdL9+g1Feu/nzAv+RlmTmE91Tu0rBkeIU8MEb2nSspC/1IQ==",
// 			Key:        "test",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetDecrypt(ctx *pulumi.Context, args *GetDecryptArgs, opts ...pulumi.InvokeOption) (*GetDecryptResult, error) {
	var rv GetDecryptResult
	err := ctx.Invoke("vault:transit/getDecrypt:getDecrypt", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDecrypt.
type GetDecryptArgs struct {
	// The path the transit secret backend is mounted at, with no leading or trailing `/`.
	Backend string `pulumi:"backend"`
	// Ciphertext to be decoded.
	Ciphertext string `pulumi:"ciphertext"`
	// Context for key derivation. This is required if key derivation is enabled for this key.
	Context *string `pulumi:"context"`
	// Specifies the name of the transit key to decrypt against.
	Key string `pulumi:"key"`
}

// A collection of values returned by getDecrypt.
type GetDecryptResult struct {
	Backend    string  `pulumi:"backend"`
	Ciphertext string  `pulumi:"ciphertext"`
	Context    *string `pulumi:"context"`
	// The provider-assigned unique ID for this managed resource.
	Id  string `pulumi:"id"`
	Key string `pulumi:"key"`
	// Decrypted plaintext returned from Vault
	Plaintext string `pulumi:"plaintext"`
}
