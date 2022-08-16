// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.vault;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RaftSnapshotAgentConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RaftSnapshotAgentConfigArgs Empty = new RaftSnapshotAgentConfigArgs();

    /**
     * AWS access key ID.
     * 
     */
    @Import(name="awsAccessKeyId")
    private @Nullable Output<String> awsAccessKeyId;

    /**
     * @return AWS access key ID.
     * 
     */
    public Optional<Output<String>> awsAccessKeyId() {
        return Optional.ofNullable(this.awsAccessKeyId);
    }

    /**
     * `&lt;required&gt;` - S3 bucket to write snapshots to.
     * 
     */
    @Import(name="awsS3Bucket")
    private @Nullable Output<String> awsS3Bucket;

    /**
     * @return `&lt;required&gt;` - S3 bucket to write snapshots to.
     * 
     */
    public Optional<Output<String>> awsS3Bucket() {
        return Optional.ofNullable(this.awsS3Bucket);
    }

    /**
     * Disable TLS for the S3 endpoint. This
     * should only be used for testing purposes, typically in conjunction with
     * `aws_s3_endpoint`.
     * 
     */
    @Import(name="awsS3DisableTls")
    private @Nullable Output<Boolean> awsS3DisableTls;

    /**
     * @return Disable TLS for the S3 endpoint. This
     * should only be used for testing purposes, typically in conjunction with
     * `aws_s3_endpoint`.
     * 
     */
    public Optional<Output<Boolean>> awsS3DisableTls() {
        return Optional.ofNullable(this.awsS3DisableTls);
    }

    /**
     * Use KMS to encrypt bucket contents.
     * 
     */
    @Import(name="awsS3EnableKms")
    private @Nullable Output<Boolean> awsS3EnableKms;

    /**
     * @return Use KMS to encrypt bucket contents.
     * 
     */
    public Optional<Output<Boolean>> awsS3EnableKms() {
        return Optional.ofNullable(this.awsS3EnableKms);
    }

    /**
     * AWS endpoint. This is typically only set when
     * using a non-AWS S3 implementation like Minio.
     * 
     */
    @Import(name="awsS3Endpoint")
    private @Nullable Output<String> awsS3Endpoint;

    /**
     * @return AWS endpoint. This is typically only set when
     * using a non-AWS S3 implementation like Minio.
     * 
     */
    public Optional<Output<String>> awsS3Endpoint() {
        return Optional.ofNullable(this.awsS3Endpoint);
    }

    /**
     * Use the endpoint/bucket URL style
     * instead of bucket.endpoint. May be needed when setting `aws_s3_endpoint`.
     * 
     */
    @Import(name="awsS3ForcePathStyle")
    private @Nullable Output<Boolean> awsS3ForcePathStyle;

    /**
     * @return Use the endpoint/bucket URL style
     * instead of bucket.endpoint. May be needed when setting `aws_s3_endpoint`.
     * 
     */
    public Optional<Output<Boolean>> awsS3ForcePathStyle() {
        return Optional.ofNullable(this.awsS3ForcePathStyle);
    }

    /**
     * Use named KMS key, when `aws_s3_enable_kms = true`
     * 
     */
    @Import(name="awsS3KmsKey")
    private @Nullable Output<String> awsS3KmsKey;

    /**
     * @return Use named KMS key, when `aws_s3_enable_kms = true`
     * 
     */
    public Optional<Output<String>> awsS3KmsKey() {
        return Optional.ofNullable(this.awsS3KmsKey);
    }

    /**
     * `&lt;required&gt;` - AWS region bucket is in.
     * 
     */
    @Import(name="awsS3Region")
    private @Nullable Output<String> awsS3Region;

    /**
     * @return `&lt;required&gt;` - AWS region bucket is in.
     * 
     */
    public Optional<Output<String>> awsS3Region() {
        return Optional.ofNullable(this.awsS3Region);
    }

    /**
     * Use AES256 to encrypt bucket contents.
     * 
     */
    @Import(name="awsS3ServerSideEncryption")
    private @Nullable Output<Boolean> awsS3ServerSideEncryption;

    /**
     * @return Use AES256 to encrypt bucket contents.
     * 
     */
    public Optional<Output<Boolean>> awsS3ServerSideEncryption() {
        return Optional.ofNullable(this.awsS3ServerSideEncryption);
    }

    /**
     * AWS secret access key.
     * 
     */
    @Import(name="awsSecretAccessKey")
    private @Nullable Output<String> awsSecretAccessKey;

    /**
     * @return AWS secret access key.
     * 
     */
    public Optional<Output<String>> awsSecretAccessKey() {
        return Optional.ofNullable(this.awsSecretAccessKey);
    }

    /**
     * AWS session token.
     * 
     */
    @Import(name="awsSessionToken")
    private @Nullable Output<String> awsSessionToken;

    /**
     * @return AWS session token.
     * 
     */
    public Optional<Output<String>> awsSessionToken() {
        return Optional.ofNullable(this.awsSessionToken);
    }

    /**
     * Azure account key.
     * 
     */
    @Import(name="azureAccountKey")
    private @Nullable Output<String> azureAccountKey;

    /**
     * @return Azure account key.
     * 
     */
    public Optional<Output<String>> azureAccountKey() {
        return Optional.ofNullable(this.azureAccountKey);
    }

    /**
     * Azure account name.
     * 
     */
    @Import(name="azureAccountName")
    private @Nullable Output<String> azureAccountName;

    /**
     * @return Azure account name.
     * 
     */
    public Optional<Output<String>> azureAccountName() {
        return Optional.ofNullable(this.azureAccountName);
    }

    /**
     * Azure blob environment.
     * 
     */
    @Import(name="azureBlobEnvironment")
    private @Nullable Output<String> azureBlobEnvironment;

    /**
     * @return Azure blob environment.
     * 
     */
    public Optional<Output<String>> azureBlobEnvironment() {
        return Optional.ofNullable(this.azureBlobEnvironment);
    }

    /**
     * `&lt;required&gt;` - Azure container name to write
     * snapshots to.
     * 
     */
    @Import(name="azureContainerName")
    private @Nullable Output<String> azureContainerName;

    /**
     * @return `&lt;required&gt;` - Azure container name to write
     * snapshots to.
     * 
     */
    public Optional<Output<String>> azureContainerName() {
        return Optional.ofNullable(this.azureContainerName);
    }

    /**
     * Azure blob storage endpoint. This is typically
     * only set when using a non-Azure implementation like Azurite.
     * 
     */
    @Import(name="azureEndpoint")
    private @Nullable Output<String> azureEndpoint;

    /**
     * @return Azure blob storage endpoint. This is typically
     * only set when using a non-Azure implementation like Azurite.
     * 
     */
    public Optional<Output<String>> azureEndpoint() {
        return Optional.ofNullable(this.azureEndpoint);
    }

    /**
     * Within the directory or bucket
     * prefix given by `path_prefix`, the file or object name of snapshot files
     * will start with this string.
     * 
     */
    @Import(name="filePrefix")
    private @Nullable Output<String> filePrefix;

    /**
     * @return Within the directory or bucket
     * prefix given by `path_prefix`, the file or object name of snapshot files
     * will start with this string.
     * 
     */
    public Optional<Output<String>> filePrefix() {
        return Optional.ofNullable(this.filePrefix);
    }

    /**
     * Disable TLS for the GCS endpoint. This
     * should only be used for testing purposes, typically in conjunction with
     * `google_endpoint`.
     * 
     */
    @Import(name="googleDisableTls")
    private @Nullable Output<Boolean> googleDisableTls;

    /**
     * @return Disable TLS for the GCS endpoint. This
     * should only be used for testing purposes, typically in conjunction with
     * `google_endpoint`.
     * 
     */
    public Optional<Output<Boolean>> googleDisableTls() {
        return Optional.ofNullable(this.googleDisableTls);
    }

    /**
     * GCS endpoint. This is typically only set when
     * using a non-Google GCS implementation like fake-gcs-server.
     * 
     */
    @Import(name="googleEndpoint")
    private @Nullable Output<String> googleEndpoint;

    /**
     * @return GCS endpoint. This is typically only set when
     * using a non-Google GCS implementation like fake-gcs-server.
     * 
     */
    public Optional<Output<String>> googleEndpoint() {
        return Optional.ofNullable(this.googleEndpoint);
    }

    /**
     * `&lt;required&gt;` - GCS bucket to write snapshots to.
     * 
     */
    @Import(name="googleGcsBucket")
    private @Nullable Output<String> googleGcsBucket;

    /**
     * @return `&lt;required&gt;` - GCS bucket to write snapshots to.
     * 
     */
    public Optional<Output<String>> googleGcsBucket() {
        return Optional.ofNullable(this.googleGcsBucket);
    }

    /**
     * Google service account key in JSON format.
     * The raw value looks like this:
     * 
     */
    @Import(name="googleServiceAccountKey")
    private @Nullable Output<String> googleServiceAccountKey;

    /**
     * @return Google service account key in JSON format.
     * The raw value looks like this:
     * 
     */
    public Optional<Output<String>> googleServiceAccountKey() {
        return Optional.ofNullable(this.googleServiceAccountKey);
    }

    /**
     * `&lt;required&gt;` - Time (in seconds) between snapshots.
     * 
     */
    @Import(name="intervalSeconds", required=true)
    private Output<Integer> intervalSeconds;

    /**
     * @return `&lt;required&gt;` - Time (in seconds) between snapshots.
     * 
     */
    public Output<Integer> intervalSeconds() {
        return this.intervalSeconds;
    }

    /**
     * For `storage_type = local`, the maximum
     * space, in bytes, to use for snapshots. Snapshot attempts will fail if there is not enough
     * space left in this allowance.
     * 
     */
    @Import(name="localMaxSpace")
    private @Nullable Output<Integer> localMaxSpace;

    /**
     * @return For `storage_type = local`, the maximum
     * space, in bytes, to use for snapshots. Snapshot attempts will fail if there is not enough
     * space left in this allowance.
     * 
     */
    public Optional<Output<Integer>> localMaxSpace() {
        return Optional.ofNullable(this.localMaxSpace);
    }

    /**
     * `&lt;required&gt;` – Name of the configuration to modify.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return `&lt;required&gt;` – Name of the configuration to modify.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * `&lt;required&gt;` - For `storage_type = &#34;local&#34;`, the directory to
     * write the snapshots in. For cloud storage types, the bucket prefix to use.
     * Types `azure-s3` and `google-gcs` require a trailing `/` (slash).
     * Types `local` and `aws-s3` the trailing `/` is optional.
     * 
     */
    @Import(name="pathPrefix", required=true)
    private Output<String> pathPrefix;

    /**
     * @return `&lt;required&gt;` - For `storage_type = &#34;local&#34;`, the directory to
     * write the snapshots in. For cloud storage types, the bucket prefix to use.
     * Types `azure-s3` and `google-gcs` require a trailing `/` (slash).
     * Types `local` and `aws-s3` the trailing `/` is optional.
     * 
     */
    public Output<String> pathPrefix() {
        return this.pathPrefix;
    }

    /**
     * How many snapshots are to be kept; when writing a
     * snapshot, if there are more snapshots already stored than this number, the
     * oldest ones will be deleted.
     * 
     */
    @Import(name="retain")
    private @Nullable Output<Integer> retain;

    /**
     * @return How many snapshots are to be kept; when writing a
     * snapshot, if there are more snapshots already stored than this number, the
     * oldest ones will be deleted.
     * 
     */
    public Optional<Output<Integer>> retain() {
        return Optional.ofNullable(this.retain);
    }

    /**
     * `&lt;required&gt;` - One of &#34;local&#34;, &#34;azure-blob&#34;, &#34;aws-s3&#34;,
     * or &#34;google-gcs&#34;. The remaining parameters described below are all specific to
     * the selected `storage_type` and prefixed accordingly.
     * 
     */
    @Import(name="storageType", required=true)
    private Output<String> storageType;

    /**
     * @return `&lt;required&gt;` - One of &#34;local&#34;, &#34;azure-blob&#34;, &#34;aws-s3&#34;,
     * or &#34;google-gcs&#34;. The remaining parameters described below are all specific to
     * the selected `storage_type` and prefixed accordingly.
     * 
     */
    public Output<String> storageType() {
        return this.storageType;
    }

    private RaftSnapshotAgentConfigArgs() {}

    private RaftSnapshotAgentConfigArgs(RaftSnapshotAgentConfigArgs $) {
        this.awsAccessKeyId = $.awsAccessKeyId;
        this.awsS3Bucket = $.awsS3Bucket;
        this.awsS3DisableTls = $.awsS3DisableTls;
        this.awsS3EnableKms = $.awsS3EnableKms;
        this.awsS3Endpoint = $.awsS3Endpoint;
        this.awsS3ForcePathStyle = $.awsS3ForcePathStyle;
        this.awsS3KmsKey = $.awsS3KmsKey;
        this.awsS3Region = $.awsS3Region;
        this.awsS3ServerSideEncryption = $.awsS3ServerSideEncryption;
        this.awsSecretAccessKey = $.awsSecretAccessKey;
        this.awsSessionToken = $.awsSessionToken;
        this.azureAccountKey = $.azureAccountKey;
        this.azureAccountName = $.azureAccountName;
        this.azureBlobEnvironment = $.azureBlobEnvironment;
        this.azureContainerName = $.azureContainerName;
        this.azureEndpoint = $.azureEndpoint;
        this.filePrefix = $.filePrefix;
        this.googleDisableTls = $.googleDisableTls;
        this.googleEndpoint = $.googleEndpoint;
        this.googleGcsBucket = $.googleGcsBucket;
        this.googleServiceAccountKey = $.googleServiceAccountKey;
        this.intervalSeconds = $.intervalSeconds;
        this.localMaxSpace = $.localMaxSpace;
        this.name = $.name;
        this.pathPrefix = $.pathPrefix;
        this.retain = $.retain;
        this.storageType = $.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RaftSnapshotAgentConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RaftSnapshotAgentConfigArgs $;

        public Builder() {
            $ = new RaftSnapshotAgentConfigArgs();
        }

        public Builder(RaftSnapshotAgentConfigArgs defaults) {
            $ = new RaftSnapshotAgentConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsAccessKeyId AWS access key ID.
         * 
         * @return builder
         * 
         */
        public Builder awsAccessKeyId(@Nullable Output<String> awsAccessKeyId) {
            $.awsAccessKeyId = awsAccessKeyId;
            return this;
        }

        /**
         * @param awsAccessKeyId AWS access key ID.
         * 
         * @return builder
         * 
         */
        public Builder awsAccessKeyId(String awsAccessKeyId) {
            return awsAccessKeyId(Output.of(awsAccessKeyId));
        }

        /**
         * @param awsS3Bucket `&lt;required&gt;` - S3 bucket to write snapshots to.
         * 
         * @return builder
         * 
         */
        public Builder awsS3Bucket(@Nullable Output<String> awsS3Bucket) {
            $.awsS3Bucket = awsS3Bucket;
            return this;
        }

        /**
         * @param awsS3Bucket `&lt;required&gt;` - S3 bucket to write snapshots to.
         * 
         * @return builder
         * 
         */
        public Builder awsS3Bucket(String awsS3Bucket) {
            return awsS3Bucket(Output.of(awsS3Bucket));
        }

        /**
         * @param awsS3DisableTls Disable TLS for the S3 endpoint. This
         * should only be used for testing purposes, typically in conjunction with
         * `aws_s3_endpoint`.
         * 
         * @return builder
         * 
         */
        public Builder awsS3DisableTls(@Nullable Output<Boolean> awsS3DisableTls) {
            $.awsS3DisableTls = awsS3DisableTls;
            return this;
        }

        /**
         * @param awsS3DisableTls Disable TLS for the S3 endpoint. This
         * should only be used for testing purposes, typically in conjunction with
         * `aws_s3_endpoint`.
         * 
         * @return builder
         * 
         */
        public Builder awsS3DisableTls(Boolean awsS3DisableTls) {
            return awsS3DisableTls(Output.of(awsS3DisableTls));
        }

        /**
         * @param awsS3EnableKms Use KMS to encrypt bucket contents.
         * 
         * @return builder
         * 
         */
        public Builder awsS3EnableKms(@Nullable Output<Boolean> awsS3EnableKms) {
            $.awsS3EnableKms = awsS3EnableKms;
            return this;
        }

        /**
         * @param awsS3EnableKms Use KMS to encrypt bucket contents.
         * 
         * @return builder
         * 
         */
        public Builder awsS3EnableKms(Boolean awsS3EnableKms) {
            return awsS3EnableKms(Output.of(awsS3EnableKms));
        }

        /**
         * @param awsS3Endpoint AWS endpoint. This is typically only set when
         * using a non-AWS S3 implementation like Minio.
         * 
         * @return builder
         * 
         */
        public Builder awsS3Endpoint(@Nullable Output<String> awsS3Endpoint) {
            $.awsS3Endpoint = awsS3Endpoint;
            return this;
        }

        /**
         * @param awsS3Endpoint AWS endpoint. This is typically only set when
         * using a non-AWS S3 implementation like Minio.
         * 
         * @return builder
         * 
         */
        public Builder awsS3Endpoint(String awsS3Endpoint) {
            return awsS3Endpoint(Output.of(awsS3Endpoint));
        }

        /**
         * @param awsS3ForcePathStyle Use the endpoint/bucket URL style
         * instead of bucket.endpoint. May be needed when setting `aws_s3_endpoint`.
         * 
         * @return builder
         * 
         */
        public Builder awsS3ForcePathStyle(@Nullable Output<Boolean> awsS3ForcePathStyle) {
            $.awsS3ForcePathStyle = awsS3ForcePathStyle;
            return this;
        }

        /**
         * @param awsS3ForcePathStyle Use the endpoint/bucket URL style
         * instead of bucket.endpoint. May be needed when setting `aws_s3_endpoint`.
         * 
         * @return builder
         * 
         */
        public Builder awsS3ForcePathStyle(Boolean awsS3ForcePathStyle) {
            return awsS3ForcePathStyle(Output.of(awsS3ForcePathStyle));
        }

        /**
         * @param awsS3KmsKey Use named KMS key, when `aws_s3_enable_kms = true`
         * 
         * @return builder
         * 
         */
        public Builder awsS3KmsKey(@Nullable Output<String> awsS3KmsKey) {
            $.awsS3KmsKey = awsS3KmsKey;
            return this;
        }

        /**
         * @param awsS3KmsKey Use named KMS key, when `aws_s3_enable_kms = true`
         * 
         * @return builder
         * 
         */
        public Builder awsS3KmsKey(String awsS3KmsKey) {
            return awsS3KmsKey(Output.of(awsS3KmsKey));
        }

        /**
         * @param awsS3Region `&lt;required&gt;` - AWS region bucket is in.
         * 
         * @return builder
         * 
         */
        public Builder awsS3Region(@Nullable Output<String> awsS3Region) {
            $.awsS3Region = awsS3Region;
            return this;
        }

        /**
         * @param awsS3Region `&lt;required&gt;` - AWS region bucket is in.
         * 
         * @return builder
         * 
         */
        public Builder awsS3Region(String awsS3Region) {
            return awsS3Region(Output.of(awsS3Region));
        }

        /**
         * @param awsS3ServerSideEncryption Use AES256 to encrypt bucket contents.
         * 
         * @return builder
         * 
         */
        public Builder awsS3ServerSideEncryption(@Nullable Output<Boolean> awsS3ServerSideEncryption) {
            $.awsS3ServerSideEncryption = awsS3ServerSideEncryption;
            return this;
        }

        /**
         * @param awsS3ServerSideEncryption Use AES256 to encrypt bucket contents.
         * 
         * @return builder
         * 
         */
        public Builder awsS3ServerSideEncryption(Boolean awsS3ServerSideEncryption) {
            return awsS3ServerSideEncryption(Output.of(awsS3ServerSideEncryption));
        }

        /**
         * @param awsSecretAccessKey AWS secret access key.
         * 
         * @return builder
         * 
         */
        public Builder awsSecretAccessKey(@Nullable Output<String> awsSecretAccessKey) {
            $.awsSecretAccessKey = awsSecretAccessKey;
            return this;
        }

        /**
         * @param awsSecretAccessKey AWS secret access key.
         * 
         * @return builder
         * 
         */
        public Builder awsSecretAccessKey(String awsSecretAccessKey) {
            return awsSecretAccessKey(Output.of(awsSecretAccessKey));
        }

        /**
         * @param awsSessionToken AWS session token.
         * 
         * @return builder
         * 
         */
        public Builder awsSessionToken(@Nullable Output<String> awsSessionToken) {
            $.awsSessionToken = awsSessionToken;
            return this;
        }

        /**
         * @param awsSessionToken AWS session token.
         * 
         * @return builder
         * 
         */
        public Builder awsSessionToken(String awsSessionToken) {
            return awsSessionToken(Output.of(awsSessionToken));
        }

        /**
         * @param azureAccountKey Azure account key.
         * 
         * @return builder
         * 
         */
        public Builder azureAccountKey(@Nullable Output<String> azureAccountKey) {
            $.azureAccountKey = azureAccountKey;
            return this;
        }

        /**
         * @param azureAccountKey Azure account key.
         * 
         * @return builder
         * 
         */
        public Builder azureAccountKey(String azureAccountKey) {
            return azureAccountKey(Output.of(azureAccountKey));
        }

        /**
         * @param azureAccountName Azure account name.
         * 
         * @return builder
         * 
         */
        public Builder azureAccountName(@Nullable Output<String> azureAccountName) {
            $.azureAccountName = azureAccountName;
            return this;
        }

        /**
         * @param azureAccountName Azure account name.
         * 
         * @return builder
         * 
         */
        public Builder azureAccountName(String azureAccountName) {
            return azureAccountName(Output.of(azureAccountName));
        }

        /**
         * @param azureBlobEnvironment Azure blob environment.
         * 
         * @return builder
         * 
         */
        public Builder azureBlobEnvironment(@Nullable Output<String> azureBlobEnvironment) {
            $.azureBlobEnvironment = azureBlobEnvironment;
            return this;
        }

        /**
         * @param azureBlobEnvironment Azure blob environment.
         * 
         * @return builder
         * 
         */
        public Builder azureBlobEnvironment(String azureBlobEnvironment) {
            return azureBlobEnvironment(Output.of(azureBlobEnvironment));
        }

        /**
         * @param azureContainerName `&lt;required&gt;` - Azure container name to write
         * snapshots to.
         * 
         * @return builder
         * 
         */
        public Builder azureContainerName(@Nullable Output<String> azureContainerName) {
            $.azureContainerName = azureContainerName;
            return this;
        }

        /**
         * @param azureContainerName `&lt;required&gt;` - Azure container name to write
         * snapshots to.
         * 
         * @return builder
         * 
         */
        public Builder azureContainerName(String azureContainerName) {
            return azureContainerName(Output.of(azureContainerName));
        }

        /**
         * @param azureEndpoint Azure blob storage endpoint. This is typically
         * only set when using a non-Azure implementation like Azurite.
         * 
         * @return builder
         * 
         */
        public Builder azureEndpoint(@Nullable Output<String> azureEndpoint) {
            $.azureEndpoint = azureEndpoint;
            return this;
        }

        /**
         * @param azureEndpoint Azure blob storage endpoint. This is typically
         * only set when using a non-Azure implementation like Azurite.
         * 
         * @return builder
         * 
         */
        public Builder azureEndpoint(String azureEndpoint) {
            return azureEndpoint(Output.of(azureEndpoint));
        }

        /**
         * @param filePrefix Within the directory or bucket
         * prefix given by `path_prefix`, the file or object name of snapshot files
         * will start with this string.
         * 
         * @return builder
         * 
         */
        public Builder filePrefix(@Nullable Output<String> filePrefix) {
            $.filePrefix = filePrefix;
            return this;
        }

        /**
         * @param filePrefix Within the directory or bucket
         * prefix given by `path_prefix`, the file or object name of snapshot files
         * will start with this string.
         * 
         * @return builder
         * 
         */
        public Builder filePrefix(String filePrefix) {
            return filePrefix(Output.of(filePrefix));
        }

        /**
         * @param googleDisableTls Disable TLS for the GCS endpoint. This
         * should only be used for testing purposes, typically in conjunction with
         * `google_endpoint`.
         * 
         * @return builder
         * 
         */
        public Builder googleDisableTls(@Nullable Output<Boolean> googleDisableTls) {
            $.googleDisableTls = googleDisableTls;
            return this;
        }

        /**
         * @param googleDisableTls Disable TLS for the GCS endpoint. This
         * should only be used for testing purposes, typically in conjunction with
         * `google_endpoint`.
         * 
         * @return builder
         * 
         */
        public Builder googleDisableTls(Boolean googleDisableTls) {
            return googleDisableTls(Output.of(googleDisableTls));
        }

        /**
         * @param googleEndpoint GCS endpoint. This is typically only set when
         * using a non-Google GCS implementation like fake-gcs-server.
         * 
         * @return builder
         * 
         */
        public Builder googleEndpoint(@Nullable Output<String> googleEndpoint) {
            $.googleEndpoint = googleEndpoint;
            return this;
        }

        /**
         * @param googleEndpoint GCS endpoint. This is typically only set when
         * using a non-Google GCS implementation like fake-gcs-server.
         * 
         * @return builder
         * 
         */
        public Builder googleEndpoint(String googleEndpoint) {
            return googleEndpoint(Output.of(googleEndpoint));
        }

        /**
         * @param googleGcsBucket `&lt;required&gt;` - GCS bucket to write snapshots to.
         * 
         * @return builder
         * 
         */
        public Builder googleGcsBucket(@Nullable Output<String> googleGcsBucket) {
            $.googleGcsBucket = googleGcsBucket;
            return this;
        }

        /**
         * @param googleGcsBucket `&lt;required&gt;` - GCS bucket to write snapshots to.
         * 
         * @return builder
         * 
         */
        public Builder googleGcsBucket(String googleGcsBucket) {
            return googleGcsBucket(Output.of(googleGcsBucket));
        }

        /**
         * @param googleServiceAccountKey Google service account key in JSON format.
         * The raw value looks like this:
         * 
         * @return builder
         * 
         */
        public Builder googleServiceAccountKey(@Nullable Output<String> googleServiceAccountKey) {
            $.googleServiceAccountKey = googleServiceAccountKey;
            return this;
        }

        /**
         * @param googleServiceAccountKey Google service account key in JSON format.
         * The raw value looks like this:
         * 
         * @return builder
         * 
         */
        public Builder googleServiceAccountKey(String googleServiceAccountKey) {
            return googleServiceAccountKey(Output.of(googleServiceAccountKey));
        }

        /**
         * @param intervalSeconds `&lt;required&gt;` - Time (in seconds) between snapshots.
         * 
         * @return builder
         * 
         */
        public Builder intervalSeconds(Output<Integer> intervalSeconds) {
            $.intervalSeconds = intervalSeconds;
            return this;
        }

        /**
         * @param intervalSeconds `&lt;required&gt;` - Time (in seconds) between snapshots.
         * 
         * @return builder
         * 
         */
        public Builder intervalSeconds(Integer intervalSeconds) {
            return intervalSeconds(Output.of(intervalSeconds));
        }

        /**
         * @param localMaxSpace For `storage_type = local`, the maximum
         * space, in bytes, to use for snapshots. Snapshot attempts will fail if there is not enough
         * space left in this allowance.
         * 
         * @return builder
         * 
         */
        public Builder localMaxSpace(@Nullable Output<Integer> localMaxSpace) {
            $.localMaxSpace = localMaxSpace;
            return this;
        }

        /**
         * @param localMaxSpace For `storage_type = local`, the maximum
         * space, in bytes, to use for snapshots. Snapshot attempts will fail if there is not enough
         * space left in this allowance.
         * 
         * @return builder
         * 
         */
        public Builder localMaxSpace(Integer localMaxSpace) {
            return localMaxSpace(Output.of(localMaxSpace));
        }

        /**
         * @param name `&lt;required&gt;` – Name of the configuration to modify.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name `&lt;required&gt;` – Name of the configuration to modify.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pathPrefix `&lt;required&gt;` - For `storage_type = &#34;local&#34;`, the directory to
         * write the snapshots in. For cloud storage types, the bucket prefix to use.
         * Types `azure-s3` and `google-gcs` require a trailing `/` (slash).
         * Types `local` and `aws-s3` the trailing `/` is optional.
         * 
         * @return builder
         * 
         */
        public Builder pathPrefix(Output<String> pathPrefix) {
            $.pathPrefix = pathPrefix;
            return this;
        }

        /**
         * @param pathPrefix `&lt;required&gt;` - For `storage_type = &#34;local&#34;`, the directory to
         * write the snapshots in. For cloud storage types, the bucket prefix to use.
         * Types `azure-s3` and `google-gcs` require a trailing `/` (slash).
         * Types `local` and `aws-s3` the trailing `/` is optional.
         * 
         * @return builder
         * 
         */
        public Builder pathPrefix(String pathPrefix) {
            return pathPrefix(Output.of(pathPrefix));
        }

        /**
         * @param retain How many snapshots are to be kept; when writing a
         * snapshot, if there are more snapshots already stored than this number, the
         * oldest ones will be deleted.
         * 
         * @return builder
         * 
         */
        public Builder retain(@Nullable Output<Integer> retain) {
            $.retain = retain;
            return this;
        }

        /**
         * @param retain How many snapshots are to be kept; when writing a
         * snapshot, if there are more snapshots already stored than this number, the
         * oldest ones will be deleted.
         * 
         * @return builder
         * 
         */
        public Builder retain(Integer retain) {
            return retain(Output.of(retain));
        }

        /**
         * @param storageType `&lt;required&gt;` - One of &#34;local&#34;, &#34;azure-blob&#34;, &#34;aws-s3&#34;,
         * or &#34;google-gcs&#34;. The remaining parameters described below are all specific to
         * the selected `storage_type` and prefixed accordingly.
         * 
         * @return builder
         * 
         */
        public Builder storageType(Output<String> storageType) {
            $.storageType = storageType;
            return this;
        }

        /**
         * @param storageType `&lt;required&gt;` - One of &#34;local&#34;, &#34;azure-blob&#34;, &#34;aws-s3&#34;,
         * or &#34;google-gcs&#34;. The remaining parameters described below are all specific to
         * the selected `storage_type` and prefixed accordingly.
         * 
         * @return builder
         * 
         */
        public Builder storageType(String storageType) {
            return storageType(Output.of(storageType));
        }

        public RaftSnapshotAgentConfigArgs build() {
            $.intervalSeconds = Objects.requireNonNull($.intervalSeconds, "expected parameter 'intervalSeconds' to be non-null");
            $.pathPrefix = Objects.requireNonNull($.pathPrefix, "expected parameter 'pathPrefix' to be non-null");
            $.storageType = Objects.requireNonNull($.storageType, "expected parameter 'storageType' to be non-null");
            return $;
        }
    }

}
