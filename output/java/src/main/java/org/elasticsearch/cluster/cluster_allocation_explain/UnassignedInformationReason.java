
package org.elasticsearch.cluster.cluster_allocation_explain;

public enum UnassignedInformationReason {
  IndexCreated("INDEX_CREATED"),
    ClusterRecovered("CLUSTER_RECOVERED"),
    IndexReopened("INDEX_REOPENED"),
    DanglingIndexImported("DANGLING_INDEX_IMPORTED"),
    NewIndexRestored("NEW_INDEX_RESTORED"),
    ExistingIndexRestored("EXISTING_INDEX_RESTORED"),
    ReplicaAdded("REPLICA_ADDED"),
    AllocationFailed("ALLOCATION_FAILED"),
    NodeLeft("NODE_LEFT"),
    RerouteCancelled("REROUTE_CANCELLED"),
    Reinitialized("REINITIALIZED"),
    ReallocatedReplica("REALLOCATED_REPLICA"),
    PrimaryFailed("PRIMARY_FAILED"),
    ForcedEmptyPrimary("FORCED_EMPTY_PRIMARY"),
    ManualAllocation("MANUAL_ALLOCATION");
  private final String textRepresentation;

  private UnassignedInformationReason(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
