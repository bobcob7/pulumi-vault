// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kv

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-vault/sdk/v5/go/vault"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "vault:kv/secret:Secret":
		r = &Secret{}
	case "vault:kv/secretBackendV2:SecretBackendV2":
		r = &SecretBackendV2{}
	case "vault:kv/secretV2:SecretV2":
		r = &SecretV2{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := vault.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"vault",
		"kv/secret",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"vault",
		"kv/secretBackendV2",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"vault",
		"kv/secretV2",
		&module{version},
	)
}
