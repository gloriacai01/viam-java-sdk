// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/error_reason.proto

package com.google.api;

/**
 * <pre>
 * Defines the supported values for `google.rpc.ErrorInfo.reason` for the
 * `googleapis.com` error domain. This error domain is reserved for [Service
 * Infrastructure](https://cloud.google.com/service-infrastructure/docs/overview).
 * For each error info of this domain, the metadata key "service" refers to the
 * logical identifier of an API service, such as "pubsub.googleapis.com". The
 * "consumer" refers to the entity that consumes an API Service. It typically is
 * a Google project that owns the client application or the server resource,
 * such as "projects/123". Other metadata keys are specific to each error
 * reason. For more information, see the definition of the specific error
 * reason.
 * </pre>
 *
 * Protobuf enum {@code google.api.ErrorReason}
 */
public enum ErrorReason
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Do not use this default value.
   * </pre>
   *
   * <code>ERROR_REASON_UNSPECIFIED = 0;</code>
   */
  ERROR_REASON_UNSPECIFIED(0),
  /**
   * <pre>
   * The request is calling a disabled service for a consumer.
   * Example of an ErrorInfo when the consumer "projects/123" contacting
   * "pubsub.googleapis.com" service which is disabled:
   *     { "reason": "SERVICE_DISABLED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "pubsub.googleapis.com"
   *       }
   *     }
   * This response indicates the "pubsub.googleapis.com" has been disabled in
   * "projects/123".
   * </pre>
   *
   * <code>SERVICE_DISABLED = 1;</code>
   */
  SERVICE_DISABLED(1),
  /**
   * <pre>
   * The request whose associated billing account is disabled.
   * Example of an ErrorInfo when the consumer "projects/123" fails to contact
   * "pubsub.googleapis.com" service because the associated billing account is
   * disabled:
   *     { "reason": "BILLING_DISABLED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "pubsub.googleapis.com"
   *       }
   *     }
   * This response indicates the billing account associated has been disabled.
   * </pre>
   *
   * <code>BILLING_DISABLED = 2;</code>
   */
  BILLING_DISABLED(2),
  /**
   * <pre>
   * The request is denied because the provided [API
   * key](https://cloud.google.com/docs/authentication/api-keys) is invalid. It
   * may be in a bad format, cannot be found, or has been expired).
   * Example of an ErrorInfo when the request is contacting
   * "storage.googleapis.com" service with an invalid API key:
   *     { "reason": "API_KEY_INVALID",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "service": "storage.googleapis.com",
   *       }
   *     }
   * </pre>
   *
   * <code>API_KEY_INVALID = 3;</code>
   */
  API_KEY_INVALID(3),
  /**
   * <pre>
   * The request is denied because it violates [API key API
   * restrictions](https://cloud.google.com/docs/authentication/api-keys#adding_api_restrictions).
   * Example of an ErrorInfo when the consumer "projects/123" fails to call the
   * "storage.googleapis.com" service because this service is restricted in the
   * API key:
   *     { "reason": "API_KEY_SERVICE_BLOCKED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com"
   *       }
   *     }
   * </pre>
   *
   * <code>API_KEY_SERVICE_BLOCKED = 4;</code>
   */
  API_KEY_SERVICE_BLOCKED(4),
  /**
   * <pre>
   * The request is denied because it violates [API key HTTP
   * restrictions](https://cloud.google.com/docs/authentication/api-keys#adding_http_restrictions).
   * Example of an ErrorInfo when the consumer "projects/123" fails to call
   * "storage.googleapis.com" service because the http referrer of the request
   * violates API key HTTP restrictions:
   *     { "reason": "API_KEY_HTTP_REFERRER_BLOCKED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com",
   *       }
   *     }
   * </pre>
   *
   * <code>API_KEY_HTTP_REFERRER_BLOCKED = 7;</code>
   */
  API_KEY_HTTP_REFERRER_BLOCKED(7),
  /**
   * <pre>
   * The request is denied because it violates [API key IP address
   * restrictions](https://cloud.google.com/docs/authentication/api-keys#adding_application_restrictions).
   * Example of an ErrorInfo when the consumer "projects/123" fails to call
   * "storage.googleapis.com" service because the caller IP of the request
   * violates API key IP address restrictions:
   *     { "reason": "API_KEY_IP_ADDRESS_BLOCKED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com",
   *       }
   *     }
   * </pre>
   *
   * <code>API_KEY_IP_ADDRESS_BLOCKED = 8;</code>
   */
  API_KEY_IP_ADDRESS_BLOCKED(8),
  /**
   * <pre>
   * The request is denied because it violates [API key Android application
   * restrictions](https://cloud.google.com/docs/authentication/api-keys#adding_application_restrictions).
   * Example of an ErrorInfo when the consumer "projects/123" fails to call
   * "storage.googleapis.com" service because the request from the Android apps
   * violates the API key Android application restrictions:
   *     { "reason": "API_KEY_ANDROID_APP_BLOCKED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com"
   *       }
   *     }
   * </pre>
   *
   * <code>API_KEY_ANDROID_APP_BLOCKED = 9;</code>
   */
  API_KEY_ANDROID_APP_BLOCKED(9),
  /**
   * <pre>
   * The request is denied because it violates [API key iOS application
   * restrictions](https://cloud.google.com/docs/authentication/api-keys#adding_application_restrictions).
   * Example of an ErrorInfo when the consumer "projects/123" fails to call
   * "storage.googleapis.com" service because the request from the iOS apps
   * violates the API key iOS application restrictions:
   *     { "reason": "API_KEY_IOS_APP_BLOCKED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com"
   *       }
   *     }
   * </pre>
   *
   * <code>API_KEY_IOS_APP_BLOCKED = 13;</code>
   */
  API_KEY_IOS_APP_BLOCKED(13),
  /**
   * <pre>
   * The request is denied because there is not enough rate quota for the
   * consumer.
   * Example of an ErrorInfo when the consumer "projects/123" fails to contact
   * "pubsub.googleapis.com" service because consumer's rate quota usage has
   * reached the maximum value set for the quota limit
   * "ReadsPerMinutePerProject" on the quota metric
   * "pubsub.googleapis.com/read_requests":
   *     { "reason": "RATE_LIMIT_EXCEEDED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "pubsub.googleapis.com",
   *         "quota_metric": "pubsub.googleapis.com/read_requests",
   *         "quota_limit": "ReadsPerMinutePerProject"
   *       }
   *     }
   * Example of an ErrorInfo when the consumer "projects/123" checks quota on
   * the service "dataflow.googleapis.com" and hits the organization quota
   * limit "DefaultRequestsPerMinutePerOrganization" on the metric
   * "dataflow.googleapis.com/default_requests".
   *     { "reason": "RATE_LIMIT_EXCEEDED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "dataflow.googleapis.com",
   *         "quota_metric": "dataflow.googleapis.com/default_requests",
   *         "quota_limit": "DefaultRequestsPerMinutePerOrganization"
   *       }
   *     }
   * </pre>
   *
   * <code>RATE_LIMIT_EXCEEDED = 5;</code>
   */
  RATE_LIMIT_EXCEEDED(5),
  /**
   * <pre>
   * The request is denied because there is not enough resource quota for the
   * consumer.
   * Example of an ErrorInfo when the consumer "projects/123" fails to contact
   * "compute.googleapis.com" service because consumer's resource quota usage
   * has reached the maximum value set for the quota limit "VMsPerProject"
   * on the quota metric "compute.googleapis.com/vms":
   *     { "reason": "RESOURCE_QUOTA_EXCEEDED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "compute.googleapis.com",
   *         "quota_metric": "compute.googleapis.com/vms",
   *         "quota_limit": "VMsPerProject"
   *       }
   *     }
   * Example of an ErrorInfo when the consumer "projects/123" checks resource
   * quota on the service "dataflow.googleapis.com" and hits the organization
   * quota limit "jobs-per-organization" on the metric
   * "dataflow.googleapis.com/job_count".
   *     { "reason": "RESOURCE_QUOTA_EXCEEDED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "dataflow.googleapis.com",
   *         "quota_metric": "dataflow.googleapis.com/job_count",
   *         "quota_limit": "jobs-per-organization"
   *       }
   *     }
   * </pre>
   *
   * <code>RESOURCE_QUOTA_EXCEEDED = 6;</code>
   */
  RESOURCE_QUOTA_EXCEEDED(6),
  /**
   * <pre>
   * The request whose associated billing account address is in a tax restricted
   * location, violates the local tax restrictions when creating resources in
   * the restricted region.
   * Example of an ErrorInfo when creating the Cloud Storage Bucket in the
   * container "projects/123" under a tax restricted region
   * "locations/asia-northeast3":
   *     { "reason": "LOCATION_TAX_POLICY_VIOLATED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com",
   *         "location": "locations/asia-northeast3"
   *       }
   *     }
   * This response indicates creating the Cloud Storage Bucket in
   * "locations/asia-northeast3" violates the location tax restriction.
   * </pre>
   *
   * <code>LOCATION_TAX_POLICY_VIOLATED = 10;</code>
   */
  LOCATION_TAX_POLICY_VIOLATED(10),
  /**
   * <pre>
   * The request is denied because the caller does not have required permission
   * on the user project "projects/123" or the user project is invalid. For more
   * information, check the [userProject System
   * Parameters](https://cloud.google.com/apis/docs/system-parameters).
   * Example of an ErrorInfo when the caller is calling Cloud Storage service
   * with insufficient permissions on the user project:
   *     { "reason": "USER_PROJECT_DENIED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com"
   *       }
   *     }
   * </pre>
   *
   * <code>USER_PROJECT_DENIED = 11;</code>
   */
  USER_PROJECT_DENIED(11),
  /**
   * <pre>
   * The request is denied because the consumer "projects/123" is suspended due
   * to Terms of Service(Tos) violations. Check [Project suspension
   * guidelines](https://cloud.google.com/resource-manager/docs/project-suspension-guidelines)
   * for more information.
   * Example of an ErrorInfo when calling Cloud Storage service with the
   * suspended consumer "projects/123":
   *     { "reason": "CONSUMER_SUSPENDED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com"
   *       }
   *     }
   * </pre>
   *
   * <code>CONSUMER_SUSPENDED = 12;</code>
   */
  CONSUMER_SUSPENDED(12),
  /**
   * <pre>
   * The request is denied because the associated consumer is invalid. It may be
   * in a bad format, cannot be found, or have been deleted.
   * Example of an ErrorInfo when calling Cloud Storage service with the
   * invalid consumer "projects/123":
   *     { "reason": "CONSUMER_INVALID",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com"
   *       }
   *     }
   * </pre>
   *
   * <code>CONSUMER_INVALID = 14;</code>
   */
  CONSUMER_INVALID(14),
  /**
   * <pre>
   * The request is denied because it violates [VPC Service
   * Controls](https://cloud.google.com/vpc-service-controls/docs/overview).
   * The 'uid' field is a random generated identifier that customer can use it
   * to search the audit log for a request rejected by VPC Service Controls. For
   * more information, please refer [VPC Service Controls
   * Troubleshooting](https://cloud.google.com/vpc-service-controls/docs/troubleshooting#unique-id)
   * Example of an ErrorInfo when the consumer "projects/123" fails to call
   * Cloud Storage service because the request is prohibited by the VPC Service
   * Controls.
   *     { "reason": "SECURITY_POLICY_VIOLATED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "uid": "123456789abcde",
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com"
   *       }
   *     }
   * </pre>
   *
   * <code>SECURITY_POLICY_VIOLATED = 15;</code>
   */
  SECURITY_POLICY_VIOLATED(15),
  /**
   * <pre>
   * The request is denied because the provided access token has expired.
   * Example of an ErrorInfo when the request is calling Cloud Storage service
   * with an expired access token:
   *     { "reason": "ACCESS_TOKEN_EXPIRED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "service": "storage.googleapis.com",
   *         "method": "google.storage.v1.Storage.GetObject"
   *       }
   *     }
   * </pre>
   *
   * <code>ACCESS_TOKEN_EXPIRED = 16;</code>
   */
  ACCESS_TOKEN_EXPIRED(16),
  /**
   * <pre>
   * The request is denied because the provided access token doesn't have at
   * least one of the acceptable scopes required for the API. Please check
   * [OAuth 2.0 Scopes for Google
   * APIs](https://developers.google.com/identity/protocols/oauth2/scopes) for
   * the list of the OAuth 2.0 scopes that you might need to request to access
   * the API.
   * Example of an ErrorInfo when the request is calling Cloud Storage service
   * with an access token that is missing required scopes:
   *     { "reason": "ACCESS_TOKEN_SCOPE_INSUFFICIENT",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "service": "storage.googleapis.com",
   *         "method": "google.storage.v1.Storage.GetObject"
   *       }
   *     }
   * </pre>
   *
   * <code>ACCESS_TOKEN_SCOPE_INSUFFICIENT = 17;</code>
   */
  ACCESS_TOKEN_SCOPE_INSUFFICIENT(17),
  /**
   * <pre>
   * The request is denied because the account associated with the provided
   * access token is in an invalid state, such as disabled or deleted.
   * For more information, see https://cloud.google.com/docs/authentication.
   * Warning: For privacy reasons, the server may not be able to disclose the
   * email address for some accounts. The client MUST NOT depend on the
   * availability of the `email` attribute.
   * Example of an ErrorInfo when the request is to the Cloud Storage API with
   * an access token that is associated with a disabled or deleted [service
   * account](http://cloud/iam/docs/service-accounts):
   *     { "reason": "ACCOUNT_STATE_INVALID",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "service": "storage.googleapis.com",
   *         "method": "google.storage.v1.Storage.GetObject",
   *         "email": "user&#64;123.iam.gserviceaccount.com"
   *       }
   *     }
   * </pre>
   *
   * <code>ACCOUNT_STATE_INVALID = 18;</code>
   */
  ACCOUNT_STATE_INVALID(18),
  /**
   * <pre>
   * The request is denied because the type of the provided access token is not
   * supported by the API being called.
   * Example of an ErrorInfo when the request is to the Cloud Storage API with
   * an unsupported token type.
   *     { "reason": "ACCESS_TOKEN_TYPE_UNSUPPORTED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "service": "storage.googleapis.com",
   *         "method": "google.storage.v1.Storage.GetObject"
   *       }
   *     }
   * </pre>
   *
   * <code>ACCESS_TOKEN_TYPE_UNSUPPORTED = 19;</code>
   */
  ACCESS_TOKEN_TYPE_UNSUPPORTED(19),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Do not use this default value.
   * </pre>
   *
   * <code>ERROR_REASON_UNSPECIFIED = 0;</code>
   */
  public static final int ERROR_REASON_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * The request is calling a disabled service for a consumer.
   * Example of an ErrorInfo when the consumer "projects/123" contacting
   * "pubsub.googleapis.com" service which is disabled:
   *     { "reason": "SERVICE_DISABLED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "pubsub.googleapis.com"
   *       }
   *     }
   * This response indicates the "pubsub.googleapis.com" has been disabled in
   * "projects/123".
   * </pre>
   *
   * <code>SERVICE_DISABLED = 1;</code>
   */
  public static final int SERVICE_DISABLED_VALUE = 1;
  /**
   * <pre>
   * The request whose associated billing account is disabled.
   * Example of an ErrorInfo when the consumer "projects/123" fails to contact
   * "pubsub.googleapis.com" service because the associated billing account is
   * disabled:
   *     { "reason": "BILLING_DISABLED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "pubsub.googleapis.com"
   *       }
   *     }
   * This response indicates the billing account associated has been disabled.
   * </pre>
   *
   * <code>BILLING_DISABLED = 2;</code>
   */
  public static final int BILLING_DISABLED_VALUE = 2;
  /**
   * <pre>
   * The request is denied because the provided [API
   * key](https://cloud.google.com/docs/authentication/api-keys) is invalid. It
   * may be in a bad format, cannot be found, or has been expired).
   * Example of an ErrorInfo when the request is contacting
   * "storage.googleapis.com" service with an invalid API key:
   *     { "reason": "API_KEY_INVALID",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "service": "storage.googleapis.com",
   *       }
   *     }
   * </pre>
   *
   * <code>API_KEY_INVALID = 3;</code>
   */
  public static final int API_KEY_INVALID_VALUE = 3;
  /**
   * <pre>
   * The request is denied because it violates [API key API
   * restrictions](https://cloud.google.com/docs/authentication/api-keys#adding_api_restrictions).
   * Example of an ErrorInfo when the consumer "projects/123" fails to call the
   * "storage.googleapis.com" service because this service is restricted in the
   * API key:
   *     { "reason": "API_KEY_SERVICE_BLOCKED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com"
   *       }
   *     }
   * </pre>
   *
   * <code>API_KEY_SERVICE_BLOCKED = 4;</code>
   */
  public static final int API_KEY_SERVICE_BLOCKED_VALUE = 4;
  /**
   * <pre>
   * The request is denied because it violates [API key HTTP
   * restrictions](https://cloud.google.com/docs/authentication/api-keys#adding_http_restrictions).
   * Example of an ErrorInfo when the consumer "projects/123" fails to call
   * "storage.googleapis.com" service because the http referrer of the request
   * violates API key HTTP restrictions:
   *     { "reason": "API_KEY_HTTP_REFERRER_BLOCKED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com",
   *       }
   *     }
   * </pre>
   *
   * <code>API_KEY_HTTP_REFERRER_BLOCKED = 7;</code>
   */
  public static final int API_KEY_HTTP_REFERRER_BLOCKED_VALUE = 7;
  /**
   * <pre>
   * The request is denied because it violates [API key IP address
   * restrictions](https://cloud.google.com/docs/authentication/api-keys#adding_application_restrictions).
   * Example of an ErrorInfo when the consumer "projects/123" fails to call
   * "storage.googleapis.com" service because the caller IP of the request
   * violates API key IP address restrictions:
   *     { "reason": "API_KEY_IP_ADDRESS_BLOCKED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com",
   *       }
   *     }
   * </pre>
   *
   * <code>API_KEY_IP_ADDRESS_BLOCKED = 8;</code>
   */
  public static final int API_KEY_IP_ADDRESS_BLOCKED_VALUE = 8;
  /**
   * <pre>
   * The request is denied because it violates [API key Android application
   * restrictions](https://cloud.google.com/docs/authentication/api-keys#adding_application_restrictions).
   * Example of an ErrorInfo when the consumer "projects/123" fails to call
   * "storage.googleapis.com" service because the request from the Android apps
   * violates the API key Android application restrictions:
   *     { "reason": "API_KEY_ANDROID_APP_BLOCKED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com"
   *       }
   *     }
   * </pre>
   *
   * <code>API_KEY_ANDROID_APP_BLOCKED = 9;</code>
   */
  public static final int API_KEY_ANDROID_APP_BLOCKED_VALUE = 9;
  /**
   * <pre>
   * The request is denied because it violates [API key iOS application
   * restrictions](https://cloud.google.com/docs/authentication/api-keys#adding_application_restrictions).
   * Example of an ErrorInfo when the consumer "projects/123" fails to call
   * "storage.googleapis.com" service because the request from the iOS apps
   * violates the API key iOS application restrictions:
   *     { "reason": "API_KEY_IOS_APP_BLOCKED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com"
   *       }
   *     }
   * </pre>
   *
   * <code>API_KEY_IOS_APP_BLOCKED = 13;</code>
   */
  public static final int API_KEY_IOS_APP_BLOCKED_VALUE = 13;
  /**
   * <pre>
   * The request is denied because there is not enough rate quota for the
   * consumer.
   * Example of an ErrorInfo when the consumer "projects/123" fails to contact
   * "pubsub.googleapis.com" service because consumer's rate quota usage has
   * reached the maximum value set for the quota limit
   * "ReadsPerMinutePerProject" on the quota metric
   * "pubsub.googleapis.com/read_requests":
   *     { "reason": "RATE_LIMIT_EXCEEDED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "pubsub.googleapis.com",
   *         "quota_metric": "pubsub.googleapis.com/read_requests",
   *         "quota_limit": "ReadsPerMinutePerProject"
   *       }
   *     }
   * Example of an ErrorInfo when the consumer "projects/123" checks quota on
   * the service "dataflow.googleapis.com" and hits the organization quota
   * limit "DefaultRequestsPerMinutePerOrganization" on the metric
   * "dataflow.googleapis.com/default_requests".
   *     { "reason": "RATE_LIMIT_EXCEEDED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "dataflow.googleapis.com",
   *         "quota_metric": "dataflow.googleapis.com/default_requests",
   *         "quota_limit": "DefaultRequestsPerMinutePerOrganization"
   *       }
   *     }
   * </pre>
   *
   * <code>RATE_LIMIT_EXCEEDED = 5;</code>
   */
  public static final int RATE_LIMIT_EXCEEDED_VALUE = 5;
  /**
   * <pre>
   * The request is denied because there is not enough resource quota for the
   * consumer.
   * Example of an ErrorInfo when the consumer "projects/123" fails to contact
   * "compute.googleapis.com" service because consumer's resource quota usage
   * has reached the maximum value set for the quota limit "VMsPerProject"
   * on the quota metric "compute.googleapis.com/vms":
   *     { "reason": "RESOURCE_QUOTA_EXCEEDED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "compute.googleapis.com",
   *         "quota_metric": "compute.googleapis.com/vms",
   *         "quota_limit": "VMsPerProject"
   *       }
   *     }
   * Example of an ErrorInfo when the consumer "projects/123" checks resource
   * quota on the service "dataflow.googleapis.com" and hits the organization
   * quota limit "jobs-per-organization" on the metric
   * "dataflow.googleapis.com/job_count".
   *     { "reason": "RESOURCE_QUOTA_EXCEEDED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "dataflow.googleapis.com",
   *         "quota_metric": "dataflow.googleapis.com/job_count",
   *         "quota_limit": "jobs-per-organization"
   *       }
   *     }
   * </pre>
   *
   * <code>RESOURCE_QUOTA_EXCEEDED = 6;</code>
   */
  public static final int RESOURCE_QUOTA_EXCEEDED_VALUE = 6;
  /**
   * <pre>
   * The request whose associated billing account address is in a tax restricted
   * location, violates the local tax restrictions when creating resources in
   * the restricted region.
   * Example of an ErrorInfo when creating the Cloud Storage Bucket in the
   * container "projects/123" under a tax restricted region
   * "locations/asia-northeast3":
   *     { "reason": "LOCATION_TAX_POLICY_VIOLATED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com",
   *         "location": "locations/asia-northeast3"
   *       }
   *     }
   * This response indicates creating the Cloud Storage Bucket in
   * "locations/asia-northeast3" violates the location tax restriction.
   * </pre>
   *
   * <code>LOCATION_TAX_POLICY_VIOLATED = 10;</code>
   */
  public static final int LOCATION_TAX_POLICY_VIOLATED_VALUE = 10;
  /**
   * <pre>
   * The request is denied because the caller does not have required permission
   * on the user project "projects/123" or the user project is invalid. For more
   * information, check the [userProject System
   * Parameters](https://cloud.google.com/apis/docs/system-parameters).
   * Example of an ErrorInfo when the caller is calling Cloud Storage service
   * with insufficient permissions on the user project:
   *     { "reason": "USER_PROJECT_DENIED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com"
   *       }
   *     }
   * </pre>
   *
   * <code>USER_PROJECT_DENIED = 11;</code>
   */
  public static final int USER_PROJECT_DENIED_VALUE = 11;
  /**
   * <pre>
   * The request is denied because the consumer "projects/123" is suspended due
   * to Terms of Service(Tos) violations. Check [Project suspension
   * guidelines](https://cloud.google.com/resource-manager/docs/project-suspension-guidelines)
   * for more information.
   * Example of an ErrorInfo when calling Cloud Storage service with the
   * suspended consumer "projects/123":
   *     { "reason": "CONSUMER_SUSPENDED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com"
   *       }
   *     }
   * </pre>
   *
   * <code>CONSUMER_SUSPENDED = 12;</code>
   */
  public static final int CONSUMER_SUSPENDED_VALUE = 12;
  /**
   * <pre>
   * The request is denied because the associated consumer is invalid. It may be
   * in a bad format, cannot be found, or have been deleted.
   * Example of an ErrorInfo when calling Cloud Storage service with the
   * invalid consumer "projects/123":
   *     { "reason": "CONSUMER_INVALID",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com"
   *       }
   *     }
   * </pre>
   *
   * <code>CONSUMER_INVALID = 14;</code>
   */
  public static final int CONSUMER_INVALID_VALUE = 14;
  /**
   * <pre>
   * The request is denied because it violates [VPC Service
   * Controls](https://cloud.google.com/vpc-service-controls/docs/overview).
   * The 'uid' field is a random generated identifier that customer can use it
   * to search the audit log for a request rejected by VPC Service Controls. For
   * more information, please refer [VPC Service Controls
   * Troubleshooting](https://cloud.google.com/vpc-service-controls/docs/troubleshooting#unique-id)
   * Example of an ErrorInfo when the consumer "projects/123" fails to call
   * Cloud Storage service because the request is prohibited by the VPC Service
   * Controls.
   *     { "reason": "SECURITY_POLICY_VIOLATED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "uid": "123456789abcde",
   *         "consumer": "projects/123",
   *         "service": "storage.googleapis.com"
   *       }
   *     }
   * </pre>
   *
   * <code>SECURITY_POLICY_VIOLATED = 15;</code>
   */
  public static final int SECURITY_POLICY_VIOLATED_VALUE = 15;
  /**
   * <pre>
   * The request is denied because the provided access token has expired.
   * Example of an ErrorInfo when the request is calling Cloud Storage service
   * with an expired access token:
   *     { "reason": "ACCESS_TOKEN_EXPIRED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "service": "storage.googleapis.com",
   *         "method": "google.storage.v1.Storage.GetObject"
   *       }
   *     }
   * </pre>
   *
   * <code>ACCESS_TOKEN_EXPIRED = 16;</code>
   */
  public static final int ACCESS_TOKEN_EXPIRED_VALUE = 16;
  /**
   * <pre>
   * The request is denied because the provided access token doesn't have at
   * least one of the acceptable scopes required for the API. Please check
   * [OAuth 2.0 Scopes for Google
   * APIs](https://developers.google.com/identity/protocols/oauth2/scopes) for
   * the list of the OAuth 2.0 scopes that you might need to request to access
   * the API.
   * Example of an ErrorInfo when the request is calling Cloud Storage service
   * with an access token that is missing required scopes:
   *     { "reason": "ACCESS_TOKEN_SCOPE_INSUFFICIENT",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "service": "storage.googleapis.com",
   *         "method": "google.storage.v1.Storage.GetObject"
   *       }
   *     }
   * </pre>
   *
   * <code>ACCESS_TOKEN_SCOPE_INSUFFICIENT = 17;</code>
   */
  public static final int ACCESS_TOKEN_SCOPE_INSUFFICIENT_VALUE = 17;
  /**
   * <pre>
   * The request is denied because the account associated with the provided
   * access token is in an invalid state, such as disabled or deleted.
   * For more information, see https://cloud.google.com/docs/authentication.
   * Warning: For privacy reasons, the server may not be able to disclose the
   * email address for some accounts. The client MUST NOT depend on the
   * availability of the `email` attribute.
   * Example of an ErrorInfo when the request is to the Cloud Storage API with
   * an access token that is associated with a disabled or deleted [service
   * account](http://cloud/iam/docs/service-accounts):
   *     { "reason": "ACCOUNT_STATE_INVALID",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "service": "storage.googleapis.com",
   *         "method": "google.storage.v1.Storage.GetObject",
   *         "email": "user&#64;123.iam.gserviceaccount.com"
   *       }
   *     }
   * </pre>
   *
   * <code>ACCOUNT_STATE_INVALID = 18;</code>
   */
  public static final int ACCOUNT_STATE_INVALID_VALUE = 18;
  /**
   * <pre>
   * The request is denied because the type of the provided access token is not
   * supported by the API being called.
   * Example of an ErrorInfo when the request is to the Cloud Storage API with
   * an unsupported token type.
   *     { "reason": "ACCESS_TOKEN_TYPE_UNSUPPORTED",
   *       "domain": "googleapis.com",
   *       "metadata": {
   *         "service": "storage.googleapis.com",
   *         "method": "google.storage.v1.Storage.GetObject"
   *       }
   *     }
   * </pre>
   *
   * <code>ACCESS_TOKEN_TYPE_UNSUPPORTED = 19;</code>
   */
  public static final int ACCESS_TOKEN_TYPE_UNSUPPORTED_VALUE = 19;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ErrorReason valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ErrorReason forNumber(int value) {
    switch (value) {
      case 0: return ERROR_REASON_UNSPECIFIED;
      case 1: return SERVICE_DISABLED;
      case 2: return BILLING_DISABLED;
      case 3: return API_KEY_INVALID;
      case 4: return API_KEY_SERVICE_BLOCKED;
      case 7: return API_KEY_HTTP_REFERRER_BLOCKED;
      case 8: return API_KEY_IP_ADDRESS_BLOCKED;
      case 9: return API_KEY_ANDROID_APP_BLOCKED;
      case 13: return API_KEY_IOS_APP_BLOCKED;
      case 5: return RATE_LIMIT_EXCEEDED;
      case 6: return RESOURCE_QUOTA_EXCEEDED;
      case 10: return LOCATION_TAX_POLICY_VIOLATED;
      case 11: return USER_PROJECT_DENIED;
      case 12: return CONSUMER_SUSPENDED;
      case 14: return CONSUMER_INVALID;
      case 15: return SECURITY_POLICY_VIOLATED;
      case 16: return ACCESS_TOKEN_EXPIRED;
      case 17: return ACCESS_TOKEN_SCOPE_INSUFFICIENT;
      case 18: return ACCOUNT_STATE_INVALID;
      case 19: return ACCESS_TOKEN_TYPE_UNSUPPORTED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ErrorReason>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ErrorReason> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ErrorReason>() {
          public ErrorReason findValueByNumber(int number) {
            return ErrorReason.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.api.ErrorReasonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ErrorReason[] VALUES = values();

  public static ErrorReason valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ErrorReason(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.api.ErrorReason)
}

