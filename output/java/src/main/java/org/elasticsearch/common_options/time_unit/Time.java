
package org.elasticsearch.common_options.time_unit;

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

public class Time  implements XContentable<Time> {
  
  static final ParseField FACTOR = new ParseField("factor");
  private Double _factor;
  public Double getFactor() { return this._factor; }
  public Time setFactor(Double val) { this._factor = val; return this; }


  static final ParseField INTERVAL = new ParseField("interval");
  private TimeUnit _interval;
  public TimeUnit getInterval() { return this._interval; }
  public Time setInterval(TimeUnit val) { this._interval = val; return this; }


  static final ParseField MILLISECONDS = new ParseField("milliseconds");
  private Double _milliseconds;
  public Double getMilliseconds() { return this._milliseconds; }
  public Time setMilliseconds(Double val) { this._milliseconds = val; return this; }


  static final ParseField MINUS_ONE = new ParseField("minus_one");
  private Time _minusOne;
  public Time getMinusOne() { return this._minusOne; }
  public Time setMinusOne(Time val) { this._minusOne = val; return this; }


  static final ParseField ZERO = new ParseField("zero");
  private Time _zero;
  public Time getZero() { return this._zero; }
  public Time setZero(Time val) { this._zero = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Time fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Time.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Time, Void> PARSER =
    new ConstructingObjectParser<>(Time.class.getName(), false, args -> new Time());

  static {
    PARSER.declareDouble(Time::setFactor, FACTOR);
    PARSER.declareObject(Time::setInterval, (p, t) -> TimeUnit.PARSER.apply(p, null), INTERVAL);
    PARSER.declareDouble(Time::setMilliseconds, MILLISECONDS);
    PARSER.declareObject(Time::setMinusOne, (p, t) -> Time.PARSER.apply(p, null), MINUS_ONE);
    PARSER.declareObject(Time::setZero, (p, t) -> Time.PARSER.apply(p, null), ZERO);
  }

}
