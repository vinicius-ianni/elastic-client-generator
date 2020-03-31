
package org.elasticsearch.x_pack.ilm;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.ilm.actions.*;
import org.elasticsearch.common_options.time_unit.*;

public class Phase  {
  
  private Map<String, LifecycleAction> _actions;
  public Map<String, LifecycleAction> getActions() { return this._actions; }
  public Phase setActions(Map<String, LifecycleAction> val) { this._actions = val; return this; }


  private Time _minAge;
  public Time getMinAge() { return this._minAge; }
  public Phase setMinAge(Time val) { this._minAge = val; return this; }

}
