
package org.elasticsearch.x_pack.watcher.schedule;

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


public class ScheduleBase  implements XContentable<ScheduleBase> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ScheduleBase fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ScheduleBase.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ScheduleBase, Void> PARSER =
    new ConstructingObjectParser<>(ScheduleBase.class.getName(), false, args -> new ScheduleBase());

  static {
    
  }

}
