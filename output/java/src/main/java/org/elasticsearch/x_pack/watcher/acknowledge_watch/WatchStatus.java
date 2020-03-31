
package org.elasticsearch.x_pack.watcher.acknowledge_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.acknowledge_watch.*;
import org.elasticsearch.internal.*;

public class WatchStatus  {
  
  private Map<String, ActionStatus> _actions;
  public Map<String, ActionStatus> getActions() { return this._actions; }
  public WatchStatus setActions(Map<String, ActionStatus> val) { this._actions = val; return this; }


  private Date _lastChecked;
  public Date getLastChecked() { return this._lastChecked; }
  public WatchStatus setLastChecked(Date val) { this._lastChecked = val; return this; }


  private Date _lastMetCondition;
  public Date getLastMetCondition() { return this._lastMetCondition; }
  public WatchStatus setLastMetCondition(Date val) { this._lastMetCondition = val; return this; }


  private ActivationState _state;
  public ActivationState getState() { return this._state; }
  public WatchStatus setState(ActivationState val) { this._state = val; return this; }


  private Integer _version;
  public Integer getVersion() { return this._version; }
  public WatchStatus setVersion(Integer val) { this._version = val; return this; }

}
