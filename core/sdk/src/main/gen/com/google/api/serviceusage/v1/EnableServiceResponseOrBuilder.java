// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/serviceusage/v1/serviceusage.proto

package com.google.api.serviceusage.v1;

public interface EnableServiceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1.EnableServiceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The new state of the service after enabling.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1.Service service = 1 [json_name = "service"];</code>
   * @return Whether the service field is set.
   */
  boolean hasService();
  /**
   * <pre>
   * The new state of the service after enabling.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1.Service service = 1 [json_name = "service"];</code>
   * @return The service.
   */
  com.google.api.serviceusage.v1.Service getService();
  /**
   * <pre>
   * The new state of the service after enabling.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1.Service service = 1 [json_name = "service"];</code>
   */
  com.google.api.serviceusage.v1.ServiceOrBuilder getServiceOrBuilder();
}
