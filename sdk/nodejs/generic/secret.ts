// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export class Secret extends pulumi.CustomResource {
    /**
     * Get an existing Secret resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecretState, opts?: pulumi.CustomResourceOptions): Secret {
        return new Secret(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'vault:generic/secret:Secret';

    /**
     * Returns true if the given object is an instance of Secret.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Secret {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Secret.__pulumiType;
    }

    /**
     * A mapping whose keys are the top-level data keys returned from
     * Vault and whose values are the corresponding values. This map can only
     * represent string data, so any non-string values returned from Vault are
     * serialized as JSON.
     */
    public /*out*/ readonly data!: pulumi.Output<{[key: string]: any}>;
    /**
     * String containing a JSON-encoded object that will be
     * written as the secret data at the given path.
     */
    public readonly dataJson!: pulumi.Output<string>;
    /**
     * True/false. Set this to true if your vault
     * authentication is not able to read the data. Setting this to `true` will
     * break drift detection. Defaults to false.
     */
    public readonly disableRead!: pulumi.Output<boolean | undefined>;
    /**
     * The full logical path at which to write the given data.
     * To write data into the "generic" secret backend mounted in Vault by default,
     * this should be prefixed with `secret/`. Writing to other backends with this
     * resource is possible; consult each backend's documentation to see which
     * endpoints support the `PUT` and `DELETE` methods.
     */
    public readonly path!: pulumi.Output<string>;

    /**
     * Create a Secret resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecretArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecretArgs | SecretState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as SecretState | undefined;
            inputs["data"] = state ? state.data : undefined;
            inputs["dataJson"] = state ? state.dataJson : undefined;
            inputs["disableRead"] = state ? state.disableRead : undefined;
            inputs["path"] = state ? state.path : undefined;
        } else {
            const args = argsOrState as SecretArgs | undefined;
            if (!args || args.dataJson === undefined) {
                throw new Error("Missing required property 'dataJson'");
            }
            if (!args || args.path === undefined) {
                throw new Error("Missing required property 'path'");
            }
            inputs["dataJson"] = args ? args.dataJson : undefined;
            inputs["disableRead"] = args ? args.disableRead : undefined;
            inputs["path"] = args ? args.path : undefined;
            inputs["data"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Secret.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Secret resources.
 */
export interface SecretState {
    /**
     * A mapping whose keys are the top-level data keys returned from
     * Vault and whose values are the corresponding values. This map can only
     * represent string data, so any non-string values returned from Vault are
     * serialized as JSON.
     */
    readonly data?: pulumi.Input<{[key: string]: any}>;
    /**
     * String containing a JSON-encoded object that will be
     * written as the secret data at the given path.
     */
    readonly dataJson?: pulumi.Input<string>;
    /**
     * True/false. Set this to true if your vault
     * authentication is not able to read the data. Setting this to `true` will
     * break drift detection. Defaults to false.
     */
    readonly disableRead?: pulumi.Input<boolean>;
    /**
     * The full logical path at which to write the given data.
     * To write data into the "generic" secret backend mounted in Vault by default,
     * this should be prefixed with `secret/`. Writing to other backends with this
     * resource is possible; consult each backend's documentation to see which
     * endpoints support the `PUT` and `DELETE` methods.
     */
    readonly path?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Secret resource.
 */
export interface SecretArgs {
    /**
     * String containing a JSON-encoded object that will be
     * written as the secret data at the given path.
     */
    readonly dataJson: pulumi.Input<string>;
    /**
     * True/false. Set this to true if your vault
     * authentication is not able to read the data. Setting this to `true` will
     * break drift detection. Defaults to false.
     */
    readonly disableRead?: pulumi.Input<boolean>;
    /**
     * The full logical path at which to write the given data.
     * To write data into the "generic" secret backend mounted in Vault by default,
     * this should be prefixed with `secret/`. Writing to other backends with this
     * resource is possible; consult each backend's documentation to see which
     * endpoints support the `PUT` and `DELETE` methods.
     */
    readonly path: pulumi.Input<string>;
}
