
package org.elasticsearch.mapping.types.geo.geo_shape;

public enum GeoTree {
  Geohash("geohash"),
    Quadtree("quadtree");
  private final String textRepresentation;

  private GeoTree(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
