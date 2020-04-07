
package org.elasticsearch.document.multiple.update_by_query_rethrottle;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;

public class UpdateByQueryRethrottleRequest  implements XContentable<UpdateByQueryRethrottleRequest> {
  
  static final ParseField REQUESTS_PER_SECOND = new ParseField("requests_per_second");
  private Long _requestsPerSecond;
  public Long getRequestsPerSecond() { return this._requestsPerSecond; }
  public UpdateByQueryRethrottleRequest setRequestsPerSecond(Long val) { this._requestsPerSecond = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public UpdateByQueryRethrottleRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return UpdateByQueryRethrottleRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<UpdateByQueryRethrottleRequest, Void> PARSER =
    new ConstructingObjectParser<>(UpdateByQueryRethrottleRequest.class.getName(), false, args -> new UpdateByQueryRethrottleRequest());

  static {
    PARSER.declareLong(UpdateByQueryRethrottleRequest::setRequestsPerSecond, REQUESTS_PER_SECOND);
  }

}
