
package org.elasticsearch.x_pack.watcher.watcher_stats;

public enum ExecutionPhase {
  AwaitsExecution("awaits_execution"),
    Started("started"),
    Input("input"),
    Condition("condition"),
    Actions("actions"),
    WatchTransform("watch_transform"),
    Aborted("aborted"),
    Finished("finished");
  private final String textRepresentation;

  private ExecutionPhase(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
