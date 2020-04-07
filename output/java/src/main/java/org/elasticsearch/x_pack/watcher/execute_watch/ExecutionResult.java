
package org.elasticsearch.x_pack.watcher.execute_watch;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.watcher.execute_watch.*;
import org.elasticsearch.internal.*;

public class ExecutionResult  implements XContentable<ExecutionResult> {
  
  static final ParseField ACTIONS = new ParseField("actions");
  private List<ExecutionResultAction> _actions;
  public List<ExecutionResultAction> getActions() { return this._actions; }
  public ExecutionResult setActions(List<ExecutionResultAction> val) { this._actions = val; return this; }


  static final ParseField CONDITION = new ParseField("condition");
  private ExecutionResultCondition _condition;
  public ExecutionResultCondition getCondition() { return this._condition; }
  public ExecutionResult setCondition(ExecutionResultCondition val) { this._condition = val; return this; }


  static final ParseField EXECUTION_DURATION = new ParseField("execution_duration");
  private Integer _executionDuration;
  public Integer getExecutionDuration() { return this._executionDuration; }
  public ExecutionResult setExecutionDuration(Integer val) { this._executionDuration = val; return this; }


  static final ParseField EXECUTION_TIME = new ParseField("execution_time");
  private Date _executionTime;
  public Date getExecutionTime() { return this._executionTime; }
  public ExecutionResult setExecutionTime(Date val) { this._executionTime = val; return this; }


  static final ParseField INPUT = new ParseField("input");
  private ExecutionResultInput _input;
  public ExecutionResultInput getInput() { return this._input; }
  public ExecutionResult setInput(ExecutionResultInput val) { this._input = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ExecutionResult fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ExecutionResult.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ExecutionResult, Void> PARSER =
    new ConstructingObjectParser<>(ExecutionResult.class.getName(), false, args -> new ExecutionResult());

  static {
    PARSER.declareObjectArray(ExecutionResult::setActions, (p, t) -> ExecutionResultAction.PARSER.apply(p), ACTIONS);
    PARSER.declareObject(ExecutionResult::setCondition, (p, t) -> ExecutionResultCondition.PARSER.apply(p, null), CONDITION);
    PARSER.declareInteger(ExecutionResult::setExecutionDuration, EXECUTION_DURATION);
    PARSER.declareDate(ExecutionResult::setExecutionTime, (p, t) -> Date.createFrom(p), EXECUTION_TIME);
    PARSER.declareObject(ExecutionResult::setInput, (p, t) -> ExecutionResultInput.PARSER.apply(p, null), INPUT);
  }

}
