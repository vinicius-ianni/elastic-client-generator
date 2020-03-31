
package org.elasticsearch.query_dsl.joining.has_child;

public enum ChildScoreMode {
  None("none"),
    Avg("avg"),
    Sum("sum"),
    Max("max"),
    Min("min");
  private final String textRepresentation;

  private ChildScoreMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
