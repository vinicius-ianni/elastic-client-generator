
package org.elasticsearch.aggregations.bucket.terms;

public enum TermsAggregationExecutionHint {
  Map("map"),
    GlobalOrdinals("global_ordinals"),
    GlobalOrdinalsHash("global_ordinals_hash"),
    GlobalOrdinalsLowCardinality("global_ordinals_low_cardinality");
  private final String textRepresentation;

  private TermsAggregationExecutionHint(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
