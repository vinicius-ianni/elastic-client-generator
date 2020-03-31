
package org.elasticsearch.x_pack.watcher.trigger;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.schedule.*;

public class TriggerContainer  {
  
  private ScheduleContainer _schedule;
  public ScheduleContainer getSchedule() { return this._schedule; }
  public TriggerContainer setSchedule(ScheduleContainer val) { this._schedule = val; return this; }

}
