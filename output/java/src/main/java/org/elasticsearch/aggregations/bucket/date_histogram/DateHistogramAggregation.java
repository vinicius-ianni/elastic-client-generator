
package org.elasticsearch.aggregations.bucket.date_histogram;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.bucket.histogram.*;
import org.elasticsearch.common_options.date_math.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.aggregations.bucket.date_histogram.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.scripting.*;

public class DateHistogramAggregation  {
  
  private ExtendedBounds<DateMath> _extendedBounds;
  public ExtendedBounds<DateMath> getExtendedBounds() { return this._extendedBounds; }
  public DateHistogramAggregation setExtendedBounds(ExtendedBounds<DateMath> val) { this._extendedBounds = val; return this; }


  private Field _field;
  public Field getField() { return this._field; }
  public DateHistogramAggregation setField(Field val) { this._field = val; return this; }


  private String _format;
  public String getFormat() { return this._format; }
  public DateHistogramAggregation setFormat(String val) { this._format = val; return this; }


  private Either<DateInterval, Time> _interval;
  public Either<DateInterval, Time> getInterval() { return this._interval; }
  public DateHistogramAggregation setInterval(Either<DateInterval, Time> val) { this._interval = val; return this; }


  private Either<DateInterval, Time> _calendarInterval;
  public Either<DateInterval, Time> getCalendarInterval() { return this._calendarInterval; }
  public DateHistogramAggregation setCalendarInterval(Either<DateInterval, Time> val) { this._calendarInterval = val; return this; }


  private Either<DateInterval, Time> _fixedInterval;
  public Either<DateInterval, Time> getFixedInterval() { return this._fixedInterval; }
  public DateHistogramAggregation setFixedInterval(Either<DateInterval, Time> val) { this._fixedInterval = val; return this; }


  private Integer _minDocCount;
  public Integer getMinDocCount() { return this._minDocCount; }
  public DateHistogramAggregation setMinDocCount(Integer val) { this._minDocCount = val; return this; }


  private Date _missing;
  public Date getMissing() { return this._missing; }
  public DateHistogramAggregation setMissing(Date val) { this._missing = val; return this; }


  private String _offset;
  public String getOffset() { return this._offset; }
  public DateHistogramAggregation setOffset(String val) { this._offset = val; return this; }


  private HistogramOrder _order;
  public HistogramOrder getOrder() { return this._order; }
  public DateHistogramAggregation setOrder(HistogramOrder val) { this._order = val; return this; }


  private Map<String, Object> _params;
  public Map<String, Object> getParams() { return this._params; }
  public DateHistogramAggregation setParams(Map<String, Object> val) { this._params = val; return this; }


  private Script _script;
  public Script getScript() { return this._script; }
  public DateHistogramAggregation setScript(Script val) { this._script = val; return this; }


  private String _timeZone;
  public String getTimeZone() { return this._timeZone; }
  public DateHistogramAggregation setTimeZone(String val) { this._timeZone = val; return this; }

}
