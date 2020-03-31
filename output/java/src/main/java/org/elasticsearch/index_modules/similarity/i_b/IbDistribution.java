
package org.elasticsearch.index_modules.similarity.i_b;

public enum IbDistribution {
  Ll("ll"),
    Spl("spl");
  private final String textRepresentation;

  private IbDistribution(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
