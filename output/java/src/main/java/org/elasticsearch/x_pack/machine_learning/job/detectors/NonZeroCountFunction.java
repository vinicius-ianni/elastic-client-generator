
package org.elasticsearch.x_pack.machine_learning.job.detectors;

public enum NonZeroCountFunction {
  NonZeroCount("NonZeroCount"),
    LowNonZeroCount("LowNonZeroCount"),
    HighNonZeroCount("HighNonZeroCount");
  private final String textRepresentation;

  private NonZeroCountFunction(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
