
package org.elasticsearch.indices.alias_management.delete_alias;

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

public class DeleteAliasRequest  implements XContentable<DeleteAliasRequest> {
  
  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public DeleteAliasRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public DeleteAliasRequest setTimeout(Time val) { this._timeout = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteAliasRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteAliasRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteAliasRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteAliasRequest.class.getName(), false, args -> new DeleteAliasRequest());

  static {
    PARSER.declareObject(DeleteAliasRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, t), MASTER_TIMEOUT);
    PARSER.declareObject(DeleteAliasRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, t), TIMEOUT);
  }

}
