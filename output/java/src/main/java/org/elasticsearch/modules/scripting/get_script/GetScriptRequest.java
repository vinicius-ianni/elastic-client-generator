
package org.elasticsearch.modules.scripting.get_script;

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

public class GetScriptRequest  implements XContentable<GetScriptRequest> {
  
  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public GetScriptRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetScriptRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetScriptRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetScriptRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetScriptRequest.class.getName(), false, args -> new GetScriptRequest());

  static {
    PARSER.declareObject(GetScriptRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, t), MASTER_TIMEOUT);
  }

}
