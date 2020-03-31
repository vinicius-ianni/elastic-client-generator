
package org.elasticsearch.x_pack.watcher.execution;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.execution.*;

public class SimulatedActions  {
  
  private String[] _actions;
  public String[] getActions() { return this._actions; }
  public SimulatedActions setActions(String[] val) { this._actions = val; return this; }


  private SimulatedActions _all;
  public SimulatedActions getAll() { return this._all; }
  public SimulatedActions setAll(SimulatedActions val) { this._all = val; return this; }


  private Boolean _useAll;
  public Boolean getUseAll() { return this._useAll; }
  public SimulatedActions setUseAll(Boolean val) { this._useAll = val; return this; }

}
