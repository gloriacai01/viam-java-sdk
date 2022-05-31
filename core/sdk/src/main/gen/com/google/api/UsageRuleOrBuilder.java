// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/usage.proto

package com.google.api;

public interface UsageRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.UsageRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Selects the methods to which this rule applies. Use '*' to indicate all
   * methods in all APIs.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1 [json_name = "selector"];</code>
   * @return The selector.
   */
  java.lang.String getSelector();
  /**
   * <pre>
   * Selects the methods to which this rule applies. Use '*' to indicate all
   * methods in all APIs.
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
   * If true, the selected method allows unregistered calls, e.g. calls
   * that don't identify any user or application.
   * </pre>
   *
   * <code>bool allow_unregistered_calls = 2 [json_name = "allowUnregisteredCalls"];</code>
   * @return The allowUnregisteredCalls.
   */
  boolean getAllowUnregisteredCalls();

  /**
   * <pre>
   * If true, the selected method should skip service control and the control
   * plane features, such as quota and billing, will not be available.
   * This flag is used by Google Cloud Endpoints to bypass checks for internal
   * methods, such as service health check methods.
   * </pre>
   *
   * <code>bool skip_service_control = 3 [json_name = "skipServiceControl"];</code>
   * @return The skipServiceControl.
   */
  boolean getSkipServiceControl();
}
