
package org.elasticsearch.ingest.delete_pipeline;

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
import org.elasticsearch.common_options.time_unit.*;

public class DeletePipelineRequest  implements XContentable<DeletePipelineRequest> {
  
  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public DeletePipelineRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public DeletePipelineRequest setTimeout(Time val) { this._timeout = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeletePipelineRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeletePipelineRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeletePipelineRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeletePipelineRequest.class.getName(), false, args -> new DeletePipelineRequest());

  static {
    PARSER.declareObject(DeletePipelineRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, t), MASTER_TIMEOUT);
    PARSER.declareObject(DeletePipelineRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, t), TIMEOUT);
  }

}
