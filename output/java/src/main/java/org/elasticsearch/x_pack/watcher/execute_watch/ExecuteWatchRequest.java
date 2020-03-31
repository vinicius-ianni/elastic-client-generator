
package org.elasticsearch.x_pack.watcher.execute_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.execution.*;
import org.elasticsearch.x_pack.watcher.schedule.*;
import org.elasticsearch.x_pack.watcher.*;

public class ExecuteWatchRequest  {
  
  private Boolean _debug;
  public Boolean getDebug() { return this._debug; }
  public ExecuteWatchRequest setDebug(Boolean val) { this._debug = val; return this; }


  private Map<String, ActionExecutionMode> _actionModes;
  public Map<String, ActionExecutionMode> getActionModes() { return this._actionModes; }
  public ExecuteWatchRequest setActionModes(Map<String, ActionExecutionMode> val) { this._actionModes = val; return this; }


  private Map<String, Object> _alternativeInput;
  public Map<String, Object> getAlternativeInput() { return this._alternativeInput; }
  public ExecuteWatchRequest setAlternativeInput(Map<String, Object> val) { this._alternativeInput = val; return this; }


  private Boolean _ignoreCondition;
  public Boolean getIgnoreCondition() { return this._ignoreCondition; }
  public ExecuteWatchRequest setIgnoreCondition(Boolean val) { this._ignoreCondition = val; return this; }


  private Boolean _recordExecution;
  public Boolean getRecordExecution() { return this._recordExecution; }
  public ExecuteWatchRequest setRecordExecution(Boolean val) { this._recordExecution = val; return this; }


  private SimulatedActions _simulatedActions;
  public SimulatedActions getSimulatedActions() { return this._simulatedActions; }
  public ExecuteWatchRequest setSimulatedActions(SimulatedActions val) { this._simulatedActions = val; return this; }


  private ScheduleTriggerEvent _triggerData;
  public ScheduleTriggerEvent getTriggerData() { return this._triggerData; }
  public ExecuteWatchRequest setTriggerData(ScheduleTriggerEvent val) { this._triggerData = val; return this; }


  private Watch _watch;
  public Watch getWatch() { return this._watch; }
  public ExecuteWatchRequest setWatch(Watch val) { this._watch = val; return this; }

}
