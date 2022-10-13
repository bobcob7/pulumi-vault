// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Vault.Managed.Outputs
{

    [OutputType]
    public sealed class KeysAzure
    {
        /// <summary>
        /// If no existing key can be found in 
        /// the referenced backend, instructs Vault to generate a key within the backend.
        /// </summary>
        public readonly bool? AllowGenerateKey;
        /// <summary>
        /// Controls the ability for Vault to replace through
        /// generation or importing a key into the configured backend even
        /// if a key is present, if set to `false` those operations are forbidden
        /// if a key exists.
        /// </summary>
        public readonly bool? AllowReplaceKey;
        /// <summary>
        /// Controls the ability for Vault to import a key to the
        /// configured backend, if `false`, those operations will be forbidden.
        /// </summary>
        public readonly bool? AllowStoreKey;
        /// <summary>
        /// If `true`, allows usage from any mount point within the
        /// namespace.
        /// </summary>
        public readonly bool? AnyMount;
        /// <summary>
        /// The client id for credentials to query the Azure APIs.
        /// </summary>
        public readonly string ClientId;
        /// <summary>
        /// The client secret for credentials to query the Azure APIs.
        /// </summary>
        public readonly string ClientSecret;
        /// <summary>
        /// The Azure Cloud environment API endpoints to use.
        /// </summary>
        public readonly string? Environment;
        /// <summary>
        /// Supplies the size in bits of the key when using `CKM_RSA_PKCS_PSS`,
        /// `CKM_RSA_PKCS_OAEP` or `CKM_RSA_PKCS` as a value for `mechanism`. Required if
        /// `allow_generate_key` is `true`.
        /// </summary>
        public readonly string? KeyBits;
        /// <summary>
        /// The Key Vault key to use for encryption and decryption.
        /// </summary>
        public readonly string KeyName;
        /// <summary>
        /// The type of key to use.
        /// </summary>
        public readonly string KeyType;
        /// <summary>
        /// A unique lowercase name that serves as identifying the key.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Azure Key Vault resource's DNS Suffix to connect to.
        /// </summary>
        public readonly string? Resource;
        /// <summary>
        /// The tenant id for the Azure Active Directory organization.
        /// </summary>
        public readonly string TenantId;
        public readonly string? Uuid;
        /// <summary>
        /// The Key Vault vault to use for encryption and decryption.
        /// </summary>
        public readonly string VaultName;

        [OutputConstructor]
        private KeysAzure(
            bool? allowGenerateKey,

            bool? allowReplaceKey,

            bool? allowStoreKey,

            bool? anyMount,

            string clientId,

            string clientSecret,

            string? environment,

            string? keyBits,

            string keyName,

            string keyType,

            string name,

            string? resource,

            string tenantId,

            string? uuid,

            string vaultName)
        {
            AllowGenerateKey = allowGenerateKey;
            AllowReplaceKey = allowReplaceKey;
            AllowStoreKey = allowStoreKey;
            AnyMount = anyMount;
            ClientId = clientId;
            ClientSecret = clientSecret;
            Environment = environment;
            KeyBits = keyBits;
            KeyName = keyName;
            KeyType = keyType;
            Name = name;
            Resource = resource;
            TenantId = tenantId;
            Uuid = uuid;
            VaultName = vaultName;
        }
    }
}
