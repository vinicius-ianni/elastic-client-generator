
package org.elasticsearch.query_dsl.geo.bounding_box;

public enum GeoExecution {
  Memory("memory"),
    Indexed("indexed");
  private final String textRepresentation;

  private GeoExecution(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
