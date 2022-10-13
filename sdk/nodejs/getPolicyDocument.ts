// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This is a data source which can be used to construct a HCL representation of an Vault policy document, for use with resources which expect policy documents, such as the `vault.Policy` resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as vault from "@pulumi/vault";
 *
 * const examplePolicyDocument = vault.getPolicyDocument({
 *     rules: [{
 *         path: "secret/*",
 *         capabilities: [
 *             "create",
 *             "read",
 *             "update",
 *             "delete",
 *             "list",
 *         ],
 *         description: "allow all on secrets",
 *     }],
 * });
 * const examplePolicy = new vault.Policy("examplePolicy", {policy: examplePolicyDocument.then(examplePolicyDocument => examplePolicyDocument.hcl)});
 * ```
 */
export function getPolicyDocument(args?: GetPolicyDocumentArgs, opts?: pulumi.InvokeOptions): Promise<GetPolicyDocumentResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("vault:index/getPolicyDocument:getPolicyDocument", {
        "namespace": args.namespace,
        "rules": args.rules,
    }, opts);
}

/**
 * A collection of arguments for invoking getPolicyDocument.
 */
export interface GetPolicyDocumentArgs {
    namespace?: string;
    rules?: inputs.GetPolicyDocumentRule[];
}

/**
 * A collection of values returned by getPolicyDocument.
 */
export interface GetPolicyDocumentResult {
    /**
     * The above arguments serialized as a standard Vault HCL policy document.
     */
    readonly hcl: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly namespace?: string;
    readonly rules: outputs.GetPolicyDocumentRule[];
}

export function getPolicyDocumentOutput(args?: GetPolicyDocumentOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPolicyDocumentResult> {
    return pulumi.output(args).apply(a => getPolicyDocument(a, opts))
}

/**
 * A collection of arguments for invoking getPolicyDocument.
 */
export interface GetPolicyDocumentOutputArgs {
    namespace?: pulumi.Input<string>;
    rules?: pulumi.Input<pulumi.Input<inputs.GetPolicyDocumentRuleArgs>[]>;
}
