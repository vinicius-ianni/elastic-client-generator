
package org.elasticsearch.cluster.cluster_allocation_explain;

public enum AllocationExplainDecision {
  No("NO"),
    Yes("YES"),
    Throttle("THROTTLE"),
    Always("ALWAYS");
  private final String textRepresentation;

  private AllocationExplainDecision(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
