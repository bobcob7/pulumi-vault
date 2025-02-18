// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.config.inputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AuthLoginOidc {
    private @Nullable String callbackAddress;
    private @Nullable String callbackListenerAddress;
    private @Nullable String mount;
    private @Nullable String namespace;
    private String role;

    private AuthLoginOidc() {}
    public Optional<String> callbackAddress() {
        return Optional.ofNullable(this.callbackAddress);
    }
    public Optional<String> callbackListenerAddress() {
        return Optional.ofNullable(this.callbackListenerAddress);
    }
    public Optional<String> mount() {
        return Optional.ofNullable(this.mount);
    }
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    public String role() {
        return this.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthLoginOidc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String callbackAddress;
        private @Nullable String callbackListenerAddress;
        private @Nullable String mount;
        private @Nullable String namespace;
        private String role;
        public Builder() {}
        public Builder(AuthLoginOidc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callbackAddress = defaults.callbackAddress;
    	      this.callbackListenerAddress = defaults.callbackListenerAddress;
    	      this.mount = defaults.mount;
    	      this.namespace = defaults.namespace;
    	      this.role = defaults.role;
        }

        @CustomType.Setter
        public Builder callbackAddress(@Nullable String callbackAddress) {
            this.callbackAddress = callbackAddress;
            return this;
        }
        @CustomType.Setter
        public Builder callbackListenerAddress(@Nullable String callbackListenerAddress) {
            this.callbackListenerAddress = callbackListenerAddress;
            return this;
        }
        @CustomType.Setter
        public Builder mount(@Nullable String mount) {
            this.mount = mount;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public AuthLoginOidc build() {
            final var o = new AuthLoginOidc();
            o.callbackAddress = callbackAddress;
            o.callbackListenerAddress = callbackListenerAddress;
            o.mount = mount;
            o.namespace = namespace;
            o.role = role;
            return o;
        }
    }
}
