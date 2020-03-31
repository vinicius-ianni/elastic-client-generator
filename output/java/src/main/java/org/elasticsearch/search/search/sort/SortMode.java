
package org.elasticsearch.search.search.sort;

public enum SortMode {
  Min("min"),
    Max("max"),
    Sum("sum"),
    Avg("avg"),
    Median("median");
  private final String textRepresentation;

  private SortMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
