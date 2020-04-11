
package org.elasticsearch.x_pack.ilm.stop;

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


public class StopIlmRequest  implements XContentable<StopIlmRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public StopIlmRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return StopIlmRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<StopIlmRequest, Void> PARSER =
    new ConstructingObjectParser<>(StopIlmRequest.class.getName(), false, args -> new StopIlmRequest());

  static {
    
  }

}
