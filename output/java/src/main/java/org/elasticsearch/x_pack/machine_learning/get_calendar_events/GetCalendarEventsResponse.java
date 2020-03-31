
package org.elasticsearch.x_pack.machine_learning.get_calendar_events;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.post_calendar_events.*;

public class GetCalendarEventsResponse  {
  
  private Integer _count;
  public Integer getCount() { return this._count; }
  public GetCalendarEventsResponse setCount(Integer val) { this._count = val; return this; }


  private ScheduledEvent[] _events;
  public ScheduledEvent[] getEvents() { return this._events; }
  public GetCalendarEventsResponse setEvents(ScheduledEvent[] val) { this._events = val; return this; }

}
