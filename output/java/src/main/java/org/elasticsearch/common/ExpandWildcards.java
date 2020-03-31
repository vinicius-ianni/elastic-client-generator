
package org.elasticsearch.common;

public enum ExpandWildcards {
  Open("open"),
    Closed("closed"),
    None("none"),
    All("all");
  private final String textRepresentation;

  private ExpandWildcards(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
