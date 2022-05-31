// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/monitored_resource.proto

package com.google.api;

public final class MonitoredResourceProto {
  private MonitoredResourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MonitoredResourceDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MonitoredResourceDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MonitoredResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MonitoredResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MonitoredResource_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MonitoredResource_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MonitoredResourceMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MonitoredResourceMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MonitoredResourceMetadata_UserLabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MonitoredResourceMetadata_UserLabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#google/api/monitored_resource.proto\022\ng" +
      "oogle.api\032\026google/api/label.proto\032\035googl" +
      "e/api/launch_stage.proto\032\034google/protobu" +
      "f/struct.proto\"\373\001\n\033MonitoredResourceDesc" +
      "riptor\022\022\n\004name\030\005 \001(\tR\004name\022\022\n\004type\030\001 \001(\t" +
      "R\004type\022!\n\014display_name\030\002 \001(\tR\013displayNam" +
      "e\022 \n\013description\030\003 \001(\tR\013description\0223\n\006l" +
      "abels\030\004 \003(\0132\033.google.api.LabelDescriptor" +
      "R\006labels\022:\n\014launch_stage\030\007 \001(\0162\027.google." +
      "api.LaunchStageR\013launchStage\"\245\001\n\021Monitor" +
      "edResource\022\022\n\004type\030\001 \001(\tR\004type\022A\n\006labels" +
      "\030\002 \003(\0132).google.api.MonitoredResource.La" +
      "belsEntryR\006labels\0329\n\013LabelsEntry\022\020\n\003key\030" +
      "\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\tR\005value:\0028\001\"\360\001\n" +
      "\031MonitoredResourceMetadata\022<\n\rsystem_lab" +
      "els\030\001 \001(\0132\027.google.protobuf.StructR\014syst" +
      "emLabels\022V\n\013user_labels\030\002 \003(\01325.google.a" +
      "pi.MonitoredResourceMetadata.UserLabelsE" +
      "ntryR\nuserLabels\032=\n\017UserLabelsEntry\022\020\n\003k" +
      "ey\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\tR\005value:\0028\001B" +
      "y\n\016com.google.apiB\026MonitoredResourceProt" +
      "oP\001ZCgoogle.golang.org/genproto/googleap" +
      "is/api/monitoredres;monitoredres\370\001\001\242\002\004GA" +
      "PIb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.LabelProto.getDescriptor(),
          com.google.api.LaunchStageProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_api_MonitoredResourceDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_MonitoredResourceDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_MonitoredResourceDescriptor_descriptor,
        new java.lang.String[] { "Name", "Type", "DisplayName", "Description", "Labels", "LaunchStage", });
    internal_static_google_api_MonitoredResource_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_MonitoredResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_MonitoredResource_descriptor,
        new java.lang.String[] { "Type", "Labels", });
    internal_static_google_api_MonitoredResource_LabelsEntry_descriptor =
      internal_static_google_api_MonitoredResource_descriptor.getNestedTypes().get(0);
    internal_static_google_api_MonitoredResource_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_MonitoredResource_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_api_MonitoredResourceMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_MonitoredResourceMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_MonitoredResourceMetadata_descriptor,
        new java.lang.String[] { "SystemLabels", "UserLabels", });
    internal_static_google_api_MonitoredResourceMetadata_UserLabelsEntry_descriptor =
      internal_static_google_api_MonitoredResourceMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_api_MonitoredResourceMetadata_UserLabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_MonitoredResourceMetadata_UserLabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.api.LabelProto.getDescriptor();
    com.google.api.LaunchStageProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
