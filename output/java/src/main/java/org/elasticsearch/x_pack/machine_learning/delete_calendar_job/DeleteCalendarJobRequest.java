
package org.elasticsearch.x_pack.machine_learning.delete_calendar_job;

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


public class DeleteCalendarJobRequest  implements XContentable<DeleteCalendarJobRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteCalendarJobRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteCalendarJobRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteCalendarJobRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteCalendarJobRequest.class.getName(), false, args -> new DeleteCalendarJobRequest());

  static {
    
  }

}
