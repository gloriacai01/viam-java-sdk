// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/log.proto

package com.google.api;

public final class LogProto {
  private LogProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_LogDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_LogDescriptor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024google/api/log.proto\022\ngoogle.api\032\026goog" +
      "le/api/label.proto\"\235\001\n\rLogDescriptor\022\022\n\004" +
      "name\030\001 \001(\tR\004name\0223\n\006labels\030\002 \003(\0132\033.googl" +
      "e.api.LabelDescriptorR\006labels\022 \n\013descrip" +
      "tion\030\003 \001(\tR\013description\022!\n\014display_name\030" +
      "\004 \001(\tR\013displayNameBj\n\016com.google.apiB\010Lo" +
      "gProtoP\001ZEgoogle.golang.org/genproto/goo" +
      "gleapis/api/serviceconfig;serviceconfig\242" +
      "\002\004GAPIb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.LabelProto.getDescriptor(),
        });
    internal_static_google_api_LogDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_LogDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_LogDescriptor_descriptor,
        new java.lang.String[] { "Name", "Labels", "Description", "DisplayName", });
    com.google.api.LabelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
