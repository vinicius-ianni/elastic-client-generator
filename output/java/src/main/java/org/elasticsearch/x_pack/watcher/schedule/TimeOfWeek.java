
package org.elasticsearch.x_pack.watcher.schedule;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.watcher.schedule.*;

public class TimeOfWeek  implements XContentable<TimeOfWeek> {
  
  static final ParseField AT = new ParseField("at");
  private List<String> _at;
  public List<String> getAt() { return this._at; }
  public TimeOfWeek setAt(List<String> val) { this._at = val; return this; }


  static final ParseField ON = new ParseField("on");
  private List<Day> _on;
  public List<Day> getOn() { return this._on; }
  public TimeOfWeek setOn(List<Day> val) { this._on = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TimeOfWeek fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TimeOfWeek.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TimeOfWeek, Void> PARSER =
    new ConstructingObjectParser<>(TimeOfWeek.class.getName(), false, args -> new TimeOfWeek());

  static {
    PARSER.declareStringArray(TimeOfWeek::setAt, AT);
    PARSER.declareObjectArray(TimeOfWeek::setOn, (p, t) -> Day.PARSER.apply(p), ON);
  }

}
