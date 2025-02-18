// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.transform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlphabetState extends com.pulumi.resources.ResourceArgs {

    public static final AlphabetState Empty = new AlphabetState();

    /**
     * A string of characters that contains the alphabet set.
     * 
     */
    @Import(name="alphabet")
    private @Nullable Output<String> alphabet;

    /**
     * @return A string of characters that contains the alphabet set.
     * 
     */
    public Optional<Output<String>> alphabet() {
        return Optional.ofNullable(this.alphabet);
    }

    /**
     * The name of the alphabet.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the alphabet.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Path to where the back-end is mounted within Vault.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Path to where the back-end is mounted within Vault.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    private AlphabetState() {}

    private AlphabetState(AlphabetState $) {
        this.alphabet = $.alphabet;
        this.name = $.name;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlphabetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlphabetState $;

        public Builder() {
            $ = new AlphabetState();
        }

        public Builder(AlphabetState defaults) {
            $ = new AlphabetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param alphabet A string of characters that contains the alphabet set.
         * 
         * @return builder
         * 
         */
        public Builder alphabet(@Nullable Output<String> alphabet) {
            $.alphabet = alphabet;
            return this;
        }

        /**
         * @param alphabet A string of characters that contains the alphabet set.
         * 
         * @return builder
         * 
         */
        public Builder alphabet(String alphabet) {
            return alphabet(Output.of(alphabet));
        }

        /**
         * @param name The name of the alphabet.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the alphabet.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path Path to where the back-end is mounted within Vault.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path to where the back-end is mounted within Vault.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public AlphabetState build() {
            return $;
        }
    }

}
