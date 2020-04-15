// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages policy mappings for Github Teams authenticated via Github. See the [Vault
 * documentation](https://www.vaultproject.io/docs/auth/github.html) for more
 * information.
 * 
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-vault/blob/master/website/docs/r/github_team.html.md.
 */
export class Team extends pulumi.CustomResource {
    /**
     * Get an existing Team resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TeamState, opts?: pulumi.CustomResourceOptions): Team {
        return new Team(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'vault:github/team:Team';

    /**
     * Returns true if the given object is an instance of Team.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Team {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Team.__pulumiType;
    }

    /**
     * Path where the github auth backend is mounted. Defaults to `github`
     * if not specified.
     */
    public readonly backend!: pulumi.Output<string | undefined>;
    /**
     * An array of strings specifying the policies to be set on tokens
     * issued using this role.
     */
    public readonly policies!: pulumi.Output<string[] | undefined>;
    /**
     * GitHub team name in "slugified" format.
     */
    public readonly team!: pulumi.Output<string>;
    /**
     * Specifies the blocks of IP addresses which are allowed to use the generated token
     */
    public readonly tokenBoundCidrs!: pulumi.Output<string[] | undefined>;
    /**
     * Generated Token's Explicit Maximum TTL in seconds
     */
    public readonly tokenExplicitMaxTtl!: pulumi.Output<number | undefined>;
    /**
     * The maximum lifetime of the generated token
     */
    public readonly tokenMaxTtl!: pulumi.Output<number | undefined>;
    /**
     * If true, the 'default' policy will not automatically be added to generated tokens
     */
    public readonly tokenNoDefaultPolicy!: pulumi.Output<boolean | undefined>;
    /**
     * The maximum number of times a token may be used, a value of zero means unlimited
     */
    public readonly tokenNumUses!: pulumi.Output<number | undefined>;
    /**
     * Generated Token's Period
     */
    public readonly tokenPeriod!: pulumi.Output<number | undefined>;
    /**
     * Generated Token's Policies
     */
    public readonly tokenPolicies!: pulumi.Output<string[] | undefined>;
    /**
     * The initial ttl of the token to generate in seconds
     */
    public readonly tokenTtl!: pulumi.Output<number | undefined>;
    /**
     * The type of token to generate, service or batch
     */
    public readonly tokenType!: pulumi.Output<string | undefined>;

    /**
     * Create a Team resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TeamArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TeamArgs | TeamState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as TeamState | undefined;
            inputs["backend"] = state ? state.backend : undefined;
            inputs["policies"] = state ? state.policies : undefined;
            inputs["team"] = state ? state.team : undefined;
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
            const args = argsOrState as TeamArgs | undefined;
            if (!args || args.team === undefined) {
                throw new Error("Missing required property 'team'");
            }
            inputs["backend"] = args ? args.backend : undefined;
            inputs["policies"] = args ? args.policies : undefined;
            inputs["team"] = args ? args.team : undefined;
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
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Team.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Team resources.
 */
export interface TeamState {
    /**
     * Path where the github auth backend is mounted. Defaults to `github`
     * if not specified.
     */
    readonly backend?: pulumi.Input<string>;
    /**
     * An array of strings specifying the policies to be set on tokens
     * issued using this role.
     */
    readonly policies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * GitHub team name in "slugified" format.
     */
    readonly team?: pulumi.Input<string>;
    /**
     * Specifies the blocks of IP addresses which are allowed to use the generated token
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenBoundCidrs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Generated Token's Explicit Maximum TTL in seconds
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenExplicitMaxTtl?: pulumi.Input<number>;
    /**
     * The maximum lifetime of the generated token
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenMaxTtl?: pulumi.Input<number>;
    /**
     * If true, the 'default' policy will not automatically be added to generated tokens
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenNoDefaultPolicy?: pulumi.Input<boolean>;
    /**
     * The maximum number of times a token may be used, a value of zero means unlimited
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenNumUses?: pulumi.Input<number>;
    /**
     * Generated Token's Period
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenPeriod?: pulumi.Input<number>;
    /**
     * Generated Token's Policies
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenPolicies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The initial ttl of the token to generate in seconds
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenTtl?: pulumi.Input<number>;
    /**
     * The type of token to generate, service or batch
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Team resource.
 */
export interface TeamArgs {
    /**
     * Path where the github auth backend is mounted. Defaults to `github`
     * if not specified.
     */
    readonly backend?: pulumi.Input<string>;
    /**
     * An array of strings specifying the policies to be set on tokens
     * issued using this role.
     */
    readonly policies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * GitHub team name in "slugified" format.
     */
    readonly team: pulumi.Input<string>;
    /**
     * Specifies the blocks of IP addresses which are allowed to use the generated token
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenBoundCidrs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Generated Token's Explicit Maximum TTL in seconds
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenExplicitMaxTtl?: pulumi.Input<number>;
    /**
     * The maximum lifetime of the generated token
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenMaxTtl?: pulumi.Input<number>;
    /**
     * If true, the 'default' policy will not automatically be added to generated tokens
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenNoDefaultPolicy?: pulumi.Input<boolean>;
    /**
     * The maximum number of times a token may be used, a value of zero means unlimited
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenNumUses?: pulumi.Input<number>;
    /**
     * Generated Token's Period
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenPeriod?: pulumi.Input<number>;
    /**
     * Generated Token's Policies
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenPolicies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The initial ttl of the token to generate in seconds
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenTtl?: pulumi.Input<number>;
    /**
     * The type of token to generate, service or batch
     * 
     * @deprecated This parameter should be moved to the Github Auth backend config block. It does nothing in a user/team block.
     */
    readonly tokenType?: pulumi.Input<string>;
}
