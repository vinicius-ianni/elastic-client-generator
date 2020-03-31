
package org.elasticsearch.x_pack.watcher.activate_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.acknowledge_watch.*;

public class ActivationStatus  {
  
  private Map<String, ActionStatus> _actions;
  public Map<String, ActionStatus> getActions() { return this._actions; }
  public ActivationStatus setActions(Map<String, ActionStatus> val) { this._actions = val; return this; }


  private ActivationState _state;
  public ActivationState getState() { return this._state; }
  public ActivationStatus setState(ActivationState val) { this._state = val; return this; }

}
