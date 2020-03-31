
package org.elasticsearch.analysis.plugins.icu.collation;

public enum IcuCollationAlternate {
  Shifted("shifted"),
    NonIgnorable("non-ignorable");
  private final String textRepresentation;

  private IcuCollationAlternate(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
