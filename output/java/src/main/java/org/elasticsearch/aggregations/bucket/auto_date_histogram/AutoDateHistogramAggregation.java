
package org.elasticsearch.aggregations.bucket.auto_date_histogram;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.scripting.*;
import org.elasticsearch.aggregations.bucket.auto_date_histogram.*;

public class AutoDateHistogramAggregation  implements XContentable<AutoDateHistogramAggregation> {
  
  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public AutoDateHistogramAggregation setField(Field val) { this._field = val; return this; }


  static final ParseField BUCKETS = new ParseField("buckets");
  private Integer _buckets;
  public Integer getBuckets() { return this._buckets; }
  public AutoDateHistogramAggregation setBuckets(Integer val) { this._buckets = val; return this; }


  static final ParseField FORMAT = new ParseField("format");
  private String _format;
  public String getFormat() { return this._format; }
  public AutoDateHistogramAggregation setFormat(String val) { this._format = val; return this; }


  static final ParseField MISSING = new ParseField("missing");
  private Date _missing;
  public Date getMissing() { return this._missing; }
  public AutoDateHistogramAggregation setMissing(Date val) { this._missing = val; return this; }


  static final ParseField OFFSET = new ParseField("offset");
  private String _offset;
  public String getOffset() { return this._offset; }
  public AutoDateHistogramAggregation setOffset(String val) { this._offset = val; return this; }


  static final ParseField PARAMS = new ParseField("params");
  private NamedContainer<String, Object> _params;
  public NamedContainer<String, Object> getParams() { return this._params; }
  public AutoDateHistogramAggregation setParams(NamedContainer<String, Object> val) { this._params = val; return this; }


  static final ParseField SCRIPT = new ParseField("script");
  private Script _script;
  public Script getScript() { return this._script; }
  public AutoDateHistogramAggregation setScript(Script val) { this._script = val; return this; }


  static final ParseField TIME_ZONE = new ParseField("time_zone");
  private String _timeZone;
  public String getTimeZone() { return this._timeZone; }
  public AutoDateHistogramAggregation setTimeZone(String val) { this._timeZone = val; return this; }


  static final ParseField MINIMUM_INTERVAL = new ParseField("minimum_interval");
  private MinimumInterval _minimumInterval;
  public MinimumInterval getMinimumInterval() { return this._minimumInterval; }
  public AutoDateHistogramAggregation setMinimumInterval(MinimumInterval val) { this._minimumInterval = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public AutoDateHistogramAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AutoDateHistogramAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<AutoDateHistogramAggregation, Void> PARSER =
    new ConstructingObjectParser<>(AutoDateHistogramAggregation.class.getName(), false, args -> new AutoDateHistogramAggregation());

  static {
    PARSER.declareField(AutoDateHistogramAggregation::setField, (p, t) -> Field.createFrom(p), FIELD);
    PARSER.declareInteger(AutoDateHistogramAggregation::setBuckets, BUCKETS);
    PARSER.declareString(AutoDateHistogramAggregation::setFormat, FORMAT);
    PARSER.declareDate(AutoDateHistogramAggregation::setMissing, (p, t) -> Date.createFrom(p), MISSING);
    PARSER.declareString(AutoDateHistogramAggregation::setOffset, OFFSET);
    PARSER.declareObject(AutoDateHistogramAggregation::setParams, (p, t) ->  new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), PARAMS);;
    PARSER.declareObject(AutoDateHistogramAggregation::setScript, (p, t) -> Script.PARSER.apply(p, null), SCRIPT);
    PARSER.declareString(AutoDateHistogramAggregation::setTimeZone, TIME_ZONE);
    PARSER.declareObject(AutoDateHistogramAggregation::setMinimumInterval, (p, t) -> MinimumInterval.PARSER.apply(p, null), MINIMUM_INTERVAL);
  }

}
