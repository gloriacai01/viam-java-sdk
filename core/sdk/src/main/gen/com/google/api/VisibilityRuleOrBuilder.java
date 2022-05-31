// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/visibility.proto

package com.google.api;

public interface VisibilityRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.VisibilityRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Selects methods, messages, fields, enums, etc. to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1 [json_name = "selector"];</code>
   * @return The selector.
   */
  java.lang.String getSelector();
  /**
   * <pre>
   * Selects methods, messages, fields, enums, etc. to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1 [json_name = "selector"];</code>
   * @return The bytes for selector.
   */
  com.google.protobuf.ByteString
      getSelectorBytes();

  /**
   * <pre>
   * A comma-separated list of visibility labels that apply to the `selector`.
   * Any of the listed labels can be used to grant the visibility.
   * If a rule has multiple labels, removing one of the labels but not all of
   * them can break clients.
   * Example:
   *     visibility:
   *       rules:
   *       - selector: google.calendar.Calendar.EnhancedSearch
   *         restriction: INTERNAL, PREVIEW
   * Removing INTERNAL from this restriction will break clients that rely on
   * this method and only had access to it through INTERNAL.
   * </pre>
   *
   * <code>string restriction = 2 [json_name = "restriction"];</code>
   * @return The restriction.
   */
  java.lang.String getRestriction();
  /**
   * <pre>
   * A comma-separated list of visibility labels that apply to the `selector`.
   * Any of the listed labels can be used to grant the visibility.
   * If a rule has multiple labels, removing one of the labels but not all of
   * them can break clients.
   * Example:
   *     visibility:
   *       rules:
   *       - selector: google.calendar.Calendar.EnhancedSearch
   *         restriction: INTERNAL, PREVIEW
   * Removing INTERNAL from this restriction will break clients that rely on
   * this method and only had access to it through INTERNAL.
   * </pre>
   *
   * <code>string restriction = 2 [json_name = "restriction"];</code>
   * @return The bytes for restriction.
   */
  com.google.protobuf.ByteString
      getRestrictionBytes();
}
