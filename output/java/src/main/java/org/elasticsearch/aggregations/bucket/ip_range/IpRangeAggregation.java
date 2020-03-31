
package org.elasticsearch.aggregations.bucket.ip_range;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.aggregations.bucket.ip_range.*;

public class IpRangeAggregation  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public IpRangeAggregation setField(Field val) { this._field = val; return this; }


  private IpRangeAggregationRange[] _ranges;
  public IpRangeAggregationRange[] getRanges() { return this._ranges; }
  public IpRangeAggregation setRanges(IpRangeAggregationRange[] val) { this._ranges = val; return this; }

}
