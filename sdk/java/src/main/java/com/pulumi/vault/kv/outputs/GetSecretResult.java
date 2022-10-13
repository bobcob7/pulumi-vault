// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.kv.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSecretResult {
    /**
     * @return A mapping whose keys are the top-level data keys returned from
     * Vault and whose values are the corresponding values. This map can only
     * represent string data, so any non-string values returned from Vault are
     * serialized as JSON.
     * 
     */
    private Map<String,Object> data;
    /**
     * @return JSON-encoded string that that is
     * read as the secret data at the given path.
     * 
     */
    private String dataJson;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The duration of the secret lease, in seconds. Once
     * this time has passed any plan generated with this data may fail to apply.
     * 
     */
    private Integer leaseDuration;
    /**
     * @return The lease identifier assigned by Vault, if any.
     * 
     */
    private String leaseId;
    /**
     * @return True if the duration of this lease can be extended
     * through renewal.
     * 
     */
    private Boolean leaseRenewable;
    private @Nullable String namespace;
    private String path;

    private GetSecretResult() {}
    /**
     * @return A mapping whose keys are the top-level data keys returned from
     * Vault and whose values are the corresponding values. This map can only
     * represent string data, so any non-string values returned from Vault are
     * serialized as JSON.
     * 
     */
    public Map<String,Object> data() {
        return this.data;
    }
    /**
     * @return JSON-encoded string that that is
     * read as the secret data at the given path.
     * 
     */
    public String dataJson() {
        return this.dataJson;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The duration of the secret lease, in seconds. Once
     * this time has passed any plan generated with this data may fail to apply.
     * 
     */
    public Integer leaseDuration() {
        return this.leaseDuration;
    }
    /**
     * @return The lease identifier assigned by Vault, if any.
     * 
     */
    public String leaseId() {
        return this.leaseId;
    }
    /**
     * @return True if the duration of this lease can be extended
     * through renewal.
     * 
     */
    public Boolean leaseRenewable() {
        return this.leaseRenewable;
    }
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,Object> data;
        private String dataJson;
        private String id;
        private Integer leaseDuration;
        private String leaseId;
        private Boolean leaseRenewable;
        private @Nullable String namespace;
        private String path;
        public Builder() {}
        public Builder(GetSecretResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.dataJson = defaults.dataJson;
    	      this.id = defaults.id;
    	      this.leaseDuration = defaults.leaseDuration;
    	      this.leaseId = defaults.leaseId;
    	      this.leaseRenewable = defaults.leaseRenewable;
    	      this.namespace = defaults.namespace;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder data(Map<String,Object> data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        @CustomType.Setter
        public Builder dataJson(String dataJson) {
            this.dataJson = Objects.requireNonNull(dataJson);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder leaseDuration(Integer leaseDuration) {
            this.leaseDuration = Objects.requireNonNull(leaseDuration);
            return this;
        }
        @CustomType.Setter
        public Builder leaseId(String leaseId) {
            this.leaseId = Objects.requireNonNull(leaseId);
            return this;
        }
        @CustomType.Setter
        public Builder leaseRenewable(Boolean leaseRenewable) {
            this.leaseRenewable = Objects.requireNonNull(leaseRenewable);
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public GetSecretResult build() {
            final var o = new GetSecretResult();
            o.data = data;
            o.dataJson = dataJson;
            o.id = id;
            o.leaseDuration = leaseDuration;
            o.leaseId = leaseId;
            o.leaseRenewable = leaseRenewable;
            o.namespace = namespace;
            o.path = path;
            return o;
        }
    }
}
