// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.Managed.Inputs
{

    public sealed class KeysPkcArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If no existing key can be found in 
        /// the referenced backend, instructs Vault to generate a key within the backend.
        /// </summary>
        [Input("allowGenerateKey")]
        public Input<bool>? AllowGenerateKey { get; set; }

        /// <summary>
        /// Controls the ability for Vault to replace through
        /// generation or importing a key into the configured backend even
        /// if a key is present, if set to `false` those operations are forbidden
        /// if a key exists.
        /// </summary>
        [Input("allowReplaceKey")]
        public Input<bool>? AllowReplaceKey { get; set; }

        /// <summary>
        /// Controls the ability for Vault to import a key to the
        /// configured backend, if `false`, those operations will be forbidden.
        /// </summary>
        [Input("allowStoreKey")]
        public Input<bool>? AllowStoreKey { get; set; }

        /// <summary>
        /// If `true`, allows usage from any mount point within the
        /// namespace.
        /// </summary>
        [Input("anyMount")]
        public Input<bool>? AnyMount { get; set; }

        /// <summary>
        /// Supplies the curve value when using the `CKM_ECDSA` mechanism.
        /// Required if `allow_generate_key` is `true`.
        /// </summary>
        [Input("curve")]
        public Input<string>? Curve { get; set; }

        /// <summary>
        /// Force all operations to open up a read-write session to
        /// the HSM.
        /// </summary>
        [Input("forceRwSession")]
        public Input<string>? ForceRwSession { get; set; }

        /// <summary>
        /// Supplies the size in bits of the key when using `CKM_RSA_PKCS_PSS`,
        /// `CKM_RSA_PKCS_OAEP` or `CKM_RSA_PKCS` as a value for `mechanism`. Required if
        /// `allow_generate_key` is `true`.
        /// </summary>
        [Input("keyBits")]
        public Input<string>? KeyBits { get; set; }

        /// <summary>
        /// The id of a PKCS#11 key to use.
        /// </summary>
        [Input("keyId", required: true)]
        public Input<string> KeyId { get; set; } = null!;

        /// <summary>
        /// The label of the key to use.
        /// </summary>
        [Input("keyLabel", required: true)]
        public Input<string> KeyLabel { get; set; } = null!;

        /// <summary>
        /// The name of the kms_library stanza to use from Vault's config
        /// to lookup the local library path.
        /// </summary>
        [Input("library", required: true)]
        public Input<string> Library { get; set; } = null!;

        /// <summary>
        /// The encryption/decryption mechanism to use, specified as a
        /// hexadecimal (prefixed by 0x) string.
        /// </summary>
        [Input("mechanism", required: true)]
        public Input<string> Mechanism { get; set; } = null!;

        /// <summary>
        /// A unique lowercase name that serves as identifying the key.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The PIN for login.
        /// </summary>
        [Input("pin", required: true)]
        public Input<string> Pin { get; set; } = null!;

        /// <summary>
        /// The slot number to use, specified as a string in a decimal format
        /// (e.g. `2305843009213693953`).
        /// </summary>
        [Input("slot")]
        public Input<string>? Slot { get; set; }

        /// <summary>
        /// The slot token label to use.
        /// </summary>
        [Input("tokenLabel")]
        public Input<string>? TokenLabel { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public KeysPkcArgs()
        {
        }
        public static new KeysPkcArgs Empty => new KeysPkcArgs();
    }
}
