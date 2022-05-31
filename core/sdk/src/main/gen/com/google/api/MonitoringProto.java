// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/monitoring.proto

package com.google.api;

public final class MonitoringProto {
  private MonitoringProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Monitoring_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Monitoring_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Monitoring_MonitoringDestination_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Monitoring_MonitoringDestination_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033google/api/monitoring.proto\022\ngoogle.ap" +
      "i\"\264\002\n\nMonitoring\022a\n\025producer_destination" +
      "s\030\001 \003(\0132,.google.api.Monitoring.Monitori" +
      "ngDestinationR\024producerDestinations\022a\n\025c" +
      "onsumer_destinations\030\002 \003(\0132,.google.api." +
      "Monitoring.MonitoringDestinationR\024consum" +
      "erDestinations\032`\n\025MonitoringDestination\022" +
      "-\n\022monitored_resource\030\001 \001(\tR\021monitoredRe" +
      "source\022\030\n\007metrics\030\002 \003(\tR\007metricsBq\n\016com." +
      "google.apiB\017MonitoringProtoP\001ZEgoogle.go" +
      "lang.org/genproto/googleapis/api/service" +
      "config;serviceconfig\242\002\004GAPIb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_api_Monitoring_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Monitoring_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Monitoring_descriptor,
        new java.lang.String[] { "ProducerDestinations", "ConsumerDestinations", });
    internal_static_google_api_Monitoring_MonitoringDestination_descriptor =
      internal_static_google_api_Monitoring_descriptor.getNestedTypes().get(0);
    internal_static_google_api_Monitoring_MonitoringDestination_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Monitoring_MonitoringDestination_descriptor,
        new java.lang.String[] { "MonitoredResource", "Metrics", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
