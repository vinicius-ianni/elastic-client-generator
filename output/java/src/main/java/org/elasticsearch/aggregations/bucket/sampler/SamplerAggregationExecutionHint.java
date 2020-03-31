
package org.elasticsearch.aggregations.bucket.sampler;

public enum SamplerAggregationExecutionHint {
  Map("map"),
    GlobalOrdinals("global_ordinals"),
    BytesHash("bytes_hash");
  private final String textRepresentation;

  private SamplerAggregationExecutionHint(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
