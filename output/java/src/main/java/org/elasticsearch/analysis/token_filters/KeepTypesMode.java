
package org.elasticsearch.analysis.token_filters;

public enum KeepTypesMode {
  Include("include"),
    Exclude("exclude");
  private final String textRepresentation;

  private KeepTypesMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
