// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderAuthLoginOidcArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderAuthLoginOidcArgs Empty = new ProviderAuthLoginOidcArgs();

    @Import(name="callbackAddress")
    private @Nullable Output<String> callbackAddress;

    public Optional<Output<String>> callbackAddress() {
        return Optional.ofNullable(this.callbackAddress);
    }

    @Import(name="callbackListenerAddress")
    private @Nullable Output<String> callbackListenerAddress;

    public Optional<Output<String>> callbackListenerAddress() {
        return Optional.ofNullable(this.callbackListenerAddress);
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

    private ProviderAuthLoginOidcArgs() {}

    private ProviderAuthLoginOidcArgs(ProviderAuthLoginOidcArgs $) {
        this.callbackAddress = $.callbackAddress;
        this.callbackListenerAddress = $.callbackListenerAddress;
        this.mount = $.mount;
        this.namespace = $.namespace;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderAuthLoginOidcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderAuthLoginOidcArgs $;

        public Builder() {
            $ = new ProviderAuthLoginOidcArgs();
        }

        public Builder(ProviderAuthLoginOidcArgs defaults) {
            $ = new ProviderAuthLoginOidcArgs(Objects.requireNonNull(defaults));
        }

        public Builder callbackAddress(@Nullable Output<String> callbackAddress) {
            $.callbackAddress = callbackAddress;
            return this;
        }

        public Builder callbackAddress(String callbackAddress) {
            return callbackAddress(Output.of(callbackAddress));
        }

        public Builder callbackListenerAddress(@Nullable Output<String> callbackListenerAddress) {
            $.callbackListenerAddress = callbackListenerAddress;
            return this;
        }

        public Builder callbackListenerAddress(String callbackListenerAddress) {
            return callbackListenerAddress(Output.of(callbackListenerAddress));
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

        public ProviderAuthLoginOidcArgs build() {
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}
