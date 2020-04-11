
package org.elasticsearch.x_pack.machine_learning.delete_calendar;

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


public class DeleteCalendarResponse  implements XContentable<DeleteCalendarResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteCalendarResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteCalendarResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteCalendarResponse, Void> PARSER =
    new ConstructingObjectParser<>(DeleteCalendarResponse.class.getName(), false, args -> new DeleteCalendarResponse());

  static {
    
  }

}
