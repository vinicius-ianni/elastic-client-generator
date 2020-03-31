
package org.elasticsearch.search.search.highlighting;

public enum HighlighterTagsSchema {
  Styled("styled");
  private final String textRepresentation;

  private HighlighterTagsSchema(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
