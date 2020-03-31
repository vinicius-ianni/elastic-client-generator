
package org.elasticsearch.x_pack.watcher.execute_watch;

public enum ActionExecutionState {
  AwaitsExecution("awaits_execution"),
    Checking("checking"),
    ExecutionNotNeeded("execution_not_needed"),
    Throttled("throttled"),
    Executed("executed"),
    Failed("failed"),
    DeletedWhileQueued("deleted_while_queued"),
    NotExecutedAlreadyQueued("not_executed_already_queued");
  private final String textRepresentation;

  private ActionExecutionState(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
