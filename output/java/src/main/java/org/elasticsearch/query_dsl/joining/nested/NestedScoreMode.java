
package org.elasticsearch.query_dsl.joining.nested;

public enum NestedScoreMode {
  Avg("avg"),
    Sum("sum"),
    Min("min"),
    Max("max"),
    None("none");
  private final String textRepresentation;

  private NestedScoreMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
