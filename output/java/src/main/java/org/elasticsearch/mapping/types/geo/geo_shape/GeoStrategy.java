
package org.elasticsearch.mapping.types.geo.geo_shape;

public enum GeoStrategy {
  Recursive("recursive"),
    Term("term");
  private final String textRepresentation;

  private GeoStrategy(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
