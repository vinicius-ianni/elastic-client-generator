
package org.elasticsearch.x_pack.watcher.watcher_stats;

public enum WatcherState {
  Stopped("stopped"),
    Starting("starting"),
    Started("started"),
    Stopping("stopping");
  private final String textRepresentation;

  private WatcherState(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
