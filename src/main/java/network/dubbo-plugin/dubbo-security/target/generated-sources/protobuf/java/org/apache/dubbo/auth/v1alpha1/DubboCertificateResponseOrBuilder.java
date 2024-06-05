// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ca.proto

package org.apache.dubbo.auth.v1alpha1;

public interface DubboCertificateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool success = 1;</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <code>string cert_pem = 2;</code>
   * @return The certPem.
   */
  java.lang.String getCertPem();
  /**
   * <code>string cert_pem = 2;</code>
   * @return The bytes for certPem.
   */
  com.google.protobuf.ByteString
      getCertPemBytes();

  /**
   * <code>repeated string trust_certs = 3;</code>
   * @return A list containing the trustCerts.
   */
  java.util.List<java.lang.String>
      getTrustCertsList();
  /**
   * <code>repeated string trust_certs = 3;</code>
   * @return The count of trustCerts.
   */
  int getTrustCertsCount();
  /**
   * <code>repeated string trust_certs = 3;</code>
   * @param index The index of the element to return.
   * @return The trustCerts at the given index.
   */
  java.lang.String getTrustCerts(int index);
  /**
   * <code>repeated string trust_certs = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the trustCerts at the given index.
   */
  com.google.protobuf.ByteString
      getTrustCertsBytes(int index);

  /**
   * <code>int64 expire_time = 4;</code>
   * @return The expireTime.
   */
  long getExpireTime();

  /**
   * <code>string message = 5;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 5;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}