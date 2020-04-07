
package org.elasticsearch.x_pack.machine_learning.post_calendar_events;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.internal.*;

public class ScheduledEvent  implements XContentable<ScheduledEvent> {
  
  static final ParseField CALENDAR_ID = new ParseField("calendar_id");
  private Id _calendarId;
  public Id getCalendarId() { return this._calendarId; }
  public ScheduledEvent setCalendarId(Id val) { this._calendarId = val; return this; }


  static final ParseField DESCRIPTION = new ParseField("description");
  private String _description;
  public String getDescription() { return this._description; }
  public ScheduledEvent setDescription(String val) { this._description = val; return this; }


  static final ParseField START_TIME = new ParseField("start_time");
  private Date _startTime;
  public Date getStartTime() { return this._startTime; }
  public ScheduledEvent setStartTime(Date val) { this._startTime = val; return this; }


  static final ParseField END_TIME = new ParseField("end_time");
  private Date _endTime;
  public Date getEndTime() { return this._endTime; }
  public ScheduledEvent setEndTime(Date val) { this._endTime = val; return this; }


  static final ParseField EVENT_ID = new ParseField("event_id");
  private Id _eventId;
  public Id getEventId() { return this._eventId; }
  public ScheduledEvent setEventId(Id val) { this._eventId = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ScheduledEvent fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ScheduledEvent.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ScheduledEvent, Void> PARSER =
    new ConstructingObjectParser<>(ScheduledEvent.class.getName(), false, args -> new ScheduledEvent());

  static {
    PARSER.declareId(ScheduledEvent::setCalendarId, (p, t) -> Id.createFrom(p), CALENDAR_ID);
    PARSER.declareString(ScheduledEvent::setDescription, DESCRIPTION);
    PARSER.declareDate(ScheduledEvent::setStartTime, (p, t) -> Date.createFrom(p), START_TIME);
    PARSER.declareDate(ScheduledEvent::setEndTime, (p, t) -> Date.createFrom(p), END_TIME);
    PARSER.declareId(ScheduledEvent::setEventId, (p, t) -> Id.createFrom(p), EVENT_ID);
  }

}
