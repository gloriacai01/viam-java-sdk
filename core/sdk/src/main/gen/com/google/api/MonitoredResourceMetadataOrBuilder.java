// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/monitored_resource.proto

package com.google.api;

public interface MonitoredResourceMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.MonitoredResourceMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Values for predefined system metadata labels.
   * System labels are a kind of metadata extracted by Google, including
   * "machine_image", "vpc", "subnet_id",
   * "security_group", "name", etc.
   * System label values can be only strings, Boolean values, or a list of
   * strings. For example:
   *     { "name": "my-test-instance",
   *       "security_group": ["a", "b", "c"],
   *       "spot_instance": false }
   * </pre>
   *
   * <code>.google.protobuf.Struct system_labels = 1 [json_name = "systemLabels"];</code>
   * @return Whether the systemLabels field is set.
   */
  boolean hasSystemLabels();
  /**
   * <pre>
   * Output only. Values for predefined system metadata labels.
   * System labels are a kind of metadata extracted by Google, including
   * "machine_image", "vpc", "subnet_id",
   * "security_group", "name", etc.
   * System label values can be only strings, Boolean values, or a list of
   * strings. For example:
   *     { "name": "my-test-instance",
   *       "security_group": ["a", "b", "c"],
   *       "spot_instance": false }
   * </pre>
   *
   * <code>.google.protobuf.Struct system_labels = 1 [json_name = "systemLabels"];</code>
   * @return The systemLabels.
   */
  com.google.protobuf.Struct getSystemLabels();
  /**
   * <pre>
   * Output only. Values for predefined system metadata labels.
   * System labels are a kind of metadata extracted by Google, including
   * "machine_image", "vpc", "subnet_id",
   * "security_group", "name", etc.
   * System label values can be only strings, Boolean values, or a list of
   * strings. For example:
   *     { "name": "my-test-instance",
   *       "security_group": ["a", "b", "c"],
   *       "spot_instance": false }
   * </pre>
   *
   * <code>.google.protobuf.Struct system_labels = 1 [json_name = "systemLabels"];</code>
   */
  com.google.protobuf.StructOrBuilder getSystemLabelsOrBuilder();

  /**
   * <pre>
   * Output only. A map of user-defined metadata labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 2 [json_name = "userLabels"];</code>
   */
  int getUserLabelsCount();
  /**
   * <pre>
   * Output only. A map of user-defined metadata labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 2 [json_name = "userLabels"];</code>
   */
  boolean containsUserLabels(
      java.lang.String key);
  /**
   * Use {@link #getUserLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getUserLabels();
  /**
   * <pre>
   * Output only. A map of user-defined metadata labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 2 [json_name = "userLabels"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getUserLabelsMap();
  /**
   * <pre>
   * Output only. A map of user-defined metadata labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 2 [json_name = "userLabels"];</code>
   */

  java.lang.String getUserLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Output only. A map of user-defined metadata labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 2 [json_name = "userLabels"];</code>
   */

  java.lang.String getUserLabelsOrThrow(
      java.lang.String key);
}
