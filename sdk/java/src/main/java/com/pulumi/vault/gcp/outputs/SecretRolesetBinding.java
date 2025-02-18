// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.gcp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SecretRolesetBinding {
    /**
     * @return Resource or resource path for which IAM policy information will be bound. The resource path may be specified in a few different [formats](https://www.vaultproject.io/docs/secrets/gcp/index.html#roleset-bindings).
     * 
     */
    private String resource;
    /**
     * @return List of [GCP IAM roles](https://cloud.google.com/iam/docs/understanding-roles) for the resource.
     * 
     */
    private List<String> roles;

    private SecretRolesetBinding() {}
    /**
     * @return Resource or resource path for which IAM policy information will be bound. The resource path may be specified in a few different [formats](https://www.vaultproject.io/docs/secrets/gcp/index.html#roleset-bindings).
     * 
     */
    public String resource() {
        return this.resource;
    }
    /**
     * @return List of [GCP IAM roles](https://cloud.google.com/iam/docs/understanding-roles) for the resource.
     * 
     */
    public List<String> roles() {
        return this.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretRolesetBinding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String resource;
        private List<String> roles;
        public Builder() {}
        public Builder(SecretRolesetBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resource = defaults.resource;
    	      this.roles = defaults.roles;
        }

        @CustomType.Setter
        public Builder resource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }
        @CustomType.Setter
        public Builder roles(List<String> roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }
        public SecretRolesetBinding build() {
            final var o = new SecretRolesetBinding();
            o.resource = resource;
            o.roles = roles;
            return o;
        }
    }
}
