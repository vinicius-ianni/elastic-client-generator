
package org.elasticsearch.indices.monitoring.indices_shard_stores;

public enum ShardStoreAllocation {
  Primary("primary"),
    Replica("replica"),
    Unused("unused");
  private final String textRepresentation;

  private ShardStoreAllocation(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
