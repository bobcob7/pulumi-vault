module github.com/pulumi/pulumi-vault/provider/v2

go 1.14

require (
	github.com/hashicorp/terraform-plugin-sdk v1.7.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.4.1-0.20200608011815-6feeb51f2d39
	github.com/pulumi/pulumi/sdk/v2 v2.3.1-0.20200607162109-9754465b04db
	github.com/pulumi/tf2pulumi v0.8.1-0.20200528170746-c1234defe2b5 // indirect
	github.com/terraform-providers/terraform-provider-vault v1.9.1-0.20200521205104-f25d9294c62d
)

replace github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
