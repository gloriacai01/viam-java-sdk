// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

public interface ListServiceConfigsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.ListServiceConfigsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the service.  See the
   * [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements.  For
   * example: `example.googleapis.com`.
   * </pre>
   *
   * <code>string service_name = 1 [json_name = "serviceName", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   * <pre>
   * Required. The name of the service.  See the
   * [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements.  For
   * example: `example.googleapis.com`.
   * </pre>
   *
   * <code>string service_name = 1 [json_name = "serviceName", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <pre>
   * The token of the page to retrieve.
   * </pre>
   *
   * <code>string page_token = 2 [json_name = "pageToken"];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The token of the page to retrieve.
   * </pre>
   *
   * <code>string page_token = 2 [json_name = "pageToken"];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * The max number of items to include in the response list. Page size is 50
   * if not specified. Maximum value is 100.
   * </pre>
   *
   * <code>int32 page_size = 3 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  int getPageSize();
}
