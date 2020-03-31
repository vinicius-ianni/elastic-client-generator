
package org.elasticsearch.analysis.plugins.icu.collation;

public enum IcuCollationStrength {
  Primary("primary"),
    Secondary("secondary"),
    Tertiary("tertiary"),
    Quaternary("quaternary"),
    Identical("identical");
  private final String textRepresentation;

  private IcuCollationStrength(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
