// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reflectionV1Alpha.proto

package io.grpc.reflection.v1alpha;

/**
 * <pre>
 * A list of extension numbers sent by the server answering
 * all_extension_numbers_of_type request.
 * </pre>
 *
 * Protobuf type {@code grpc.reflection.v1alpha.ExtensionNumberResponse}
 */
public final class ExtensionNumberResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.reflection.v1alpha.ExtensionNumberResponse)
    ExtensionNumberResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExtensionNumberResponse.newBuilder() to construct.
  private ExtensionNumberResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExtensionNumberResponse() {
    baseTypeName_ = "";
    extensionNumber_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExtensionNumberResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ExtensionNumberResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ExtensionNumberResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.reflection.v1alpha.ExtensionNumberResponse.class, io.grpc.reflection.v1alpha.ExtensionNumberResponse.Builder.class);
  }

  public static final int BASE_TYPE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object baseTypeName_ = "";
  /**
   * <pre>
   * Full name of the base type, including the package name. The format
   * is &lt;package&gt;.&lt;type&gt;
   * </pre>
   *
   * <code>string base_type_name = 1;</code>
   * @return The baseTypeName.
   */
  @java.lang.Override
  public java.lang.String getBaseTypeName() {
    java.lang.Object ref = baseTypeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      baseTypeName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Full name of the base type, including the package name. The format
   * is &lt;package&gt;.&lt;type&gt;
   * </pre>
   *
   * <code>string base_type_name = 1;</code>
   * @return The bytes for baseTypeName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBaseTypeNameBytes() {
    java.lang.Object ref = baseTypeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      baseTypeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTENSION_NUMBER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList extensionNumber_;
  /**
   * <code>repeated int32 extension_number = 2;</code>
   * @return A list containing the extensionNumber.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getExtensionNumberList() {
    return extensionNumber_;
  }
  /**
   * <code>repeated int32 extension_number = 2;</code>
   * @return The count of extensionNumber.
   */
  public int getExtensionNumberCount() {
    return extensionNumber_.size();
  }
  /**
   * <code>repeated int32 extension_number = 2;</code>
   * @param index The index of the element to return.
   * @return The extensionNumber at the given index.
   */
  public int getExtensionNumber(int index) {
    return extensionNumber_.getInt(index);
  }
  private int extensionNumberMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(baseTypeName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, baseTypeName_);
    }
    if (getExtensionNumberList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(extensionNumberMemoizedSerializedSize);
    }
    for (int i = 0; i < extensionNumber_.size(); i++) {
      output.writeInt32NoTag(extensionNumber_.getInt(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(baseTypeName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, baseTypeName_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < extensionNumber_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(extensionNumber_.getInt(i));
      }
      size += dataSize;
      if (!getExtensionNumberList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      extensionNumberMemoizedSerializedSize = dataSize;
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.reflection.v1alpha.ExtensionNumberResponse)) {
      return super.equals(obj);
    }
    io.grpc.reflection.v1alpha.ExtensionNumberResponse other = (io.grpc.reflection.v1alpha.ExtensionNumberResponse) obj;

    if (!getBaseTypeName()
        .equals(other.getBaseTypeName())) return false;
    if (!getExtensionNumberList()
        .equals(other.getExtensionNumberList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BASE_TYPE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getBaseTypeName().hashCode();
    if (getExtensionNumberCount() > 0) {
      hash = (37 * hash) + EXTENSION_NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getExtensionNumberList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(
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
  public static Builder newBuilder(io.grpc.reflection.v1alpha.ExtensionNumberResponse prototype) {
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
   * A list of extension numbers sent by the server answering
   * all_extension_numbers_of_type request.
   * </pre>
   *
   * Protobuf type {@code grpc.reflection.v1alpha.ExtensionNumberResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.reflection.v1alpha.ExtensionNumberResponse)
      io.grpc.reflection.v1alpha.ExtensionNumberResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ExtensionNumberResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ExtensionNumberResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.reflection.v1alpha.ExtensionNumberResponse.class, io.grpc.reflection.v1alpha.ExtensionNumberResponse.Builder.class);
    }

    // Construct using io.grpc.reflection.v1alpha.ExtensionNumberResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      baseTypeName_ = "";
      extensionNumber_ = emptyIntList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ExtensionNumberResponse_descriptor;
    }

    @java.lang.Override
    public io.grpc.reflection.v1alpha.ExtensionNumberResponse getDefaultInstanceForType() {
      return io.grpc.reflection.v1alpha.ExtensionNumberResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.reflection.v1alpha.ExtensionNumberResponse build() {
      io.grpc.reflection.v1alpha.ExtensionNumberResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.reflection.v1alpha.ExtensionNumberResponse buildPartial() {
      io.grpc.reflection.v1alpha.ExtensionNumberResponse result = new io.grpc.reflection.v1alpha.ExtensionNumberResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(io.grpc.reflection.v1alpha.ExtensionNumberResponse result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        extensionNumber_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.extensionNumber_ = extensionNumber_;
    }

    private void buildPartial0(io.grpc.reflection.v1alpha.ExtensionNumberResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.baseTypeName_ = baseTypeName_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.reflection.v1alpha.ExtensionNumberResponse) {
        return mergeFrom((io.grpc.reflection.v1alpha.ExtensionNumberResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.reflection.v1alpha.ExtensionNumberResponse other) {
      if (other == io.grpc.reflection.v1alpha.ExtensionNumberResponse.getDefaultInstance()) return this;
      if (!other.getBaseTypeName().isEmpty()) {
        baseTypeName_ = other.baseTypeName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.extensionNumber_.isEmpty()) {
        if (extensionNumber_.isEmpty()) {
          extensionNumber_ = other.extensionNumber_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureExtensionNumberIsMutable();
          extensionNumber_.addAll(other.extensionNumber_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              baseTypeName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              int v = input.readInt32();
              ensureExtensionNumberIsMutable();
              extensionNumber_.addInt(v);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureExtensionNumberIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                extensionNumber_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object baseTypeName_ = "";
    /**
     * <pre>
     * Full name of the base type, including the package name. The format
     * is &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string base_type_name = 1;</code>
     * @return The baseTypeName.
     */
    public java.lang.String getBaseTypeName() {
      java.lang.Object ref = baseTypeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        baseTypeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Full name of the base type, including the package name. The format
     * is &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string base_type_name = 1;</code>
     * @return The bytes for baseTypeName.
     */
    public com.google.protobuf.ByteString
        getBaseTypeNameBytes() {
      java.lang.Object ref = baseTypeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        baseTypeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Full name of the base type, including the package name. The format
     * is &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string base_type_name = 1;</code>
     * @param value The baseTypeName to set.
     * @return This builder for chaining.
     */
    public Builder setBaseTypeName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      baseTypeName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Full name of the base type, including the package name. The format
     * is &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string base_type_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBaseTypeName() {
      baseTypeName_ = getDefaultInstance().getBaseTypeName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Full name of the base type, including the package name. The format
     * is &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string base_type_name = 1;</code>
     * @param value The bytes for baseTypeName to set.
     * @return This builder for chaining.
     */
    public Builder setBaseTypeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      baseTypeName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList extensionNumber_ = emptyIntList();
    private void ensureExtensionNumberIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        extensionNumber_ = mutableCopy(extensionNumber_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <code>repeated int32 extension_number = 2;</code>
     * @return A list containing the extensionNumber.
     */
    public java.util.List<java.lang.Integer>
        getExtensionNumberList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(extensionNumber_) : extensionNumber_;
    }
    /**
     * <code>repeated int32 extension_number = 2;</code>
     * @return The count of extensionNumber.
     */
    public int getExtensionNumberCount() {
      return extensionNumber_.size();
    }
    /**
     * <code>repeated int32 extension_number = 2;</code>
     * @param index The index of the element to return.
     * @return The extensionNumber at the given index.
     */
    public int getExtensionNumber(int index) {
      return extensionNumber_.getInt(index);
    }
    /**
     * <code>repeated int32 extension_number = 2;</code>
     * @param index The index to set the value at.
     * @param value The extensionNumber to set.
     * @return This builder for chaining.
     */
    public Builder setExtensionNumber(
        int index, int value) {

      ensureExtensionNumberIsMutable();
      extensionNumber_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 extension_number = 2;</code>
     * @param value The extensionNumber to add.
     * @return This builder for chaining.
     */
    public Builder addExtensionNumber(int value) {

      ensureExtensionNumberIsMutable();
      extensionNumber_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 extension_number = 2;</code>
     * @param values The extensionNumber to add.
     * @return This builder for chaining.
     */
    public Builder addAllExtensionNumber(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureExtensionNumberIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, extensionNumber_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 extension_number = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExtensionNumber() {
      extensionNumber_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:grpc.reflection.v1alpha.ExtensionNumberResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.reflection.v1alpha.ExtensionNumberResponse)
  private static final io.grpc.reflection.v1alpha.ExtensionNumberResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.reflection.v1alpha.ExtensionNumberResponse();
  }

  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExtensionNumberResponse>
      PARSER = new com.google.protobuf.AbstractParser<ExtensionNumberResponse>() {
    @java.lang.Override
    public ExtensionNumberResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ExtensionNumberResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExtensionNumberResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.reflection.v1alpha.ExtensionNumberResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

