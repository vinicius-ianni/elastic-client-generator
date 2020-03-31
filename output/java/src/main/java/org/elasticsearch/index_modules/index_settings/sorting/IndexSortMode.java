
package org.elasticsearch.index_modules.index_settings.sorting;

public enum IndexSortMode {
  Min("min"),
    Max("max");
  private final String textRepresentation;

  private IndexSortMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
