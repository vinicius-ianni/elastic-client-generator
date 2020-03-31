
package org.elasticsearch.aggregations.metric.percentile_ranks;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.metric.percentiles.methods.*;
import org.elasticsearch.internal.*;

public class PercentileRanksAggregation  {
  
  private PercentilesMethod _method;
  public PercentilesMethod getMethod() { return this._method; }
  public PercentileRanksAggregation setMethod(PercentilesMethod val) { this._method = val; return this; }


  private Double[] _values;
  public Double[] getValues() { return this._values; }
  public PercentileRanksAggregation setValues(Double[] val) { this._values = val; return this; }


  private Boolean _keyed;
  public Boolean getKeyed() { return this._keyed; }
  public PercentileRanksAggregation setKeyed(Boolean val) { this._keyed = val; return this; }

}
