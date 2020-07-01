// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vault

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// ## Example Usage
// ### File Audit Device)
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-vault/sdk/v2/go/vault"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := vault.NewAudit(ctx, "test", &vault.AuditArgs{
// 			Options: pulumi.StringMap{
// 				"file_path": pulumi.String("C:/temp/audit.txt"),
// 			},
// 			Type: pulumi.String("file"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Socket Audit Device)
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-vault/sdk/v2/go/vault"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := vault.NewAudit(ctx, "test", &vault.AuditArgs{
// 			Options: pulumi.StringMap{
// 				"address":     pulumi.String("127.0.0.1:8000"),
// 				"description": pulumi.String("application x socket"),
// 				"socket_type": pulumi.String("tcp"),
// 			},
// 			Path: pulumi.String("app_socket"),
// 			Type: pulumi.String("socket"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type Audit struct {
	pulumi.CustomResourceState

	// Human-friendly description of the audit device.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Configuration options to pass to the audit device itself.
	Options pulumi.StringMapOutput `pulumi:"options"`
	// The path to mount the audit device. This defaults to the type.
	Path pulumi.StringOutput `pulumi:"path"`
	// Type of the audit device, such as 'file'.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewAudit registers a new resource with the given unique name, arguments, and options.
func NewAudit(ctx *pulumi.Context,
	name string, args *AuditArgs, opts ...pulumi.ResourceOption) (*Audit, error) {
	if args == nil || args.Options == nil {
		return nil, errors.New("missing required argument 'Options'")
	}
	if args == nil || args.Type == nil {
		return nil, errors.New("missing required argument 'Type'")
	}
	if args == nil {
		args = &AuditArgs{}
	}
	var resource Audit
	err := ctx.RegisterResource("vault:index/audit:Audit", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAudit gets an existing Audit resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAudit(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuditState, opts ...pulumi.ResourceOption) (*Audit, error) {
	var resource Audit
	err := ctx.ReadResource("vault:index/audit:Audit", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Audit resources.
type auditState struct {
	// Human-friendly description of the audit device.
	Description *string `pulumi:"description"`
	// Configuration options to pass to the audit device itself.
	Options map[string]string `pulumi:"options"`
	// The path to mount the audit device. This defaults to the type.
	Path *string `pulumi:"path"`
	// Type of the audit device, such as 'file'.
	Type *string `pulumi:"type"`
}

type AuditState struct {
	// Human-friendly description of the audit device.
	Description pulumi.StringPtrInput
	// Configuration options to pass to the audit device itself.
	Options pulumi.StringMapInput
	// The path to mount the audit device. This defaults to the type.
	Path pulumi.StringPtrInput
	// Type of the audit device, such as 'file'.
	Type pulumi.StringPtrInput
}

func (AuditState) ElementType() reflect.Type {
	return reflect.TypeOf((*auditState)(nil)).Elem()
}

type auditArgs struct {
	// Human-friendly description of the audit device.
	Description *string `pulumi:"description"`
	// Configuration options to pass to the audit device itself.
	Options map[string]string `pulumi:"options"`
	// The path to mount the audit device. This defaults to the type.
	Path *string `pulumi:"path"`
	// Type of the audit device, such as 'file'.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a Audit resource.
type AuditArgs struct {
	// Human-friendly description of the audit device.
	Description pulumi.StringPtrInput
	// Configuration options to pass to the audit device itself.
	Options pulumi.StringMapInput
	// The path to mount the audit device. This defaults to the type.
	Path pulumi.StringPtrInput
	// Type of the audit device, such as 'file'.
	Type pulumi.StringInput
}

func (AuditArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*auditArgs)(nil)).Elem()
}
