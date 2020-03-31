
package org.elasticsearch.query_dsl.compound.function_score.functions.decay;

public enum MultiValueMode {
  Min("min"),
    Max("max"),
    Avg("avg"),
    Sum("sum");
  private final String textRepresentation;

  private MultiValueMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
