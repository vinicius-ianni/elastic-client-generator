
package org.elasticsearch.common;

public enum GeoShapeFormat {
  GeoJson("GeoJson"),
    WellKnownText("WellKnownText");
  private final String textRepresentation;

  private GeoShapeFormat(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
