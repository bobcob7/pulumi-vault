// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault.kubernetes.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretBackendRoleState extends com.pulumi.resources.ResourceArgs {

    public static final SecretBackendRoleState Empty = new SecretBackendRoleState();

    /**
     * The list of Kubernetes namespaces this role
     * can generate credentials for. If set to `*` all namespaces are allowed.
     * 
     */
    @Import(name="allowedKubernetesNamespaces")
    private @Nullable Output<List<String>> allowedKubernetesNamespaces;

    /**
     * @return The list of Kubernetes namespaces this role
     * can generate credentials for. If set to `*` all namespaces are allowed.
     * 
     */
    public Optional<Output<List<String>>> allowedKubernetesNamespaces() {
        return Optional.ofNullable(this.allowedKubernetesNamespaces);
    }

    /**
     * The path of the Kubernetes Secrets Engine backend mount to create
     * the role in.
     * 
     */
    @Import(name="backend")
    private @Nullable Output<String> backend;

    /**
     * @return The path of the Kubernetes Secrets Engine backend mount to create
     * the role in.
     * 
     */
    public Optional<Output<String>> backend() {
        return Optional.ofNullable(this.backend);
    }

    /**
     * Additional annotations to apply to all generated
     * Kubernetes objects.
     * 
     */
    @Import(name="extraAnnotations")
    private @Nullable Output<Map<String,String>> extraAnnotations;

    /**
     * @return Additional annotations to apply to all generated
     * Kubernetes objects.
     * 
     */
    public Optional<Output<Map<String,String>>> extraAnnotations() {
        return Optional.ofNullable(this.extraAnnotations);
    }

    /**
     * Additional labels to apply to all generated Kubernetes
     * objects.
     * 
     */
    @Import(name="extraLabels")
    private @Nullable Output<Map<String,String>> extraLabels;

    /**
     * @return Additional labels to apply to all generated Kubernetes
     * objects.
     * 
     */
    public Optional<Output<Map<String,String>>> extraLabels() {
        return Optional.ofNullable(this.extraLabels);
    }

    /**
     * The Role or ClusterRole rules to use when generating
     * a role. Accepts either JSON or YAML formatted rules. Mutually exclusive with `service_account_name`
     * and `kubernetes_role_name`. If set, the entire chain of Kubernetes objects will be generated
     * when credentials are requested.
     * 
     */
    @Import(name="generatedRoleRules")
    private @Nullable Output<String> generatedRoleRules;

    /**
     * @return The Role or ClusterRole rules to use when generating
     * a role. Accepts either JSON or YAML formatted rules. Mutually exclusive with `service_account_name`
     * and `kubernetes_role_name`. If set, the entire chain of Kubernetes objects will be generated
     * when credentials are requested.
     * 
     */
    public Optional<Output<String>> generatedRoleRules() {
        return Optional.ofNullable(this.generatedRoleRules);
    }

    /**
     * The pre-existing Role or ClusterRole to bind a
     * generated service account to. Mutually exclusive with `service_account_name` and
     * `generated_role_rules`. If set, Kubernetes token, service account, and role
     * binding objects will be created when credentials are requested.
     * 
     */
    @Import(name="kubernetesRoleName")
    private @Nullable Output<String> kubernetesRoleName;

    /**
     * @return The pre-existing Role or ClusterRole to bind a
     * generated service account to. Mutually exclusive with `service_account_name` and
     * `generated_role_rules`. If set, Kubernetes token, service account, and role
     * binding objects will be created when credentials are requested.
     * 
     */
    public Optional<Output<String>> kubernetesRoleName() {
        return Optional.ofNullable(this.kubernetesRoleName);
    }

    /**
     * Specifies whether the Kubernetes role is a Role or
     * ClusterRole.
     * 
     */
    @Import(name="kubernetesRoleType")
    private @Nullable Output<String> kubernetesRoleType;

    /**
     * @return Specifies whether the Kubernetes role is a Role or
     * ClusterRole.
     * 
     */
    public Optional<Output<String>> kubernetesRoleType() {
        return Optional.ofNullable(this.kubernetesRoleType);
    }

    /**
     * The name of the role.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the role.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name template to use when generating service accounts,
     * roles and role bindings. If unset, a default template is used.
     * 
     */
    @Import(name="nameTemplate")
    private @Nullable Output<String> nameTemplate;

    /**
     * @return The name template to use when generating service accounts,
     * roles and role bindings. If unset, a default template is used.
     * 
     */
    public Optional<Output<String>> nameTemplate() {
        return Optional.ofNullable(this.nameTemplate);
    }

    /**
     * The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The namespace to provision the resource in.
     * The value should not contain leading or trailing forward slashes.
     * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
     * *Available only for Vault Enterprise*.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * The pre-existing service account to generate tokens for.
     * Mutually exclusive with `kubernetes_role_name` and `generated_role_rules`. If set, only a
     * Kubernetes token will be created when credentials are requested.
     * 
     */
    @Import(name="serviceAccountName")
    private @Nullable Output<String> serviceAccountName;

    /**
     * @return The pre-existing service account to generate tokens for.
     * Mutually exclusive with `kubernetes_role_name` and `generated_role_rules`. If set, only a
     * Kubernetes token will be created when credentials are requested.
     * 
     */
    public Optional<Output<String>> serviceAccountName() {
        return Optional.ofNullable(this.serviceAccountName);
    }

    /**
     * The default TTL for generated Kubernetes tokens in seconds.
     * 
     */
    @Import(name="tokenDefaultTtl")
    private @Nullable Output<Integer> tokenDefaultTtl;

    /**
     * @return The default TTL for generated Kubernetes tokens in seconds.
     * 
     */
    public Optional<Output<Integer>> tokenDefaultTtl() {
        return Optional.ofNullable(this.tokenDefaultTtl);
    }

    /**
     * The maximum TTL for generated Kubernetes tokens in seconds.
     * 
     */
    @Import(name="tokenMaxTtl")
    private @Nullable Output<Integer> tokenMaxTtl;

    /**
     * @return The maximum TTL for generated Kubernetes tokens in seconds.
     * 
     */
    public Optional<Output<Integer>> tokenMaxTtl() {
        return Optional.ofNullable(this.tokenMaxTtl);
    }

    private SecretBackendRoleState() {}

    private SecretBackendRoleState(SecretBackendRoleState $) {
        this.allowedKubernetesNamespaces = $.allowedKubernetesNamespaces;
        this.backend = $.backend;
        this.extraAnnotations = $.extraAnnotations;
        this.extraLabels = $.extraLabels;
        this.generatedRoleRules = $.generatedRoleRules;
        this.kubernetesRoleName = $.kubernetesRoleName;
        this.kubernetesRoleType = $.kubernetesRoleType;
        this.name = $.name;
        this.nameTemplate = $.nameTemplate;
        this.namespace = $.namespace;
        this.serviceAccountName = $.serviceAccountName;
        this.tokenDefaultTtl = $.tokenDefaultTtl;
        this.tokenMaxTtl = $.tokenMaxTtl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretBackendRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretBackendRoleState $;

        public Builder() {
            $ = new SecretBackendRoleState();
        }

        public Builder(SecretBackendRoleState defaults) {
            $ = new SecretBackendRoleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedKubernetesNamespaces The list of Kubernetes namespaces this role
         * can generate credentials for. If set to `*` all namespaces are allowed.
         * 
         * @return builder
         * 
         */
        public Builder allowedKubernetesNamespaces(@Nullable Output<List<String>> allowedKubernetesNamespaces) {
            $.allowedKubernetesNamespaces = allowedKubernetesNamespaces;
            return this;
        }

        /**
         * @param allowedKubernetesNamespaces The list of Kubernetes namespaces this role
         * can generate credentials for. If set to `*` all namespaces are allowed.
         * 
         * @return builder
         * 
         */
        public Builder allowedKubernetesNamespaces(List<String> allowedKubernetesNamespaces) {
            return allowedKubernetesNamespaces(Output.of(allowedKubernetesNamespaces));
        }

        /**
         * @param allowedKubernetesNamespaces The list of Kubernetes namespaces this role
         * can generate credentials for. If set to `*` all namespaces are allowed.
         * 
         * @return builder
         * 
         */
        public Builder allowedKubernetesNamespaces(String... allowedKubernetesNamespaces) {
            return allowedKubernetesNamespaces(List.of(allowedKubernetesNamespaces));
        }

        /**
         * @param backend The path of the Kubernetes Secrets Engine backend mount to create
         * the role in.
         * 
         * @return builder
         * 
         */
        public Builder backend(@Nullable Output<String> backend) {
            $.backend = backend;
            return this;
        }

        /**
         * @param backend The path of the Kubernetes Secrets Engine backend mount to create
         * the role in.
         * 
         * @return builder
         * 
         */
        public Builder backend(String backend) {
            return backend(Output.of(backend));
        }

        /**
         * @param extraAnnotations Additional annotations to apply to all generated
         * Kubernetes objects.
         * 
         * @return builder
         * 
         */
        public Builder extraAnnotations(@Nullable Output<Map<String,String>> extraAnnotations) {
            $.extraAnnotations = extraAnnotations;
            return this;
        }

        /**
         * @param extraAnnotations Additional annotations to apply to all generated
         * Kubernetes objects.
         * 
         * @return builder
         * 
         */
        public Builder extraAnnotations(Map<String,String> extraAnnotations) {
            return extraAnnotations(Output.of(extraAnnotations));
        }

        /**
         * @param extraLabels Additional labels to apply to all generated Kubernetes
         * objects.
         * 
         * @return builder
         * 
         */
        public Builder extraLabels(@Nullable Output<Map<String,String>> extraLabels) {
            $.extraLabels = extraLabels;
            return this;
        }

        /**
         * @param extraLabels Additional labels to apply to all generated Kubernetes
         * objects.
         * 
         * @return builder
         * 
         */
        public Builder extraLabels(Map<String,String> extraLabels) {
            return extraLabels(Output.of(extraLabels));
        }

        /**
         * @param generatedRoleRules The Role or ClusterRole rules to use when generating
         * a role. Accepts either JSON or YAML formatted rules. Mutually exclusive with `service_account_name`
         * and `kubernetes_role_name`. If set, the entire chain of Kubernetes objects will be generated
         * when credentials are requested.
         * 
         * @return builder
         * 
         */
        public Builder generatedRoleRules(@Nullable Output<String> generatedRoleRules) {
            $.generatedRoleRules = generatedRoleRules;
            return this;
        }

        /**
         * @param generatedRoleRules The Role or ClusterRole rules to use when generating
         * a role. Accepts either JSON or YAML formatted rules. Mutually exclusive with `service_account_name`
         * and `kubernetes_role_name`. If set, the entire chain of Kubernetes objects will be generated
         * when credentials are requested.
         * 
         * @return builder
         * 
         */
        public Builder generatedRoleRules(String generatedRoleRules) {
            return generatedRoleRules(Output.of(generatedRoleRules));
        }

        /**
         * @param kubernetesRoleName The pre-existing Role or ClusterRole to bind a
         * generated service account to. Mutually exclusive with `service_account_name` and
         * `generated_role_rules`. If set, Kubernetes token, service account, and role
         * binding objects will be created when credentials are requested.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesRoleName(@Nullable Output<String> kubernetesRoleName) {
            $.kubernetesRoleName = kubernetesRoleName;
            return this;
        }

        /**
         * @param kubernetesRoleName The pre-existing Role or ClusterRole to bind a
         * generated service account to. Mutually exclusive with `service_account_name` and
         * `generated_role_rules`. If set, Kubernetes token, service account, and role
         * binding objects will be created when credentials are requested.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesRoleName(String kubernetesRoleName) {
            return kubernetesRoleName(Output.of(kubernetesRoleName));
        }

        /**
         * @param kubernetesRoleType Specifies whether the Kubernetes role is a Role or
         * ClusterRole.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesRoleType(@Nullable Output<String> kubernetesRoleType) {
            $.kubernetesRoleType = kubernetesRoleType;
            return this;
        }

        /**
         * @param kubernetesRoleType Specifies whether the Kubernetes role is a Role or
         * ClusterRole.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesRoleType(String kubernetesRoleType) {
            return kubernetesRoleType(Output.of(kubernetesRoleType));
        }

        /**
         * @param name The name of the role.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the role.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nameTemplate The name template to use when generating service accounts,
         * roles and role bindings. If unset, a default template is used.
         * 
         * @return builder
         * 
         */
        public Builder nameTemplate(@Nullable Output<String> nameTemplate) {
            $.nameTemplate = nameTemplate;
            return this;
        }

        /**
         * @param nameTemplate The name template to use when generating service accounts,
         * roles and role bindings. If unset, a default template is used.
         * 
         * @return builder
         * 
         */
        public Builder nameTemplate(String nameTemplate) {
            return nameTemplate(Output.of(nameTemplate));
        }

        /**
         * @param namespace The namespace to provision the resource in.
         * The value should not contain leading or trailing forward slashes.
         * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
         * *Available only for Vault Enterprise*.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespace to provision the resource in.
         * The value should not contain leading or trailing forward slashes.
         * The `namespace` is always relative to the provider&#39;s configured [namespace](https://www.terraform.io/docs/providers/vault#namespace).
         * *Available only for Vault Enterprise*.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param serviceAccountName The pre-existing service account to generate tokens for.
         * Mutually exclusive with `kubernetes_role_name` and `generated_role_rules`. If set, only a
         * Kubernetes token will be created when credentials are requested.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountName(@Nullable Output<String> serviceAccountName) {
            $.serviceAccountName = serviceAccountName;
            return this;
        }

        /**
         * @param serviceAccountName The pre-existing service account to generate tokens for.
         * Mutually exclusive with `kubernetes_role_name` and `generated_role_rules`. If set, only a
         * Kubernetes token will be created when credentials are requested.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountName(String serviceAccountName) {
            return serviceAccountName(Output.of(serviceAccountName));
        }

        /**
         * @param tokenDefaultTtl The default TTL for generated Kubernetes tokens in seconds.
         * 
         * @return builder
         * 
         */
        public Builder tokenDefaultTtl(@Nullable Output<Integer> tokenDefaultTtl) {
            $.tokenDefaultTtl = tokenDefaultTtl;
            return this;
        }

        /**
         * @param tokenDefaultTtl The default TTL for generated Kubernetes tokens in seconds.
         * 
         * @return builder
         * 
         */
        public Builder tokenDefaultTtl(Integer tokenDefaultTtl) {
            return tokenDefaultTtl(Output.of(tokenDefaultTtl));
        }

        /**
         * @param tokenMaxTtl The maximum TTL for generated Kubernetes tokens in seconds.
         * 
         * @return builder
         * 
         */
        public Builder tokenMaxTtl(@Nullable Output<Integer> tokenMaxTtl) {
            $.tokenMaxTtl = tokenMaxTtl;
            return this;
        }

        /**
         * @param tokenMaxTtl The maximum TTL for generated Kubernetes tokens in seconds.
         * 
         * @return builder
         * 
         */
        public Builder tokenMaxTtl(Integer tokenMaxTtl) {
            return tokenMaxTtl(Output.of(tokenMaxTtl));
        }

        public SecretBackendRoleState build() {
            return $;
        }
    }

}
