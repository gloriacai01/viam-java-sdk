// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1alpha1/syntax.proto

package com.google.api.expr.v1alpha1;

public interface ParsedExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.expr.v1alpha1.ParsedExpr)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parsed expression.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Expr expr = 2 [json_name = "expr"];</code>
   * @return Whether the expr field is set.
   */
  boolean hasExpr();
  /**
   * <pre>
   * The parsed expression.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Expr expr = 2 [json_name = "expr"];</code>
   * @return The expr.
   */
  com.google.api.expr.v1alpha1.Expr getExpr();
  /**
   * <pre>
   * The parsed expression.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Expr expr = 2 [json_name = "expr"];</code>
   */
  com.google.api.expr.v1alpha1.ExprOrBuilder getExprOrBuilder();

  /**
   * <pre>
   * The source info derived from input that generated the parsed `expr`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.SourceInfo source_info = 3 [json_name = "sourceInfo"];</code>
   * @return Whether the sourceInfo field is set.
   */
  boolean hasSourceInfo();
  /**
   * <pre>
   * The source info derived from input that generated the parsed `expr`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.SourceInfo source_info = 3 [json_name = "sourceInfo"];</code>
   * @return The sourceInfo.
   */
  com.google.api.expr.v1alpha1.SourceInfo getSourceInfo();
  /**
   * <pre>
   * The source info derived from input that generated the parsed `expr`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.SourceInfo source_info = 3 [json_name = "sourceInfo"];</code>
   */
  com.google.api.expr.v1alpha1.SourceInfoOrBuilder getSourceInfoOrBuilder();
}
