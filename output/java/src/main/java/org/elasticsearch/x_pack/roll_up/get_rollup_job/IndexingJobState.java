
package org.elasticsearch.x_pack.roll_up.get_rollup_job;

public enum IndexingJobState {
  Started("started"),
    Indexing("indexing"),
    Stopping("stopping"),
    Stopped("stopped"),
    Aborting("aborting");
  private final String textRepresentation;

  private IndexingJobState(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
