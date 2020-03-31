
package org.elasticsearch.aggregations.metric.percentiles;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.metric.percentiles.methods.*;
import org.elasticsearch.internal.*;

public class PercentilesAggregation  {
  
  private PercentilesMethod _method;
  public PercentilesMethod getMethod() { return this._method; }
  public PercentilesAggregation setMethod(PercentilesMethod val) { this._method = val; return this; }


  private Double[] _percents;
  public Double[] getPercents() { return this._percents; }
  public PercentilesAggregation setPercents(Double[] val) { this._percents = val; return this; }


  private Boolean _keyed;
  public Boolean getKeyed() { return this._keyed; }
  public PercentilesAggregation setKeyed(Boolean val) { this._keyed = val; return this; }

}
