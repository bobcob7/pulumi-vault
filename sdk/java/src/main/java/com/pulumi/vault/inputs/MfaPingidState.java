// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MfaPingidState extends com.pulumi.resources.ResourceArgs {

    public static final MfaPingidState Empty = new MfaPingidState();

    /**
     * Admin URL computed by Vault.
     * 
     */
    @Import(name="adminUrl")
    private @Nullable Output<String> adminUrl;

    /**
     * @return Admin URL computed by Vault.
     * 
     */
    public Optional<Output<String>> adminUrl() {
        return Optional.ofNullable(this.adminUrl);
    }

    /**
     * Authenticator URL computed by Vault.
     * 
     */
    @Import(name="authenticatorUrl")
    private @Nullable Output<String> authenticatorUrl;

    /**
     * @return Authenticator URL computed by Vault.
     * 
     */
    public Optional<Output<String>> authenticatorUrl() {
        return Optional.ofNullable(this.authenticatorUrl);
    }

    /**
     * IDP URL computed by Vault.
     * 
     */
    @Import(name="idpUrl")
    private @Nullable Output<String> idpUrl;

    /**
     * @return IDP URL computed by Vault.
     * 
     */
    public Optional<Output<String>> idpUrl() {
        return Optional.ofNullable(this.idpUrl);
    }

    /**
     * `(string: &lt;required&gt;)` - The mount to tie this method to for use in automatic mappings.
     * The mapping will use the Name field of Aliases associated with this mount as the username in the mapping.
     * 
     */
    @Import(name="mountAccessor")
    private @Nullable Output<String> mountAccessor;

    /**
     * @return `(string: &lt;required&gt;)` - The mount to tie this method to for use in automatic mappings.
     * The mapping will use the Name field of Aliases associated with this mount as the username in the mapping.
     * 
     */
    public Optional<Output<String>> mountAccessor() {
        return Optional.ofNullable(this.mountAccessor);
    }

    /**
     * `(string: &lt;required&gt;)` – Name of the MFA method.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return `(string: &lt;required&gt;)` – Name of the MFA method.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * Namespace ID computed by Vault.
     * 
     */
    @Import(name="namespaceId")
    private @Nullable Output<String> namespaceId;

    /**
     * @return Namespace ID computed by Vault.
     * 
     */
    public Optional<Output<String>> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    /**
     * Org Alias computed by Vault.
     * 
     */
    @Import(name="orgAlias")
    private @Nullable Output<String> orgAlias;

    /**
     * @return Org Alias computed by Vault.
     * 
     */
    public Optional<Output<String>> orgAlias() {
        return Optional.ofNullable(this.orgAlias);
    }

    /**
     * `(string: &lt;required&gt;)` - A base64-encoded third-party settings file retrieved
     * from PingID&#39;s configuration page.
     * 
     */
    @Import(name="settingsFileBase64")
    private @Nullable Output<String> settingsFileBase64;

    /**
     * @return `(string: &lt;required&gt;)` - A base64-encoded third-party settings file retrieved
     * from PingID&#39;s configuration page.
     * 
     */
    public Optional<Output<String>> settingsFileBase64() {
        return Optional.ofNullable(this.settingsFileBase64);
    }

    /**
     * Type of configuration computed by Vault.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of configuration computed by Vault.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * If set, enables use of PingID signature. Computed by Vault
     * 
     */
    @Import(name="useSignature")
    private @Nullable Output<Boolean> useSignature;

    /**
     * @return If set, enables use of PingID signature. Computed by Vault
     * 
     */
    public Optional<Output<Boolean>> useSignature() {
        return Optional.ofNullable(this.useSignature);
    }

    /**
     * `(string)` - A format string for mapping Identity names to MFA method names.
     * Values to substitute should be placed in `{{}}`. For example, `&#34;{{alias.name}}@example.com&#34;`.
     * If blank, the Alias&#39;s Name field will be used as-is. Currently-supported mappings:
     * - alias.name: The name returned by the mount configured via the `mount_accessor` parameter
     * - entity.name: The name configured for the Entity
     * - alias.metadata.`&lt;key&gt;`: The value of the Alias&#39;s metadata parameter
     * - entity.metadata.`&lt;key&gt;`: The value of the Entity&#39;s metadata parameter
     * 
     */
    @Import(name="usernameFormat")
    private @Nullable Output<String> usernameFormat;

    /**
     * @return `(string)` - A format string for mapping Identity names to MFA method names.
     * Values to substitute should be placed in `{{}}`. For example, `&#34;{{alias.name}}@example.com&#34;`.
     * If blank, the Alias&#39;s Name field will be used as-is. Currently-supported mappings:
     * - alias.name: The name returned by the mount configured via the `mount_accessor` parameter
     * - entity.name: The name configured for the Entity
     * - alias.metadata.`&lt;key&gt;`: The value of the Alias&#39;s metadata parameter
     * - entity.metadata.`&lt;key&gt;`: The value of the Entity&#39;s metadata parameter
     * 
     */
    public Optional<Output<String>> usernameFormat() {
        return Optional.ofNullable(this.usernameFormat);
    }

    private MfaPingidState() {}

    private MfaPingidState(MfaPingidState $) {
        this.adminUrl = $.adminUrl;
        this.authenticatorUrl = $.authenticatorUrl;
        this.idpUrl = $.idpUrl;
        this.mountAccessor = $.mountAccessor;
        this.name = $.name;
        this.namespace = $.namespace;
        this.namespaceId = $.namespaceId;
        this.orgAlias = $.orgAlias;
        this.settingsFileBase64 = $.settingsFileBase64;
        this.type = $.type;
        this.useSignature = $.useSignature;
        this.usernameFormat = $.usernameFormat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MfaPingidState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MfaPingidState $;

        public Builder() {
            $ = new MfaPingidState();
        }

        public Builder(MfaPingidState defaults) {
            $ = new MfaPingidState(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminUrl Admin URL computed by Vault.
         * 
         * @return builder
         * 
         */
        public Builder adminUrl(@Nullable Output<String> adminUrl) {
            $.adminUrl = adminUrl;
            return this;
        }

        /**
         * @param adminUrl Admin URL computed by Vault.
         * 
         * @return builder
         * 
         */
        public Builder adminUrl(String adminUrl) {
            return adminUrl(Output.of(adminUrl));
        }

        /**
         * @param authenticatorUrl Authenticator URL computed by Vault.
         * 
         * @return builder
         * 
         */
        public Builder authenticatorUrl(@Nullable Output<String> authenticatorUrl) {
            $.authenticatorUrl = authenticatorUrl;
            return this;
        }

        /**
         * @param authenticatorUrl Authenticator URL computed by Vault.
         * 
         * @return builder
         * 
         */
        public Builder authenticatorUrl(String authenticatorUrl) {
            return authenticatorUrl(Output.of(authenticatorUrl));
        }

        /**
         * @param idpUrl IDP URL computed by Vault.
         * 
         * @return builder
         * 
         */
        public Builder idpUrl(@Nullable Output<String> idpUrl) {
            $.idpUrl = idpUrl;
            return this;
        }

        /**
         * @param idpUrl IDP URL computed by Vault.
         * 
         * @return builder
         * 
         */
        public Builder idpUrl(String idpUrl) {
            return idpUrl(Output.of(idpUrl));
        }

        /**
         * @param mountAccessor `(string: &lt;required&gt;)` - The mount to tie this method to for use in automatic mappings.
         * The mapping will use the Name field of Aliases associated with this mount as the username in the mapping.
         * 
         * @return builder
         * 
         */
        public Builder mountAccessor(@Nullable Output<String> mountAccessor) {
            $.mountAccessor = mountAccessor;
            return this;
        }

        /**
         * @param mountAccessor `(string: &lt;required&gt;)` - The mount to tie this method to for use in automatic mappings.
         * The mapping will use the Name field of Aliases associated with this mount as the username in the mapping.
         * 
         * @return builder
         * 
         */
        public Builder mountAccessor(String mountAccessor) {
            return mountAccessor(Output.of(mountAccessor));
        }

        /**
         * @param name `(string: &lt;required&gt;)` – Name of the MFA method.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name `(string: &lt;required&gt;)` – Name of the MFA method.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace The namespace to provision the resource in.
         * The value should not contain leading or trailing forward slashes.
         * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
         * *Available only for Vault Enterprise*.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespace to provision the resource in.
         * The value should not contain leading or trailing forward slashes.
         * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
         * *Available only for Vault Enterprise*.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param namespaceId Namespace ID computed by Vault.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId Namespace ID computed by Vault.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        /**
         * @param orgAlias Org Alias computed by Vault.
         * 
         * @return builder
         * 
         */
        public Builder orgAlias(@Nullable Output<String> orgAlias) {
            $.orgAlias = orgAlias;
            return this;
        }

        /**
         * @param orgAlias Org Alias computed by Vault.
         * 
         * @return builder
         * 
         */
        public Builder orgAlias(String orgAlias) {
            return orgAlias(Output.of(orgAlias));
        }

        /**
         * @param settingsFileBase64 `(string: &lt;required&gt;)` - A base64-encoded third-party settings file retrieved
         * from PingID&#39;s configuration page.
         * 
         * @return builder
         * 
         */
        public Builder settingsFileBase64(@Nullable Output<String> settingsFileBase64) {
            $.settingsFileBase64 = settingsFileBase64;
            return this;
        }

        /**
         * @param settingsFileBase64 `(string: &lt;required&gt;)` - A base64-encoded third-party settings file retrieved
         * from PingID&#39;s configuration page.
         * 
         * @return builder
         * 
         */
        public Builder settingsFileBase64(String settingsFileBase64) {
            return settingsFileBase64(Output.of(settingsFileBase64));
        }

        /**
         * @param type Type of configuration computed by Vault.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of configuration computed by Vault.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param useSignature If set, enables use of PingID signature. Computed by Vault
         * 
         * @return builder
         * 
         */
        public Builder useSignature(@Nullable Output<Boolean> useSignature) {
            $.useSignature = useSignature;
            return this;
        }

        /**
         * @param useSignature If set, enables use of PingID signature. Computed by Vault
         * 
         * @return builder
         * 
         */
        public Builder useSignature(Boolean useSignature) {
            return useSignature(Output.of(useSignature));
        }

        /**
         * @param usernameFormat `(string)` - A format string for mapping Identity names to MFA method names.
         * Values to substitute should be placed in `{{}}`. For example, `&#34;{{alias.name}}@example.com&#34;`.
         * If blank, the Alias&#39;s Name field will be used as-is. Currently-supported mappings:
         * - alias.name: The name returned by the mount configured via the `mount_accessor` parameter
         * - entity.name: The name configured for the Entity
         * - alias.metadata.`&lt;key&gt;`: The value of the Alias&#39;s metadata parameter
         * - entity.metadata.`&lt;key&gt;`: The value of the Entity&#39;s metadata parameter
         * 
         * @return builder
         * 
         */
        public Builder usernameFormat(@Nullable Output<String> usernameFormat) {
            $.usernameFormat = usernameFormat;
            return this;
        }

        /**
         * @param usernameFormat `(string)` - A format string for mapping Identity names to MFA method names.
         * Values to substitute should be placed in `{{}}`. For example, `&#34;{{alias.name}}@example.com&#34;`.
         * If blank, the Alias&#39;s Name field will be used as-is. Currently-supported mappings:
         * - alias.name: The name returned by the mount configured via the `mount_accessor` parameter
         * - entity.name: The name configured for the Entity
         * - alias.metadata.`&lt;key&gt;`: The value of the Alias&#39;s metadata parameter
         * - entity.metadata.`&lt;key&gt;`: The value of the Entity&#39;s metadata parameter
         * 
         * @return builder
         * 
         */
        public Builder usernameFormat(String usernameFormat) {
            return usernameFormat(Output.of(usernameFormat));
        }

        public MfaPingidState build() {
            return $;
        }
    }

}
