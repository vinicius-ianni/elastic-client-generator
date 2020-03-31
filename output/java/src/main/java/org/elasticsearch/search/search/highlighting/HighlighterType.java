
package org.elasticsearch.search.search.highlighting;

public enum HighlighterType {
  Plain("plain"),
    Fvh("fvh"),
    Unified("unified");
  private final String textRepresentation;

  private HighlighterType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
