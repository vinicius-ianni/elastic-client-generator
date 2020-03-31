
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.info.x_pack_usage.*;

public class AlertingExecution  {
  
  private Map<String, ExecutionAction> _actions;
  public Map<String, ExecutionAction> getActions() { return this._actions; }
  public AlertingExecution setActions(Map<String, ExecutionAction> val) { this._actions = val; return this; }

}
