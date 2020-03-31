
package org.elasticsearch.x_pack.watcher.schedule;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class HourlySchedule  {
  
  private Integer[] _minute;
  public Integer[] getMinute() { return this._minute; }
  public HourlySchedule setMinute(Integer[] val) { this._minute = val; return this; }

}
