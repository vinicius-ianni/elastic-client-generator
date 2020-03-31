
package org.elasticsearch.search.search.highlighting;

public enum HighlighterEncoder {
  Default("default"),
    Html("html");
  private final String textRepresentation;

  private HighlighterEncoder(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
