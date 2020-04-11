
package org.elasticsearch.x_pack.machine_learning.put_calendar;

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


public class PutCalendarRequest  implements XContentable<PutCalendarRequest> {
  
  static final ParseField DESCRIPTION = new ParseField("description");
  private String _description;
  public String getDescription() { return this._description; }
  public PutCalendarRequest setDescription(String val) { this._description = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutCalendarRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutCalendarRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutCalendarRequest, Void> PARSER =
    new ConstructingObjectParser<>(PutCalendarRequest.class.getName(), false, args -> new PutCalendarRequest());

  static {
    PARSER.declareString(PutCalendarRequest::setDescription, DESCRIPTION);
  }

}
