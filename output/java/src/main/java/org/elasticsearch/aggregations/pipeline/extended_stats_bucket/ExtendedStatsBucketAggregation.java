
package org.elasticsearch.aggregations.pipeline.extended_stats_bucket;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ExtendedStatsBucketAggregation  {
  
  private Double _sigma;
  public Double getSigma() { return this._sigma; }
  public ExtendedStatsBucketAggregation setSigma(Double val) { this._sigma = val; return this; }

}
