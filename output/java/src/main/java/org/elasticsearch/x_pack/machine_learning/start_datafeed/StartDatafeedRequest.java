
package org.elasticsearch.x_pack.machine_learning.start_datafeed;

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
import org.elasticsearch.common_options.time_unit.*;

public class StartDatafeedRequest  implements XContentable<StartDatafeedRequest> {
  
  static final ParseField END = new ParseField("end");
  private Date _end;
  public Date getEnd() { return this._end; }
  public StartDatafeedRequest setEnd(Date val) { this._end = val; return this; }


  static final ParseField START = new ParseField("start");
  private Date _start;
  public Date getStart() { return this._start; }
  public StartDatafeedRequest setStart(Date val) { this._start = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public StartDatafeedRequest setTimeout(Time val) { this._timeout = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public StartDatafeedRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return StartDatafeedRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<StartDatafeedRequest, Void> PARSER =
    new ConstructingObjectParser<>(StartDatafeedRequest.class.getName(), false, args -> new StartDatafeedRequest());

  static {
    PARSER.declareDate(StartDatafeedRequest::setEnd, (p, t) -> Date.createFrom(p), END);
    PARSER.declareDate(StartDatafeedRequest::setStart, (p, t) -> Date.createFrom(p), START);
    PARSER.declareObject(StartDatafeedRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, null), TIMEOUT);
  }

}
