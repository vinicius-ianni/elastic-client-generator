
package org.elasticsearch.x_pack.license.get_license;

public enum LicenseStatus {
  Active("active"),
    Valid("valid"),
    Invalid("invalid"),
    Expired("expired");
  private final String textRepresentation;

  private LicenseStatus(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
