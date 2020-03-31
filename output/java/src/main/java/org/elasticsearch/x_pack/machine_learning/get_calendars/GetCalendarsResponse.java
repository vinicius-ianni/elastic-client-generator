
package org.elasticsearch.x_pack.machine_learning.get_calendars;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.get_calendars.*;

public class GetCalendarsResponse  {
  
  private Long _count;
  public Long getCount() { return this._count; }
  public GetCalendarsResponse setCount(Long val) { this._count = val; return this; }


  private Calendar[] _calendars;
  public Calendar[] getCalendars() { return this._calendars; }
  public GetCalendarsResponse setCalendars(Calendar[] val) { this._calendars = val; return this; }

}
