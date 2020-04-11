
package org.elasticsearch.modules.snapshot_and_restore.repositories.cleanup_repository;

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

public class CleanupRepositoryRequest  implements XContentable<CleanupRepositoryRequest> {
  
  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CleanupRepositoryRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public CleanupRepositoryRequest setTimeout(Time val) { this._timeout = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CleanupRepositoryRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CleanupRepositoryRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CleanupRepositoryRequest, Void> PARSER =
    new ConstructingObjectParser<>(CleanupRepositoryRequest.class.getName(), false, args -> new CleanupRepositoryRequest());

  static {
    PARSER.declareObject(CleanupRepositoryRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, t), MASTER_TIMEOUT);
    PARSER.declareObject(CleanupRepositoryRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, t), TIMEOUT);
  }

}
