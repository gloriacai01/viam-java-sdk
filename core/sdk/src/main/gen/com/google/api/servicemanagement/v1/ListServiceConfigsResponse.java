// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

/**
 * <pre>
 * Response message for ListServiceConfigs method.
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.ListServiceConfigsResponse}
 */
public final class ListServiceConfigsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.ListServiceConfigsResponse)
    ListServiceConfigsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListServiceConfigsResponse.newBuilder() to construct.
  private ListServiceConfigsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListServiceConfigsResponse() {
    serviceConfigs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListServiceConfigsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListServiceConfigsResponse(
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
              serviceConfigs_ = new java.util.ArrayList<com.google.api.Service>();
              mutable_bitField0_ |= 0x00000001;
            }
            serviceConfigs_.add(
                input.readMessage(com.google.api.Service.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
        serviceConfigs_ = java.util.Collections.unmodifiableList(serviceConfigs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_ListServiceConfigsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_ListServiceConfigsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.servicemanagement.v1.ListServiceConfigsResponse.class, com.google.api.servicemanagement.v1.ListServiceConfigsResponse.Builder.class);
  }

  public static final int SERVICE_CONFIGS_FIELD_NUMBER = 1;
  private java.util.List<com.google.api.Service> serviceConfigs_;
  /**
   * <pre>
   * The list of service configuration resources.
   * </pre>
   *
   * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.Service> getServiceConfigsList() {
    return serviceConfigs_;
  }
  /**
   * <pre>
   * The list of service configuration resources.
   * </pre>
   *
   * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.api.ServiceOrBuilder> 
      getServiceConfigsOrBuilderList() {
    return serviceConfigs_;
  }
  /**
   * <pre>
   * The list of service configuration resources.
   * </pre>
   *
   * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
   */
  @java.lang.Override
  public int getServiceConfigsCount() {
    return serviceConfigs_.size();
  }
  /**
   * <pre>
   * The list of service configuration resources.
   * </pre>
   *
   * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
   */
  @java.lang.Override
  public com.google.api.Service getServiceConfigs(int index) {
    return serviceConfigs_.get(index);
  }
  /**
   * <pre>
   * The list of service configuration resources.
   * </pre>
   *
   * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
   */
  @java.lang.Override
  public com.google.api.ServiceOrBuilder getServiceConfigsOrBuilder(
      int index) {
    return serviceConfigs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * The token of the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The token of the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < serviceConfigs_.size(); i++) {
      output.writeMessage(1, serviceConfigs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < serviceConfigs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, serviceConfigs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.api.servicemanagement.v1.ListServiceConfigsResponse)) {
      return super.equals(obj);
    }
    com.google.api.servicemanagement.v1.ListServiceConfigsResponse other = (com.google.api.servicemanagement.v1.ListServiceConfigsResponse) obj;

    if (!getServiceConfigsList()
        .equals(other.getServiceConfigsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getServiceConfigsCount() > 0) {
      hash = (37 * hash) + SERVICE_CONFIGS_FIELD_NUMBER;
      hash = (53 * hash) + getServiceConfigsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.servicemanagement.v1.ListServiceConfigsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.servicemanagement.v1.ListServiceConfigsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServiceConfigsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.servicemanagement.v1.ListServiceConfigsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServiceConfigsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.servicemanagement.v1.ListServiceConfigsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServiceConfigsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.servicemanagement.v1.ListServiceConfigsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServiceConfigsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.servicemanagement.v1.ListServiceConfigsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServiceConfigsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.servicemanagement.v1.ListServiceConfigsResponse parseFrom(
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
  public static Builder newBuilder(com.google.api.servicemanagement.v1.ListServiceConfigsResponse prototype) {
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
   * Response message for ListServiceConfigs method.
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.ListServiceConfigsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.ListServiceConfigsResponse)
      com.google.api.servicemanagement.v1.ListServiceConfigsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_ListServiceConfigsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_ListServiceConfigsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.servicemanagement.v1.ListServiceConfigsResponse.class, com.google.api.servicemanagement.v1.ListServiceConfigsResponse.Builder.class);
    }

    // Construct using com.google.api.servicemanagement.v1.ListServiceConfigsResponse.newBuilder()
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
        getServiceConfigsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (serviceConfigsBuilder_ == null) {
        serviceConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        serviceConfigsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_ListServiceConfigsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.ListServiceConfigsResponse getDefaultInstanceForType() {
      return com.google.api.servicemanagement.v1.ListServiceConfigsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.ListServiceConfigsResponse build() {
      com.google.api.servicemanagement.v1.ListServiceConfigsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.ListServiceConfigsResponse buildPartial() {
      com.google.api.servicemanagement.v1.ListServiceConfigsResponse result = new com.google.api.servicemanagement.v1.ListServiceConfigsResponse(this);
      int from_bitField0_ = bitField0_;
      if (serviceConfigsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          serviceConfigs_ = java.util.Collections.unmodifiableList(serviceConfigs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.serviceConfigs_ = serviceConfigs_;
      } else {
        result.serviceConfigs_ = serviceConfigsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.api.servicemanagement.v1.ListServiceConfigsResponse) {
        return mergeFrom((com.google.api.servicemanagement.v1.ListServiceConfigsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.servicemanagement.v1.ListServiceConfigsResponse other) {
      if (other == com.google.api.servicemanagement.v1.ListServiceConfigsResponse.getDefaultInstance()) return this;
      if (serviceConfigsBuilder_ == null) {
        if (!other.serviceConfigs_.isEmpty()) {
          if (serviceConfigs_.isEmpty()) {
            serviceConfigs_ = other.serviceConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureServiceConfigsIsMutable();
            serviceConfigs_.addAll(other.serviceConfigs_);
          }
          onChanged();
        }
      } else {
        if (!other.serviceConfigs_.isEmpty()) {
          if (serviceConfigsBuilder_.isEmpty()) {
            serviceConfigsBuilder_.dispose();
            serviceConfigsBuilder_ = null;
            serviceConfigs_ = other.serviceConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            serviceConfigsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getServiceConfigsFieldBuilder() : null;
          } else {
            serviceConfigsBuilder_.addAllMessages(other.serviceConfigs_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      com.google.api.servicemanagement.v1.ListServiceConfigsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.servicemanagement.v1.ListServiceConfigsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.api.Service> serviceConfigs_ =
      java.util.Collections.emptyList();
    private void ensureServiceConfigsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        serviceConfigs_ = new java.util.ArrayList<com.google.api.Service>(serviceConfigs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.Service, com.google.api.Service.Builder, com.google.api.ServiceOrBuilder> serviceConfigsBuilder_;

    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public java.util.List<com.google.api.Service> getServiceConfigsList() {
      if (serviceConfigsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(serviceConfigs_);
      } else {
        return serviceConfigsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public int getServiceConfigsCount() {
      if (serviceConfigsBuilder_ == null) {
        return serviceConfigs_.size();
      } else {
        return serviceConfigsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public com.google.api.Service getServiceConfigs(int index) {
      if (serviceConfigsBuilder_ == null) {
        return serviceConfigs_.get(index);
      } else {
        return serviceConfigsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public Builder setServiceConfigs(
        int index, com.google.api.Service value) {
      if (serviceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceConfigsIsMutable();
        serviceConfigs_.set(index, value);
        onChanged();
      } else {
        serviceConfigsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public Builder setServiceConfigs(
        int index, com.google.api.Service.Builder builderForValue) {
      if (serviceConfigsBuilder_ == null) {
        ensureServiceConfigsIsMutable();
        serviceConfigs_.set(index, builderForValue.build());
        onChanged();
      } else {
        serviceConfigsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public Builder addServiceConfigs(com.google.api.Service value) {
      if (serviceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceConfigsIsMutable();
        serviceConfigs_.add(value);
        onChanged();
      } else {
        serviceConfigsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public Builder addServiceConfigs(
        int index, com.google.api.Service value) {
      if (serviceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceConfigsIsMutable();
        serviceConfigs_.add(index, value);
        onChanged();
      } else {
        serviceConfigsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public Builder addServiceConfigs(
        com.google.api.Service.Builder builderForValue) {
      if (serviceConfigsBuilder_ == null) {
        ensureServiceConfigsIsMutable();
        serviceConfigs_.add(builderForValue.build());
        onChanged();
      } else {
        serviceConfigsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public Builder addServiceConfigs(
        int index, com.google.api.Service.Builder builderForValue) {
      if (serviceConfigsBuilder_ == null) {
        ensureServiceConfigsIsMutable();
        serviceConfigs_.add(index, builderForValue.build());
        onChanged();
      } else {
        serviceConfigsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public Builder addAllServiceConfigs(
        java.lang.Iterable<? extends com.google.api.Service> values) {
      if (serviceConfigsBuilder_ == null) {
        ensureServiceConfigsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, serviceConfigs_);
        onChanged();
      } else {
        serviceConfigsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public Builder clearServiceConfigs() {
      if (serviceConfigsBuilder_ == null) {
        serviceConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        serviceConfigsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public Builder removeServiceConfigs(int index) {
      if (serviceConfigsBuilder_ == null) {
        ensureServiceConfigsIsMutable();
        serviceConfigs_.remove(index);
        onChanged();
      } else {
        serviceConfigsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public com.google.api.Service.Builder getServiceConfigsBuilder(
        int index) {
      return getServiceConfigsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public com.google.api.ServiceOrBuilder getServiceConfigsOrBuilder(
        int index) {
      if (serviceConfigsBuilder_ == null) {
        return serviceConfigs_.get(index);  } else {
        return serviceConfigsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public java.util.List<? extends com.google.api.ServiceOrBuilder> 
         getServiceConfigsOrBuilderList() {
      if (serviceConfigsBuilder_ != null) {
        return serviceConfigsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(serviceConfigs_);
      }
    }
    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public com.google.api.Service.Builder addServiceConfigsBuilder() {
      return getServiceConfigsFieldBuilder().addBuilder(
          com.google.api.Service.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public com.google.api.Service.Builder addServiceConfigsBuilder(
        int index) {
      return getServiceConfigsFieldBuilder().addBuilder(
          index, com.google.api.Service.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of service configuration resources.
     * </pre>
     *
     * <code>repeated .google.api.Service service_configs = 1 [json_name = "serviceConfigs"];</code>
     */
    public java.util.List<com.google.api.Service.Builder> 
         getServiceConfigsBuilderList() {
      return getServiceConfigsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.Service, com.google.api.Service.Builder, com.google.api.ServiceOrBuilder> 
        getServiceConfigsFieldBuilder() {
      if (serviceConfigsBuilder_ == null) {
        serviceConfigsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.Service, com.google.api.Service.Builder, com.google.api.ServiceOrBuilder>(
                serviceConfigs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        serviceConfigs_ = null;
      }
      return serviceConfigsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The token of the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The token of the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The token of the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The token of the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The token of the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.ListServiceConfigsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.ListServiceConfigsResponse)
  private static final com.google.api.servicemanagement.v1.ListServiceConfigsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.servicemanagement.v1.ListServiceConfigsResponse();
  }

  public static com.google.api.servicemanagement.v1.ListServiceConfigsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListServiceConfigsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListServiceConfigsResponse>() {
    @java.lang.Override
    public ListServiceConfigsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListServiceConfigsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListServiceConfigsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListServiceConfigsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.servicemanagement.v1.ListServiceConfigsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

