
package org.elasticsearch.analysis.plugins.icu.normalization;

public enum IcuNormalizationMode {
  Decompose("decompose"),
    Compose("compose");
  private final String textRepresentation;

  private IcuNormalizationMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
