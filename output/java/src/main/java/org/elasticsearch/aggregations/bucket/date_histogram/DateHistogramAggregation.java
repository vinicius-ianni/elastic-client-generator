
package org.elasticsearch.aggregations.bucket.date_histogram;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.aggregations.bucket.histogram.*;
import org.elasticsearch.common_options.date_math.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.aggregations.bucket.date_histogram.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.scripting.*;

public class DateHistogramAggregation  implements XContentable<DateHistogramAggregation> {
  
  static final ParseField EXTENDED_BOUNDS = new ParseField("extended_bounds");
  private ExtendedBounds<DateMath> _extendedBounds;
  public ExtendedBounds<DateMath> getExtendedBounds() { return this._extendedBounds; }
  public DateHistogramAggregation setExtendedBounds(ExtendedBounds<DateMath> val) { this._extendedBounds = val; return this; }


  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public DateHistogramAggregation setField(Field val) { this._field = val; return this; }


  static final ParseField FORMAT = new ParseField("format");
  private String _format;
  public String getFormat() { return this._format; }
  public DateHistogramAggregation setFormat(String val) { this._format = val; return this; }


  static final ParseField INTERVAL = new ParseField("interval");
  private Either<DateInterval, Time> _interval;
  public Either<DateInterval, Time> getInterval() { return this._interval; }
  public DateHistogramAggregation setInterval(Either<DateInterval, Time> val) { this._interval = val; return this; }


  static final ParseField CALENDAR_INTERVAL = new ParseField("calendar_interval");
  private Either<DateInterval, Time> _calendarInterval;
  public Either<DateInterval, Time> getCalendarInterval() { return this._calendarInterval; }
  public DateHistogramAggregation setCalendarInterval(Either<DateInterval, Time> val) { this._calendarInterval = val; return this; }


  static final ParseField FIXED_INTERVAL = new ParseField("fixed_interval");
  private Either<DateInterval, Time> _fixedInterval;
  public Either<DateInterval, Time> getFixedInterval() { return this._fixedInterval; }
  public DateHistogramAggregation setFixedInterval(Either<DateInterval, Time> val) { this._fixedInterval = val; return this; }


  static final ParseField MIN_DOC_COUNT = new ParseField("min_doc_count");
  private Integer _minDocCount;
  public Integer getMinDocCount() { return this._minDocCount; }
  public DateHistogramAggregation setMinDocCount(Integer val) { this._minDocCount = val; return this; }


  static final ParseField MISSING = new ParseField("missing");
  private Date _missing;
  public Date getMissing() { return this._missing; }
  public DateHistogramAggregation setMissing(Date val) { this._missing = val; return this; }


  static final ParseField OFFSET = new ParseField("offset");
  private String _offset;
  public String getOffset() { return this._offset; }
  public DateHistogramAggregation setOffset(String val) { this._offset = val; return this; }


  static final ParseField ORDER = new ParseField("order");
  private HistogramOrder _order;
  public HistogramOrder getOrder() { return this._order; }
  public DateHistogramAggregation setOrder(HistogramOrder val) { this._order = val; return this; }


  static final ParseField PARAMS = new ParseField("params");
  private NamedContainer<String, Object> _params;
  public NamedContainer<String, Object> getParams() { return this._params; }
  public DateHistogramAggregation setParams(NamedContainer<String, Object> val) { this._params = val; return this; }


  static final ParseField SCRIPT = new ParseField("script");
  private Script _script;
  public Script getScript() { return this._script; }
  public DateHistogramAggregation setScript(Script val) { this._script = val; return this; }


  static final ParseField TIME_ZONE = new ParseField("time_zone");
  private String _timeZone;
  public String getTimeZone() { return this._timeZone; }
  public DateHistogramAggregation setTimeZone(String val) { this._timeZone = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DateHistogramAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DateHistogramAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DateHistogramAggregation, Void> PARSER =
    new ConstructingObjectParser<>(DateHistogramAggregation.class.getName(), false, args -> new DateHistogramAggregation());

  static {
    PARSER.declareObject(DateHistogramAggregation::setExtendedBounds, (p, t) -> ExtendedBounds<DateMath>.PARSER.apply(p, null), EXTENDED_BOUNDS);
    PARSER.declareField(DateHistogramAggregation::setField, (p, t) -> Field.createFrom(p), FIELD);
    PARSER.declareString(DateHistogramAggregation::setFormat, FORMAT);
    PARSER.declareObject(DateHistogramAggregation::setInterval, (p, t) -> null, INTERVAL);
    PARSER.declareObject(DateHistogramAggregation::setCalendarInterval, (p, t) -> null, CALENDAR_INTERVAL);
    PARSER.declareObject(DateHistogramAggregation::setFixedInterval, (p, t) -> null, FIXED_INTERVAL);
    PARSER.declareInteger(DateHistogramAggregation::setMinDocCount, MIN_DOC_COUNT);
    PARSER.declareDate(DateHistogramAggregation::setMissing, (p, t) -> Date.createFrom(p), MISSING);
    PARSER.declareString(DateHistogramAggregation::setOffset, OFFSET);
    PARSER.declareObject(DateHistogramAggregation::setOrder, (p, t) -> HistogramOrder.PARSER.apply(p, null), ORDER);
    PARSER.declareObject(DateHistogramAggregation::setParams, (p, t) ->  new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), PARAMS);;
    PARSER.declareObject(DateHistogramAggregation::setScript, (p, t) -> Script.PARSER.apply(p, null), SCRIPT);
    PARSER.declareString(DateHistogramAggregation::setTimeZone, TIME_ZONE);
  }

}
