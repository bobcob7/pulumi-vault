// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.kubernetes.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAuthBackendRolePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuthBackendRolePlainArgs Empty = new GetAuthBackendRolePlainArgs();

    /**
     * Audience claim to verify in the JWT.
     * 
     */
    @Import(name="audience")
    private @Nullable String audience;

    /**
     * @return Audience claim to verify in the JWT.
     * 
     */
    public Optional<String> audience() {
        return Optional.ofNullable(this.audience);
    }

    /**
     * The unique name for the Kubernetes backend the role to
     * retrieve Role attributes for resides in. Defaults to &#34;kubernetes&#34;.
     * 
     */
    @Import(name="backend")
    private @Nullable String backend;

    /**
     * @return The unique name for the Kubernetes backend the role to
     * retrieve Role attributes for resides in. Defaults to &#34;kubernetes&#34;.
     * 
     */
    public Optional<String> backend() {
        return Optional.ofNullable(this.backend);
    }

    /**
     * The namespace of the target resource.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider&#39;s configured namespace.
     * *Available only for Vault Enterprise*.
     * 
     */
    @Import(name="namespace")
    private @Nullable String namespace;

    /**
     * @return The namespace of the target resource.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider&#39;s configured namespace.
     * *Available only for Vault Enterprise*.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * The name of the role to retrieve the Role attributes for.
     * 
     */
    @Import(name="roleName", required=true)
    private String roleName;

    /**
     * @return The name of the role to retrieve the Role attributes for.
     * 
     */
    public String roleName() {
        return this.roleName;
    }

    /**
     * List of CIDR blocks; if set, specifies blocks of IP
     * addresses which can authenticate successfully, and ties the resulting token to these blocks
     * as well.
     * 
     */
    @Import(name="tokenBoundCidrs")
    private @Nullable List<String> tokenBoundCidrs;

    /**
     * @return List of CIDR blocks; if set, specifies blocks of IP
     * addresses which can authenticate successfully, and ties the resulting token to these blocks
     * as well.
     * 
     */
    public Optional<List<String>> tokenBoundCidrs() {
        return Optional.ofNullable(this.tokenBoundCidrs);
    }

    /**
     * If set, will encode an
     * [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
     * onto the token in number of seconds. This is a hard cap even if `token_ttl` and
     * `token_max_ttl` would otherwise allow a renewal.
     * 
     */
    @Import(name="tokenExplicitMaxTtl")
    private @Nullable Integer tokenExplicitMaxTtl;

    /**
     * @return If set, will encode an
     * [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
     * onto the token in number of seconds. This is a hard cap even if `token_ttl` and
     * `token_max_ttl` would otherwise allow a renewal.
     * 
     */
    public Optional<Integer> tokenExplicitMaxTtl() {
        return Optional.ofNullable(this.tokenExplicitMaxTtl);
    }

    /**
     * The maximum lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     * 
     */
    @Import(name="tokenMaxTtl")
    private @Nullable Integer tokenMaxTtl;

    /**
     * @return The maximum lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     * 
     */
    public Optional<Integer> tokenMaxTtl() {
        return Optional.ofNullable(this.tokenMaxTtl);
    }

    /**
     * If set, the default policy will not be set on
     * generated tokens; otherwise it will be added to the policies set in token_policies.
     * 
     */
    @Import(name="tokenNoDefaultPolicy")
    private @Nullable Boolean tokenNoDefaultPolicy;

    /**
     * @return If set, the default policy will not be set on
     * generated tokens; otherwise it will be added to the policies set in token_policies.
     * 
     */
    public Optional<Boolean> tokenNoDefaultPolicy() {
        return Optional.ofNullable(this.tokenNoDefaultPolicy);
    }

    /**
     * The
     * [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
     * if any, in number of seconds to set on the token.
     * 
     */
    @Import(name="tokenNumUses")
    private @Nullable Integer tokenNumUses;

    /**
     * @return The
     * [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
     * if any, in number of seconds to set on the token.
     * 
     */
    public Optional<Integer> tokenNumUses() {
        return Optional.ofNullable(this.tokenNumUses);
    }

    /**
     * (Optional) If set, indicates that the
     * token generated using this role should never expire. The token should be renewed within the
     * duration specified by this value. At each renewal, the token&#39;s TTL will be set to the
     * value of this field. Specified in seconds.
     * 
     */
    @Import(name="tokenPeriod")
    private @Nullable Integer tokenPeriod;

    /**
     * @return (Optional) If set, indicates that the
     * token generated using this role should never expire. The token should be renewed within the
     * duration specified by this value. At each renewal, the token&#39;s TTL will be set to the
     * value of this field. Specified in seconds.
     * 
     */
    public Optional<Integer> tokenPeriod() {
        return Optional.ofNullable(this.tokenPeriod);
    }

    /**
     * List of policies to encode onto generated tokens. Depending
     * on the auth method, this list may be supplemented by user/group/other values.
     * 
     */
    @Import(name="tokenPolicies")
    private @Nullable List<String> tokenPolicies;

    /**
     * @return List of policies to encode onto generated tokens. Depending
     * on the auth method, this list may be supplemented by user/group/other values.
     * 
     */
    public Optional<List<String>> tokenPolicies() {
        return Optional.ofNullable(this.tokenPolicies);
    }

    /**
     * The incremental lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     * 
     */
    @Import(name="tokenTtl")
    private @Nullable Integer tokenTtl;

    /**
     * @return The incremental lifetime for generated tokens in number of seconds.
     * Its current value will be referenced at renewal time.
     * 
     */
    public Optional<Integer> tokenTtl() {
        return Optional.ofNullable(this.tokenTtl);
    }

    /**
     * The type of token that should be generated. Can be `service`,
     * `batch`, or `default` to use the mount&#39;s tuned default (which unless changed will be
     * `service` tokens). For token store roles, there are two additional possibilities:
     * `default-service` and `default-batch` which specify the type to return unless the client
     * requests a different type at generation time.
     * 
     */
    @Import(name="tokenType")
    private @Nullable String tokenType;

    /**
     * @return The type of token that should be generated. Can be `service`,
     * `batch`, or `default` to use the mount&#39;s tuned default (which unless changed will be
     * `service` tokens). For token store roles, there are two additional possibilities:
     * `default-service` and `default-batch` which specify the type to return unless the client
     * requests a different type at generation time.
     * 
     */
    public Optional<String> tokenType() {
        return Optional.ofNullable(this.tokenType);
    }

    private GetAuthBackendRolePlainArgs() {}

    private GetAuthBackendRolePlainArgs(GetAuthBackendRolePlainArgs $) {
        this.audience = $.audience;
        this.backend = $.backend;
        this.namespace = $.namespace;
        this.roleName = $.roleName;
        this.tokenBoundCidrs = $.tokenBoundCidrs;
        this.tokenExplicitMaxTtl = $.tokenExplicitMaxTtl;
        this.tokenMaxTtl = $.tokenMaxTtl;
        this.tokenNoDefaultPolicy = $.tokenNoDefaultPolicy;
        this.tokenNumUses = $.tokenNumUses;
        this.tokenPeriod = $.tokenPeriod;
        this.tokenPolicies = $.tokenPolicies;
        this.tokenTtl = $.tokenTtl;
        this.tokenType = $.tokenType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuthBackendRolePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuthBackendRolePlainArgs $;

        public Builder() {
            $ = new GetAuthBackendRolePlainArgs();
        }

        public Builder(GetAuthBackendRolePlainArgs defaults) {
            $ = new GetAuthBackendRolePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audience Audience claim to verify in the JWT.
         * 
         * @return builder
         * 
         */
        public Builder audience(@Nullable String audience) {
            $.audience = audience;
            return this;
        }

        /**
         * @param backend The unique name for the Kubernetes backend the role to
         * retrieve Role attributes for resides in. Defaults to &#34;kubernetes&#34;.
         * 
         * @return builder
         * 
         */
        public Builder backend(@Nullable String backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param namespace The namespace of the target resource.
         * The value should not contain leading or trailing forward slashes.
         * The `namespace` is always relative to the provider&#39;s configured namespace.
         * *Available only for Vault Enterprise*.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable String namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param roleName The name of the role to retrieve the Role attributes for.
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            $.roleName = roleName;
            return this;
        }

        /**
         * @param tokenBoundCidrs List of CIDR blocks; if set, specifies blocks of IP
         * addresses which can authenticate successfully, and ties the resulting token to these blocks
         * as well.
         * 
         * @return builder
         * 
         */
        public Builder tokenBoundCidrs(@Nullable List<String> tokenBoundCidrs) {
            $.tokenBoundCidrs = tokenBoundCidrs;
            return this;
        }

        /**
         * @param tokenBoundCidrs List of CIDR blocks; if set, specifies blocks of IP
         * addresses which can authenticate successfully, and ties the resulting token to these blocks
         * as well.
         * 
         * @return builder
         * 
         */
        public Builder tokenBoundCidrs(String... tokenBoundCidrs) {
            return tokenBoundCidrs(List.of(tokenBoundCidrs));
        }

        /**
         * @param tokenExplicitMaxTtl If set, will encode an
         * [explicit max TTL](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls)
         * onto the token in number of seconds. This is a hard cap even if `token_ttl` and
         * `token_max_ttl` would otherwise allow a renewal.
         * 
         * @return builder
         * 
         */
        public Builder tokenExplicitMaxTtl(@Nullable Integer tokenExplicitMaxTtl) {
            $.tokenExplicitMaxTtl = tokenExplicitMaxTtl;
            return this;
        }

        /**
         * @param tokenMaxTtl The maximum lifetime for generated tokens in number of seconds.
         * Its current value will be referenced at renewal time.
         * 
         * @return builder
         * 
         */
        public Builder tokenMaxTtl(@Nullable Integer tokenMaxTtl) {
            $.tokenMaxTtl = tokenMaxTtl;
            return this;
        }

        /**
         * @param tokenNoDefaultPolicy If set, the default policy will not be set on
         * generated tokens; otherwise it will be added to the policies set in token_policies.
         * 
         * @return builder
         * 
         */
        public Builder tokenNoDefaultPolicy(@Nullable Boolean tokenNoDefaultPolicy) {
            $.tokenNoDefaultPolicy = tokenNoDefaultPolicy;
            return this;
        }

        /**
         * @param tokenNumUses The
         * [period](https://www.vaultproject.io/docs/concepts/tokens.html#token-time-to-live-periodic-tokens-and-explicit-max-ttls),
         * if any, in number of seconds to set on the token.
         * 
         * @return builder
         * 
         */
        public Builder tokenNumUses(@Nullable Integer tokenNumUses) {
            $.tokenNumUses = tokenNumUses;
            return this;
        }

        /**
         * @param tokenPeriod (Optional) If set, indicates that the
         * token generated using this role should never expire. The token should be renewed within the
         * duration specified by this value. At each renewal, the token&#39;s TTL will be set to the
         * value of this field. Specified in seconds.
         * 
         * @return builder
         * 
         */
        public Builder tokenPeriod(@Nullable Integer tokenPeriod) {
            $.tokenPeriod = tokenPeriod;
            return this;
        }

        /**
         * @param tokenPolicies List of policies to encode onto generated tokens. Depending
         * on the auth method, this list may be supplemented by user/group/other values.
         * 
         * @return builder
         * 
         */
        public Builder tokenPolicies(@Nullable List<String> tokenPolicies) {
            $.tokenPolicies = tokenPolicies;
            return this;
        }

        /**
         * @param tokenPolicies List of policies to encode onto generated tokens. Depending
         * on the auth method, this list may be supplemented by user/group/other values.
         * 
         * @return builder
         * 
         */
        public Builder tokenPolicies(String... tokenPolicies) {
            return tokenPolicies(List.of(tokenPolicies));
        }

        /**
         * @param tokenTtl The incremental lifetime for generated tokens in number of seconds.
         * Its current value will be referenced at renewal time.
         * 
         * @return builder
         * 
         */
        public Builder tokenTtl(@Nullable Integer tokenTtl) {
            $.tokenTtl = tokenTtl;
            return this;
        }

        /**
         * @param tokenType The type of token that should be generated. Can be `service`,
         * `batch`, or `default` to use the mount&#39;s tuned default (which unless changed will be
         * `service` tokens). For token store roles, there are two additional possibilities:
         * `default-service` and `default-batch` which specify the type to return unless the client
         * requests a different type at generation time.
         * 
         * @return builder
         * 
         */
        public Builder tokenType(@Nullable String tokenType) {
            $.tokenType = tokenType;
            return this;
        }

        public GetAuthBackendRolePlainArgs build() {
            $.roleName = Objects.requireNonNull($.roleName, "expected parameter 'roleName' to be non-null");
            return $;
        }
    }

}
