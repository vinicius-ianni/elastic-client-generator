
package org.elasticsearch.aggregations.bucket.terms;

public enum TermsAggregationCollectMode {
  DepthFirst("depth_first"),
    BreadthFirst("breadth_first");
  private final String textRepresentation;

  private TermsAggregationCollectMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
