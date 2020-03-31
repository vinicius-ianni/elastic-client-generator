
package org.elasticsearch.search.search.highlighting;

public enum HighlighterOrder {
  Score("score");
  private final String textRepresentation;

  private HighlighterOrder(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
