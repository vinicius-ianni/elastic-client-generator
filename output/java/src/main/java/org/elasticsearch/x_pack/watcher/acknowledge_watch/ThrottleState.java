
package org.elasticsearch.x_pack.watcher.acknowledge_watch;

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

public class ThrottleState  implements XContentable<ThrottleState> {
  
  static final ParseField REASON = new ParseField("reason");
  private String _reason;
  public String getReason() { return this._reason; }
  public ThrottleState setReason(String val) { this._reason = val; return this; }


  static final ParseField TIMESTAMP = new ParseField("timestamp");
  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public ThrottleState setTimestamp(Date val) { this._timestamp = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ThrottleState fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ThrottleState.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ThrottleState, Void> PARSER =
    new ConstructingObjectParser<>(ThrottleState.class.getName(), false, args -> new ThrottleState());

  static {
    PARSER.declareString(ThrottleState::setReason, REASON);
    PARSER.declareObject(ThrottleState::setTimestamp, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), TIMESTAMP);
  }

}
