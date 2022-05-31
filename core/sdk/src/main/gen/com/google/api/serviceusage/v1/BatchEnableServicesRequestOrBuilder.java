// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/serviceusage/v1/serviceusage.proto

package com.google.api.serviceusage.v1;

public interface BatchEnableServicesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1.BatchEnableServicesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Parent to enable services on.
   * An example name would be:
   * `projects/123` where `123` is the project number.
   * The `BatchEnableServices` method currently only supports projects.
   * </pre>
   *
   * <code>string parent = 1 [json_name = "parent"];</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Parent to enable services on.
   * An example name would be:
   * `projects/123` where `123` is the project number.
   * The `BatchEnableServices` method currently only supports projects.
   * </pre>
   *
   * <code>string parent = 1 [json_name = "parent"];</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The identifiers of the services to enable on the project.
   * A valid identifier would be:
   * serviceusage.googleapis.com
   * Enabling services requires that each service is public or is shared with
   * the user enabling the service.
   * A single request can enable a maximum of 20 services at a time. If more
   * than 20 services are specified, the request will fail, and no state changes
   * will occur.
   * </pre>
   *
   * <code>repeated string service_ids = 2 [json_name = "serviceIds"];</code>
   * @return A list containing the serviceIds.
   */
  java.util.List<java.lang.String>
      getServiceIdsList();
  /**
   * <pre>
   * The identifiers of the services to enable on the project.
   * A valid identifier would be:
   * serviceusage.googleapis.com
   * Enabling services requires that each service is public or is shared with
   * the user enabling the service.
   * A single request can enable a maximum of 20 services at a time. If more
   * than 20 services are specified, the request will fail, and no state changes
   * will occur.
   * </pre>
   *
   * <code>repeated string service_ids = 2 [json_name = "serviceIds"];</code>
   * @return The count of serviceIds.
   */
  int getServiceIdsCount();
  /**
   * <pre>
   * The identifiers of the services to enable on the project.
   * A valid identifier would be:
   * serviceusage.googleapis.com
   * Enabling services requires that each service is public or is shared with
   * the user enabling the service.
   * A single request can enable a maximum of 20 services at a time. If more
   * than 20 services are specified, the request will fail, and no state changes
   * will occur.
   * </pre>
   *
   * <code>repeated string service_ids = 2 [json_name = "serviceIds"];</code>
   * @param index The index of the element to return.
   * @return The serviceIds at the given index.
   */
  java.lang.String getServiceIds(int index);
  /**
   * <pre>
   * The identifiers of the services to enable on the project.
   * A valid identifier would be:
   * serviceusage.googleapis.com
   * Enabling services requires that each service is public or is shared with
   * the user enabling the service.
   * A single request can enable a maximum of 20 services at a time. If more
   * than 20 services are specified, the request will fail, and no state changes
   * will occur.
   * </pre>
   *
   * <code>repeated string service_ids = 2 [json_name = "serviceIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the serviceIds at the given index.
   */
  com.google.protobuf.ByteString
      getServiceIdsBytes(int index);
}
