
package org.elasticsearch.modules.cluster.shard_allocation;

public enum RebalanceEnable {
  All("all"),
    Primaries("primaries"),
    Replicas("replicas"),
    None("none");
  private final String textRepresentation;

  private RebalanceEnable(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
