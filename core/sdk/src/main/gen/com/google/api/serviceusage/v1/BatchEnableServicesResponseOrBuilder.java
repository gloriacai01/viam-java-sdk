// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/serviceusage/v1/serviceusage.proto

package com.google.api.serviceusage.v1;

public interface BatchEnableServicesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1.BatchEnableServicesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The new state of the services after enabling.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1 [json_name = "services"];</code>
   */
  java.util.List<com.google.api.serviceusage.v1.Service> 
      getServicesList();
  /**
   * <pre>
   * The new state of the services after enabling.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1 [json_name = "services"];</code>
   */
  com.google.api.serviceusage.v1.Service getServices(int index);
  /**
   * <pre>
   * The new state of the services after enabling.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1 [json_name = "services"];</code>
   */
  int getServicesCount();
  /**
   * <pre>
   * The new state of the services after enabling.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1 [json_name = "services"];</code>
   */
  java.util.List<? extends com.google.api.serviceusage.v1.ServiceOrBuilder> 
      getServicesOrBuilderList();
  /**
   * <pre>
   * The new state of the services after enabling.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1 [json_name = "services"];</code>
   */
  com.google.api.serviceusage.v1.ServiceOrBuilder getServicesOrBuilder(
      int index);

  /**
   * <pre>
   * If allow_partial_success is true, and one or more services could not be
   * enabled, this field contains the details about each failure.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailure failures = 2 [json_name = "failures"];</code>
   */
  java.util.List<com.google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailure> 
      getFailuresList();
  /**
   * <pre>
   * If allow_partial_success is true, and one or more services could not be
   * enabled, this field contains the details about each failure.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailure failures = 2 [json_name = "failures"];</code>
   */
  com.google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailure getFailures(int index);
  /**
   * <pre>
   * If allow_partial_success is true, and one or more services could not be
   * enabled, this field contains the details about each failure.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailure failures = 2 [json_name = "failures"];</code>
   */
  int getFailuresCount();
  /**
   * <pre>
   * If allow_partial_success is true, and one or more services could not be
   * enabled, this field contains the details about each failure.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailure failures = 2 [json_name = "failures"];</code>
   */
  java.util.List<? extends com.google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailureOrBuilder> 
      getFailuresOrBuilderList();
  /**
   * <pre>
   * If allow_partial_success is true, and one or more services could not be
   * enabled, this field contains the details about each failure.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailure failures = 2 [json_name = "failures"];</code>
   */
  com.google.api.serviceusage.v1.BatchEnableServicesResponse.EnableFailureOrBuilder getFailuresOrBuilder(
      int index);
}
