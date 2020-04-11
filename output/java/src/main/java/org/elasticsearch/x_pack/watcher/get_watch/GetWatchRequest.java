
package org.elasticsearch.x_pack.watcher.get_watch;

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


public class GetWatchRequest  implements XContentable<GetWatchRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetWatchRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetWatchRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetWatchRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetWatchRequest.class.getName(), false, args -> new GetWatchRequest());

  static {
    
  }

}
