
package org.elasticsearch.query_dsl.compound.function_score.functions;

public enum FunctionBoostMode {
  Multiply("multiply"),
    Replace("replace"),
    Sum("sum"),
    Avg("avg"),
    Max("max"),
    Min("min");
  private final String textRepresentation;

  private FunctionBoostMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
