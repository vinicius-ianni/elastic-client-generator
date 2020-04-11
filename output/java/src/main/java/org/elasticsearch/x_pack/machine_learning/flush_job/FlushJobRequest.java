
package org.elasticsearch.x_pack.machine_learning.flush_job;

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
import org.elasticsearch.internal.*;

public class FlushJobRequest  implements XContentable<FlushJobRequest> {
  
  static final ParseField SKIP_TIME = new ParseField("skip_time");
  private String _skipTime;
  public String getSkipTime() { return this._skipTime; }
  public FlushJobRequest setSkipTime(String val) { this._skipTime = val; return this; }


  static final ParseField ADVANCE_TIME = new ParseField("advance_time");
  private Date _advanceTime;
  public Date getAdvanceTime() { return this._advanceTime; }
  public FlushJobRequest setAdvanceTime(Date val) { this._advanceTime = val; return this; }


  static final ParseField CALC_INTERIM = new ParseField("calc_interim");
  private Boolean _calcInterim;
  public Boolean getCalcInterim() { return this._calcInterim; }
  public FlushJobRequest setCalcInterim(Boolean val) { this._calcInterim = val; return this; }


  static final ParseField END = new ParseField("end");
  private Date _end;
  public Date getEnd() { return this._end; }
  public FlushJobRequest setEnd(Date val) { this._end = val; return this; }


  static final ParseField START = new ParseField("start");
  private Date _start;
  public Date getStart() { return this._start; }
  public FlushJobRequest setStart(Date val) { this._start = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FlushJobRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FlushJobRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FlushJobRequest, Void> PARSER =
    new ConstructingObjectParser<>(FlushJobRequest.class.getName(), false, args -> new FlushJobRequest());

  static {
    PARSER.declareString(FlushJobRequest::setSkipTime, SKIP_TIME);
    PARSER.declareObject(FlushJobRequest::setAdvanceTime, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), ADVANCE_TIME);
    PARSER.declareBoolean(FlushJobRequest::setCalcInterim, CALC_INTERIM);
    PARSER.declareObject(FlushJobRequest::setEnd, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), END);
    PARSER.declareObject(FlushJobRequest::setStart, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), START);
  }

}
