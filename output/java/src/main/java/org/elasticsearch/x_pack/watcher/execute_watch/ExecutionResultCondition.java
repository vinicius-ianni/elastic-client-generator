
package org.elasticsearch.x_pack.watcher.execute_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.execution.*;
import org.elasticsearch.x_pack.watcher.condition.*;

public class ExecutionResultCondition  {
  
  private Boolean _met;
  public Boolean getMet() { return this._met; }
  public ExecutionResultCondition setMet(Boolean val) { this._met = val; return this; }


  private Status _status;
  public Status getStatus() { return this._status; }
  public ExecutionResultCondition setStatus(Status val) { this._status = val; return this; }


  private ConditionType _type;
  public ConditionType getType() { return this._type; }
  public ExecutionResultCondition setType(ConditionType val) { this._type = val; return this; }

}
