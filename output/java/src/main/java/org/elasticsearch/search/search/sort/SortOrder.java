
package org.elasticsearch.search.search.sort;

public enum SortOrder {
  Asc("asc"),
    Desc("desc");
  private final String textRepresentation;

  private SortOrder(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
