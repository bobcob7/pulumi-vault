// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetPolicyDocumentRuleAllowedParameter extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicyDocumentRuleAllowedParameter Empty = new GetPolicyDocumentRuleAllowedParameter();

    /**
     * name of permitted or denied parameter.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return name of permitted or denied parameter.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * list of values what are permitted or denied by policy rule.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return list of values what are permitted or denied by policy rule.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private GetPolicyDocumentRuleAllowedParameter() {}

    private GetPolicyDocumentRuleAllowedParameter(GetPolicyDocumentRuleAllowedParameter $) {
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyDocumentRuleAllowedParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyDocumentRuleAllowedParameter $;

        public Builder() {
            $ = new GetPolicyDocumentRuleAllowedParameter();
        }

        public Builder(GetPolicyDocumentRuleAllowedParameter defaults) {
            $ = new GetPolicyDocumentRuleAllowedParameter(Objects.requireNonNull(defaults));
        }

        /**
         * @param key name of permitted or denied parameter.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param values list of values what are permitted or denied by policy rule.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values list of values what are permitted or denied by policy rule.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetPolicyDocumentRuleAllowedParameter build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
