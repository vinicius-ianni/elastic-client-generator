
package org.elasticsearch.x_pack.watcher.execute_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.condition.*;
import org.elasticsearch.x_pack.watcher.input.*;
import org.elasticsearch.x_pack.watcher.execute_watch.*;

public class WatchRecord  {
  
  private ConditionContainer _condition;
  public ConditionContainer getCondition() { return this._condition; }
  public WatchRecord setCondition(ConditionContainer val) { this._condition = val; return this; }


  private InputContainer _input;
  public InputContainer getInput() { return this._input; }
  public WatchRecord setInput(InputContainer val) { this._input = val; return this; }


  private String[] _messages;
  public String[] getMessages() { return this._messages; }
  public WatchRecord setMessages(String[] val) { this._messages = val; return this; }


  private Map<String, Object> _metadata;
  public Map<String, Object> getMetadata() { return this._metadata; }
  public WatchRecord setMetadata(Map<String, Object> val) { this._metadata = val; return this; }


  private ExecutionResult _result;
  public ExecutionResult getResult() { return this._result; }
  public WatchRecord setResult(ExecutionResult val) { this._result = val; return this; }


  private ActionExecutionState _state;
  public ActionExecutionState getState() { return this._state; }
  public WatchRecord setState(ActionExecutionState val) { this._state = val; return this; }


  private TriggerEventResult _triggerEvent;
  public TriggerEventResult getTriggerEvent() { return this._triggerEvent; }
  public WatchRecord setTriggerEvent(TriggerEventResult val) { this._triggerEvent = val; return this; }


  private String _user;
  public String getUser() { return this._user; }
  public WatchRecord setUser(String val) { this._user = val; return this; }


  private String _node;
  public String getNode() { return this._node; }
  public WatchRecord setNode(String val) { this._node = val; return this; }


  private String _watchId;
  public String getWatchId() { return this._watchId; }
  public WatchRecord setWatchId(String val) { this._watchId = val; return this; }

}
