
package org.elasticsearch.search.suggesters.term_suggester;

public enum SuggestSort {
  Score("score"),
    Frequency("frequency");
  private final String textRepresentation;

  private SuggestSort(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
