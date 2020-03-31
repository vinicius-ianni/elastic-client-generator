
package org.elasticsearch.query_dsl.compound.function_score.functions;

public enum FunctionScoreMode {
  Multiply("multiply"),
    Sum("sum"),
    Avg("avg"),
    First("first"),
    Max("max"),
    Min("min");
  private final String textRepresentation;

  private FunctionScoreMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
