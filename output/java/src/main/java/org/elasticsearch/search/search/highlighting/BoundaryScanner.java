
package org.elasticsearch.search.search.highlighting;

public enum BoundaryScanner {
  Chars("chars"),
    Sentence("sentence"),
    Word("word");
  private final String textRepresentation;

  private BoundaryScanner(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
