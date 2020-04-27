// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package jwt

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type AuthBackendTune struct {
	// List of headers to whitelist and allowing
	// a plugin to include them in the response.
	AllowedResponseHeaders []string `pulumi:"allowedResponseHeaders"`
	// Specifies the list of keys that will
	// not be HMAC'd by audit devices in the request data object.
	AuditNonHmacRequestKeys []string `pulumi:"auditNonHmacRequestKeys"`
	// Specifies the list of keys that will
	// not be HMAC'd by audit devices in the response data object.
	AuditNonHmacResponseKeys []string `pulumi:"auditNonHmacResponseKeys"`
	// Specifies the default time-to-live.
	// If set, this overrides the global default.
	// Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
	DefaultLeaseTtl *string `pulumi:"defaultLeaseTtl"`
	// Specifies whether to show this mount in
	// the UI-specific listing endpoint. Valid values are "unauth" or "hidden".
	ListingVisibility *string `pulumi:"listingVisibility"`
	// Specifies the maximum time-to-live.
	// If set, this overrides the global default.
	// Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
	MaxLeaseTtl *string `pulumi:"maxLeaseTtl"`
	// List of headers to whitelist and
	// pass from the request to the backend.
	PassthroughRequestHeaders []string `pulumi:"passthroughRequestHeaders"`
	// Specifies the type of tokens that should be returned by
	// the mount. Valid values are "default-service", "default-batch", "service", "batch".
	TokenType *string `pulumi:"tokenType"`
}

// AuthBackendTuneInput is an input type that accepts AuthBackendTuneArgs and AuthBackendTuneOutput values.
// You can construct a concrete instance of `AuthBackendTuneInput` via:
//
// 		 AuthBackendTuneArgs{...}
//
type AuthBackendTuneInput interface {
	pulumi.Input

	ToAuthBackendTuneOutput() AuthBackendTuneOutput
	ToAuthBackendTuneOutputWithContext(context.Context) AuthBackendTuneOutput
}

type AuthBackendTuneArgs struct {
	// List of headers to whitelist and allowing
	// a plugin to include them in the response.
	AllowedResponseHeaders pulumi.StringArrayInput `pulumi:"allowedResponseHeaders"`
	// Specifies the list of keys that will
	// not be HMAC'd by audit devices in the request data object.
	AuditNonHmacRequestKeys pulumi.StringArrayInput `pulumi:"auditNonHmacRequestKeys"`
	// Specifies the list of keys that will
	// not be HMAC'd by audit devices in the response data object.
	AuditNonHmacResponseKeys pulumi.StringArrayInput `pulumi:"auditNonHmacResponseKeys"`
	// Specifies the default time-to-live.
	// If set, this overrides the global default.
	// Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
	DefaultLeaseTtl pulumi.StringPtrInput `pulumi:"defaultLeaseTtl"`
	// Specifies whether to show this mount in
	// the UI-specific listing endpoint. Valid values are "unauth" or "hidden".
	ListingVisibility pulumi.StringPtrInput `pulumi:"listingVisibility"`
	// Specifies the maximum time-to-live.
	// If set, this overrides the global default.
	// Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
	MaxLeaseTtl pulumi.StringPtrInput `pulumi:"maxLeaseTtl"`
	// List of headers to whitelist and
	// pass from the request to the backend.
	PassthroughRequestHeaders pulumi.StringArrayInput `pulumi:"passthroughRequestHeaders"`
	// Specifies the type of tokens that should be returned by
	// the mount. Valid values are "default-service", "default-batch", "service", "batch".
	TokenType pulumi.StringPtrInput `pulumi:"tokenType"`
}

func (AuthBackendTuneArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*AuthBackendTune)(nil)).Elem()
}

func (i AuthBackendTuneArgs) ToAuthBackendTuneOutput() AuthBackendTuneOutput {
	return i.ToAuthBackendTuneOutputWithContext(context.Background())
}

func (i AuthBackendTuneArgs) ToAuthBackendTuneOutputWithContext(ctx context.Context) AuthBackendTuneOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendTuneOutput)
}

func (i AuthBackendTuneArgs) ToAuthBackendTunePtrOutput() AuthBackendTunePtrOutput {
	return i.ToAuthBackendTunePtrOutputWithContext(context.Background())
}

func (i AuthBackendTuneArgs) ToAuthBackendTunePtrOutputWithContext(ctx context.Context) AuthBackendTunePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendTuneOutput).ToAuthBackendTunePtrOutputWithContext(ctx)
}

// AuthBackendTunePtrInput is an input type that accepts AuthBackendTuneArgs, AuthBackendTunePtr and AuthBackendTunePtrOutput values.
// You can construct a concrete instance of `AuthBackendTunePtrInput` via:
//
// 		 AuthBackendTuneArgs{...}
//
//  or:
//
// 		 nil
//
type AuthBackendTunePtrInput interface {
	pulumi.Input

	ToAuthBackendTunePtrOutput() AuthBackendTunePtrOutput
	ToAuthBackendTunePtrOutputWithContext(context.Context) AuthBackendTunePtrOutput
}

type authBackendTunePtrType AuthBackendTuneArgs

func AuthBackendTunePtr(v *AuthBackendTuneArgs) AuthBackendTunePtrInput {
	return (*authBackendTunePtrType)(v)
}

func (*authBackendTunePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthBackendTune)(nil)).Elem()
}

func (i *authBackendTunePtrType) ToAuthBackendTunePtrOutput() AuthBackendTunePtrOutput {
	return i.ToAuthBackendTunePtrOutputWithContext(context.Background())
}

func (i *authBackendTunePtrType) ToAuthBackendTunePtrOutputWithContext(ctx context.Context) AuthBackendTunePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthBackendTunePtrOutput)
}

type AuthBackendTuneOutput struct{ *pulumi.OutputState }

func (AuthBackendTuneOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AuthBackendTune)(nil)).Elem()
}

func (o AuthBackendTuneOutput) ToAuthBackendTuneOutput() AuthBackendTuneOutput {
	return o
}

func (o AuthBackendTuneOutput) ToAuthBackendTuneOutputWithContext(ctx context.Context) AuthBackendTuneOutput {
	return o
}

func (o AuthBackendTuneOutput) ToAuthBackendTunePtrOutput() AuthBackendTunePtrOutput {
	return o.ToAuthBackendTunePtrOutputWithContext(context.Background())
}

func (o AuthBackendTuneOutput) ToAuthBackendTunePtrOutputWithContext(ctx context.Context) AuthBackendTunePtrOutput {
	return o.ApplyT(func(v AuthBackendTune) *AuthBackendTune {
		return &v
	}).(AuthBackendTunePtrOutput)
}

// List of headers to whitelist and allowing
// a plugin to include them in the response.
func (o AuthBackendTuneOutput) AllowedResponseHeaders() pulumi.StringArrayOutput {
	return o.ApplyT(func(v AuthBackendTune) []string { return v.AllowedResponseHeaders }).(pulumi.StringArrayOutput)
}

// Specifies the list of keys that will
// not be HMAC'd by audit devices in the request data object.
func (o AuthBackendTuneOutput) AuditNonHmacRequestKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v AuthBackendTune) []string { return v.AuditNonHmacRequestKeys }).(pulumi.StringArrayOutput)
}

// Specifies the list of keys that will
// not be HMAC'd by audit devices in the response data object.
func (o AuthBackendTuneOutput) AuditNonHmacResponseKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v AuthBackendTune) []string { return v.AuditNonHmacResponseKeys }).(pulumi.StringArrayOutput)
}

// Specifies the default time-to-live.
// If set, this overrides the global default.
// Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
func (o AuthBackendTuneOutput) DefaultLeaseTtl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v AuthBackendTune) *string { return v.DefaultLeaseTtl }).(pulumi.StringPtrOutput)
}

// Specifies whether to show this mount in
// the UI-specific listing endpoint. Valid values are "unauth" or "hidden".
func (o AuthBackendTuneOutput) ListingVisibility() pulumi.StringPtrOutput {
	return o.ApplyT(func(v AuthBackendTune) *string { return v.ListingVisibility }).(pulumi.StringPtrOutput)
}

// Specifies the maximum time-to-live.
// If set, this overrides the global default.
// Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
func (o AuthBackendTuneOutput) MaxLeaseTtl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v AuthBackendTune) *string { return v.MaxLeaseTtl }).(pulumi.StringPtrOutput)
}

// List of headers to whitelist and
// pass from the request to the backend.
func (o AuthBackendTuneOutput) PassthroughRequestHeaders() pulumi.StringArrayOutput {
	return o.ApplyT(func(v AuthBackendTune) []string { return v.PassthroughRequestHeaders }).(pulumi.StringArrayOutput)
}

// Specifies the type of tokens that should be returned by
// the mount. Valid values are "default-service", "default-batch", "service", "batch".
func (o AuthBackendTuneOutput) TokenType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v AuthBackendTune) *string { return v.TokenType }).(pulumi.StringPtrOutput)
}

type AuthBackendTunePtrOutput struct{ *pulumi.OutputState }

func (AuthBackendTunePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthBackendTune)(nil)).Elem()
}

func (o AuthBackendTunePtrOutput) ToAuthBackendTunePtrOutput() AuthBackendTunePtrOutput {
	return o
}

func (o AuthBackendTunePtrOutput) ToAuthBackendTunePtrOutputWithContext(ctx context.Context) AuthBackendTunePtrOutput {
	return o
}

func (o AuthBackendTunePtrOutput) Elem() AuthBackendTuneOutput {
	return o.ApplyT(func(v *AuthBackendTune) AuthBackendTune { return *v }).(AuthBackendTuneOutput)
}

// List of headers to whitelist and allowing
// a plugin to include them in the response.
func (o AuthBackendTunePtrOutput) AllowedResponseHeaders() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthBackendTune) []string {
		if v == nil {
			return nil
		}
		return v.AllowedResponseHeaders
	}).(pulumi.StringArrayOutput)
}

// Specifies the list of keys that will
// not be HMAC'd by audit devices in the request data object.
func (o AuthBackendTunePtrOutput) AuditNonHmacRequestKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthBackendTune) []string {
		if v == nil {
			return nil
		}
		return v.AuditNonHmacRequestKeys
	}).(pulumi.StringArrayOutput)
}

// Specifies the list of keys that will
// not be HMAC'd by audit devices in the response data object.
func (o AuthBackendTunePtrOutput) AuditNonHmacResponseKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthBackendTune) []string {
		if v == nil {
			return nil
		}
		return v.AuditNonHmacResponseKeys
	}).(pulumi.StringArrayOutput)
}

// Specifies the default time-to-live.
// If set, this overrides the global default.
// Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
func (o AuthBackendTunePtrOutput) DefaultLeaseTtl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendTune) *string {
		if v == nil {
			return nil
		}
		return v.DefaultLeaseTtl
	}).(pulumi.StringPtrOutput)
}

// Specifies whether to show this mount in
// the UI-specific listing endpoint. Valid values are "unauth" or "hidden".
func (o AuthBackendTunePtrOutput) ListingVisibility() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendTune) *string {
		if v == nil {
			return nil
		}
		return v.ListingVisibility
	}).(pulumi.StringPtrOutput)
}

// Specifies the maximum time-to-live.
// If set, this overrides the global default.
// Must be a valid [duration string](https://golang.org/pkg/time/#ParseDuration)
func (o AuthBackendTunePtrOutput) MaxLeaseTtl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendTune) *string {
		if v == nil {
			return nil
		}
		return v.MaxLeaseTtl
	}).(pulumi.StringPtrOutput)
}

// List of headers to whitelist and
// pass from the request to the backend.
func (o AuthBackendTunePtrOutput) PassthroughRequestHeaders() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AuthBackendTune) []string {
		if v == nil {
			return nil
		}
		return v.PassthroughRequestHeaders
	}).(pulumi.StringArrayOutput)
}

// Specifies the type of tokens that should be returned by
// the mount. Valid values are "default-service", "default-batch", "service", "batch".
func (o AuthBackendTunePtrOutput) TokenType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthBackendTune) *string {
		if v == nil {
			return nil
		}
		return v.TokenType
	}).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(AuthBackendTuneOutput{})
	pulumi.RegisterOutputType(AuthBackendTunePtrOutput{})
}
