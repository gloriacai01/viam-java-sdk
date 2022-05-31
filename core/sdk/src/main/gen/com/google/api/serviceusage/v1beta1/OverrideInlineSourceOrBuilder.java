// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/serviceusage/v1beta1/resources.proto

package com.google.api.serviceusage.v1beta1;

public interface OverrideInlineSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1beta1.OverrideInlineSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The overrides to create.
   * Each override must have a value for 'metric' and 'unit', to specify
   * which metric and which limit the override should be applied to.
   * The 'name' field of the override does not need to be set; it is ignored.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1 [json_name = "overrides"];</code>
   */
  java.util.List<com.google.api.serviceusage.v1beta1.QuotaOverride> 
      getOverridesList();
  /**
   * <pre>
   * The overrides to create.
   * Each override must have a value for 'metric' and 'unit', to specify
   * which metric and which limit the override should be applied to.
   * The 'name' field of the override does not need to be set; it is ignored.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1 [json_name = "overrides"];</code>
   */
  com.google.api.serviceusage.v1beta1.QuotaOverride getOverrides(int index);
  /**
   * <pre>
   * The overrides to create.
   * Each override must have a value for 'metric' and 'unit', to specify
   * which metric and which limit the override should be applied to.
   * The 'name' field of the override does not need to be set; it is ignored.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1 [json_name = "overrides"];</code>
   */
  int getOverridesCount();
  /**
   * <pre>
   * The overrides to create.
   * Each override must have a value for 'metric' and 'unit', to specify
   * which metric and which limit the override should be applied to.
   * The 'name' field of the override does not need to be set; it is ignored.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1 [json_name = "overrides"];</code>
   */
  java.util.List<? extends com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder> 
      getOverridesOrBuilderList();
  /**
   * <pre>
   * The overrides to create.
   * Each override must have a value for 'metric' and 'unit', to specify
   * which metric and which limit the override should be applied to.
   * The 'name' field of the override does not need to be set; it is ignored.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1 [json_name = "overrides"];</code>
   */
  com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder getOverridesOrBuilder(
      int index);
}
