
package org.elasticsearch.ingest.processors;

public enum ShapeType {
  GeoShape("geo_shape"),
    Shape("shape");
  private final String textRepresentation;

  private ShapeType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
