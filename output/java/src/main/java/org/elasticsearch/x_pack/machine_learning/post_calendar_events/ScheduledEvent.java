
package org.elasticsearch.x_pack.machine_learning.post_calendar_events;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.internal.*;

public class ScheduledEvent  {
  
  private Id _calendarId;
  public Id getCalendarId() { return this._calendarId; }
  public ScheduledEvent setCalendarId(Id val) { this._calendarId = val; return this; }


  private String _description;
  public String getDescription() { return this._description; }
  public ScheduledEvent setDescription(String val) { this._description = val; return this; }


  private Date _startTime;
  public Date getStartTime() { return this._startTime; }
  public ScheduledEvent setStartTime(Date val) { this._startTime = val; return this; }


  private Date _endTime;
  public Date getEndTime() { return this._endTime; }
  public ScheduledEvent setEndTime(Date val) { this._endTime = val; return this; }


  private Id _eventId;
  public Id getEventId() { return this._eventId; }
  public ScheduledEvent setEventId(Id val) { this._eventId = val; return this; }

}
