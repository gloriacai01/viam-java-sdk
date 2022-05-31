// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1alpha1/syntax.proto

package com.google.api.expr.v1alpha1;

/**
 * <pre>
 * A specific position in source.
 * </pre>
 *
 * Protobuf type {@code google.api.expr.v1alpha1.SourcePosition}
 */
public final class SourcePosition extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.expr.v1alpha1.SourcePosition)
    SourcePositionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SourcePosition.newBuilder() to construct.
  private SourcePosition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SourcePosition() {
    location_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SourcePosition();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SourcePosition(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            location_ = s;
            break;
          }
          case 16: {

            offset_ = input.readInt32();
            break;
          }
          case 24: {

            line_ = input.readInt32();
            break;
          }
          case 32: {

            column_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.expr.v1alpha1.SyntaxProto.internal_static_google_api_expr_v1alpha1_SourcePosition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.expr.v1alpha1.SyntaxProto.internal_static_google_api_expr_v1alpha1_SourcePosition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.expr.v1alpha1.SourcePosition.class, com.google.api.expr.v1alpha1.SourcePosition.Builder.class);
  }

  public static final int LOCATION_FIELD_NUMBER = 1;
  private volatile java.lang.Object location_;
  /**
   * <pre>
   * The soucre location name (e.g. file name).
   * </pre>
   *
   * <code>string location = 1 [json_name = "location"];</code>
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The soucre location name (e.g. file name).
   * </pre>
   *
   * <code>string location = 1 [json_name = "location"];</code>
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OFFSET_FIELD_NUMBER = 2;
  private int offset_;
  /**
   * <pre>
   * The UTF-8 code unit offset.
   * </pre>
   *
   * <code>int32 offset = 2 [json_name = "offset"];</code>
   * @return The offset.
   */
  @java.lang.Override
  public int getOffset() {
    return offset_;
  }

  public static final int LINE_FIELD_NUMBER = 3;
  private int line_;
  /**
   * <pre>
   * The 1-based index of the starting line in the source text
   * where the issue occurs, or 0 if unknown.
   * </pre>
   *
   * <code>int32 line = 3 [json_name = "line"];</code>
   * @return The line.
   */
  @java.lang.Override
  public int getLine() {
    return line_;
  }

  public static final int COLUMN_FIELD_NUMBER = 4;
  private int column_;
  /**
   * <pre>
   * The 0-based index of the starting position within the line of source text
   * where the issue occurs.  Only meaningful if line is nonzero.
   * </pre>
   *
   * <code>int32 column = 4 [json_name = "column"];</code>
   * @return The column.
   */
  @java.lang.Override
  public int getColumn() {
    return column_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, location_);
    }
    if (offset_ != 0) {
      output.writeInt32(2, offset_);
    }
    if (line_ != 0) {
      output.writeInt32(3, line_);
    }
    if (column_ != 0) {
      output.writeInt32(4, column_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, location_);
    }
    if (offset_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, offset_);
    }
    if (line_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, line_);
    }
    if (column_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, column_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.api.expr.v1alpha1.SourcePosition)) {
      return super.equals(obj);
    }
    com.google.api.expr.v1alpha1.SourcePosition other = (com.google.api.expr.v1alpha1.SourcePosition) obj;

    if (!getLocation()
        .equals(other.getLocation())) return false;
    if (getOffset()
        != other.getOffset()) return false;
    if (getLine()
        != other.getLine()) return false;
    if (getColumn()
        != other.getColumn()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getOffset();
    hash = (37 * hash) + LINE_FIELD_NUMBER;
    hash = (53 * hash) + getLine();
    hash = (37 * hash) + COLUMN_FIELD_NUMBER;
    hash = (53 * hash) + getColumn();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.expr.v1alpha1.SourcePosition parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1alpha1.SourcePosition parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.SourcePosition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1alpha1.SourcePosition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.SourcePosition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1alpha1.SourcePosition parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.SourcePosition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1alpha1.SourcePosition parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.SourcePosition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1alpha1.SourcePosition parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.SourcePosition parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1alpha1.SourcePosition parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.expr.v1alpha1.SourcePosition prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A specific position in source.
   * </pre>
   *
   * Protobuf type {@code google.api.expr.v1alpha1.SourcePosition}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.expr.v1alpha1.SourcePosition)
      com.google.api.expr.v1alpha1.SourcePositionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.expr.v1alpha1.SyntaxProto.internal_static_google_api_expr_v1alpha1_SourcePosition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.expr.v1alpha1.SyntaxProto.internal_static_google_api_expr_v1alpha1_SourcePosition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.expr.v1alpha1.SourcePosition.class, com.google.api.expr.v1alpha1.SourcePosition.Builder.class);
    }

    // Construct using com.google.api.expr.v1alpha1.SourcePosition.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      location_ = "";

      offset_ = 0;

      line_ = 0;

      column_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.expr.v1alpha1.SyntaxProto.internal_static_google_api_expr_v1alpha1_SourcePosition_descriptor;
    }

    @java.lang.Override
    public com.google.api.expr.v1alpha1.SourcePosition getDefaultInstanceForType() {
      return com.google.api.expr.v1alpha1.SourcePosition.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.expr.v1alpha1.SourcePosition build() {
      com.google.api.expr.v1alpha1.SourcePosition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.expr.v1alpha1.SourcePosition buildPartial() {
      com.google.api.expr.v1alpha1.SourcePosition result = new com.google.api.expr.v1alpha1.SourcePosition(this);
      result.location_ = location_;
      result.offset_ = offset_;
      result.line_ = line_;
      result.column_ = column_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.expr.v1alpha1.SourcePosition) {
        return mergeFrom((com.google.api.expr.v1alpha1.SourcePosition)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.expr.v1alpha1.SourcePosition other) {
      if (other == com.google.api.expr.v1alpha1.SourcePosition.getDefaultInstance()) return this;
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        onChanged();
      }
      if (other.getOffset() != 0) {
        setOffset(other.getOffset());
      }
      if (other.getLine() != 0) {
        setLine(other.getLine());
      }
      if (other.getColumn() != 0) {
        setColumn(other.getColumn());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.api.expr.v1alpha1.SourcePosition parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.expr.v1alpha1.SourcePosition) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     * <pre>
     * The soucre location name (e.g. file name).
     * </pre>
     *
     * <code>string location = 1 [json_name = "location"];</code>
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The soucre location name (e.g. file name).
     * </pre>
     *
     * <code>string location = 1 [json_name = "location"];</code>
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The soucre location name (e.g. file name).
     * </pre>
     *
     * <code>string location = 1 [json_name = "location"];</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      location_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The soucre location name (e.g. file name).
     * </pre>
     *
     * <code>string location = 1 [json_name = "location"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      
      location_ = getDefaultInstance().getLocation();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The soucre location name (e.g. file name).
     * </pre>
     *
     * <code>string location = 1 [json_name = "location"];</code>
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      location_ = value;
      onChanged();
      return this;
    }

    private int offset_ ;
    /**
     * <pre>
     * The UTF-8 code unit offset.
     * </pre>
     *
     * <code>int32 offset = 2 [json_name = "offset"];</code>
     * @return The offset.
     */
    @java.lang.Override
    public int getOffset() {
      return offset_;
    }
    /**
     * <pre>
     * The UTF-8 code unit offset.
     * </pre>
     *
     * <code>int32 offset = 2 [json_name = "offset"];</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(int value) {
      
      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The UTF-8 code unit offset.
     * </pre>
     *
     * <code>int32 offset = 2 [json_name = "offset"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      
      offset_ = 0;
      onChanged();
      return this;
    }

    private int line_ ;
    /**
     * <pre>
     * The 1-based index of the starting line in the source text
     * where the issue occurs, or 0 if unknown.
     * </pre>
     *
     * <code>int32 line = 3 [json_name = "line"];</code>
     * @return The line.
     */
    @java.lang.Override
    public int getLine() {
      return line_;
    }
    /**
     * <pre>
     * The 1-based index of the starting line in the source text
     * where the issue occurs, or 0 if unknown.
     * </pre>
     *
     * <code>int32 line = 3 [json_name = "line"];</code>
     * @param value The line to set.
     * @return This builder for chaining.
     */
    public Builder setLine(int value) {
      
      line_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The 1-based index of the starting line in the source text
     * where the issue occurs, or 0 if unknown.
     * </pre>
     *
     * <code>int32 line = 3 [json_name = "line"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLine() {
      
      line_ = 0;
      onChanged();
      return this;
    }

    private int column_ ;
    /**
     * <pre>
     * The 0-based index of the starting position within the line of source text
     * where the issue occurs.  Only meaningful if line is nonzero.
     * </pre>
     *
     * <code>int32 column = 4 [json_name = "column"];</code>
     * @return The column.
     */
    @java.lang.Override
    public int getColumn() {
      return column_;
    }
    /**
     * <pre>
     * The 0-based index of the starting position within the line of source text
     * where the issue occurs.  Only meaningful if line is nonzero.
     * </pre>
     *
     * <code>int32 column = 4 [json_name = "column"];</code>
     * @param value The column to set.
     * @return This builder for chaining.
     */
    public Builder setColumn(int value) {
      
      column_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The 0-based index of the starting position within the line of source text
     * where the issue occurs.  Only meaningful if line is nonzero.
     * </pre>
     *
     * <code>int32 column = 4 [json_name = "column"];</code>
     * @return This builder for chaining.
     */
    public Builder clearColumn() {
      
      column_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.api.expr.v1alpha1.SourcePosition)
  }

  // @@protoc_insertion_point(class_scope:google.api.expr.v1alpha1.SourcePosition)
  private static final com.google.api.expr.v1alpha1.SourcePosition DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.expr.v1alpha1.SourcePosition();
  }

  public static com.google.api.expr.v1alpha1.SourcePosition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SourcePosition>
      PARSER = new com.google.protobuf.AbstractParser<SourcePosition>() {
    @java.lang.Override
    public SourcePosition parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SourcePosition(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SourcePosition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SourcePosition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.expr.v1alpha1.SourcePosition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

