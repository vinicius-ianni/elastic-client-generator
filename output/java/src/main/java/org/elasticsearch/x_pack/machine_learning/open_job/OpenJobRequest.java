
package org.elasticsearch.x_pack.machine_learning.open_job;

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

public class OpenJobRequest  implements XContentable<OpenJobRequest> {
  
  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public OpenJobRequest setTimeout(Time val) { this._timeout = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public OpenJobRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return OpenJobRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<OpenJobRequest, Void> PARSER =
    new ConstructingObjectParser<>(OpenJobRequest.class.getName(), false, args -> new OpenJobRequest());

  static {
    PARSER.declareObject(OpenJobRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, null), TIMEOUT);
  }

}
