
package org.elasticsearch.x_pack.machine_learning.job.detectors;

public enum DistinctCountFunction {
  DistinctCount("DistinctCount"),
    LowDistinctCount("LowDistinctCount"),
    HighDistinctCount("HighDistinctCount");
  private final String textRepresentation;

  private DistinctCountFunction(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
