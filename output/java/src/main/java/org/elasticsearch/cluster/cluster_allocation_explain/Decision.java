
package org.elasticsearch.cluster.cluster_allocation_explain;

public enum Decision {
  Yes("yes"),
    No("no"),
    WorseBalance("worse_balance"),
    Throttled("throttled"),
    AwaitingInfo("awaiting_info"),
    AllocationDelayed("allocation_delayed"),
    NoValidShardCopy("no_valid_shard_copy"),
    NoAttempt("no_attempt");
  private final String textRepresentation;

  private Decision(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
