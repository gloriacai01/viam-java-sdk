// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/rpc/examples/fileupload/v1/fileupload.proto
// Protobuf Java Version: 4.27.2

package proto.rpc.examples.fileupload.v1;

public final class Fileupload {
  private Fileupload() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface UploadFileRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.rpc.examples.fileupload.v1.UploadFileRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>bytes chunk_data = 2 [json_name = "chunkData"];</code>
     * @return Whether the chunkData field is set.
     */
    boolean hasChunkData();
    /**
     * <code>bytes chunk_data = 2 [json_name = "chunkData"];</code>
     * @return The chunkData.
     */
    com.google.protobuf.ByteString getChunkData();

    public proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest.DataCase getDataCase();
  }
  /**
   * Protobuf type {@code proto.rpc.examples.fileupload.v1.UploadFileRequest}
   */
  public  static final class UploadFileRequest extends
      com.google.protobuf.GeneratedMessageLite<
          UploadFileRequest, UploadFileRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.rpc.examples.fileupload.v1.UploadFileRequest)
      UploadFileRequestOrBuilder {
    private UploadFileRequest() {
    }
    private int dataCase_ = 0;
    private java.lang.Object data_;
    public enum DataCase {
      NAME(1),
      CHUNK_DATA(2),
      DATA_NOT_SET(0);
      private final int value;
      private DataCase(int value) {
        this.value = value;
      }
      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static DataCase valueOf(int value) {
        return forNumber(value);
      }

      public static DataCase forNumber(int value) {
        switch (value) {
          case 1: return NAME;
          case 2: return CHUNK_DATA;
          case 0: return DATA_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    @java.lang.Override
    public DataCase
    getDataCase() {
      return DataCase.forNumber(
          dataCase_);
    }

    private void clearData() {
      dataCase_ = 0;
      data_ = null;
    }

    public static final int NAME_FIELD_NUMBER = 1;
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return dataCase_ == 1;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.String ref = "";
      if (dataCase_ == 1) {
        ref = (java.lang.String) data_;
      }
      return ref;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.String ref = "";
      if (dataCase_ == 1) {
        ref = (java.lang.String) data_;
      }
      return com.google.protobuf.ByteString.copyFromUtf8(ref);
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     */
    private void setName(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  dataCase_ = 1;
      data_ = value;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     */
    private void clearName() {
      if (dataCase_ == 1) {
        dataCase_ = 0;
        data_ = null;
      }
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     */
    private void setNameBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      data_ = value.toStringUtf8();
      dataCase_ = 1;
    }

    public static final int CHUNK_DATA_FIELD_NUMBER = 2;
    /**
     * <code>bytes chunk_data = 2 [json_name = "chunkData"];</code>
     * @return Whether the chunkData field is set.
     */
    @java.lang.Override
    public boolean hasChunkData() {
      return dataCase_ == 2;
    }
    /**
     * <code>bytes chunk_data = 2 [json_name = "chunkData"];</code>
     * @return The chunkData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getChunkData() {
      if (dataCase_ == 2) {
        return (com.google.protobuf.ByteString) data_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <code>bytes chunk_data = 2 [json_name = "chunkData"];</code>
     * @param value The chunkData to set.
     */
    private void setChunkData(com.google.protobuf.ByteString value) {
      java.lang.Class<?> valueClass = value.getClass();
  dataCase_ = 2;
      data_ = value;
    }
    /**
     * <code>bytes chunk_data = 2 [json_name = "chunkData"];</code>
     */
    private void clearChunkData() {
      if (dataCase_ == 2) {
        dataCase_ = 0;
        data_ = null;
      }
    }

    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest prototype) {
      return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code proto.rpc.examples.fileupload.v1.UploadFileRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.rpc.examples.fileupload.v1.UploadFileRequest)
        proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequestOrBuilder {
      // Construct using proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }

      @java.lang.Override
      public DataCase
          getDataCase() {
        return instance.getDataCase();
      }

      public Builder clearData() {
        copyOnWrite();
        instance.clearData();
        return this;
      }


      /**
       * <code>string name = 1 [json_name = "name"];</code>
       * @return Whether the name field is set.
       */
      @java.lang.Override
      public boolean hasName() {
        return instance.hasName();
      }
      /**
       * <code>string name = 1 [json_name = "name"];</code>
       * @return The name.
       */
      @java.lang.Override
      public java.lang.String getName() {
        return instance.getName();
      }
      /**
       * <code>string name = 1 [json_name = "name"];</code>
       * @return The bytes for name.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getNameBytes() {
        return instance.getNameBytes();
      }
      /**
       * <code>string name = 1 [json_name = "name"];</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        copyOnWrite();
        instance.setName(value);
        return this;
      }
      /**
       * <code>string name = 1 [json_name = "name"];</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        copyOnWrite();
        instance.clearName();
        return this;
      }
      /**
       * <code>string name = 1 [json_name = "name"];</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setNameBytes(value);
        return this;
      }

      /**
       * <code>bytes chunk_data = 2 [json_name = "chunkData"];</code>
       * @return Whether the chunkData field is set.
       */
      @java.lang.Override
      public boolean hasChunkData() {
        return instance.hasChunkData();
      }
      /**
       * <code>bytes chunk_data = 2 [json_name = "chunkData"];</code>
       * @return The chunkData.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getChunkData() {
        return instance.getChunkData();
      }
      /**
       * <code>bytes chunk_data = 2 [json_name = "chunkData"];</code>
       * @param value The chunkData to set.
       * @return This builder for chaining.
       */
      public Builder setChunkData(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setChunkData(value);
        return this;
      }
      /**
       * <code>bytes chunk_data = 2 [json_name = "chunkData"];</code>
       * @return This builder for chaining.
       */
      public Builder clearChunkData() {
        copyOnWrite();
        instance.clearChunkData();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.rpc.examples.fileupload.v1.UploadFileRequest)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "data_",
              "dataCase_",
            };
            java.lang.String info =
                "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u023b\u0000\u0002" +
                "=\u0000";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest> parser = PARSER;
          if (parser == null) {
            synchronized (proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:proto.rpc.examples.fileupload.v1.UploadFileRequest)
    private static final proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest DEFAULT_INSTANCE;
    static {
      UploadFileRequest defaultInstance = new UploadFileRequest();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        UploadFileRequest.class, defaultInstance);
    }

    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<UploadFileRequest> PARSER;

    public static com.google.protobuf.Parser<UploadFileRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface UploadFileResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.rpc.examples.fileupload.v1.UploadFileResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>int64 size = 2 [json_name = "size"];</code>
     * @return The size.
     */
    long getSize();
  }
  /**
   * Protobuf type {@code proto.rpc.examples.fileupload.v1.UploadFileResponse}
   */
  public  static final class UploadFileResponse extends
      com.google.protobuf.GeneratedMessageLite<
          UploadFileResponse, UploadFileResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.rpc.examples.fileupload.v1.UploadFileResponse)
      UploadFileResponseOrBuilder {
    private UploadFileResponse() {
      name_ = "";
    }
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.String name_;
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return name_;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(name_);
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     */
    private void setName(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      name_ = value;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     */
    private void clearName() {

      name_ = getDefaultInstance().getName();
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     */
    private void setNameBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      name_ = value.toStringUtf8();

    }

    public static final int SIZE_FIELD_NUMBER = 2;
    private long size_;
    /**
     * <code>int64 size = 2 [json_name = "size"];</code>
     * @return The size.
     */
    @java.lang.Override
    public long getSize() {
      return size_;
    }
    /**
     * <code>int64 size = 2 [json_name = "size"];</code>
     * @param value The size to set.
     */
    private void setSize(long value) {
      
      size_ = value;
    }
    /**
     * <code>int64 size = 2 [json_name = "size"];</code>
     */
    private void clearSize() {

      size_ = 0L;
    }

    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse prototype) {
      return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code proto.rpc.examples.fileupload.v1.UploadFileResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.rpc.examples.fileupload.v1.UploadFileResponse)
        proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponseOrBuilder {
      // Construct using proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>string name = 1 [json_name = "name"];</code>
       * @return The name.
       */
      @java.lang.Override
      public java.lang.String getName() {
        return instance.getName();
      }
      /**
       * <code>string name = 1 [json_name = "name"];</code>
       * @return The bytes for name.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getNameBytes() {
        return instance.getNameBytes();
      }
      /**
       * <code>string name = 1 [json_name = "name"];</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        copyOnWrite();
        instance.setName(value);
        return this;
      }
      /**
       * <code>string name = 1 [json_name = "name"];</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        copyOnWrite();
        instance.clearName();
        return this;
      }
      /**
       * <code>string name = 1 [json_name = "name"];</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setNameBytes(value);
        return this;
      }

      /**
       * <code>int64 size = 2 [json_name = "size"];</code>
       * @return The size.
       */
      @java.lang.Override
      public long getSize() {
        return instance.getSize();
      }
      /**
       * <code>int64 size = 2 [json_name = "size"];</code>
       * @param value The size to set.
       * @return This builder for chaining.
       */
      public Builder setSize(long value) {
        copyOnWrite();
        instance.setSize(value);
        return this;
      }
      /**
       * <code>int64 size = 2 [json_name = "size"];</code>
       * @return This builder for chaining.
       */
      public Builder clearSize() {
        copyOnWrite();
        instance.clearSize();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.rpc.examples.fileupload.v1.UploadFileResponse)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "name_",
              "size_",
            };
            java.lang.String info =
                "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0002" +
                "";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse> parser = PARSER;
          if (parser == null) {
            synchronized (proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:proto.rpc.examples.fileupload.v1.UploadFileResponse)
    private static final proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse DEFAULT_INSTANCE;
    static {
      UploadFileResponse defaultInstance = new UploadFileResponse();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        UploadFileResponse.class, defaultInstance);
    }

    public static proto.rpc.examples.fileupload.v1.Fileupload.UploadFileResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<UploadFileResponse> PARSER;

    public static com.google.protobuf.Parser<UploadFileResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
