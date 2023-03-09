// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aws

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
	case "vault:aws/authBackendCert:AuthBackendCert":
		r = &AuthBackendCert{}
	case "vault:aws/authBackendClient:AuthBackendClient":
		r = &AuthBackendClient{}
	case "vault:aws/authBackendConfigIdentity:AuthBackendConfigIdentity":
		r = &AuthBackendConfigIdentity{}
	case "vault:aws/authBackendIdentityWhitelist:AuthBackendIdentityWhitelist":
		r = &AuthBackendIdentityWhitelist{}
	case "vault:aws/authBackendLogin:AuthBackendLogin":
		r = &AuthBackendLogin{}
	case "vault:aws/authBackendRole:AuthBackendRole":
		r = &AuthBackendRole{}
	case "vault:aws/authBackendRoleTag:AuthBackendRoleTag":
		r = &AuthBackendRoleTag{}
	case "vault:aws/authBackendRoletagBlacklist:AuthBackendRoletagBlacklist":
		r = &AuthBackendRoletagBlacklist{}
	case "vault:aws/authBackendStsRole:AuthBackendStsRole":
		r = &AuthBackendStsRole{}
	case "vault:aws/secretBackend:SecretBackend":
		r = &SecretBackend{}
	case "vault:aws/secretBackendRole:SecretBackendRole":
		r = &SecretBackendRole{}
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
		"aws/authBackendCert",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"vault",
		"aws/authBackendClient",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"vault",
		"aws/authBackendConfigIdentity",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"vault",
		"aws/authBackendIdentityWhitelist",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"vault",
		"aws/authBackendLogin",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"vault",
		"aws/authBackendRole",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"vault",
		"aws/authBackendRoleTag",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"vault",
		"aws/authBackendRoletagBlacklist",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"vault",
		"aws/authBackendStsRole",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"vault",
		"aws/secretBackend",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"vault",
		"aws/secretBackendRole",
		&module{version},
	)
}
