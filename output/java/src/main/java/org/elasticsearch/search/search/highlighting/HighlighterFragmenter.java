
package org.elasticsearch.search.search.highlighting;

public enum HighlighterFragmenter {
  Simple("simple"),
    Span("span");
  private final String textRepresentation;

  private HighlighterFragmenter(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
