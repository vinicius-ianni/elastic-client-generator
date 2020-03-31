
package org.elasticsearch.search.search.rescoring;

public enum ScoreMode {
  Avg("avg"),
    Max("max"),
    Min("min"),
    Multiply("multiply"),
    Total("total");
  private final String textRepresentation;

  private ScoreMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
