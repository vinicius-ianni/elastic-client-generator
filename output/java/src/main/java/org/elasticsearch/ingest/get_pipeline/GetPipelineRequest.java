
package org.elasticsearch.ingest.get_pipeline;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_options.time_unit.*;

public class GetPipelineRequest  implements XContentable<GetPipelineRequest> {
  
  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public GetPipelineRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetPipelineRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetPipelineRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetPipelineRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetPipelineRequest.class.getName(), false, args -> new GetPipelineRequest());

  static {
    PARSER.declareObject(GetPipelineRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, null), MASTER_TIMEOUT);
  }

}
