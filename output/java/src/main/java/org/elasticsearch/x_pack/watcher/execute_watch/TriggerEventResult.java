
package org.elasticsearch.x_pack.watcher.execute_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.trigger.*;
import org.elasticsearch.internal.*;

public class TriggerEventResult  {
  
  private TriggerEventContainer _manual;
  public TriggerEventContainer getManual() { return this._manual; }
  public TriggerEventResult setManual(TriggerEventContainer val) { this._manual = val; return this; }


  private Date _triggeredTime;
  public Date getTriggeredTime() { return this._triggeredTime; }
  public TriggerEventResult setTriggeredTime(Date val) { this._triggeredTime = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public TriggerEventResult setType(String val) { this._type = val; return this; }

}
