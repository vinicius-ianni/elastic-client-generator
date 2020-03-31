
package org.elasticsearch.x_pack.watcher;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.action.*;
import org.elasticsearch.x_pack.watcher.condition.*;
import org.elasticsearch.x_pack.watcher.input.*;
import org.elasticsearch.x_pack.watcher.acknowledge_watch.*;
import org.elasticsearch.x_pack.watcher.transform.*;
import org.elasticsearch.x_pack.watcher.trigger.*;

public class Watch  {
  
  private Map<String, Action> _actions;
  public Map<String, Action> getActions() { return this._actions; }
  public Watch setActions(Map<String, Action> val) { this._actions = val; return this; }


  private ConditionContainer _condition;
  public ConditionContainer getCondition() { return this._condition; }
  public Watch setCondition(ConditionContainer val) { this._condition = val; return this; }


  private InputContainer _input;
  public InputContainer getInput() { return this._input; }
  public Watch setInput(InputContainer val) { this._input = val; return this; }


  private Map<String, Object> _metadata;
  public Map<String, Object> getMetadata() { return this._metadata; }
  public Watch setMetadata(Map<String, Object> val) { this._metadata = val; return this; }


  private WatchStatus _status;
  public WatchStatus getStatus() { return this._status; }
  public Watch setStatus(WatchStatus val) { this._status = val; return this; }


  private String _throttlePeriod;
  public String getThrottlePeriod() { return this._throttlePeriod; }
  public Watch setThrottlePeriod(String val) { this._throttlePeriod = val; return this; }


  private TransformContainer _transform;
  public TransformContainer getTransform() { return this._transform; }
  public Watch setTransform(TransformContainer val) { this._transform = val; return this; }


  private TriggerContainer _trigger;
  public TriggerContainer getTrigger() { return this._trigger; }
  public Watch setTrigger(TriggerContainer val) { this._trigger = val; return this; }

}
