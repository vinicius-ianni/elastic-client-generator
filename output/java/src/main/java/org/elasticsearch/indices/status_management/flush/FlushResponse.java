
package org.elasticsearch.indices.status_management.flush;

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


public class FlushResponse  implements XContentable<FlushResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FlushResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FlushResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FlushResponse, Void> PARSER =
    new ConstructingObjectParser<>(FlushResponse.class.getName(), false, args -> new FlushResponse());

  static {
    
  }

}
