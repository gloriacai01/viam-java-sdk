// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicecontrol/v1/quota_controller.proto

package com.google.api.servicecontrol.v1;

public interface AllocateQuotaResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicecontrol.v1.AllocateQuotaResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The same operation_id value used in the AllocateQuotaRequest. Used for
   * logging and diagnostics purposes.
   * </pre>
   *
   * <code>string operation_id = 1 [json_name = "operationId"];</code>
   * @return The operationId.
   */
  java.lang.String getOperationId();
  /**
   * <pre>
   * The same operation_id value used in the AllocateQuotaRequest. Used for
   * logging and diagnostics purposes.
   * </pre>
   *
   * <code>string operation_id = 1 [json_name = "operationId"];</code>
   * @return The bytes for operationId.
   */
  com.google.protobuf.ByteString
      getOperationIdBytes();

  /**
   * <pre>
   * Indicates the decision of the allocate.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.QuotaError allocate_errors = 2 [json_name = "allocateErrors"];</code>
   */
  java.util.List<com.google.api.servicecontrol.v1.QuotaError> 
      getAllocateErrorsList();
  /**
   * <pre>
   * Indicates the decision of the allocate.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.QuotaError allocate_errors = 2 [json_name = "allocateErrors"];</code>
   */
  com.google.api.servicecontrol.v1.QuotaError getAllocateErrors(int index);
  /**
   * <pre>
   * Indicates the decision of the allocate.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.QuotaError allocate_errors = 2 [json_name = "allocateErrors"];</code>
   */
  int getAllocateErrorsCount();
  /**
   * <pre>
   * Indicates the decision of the allocate.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.QuotaError allocate_errors = 2 [json_name = "allocateErrors"];</code>
   */
  java.util.List<? extends com.google.api.servicecontrol.v1.QuotaErrorOrBuilder> 
      getAllocateErrorsOrBuilderList();
  /**
   * <pre>
   * Indicates the decision of the allocate.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.QuotaError allocate_errors = 2 [json_name = "allocateErrors"];</code>
   */
  com.google.api.servicecontrol.v1.QuotaErrorOrBuilder getAllocateErrorsOrBuilder(
      int index);

  /**
   * <pre>
   * Quota metrics to indicate the result of allocation. Depending on the
   * request, one or more of the following metrics will be included:
   * 1. Per quota group or per quota metric incremental usage will be specified
   * using the following delta metric :
   *   "serviceruntime.googleapis.com/api/consumer/quota_used_count"
   * 2. The quota limit reached condition will be specified using the following
   * boolean metric :
   *   "serviceruntime.googleapis.com/quota/exceeded"
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.MetricValueSet quota_metrics = 3 [json_name = "quotaMetrics"];</code>
   */
  java.util.List<com.google.api.servicecontrol.v1.MetricValueSet> 
      getQuotaMetricsList();
  /**
   * <pre>
   * Quota metrics to indicate the result of allocation. Depending on the
   * request, one or more of the following metrics will be included:
   * 1. Per quota group or per quota metric incremental usage will be specified
   * using the following delta metric :
   *   "serviceruntime.googleapis.com/api/consumer/quota_used_count"
   * 2. The quota limit reached condition will be specified using the following
   * boolean metric :
   *   "serviceruntime.googleapis.com/quota/exceeded"
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.MetricValueSet quota_metrics = 3 [json_name = "quotaMetrics"];</code>
   */
  com.google.api.servicecontrol.v1.MetricValueSet getQuotaMetrics(int index);
  /**
   * <pre>
   * Quota metrics to indicate the result of allocation. Depending on the
   * request, one or more of the following metrics will be included:
   * 1. Per quota group or per quota metric incremental usage will be specified
   * using the following delta metric :
   *   "serviceruntime.googleapis.com/api/consumer/quota_used_count"
   * 2. The quota limit reached condition will be specified using the following
   * boolean metric :
   *   "serviceruntime.googleapis.com/quota/exceeded"
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.MetricValueSet quota_metrics = 3 [json_name = "quotaMetrics"];</code>
   */
  int getQuotaMetricsCount();
  /**
   * <pre>
   * Quota metrics to indicate the result of allocation. Depending on the
   * request, one or more of the following metrics will be included:
   * 1. Per quota group or per quota metric incremental usage will be specified
   * using the following delta metric :
   *   "serviceruntime.googleapis.com/api/consumer/quota_used_count"
   * 2. The quota limit reached condition will be specified using the following
   * boolean metric :
   *   "serviceruntime.googleapis.com/quota/exceeded"
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.MetricValueSet quota_metrics = 3 [json_name = "quotaMetrics"];</code>
   */
  java.util.List<? extends com.google.api.servicecontrol.v1.MetricValueSetOrBuilder> 
      getQuotaMetricsOrBuilderList();
  /**
   * <pre>
   * Quota metrics to indicate the result of allocation. Depending on the
   * request, one or more of the following metrics will be included:
   * 1. Per quota group or per quota metric incremental usage will be specified
   * using the following delta metric :
   *   "serviceruntime.googleapis.com/api/consumer/quota_used_count"
   * 2. The quota limit reached condition will be specified using the following
   * boolean metric :
   *   "serviceruntime.googleapis.com/quota/exceeded"
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.MetricValueSet quota_metrics = 3 [json_name = "quotaMetrics"];</code>
   */
  com.google.api.servicecontrol.v1.MetricValueSetOrBuilder getQuotaMetricsOrBuilder(
      int index);

  /**
   * <pre>
   * ID of the actual config used to process the request.
   * </pre>
   *
   * <code>string service_config_id = 4 [json_name = "serviceConfigId"];</code>
   * @return The serviceConfigId.
   */
  java.lang.String getServiceConfigId();
  /**
   * <pre>
   * ID of the actual config used to process the request.
   * </pre>
   *
   * <code>string service_config_id = 4 [json_name = "serviceConfigId"];</code>
   * @return The bytes for serviceConfigId.
   */
  com.google.protobuf.ByteString
      getServiceConfigIdBytes();
}
