// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1alpha1/value.proto

package com.google.api.expr.v1alpha1;

public interface ListValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.expr.v1alpha1.ListValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ordered values in the list.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1alpha1.Value values = 1 [json_name = "values"];</code>
   */
  java.util.List<com.google.api.expr.v1alpha1.Value> 
      getValuesList();
  /**
   * <pre>
   * The ordered values in the list.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1alpha1.Value values = 1 [json_name = "values"];</code>
   */
  com.google.api.expr.v1alpha1.Value getValues(int index);
  /**
   * <pre>
   * The ordered values in the list.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1alpha1.Value values = 1 [json_name = "values"];</code>
   */
  int getValuesCount();
  /**
   * <pre>
   * The ordered values in the list.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1alpha1.Value values = 1 [json_name = "values"];</code>
   */
  java.util.List<? extends com.google.api.expr.v1alpha1.ValueOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <pre>
   * The ordered values in the list.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1alpha1.Value values = 1 [json_name = "values"];</code>
   */
  com.google.api.expr.v1alpha1.ValueOrBuilder getValuesOrBuilder(
      int index);
}
