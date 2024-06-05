// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reflectionV1Alpha.proto

package io.grpc.reflection.v1alpha;

/**
 * <pre>
 * The type name and extension number sent by the client when requesting
 * file_containing_extension.
 * </pre>
 *
 * Protobuf type {@code grpc.reflection.v1alpha.ExtensionRequest}
 */
public final class ExtensionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.reflection.v1alpha.ExtensionRequest)
    ExtensionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExtensionRequest.newBuilder() to construct.
  private ExtensionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExtensionRequest() {
    containingType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExtensionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ExtensionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ExtensionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.reflection.v1alpha.ExtensionRequest.class, io.grpc.reflection.v1alpha.ExtensionRequest.Builder.class);
  }

  public static final int CONTAINING_TYPE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object containingType_ = "";
  /**
   * <pre>
   * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
   * </pre>
   *
   * <code>string containing_type = 1;</code>
   * @return The containingType.
   */
  @java.lang.Override
  public java.lang.String getContainingType() {
    java.lang.Object ref = containingType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      containingType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
   * </pre>
   *
   * <code>string containing_type = 1;</code>
   * @return The bytes for containingType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContainingTypeBytes() {
    java.lang.Object ref = containingType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      containingType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTENSION_NUMBER_FIELD_NUMBER = 2;
  private int extensionNumber_ = 0;
  /**
   * <code>int32 extension_number = 2;</code>
   * @return The extensionNumber.
   */
  @java.lang.Override
  public int getExtensionNumber() {
    return extensionNumber_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(containingType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, containingType_);
    }
    if (extensionNumber_ != 0) {
      output.writeInt32(2, extensionNumber_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(containingType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, containingType_);
    }
    if (extensionNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, extensionNumber_);
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
    if (!(obj instanceof io.grpc.reflection.v1alpha.ExtensionRequest)) {
      return super.equals(obj);
    }
    io.grpc.reflection.v1alpha.ExtensionRequest other = (io.grpc.reflection.v1alpha.ExtensionRequest) obj;

    if (!getContainingType()
        .equals(other.getContainingType())) return false;
    if (getExtensionNumber()
        != other.getExtensionNumber()) return false;
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
    hash = (37 * hash) + CONTAINING_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getContainingType().hashCode();
    hash = (37 * hash) + EXTENSION_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getExtensionNumber();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.reflection.v1alpha.ExtensionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.reflection.v1alpha.ExtensionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ExtensionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.reflection.v1alpha.ExtensionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ExtensionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.reflection.v1alpha.ExtensionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ExtensionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.v1alpha.ExtensionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ExtensionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.v1alpha.ExtensionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ExtensionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.v1alpha.ExtensionRequest parseFrom(
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
  public static Builder newBuilder(io.grpc.reflection.v1alpha.ExtensionRequest prototype) {
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
   * The type name and extension number sent by the client when requesting
   * file_containing_extension.
   * </pre>
   *
   * Protobuf type {@code grpc.reflection.v1alpha.ExtensionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.reflection.v1alpha.ExtensionRequest)
      io.grpc.reflection.v1alpha.ExtensionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ExtensionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ExtensionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.reflection.v1alpha.ExtensionRequest.class, io.grpc.reflection.v1alpha.ExtensionRequest.Builder.class);
    }

    // Construct using io.grpc.reflection.v1alpha.ExtensionRequest.newBuilder()
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
      containingType_ = "";
      extensionNumber_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ExtensionRequest_descriptor;
    }

    @java.lang.Override
    public io.grpc.reflection.v1alpha.ExtensionRequest getDefaultInstanceForType() {
      return io.grpc.reflection.v1alpha.ExtensionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.reflection.v1alpha.ExtensionRequest build() {
      io.grpc.reflection.v1alpha.ExtensionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.reflection.v1alpha.ExtensionRequest buildPartial() {
      io.grpc.reflection.v1alpha.ExtensionRequest result = new io.grpc.reflection.v1alpha.ExtensionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grpc.reflection.v1alpha.ExtensionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.containingType_ = containingType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.extensionNumber_ = extensionNumber_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.reflection.v1alpha.ExtensionRequest) {
        return mergeFrom((io.grpc.reflection.v1alpha.ExtensionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.reflection.v1alpha.ExtensionRequest other) {
      if (other == io.grpc.reflection.v1alpha.ExtensionRequest.getDefaultInstance()) return this;
      if (!other.getContainingType().isEmpty()) {
        containingType_ = other.containingType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getExtensionNumber() != 0) {
        setExtensionNumber(other.getExtensionNumber());
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
              containingType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              extensionNumber_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object containingType_ = "";
    /**
     * <pre>
     * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string containing_type = 1;</code>
     * @return The containingType.
     */
    public java.lang.String getContainingType() {
      java.lang.Object ref = containingType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        containingType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string containing_type = 1;</code>
     * @return The bytes for containingType.
     */
    public com.google.protobuf.ByteString
        getContainingTypeBytes() {
      java.lang.Object ref = containingType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        containingType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string containing_type = 1;</code>
     * @param value The containingType to set.
     * @return This builder for chaining.
     */
    public Builder setContainingType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      containingType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string containing_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearContainingType() {
      containingType_ = getDefaultInstance().getContainingType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Fully-qualified type name. The format should be &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string containing_type = 1;</code>
     * @param value The bytes for containingType to set.
     * @return This builder for chaining.
     */
    public Builder setContainingTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      containingType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int extensionNumber_ ;
    /**
     * <code>int32 extension_number = 2;</code>
     * @return The extensionNumber.
     */
    @java.lang.Override
    public int getExtensionNumber() {
      return extensionNumber_;
    }
    /**
     * <code>int32 extension_number = 2;</code>
     * @param value The extensionNumber to set.
     * @return This builder for chaining.
     */
    public Builder setExtensionNumber(int value) {

      extensionNumber_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 extension_number = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExtensionNumber() {
      bitField0_ = (bitField0_ & ~0x00000002);
      extensionNumber_ = 0;
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


    // @@protoc_insertion_point(builder_scope:grpc.reflection.v1alpha.ExtensionRequest)
  }

  // @@protoc_insertion_point(class_scope:grpc.reflection.v1alpha.ExtensionRequest)
  private static final io.grpc.reflection.v1alpha.ExtensionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.reflection.v1alpha.ExtensionRequest();
  }

  public static io.grpc.reflection.v1alpha.ExtensionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExtensionRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExtensionRequest>() {
    @java.lang.Override
    public ExtensionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExtensionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExtensionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.reflection.v1alpha.ExtensionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

