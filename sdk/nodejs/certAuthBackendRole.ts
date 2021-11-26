// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource to create a role in an [Cert auth backend within Vault](https://www.vaultproject.io/docs/auth/cert.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 * import * from "fs";
 *
 * const certAuthBackend = new vault.AuthBackend("certAuthBackend", {
 *     path: "cert",
 *     type: "cert",
 * });
 * const certCertAuthBackendRole = new vault.CertAuthBackendRole("certCertAuthBackendRole", {
 *     certificate: fs.readFileSync("/path/to/certs/ca-cert.pem"),
 *     backend: certAuthBackend.path,
 *     allowedNames: [
 *         "foo.example.org",
 *         "baz.example.org",
 *     ],
 *     tokenTtl: 300,
 *     tokenMaxTtl: 600,
 *     tokenPolicies: ["foo"],
 * });
 * ```
 */
export class CertAuthBackendRole extends pulumi.CustomResource {
    /**
     * Get an existing CertAuthBackendRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CertAuthBackendRoleState, opts?: pulumi.CustomResourceOptions): CertAuthBackendRole {
        return new CertAuthBackendRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'vault:index/certAuthBackendRole:CertAuthBackendRole';

    /**
     * Returns true if the given object is an instance of CertAuthBackendRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CertAuthBackendRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CertAuthBackendRole.__pulumiType;
    }

    /**
     * Allowed the common names for authenticated client certificates
     */
    public readonly allowedCommonNames!: pulumi.Output<string[]>;
    /**
     * Allowed alternative dns names for authenticated client certificates
     */
    public readonly allowedDnsSans!: pulumi.Output<string[]>;
    /**
     * Allowed emails for authenticated client certificates
     */
    public readonly allowedEmailSans!: pulumi.Output<string[]>;
    /**
     * Allowed subject names for authenticated client certificates
     */
    public readonly allowedNames!: pulumi.Output<string[]>;
    /**
     * Allowed organization units for authenticated client certificates
     */
    public readonly allowedOrganizationUnits!: pulumi.Output<string[]>;
    /**
     * Allowed URIs for authenticated client certificates
     */
    public readonly allowedUriSans!: pulumi.Output<string[]>;
    /**
     * Path to the mounted Cert auth backend
     */
    public readonly backend!: pulumi.Output<string | undefined>;
    /**
     * CA certificate used to validate client certificates
     */
    public readonly certificate!: pulumi.Output<string>;
    /**
     * The name to display on tokens issued under this role.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Name of the role
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * TLS extensions required on client certificates
     */
    public readonly requiredExtensions!: pulumi.Output<string[]>;
    /**
     * List of CIDR blocks; if set, specifies blocks of IP
     * addresses which can authenticate successfully, and ties the resulting token to these blocks
     * as well.
     */
    public readonly tokenBoundCidrs!: pulumi.Output<string[] | undefined>;
    /**
     * If set, will encode an
     * [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
     * onto the token in number of seconds. This is a hard cap even if `tokenTtl` and
     * `tokenMaxTtl` would otherwise allow a renewal.
     */
    public readonly tokenExplicitMaxTtl!: pulumi.Output<number | undefined>;
    /**
     * The maximum lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     */
    public readonly tokenMaxTtl!: pulumi.Output<number | undefined>;
    /**
     * If set, the default policy will not be set on
     * generated tokens; otherwise it will be added to the policies set in token_policies.
     */
    public readonly tokenNoDefaultPolicy!: pulumi.Output<boolean | undefined>;
    /**
     * The
     * [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
     * if any, in number of seconds to set on the token.
     */
    public readonly tokenNumUses!: pulumi.Output<number | undefined>;
    /**
     * If set, indicates that the
     * token generated using this role should never expire. The token should be renewed within the
     * duration specified by this value. At each renewal, the token's TTL will be set to the
     * value of this field. Specified in seconds.
     */
    public readonly tokenPeriod!: pulumi.Output<number | undefined>;
    /**
     * List of policies to encode onto generated tokens. Depending
     * on the auth method, this list may be supplemented by user/group/other values.
     */
    public readonly tokenPolicies!: pulumi.Output<string[] | undefined>;
    /**
     * The incremental lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     */
    public readonly tokenTtl!: pulumi.Output<number | undefined>;
    /**
     * The type of token that should be generated. Can be `service`,
     * `batch`, or `default` to use the mount's tuned default (which unless changed will be
     * `service` tokens). For token store roles, there are two additional possibilities:
     * `default-service` and `default-batch` which specify the type to return unless the client
     * requests a different type at generation time.
     */
    public readonly tokenType!: pulumi.Output<string | undefined>;

    /**
     * Create a CertAuthBackendRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CertAuthBackendRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CertAuthBackendRoleArgs | CertAuthBackendRoleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CertAuthBackendRoleState | undefined;
            inputs["allowedCommonNames"] = state ? state.allowedCommonNames : undefined;
            inputs["allowedDnsSans"] = state ? state.allowedDnsSans : undefined;
            inputs["allowedEmailSans"] = state ? state.allowedEmailSans : undefined;
            inputs["allowedNames"] = state ? state.allowedNames : undefined;
            inputs["allowedOrganizationUnits"] = state ? state.allowedOrganizationUnits : undefined;
            inputs["allowedUriSans"] = state ? state.allowedUriSans : undefined;
            inputs["backend"] = state ? state.backend : undefined;
            inputs["certificate"] = state ? state.certificate : undefined;
            inputs["displayName"] = state ? state.displayName : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["requiredExtensions"] = state ? state.requiredExtensions : undefined;
            inputs["tokenBoundCidrs"] = state ? state.tokenBoundCidrs : undefined;
            inputs["tokenExplicitMaxTtl"] = state ? state.tokenExplicitMaxTtl : undefined;
            inputs["tokenMaxTtl"] = state ? state.tokenMaxTtl : undefined;
            inputs["tokenNoDefaultPolicy"] = state ? state.tokenNoDefaultPolicy : undefined;
            inputs["tokenNumUses"] = state ? state.tokenNumUses : undefined;
            inputs["tokenPeriod"] = state ? state.tokenPeriod : undefined;
            inputs["tokenPolicies"] = state ? state.tokenPolicies : undefined;
            inputs["tokenTtl"] = state ? state.tokenTtl : undefined;
            inputs["tokenType"] = state ? state.tokenType : undefined;
        } else {
            const args = argsOrState as CertAuthBackendRoleArgs | undefined;
            if ((!args || args.certificate === undefined) && !opts.urn) {
                throw new Error("Missing required property 'certificate'");
            }
            inputs["allowedCommonNames"] = args ? args.allowedCommonNames : undefined;
            inputs["allowedDnsSans"] = args ? args.allowedDnsSans : undefined;
            inputs["allowedEmailSans"] = args ? args.allowedEmailSans : undefined;
            inputs["allowedNames"] = args ? args.allowedNames : undefined;
            inputs["allowedOrganizationUnits"] = args ? args.allowedOrganizationUnits : undefined;
            inputs["allowedUriSans"] = args ? args.allowedUriSans : undefined;
            inputs["backend"] = args ? args.backend : undefined;
            inputs["certificate"] = args ? args.certificate : undefined;
            inputs["displayName"] = args ? args.displayName : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["requiredExtensions"] = args ? args.requiredExtensions : undefined;
            inputs["tokenBoundCidrs"] = args ? args.tokenBoundCidrs : undefined;
            inputs["tokenExplicitMaxTtl"] = args ? args.tokenExplicitMaxTtl : undefined;
            inputs["tokenMaxTtl"] = args ? args.tokenMaxTtl : undefined;
            inputs["tokenNoDefaultPolicy"] = args ? args.tokenNoDefaultPolicy : undefined;
            inputs["tokenNumUses"] = args ? args.tokenNumUses : undefined;
            inputs["tokenPeriod"] = args ? args.tokenPeriod : undefined;
            inputs["tokenPolicies"] = args ? args.tokenPolicies : undefined;
            inputs["tokenTtl"] = args ? args.tokenTtl : undefined;
            inputs["tokenType"] = args ? args.tokenType : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(CertAuthBackendRole.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CertAuthBackendRole resources.
 */
export interface CertAuthBackendRoleState {
    /**
     * Allowed the common names for authenticated client certificates
     */
    allowedCommonNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Allowed alternative dns names for authenticated client certificates
     */
    allowedDnsSans?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Allowed emails for authenticated client certificates
     */
    allowedEmailSans?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Allowed subject names for authenticated client certificates
     */
    allowedNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Allowed organization units for authenticated client certificates
     */
    allowedOrganizationUnits?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Allowed URIs for authenticated client certificates
     */
    allowedUriSans?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Path to the mounted Cert auth backend
     */
    backend?: pulumi.Input<string>;
    /**
     * CA certificate used to validate client certificates
     */
    certificate?: pulumi.Input<string>;
    /**
     * The name to display on tokens issued under this role.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Name of the role
     */
    name?: pulumi.Input<string>;
    /**
     * TLS extensions required on client certificates
     */
    requiredExtensions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of CIDR blocks; if set, specifies blocks of IP
     * addresses which can authenticate successfully, and ties the resulting token to these blocks
     * as well.
     */
    tokenBoundCidrs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * If set, will encode an
     * [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
     * onto the token in number of seconds. This is a hard cap even if `tokenTtl` and
     * `tokenMaxTtl` would otherwise allow a renewal.
     */
    tokenExplicitMaxTtl?: pulumi.Input<number>;
    /**
     * The maximum lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     */
    tokenMaxTtl?: pulumi.Input<number>;
    /**
     * If set, the default policy will not be set on
     * generated tokens; otherwise it will be added to the policies set in token_policies.
     */
    tokenNoDefaultPolicy?: pulumi.Input<boolean>;
    /**
     * The
     * [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
     * if any, in number of seconds to set on the token.
     */
    tokenNumUses?: pulumi.Input<number>;
    /**
     * If set, indicates that the
     * token generated using this role should never expire. The token should be renewed within the
     * duration specified by this value. At each renewal, the token's TTL will be set to the
     * value of this field. Specified in seconds.
     */
    tokenPeriod?: pulumi.Input<number>;
    /**
     * List of policies to encode onto generated tokens. Depending
     * on the auth method, this list may be supplemented by user/group/other values.
     */
    tokenPolicies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The incremental lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     */
    tokenTtl?: pulumi.Input<number>;
    /**
     * The type of token that should be generated. Can be `service`,
     * `batch`, or `default` to use the mount's tuned default (which unless changed will be
     * `service` tokens). For token store roles, there are two additional possibilities:
     * `default-service` and `default-batch` which specify the type to return unless the client
     * requests a different type at generation time.
     */
    tokenType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CertAuthBackendRole resource.
 */
export interface CertAuthBackendRoleArgs {
    /**
     * Allowed the common names for authenticated client certificates
     */
    allowedCommonNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Allowed alternative dns names for authenticated client certificates
     */
    allowedDnsSans?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Allowed emails for authenticated client certificates
     */
    allowedEmailSans?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Allowed subject names for authenticated client certificates
     */
    allowedNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Allowed organization units for authenticated client certificates
     */
    allowedOrganizationUnits?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Allowed URIs for authenticated client certificates
     */
    allowedUriSans?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Path to the mounted Cert auth backend
     */
    backend?: pulumi.Input<string>;
    /**
     * CA certificate used to validate client certificates
     */
    certificate: pulumi.Input<string>;
    /**
     * The name to display on tokens issued under this role.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Name of the role
     */
    name?: pulumi.Input<string>;
    /**
     * TLS extensions required on client certificates
     */
    requiredExtensions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of CIDR blocks; if set, specifies blocks of IP
     * addresses which can authenticate successfully, and ties the resulting token to these blocks
     * as well.
     */
    tokenBoundCidrs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * If set, will encode an
     * [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
     * onto the token in number of seconds. This is a hard cap even if `tokenTtl` and
     * `tokenMaxTtl` would otherwise allow a renewal.
     */
    tokenExplicitMaxTtl?: pulumi.Input<number>;
    /**
     * The maximum lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     */
    tokenMaxTtl?: pulumi.Input<number>;
    /**
     * If set, the default policy will not be set on
     * generated tokens; otherwise it will be added to the policies set in token_policies.
     */
    tokenNoDefaultPolicy?: pulumi.Input<boolean>;
    /**
     * The
     * [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
     * if any, in number of seconds to set on the token.
     */
    tokenNumUses?: pulumi.Input<number>;
    /**
     * If set, indicates that the
     * token generated using this role should never expire. The token should be renewed within the
     * duration specified by this value. At each renewal, the token's TTL will be set to the
     * value of this field. Specified in seconds.
     */
    tokenPeriod?: pulumi.Input<number>;
    /**
     * List of policies to encode onto generated tokens. Depending
     * on the auth method, this list may be supplemented by user/group/other values.
     */
    tokenPolicies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The incremental lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     */
    tokenTtl?: pulumi.Input<number>;
    /**
     * The type of token that should be generated. Can be `service`,
     * `batch`, or `default` to use the mount's tuned default (which unless changed will be
     * `service` tokens). For token store roles, there are two additional possibilities:
     * `default-service` and `default-batch` which specify the type to return unless the client
     * requests a different type at generation time.
     */
    tokenType?: pulumi.Input<string>;
}
