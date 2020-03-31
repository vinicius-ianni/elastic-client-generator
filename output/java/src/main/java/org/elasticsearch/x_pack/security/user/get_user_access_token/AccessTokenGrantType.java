
package org.elasticsearch.x_pack.security.user.get_user_access_token;

public enum AccessTokenGrantType {
  Password("password");
  private final String textRepresentation;

  private AccessTokenGrantType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
