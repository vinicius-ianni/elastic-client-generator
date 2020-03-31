
package org.elasticsearch.mapping.types.specialized.shape;

public enum ShapeOrientation {
  ClockWise("ClockWise"),
    CounterClockWise("CounterClockWise");
  private final String textRepresentation;

  private ShapeOrientation(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
