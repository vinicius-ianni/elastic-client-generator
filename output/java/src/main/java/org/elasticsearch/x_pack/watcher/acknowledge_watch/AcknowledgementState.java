
package org.elasticsearch.x_pack.watcher.acknowledge_watch;

public enum AcknowledgementState {
  AwaitsSuccessfulExecution("awaits_successful_execution"),
    Ackable("ackable"),
    Acked("acked");
  private final String textRepresentation;

  private AcknowledgementState(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
