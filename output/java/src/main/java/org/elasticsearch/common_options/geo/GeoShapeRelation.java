
package org.elasticsearch.common_options.geo;

public enum GeoShapeRelation {
  Intersects("intersects"),
    Disjoint("disjoint"),
    Within("within"),
    Contains("contains");
  private final String textRepresentation;

  private GeoShapeRelation(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
