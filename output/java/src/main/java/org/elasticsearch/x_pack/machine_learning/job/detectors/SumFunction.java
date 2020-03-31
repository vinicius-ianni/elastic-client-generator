
package org.elasticsearch.x_pack.machine_learning.job.detectors;

public enum SumFunction {
  Sum("Sum"),
    HighSum("HighSum"),
    LowSum("LowSum");
  private final String textRepresentation;

  private SumFunction(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
