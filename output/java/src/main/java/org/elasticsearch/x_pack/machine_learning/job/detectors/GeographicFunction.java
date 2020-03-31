
package org.elasticsearch.x_pack.machine_learning.job.detectors;

public enum GeographicFunction {
  LatLong("LatLong");
  private final String textRepresentation;

  private GeographicFunction(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
