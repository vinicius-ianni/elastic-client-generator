
package org.elasticsearch.search.search.sort;

public enum SortSpecialField {
  Score("_score"),
    Doc("_doc");
  private final String textRepresentation;

  private SortSpecialField(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
