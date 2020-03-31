
package org.elasticsearch.x_pack.machine_learning.job.detectors;

public enum CountFunction {
  Count("Count"),
    HighCount("HighCount"),
    LowCount("LowCount");
  private final String textRepresentation;

  private CountFunction(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
