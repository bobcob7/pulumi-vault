// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getAccessCredentials(args: GetAccessCredentialsArgs, opts?: pulumi.InvokeOptions): Promise<GetAccessCredentialsResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("vault:azure/getAccessCredentials:getAccessCredentials", {
        "backend": args.backend,
        "maxCredValidationSeconds": args.maxCredValidationSeconds,
        "numSecondsBetweenTests": args.numSecondsBetweenTests,
        "numSequentialSuccesses": args.numSequentialSuccesses,
        "role": args.role,
        "validateCreds": args.validateCreds,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccessCredentials.
 */
export interface GetAccessCredentialsArgs {
    /**
     * The path to the Azure secret backend to
     * read credentials from, with no leading or trailing `/`s.
     */
    readonly backend: string;
    /**
     * If 'validate_creds' is true, 
     * the number of seconds after which to give up validating credentials. Defaults
     * to 1,200 (20 minutes).
     */
    readonly maxCredValidationSeconds?: number;
    /**
     * If 'validate_creds' is true, 
     * the number of seconds to wait between each test of generated credentials.
     * Defaults to 7.
     */
    readonly numSecondsBetweenTests?: number;
    /**
     * If 'validate_creds' is true, 
     * the number of sequential successes required to validate generated
     * credentials. Defaults to 8.
     */
    readonly numSequentialSuccesses?: number;
    /**
     * The name of the Azure secret backend role to read
     * credentials from, with no leading or trailing `/`s.
     */
    readonly role: string;
    /**
     * Whether generated credentials should be 
     * validated before being returned. Defaults to `false`, which returns
     * credentials without checking whether they have fully propagated throughout
     * Azure Active Directory. Designating `true` activates testing.
     */
    readonly validateCreds?: boolean;
}

/**
 * A collection of values returned by getAccessCredentials.
 */
export interface GetAccessCredentialsResult {
    readonly backend: string;
    /**
     * The client id for credentials to query the Azure APIs.
     */
    readonly clientId: string;
    /**
     * The client secret for credentials to query the Azure APIs.
     */
    readonly clientSecret: string;
    /**
     * The duration of the secret lease, in seconds relative
     * to the time the data was requested. Once this time has passed any plan
     * generated with this data may fail to apply.
     */
    readonly leaseDuration: number;
    /**
     * The lease identifier assigned by Vault.
     */
    readonly leaseId: string;
    readonly leaseRenewable: boolean;
    readonly leaseStartTime: string;
    readonly maxCredValidationSeconds?: number;
    readonly numSecondsBetweenTests?: number;
    readonly numSequentialSuccesses?: number;
    readonly role: string;
    readonly validateCreds?: boolean;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
