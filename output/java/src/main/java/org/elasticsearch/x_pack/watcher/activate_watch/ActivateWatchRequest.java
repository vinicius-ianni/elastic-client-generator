
package org.elasticsearch.x_pack.watcher.activate_watch;

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


public class ActivateWatchRequest  implements XContentable<ActivateWatchRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ActivateWatchRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ActivateWatchRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ActivateWatchRequest, Void> PARSER =
    new ConstructingObjectParser<>(ActivateWatchRequest.class.getName(), false, args -> new ActivateWatchRequest());

  static {
    
  }

}
