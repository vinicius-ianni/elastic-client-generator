
package org.elasticsearch.x_pack.license.get_license;

public enum LicenseType {
  Missing("missing"),
    Trial("trial"),
    Basic("basic"),
    Standard("standard"),
    Dev("dev"),
    Silver("silver"),
    Gold("gold"),
    Platinum("platinum");
  private final String textRepresentation;

  private LicenseType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
