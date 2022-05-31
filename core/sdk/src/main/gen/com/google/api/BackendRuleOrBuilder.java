// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/backend.proto

package com.google.api;

public interface BackendRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.BackendRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1 [json_name = "selector"];</code>
   * @return The selector.
   */
  java.lang.String getSelector();
  /**
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1 [json_name = "selector"];</code>
   * @return The bytes for selector.
   */
  com.google.protobuf.ByteString
      getSelectorBytes();

  /**
   * <pre>
   * The address of the API backend.
   * The scheme is used to determine the backend protocol and security.
   * The following schemes are accepted:
   *    SCHEME        PROTOCOL    SECURITY
   *    http://       HTTP        None
   *    https://      HTTP        TLS
   *    grpc://       gRPC        None
   *    grpcs://      gRPC        TLS
   * It is recommended to explicitly include a scheme. Leaving out the scheme
   * may cause constrasting behaviors across platforms.
   * If the port is unspecified, the default is:
   * - 80 for schemes without TLS
   * - 443 for schemes with TLS
   * For HTTP backends, use [protocol][google.api.BackendRule.protocol]
   * to specify the protocol version.
   * </pre>
   *
   * <code>string address = 2 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * The address of the API backend.
   * The scheme is used to determine the backend protocol and security.
   * The following schemes are accepted:
   *    SCHEME        PROTOCOL    SECURITY
   *    http://       HTTP        None
   *    https://      HTTP        TLS
   *    grpc://       gRPC        None
   *    grpcs://      gRPC        TLS
   * It is recommended to explicitly include a scheme. Leaving out the scheme
   * may cause constrasting behaviors across platforms.
   * If the port is unspecified, the default is:
   * - 80 for schemes without TLS
   * - 443 for schemes with TLS
   * For HTTP backends, use [protocol][google.api.BackendRule.protocol]
   * to specify the protocol version.
   * </pre>
   *
   * <code>string address = 2 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * The number of seconds to wait for a response from a request. The default
   * varies based on the request protocol and deployment environment.
   * </pre>
   *
   * <code>double deadline = 3 [json_name = "deadline"];</code>
   * @return The deadline.
   */
  double getDeadline();

  /**
   * <pre>
   * Minimum deadline in seconds needed for this method. Calls having deadline
   * value lower than this will be rejected.
   * </pre>
   *
   * <code>double min_deadline = 4 [json_name = "minDeadline"];</code>
   * @return The minDeadline.
   */
  double getMinDeadline();

  /**
   * <pre>
   * The number of seconds to wait for the completion of a long running
   * operation. The default is no deadline.
   * </pre>
   *
   * <code>double operation_deadline = 5 [json_name = "operationDeadline"];</code>
   * @return The operationDeadline.
   */
  double getOperationDeadline();

  /**
   * <code>.google.api.BackendRule.PathTranslation path_translation = 6 [json_name = "pathTranslation"];</code>
   * @return The enum numeric value on the wire for pathTranslation.
   */
  int getPathTranslationValue();
  /**
   * <code>.google.api.BackendRule.PathTranslation path_translation = 6 [json_name = "pathTranslation"];</code>
   * @return The pathTranslation.
   */
  com.google.api.BackendRule.PathTranslation getPathTranslation();

  /**
   * <pre>
   * The JWT audience is used when generating a JWT ID token for the backend.
   * This ID token will be added in the HTTP "authorization" header, and sent
   * to the backend.
   * </pre>
   *
   * <code>string jwt_audience = 7 [json_name = "jwtAudience"];</code>
   * @return Whether the jwtAudience field is set.
   */
  boolean hasJwtAudience();
  /**
   * <pre>
   * The JWT audience is used when generating a JWT ID token for the backend.
   * This ID token will be added in the HTTP "authorization" header, and sent
   * to the backend.
   * </pre>
   *
   * <code>string jwt_audience = 7 [json_name = "jwtAudience"];</code>
   * @return The jwtAudience.
   */
  java.lang.String getJwtAudience();
  /**
   * <pre>
   * The JWT audience is used when generating a JWT ID token for the backend.
   * This ID token will be added in the HTTP "authorization" header, and sent
   * to the backend.
   * </pre>
   *
   * <code>string jwt_audience = 7 [json_name = "jwtAudience"];</code>
   * @return The bytes for jwtAudience.
   */
  com.google.protobuf.ByteString
      getJwtAudienceBytes();

  /**
   * <pre>
   * When disable_auth is true, a JWT ID token won't be generated and the
   * original "Authorization" HTTP header will be preserved. If the header is
   * used to carry the original token and is expected by the backend, this
   * field must be set to true to preserve the header.
   * </pre>
   *
   * <code>bool disable_auth = 8 [json_name = "disableAuth"];</code>
   * @return Whether the disableAuth field is set.
   */
  boolean hasDisableAuth();
  /**
   * <pre>
   * When disable_auth is true, a JWT ID token won't be generated and the
   * original "Authorization" HTTP header will be preserved. If the header is
   * used to carry the original token and is expected by the backend, this
   * field must be set to true to preserve the header.
   * </pre>
   *
   * <code>bool disable_auth = 8 [json_name = "disableAuth"];</code>
   * @return The disableAuth.
   */
  boolean getDisableAuth();

  /**
   * <pre>
   * The protocol used for sending a request to the backend.
   * The supported values are "http/1.1" and "h2".
   * The default value is inferred from the scheme in the
   * [address][google.api.BackendRule.address] field:
   *    SCHEME        PROTOCOL
   *    http://       http/1.1
   *    https://      http/1.1
   *    grpc://       h2
   *    grpcs://      h2
   * For secure HTTP backends (https://) that support HTTP/2, set this field
   * to "h2" for improved performance.
   * Configuring this field to non-default values is only supported for secure
   * HTTP backends. This field will be ignored for all other backends.
   * See
   * https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids
   * for more details on the supported values.
   * </pre>
   *
   * <code>string protocol = 9 [json_name = "protocol"];</code>
   * @return The protocol.
   */
  java.lang.String getProtocol();
  /**
   * <pre>
   * The protocol used for sending a request to the backend.
   * The supported values are "http/1.1" and "h2".
   * The default value is inferred from the scheme in the
   * [address][google.api.BackendRule.address] field:
   *    SCHEME        PROTOCOL
   *    http://       http/1.1
   *    https://      http/1.1
   *    grpc://       h2
   *    grpcs://      h2
   * For secure HTTP backends (https://) that support HTTP/2, set this field
   * to "h2" for improved performance.
   * Configuring this field to non-default values is only supported for secure
   * HTTP backends. This field will be ignored for all other backends.
   * See
   * https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids
   * for more details on the supported values.
   * </pre>
   *
   * <code>string protocol = 9 [json_name = "protocol"];</code>
   * @return The bytes for protocol.
   */
  com.google.protobuf.ByteString
      getProtocolBytes();

  public com.google.api.BackendRule.AuthenticationCase getAuthenticationCase();
}
