
package org.elasticsearch.modules.scripting.delete_script;

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

public class DeleteScriptRequest  implements XContentable<DeleteScriptRequest> {
  
  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public DeleteScriptRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public DeleteScriptRequest setTimeout(Time val) { this._timeout = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteScriptRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteScriptRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteScriptRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteScriptRequest.class.getName(), false, args -> new DeleteScriptRequest());

  static {
    PARSER.declareObject(DeleteScriptRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, null), MASTER_TIMEOUT);
    PARSER.declareObject(DeleteScriptRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, null), TIMEOUT);
  }

}
