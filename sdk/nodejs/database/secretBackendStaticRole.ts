// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Creates a Database Secret Backend static role in Vault. Database secret backend
 * static roles can be used to manage 1-to-1 mapping of a Vault Role to a user in a
 * database for the database.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 * 
 * const db = new vault.Mount("db", {
 *     path: "postgres",
 *     type: "database",
 * });
 * const postgres = new vault.database.SecretBackendConnection("postgres", {
 *     allowedRoles: ["*"],
 *     backend: db.path,
 *     postgresql: {
 *         connectionUrl: "postgres://username:password@host:port/database",
 *     },
 * });
 * const staticRole = new vault.database.SecretBackendStaticRole("staticRole", {
 *     backend: db.path,
 *     dbName: postgres.name,
 *     rotationPeriod: 3600,
 *     rotationStatements: ["ALTER USER \"{{name}}\" WITH PASSWORD '{{password}}';"],
 *     username: "example",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-vault/blob/master/website/docs/r/database_secret_backend_static_role.md.
 */
export class SecretBackendStaticRole extends pulumi.CustomResource {
    /**
     * Get an existing SecretBackendStaticRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecretBackendStaticRoleState, opts?: pulumi.CustomResourceOptions): SecretBackendStaticRole {
        return new SecretBackendStaticRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'vault:database/secretBackendStaticRole:SecretBackendStaticRole';

    /**
     * Returns true if the given object is an instance of SecretBackendStaticRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecretBackendStaticRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecretBackendStaticRole.__pulumiType;
    }

    /**
     * The unique name of the Vault mount to configure.
     */
    public readonly backend!: pulumi.Output<string>;
    /**
     * The unique name of the database connection to use for the static role.
     */
    public readonly dbName!: pulumi.Output<string>;
    /**
     * A unique name to give the static role.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The amount of time Vault should wait before rotating the password, in seconds.
     */
    public readonly rotationPeriod!: pulumi.Output<number>;
    /**
     * Database statements to execute to rotate the password for the configured database user.
     */
    public readonly rotationStatements!: pulumi.Output<string[] | undefined>;
    /**
     * The database username that this static role corresponds to.
     */
    public readonly username!: pulumi.Output<string>;

    /**
     * Create a SecretBackendStaticRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecretBackendStaticRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecretBackendStaticRoleArgs | SecretBackendStaticRoleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as SecretBackendStaticRoleState | undefined;
            inputs["backend"] = state ? state.backend : undefined;
            inputs["dbName"] = state ? state.dbName : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["rotationPeriod"] = state ? state.rotationPeriod : undefined;
            inputs["rotationStatements"] = state ? state.rotationStatements : undefined;
            inputs["username"] = state ? state.username : undefined;
        } else {
            const args = argsOrState as SecretBackendStaticRoleArgs | undefined;
            if (!args || args.backend === undefined) {
                throw new Error("Missing required property 'backend'");
            }
            if (!args || args.dbName === undefined) {
                throw new Error("Missing required property 'dbName'");
            }
            if (!args || args.rotationPeriod === undefined) {
                throw new Error("Missing required property 'rotationPeriod'");
            }
            if (!args || args.username === undefined) {
                throw new Error("Missing required property 'username'");
            }
            inputs["backend"] = args ? args.backend : undefined;
            inputs["dbName"] = args ? args.dbName : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["rotationPeriod"] = args ? args.rotationPeriod : undefined;
            inputs["rotationStatements"] = args ? args.rotationStatements : undefined;
            inputs["username"] = args ? args.username : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(SecretBackendStaticRole.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecretBackendStaticRole resources.
 */
export interface SecretBackendStaticRoleState {
    /**
     * The unique name of the Vault mount to configure.
     */
    readonly backend?: pulumi.Input<string>;
    /**
     * The unique name of the database connection to use for the static role.
     */
    readonly dbName?: pulumi.Input<string>;
    /**
     * A unique name to give the static role.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The amount of time Vault should wait before rotating the password, in seconds.
     */
    readonly rotationPeriod?: pulumi.Input<number>;
    /**
     * Database statements to execute to rotate the password for the configured database user.
     */
    readonly rotationStatements?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The database username that this static role corresponds to.
     */
    readonly username?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SecretBackendStaticRole resource.
 */
export interface SecretBackendStaticRoleArgs {
    /**
     * The unique name of the Vault mount to configure.
     */
    readonly backend: pulumi.Input<string>;
    /**
     * The unique name of the database connection to use for the static role.
     */
    readonly dbName: pulumi.Input<string>;
    /**
     * A unique name to give the static role.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The amount of time Vault should wait before rotating the password, in seconds.
     */
    readonly rotationPeriod: pulumi.Input<number>;
    /**
     * Database statements to execute to rotate the password for the configured database user.
     */
    readonly rotationStatements?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The database username that this static role corresponds to.
     */
    readonly username: pulumi.Input<string>;
}
