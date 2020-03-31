
package org.elasticsearch.analysis.plugins.icu.collation;

public enum IcuCollationDecomposition {
  No("no"),
    Identical("identical");
  private final String textRepresentation;

  private IcuCollationDecomposition(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
