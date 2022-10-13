// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.kv.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretSubKeysV2Args extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretSubKeysV2Args Empty = new GetSecretSubKeysV2Args();

    @Import(name="depth")
    private @Nullable Output<Integer> depth;

    public Optional<Output<Integer>> depth() {
        return Optional.ofNullable(this.depth);
    }

    @Import(name="mount", required=true)
    private Output<String> mount;

    public Output<String> mount() {
        return this.mount;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    @Import(name="version")
    private @Nullable Output<Integer> version;

    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private GetSecretSubKeysV2Args() {}

    private GetSecretSubKeysV2Args(GetSecretSubKeysV2Args $) {
        this.depth = $.depth;
        this.mount = $.mount;
        this.name = $.name;
        this.namespace = $.namespace;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretSubKeysV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretSubKeysV2Args $;

        public Builder() {
            $ = new GetSecretSubKeysV2Args();
        }

        public Builder(GetSecretSubKeysV2Args defaults) {
            $ = new GetSecretSubKeysV2Args(Objects.requireNonNull(defaults));
        }

        public Builder depth(@Nullable Output<Integer> depth) {
            $.depth = depth;
            return this;
        }

        public Builder depth(Integer depth) {
            return depth(Output.of(depth));
        }

        public Builder mount(Output<String> mount) {
            $.mount = mount;
            return this;
        }

        public Builder mount(String mount) {
            return mount(Output.of(mount));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public GetSecretSubKeysV2Args build() {
            $.mount = Objects.requireNonNull($.mount, "expected parameter 'mount' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
