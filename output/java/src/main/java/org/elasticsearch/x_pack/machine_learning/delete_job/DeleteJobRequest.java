
package org.elasticsearch.x_pack.machine_learning.delete_job;

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


public class DeleteJobRequest  implements XContentable<DeleteJobRequest> {
  
  static final ParseField FORCE = new ParseField("force");
  private Boolean _force;
  public Boolean getForce() { return this._force; }
  public DeleteJobRequest setForce(Boolean val) { this._force = val; return this; }


  static final ParseField WAIT_FOR_COMPLETION = new ParseField("wait_for_completion");
  private Boolean _waitForCompletion;
  public Boolean getWaitForCompletion() { return this._waitForCompletion; }
  public DeleteJobRequest setWaitForCompletion(Boolean val) { this._waitForCompletion = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(FORCE.getPreferredName(), _force);
    builder.field(WAIT_FOR_COMPLETION.getPreferredName(), _waitForCompletion);
    return builder;
  }

  @Override
  public DeleteJobRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteJobRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteJobRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteJobRequest.class.getName(), false, args -> new DeleteJobRequest());

  static {
    PARSER.declareBoolean(DeleteJobRequest::setForce, FORCE);
    PARSER.declareBoolean(DeleteJobRequest::setWaitForCompletion, WAIT_FOR_COMPLETION);
  }

}
