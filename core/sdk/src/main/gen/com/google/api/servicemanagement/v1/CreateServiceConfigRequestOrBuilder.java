// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

public interface CreateServiceConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.CreateServiceConfigRequest)
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
   * Required. The service configuration resource.
   * </pre>
   *
   * <code>.google.api.Service service_config = 2 [json_name = "serviceConfig", (.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the serviceConfig field is set.
   */
  boolean hasServiceConfig();
  /**
   * <pre>
   * Required. The service configuration resource.
   * </pre>
   *
   * <code>.google.api.Service service_config = 2 [json_name = "serviceConfig", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The serviceConfig.
   */
  com.google.api.Service getServiceConfig();
  /**
   * <pre>
   * Required. The service configuration resource.
   * </pre>
   *
   * <code>.google.api.Service service_config = 2 [json_name = "serviceConfig", (.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.api.ServiceOrBuilder getServiceConfigOrBuilder();
}
