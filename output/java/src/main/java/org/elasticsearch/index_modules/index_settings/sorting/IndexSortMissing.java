
package org.elasticsearch.index_modules.index_settings.sorting;

public enum IndexSortMissing {
  First("_first"),
    Last("_last");
  private final String textRepresentation;

  private IndexSortMissing(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
