
package org.elasticsearch.aggregations.pipeline;

public enum GapPolicy {
  Skip("skip"),
    InsertZeros("insert_zeros");
  private final String textRepresentation;

  private GapPolicy(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
