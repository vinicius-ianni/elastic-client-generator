
package org.elasticsearch.x_pack.machine_learning.job.detectors;

public enum TimeFunction {
  TimeOfDay("TimeOfDay"),
    TimeOfWeek("TimeOfWeek");
  private final String textRepresentation;

  private TimeFunction(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
