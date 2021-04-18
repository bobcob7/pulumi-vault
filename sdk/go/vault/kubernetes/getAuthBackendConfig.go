// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package kubernetes

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Reads the Role of an Kubernetes from a Vault server. See the [Vault
// documentation](https://www.vaultproject.io/api-docs/auth/kubernetes#read-config) for more
// information.
func LookupAuthBackendConfig(ctx *pulumi.Context, args *LookupAuthBackendConfigArgs, opts ...pulumi.InvokeOption) (*LookupAuthBackendConfigResult, error) {
	var rv LookupAuthBackendConfigResult
	err := ctx.Invoke("vault:kubernetes/getAuthBackendConfig:getAuthBackendConfig", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAuthBackendConfig.
type LookupAuthBackendConfigArgs struct {
	// The unique name for the Kubernetes backend the config to
	// retrieve Role attributes for resides in. Defaults to "kubernetes".
	Backend              *string `pulumi:"backend"`
	DisableIssValidation *bool   `pulumi:"disableIssValidation"`
	DisableLocalCaJwt    *bool   `pulumi:"disableLocalCaJwt"`
	// Optional JWT issuer. If no issuer is specified, `kubernetes.io/serviceaccount` will be used as the default issuer.
	Issuer *string `pulumi:"issuer"`
	// PEM encoded CA cert for use by the TLS client used to talk with the Kubernetes API.
	KubernetesCaCert *string `pulumi:"kubernetesCaCert"`
	// Host must be a host string, a host:port pair, or a URL to the base of the Kubernetes API server.
	KubernetesHost *string `pulumi:"kubernetesHost"`
	// Optional list of PEM-formatted public keys or certificates used to verify the signatures of Kubernetes service account JWTs. If a certificate is given, its public key will be extracted. Not every installation of Kubernetes exposes these keys.
	PemKeys []string `pulumi:"pemKeys"`
}

// A collection of values returned by getAuthBackendConfig.
type LookupAuthBackendConfigResult struct {
	Backend              *string `pulumi:"backend"`
	DisableIssValidation bool    `pulumi:"disableIssValidation"`
	DisableLocalCaJwt    bool    `pulumi:"disableLocalCaJwt"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Optional JWT issuer. If no issuer is specified, `kubernetes.io/serviceaccount` will be used as the default issuer.
	Issuer string `pulumi:"issuer"`
	// PEM encoded CA cert for use by the TLS client used to talk with the Kubernetes API.
	KubernetesCaCert string `pulumi:"kubernetesCaCert"`
	// Host must be a host string, a host:port pair, or a URL to the base of the Kubernetes API server.
	KubernetesHost string `pulumi:"kubernetesHost"`
	// Optional list of PEM-formatted public keys or certificates used to verify the signatures of Kubernetes service account JWTs. If a certificate is given, its public key will be extracted. Not every installation of Kubernetes exposes these keys.
	PemKeys []string `pulumi:"pemKeys"`
}
