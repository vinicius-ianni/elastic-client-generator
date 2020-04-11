
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
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.watcher.schedule.*;

public class Interval  implements XContentable<Interval> {
  
  static final ParseField FACTOR = new ParseField("factor");
  private Long _factor;
  public Long getFactor() { return this._factor; }
  public Interval setFactor(Long val) { this._factor = val; return this; }


  static final ParseField UNIT = new ParseField("unit");
  private IntervalUnit _unit;
  public IntervalUnit getUnit() { return this._unit; }
  public Interval setUnit(IntervalUnit val) { this._unit = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Interval fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Interval.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Interval, Void> PARSER =
    new ConstructingObjectParser<>(Interval.class.getName(), false, args -> new Interval());

  static {
    PARSER.declareLong(Interval::setFactor, FACTOR);
    PARSER.declareObject(Interval::setUnit, (p, t) -> IntervalUnit.PARSER.apply(p), UNIT);
  }

}
