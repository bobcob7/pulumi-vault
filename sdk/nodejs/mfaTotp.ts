// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource to manage [TOTP MFA](https://www.vaultproject.io/docs/enterprise/mfa/mfa-totp).
 *
 * **Note** this feature is available only with Vault Enterprise.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 *
 * const myTotp = new vault.MfaTotp("my_totp", {
 *     algorithm: "SHA256",
 *     digits: 8,
 *     issuer: "hashicorp",
 *     keySize: 20,
 *     period: 60,
 * });
 * ```
 *
 * ## Import
 *
 * Mounts can be imported using the `path`, e.g.
 *
 * ```sh
 *  $ pulumi import vault:index/mfaTotp:MfaTotp my_totp my_totp
 * ```
 */
export class MfaTotp extends pulumi.CustomResource {
    /**
     * Get an existing MfaTotp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MfaTotpState, opts?: pulumi.CustomResourceOptions): MfaTotp {
        return new MfaTotp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'vault:index/mfaTotp:MfaTotp';

    /**
     * Returns true if the given object is an instance of MfaTotp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MfaTotp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MfaTotp.__pulumiType;
    }

    /**
     * `(string)` - Specifies the hashing algorithm used to generate the TOTP code.
     * Options include `SHA1`, `SHA256` and `SHA512`
     */
    public readonly algorithm!: pulumi.Output<string | undefined>;
    /**
     * `(int)` - The number of digits in the generated TOTP token.
     * This value can either be 6 or 8.
     */
    public readonly digits!: pulumi.Output<number | undefined>;
    /**
     * `(string: <required>)` - The name of the key's issuing organization.
     */
    public readonly issuer!: pulumi.Output<string>;
    /**
     * `(int)` - Specifies the size in bytes of the generated key.
     */
    public readonly keySize!: pulumi.Output<number | undefined>;
    /**
     * `(string: <required>)` – Name of the MFA method.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     */
    public readonly namespace!: pulumi.Output<string | undefined>;
    /**
     * `(int)` - The length of time used to generate a counter for the TOTP token calculation.
     */
    public readonly period!: pulumi.Output<number | undefined>;
    /**
     * `(int)` - The pixel size of the generated square QR code.
     */
    public readonly qrSize!: pulumi.Output<number | undefined>;
    /**
     * `(int)` - The number of delay periods that are allowed when validating a TOTP token.
     * This value can either be 0 or 1.
     */
    public readonly skew!: pulumi.Output<number | undefined>;

    /**
     * Create a MfaTotp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MfaTotpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MfaTotpArgs | MfaTotpState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MfaTotpState | undefined;
            resourceInputs["algorithm"] = state ? state.algorithm : undefined;
            resourceInputs["digits"] = state ? state.digits : undefined;
            resourceInputs["issuer"] = state ? state.issuer : undefined;
            resourceInputs["keySize"] = state ? state.keySize : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namespace"] = state ? state.namespace : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["qrSize"] = state ? state.qrSize : undefined;
            resourceInputs["skew"] = state ? state.skew : undefined;
        } else {
            const args = argsOrState as MfaTotpArgs | undefined;
            if ((!args || args.issuer === undefined) && !opts.urn) {
                throw new Error("Missing required property 'issuer'");
            }
            resourceInputs["algorithm"] = args ? args.algorithm : undefined;
            resourceInputs["digits"] = args ? args.digits : undefined;
            resourceInputs["issuer"] = args ? args.issuer : undefined;
            resourceInputs["keySize"] = args ? args.keySize : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namespace"] = args ? args.namespace : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["qrSize"] = args ? args.qrSize : undefined;
            resourceInputs["skew"] = args ? args.skew : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MfaTotp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MfaTotp resources.
 */
export interface MfaTotpState {
    /**
     * `(string)` - Specifies the hashing algorithm used to generate the TOTP code.
     * Options include `SHA1`, `SHA256` and `SHA512`
     */
    algorithm?: pulumi.Input<string>;
    /**
     * `(int)` - The number of digits in the generated TOTP token.
     * This value can either be 6 or 8.
     */
    digits?: pulumi.Input<number>;
    /**
     * `(string: <required>)` - The name of the key's issuing organization.
     */
    issuer?: pulumi.Input<string>;
    /**
     * `(int)` - Specifies the size in bytes of the generated key.
     */
    keySize?: pulumi.Input<number>;
    /**
     * `(string: <required>)` – Name of the MFA method.
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     */
    namespace?: pulumi.Input<string>;
    /**
     * `(int)` - The length of time used to generate a counter for the TOTP token calculation.
     */
    period?: pulumi.Input<number>;
    /**
     * `(int)` - The pixel size of the generated square QR code.
     */
    qrSize?: pulumi.Input<number>;
    /**
     * `(int)` - The number of delay periods that are allowed when validating a TOTP token.
     * This value can either be 0 or 1.
     */
    skew?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a MfaTotp resource.
 */
export interface MfaTotpArgs {
    /**
     * `(string)` - Specifies the hashing algorithm used to generate the TOTP code.
     * Options include `SHA1`, `SHA256` and `SHA512`
     */
    algorithm?: pulumi.Input<string>;
    /**
     * `(int)` - The number of digits in the generated TOTP token.
     * This value can either be 6 or 8.
     */
    digits?: pulumi.Input<number>;
    /**
     * `(string: <required>)` - The name of the key's issuing organization.
     */
    issuer: pulumi.Input<string>;
    /**
     * `(int)` - Specifies the size in bytes of the generated key.
     */
    keySize?: pulumi.Input<number>;
    /**
     * `(string: <required>)` – Name of the MFA method.
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider's configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     */
    namespace?: pulumi.Input<string>;
    /**
     * `(int)` - The length of time used to generate a counter for the TOTP token calculation.
     */
    period?: pulumi.Input<number>;
    /**
     * `(int)` - The pixel size of the generated square QR code.
     */
    qrSize?: pulumi.Input<number>;
    /**
     * `(int)` - The number of delay periods that are allowed when validating a TOTP token.
     * This value can either be 0 or 1.
     */
    skew?: pulumi.Input<number>;
}
