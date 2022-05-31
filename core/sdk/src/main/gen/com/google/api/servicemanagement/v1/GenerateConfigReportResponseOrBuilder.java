// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

public interface GenerateConfigReportResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.GenerateConfigReportResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the service this report belongs to.
   * </pre>
   *
   * <code>string service_name = 1 [json_name = "serviceName"];</code>
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   * <pre>
   * Name of the service this report belongs to.
   * </pre>
   *
   * <code>string service_name = 1 [json_name = "serviceName"];</code>
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <pre>
   * ID of the service configuration this report belongs to.
   * </pre>
   *
   * <code>string id = 2 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * ID of the service configuration this report belongs to.
   * </pre>
   *
   * <code>string id = 2 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * list of ChangeReport, each corresponding to comparison between two
   * service configurations.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ChangeReport change_reports = 3 [json_name = "changeReports"];</code>
   */
  java.util.List<com.google.api.servicemanagement.v1.ChangeReport> 
      getChangeReportsList();
  /**
   * <pre>
   * list of ChangeReport, each corresponding to comparison between two
   * service configurations.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ChangeReport change_reports = 3 [json_name = "changeReports"];</code>
   */
  com.google.api.servicemanagement.v1.ChangeReport getChangeReports(int index);
  /**
   * <pre>
   * list of ChangeReport, each corresponding to comparison between two
   * service configurations.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ChangeReport change_reports = 3 [json_name = "changeReports"];</code>
   */
  int getChangeReportsCount();
  /**
   * <pre>
   * list of ChangeReport, each corresponding to comparison between two
   * service configurations.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ChangeReport change_reports = 3 [json_name = "changeReports"];</code>
   */
  java.util.List<? extends com.google.api.servicemanagement.v1.ChangeReportOrBuilder> 
      getChangeReportsOrBuilderList();
  /**
   * <pre>
   * list of ChangeReport, each corresponding to comparison between two
   * service configurations.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ChangeReport change_reports = 3 [json_name = "changeReports"];</code>
   */
  com.google.api.servicemanagement.v1.ChangeReportOrBuilder getChangeReportsOrBuilder(
      int index);

  /**
   * <pre>
   * Errors / Linter warnings associated with the service definition this
   * report
   * belongs to.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Diagnostic diagnostics = 4 [json_name = "diagnostics"];</code>
   */
  java.util.List<com.google.api.servicemanagement.v1.Diagnostic> 
      getDiagnosticsList();
  /**
   * <pre>
   * Errors / Linter warnings associated with the service definition this
   * report
   * belongs to.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Diagnostic diagnostics = 4 [json_name = "diagnostics"];</code>
   */
  com.google.api.servicemanagement.v1.Diagnostic getDiagnostics(int index);
  /**
   * <pre>
   * Errors / Linter warnings associated with the service definition this
   * report
   * belongs to.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Diagnostic diagnostics = 4 [json_name = "diagnostics"];</code>
   */
  int getDiagnosticsCount();
  /**
   * <pre>
   * Errors / Linter warnings associated with the service definition this
   * report
   * belongs to.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Diagnostic diagnostics = 4 [json_name = "diagnostics"];</code>
   */
  java.util.List<? extends com.google.api.servicemanagement.v1.DiagnosticOrBuilder> 
      getDiagnosticsOrBuilderList();
  /**
   * <pre>
   * Errors / Linter warnings associated with the service definition this
   * report
   * belongs to.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Diagnostic diagnostics = 4 [json_name = "diagnostics"];</code>
   */
  com.google.api.servicemanagement.v1.DiagnosticOrBuilder getDiagnosticsOrBuilder(
      int index);
}
