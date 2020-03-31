
package org.elasticsearch.x_pack.machine_learning.job.detectors;

public enum RareFunction {
  Rare("Rare"),
    FreqRare("FreqRare");
  private final String textRepresentation;

  private RareFunction(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
