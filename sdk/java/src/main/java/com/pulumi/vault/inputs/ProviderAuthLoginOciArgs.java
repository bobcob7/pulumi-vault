// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderAuthLoginOciArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderAuthLoginOciArgs Empty = new ProviderAuthLoginOciArgs();

    @Import(name="authType", required=true)
    private Output<String> authType;

    public Output<String> authType() {
        return this.authType;
    }

    @Import(name="mount")
    private @Nullable Output<String> mount;

    public Optional<Output<String>> mount() {
        return Optional.ofNullable(this.mount);
    }

    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    @Import(name="role", required=true)
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    private ProviderAuthLoginOciArgs() {}

    private ProviderAuthLoginOciArgs(ProviderAuthLoginOciArgs $) {
        this.authType = $.authType;
        this.mount = $.mount;
        this.namespace = $.namespace;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderAuthLoginOciArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderAuthLoginOciArgs $;

        public Builder() {
            $ = new ProviderAuthLoginOciArgs();
        }

        public Builder(ProviderAuthLoginOciArgs defaults) {
            $ = new ProviderAuthLoginOciArgs(Objects.requireNonNull(defaults));
        }

        public Builder authType(Output<String> authType) {
            $.authType = authType;
            return this;
        }

        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        public Builder mount(@Nullable Output<String> mount) {
            $.mount = mount;
            return this;
        }

        public Builder mount(String mount) {
            return mount(Output.of(mount));
        }

        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public ProviderAuthLoginOciArgs build() {
            $.authType = Objects.requireNonNull($.authType, "expected parameter 'authType' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}
