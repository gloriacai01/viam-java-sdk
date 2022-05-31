// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1beta1/expr.proto

package com.google.api.expr.v1beta1;

public interface LiteralOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.expr.v1beta1.Literal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];</code>
   * @return Whether the nullValue field is set.
   */
  boolean hasNullValue();
  /**
   * <pre>
   * null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];</code>
   * @return The enum numeric value on the wire for nullValue.
   */
  int getNullValueValue();
  /**
   * <pre>
   * null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];</code>
   * @return The nullValue.
   */
  com.google.protobuf.NullValue getNullValue();

  /**
   * <pre>
   * boolean value.
   * </pre>
   *
   * <code>bool bool_value = 2 [json_name = "boolValue"];</code>
   * @return Whether the boolValue field is set.
   */
  boolean hasBoolValue();
  /**
   * <pre>
   * boolean value.
   * </pre>
   *
   * <code>bool bool_value = 2 [json_name = "boolValue"];</code>
   * @return The boolValue.
   */
  boolean getBoolValue();

  /**
   * <pre>
   * int64 value.
   * </pre>
   *
   * <code>int64 int64_value = 3 [json_name = "int64Value"];</code>
   * @return Whether the int64Value field is set.
   */
  boolean hasInt64Value();
  /**
   * <pre>
   * int64 value.
   * </pre>
   *
   * <code>int64 int64_value = 3 [json_name = "int64Value"];</code>
   * @return The int64Value.
   */
  long getInt64Value();

  /**
   * <pre>
   * uint64 value.
   * </pre>
   *
   * <code>uint64 uint64_value = 4 [json_name = "uint64Value"];</code>
   * @return Whether the uint64Value field is set.
   */
  boolean hasUint64Value();
  /**
   * <pre>
   * uint64 value.
   * </pre>
   *
   * <code>uint64 uint64_value = 4 [json_name = "uint64Value"];</code>
   * @return The uint64Value.
   */
  long getUint64Value();

  /**
   * <pre>
   * double value.
   * </pre>
   *
   * <code>double double_value = 5 [json_name = "doubleValue"];</code>
   * @return Whether the doubleValue field is set.
   */
  boolean hasDoubleValue();
  /**
   * <pre>
   * double value.
   * </pre>
   *
   * <code>double double_value = 5 [json_name = "doubleValue"];</code>
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   * <pre>
   * string value.
   * </pre>
   *
   * <code>string string_value = 6 [json_name = "stringValue"];</code>
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();
  /**
   * <pre>
   * string value.
   * </pre>
   *
   * <code>string string_value = 6 [json_name = "stringValue"];</code>
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   * <pre>
   * string value.
   * </pre>
   *
   * <code>string string_value = 6 [json_name = "stringValue"];</code>
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  /**
   * <pre>
   * bytes value.
   * </pre>
   *
   * <code>bytes bytes_value = 7 [json_name = "bytesValue"];</code>
   * @return Whether the bytesValue field is set.
   */
  boolean hasBytesValue();
  /**
   * <pre>
   * bytes value.
   * </pre>
   *
   * <code>bytes bytes_value = 7 [json_name = "bytesValue"];</code>
   * @return The bytesValue.
   */
  com.google.protobuf.ByteString getBytesValue();

  public com.google.api.expr.v1beta1.Literal.ConstantKindCase getConstantKindCase();
}
