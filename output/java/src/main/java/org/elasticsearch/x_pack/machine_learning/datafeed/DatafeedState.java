
package org.elasticsearch.x_pack.machine_learning.datafeed;

public enum DatafeedState {
  Started("started"),
    Stopped("stopped"),
    Starting("starting"),
    Stopping("stopping");
  private final String textRepresentation;

  private DatafeedState(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
