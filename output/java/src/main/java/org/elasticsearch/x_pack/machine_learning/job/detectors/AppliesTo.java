
package org.elasticsearch.x_pack.machine_learning.job.detectors;

public enum AppliesTo {
  Actual("actual"),
    Typical("typical"),
    DiffFromTypical("diff_from_typical"),
    Time("time");
  private final String textRepresentation;

  private AppliesTo(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
