// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Configures the periodic tidying operation of the whitelisted identity entries.
 * 
 * For more information, see the
 * [Vault docs](https://www.vaultproject.io/api/auth/aws/index.html#configure-identity-whitelist-tidy-operation).
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 * 
 * const exampleAuthBackend = new vault.AuthBackend("example", {
 *     type: "aws",
 * });
 * const exampleAuthBackendIdentityWhitelist = new vault.aws.AuthBackendIdentityWhitelist("example", {
 *     backend: exampleAuthBackend.path,
 *     safetyBuffer: 3600,
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-vault/blob/master/website/docs/r/aws_auth_backend_identity_whitelist.html.md.
 */
export class AuthBackendIdentityWhitelist extends pulumi.CustomResource {
    /**
     * Get an existing AuthBackendIdentityWhitelist resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AuthBackendIdentityWhitelistState, opts?: pulumi.CustomResourceOptions): AuthBackendIdentityWhitelist {
        return new AuthBackendIdentityWhitelist(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'vault:aws/authBackendIdentityWhitelist:AuthBackendIdentityWhitelist';

    /**
     * Returns true if the given object is an instance of AuthBackendIdentityWhitelist.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AuthBackendIdentityWhitelist {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AuthBackendIdentityWhitelist.__pulumiType;
    }

    /**
     * The path of the AWS backend being configured.
     */
    public readonly backend!: pulumi.Output<string | undefined>;
    /**
     * If set to true, disables the periodic
     * tidying of the identity-whitelist entries.
     */
    public readonly disablePeriodicTidy!: pulumi.Output<boolean | undefined>;
    /**
     * The amount of extra time, in minutes, that must
     * have passed beyond the roletag expiration, before it is removed from the
     * backend storage.
     */
    public readonly safetyBuffer!: pulumi.Output<number | undefined>;

    /**
     * Create a AuthBackendIdentityWhitelist resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AuthBackendIdentityWhitelistArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AuthBackendIdentityWhitelistArgs | AuthBackendIdentityWhitelistState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as AuthBackendIdentityWhitelistState | undefined;
            inputs["backend"] = state ? state.backend : undefined;
            inputs["disablePeriodicTidy"] = state ? state.disablePeriodicTidy : undefined;
            inputs["safetyBuffer"] = state ? state.safetyBuffer : undefined;
        } else {
            const args = argsOrState as AuthBackendIdentityWhitelistArgs | undefined;
            inputs["backend"] = args ? args.backend : undefined;
            inputs["disablePeriodicTidy"] = args ? args.disablePeriodicTidy : undefined;
            inputs["safetyBuffer"] = args ? args.safetyBuffer : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(AuthBackendIdentityWhitelist.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AuthBackendIdentityWhitelist resources.
 */
export interface AuthBackendIdentityWhitelistState {
    /**
     * The path of the AWS backend being configured.
     */
    readonly backend?: pulumi.Input<string>;
    /**
     * If set to true, disables the periodic
     * tidying of the identity-whitelist entries.
     */
    readonly disablePeriodicTidy?: pulumi.Input<boolean>;
    /**
     * The amount of extra time, in minutes, that must
     * have passed beyond the roletag expiration, before it is removed from the
     * backend storage.
     */
    readonly safetyBuffer?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a AuthBackendIdentityWhitelist resource.
 */
export interface AuthBackendIdentityWhitelistArgs {
    /**
     * The path of the AWS backend being configured.
     */
    readonly backend?: pulumi.Input<string>;
    /**
     * If set to true, disables the periodic
     * tidying of the identity-whitelist entries.
     */
    readonly disablePeriodicTidy?: pulumi.Input<boolean>;
    /**
     * The amount of extra time, in minutes, that must
     * have passed beyond the roletag expiration, before it is removed from the
     * backend storage.
     */
    readonly safetyBuffer?: pulumi.Input<number>;
}
