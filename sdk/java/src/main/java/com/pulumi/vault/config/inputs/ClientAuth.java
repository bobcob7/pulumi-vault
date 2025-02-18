// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.config.inputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClientAuth {
    private String certFile;
    private String keyFile;

    private ClientAuth() {}
    public String certFile() {
        return this.certFile;
    }
    public String keyFile() {
        return this.keyFile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String certFile;
        private String keyFile;
        public Builder() {}
        public Builder(ClientAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certFile = defaults.certFile;
    	      this.keyFile = defaults.keyFile;
        }

        @CustomType.Setter
        public Builder certFile(String certFile) {
            this.certFile = Objects.requireNonNull(certFile);
            return this;
        }
        @CustomType.Setter
        public Builder keyFile(String keyFile) {
            this.keyFile = Objects.requireNonNull(keyFile);
            return this;
        }
        public ClientAuth build() {
            final var o = new ClientAuth();
            o.certFile = certFile;
            o.keyFile = keyFile;
            return o;
        }
    }
}
