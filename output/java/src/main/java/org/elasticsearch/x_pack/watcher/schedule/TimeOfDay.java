
package org.elasticsearch.x_pack.watcher.schedule;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class TimeOfDay  {
  
  private Integer[] _hour;
  public Integer[] getHour() { return this._hour; }
  public TimeOfDay setHour(Integer[] val) { this._hour = val; return this; }


  private Integer[] _minute;
  public Integer[] getMinute() { return this._minute; }
  public TimeOfDay setMinute(Integer[] val) { this._minute = val; return this; }

}
