
package org.elasticsearch.x_pack.machine_learning.delete_calendar_event;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class DeleteCalendarEventResponse  implements XContentable<DeleteCalendarEventResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteCalendarEventResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteCalendarEventResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteCalendarEventResponse, Void> PARSER =
    new ConstructingObjectParser<>(DeleteCalendarEventResponse.class.getName(), false, args -> new DeleteCalendarEventResponse());

  static {
    
  }

}
