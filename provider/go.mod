module github.com/pulumi/pulumi-vault/provider/v5

go 1.16

require (
	github.com/hashicorp/terraform-provider-vault v1.9.1-0.20211005125950-9dff41bf9149
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.11.0
	github.com/pulumi/pulumi/sdk/v3 v3.17.0
)

replace (
	github.com/hashicorp/go-getter => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20210629210550-59d24255d71f
	github.com/hashicorp/terraform-provider-vault => github.com/pulumi/terraform-provider-vault v1.9.1-0.20211126133456-d834f2476ccd
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
