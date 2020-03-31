
package org.elasticsearch.x_pack.ilm.get_status;

public enum LifecycleOperationMode {
  Running("RUNNING"),
    Stopping("STOPPING"),
    Stopped("STOPPED");
  private final String textRepresentation;

  private LifecycleOperationMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
