
package org.elasticsearch.x_pack.ilm.start;

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


public class StartIlmRequest  implements XContentable<StartIlmRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public StartIlmRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return StartIlmRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<StartIlmRequest, Void> PARSER =
    new ConstructingObjectParser<>(StartIlmRequest.class.getName(), false, args -> new StartIlmRequest());

  static {
    
  }

}
