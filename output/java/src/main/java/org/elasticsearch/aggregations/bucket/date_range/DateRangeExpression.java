
package org.elasticsearch.aggregations.bucket.date_range;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.date_math.*;

public class DateRangeExpression  {
  
  private DateMath _from;
  public DateMath getFrom() { return this._from; }
  public DateRangeExpression setFrom(DateMath val) { this._from = val; return this; }


  private String _key;
  public String getKey() { return this._key; }
  public DateRangeExpression setKey(String val) { this._key = val; return this; }


  private DateMath _to;
  public DateMath getTo() { return this._to; }
  public DateRangeExpression setTo(DateMath val) { this._to = val; return this; }

}
