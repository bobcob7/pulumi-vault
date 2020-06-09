// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Configures the periodic tidying operation of the blacklisted role tag entries.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 *
 * const exampleAuthBackend = new vault.AuthBackend("example", {
 *     type: "aws",
 * });
 * const exampleAuthBackendRoletagBlacklist = new vault.aws.AuthBackendRoletagBlacklist("example", {
 *     backend: exampleAuthBackend.path,
 *     safetyBuffer: 360,
 * });
 * ```
 */
export class AuthBackendRoletagBlacklist extends pulumi.CustomResource {
    /**
     * Get an existing AuthBackendRoletagBlacklist resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AuthBackendRoletagBlacklistState, opts?: pulumi.CustomResourceOptions): AuthBackendRoletagBlacklist {
        return new AuthBackendRoletagBlacklist(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'vault:aws/authBackendRoletagBlacklist:AuthBackendRoletagBlacklist';

    /**
     * Returns true if the given object is an instance of AuthBackendRoletagBlacklist.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AuthBackendRoletagBlacklist {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AuthBackendRoletagBlacklist.__pulumiType;
    }

    /**
     * The path the AWS auth backend being configured was
     * mounted at.
     */
    public readonly backend!: pulumi.Output<string>;
    /**
     * If set to true, disables the periodic
     * tidying of the roletag blacklist entries. Defaults to false.
     */
    public readonly disablePeriodicTidy!: pulumi.Output<boolean | undefined>;
    /**
     * The amount of extra time that must have passed
     * beyond the roletag expiration, before it is removed from the backend storage.
     * Defaults to 259,200 seconds, or 72 hours.
     */
    public readonly safetyBuffer!: pulumi.Output<number | undefined>;

    /**
     * Create a AuthBackendRoletagBlacklist resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AuthBackendRoletagBlacklistArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AuthBackendRoletagBlacklistArgs | AuthBackendRoletagBlacklistState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as AuthBackendRoletagBlacklistState | undefined;
            inputs["backend"] = state ? state.backend : undefined;
            inputs["disablePeriodicTidy"] = state ? state.disablePeriodicTidy : undefined;
            inputs["safetyBuffer"] = state ? state.safetyBuffer : undefined;
        } else {
            const args = argsOrState as AuthBackendRoletagBlacklistArgs | undefined;
            if (!args || args.backend === undefined) {
                throw new Error("Missing required property 'backend'");
            }
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
        super(AuthBackendRoletagBlacklist.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AuthBackendRoletagBlacklist resources.
 */
export interface AuthBackendRoletagBlacklistState {
    /**
     * The path the AWS auth backend being configured was
     * mounted at.
     */
    readonly backend?: pulumi.Input<string>;
    /**
     * If set to true, disables the periodic
     * tidying of the roletag blacklist entries. Defaults to false.
     */
    readonly disablePeriodicTidy?: pulumi.Input<boolean>;
    /**
     * The amount of extra time that must have passed
     * beyond the roletag expiration, before it is removed from the backend storage.
     * Defaults to 259,200 seconds, or 72 hours.
     */
    readonly safetyBuffer?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a AuthBackendRoletagBlacklist resource.
 */
export interface AuthBackendRoletagBlacklistArgs {
    /**
     * The path the AWS auth backend being configured was
     * mounted at.
     */
    readonly backend: pulumi.Input<string>;
    /**
     * If set to true, disables the periodic
     * tidying of the roletag blacklist entries. Defaults to false.
     */
    readonly disablePeriodicTidy?: pulumi.Input<boolean>;
    /**
     * The amount of extra time that must have passed
     * beyond the roletag expiration, before it is removed from the backend storage.
     * Defaults to 259,200 seconds, or 72 hours.
     */
    readonly safetyBuffer?: pulumi.Input<number>;
}
