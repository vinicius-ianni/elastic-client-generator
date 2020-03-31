
package org.elasticsearch.x_pack.watcher.trigger;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.schedule.*;

public class TriggerEventContainer  {
  
  private ScheduleTriggerEvent _schedule;
  public ScheduleTriggerEvent getSchedule() { return this._schedule; }
  public TriggerEventContainer setSchedule(ScheduleTriggerEvent val) { this._schedule = val; return this; }

}
