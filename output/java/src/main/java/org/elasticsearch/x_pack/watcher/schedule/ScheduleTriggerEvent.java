
package org.elasticsearch.x_pack.watcher.schedule;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ScheduleTriggerEvent  {
  
  private Either<Date, String> _scheduledTime;
  public Either<Date, String> getScheduledTime() { return this._scheduledTime; }
  public ScheduleTriggerEvent setScheduledTime(Either<Date, String> val) { this._scheduledTime = val; return this; }


  private Either<Date, String> _triggeredTime;
  public Either<Date, String> getTriggeredTime() { return this._triggeredTime; }
  public ScheduleTriggerEvent setTriggeredTime(Either<Date, String> val) { this._triggeredTime = val; return this; }

}
