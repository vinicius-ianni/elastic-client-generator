
package org.elasticsearch.aggregations.pipeline.percentiles_bucket;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class PercentilesBucketAggregation  {
  
  private Double[] _percents;
  public Double[] getPercents() { return this._percents; }
  public PercentilesBucketAggregation setPercents(Double[] val) { this._percents = val; return this; }

}
