
package org.elasticsearch.aggregations.visitor;

public enum AggregationVisitorScope {
  Unknown("Unknown"),
    Aggregation("Aggregation"),
    Bucket("Bucket");
  private final String textRepresentation;

  private AggregationVisitorScope(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
