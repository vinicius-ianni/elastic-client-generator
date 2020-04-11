
package org.elasticsearch.x_pack.watcher.schedule;

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
import org.elasticsearch.x_pack.watcher.schedule.*;
import org.elasticsearch.internal.*;

public class TimeOfYear  implements XContentable<TimeOfYear> {
  
  static final ParseField AT = new ParseField("at");
  private List<String> _at;
  public List<String> getAt() { return this._at; }
  public TimeOfYear setAt(List<String> val) { this._at = val; return this; }


  static final ParseField INT = new ParseField("int");
  private List<Month> _int;
  public List<Month> getInt() { return this._int; }
  public TimeOfYear setInt(List<Month> val) { this._int = val; return this; }


  static final ParseField ON = new ParseField("on");
  private List<Integer> _on;
  public List<Integer> getOn() { return this._on; }
  public TimeOfYear setOn(List<Integer> val) { this._on = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TimeOfYear fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TimeOfYear.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TimeOfYear, Void> PARSER =
    new ConstructingObjectParser<>(TimeOfYear.class.getName(), false, args -> new TimeOfYear());

  static {
    PARSER.declareStringArray(TimeOfYear::setAt, AT);
    PARSER.declareObjectArray(TimeOfYear::setInt, (p, t) -> Month.PARSER.apply(p), INT);
    PARSER.declareIntArray(TimeOfYear::setOn, ON);
  }

}
