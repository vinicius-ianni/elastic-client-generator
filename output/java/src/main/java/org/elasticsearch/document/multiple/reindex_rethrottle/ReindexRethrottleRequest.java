
package org.elasticsearch.document.multiple.reindex_rethrottle;

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

public class ReindexRethrottleRequest  implements XContentable<ReindexRethrottleRequest> {
  
  static final ParseField REQUESTS_PER_SECOND = new ParseField("requests_per_second");
  private Long _requestsPerSecond;
  public Long getRequestsPerSecond() { return this._requestsPerSecond; }
  public ReindexRethrottleRequest setRequestsPerSecond(Long val) { this._requestsPerSecond = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ReindexRethrottleRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ReindexRethrottleRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ReindexRethrottleRequest, Void> PARSER =
    new ConstructingObjectParser<>(ReindexRethrottleRequest.class.getName(), false, args -> new ReindexRethrottleRequest());

  static {
    PARSER.declareLong(ReindexRethrottleRequest::setRequestsPerSecond, REQUESTS_PER_SECOND);
  }

}
