
package org.elasticsearch.x_pack.machine_learning.get_calendars;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.get_calendars.*;

public class GetCalendarsResponse  implements XContentable<GetCalendarsResponse> {
  
  static final ParseField COUNT = new ParseField("count");
  private Long _count;
  public Long getCount() { return this._count; }
  public GetCalendarsResponse setCount(Long val) { this._count = val; return this; }


  static final ParseField CALENDARS = new ParseField("calendars");
  private List<Calendar> _calendars;
  public List<Calendar> getCalendars() { return this._calendars; }
  public GetCalendarsResponse setCalendars(List<Calendar> val) { this._calendars = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetCalendarsResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetCalendarsResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetCalendarsResponse, Void> PARSER =
    new ConstructingObjectParser<>(GetCalendarsResponse.class.getName(), false, args -> new GetCalendarsResponse());

  static {
    PARSER.declareLong(GetCalendarsResponse::setCount, COUNT);
    PARSER.declareObjectArray(GetCalendarsResponse::setCalendars, (p, t) -> Calendar.PARSER.apply(p, t), CALENDARS);
  }

}
