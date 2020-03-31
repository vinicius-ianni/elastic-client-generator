
package org.elasticsearch.common_options.geo;

public enum DistanceUnit {
  In("in"),
    Ft("ft"),
    Yd("yd"),
    Mi("mi"),
    Nmi("nmi"),
    Km("km"),
    M("m"),
    Cm("cm"),
    Mm("mm");
  private final String textRepresentation;

  private DistanceUnit(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
