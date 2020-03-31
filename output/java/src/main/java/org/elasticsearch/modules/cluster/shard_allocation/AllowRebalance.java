
package org.elasticsearch.modules.cluster.shard_allocation;

public enum AllowRebalance {
  Always("always"),
    IndicesPrimariesActive("indices_primaries_active"),
    IndicesAllActive("indices_all_active");
  private final String textRepresentation;

  private AllowRebalance(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
