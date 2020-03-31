
package org.elasticsearch.aggregations.bucket.date_range;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.aggregations.bucket.date_range.*;

public class DateRangeAggregation  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public DateRangeAggregation setField(Field val) { this._field = val; return this; }


  private String _format;
  public String getFormat() { return this._format; }
  public DateRangeAggregation setFormat(String val) { this._format = val; return this; }


  private Object _missing;
  public Object getMissing() { return this._missing; }
  public DateRangeAggregation setMissing(Object val) { this._missing = val; return this; }


  private DateRangeExpression[] _ranges;
  public DateRangeExpression[] getRanges() { return this._ranges; }
  public DateRangeAggregation setRanges(DateRangeExpression[] val) { this._ranges = val; return this; }


  private String _timeZone;
  public String getTimeZone() { return this._timeZone; }
  public DateRangeAggregation setTimeZone(String val) { this._timeZone = val; return this; }

}
