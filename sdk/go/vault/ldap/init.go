// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ldap

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-vault/sdk/v4/go/vault"
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
	case "vault:ldap/authBackend:AuthBackend":
		r = &AuthBackend{}
	case "vault:ldap/authBackendGroup:AuthBackendGroup":
		r = &AuthBackendGroup{}
	case "vault:ldap/authBackendUser:AuthBackendUser":
		r = &AuthBackendUser{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := vault.PkgVersion()
	if err != nil {
		fmt.Println("failed to determine package version. defaulting to v1: %v", err)
	}
	pulumi.RegisterResourceModule(
		"vault",
		"ldap/authBackend",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"vault",
		"ldap/authBackendGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"vault",
		"ldap/authBackendUser",
		&module{version},
	)
}
