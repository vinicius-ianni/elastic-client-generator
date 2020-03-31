
package org.elasticsearch.analysis.plugins.icu.collation;

public enum IcuCollationCaseFirst {
  Lower("lower"),
    Upper("upper");
  private final String textRepresentation;

  private IcuCollationCaseFirst(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
