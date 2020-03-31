
package org.elasticsearch.x_pack.watcher.acknowledge_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.acknowledge_watch.*;

public class ActionStatus  {
  
  private AcknowledgeState _ack;
  public AcknowledgeState getAck() { return this._ack; }
  public ActionStatus setAck(AcknowledgeState val) { this._ack = val; return this; }


  private ExecutionState _lastExecution;
  public ExecutionState getLastExecution() { return this._lastExecution; }
  public ActionStatus setLastExecution(ExecutionState val) { this._lastExecution = val; return this; }


  private ExecutionState _lastSuccessfulExecution;
  public ExecutionState getLastSuccessfulExecution() { return this._lastSuccessfulExecution; }
  public ActionStatus setLastSuccessfulExecution(ExecutionState val) { this._lastSuccessfulExecution = val; return this; }


  private ThrottleState _lastThrottle;
  public ThrottleState getLastThrottle() { return this._lastThrottle; }
  public ActionStatus setLastThrottle(ThrottleState val) { this._lastThrottle = val; return this; }

}
