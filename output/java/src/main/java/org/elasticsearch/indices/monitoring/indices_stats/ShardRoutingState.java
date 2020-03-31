
package org.elasticsearch.indices.monitoring.indices_stats;

public enum ShardRoutingState {
  Unassigned("UNASSIGNED"),
    Initializing("INITIALIZING"),
    Started("STARTED"),
    Relocating("RELOCATING");
  private final String textRepresentation;

  private ShardRoutingState(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
