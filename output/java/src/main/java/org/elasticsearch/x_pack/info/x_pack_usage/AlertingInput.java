
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.info.x_pack_usage.*;

public class AlertingInput  {
  
  private Map<String, AlertingCount> _input;
  public Map<String, AlertingCount> getInput() { return this._input; }
  public AlertingInput setInput(Map<String, AlertingCount> val) { this._input = val; return this; }


  private Map<String, AlertingCount> _trigger;
  public Map<String, AlertingCount> getTrigger() { return this._trigger; }
  public AlertingInput setTrigger(Map<String, AlertingCount> val) { this._trigger = val; return this; }

}
