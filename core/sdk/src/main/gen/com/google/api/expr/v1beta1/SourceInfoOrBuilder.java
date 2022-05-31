// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1beta1/source.proto

package com.google.api.expr.v1beta1;

public interface SourceInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.expr.v1beta1.SourceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The location name. All position information attached to an expression is
   * relative to this location.
   * The location could be a file, UI element, or similar. For example,
   * `acme/app/AnvilPolicy.cel`.
   * </pre>
   *
   * <code>string location = 2 [json_name = "location"];</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <pre>
   * The location name. All position information attached to an expression is
   * relative to this location.
   * The location could be a file, UI element, or similar. For example,
   * `acme/app/AnvilPolicy.cel`.
   * </pre>
   *
   * <code>string location = 2 [json_name = "location"];</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <pre>
   * Monotonically increasing list of character offsets where newlines appear.
   * The line number of a given position is the index `i` where for a given
   * `id` the `line_offsets[i] &lt; id_positions[id] &lt; line_offsets[i+1]`. The
   * column may be derivd from `id_positions[id] - line_offsets[i]`.
   * </pre>
   *
   * <code>repeated int32 line_offsets = 3 [json_name = "lineOffsets"];</code>
   * @return A list containing the lineOffsets.
   */
  java.util.List<java.lang.Integer> getLineOffsetsList();
  /**
   * <pre>
   * Monotonically increasing list of character offsets where newlines appear.
   * The line number of a given position is the index `i` where for a given
   * `id` the `line_offsets[i] &lt; id_positions[id] &lt; line_offsets[i+1]`. The
   * column may be derivd from `id_positions[id] - line_offsets[i]`.
   * </pre>
   *
   * <code>repeated int32 line_offsets = 3 [json_name = "lineOffsets"];</code>
   * @return The count of lineOffsets.
   */
  int getLineOffsetsCount();
  /**
   * <pre>
   * Monotonically increasing list of character offsets where newlines appear.
   * The line number of a given position is the index `i` where for a given
   * `id` the `line_offsets[i] &lt; id_positions[id] &lt; line_offsets[i+1]`. The
   * column may be derivd from `id_positions[id] - line_offsets[i]`.
   * </pre>
   *
   * <code>repeated int32 line_offsets = 3 [json_name = "lineOffsets"];</code>
   * @param index The index of the element to return.
   * @return The lineOffsets at the given index.
   */
  int getLineOffsets(int index);

  /**
   * <pre>
   * A map from the parse node id (e.g. `Expr.id`) to the character offset
   * within source.
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; positions = 4 [json_name = "positions"];</code>
   */
  int getPositionsCount();
  /**
   * <pre>
   * A map from the parse node id (e.g. `Expr.id`) to the character offset
   * within source.
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; positions = 4 [json_name = "positions"];</code>
   */
  boolean containsPositions(
      int key);
  /**
   * Use {@link #getPositionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getPositions();
  /**
   * <pre>
   * A map from the parse node id (e.g. `Expr.id`) to the character offset
   * within source.
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; positions = 4 [json_name = "positions"];</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getPositionsMap();
  /**
   * <pre>
   * A map from the parse node id (e.g. `Expr.id`) to the character offset
   * within source.
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; positions = 4 [json_name = "positions"];</code>
   */

  int getPositionsOrDefault(
      int key,
      int defaultValue);
  /**
   * <pre>
   * A map from the parse node id (e.g. `Expr.id`) to the character offset
   * within source.
   * </pre>
   *
   * <code>map&lt;int32, int32&gt; positions = 4 [json_name = "positions"];</code>
   */

  int getPositionsOrThrow(
      int key);
}
