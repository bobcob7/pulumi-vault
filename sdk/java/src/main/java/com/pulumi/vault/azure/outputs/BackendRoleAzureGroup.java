// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.azure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackendRoleAzureGroup {
    private final String groupName;
    private final @Nullable String objectId;

    @CustomType.Constructor
    private BackendRoleAzureGroup(
        @CustomType.Parameter("groupName") String groupName,
        @CustomType.Parameter("objectId") @Nullable String objectId) {
        this.groupName = groupName;
        this.objectId = objectId;
    }

    public String groupName() {
        return this.groupName;
    }
    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendRoleAzureGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupName;
        private @Nullable String objectId;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendRoleAzureGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupName = defaults.groupName;
    	      this.objectId = defaults.objectId;
        }

        public Builder groupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }
        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }        public BackendRoleAzureGroup build() {
            return new BackendRoleAzureGroup(groupName, objectId);
        }
    }
}
