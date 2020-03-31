
package org.elasticsearch.aggregations.matrix.matrix_stats;

public enum MatrixStatsMode {
  Avg("avg"),
    Min("min"),
    Max("max"),
    Sum("sum"),
    Median("median");
  private final String textRepresentation;

  private MatrixStatsMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
