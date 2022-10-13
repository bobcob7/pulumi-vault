// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.appRole.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAuthBackendRoleIdResult {
    private @Nullable String backend;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String namespace;
    /**
     * @return The RoleID of the role.
     * 
     */
    private String roleId;
    private String roleName;

    private GetAuthBackendRoleIdResult() {}
    public Optional<String> backend() {
        return Optional.ofNullable(this.backend);
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
    /**
     * @return The RoleID of the role.
     * 
     */
    public String roleId() {
        return this.roleId;
    }
    public String roleName() {
        return this.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthBackendRoleIdResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String backend;
        private String id;
        private @Nullable String namespace;
        private String roleId;
        private String roleName;
        public Builder() {}
        public Builder(GetAuthBackendRoleIdResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backend = defaults.backend;
    	      this.id = defaults.id;
    	      this.namespace = defaults.namespace;
    	      this.roleId = defaults.roleId;
    	      this.roleName = defaults.roleName;
        }

        @CustomType.Setter
        public Builder backend(@Nullable String backend) {
            this.backend = backend;
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
        public Builder roleId(String roleId) {
            this.roleId = Objects.requireNonNull(roleId);
            return this;
        }
        @CustomType.Setter
        public Builder roleName(String roleName) {
            this.roleName = Objects.requireNonNull(roleName);
            return this;
        }
        public GetAuthBackendRoleIdResult build() {
            final var o = new GetAuthBackendRoleIdResult();
            o.backend = backend;
            o.id = id;
            o.namespace = namespace;
            o.roleId = roleId;
            o.roleName = roleName;
            return o;
        }
    }
}
