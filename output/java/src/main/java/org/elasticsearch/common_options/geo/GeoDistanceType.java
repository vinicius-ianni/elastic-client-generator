
package org.elasticsearch.common_options.geo;

public enum GeoDistanceType {
  Arc("arc"),
    Plane("plane");
  private final String textRepresentation;

  private GeoDistanceType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
