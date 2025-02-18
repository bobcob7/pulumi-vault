// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package provider

import (
	"fmt"
	"path/filepath"
	"strings"
	"unicode"

	"github.com/hashicorp/terraform-provider-vault/generated"
	"github.com/hashicorp/terraform-provider-vault/schema"
	"github.com/hashicorp/terraform-provider-vault/vault"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi-vault/provider/v5/pkg/version"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "vault"

	// modules:
	mainMod           = "index"
	appRoleMod        = "AppRole"
	adMod             = "AD"
	aliCloudMod       = "AliCloud"
	awsMod            = "Aws"
	azureMod          = "Azure"
	consulMod         = "Consul"
	databaseMod       = "Database"
	gcpMod            = "Gcp"
	genericMod        = "Generic"
	githubMod         = "GitHub"
	identityMod       = "Identity"
	jwtMod            = "Jwt"
	kmipMod           = "Kmip"
	kubernetesMod     = "Kubernetes"
	kvMod             = "kv"
	ldapMod           = "Ldap"
	managedMod        = "Managed"
	oktaMod           = "Okta"
	pkiSecretMod      = "PkiSecret"
	rabbitMqMod       = "RabbitMQ"
	sshMod            = "Ssh"
	terraformCloudMod = "TerraformCloud"
	tokenMod          = "TokenAuth"
	transformMod      = "Transform"
	transitMod        = "Transit"
)

var namespaceMap = map[string]string{
	mainPkg: "Vault",
}

// Override legacy name in JS and Python that were used instead of lowercase.
var specialNamesMap = map[string]string{
	"AppRole":   "appRole",
	"PkiSecret": "pkiSecret",
	"RabbitMQ":  "rabbitMq",
}

func makeMember(moduleTitle string, mem string) tokens.ModuleMember {
	moduleName := strings.ToLower(moduleTitle)
	if value, exist := specialNamesMap[moduleTitle]; exist {
		moduleName = value
	}
	namespaceMap[moduleName] = moduleTitle
	fn := string(unicode.ToLower(rune(mem[0]))) + mem[1:]
	token := moduleName + "/" + fn
	return tokens.ModuleMember(mainPkg + ":" + token + ":" + mem)
}

func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

func makeDataSource(mod string, res string) tokens.ModuleMember {
	return makeMember(mod, res)
}

func makeResource(mod string, res string) tokens.Type {
	return makeType(mod, res)
}

func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

func stringRef(s string) *string {
	return &s
}

// Provider returns additional overlaid schema and metadata associated with the provider.
func Provider() tfbridge.ProviderInfo {
	provider := vault.Provider()
	generatedProvider := schema.NewProvider(provider)
	for name, resource := range generated.DataSourceRegistry {
		generatedProvider.RegisterDataSource(name, resource)
	}
	for name, resource := range generated.ResourceRegistry {
		generatedProvider.RegisterResource(name, resource)
	}
	p := shimv2.NewProvider(generatedProvider.SchemaProvider())

	// Temporarily override the secretness of `headers` field.
	// https://github.com/pulumi/pulumi/issues/11278
	overrideSecretFlagForHeaders := false
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "vault",
		DisplayName: "HashiCorp Vault",
		Description: "A Pulumi package for creating and managing HashiCorp Vault cloud resources.",
		Keywords:    []string{"pulumi", "vault"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		GitHubOrg:   "hashicorp",
		Repository:  "https://github.com/pulumi/pulumi-vault",
		Config: map[string]*tfbridge.SchemaInfo{
			"skip_tls_verify": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{
						"VAULT_SKIP_VERIFY",
					},
				},
			},
			"max_lease_ttl_seconds": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{
						"TERRAFORM_VAULT_MAX_TTL",
					},
					Value: 1200,
				},
			},
			"max_retries": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{
						"VAULT_MAX_RETRIES",
					},
					Value: 2,
				},
			},
			"headers": {
				Secret: &overrideSecretFlagForHeaders,
			},
			"token": {
				MarkAsOptional: tfbridge.True(),
			},
		},
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			// Main
			"vault_audit":                  {Tok: makeResource(mainMod, "Audit")},
			"vault_audit_request_header":   {Tok: makeResource(mainMod, "AuditRequestHeader")},
			"vault_auth_backend":           {Tok: makeResource(mainMod, "AuthBackend")},
			"vault_cert_auth_backend_role": {Tok: makeResource(mainMod, "CertAuthBackendRole")},
			"vault_egp_policy":             {Tok: makeResource(mainMod, "EgpPolicy")},
			"vault_mfa_duo":                {Tok: makeResource(mainMod, "MfaDuo")},
			"vault_mfa_okta":               {Tok: makeResource(mainMod, "MfaOkta")},
			"vault_mfa_pingid":             {Tok: makeResource(mainMod, "MfaPingid")},
			"vault_mfa_totp":               {Tok: makeResource(mainMod, "MfaTotp")},
			"vault_mount":                  {Tok: makeResource(mainMod, "Mount")},
			"vault_namespace": {Tok: makeResource(mainMod, "Namespace"),
				Fields: map[string]*tfbridge.SchemaInfo{"namespace": {
					// error CS0542: 'Namespace': member names cannot be the same as their enclosing type
					CSharpName: "TargetNamespace",
				}}},
			"vault_policy": {
				Tok: makeResource(mainMod, "Policy"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"policy": {
						CSharpName: "PolicyContents",
					},
				},
			},
			"vault_rgp_policy":                 {Tok: makeResource(mainMod, "RgpPolicy")},
			"vault_token":                      {Tok: makeResource(mainMod, "Token")},
			"vault_quota_rate_limit":           {Tok: makeResource(mainMod, "QuotaRateLimit")},
			"vault_nomad_secret_backend":       {Tok: makeResource(mainMod, "NomadSecretBackend")},
			"vault_nomad_secret_role":          {Tok: makeResource(mainMod, "NomadSecretRole")},
			"vault_password_policy":            {Tok: makeResource(mainMod, "PasswordPolicy")},
			"vault_quota_lease_count":          {Tok: makeResource(mainMod, "QuotaLeaseCount")},
			"vault_raft_snapshot_agent_config": {Tok: makeResource(mainMod, "RaftSnapshotAgentConfig")},
			"vault_raft_autopilot":             {Tok: makeResource(mainMod, "RaftAutopilot")},

			// AD
			"vault_ad_secret_backend": {Tok: makeResource(adMod, "SecretBackend")},
			"vault_ad_secret_role":    {Tok: makeResource(adMod, "SecretRole")},
			"vault_ad_secret_library": {
				Tok: makeResource(adMod, "SecretLibrary"),
				Docs: &tfbridge.DocInfo{
					Source: "ad_secret_backend_library.html.md",
				},
			},

			// AppRole
			"vault_approle_auth_backend_role":  {Tok: makeResource(appRoleMod, "AuthBackendRole")},
			"vault_approle_auth_backend_login": {Tok: makeResource(appRoleMod, "AuthBackendLogin")},
			"vault_approle_auth_backend_role_secret_id": {
				Tok: makeResource(appRoleMod, "AuthBackendRoleSecretId"),
				Aliases: []tfbridge.AliasInfo{
					{Type: stringRef(makeResource(appRoleMod, "AuthBackendRoleSecretID").String())},
				},
			},

			// AliCloud
			"vault_alicloud_auth_backend_role": {Tok: makeResource(aliCloudMod, "AuthBackendRole")},

			// AWS
			"vault_aws_auth_backend_cert":               {Tok: makeResource(awsMod, "AuthBackendCert")},
			"vault_aws_auth_backend_client":             {Tok: makeResource(awsMod, "AuthBackendClient")},
			"vault_aws_auth_backend_config_identity":    {Tok: makeResource(awsMod, "AuthBackendConfigIdentity")},
			"vault_aws_auth_backend_identity_whitelist": {Tok: makeResource(awsMod, "AuthBackendIdentityWhitelist")},
			"vault_aws_auth_backend_login":              {Tok: makeResource(awsMod, "AuthBackendLogin")},
			"vault_aws_auth_backend_role":               {Tok: makeResource(awsMod, "AuthBackendRole")},
			"vault_aws_auth_backend_role_tag":           {Tok: makeResource(awsMod, "AuthBackendRoleTag")},
			"vault_aws_auth_backend_roletag_blacklist":  {Tok: makeResource(awsMod, "AuthBackendRoletagBlacklist")},
			"vault_aws_auth_backend_sts_role":           {Tok: makeResource(awsMod, "AuthBackendStsRole")},
			"vault_aws_secret_backend":                  {Tok: makeResource(awsMod, "SecretBackend")},
			"vault_aws_secret_backend_role":             {Tok: makeResource(awsMod, "SecretBackendRole")},

			// Azure
			"vault_azure_auth_backend_config": {Tok: makeResource(azureMod, "AuthBackendConfig")},
			"vault_azure_auth_backend_role":   {Tok: makeResource(azureMod, "AuthBackendRole")},
			"vault_azure_secret_backend":      {Tok: makeResource(azureMod, "Backend")},
			"vault_azure_secret_backend_role": {Tok: makeResource(azureMod, "BackendRole")},

			// Consul
			"vault_consul_secret_backend":      {Tok: makeResource(consulMod, "SecretBackend")},
			"vault_consul_secret_backend_role": {Tok: makeResource(consulMod, "SecretBackendRole")},

			// Database
			"vault_database_secret_backend_connection": {
				Tok: makeResource(databaseMod, "SecretBackendConnection"),
				Docs: &tfbridge.DocInfo{
					Source: "database_secret_backend_connection.md",
				},
			},
			"vault_database_secret_backend_role": {
				Tok: makeResource(databaseMod, "SecretBackendRole"),
				Docs: &tfbridge.DocInfo{
					Source: "database_secret_backend_role.md",
				},
			},
			"vault_database_secret_backend_static_role": {
				Tok: makeResource(databaseMod, "SecretBackendStaticRole"),
				Docs: &tfbridge.DocInfo{
					Source: "database_secret_backend_static_role.md",
				},
			},
			"vault_database_secrets_mount": {Tok: makeResource(databaseMod, "SecretsMount")},

			// GCP
			"vault_gcp_auth_backend":                {Tok: makeResource(gcpMod, "AuthBackend")},
			"vault_gcp_auth_backend_role":           {Tok: makeResource(gcpMod, "AuthBackendRole")},
			"vault_gcp_secret_backend":              {Tok: makeResource(gcpMod, "SecretBackend")},
			"vault_gcp_secret_impersonated_account": {Tok: makeResource(gcpMod, "SecretImpersonatedAccount")},
			"vault_gcp_secret_roleset":              {Tok: makeResource(gcpMod, "SecretRoleset")},
			"vault_gcp_secret_static_account":       {Tok: makeResource(gcpMod, "SecretStaticAccount")},

			// Generic
			"vault_generic_endpoint": {Tok: makeResource(genericMod, "Endpoint")},
			"vault_generic_secret":   {Tok: makeResource(genericMod, "Secret")},

			// Github
			"vault_github_auth_backend": {Tok: makeResource(githubMod, "AuthBackend")},
			"vault_github_team": {
				Tok: makeResource(githubMod, "Team"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"team": {
						CSharpName: "TeamCity",
					},
				},
			},
			"vault_github_user": {
				Tok: makeResource(githubMod, "User"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"user": {
						CSharpName: "UserName",
					},
				},
			},

			// Identity
			"vault_identity_entity":       {Tok: makeResource(identityMod, "Entity")},
			"vault_identity_entity_alias": {Tok: makeResource(identityMod, "EntityAlias")},
			"vault_identity_group":        {Tok: makeResource(identityMod, "Group")},
			"vault_identity_group_alias": {
				Tok: makeResource(identityMod, "GroupAlias"),
				Fields: map[string]*tfbridge.SchemaInfo{
					//Fixes https://github.com/pulumi/pulumi-vault/issues/11
					"name": {
						Name: "name",
					},
				},
			},
			"vault_identity_group_member_group_ids": {Tok: makeResource(identityMod, "GroupMemberGroupIds")},
			"vault_identity_group_policies": {
				Tok: makeResource(identityMod, "GroupPolicies"),
				Docs: &tfbridge.DocInfo{
					Source: "database_secret_backend_role.md",
				},
			},
			"vault_identity_mfa_duo":                    {Tok: makeResource(identityMod, "MfaDuo")},
			"vault_identity_mfa_login_enforcement":      {Tok: makeResource(identityMod, "MfaLoginEnforcement")},
			"vault_identity_mfa_okta":                   {Tok: makeResource(identityMod, "MfaOkta")},
			"vault_identity_mfa_pingid":                 {Tok: makeResource(identityMod, "MfaPingid")},
			"vault_identity_mfa_totp":                   {Tok: makeResource(identityMod, "MfaTotp")},
			"vault_identity_oidc":                       {Tok: makeResource(identityMod, "Oidc")},
			"vault_identity_oidc_key":                   {Tok: makeResource(identityMod, "OidcKey")},
			"vault_identity_oidc_key_allowed_client_id": {Tok: makeResource(identityMod, "OidcKeyAllowedClientID")},
			"vault_identity_oidc_role":                  {Tok: makeResource(identityMod, "OidcRole")},
			"vault_identity_entity_policies": {
				Tok: makeResource(identityMod, "EntityPolicies"),
				Docs: &tfbridge.DocInfo{
					Source: "identity_entity_policies.html.md",
				},
			},
			"vault_identity_group_member_entity_ids": {Tok: makeResource(identityMod, "GroupMemberEntityIds")},
			"vault_identity_oidc_assignment":         {Tok: makeResource(identityMod, "OidcAssignment")},
			"vault_identity_oidc_client":             {Tok: makeResource(identityMod, "OidcClient")},
			"vault_identity_oidc_provider":           {Tok: makeResource(identityMod, "OidcProvider")},
			"vault_identity_oidc_scope":              {Tok: makeResource(identityMod, "OidcScope")},

			// JWT
			"vault_jwt_auth_backend":      {Tok: makeResource(jwtMod, "AuthBackend")},
			"vault_jwt_auth_backend_role": {Tok: makeResource(jwtMod, "AuthBackendRole")},

			// KMIP
			"vault_kmip_secret_backend": {Tok: makeResource(kmipMod, "SecretBackend")},
			"vault_kmip_secret_role":    {Tok: makeResource(kmipMod, "SecretRole")},
			"vault_kmip_secret_scope":   {Tok: makeResource(kmipMod, "SecretScope")},

			// Kubernetes
			"vault_kubernetes_auth_backend_config": {
				Tok: makeResource(kubernetesMod, "AuthBackendConfig"),
				Docs: &tfbridge.DocInfo{
					Source: "kubernetes_auth_backend_config.md",
				},
			},
			"vault_kubernetes_auth_backend_role": {
				Tok: makeResource(kubernetesMod, "AuthBackendRole"),
				Docs: &tfbridge.DocInfo{
					Source: "kubernetes_auth_backend_role.html.md",
				},
			},
			"vault_kubernetes_secret_backend": {
				Tok: makeResource(kubernetesMod, "SecretBackend"),
			},
			"vault_kubernetes_secret_backend_role": {
				Tok: makeResource(kubernetesMod, "SecretBackendRole"),
			},

			// KV
			"vault_kv_secret":            {Tok: makeResource(kvMod, "Secret")},
			"vault_kv_secret_backend_v2": {Tok: makeResource(kvMod, "SecretBackendV2")},
			"vault_kv_secret_v2":         {Tok: makeResource(kvMod, "SecretV2")},

			// LDAP
			"vault_ldap_auth_backend":       {Tok: makeResource(ldapMod, "AuthBackend")},
			"vault_ldap_auth_backend_user":  {Tok: makeResource(ldapMod, "AuthBackendUser")},
			"vault_ldap_auth_backend_group": {Tok: makeResource(ldapMod, "AuthBackendGroup")},

			// Managed keys
			"vault_managed_keys": {Tok: makeResource(managedMod, "Keys")},

			// Okta
			"vault_okta_auth_backend":       {Tok: makeResource(oktaMod, "AuthBackend")},
			"vault_okta_auth_backend_group": {Tok: makeResource(oktaMod, "AuthBackendGroup")},
			"vault_okta_auth_backend_user":  {Tok: makeResource(oktaMod, "AuthBackendUser")},

			// PKI
			"vault_pki_secret_backend_cert":        {Tok: makeResource(pkiSecretMod, "SecretBackendCert")},
			"vault_pki_secret_backend_config_ca":   {Tok: makeResource(pkiSecretMod, "SecretBackendConfigCa")},
			"vault_pki_secret_backend_config_urls": {Tok: makeResource(pkiSecretMod, "SecretBackendConfigUrls")},
			"vault_pki_secret_backend_intermediate_cert_request": {
				Tok: makeResource(pkiSecretMod, "SecretBackendIntermediateCertRequest"),
			},
			"vault_pki_secret_backend_intermediate_set_signed": {
				Tok: makeResource(pkiSecretMod, "SecretBackendIntermediateSetSigned"),
			},
			"vault_pki_secret_backend_role": {
				Tok: makeResource(pkiSecretMod, "SecretBackendRole"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"ou": {
						// Renaming this field avoids an pluralization error.
						Name: "organizationUnit",
					},
				},
			},
			"vault_pki_secret_backend_root_cert": {Tok: makeResource(pkiSecretMod, "SecretBackendRootCert")},
			"vault_pki_secret_backend_root_sign_intermediate": {
				Tok: makeResource(pkiSecretMod, "SecretBackendRootSignIntermediate"),
			},
			"vault_pki_secret_backend_sign":       {Tok: makeResource(pkiSecretMod, "SecretBackendSign")},
			"vault_pki_secret_backend_crl_config": {Tok: makeResource(pkiSecretMod, "SecretBackendCrlConfig")},

			// Token
			"vault_token_auth_backend_role": {Tok: makeResource(tokenMod, "AuthBackendRole")},

			// SSH
			"vault_ssh_secret_backend_ca":   {Tok: makeResource(sshMod, "SecretBackendCa")},
			"vault_ssh_secret_backend_role": {Tok: makeResource(sshMod, "SecretBackendRole")},

			// RabbitMQ
			"vault_rabbitmq_secret_backend":      {Tok: makeResource(rabbitMqMod, "SecretBackend")},
			"vault_rabbitmq_secret_backend_role": {Tok: makeResource(rabbitMqMod, "SecretBackendRole")},

			// Terraform Cloud
			"vault_terraform_cloud_secret_backend": {Tok: makeResource(terraformCloudMod, "SecretBackend")},
			"vault_terraform_cloud_secret_creds":   {Tok: makeResource(terraformCloudMod, "SecretCreds")},
			"vault_terraform_cloud_secret_role":    {Tok: makeResource(terraformCloudMod, "SecretRole")},

			// Transform
			"vault_transform_alphabet": {
				Tok: makeResource(transformMod, "Alphabet"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"alphabet": {
						CSharpName: "AlphabetSet",
					},
				},
			},
			"vault_transform_role":           {Tok: makeResource(transformMod, "Role")},
			"vault_transform_template":       {Tok: makeResource(transformMod, "Template")},
			"vault_transform_transformation": {Tok: makeResource(transformMod, "Transformation")},

			// Transit
			"vault_transit_secret_backend_key": {Tok: makeResource(transitMod, "SecretBackendKey")},
			"vault_transit_secret_cache_config": {
				Tok: makeResource(transitMod, "SecretCacheConfig"),
				Docs: &tfbridge.DocInfo{
					Source: "transit_secret_backend_cache_config.html.md",
				},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			// Main
			"vault_policy_document": {
				Tok: makeDataSource(mainMod, "getPolicyDocument"),
				Docs: &tfbridge.DocInfo{
					Source: "policy_document.md",
				},
			},
			"vault_auth_backend": {
				Tok: makeDataSource(mainMod, "getAuthBackend"),
				Docs: &tfbridge.DocInfo{
					Source: "auth_backend.html.md",
				},
			},
			"vault_nomad_access_token": {Tok: makeDataSource(mainMod, "getNomadAccessToken")},

			// AD
			"vault_ad_access_credentials": {Tok: makeDataSource(adMod, "getAccessCredentials")},

			// AppRole
			"vault_approle_auth_backend_role_id": {
				Tok: makeDataSource(appRoleMod, "getAuthBackendRoleId"),
				Docs: &tfbridge.DocInfo{
					Source: "approle_auth_backend_role_id.md",
				},
			},

			// AWS
			"vault_aws_access_credentials": {Tok: makeDataSource(awsMod, "getAccessCredentials")},

			// Azure
			"vault_azure_access_credentials": {Tok: makeDataSource(azureMod, "getAccessCredentials")},

			// Generic
			"vault_generic_secret": {Tok: makeDataSource(genericMod, "getSecret")},

			// GCP
			"vault_gcp_auth_backend_role": {Tok: makeDataSource(gcpMod, "getAuthBackendRole")},

			// Identity
			"vault_identity_group":              {Tok: makeDataSource(identityMod, "getGroup")},
			"vault_identity_entity":             {Tok: makeDataSource(identityMod, "getEntity")},
			"vault_identity_oidc_client_creds":  {Tok: makeDataSource(identityMod, "getOidcClientCreds")},
			"vault_identity_oidc_openid_config": {Tok: makeDataSource(identityMod, "getOidcOpenidConfig")},
			"vault_identity_oidc_public_keys":   {Tok: makeDataSource(identityMod, "getOidcPublicKeys")},

			// Kubernetes
			"vault_kubernetes_auth_backend_config": {
				Tok: makeDataSource(kubernetesMod, "getAuthBackendConfig"),
				Docs: &tfbridge.DocInfo{
					Source: "kubernetes_auth_backend_config.md",
				},
			},
			"vault_kubernetes_auth_backend_role": {
				Tok: makeDataSource(kubernetesMod, "getAuthBackendRole"),
				Docs: &tfbridge.DocInfo{
					Source: "kubernetes_auth_backend_role.md",
				},
			},
			"vault_kubernetes_service_account_token": {
				Tok: makeDataSource(kubernetesMod, "getServiceAccountToken"),
				Docs: &tfbridge.DocInfo{
					Source: "kubernetes_credentials.html.md",
				},
			},

			// KV
			"vault_kv_secret": {Tok: makeDataSource(kvMod, "getSecret")},
			"vault_kv_secret_subkeys_v2": {
				Tok: makeDataSource(kvMod, "getSecretSubkeysV2"),
				Docs: &tfbridge.DocInfo{
					Source: "kv_subkeys_v2.html.md",
				},
			},
			"vault_kv_secret_v2":       {Tok: makeDataSource(kvMod, "getSecretV2")},
			"vault_kv_secrets_list":    {Tok: makeDataSource(kvMod, "getSecretsList")},
			"vault_kv_secrets_list_v2": {Tok: makeDataSource(kvMod, "getSecretsListV2")},

			// Transform
			"vault_transform_encode": {Tok: makeDataSource(transformMod, "getEncode")},
			"vault_transform_decode": {Tok: makeDataSource(transformMod, "getDecode")},

			// Transit
			"vault_transit_decrypt": {Tok: makeDataSource(transitMod, "getDecrypt")},
			"vault_transit_encrypt": {Tok: makeDataSource(transitMod, "getEncrypt")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
