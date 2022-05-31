// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1beta1/decl.proto

package com.google.api.expr.v1beta1;

public interface DeclOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.expr.v1beta1.Decl)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of the declaration.
   * </pre>
   *
   * <code>int32 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  int getId();

  /**
   * <pre>
   * The name of the declaration.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the declaration.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The documentation string for the declaration.
   * </pre>
   *
   * <code>string doc = 3 [json_name = "doc"];</code>
   * @return The doc.
   */
  java.lang.String getDoc();
  /**
   * <pre>
   * The documentation string for the declaration.
   * </pre>
   *
   * <code>string doc = 3 [json_name = "doc"];</code>
   * @return The bytes for doc.
   */
  com.google.protobuf.ByteString
      getDocBytes();

  /**
   * <pre>
   * An identifier declaration.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.IdentDecl ident = 4 [json_name = "ident"];</code>
   * @return Whether the ident field is set.
   */
  boolean hasIdent();
  /**
   * <pre>
   * An identifier declaration.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.IdentDecl ident = 4 [json_name = "ident"];</code>
   * @return The ident.
   */
  com.google.api.expr.v1beta1.IdentDecl getIdent();
  /**
   * <pre>
   * An identifier declaration.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.IdentDecl ident = 4 [json_name = "ident"];</code>
   */
  com.google.api.expr.v1beta1.IdentDeclOrBuilder getIdentOrBuilder();

  /**
   * <pre>
   * A function declaration.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.FunctionDecl function = 5 [json_name = "function"];</code>
   * @return Whether the function field is set.
   */
  boolean hasFunction();
  /**
   * <pre>
   * A function declaration.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.FunctionDecl function = 5 [json_name = "function"];</code>
   * @return The function.
   */
  com.google.api.expr.v1beta1.FunctionDecl getFunction();
  /**
   * <pre>
   * A function declaration.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.FunctionDecl function = 5 [json_name = "function"];</code>
   */
  com.google.api.expr.v1beta1.FunctionDeclOrBuilder getFunctionOrBuilder();

  public com.google.api.expr.v1beta1.Decl.KindCase getKindCase();
}
