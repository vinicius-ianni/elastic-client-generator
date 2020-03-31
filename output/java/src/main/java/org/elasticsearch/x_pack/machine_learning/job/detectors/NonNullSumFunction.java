
package org.elasticsearch.x_pack.machine_learning.job.detectors;

public enum NonNullSumFunction {
  NonNullSum("NonNullSum"),
    HighNonNullSum("HighNonNullSum"),
    LowNonNullSum("LowNonNullSum");
  private final String textRepresentation;

  private NonNullSumFunction(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
