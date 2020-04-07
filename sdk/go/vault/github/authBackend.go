// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package github

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Manages a Github Auth mount in a Vault server. See the [Vault
// documentation](https://www.vaultproject.io/docs/auth/github.html) for more
// information.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-vault/blob/master/website/docs/r/github_auth_backend.html.md.
type AuthBackend struct {
	pulumi.CustomResourceState

	// The mount accessor related to the auth mount. It is useful for integration with [Identity Secrets Engine](https://www.vaultproject.io/docs/secrets/identity/index.html).
	Accessor pulumi.StringOutput `pulumi:"accessor"`
	// The API endpoint to use. Useful if you
	// are running GitHub Enterprise or an API-compatible authentication server.
	BaseUrl pulumi.StringPtrOutput `pulumi:"baseUrl"`
	// Specifies the description of the mount.
	// This overrides the current stored value, if any.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// (Optional; Deprecated, use `tokenMaxTtl` instead if you are running Vault >= 1.2) The maximum allowed lifetime of tokens
	// issued using this role. This must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration).
	MaxTtl pulumi.StringPtrOutput `pulumi:"maxTtl"`
	// The organization configured users must be part of.
	Organization pulumi.StringOutput `pulumi:"organization"`
	// Path where the auth backend is mounted. Defaults to `auth/github`
	// if not specified.
	Path pulumi.StringPtrOutput `pulumi:"path"`
	// (Optional) List of CIDR blocks; if set, specifies blocks of IP
	// addresses which can authenticate successfully, and ties the resulting token to these blocks
	// as well.
	TokenBoundCidrs pulumi.StringArrayOutput `pulumi:"tokenBoundCidrs"`
	// (Optional) If set, will encode an
	// [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
	// onto the token in number of seconds. This is a hard cap even if `tokenTtl` and
	// `tokenMaxTtl` would otherwise allow a renewal.
	TokenExplicitMaxTtl pulumi.IntPtrOutput `pulumi:"tokenExplicitMaxTtl"`
	// (Optional) The maximum lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenMaxTtl pulumi.IntPtrOutput `pulumi:"tokenMaxTtl"`
	// (Optional) If set, the default policy will not be set on
	// generated tokens; otherwise it will be added to the policies set in token_policies.
	TokenNoDefaultPolicy pulumi.BoolPtrOutput `pulumi:"tokenNoDefaultPolicy"`
	// (Optional) The
	// [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
	// if any, in number of seconds to set on the token.
	TokenNumUses pulumi.IntPtrOutput `pulumi:"tokenNumUses"`
	// (Optional) If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	TokenPeriod pulumi.IntPtrOutput `pulumi:"tokenPeriod"`
	// (Optional) List of policies to encode onto generated tokens. Depending
	// on the auth method, this list may be supplemented by user/group/other values.
	TokenPolicies pulumi.StringArrayOutput `pulumi:"tokenPolicies"`
	// (Optional) The incremental lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenTtl pulumi.IntPtrOutput `pulumi:"tokenTtl"`
	// Specifies the type of tokens that should be returned by
	// the mount. Valid values are "default-service", "default-batch", "service", "batch".
	TokenType pulumi.StringPtrOutput `pulumi:"tokenType"`
	// (Optional; Deprecated, use `tokenTtl` instead if you are running Vault >= 1.2) The TTL period of tokens issued
	// using this role. This must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration).
	Ttl  pulumi.StringPtrOutput `pulumi:"ttl"`
	Tune AuthBackendTuneOutput  `pulumi:"tune"`
}

// NewAuthBackend registers a new resource with the given unique name, arguments, and options.
func NewAuthBackend(ctx *pulumi.Context,
	name string, args *AuthBackendArgs, opts ...pulumi.ResourceOption) (*AuthBackend, error) {
	if args == nil || args.Organization == nil {
		return nil, errors.New("missing required argument 'Organization'")
	}
	if args == nil {
		args = &AuthBackendArgs{}
	}
	var resource AuthBackend
	err := ctx.RegisterResource("vault:github/authBackend:AuthBackend", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthBackend gets an existing AuthBackend resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthBackend(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthBackendState, opts ...pulumi.ResourceOption) (*AuthBackend, error) {
	var resource AuthBackend
	err := ctx.ReadResource("vault:github/authBackend:AuthBackend", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthBackend resources.
type authBackendState struct {
	// The mount accessor related to the auth mount. It is useful for integration with [Identity Secrets Engine](https://www.vaultproject.io/docs/secrets/identity/index.html).
	Accessor *string `pulumi:"accessor"`
	// The API endpoint to use. Useful if you
	// are running GitHub Enterprise or an API-compatible authentication server.
	BaseUrl *string `pulumi:"baseUrl"`
	// Specifies the description of the mount.
	// This overrides the current stored value, if any.
	Description *string `pulumi:"description"`
	// (Optional; Deprecated, use `tokenMaxTtl` instead if you are running Vault >= 1.2) The maximum allowed lifetime of tokens
	// issued using this role. This must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration).
	MaxTtl *string `pulumi:"maxTtl"`
	// The organization configured users must be part of.
	Organization *string `pulumi:"organization"`
	// Path where the auth backend is mounted. Defaults to `auth/github`
	// if not specified.
	Path *string `pulumi:"path"`
	// (Optional) List of CIDR blocks; if set, specifies blocks of IP
	// addresses which can authenticate successfully, and ties the resulting token to these blocks
	// as well.
	TokenBoundCidrs []string `pulumi:"tokenBoundCidrs"`
	// (Optional) If set, will encode an
	// [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
	// onto the token in number of seconds. This is a hard cap even if `tokenTtl` and
	// `tokenMaxTtl` would otherwise allow a renewal.
	TokenExplicitMaxTtl *int `pulumi:"tokenExplicitMaxTtl"`
	// (Optional) The maximum lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenMaxTtl *int `pulumi:"tokenMaxTtl"`
	// (Optional) If set, the default policy will not be set on
	// generated tokens; otherwise it will be added to the policies set in token_policies.
	TokenNoDefaultPolicy *bool `pulumi:"tokenNoDefaultPolicy"`
	// (Optional) The
	// [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
	// if any, in number of seconds to set on the token.
	TokenNumUses *int `pulumi:"tokenNumUses"`
	// (Optional) If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	TokenPeriod *int `pulumi:"tokenPeriod"`
	// (Optional) List of policies to encode onto generated tokens. Depending
	// on the auth method, this list may be supplemented by user/group/other values.
	TokenPolicies []string `pulumi:"tokenPolicies"`
	// (Optional) The incremental lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenTtl *int `pulumi:"tokenTtl"`
	// Specifies the type of tokens that should be returned by
	// the mount. Valid values are "default-service", "default-batch", "service", "batch".
	TokenType *string `pulumi:"tokenType"`
	// (Optional; Deprecated, use `tokenTtl` instead if you are running Vault >= 1.2) The TTL period of tokens issued
	// using this role. This must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration).
	Ttl  *string          `pulumi:"ttl"`
	Tune *AuthBackendTune `pulumi:"tune"`
}

type AuthBackendState struct {
	// The mount accessor related to the auth mount. It is useful for integration with [Identity Secrets Engine](https://www.vaultproject.io/docs/secrets/identity/index.html).
	Accessor pulumi.StringPtrInput
	// The API endpoint to use. Useful if you
	// are running GitHub Enterprise or an API-compatible authentication server.
	BaseUrl pulumi.StringPtrInput
	// Specifies the description of the mount.
	// This overrides the current stored value, if any.
	Description pulumi.StringPtrInput
	// (Optional; Deprecated, use `tokenMaxTtl` instead if you are running Vault >= 1.2) The maximum allowed lifetime of tokens
	// issued using this role. This must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration).
	MaxTtl pulumi.StringPtrInput
	// The organization configured users must be part of.
	Organization pulumi.StringPtrInput
	// Path where the auth backend is mounted. Defaults to `auth/github`
	// if not specified.
	Path pulumi.StringPtrInput
	// (Optional) List of CIDR blocks; if set, specifies blocks of IP
	// addresses which can authenticate successfully, and ties the resulting token to these blocks
	// as well.
	TokenBoundCidrs pulumi.StringArrayInput
	// (Optional) If set, will encode an
	// [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
	// onto the token in number of seconds. This is a hard cap even if `tokenTtl` and
	// `tokenMaxTtl` would otherwise allow a renewal.
	TokenExplicitMaxTtl pulumi.IntPtrInput
	// (Optional) The maximum lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenMaxTtl pulumi.IntPtrInput
	// (Optional) If set, the default policy will not be set on
	// generated tokens; otherwise it will be added to the policies set in token_policies.
	TokenNoDefaultPolicy pulumi.BoolPtrInput
	// (Optional) The
	// [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
	// if any, in number of seconds to set on the token.
	TokenNumUses pulumi.IntPtrInput
	// (Optional) If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	TokenPeriod pulumi.IntPtrInput
	// (Optional) List of policies to encode onto generated tokens. Depending
	// on the auth method, this list may be supplemented by user/group/other values.
	TokenPolicies pulumi.StringArrayInput
	// (Optional) The incremental lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenTtl pulumi.IntPtrInput
	// Specifies the type of tokens that should be returned by
	// the mount. Valid values are "default-service", "default-batch", "service", "batch".
	TokenType pulumi.StringPtrInput
	// (Optional; Deprecated, use `tokenTtl` instead if you are running Vault >= 1.2) The TTL period of tokens issued
	// using this role. This must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration).
	Ttl  pulumi.StringPtrInput
	Tune AuthBackendTunePtrInput
}

func (AuthBackendState) ElementType() reflect.Type {
	return reflect.TypeOf((*authBackendState)(nil)).Elem()
}

type authBackendArgs struct {
	// The API endpoint to use. Useful if you
	// are running GitHub Enterprise or an API-compatible authentication server.
	BaseUrl *string `pulumi:"baseUrl"`
	// Specifies the description of the mount.
	// This overrides the current stored value, if any.
	Description *string `pulumi:"description"`
	// (Optional; Deprecated, use `tokenMaxTtl` instead if you are running Vault >= 1.2) The maximum allowed lifetime of tokens
	// issued using this role. This must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration).
	MaxTtl *string `pulumi:"maxTtl"`
	// The organization configured users must be part of.
	Organization string `pulumi:"organization"`
	// Path where the auth backend is mounted. Defaults to `auth/github`
	// if not specified.
	Path *string `pulumi:"path"`
	// (Optional) List of CIDR blocks; if set, specifies blocks of IP
	// addresses which can authenticate successfully, and ties the resulting token to these blocks
	// as well.
	TokenBoundCidrs []string `pulumi:"tokenBoundCidrs"`
	// (Optional) If set, will encode an
	// [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
	// onto the token in number of seconds. This is a hard cap even if `tokenTtl` and
	// `tokenMaxTtl` would otherwise allow a renewal.
	TokenExplicitMaxTtl *int `pulumi:"tokenExplicitMaxTtl"`
	// (Optional) The maximum lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenMaxTtl *int `pulumi:"tokenMaxTtl"`
	// (Optional) If set, the default policy will not be set on
	// generated tokens; otherwise it will be added to the policies set in token_policies.
	TokenNoDefaultPolicy *bool `pulumi:"tokenNoDefaultPolicy"`
	// (Optional) The
	// [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
	// if any, in number of seconds to set on the token.
	TokenNumUses *int `pulumi:"tokenNumUses"`
	// (Optional) If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	TokenPeriod *int `pulumi:"tokenPeriod"`
	// (Optional) List of policies to encode onto generated tokens. Depending
	// on the auth method, this list may be supplemented by user/group/other values.
	TokenPolicies []string `pulumi:"tokenPolicies"`
	// (Optional) The incremental lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenTtl *int `pulumi:"tokenTtl"`
	// Specifies the type of tokens that should be returned by
	// the mount. Valid values are "default-service", "default-batch", "service", "batch".
	TokenType *string `pulumi:"tokenType"`
	// (Optional; Deprecated, use `tokenTtl` instead if you are running Vault >= 1.2) The TTL period of tokens issued
	// using this role. This must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration).
	Ttl  *string          `pulumi:"ttl"`
	Tune *AuthBackendTune `pulumi:"tune"`
}

// The set of arguments for constructing a AuthBackend resource.
type AuthBackendArgs struct {
	// The API endpoint to use. Useful if you
	// are running GitHub Enterprise or an API-compatible authentication server.
	BaseUrl pulumi.StringPtrInput
	// Specifies the description of the mount.
	// This overrides the current stored value, if any.
	Description pulumi.StringPtrInput
	// (Optional; Deprecated, use `tokenMaxTtl` instead if you are running Vault >= 1.2) The maximum allowed lifetime of tokens
	// issued using this role. This must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration).
	MaxTtl pulumi.StringPtrInput
	// The organization configured users must be part of.
	Organization pulumi.StringInput
	// Path where the auth backend is mounted. Defaults to `auth/github`
	// if not specified.
	Path pulumi.StringPtrInput
	// (Optional) List of CIDR blocks; if set, specifies blocks of IP
	// addresses which can authenticate successfully, and ties the resulting token to these blocks
	// as well.
	TokenBoundCidrs pulumi.StringArrayInput
	// (Optional) If set, will encode an
	// [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
	// onto the token in number of seconds. This is a hard cap even if `tokenTtl` and
	// `tokenMaxTtl` would otherwise allow a renewal.
	TokenExplicitMaxTtl pulumi.IntPtrInput
	// (Optional) The maximum lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenMaxTtl pulumi.IntPtrInput
	// (Optional) If set, the default policy will not be set on
	// generated tokens; otherwise it will be added to the policies set in token_policies.
	TokenNoDefaultPolicy pulumi.BoolPtrInput
	// (Optional) The
	// [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
	// if any, in number of seconds to set on the token.
	TokenNumUses pulumi.IntPtrInput
	// (Optional) If set, indicates that the
	// token generated using this role should never expire. The token should be renewed within the
	// duration specified by this value. At each renewal, the token's TTL will be set to the
	// value of this field. Specified in seconds.
	TokenPeriod pulumi.IntPtrInput
	// (Optional) List of policies to encode onto generated tokens. Depending
	// on the auth method, this list may be supplemented by user/group/other values.
	TokenPolicies pulumi.StringArrayInput
	// (Optional) The incremental lifetime for generated tokens in number of seconds.
	// Its current value will be referenced at renewal time.
	TokenTtl pulumi.IntPtrInput
	// Specifies the type of tokens that should be returned by
	// the mount. Valid values are "default-service", "default-batch", "service", "batch".
	TokenType pulumi.StringPtrInput
	// (Optional; Deprecated, use `tokenTtl` instead if you are running Vault >= 1.2) The TTL period of tokens issued
	// using this role. This must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration).
	Ttl  pulumi.StringPtrInput
	Tune AuthBackendTunePtrInput
}

func (AuthBackendArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authBackendArgs)(nil)).Elem()
}
