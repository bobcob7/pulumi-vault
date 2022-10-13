// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.vault.outputs.GetPolicyDocumentRule;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPolicyDocumentResult {
    /**
     * @return The above arguments serialized as a standard Vault HCL policy document.
     * 
     */
    private String hcl;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String namespace;
    private List<GetPolicyDocumentRule> rules;

    private GetPolicyDocumentResult() {}
    /**
     * @return The above arguments serialized as a standard Vault HCL policy document.
     * 
     */
    public String hcl() {
        return this.hcl;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    public List<GetPolicyDocumentRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyDocumentResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hcl;
        private String id;
        private @Nullable String namespace;
        private List<GetPolicyDocumentRule> rules;
        public Builder() {}
        public Builder(GetPolicyDocumentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hcl = defaults.hcl;
    	      this.id = defaults.id;
    	      this.namespace = defaults.namespace;
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder hcl(String hcl) {
            this.hcl = Objects.requireNonNull(hcl);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder rules(List<GetPolicyDocumentRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetPolicyDocumentRule... rules) {
            return rules(List.of(rules));
        }
        public GetPolicyDocumentResult build() {
            final var o = new GetPolicyDocumentResult();
            o.hcl = hcl;
            o.id = id;
            o.namespace = namespace;
            o.rules = rules;
            return o;
        }
    }
}
