
package org.elasticsearch.x_pack.machine_learning.job.config;

public enum JobState {
  Closing("closing"),
    Closed("closed"),
    Opened("opened"),
    Failed("failed"),
    Opening("opening");
  private final String textRepresentation;

  private JobState(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
