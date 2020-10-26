// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package transit

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This is a data source which can be used to encrypt plaintext using a Vault Transit key.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-vault/sdk/v3/go/vault"
// 	"github.com/pulumi/pulumi-vault/sdk/v3/go/vault/transit"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		testMount, err := vault.NewMount(ctx, "testMount", &vault.MountArgs{
// 			Description: pulumi.String("This is an example mount"),
// 			Path:        pulumi.String("transit"),
// 			Type:        pulumi.String("transit"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		testSecretBackendKey, err := transit.NewSecretBackendKey(ctx, "testSecretBackendKey", &transit.SecretBackendKeyArgs{
// 			Backend: testMount.Path,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetEncrypt(ctx *pulumi.Context, args *GetEncryptArgs, opts ...pulumi.InvokeOption) (*GetEncryptResult, error) {
	var rv GetEncryptResult
	err := ctx.Invoke("vault:transit/getEncrypt:getEncrypt", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEncrypt.
type GetEncryptArgs struct {
	// The path the transit secret backend is mounted at, with no leading or trailing `/`.
	Backend string `pulumi:"backend"`
	// Context for key derivation. This is required if key derivation is enabled for this key.
	Context *string `pulumi:"context"`
	// Specifies the name of the transit key to encrypt against.
	Key string `pulumi:"key"`
	// The version of the key to use for encryption. If not set, uses the latest version. Must be greater than or equal to the key's `minEncryptionVersion`, if set.
	KeyVersion *int `pulumi:"keyVersion"`
	// Plaintext to be encoded.
	Plaintext string `pulumi:"plaintext"`
}

// A collection of values returned by getEncrypt.
type GetEncryptResult struct {
	Backend string `pulumi:"backend"`
	// Encrypted ciphertext returned from Vault
	Ciphertext string  `pulumi:"ciphertext"`
	Context    *string `pulumi:"context"`
	// The provider-assigned unique ID for this managed resource.
	Id         string `pulumi:"id"`
	Key        string `pulumi:"key"`
	KeyVersion *int   `pulumi:"keyVersion"`
	Plaintext  string `pulumi:"plaintext"`
}
