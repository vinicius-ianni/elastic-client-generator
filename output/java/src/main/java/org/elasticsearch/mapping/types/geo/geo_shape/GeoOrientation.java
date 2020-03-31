
package org.elasticsearch.mapping.types.geo.geo_shape;

public enum GeoOrientation {
  ClockWise("ClockWise"),
    CounterClockWise("CounterClockWise");
  private final String textRepresentation;

  private GeoOrientation(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
