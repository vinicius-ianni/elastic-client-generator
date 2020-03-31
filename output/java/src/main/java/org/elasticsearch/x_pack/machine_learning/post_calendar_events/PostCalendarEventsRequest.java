
package org.elasticsearch.x_pack.machine_learning.post_calendar_events;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.post_calendar_events.*;

public class PostCalendarEventsRequest  {
  
  private ScheduledEvent[] _events;
  public ScheduledEvent[] getEvents() { return this._events; }
  public PostCalendarEventsRequest setEvents(ScheduledEvent[] val) { this._events = val; return this; }

}
