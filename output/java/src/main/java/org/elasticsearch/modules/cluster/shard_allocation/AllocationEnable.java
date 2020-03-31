
package org.elasticsearch.modules.cluster.shard_allocation;

public enum AllocationEnable {
  All("all"),
    Primaries("primaries"),
    NewPrimaries("new_primaries"),
    None("none");
  private final String textRepresentation;

  private AllocationEnable(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
