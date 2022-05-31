// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

public interface ListServicesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.ListServicesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Include services produced by the specified project.
   * </pre>
   *
   * <code>string producer_project_id = 1 [json_name = "producerProjectId"];</code>
   * @return The producerProjectId.
   */
  java.lang.String getProducerProjectId();
  /**
   * <pre>
   * Include services produced by the specified project.
   * </pre>
   *
   * <code>string producer_project_id = 1 [json_name = "producerProjectId"];</code>
   * @return The bytes for producerProjectId.
   */
  com.google.protobuf.ByteString
      getProducerProjectIdBytes();

  /**
   * <pre>
   * The max number of items to include in the response list. Page size is 50
   * if not specified. Maximum value is 100.
   * </pre>
   *
   * <code>int32 page_size = 5 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Token identifying which result to start with; returned by a previous list
   * call.
   * </pre>
   *
   * <code>string page_token = 6 [json_name = "pageToken"];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Token identifying which result to start with; returned by a previous list
   * call.
   * </pre>
   *
   * <code>string page_token = 6 [json_name = "pageToken"];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Include services consumed by the specified consumer.
   * The Google Service Management implementation accepts the following
   * forms:
   * - project:&lt;project_id&gt;
   * </pre>
   *
   * <code>string consumer_id = 7 [json_name = "consumerId", deprecated = true];</code>
   * @deprecated
   * @return The consumerId.
   */
  @java.lang.Deprecated java.lang.String getConsumerId();
  /**
   * <pre>
   * Include services consumed by the specified consumer.
   * The Google Service Management implementation accepts the following
   * forms:
   * - project:&lt;project_id&gt;
   * </pre>
   *
   * <code>string consumer_id = 7 [json_name = "consumerId", deprecated = true];</code>
   * @deprecated
   * @return The bytes for consumerId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getConsumerIdBytes();
}
