
package org.elasticsearch.x_pack.ilm.retry;

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


public class RetryIlmResponse  implements XContentable<RetryIlmResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    
    builder.endObject();
    return builder;
  }

  @Override
  public RetryIlmResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RetryIlmResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RetryIlmResponse, Void> PARSER =
    new ConstructingObjectParser<>(RetryIlmResponse.class.getName(), false, args -> new RetryIlmResponse());

  static {
    
  }

}
