// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/context.proto

package com.google.api;

/**
 * <pre>
 * `Context` defines which contexts an API requests.
 * Example:
 *     context:
 *       rules:
 *       - selector: "*"
 *         requested:
 *         - google.rpc.context.ProjectContext
 *         - google.rpc.context.OriginContext
 * The above specifies that all methods in the API request
 * `google.rpc.context.ProjectContext` and
 * `google.rpc.context.OriginContext`.
 * Available context types are defined in package
 * `google.rpc.context`.
 * This also provides mechanism to allowlist any protobuf message extension that
 * can be sent in grpc metadata using “x-goog-ext-&lt;extension_id&gt;-bin” and
 * “x-goog-ext-&lt;extension_id&gt;-jspb” format. For example, list any service
 * specific protobuf types that can appear in grpc metadata as follows in your
 * yaml file:
 * Example:
 *     context:
 *       rules:
 *        - selector: "google.example.library.v1.LibraryService.CreateBook"
 *          allowed_request_extensions:
 *          - google.foo.v1.NewExtension
 *          allowed_response_extensions:
 *          - google.foo.v1.NewExtension
 * You can also specify extension ID instead of fully qualified extension name
 * here.
 * </pre>
 *
 * Protobuf type {@code google.api.Context}
 */
public final class Context extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.Context)
    ContextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Context.newBuilder() to construct.
  private Context(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Context() {
    rules_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Context();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Context(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              rules_ = new java.util.ArrayList<com.google.api.ContextRule>();
              mutable_bitField0_ |= 0x00000001;
            }
            rules_.add(
                input.readMessage(com.google.api.ContextRule.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        rules_ = java.util.Collections.unmodifiableList(rules_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.ContextProto.internal_static_google_api_Context_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.ContextProto.internal_static_google_api_Context_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.Context.class, com.google.api.Context.Builder.class);
  }

  public static final int RULES_FIELD_NUMBER = 1;
  private java.util.List<com.google.api.ContextRule> rules_;
  /**
   * <pre>
   * A list of RPC context rules that apply to individual API methods.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.ContextRule> getRulesList() {
    return rules_;
  }
  /**
   * <pre>
   * A list of RPC context rules that apply to individual API methods.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.api.ContextRuleOrBuilder> 
      getRulesOrBuilderList() {
    return rules_;
  }
  /**
   * <pre>
   * A list of RPC context rules that apply to individual API methods.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
   */
  @java.lang.Override
  public int getRulesCount() {
    return rules_.size();
  }
  /**
   * <pre>
   * A list of RPC context rules that apply to individual API methods.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
   */
  @java.lang.Override
  public com.google.api.ContextRule getRules(int index) {
    return rules_.get(index);
  }
  /**
   * <pre>
   * A list of RPC context rules that apply to individual API methods.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
   */
  @java.lang.Override
  public com.google.api.ContextRuleOrBuilder getRulesOrBuilder(
      int index) {
    return rules_.get(index);
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
    for (int i = 0; i < rules_.size(); i++) {
      output.writeMessage(1, rules_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rules_.get(i));
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
    if (!(obj instanceof com.google.api.Context)) {
      return super.equals(obj);
    }
    com.google.api.Context other = (com.google.api.Context) obj;

    if (!getRulesList()
        .equals(other.getRulesList())) return false;
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
    if (getRulesCount() > 0) {
      hash = (37 * hash) + RULES_FIELD_NUMBER;
      hash = (53 * hash) + getRulesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.Context parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Context parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Context parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Context parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Context parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Context parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Context parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.Context parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.Context parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.Context parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.Context parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.Context parseFrom(
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
  public static Builder newBuilder(com.google.api.Context prototype) {
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
   * `Context` defines which contexts an API requests.
   * Example:
   *     context:
   *       rules:
   *       - selector: "*"
   *         requested:
   *         - google.rpc.context.ProjectContext
   *         - google.rpc.context.OriginContext
   * The above specifies that all methods in the API request
   * `google.rpc.context.ProjectContext` and
   * `google.rpc.context.OriginContext`.
   * Available context types are defined in package
   * `google.rpc.context`.
   * This also provides mechanism to allowlist any protobuf message extension that
   * can be sent in grpc metadata using “x-goog-ext-&lt;extension_id&gt;-bin” and
   * “x-goog-ext-&lt;extension_id&gt;-jspb” format. For example, list any service
   * specific protobuf types that can appear in grpc metadata as follows in your
   * yaml file:
   * Example:
   *     context:
   *       rules:
   *        - selector: "google.example.library.v1.LibraryService.CreateBook"
   *          allowed_request_extensions:
   *          - google.foo.v1.NewExtension
   *          allowed_response_extensions:
   *          - google.foo.v1.NewExtension
   * You can also specify extension ID instead of fully qualified extension name
   * here.
   * </pre>
   *
   * Protobuf type {@code google.api.Context}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.Context)
      com.google.api.ContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.ContextProto.internal_static_google_api_Context_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.ContextProto.internal_static_google_api_Context_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.Context.class, com.google.api.Context.Builder.class);
    }

    // Construct using com.google.api.Context.newBuilder()
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
        getRulesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.ContextProto.internal_static_google_api_Context_descriptor;
    }

    @java.lang.Override
    public com.google.api.Context getDefaultInstanceForType() {
      return com.google.api.Context.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.Context build() {
      com.google.api.Context result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.Context buildPartial() {
      com.google.api.Context result = new com.google.api.Context(this);
      int from_bitField0_ = bitField0_;
      if (rulesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rules_ = java.util.Collections.unmodifiableList(rules_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rules_ = rules_;
      } else {
        result.rules_ = rulesBuilder_.build();
      }
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
      if (other instanceof com.google.api.Context) {
        return mergeFrom((com.google.api.Context)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.Context other) {
      if (other == com.google.api.Context.getDefaultInstance()) return this;
      if (rulesBuilder_ == null) {
        if (!other.rules_.isEmpty()) {
          if (rules_.isEmpty()) {
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRulesIsMutable();
            rules_.addAll(other.rules_);
          }
          onChanged();
        }
      } else {
        if (!other.rules_.isEmpty()) {
          if (rulesBuilder_.isEmpty()) {
            rulesBuilder_.dispose();
            rulesBuilder_ = null;
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rulesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRulesFieldBuilder() : null;
          } else {
            rulesBuilder_.addAllMessages(other.rules_);
          }
        }
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
      com.google.api.Context parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.Context) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.api.ContextRule> rules_ =
      java.util.Collections.emptyList();
    private void ensureRulesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rules_ = new java.util.ArrayList<com.google.api.ContextRule>(rules_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.ContextRule, com.google.api.ContextRule.Builder, com.google.api.ContextRuleOrBuilder> rulesBuilder_;

    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public java.util.List<com.google.api.ContextRule> getRulesList() {
      if (rulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rules_);
      } else {
        return rulesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public int getRulesCount() {
      if (rulesBuilder_ == null) {
        return rules_.size();
      } else {
        return rulesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public com.google.api.ContextRule getRules(int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);
      } else {
        return rulesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder setRules(
        int index, com.google.api.ContextRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.set(index, value);
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder setRules(
        int index, com.google.api.ContextRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.set(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder addRules(com.google.api.ContextRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder addRules(
        int index, com.google.api.ContextRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(index, value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder addRules(
        com.google.api.ContextRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder addRules(
        int index, com.google.api.ContextRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder addAllRules(
        java.lang.Iterable<? extends com.google.api.ContextRule> values) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rules_);
        onChanged();
      } else {
        rulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder clearRules() {
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder removeRules(int index) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.remove(index);
        onChanged();
      } else {
        rulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public com.google.api.ContextRule.Builder getRulesBuilder(
        int index) {
      return getRulesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public com.google.api.ContextRuleOrBuilder getRulesOrBuilder(
        int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);  } else {
        return rulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public java.util.List<? extends com.google.api.ContextRuleOrBuilder> 
         getRulesOrBuilderList() {
      if (rulesBuilder_ != null) {
        return rulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rules_);
      }
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public com.google.api.ContextRule.Builder addRulesBuilder() {
      return getRulesFieldBuilder().addBuilder(
          com.google.api.ContextRule.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public com.google.api.ContextRule.Builder addRulesBuilder(
        int index) {
      return getRulesFieldBuilder().addBuilder(
          index, com.google.api.ContextRule.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public java.util.List<com.google.api.ContextRule.Builder> 
         getRulesBuilderList() {
      return getRulesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.ContextRule, com.google.api.ContextRule.Builder, com.google.api.ContextRuleOrBuilder> 
        getRulesFieldBuilder() {
      if (rulesBuilder_ == null) {
        rulesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.ContextRule, com.google.api.ContextRule.Builder, com.google.api.ContextRuleOrBuilder>(
                rules_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        rules_ = null;
      }
      return rulesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.api.Context)
  }

  // @@protoc_insertion_point(class_scope:google.api.Context)
  private static final com.google.api.Context DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.Context();
  }

  public static com.google.api.Context getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Context>
      PARSER = new com.google.protobuf.AbstractParser<Context>() {
    @java.lang.Override
    public Context parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Context(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Context> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Context> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.Context getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

