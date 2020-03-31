
package org.elasticsearch.x_pack.watcher.execution;

public enum ActionExecutionMode {
  Simulate("simulate"),
    ForceSimulate("force_simulate"),
    Execute("execute"),
    ForceExecute("force_execute"),
    Skip("skip");
  private final String textRepresentation;

  private ActionExecutionMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
