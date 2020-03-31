
package org.elasticsearch.index_modules.index_settings.sorting;

public enum IndexSortOrder {
  Asc("asc"),
    Desc("desc");
  private final String textRepresentation;

  private IndexSortOrder(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
