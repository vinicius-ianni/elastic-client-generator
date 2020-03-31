
package org.elasticsearch.x_pack.watcher.execute_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.execute_watch.*;
import org.elasticsearch.internal.*;

public class ExecutionResult  {
  
  private ExecutionResultAction[] _actions;
  public ExecutionResultAction[] getActions() { return this._actions; }
  public ExecutionResult setActions(ExecutionResultAction[] val) { this._actions = val; return this; }


  private ExecutionResultCondition _condition;
  public ExecutionResultCondition getCondition() { return this._condition; }
  public ExecutionResult setCondition(ExecutionResultCondition val) { this._condition = val; return this; }


  private Integer _executionDuration;
  public Integer getExecutionDuration() { return this._executionDuration; }
  public ExecutionResult setExecutionDuration(Integer val) { this._executionDuration = val; return this; }


  private Date _executionTime;
  public Date getExecutionTime() { return this._executionTime; }
  public ExecutionResult setExecutionTime(Date val) { this._executionTime = val; return this; }


  private ExecutionResultInput _input;
  public ExecutionResultInput getInput() { return this._input; }
  public ExecutionResult setInput(ExecutionResultInput val) { this._input = val; return this; }

}
