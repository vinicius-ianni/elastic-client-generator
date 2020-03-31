
package org.elasticsearch.common;

public enum SuggestMode {
  Missing("missing"),
    Popular("popular"),
    Always("always");
  private final String textRepresentation;

  private SuggestMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
