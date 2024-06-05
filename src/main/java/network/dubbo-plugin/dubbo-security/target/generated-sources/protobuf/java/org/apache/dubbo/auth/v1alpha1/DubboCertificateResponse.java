// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ca.proto

package org.apache.dubbo.auth.v1alpha1;

/**
 * Protobuf type {@code org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse}
 */
public final class DubboCertificateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse)
    DubboCertificateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DubboCertificateResponse.newBuilder() to construct.
  private DubboCertificateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DubboCertificateResponse() {
    certPem_ = "";
    trustCerts_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DubboCertificateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.dubbo.auth.v1alpha1.Ca.internal_static_org_apache_dubbo_auth_v1alpha1_DubboCertificateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.dubbo.auth.v1alpha1.Ca.internal_static_org_apache_dubbo_auth_v1alpha1_DubboCertificateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse.class, org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse.Builder.class);
  }

  public static final int SUCCESS_FIELD_NUMBER = 1;
  private boolean success_ = false;
  /**
   * <code>bool success = 1;</code>
   * @return The success.
   */
  @java.lang.Override
  public boolean getSuccess() {
    return success_;
  }

  public static final int CERT_PEM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object certPem_ = "";
  /**
   * <code>string cert_pem = 2;</code>
   * @return The certPem.
   */
  @java.lang.Override
  public java.lang.String getCertPem() {
    java.lang.Object ref = certPem_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      certPem_ = s;
      return s;
    }
  }
  /**
   * <code>string cert_pem = 2;</code>
   * @return The bytes for certPem.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCertPemBytes() {
    java.lang.Object ref = certPem_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      certPem_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRUST_CERTS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList trustCerts_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string trust_certs = 3;</code>
   * @return A list containing the trustCerts.
   */
  public com.google.protobuf.ProtocolStringList
      getTrustCertsList() {
    return trustCerts_;
  }
  /**
   * <code>repeated string trust_certs = 3;</code>
   * @return The count of trustCerts.
   */
  public int getTrustCertsCount() {
    return trustCerts_.size();
  }
  /**
   * <code>repeated string trust_certs = 3;</code>
   * @param index The index of the element to return.
   * @return The trustCerts at the given index.
   */
  public java.lang.String getTrustCerts(int index) {
    return trustCerts_.get(index);
  }
  /**
   * <code>repeated string trust_certs = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the trustCerts at the given index.
   */
  public com.google.protobuf.ByteString
      getTrustCertsBytes(int index) {
    return trustCerts_.getByteString(index);
  }

  public static final int EXPIRE_TIME_FIELD_NUMBER = 4;
  private long expireTime_ = 0L;
  /**
   * <code>int64 expire_time = 4;</code>
   * @return The expireTime.
   */
  @java.lang.Override
  public long getExpireTime() {
    return expireTime_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <code>string message = 5;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 5;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
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
    if (success_ != false) {
      output.writeBool(1, success_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(certPem_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, certPem_);
    }
    for (int i = 0; i < trustCerts_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, trustCerts_.getRaw(i));
    }
    if (expireTime_ != 0L) {
      output.writeInt64(4, expireTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, message_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, success_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(certPem_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, certPem_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < trustCerts_.size(); i++) {
        dataSize += computeStringSizeNoTag(trustCerts_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTrustCertsList().size();
    }
    if (expireTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, expireTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, message_);
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
    if (!(obj instanceof org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse)) {
      return super.equals(obj);
    }
    org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse other = (org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse) obj;

    if (getSuccess()
        != other.getSuccess()) return false;
    if (!getCertPem()
        .equals(other.getCertPem())) return false;
    if (!getTrustCertsList()
        .equals(other.getTrustCertsList())) return false;
    if (getExpireTime()
        != other.getExpireTime()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
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
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    hash = (37 * hash) + CERT_PEM_FIELD_NUMBER;
    hash = (53 * hash) + getCertPem().hashCode();
    if (getTrustCertsCount() > 0) {
      hash = (37 * hash) + TRUST_CERTS_FIELD_NUMBER;
      hash = (53 * hash) + getTrustCertsList().hashCode();
    }
    hash = (37 * hash) + EXPIRE_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExpireTime());
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse parseFrom(
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
  public static Builder newBuilder(org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse prototype) {
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
   * Protobuf type {@code org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse)
      org.apache.dubbo.auth.v1alpha1.DubboCertificateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.dubbo.auth.v1alpha1.Ca.internal_static_org_apache_dubbo_auth_v1alpha1_DubboCertificateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.dubbo.auth.v1alpha1.Ca.internal_static_org_apache_dubbo_auth_v1alpha1_DubboCertificateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse.class, org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse.Builder.class);
    }

    // Construct using org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse.newBuilder()
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
      success_ = false;
      certPem_ = "";
      trustCerts_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      expireTime_ = 0L;
      message_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.dubbo.auth.v1alpha1.Ca.internal_static_org_apache_dubbo_auth_v1alpha1_DubboCertificateResponse_descriptor;
    }

    @java.lang.Override
    public org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse getDefaultInstanceForType() {
      return org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse build() {
      org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse buildPartial() {
      org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse result = new org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.success_ = success_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.certPem_ = certPem_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        trustCerts_.makeImmutable();
        result.trustCerts_ = trustCerts_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.expireTime_ = expireTime_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.message_ = message_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse) {
        return mergeFrom((org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse other) {
      if (other == org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse.getDefaultInstance()) return this;
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (!other.getCertPem().isEmpty()) {
        certPem_ = other.certPem_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.trustCerts_.isEmpty()) {
        if (trustCerts_.isEmpty()) {
          trustCerts_ = other.trustCerts_;
          bitField0_ |= 0x00000004;
        } else {
          ensureTrustCertsIsMutable();
          trustCerts_.addAll(other.trustCerts_);
        }
        onChanged();
      }
      if (other.getExpireTime() != 0L) {
        setExpireTime(other.getExpireTime());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000010;
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
            case 8: {
              success_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              certPem_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureTrustCertsIsMutable();
              trustCerts_.add(s);
              break;
            } // case 26
            case 32: {
              expireTime_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private boolean success_ ;
    /**
     * <code>bool success = 1;</code>
     * @return The success.
     */
    @java.lang.Override
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <code>bool success = 1;</code>
     * @param value The success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccess(boolean value) {

      success_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool success = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccess() {
      bitField0_ = (bitField0_ & ~0x00000001);
      success_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object certPem_ = "";
    /**
     * <code>string cert_pem = 2;</code>
     * @return The certPem.
     */
    public java.lang.String getCertPem() {
      java.lang.Object ref = certPem_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        certPem_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cert_pem = 2;</code>
     * @return The bytes for certPem.
     */
    public com.google.protobuf.ByteString
        getCertPemBytes() {
      java.lang.Object ref = certPem_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        certPem_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cert_pem = 2;</code>
     * @param value The certPem to set.
     * @return This builder for chaining.
     */
    public Builder setCertPem(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      certPem_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string cert_pem = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCertPem() {
      certPem_ = getDefaultInstance().getCertPem();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string cert_pem = 2;</code>
     * @param value The bytes for certPem to set.
     * @return This builder for chaining.
     */
    public Builder setCertPemBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      certPem_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList trustCerts_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureTrustCertsIsMutable() {
      if (!trustCerts_.isModifiable()) {
        trustCerts_ = new com.google.protobuf.LazyStringArrayList(trustCerts_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <code>repeated string trust_certs = 3;</code>
     * @return A list containing the trustCerts.
     */
    public com.google.protobuf.ProtocolStringList
        getTrustCertsList() {
      trustCerts_.makeImmutable();
      return trustCerts_;
    }
    /**
     * <code>repeated string trust_certs = 3;</code>
     * @return The count of trustCerts.
     */
    public int getTrustCertsCount() {
      return trustCerts_.size();
    }
    /**
     * <code>repeated string trust_certs = 3;</code>
     * @param index The index of the element to return.
     * @return The trustCerts at the given index.
     */
    public java.lang.String getTrustCerts(int index) {
      return trustCerts_.get(index);
    }
    /**
     * <code>repeated string trust_certs = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the trustCerts at the given index.
     */
    public com.google.protobuf.ByteString
        getTrustCertsBytes(int index) {
      return trustCerts_.getByteString(index);
    }
    /**
     * <code>repeated string trust_certs = 3;</code>
     * @param index The index to set the value at.
     * @param value The trustCerts to set.
     * @return This builder for chaining.
     */
    public Builder setTrustCerts(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTrustCertsIsMutable();
      trustCerts_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string trust_certs = 3;</code>
     * @param value The trustCerts to add.
     * @return This builder for chaining.
     */
    public Builder addTrustCerts(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTrustCertsIsMutable();
      trustCerts_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string trust_certs = 3;</code>
     * @param values The trustCerts to add.
     * @return This builder for chaining.
     */
    public Builder addAllTrustCerts(
        java.lang.Iterable<java.lang.String> values) {
      ensureTrustCertsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, trustCerts_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string trust_certs = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrustCerts() {
      trustCerts_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string trust_certs = 3;</code>
     * @param value The bytes of the trustCerts to add.
     * @return This builder for chaining.
     */
    public Builder addTrustCertsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureTrustCertsIsMutable();
      trustCerts_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long expireTime_ ;
    /**
     * <code>int64 expire_time = 4;</code>
     * @return The expireTime.
     */
    @java.lang.Override
    public long getExpireTime() {
      return expireTime_;
    }
    /**
     * <code>int64 expire_time = 4;</code>
     * @param value The expireTime to set.
     * @return This builder for chaining.
     */
    public Builder setExpireTime(long value) {

      expireTime_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 expire_time = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpireTime() {
      bitField0_ = (bitField0_ & ~0x00000008);
      expireTime_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 5;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 5;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 5;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string message = 5;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse)
  }

  // @@protoc_insertion_point(class_scope:org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse)
  private static final org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse();
  }

  public static org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DubboCertificateResponse>
      PARSER = new com.google.protobuf.AbstractParser<DubboCertificateResponse>() {
    @java.lang.Override
    public DubboCertificateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DubboCertificateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DubboCertificateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
