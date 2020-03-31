
package org.elasticsearch.aggregations.metric.extended_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ExtendedStatsAggregation  {
  
  private Double _sigma;
  public Double getSigma() { return this._sigma; }
  public ExtendedStatsAggregation setSigma(Double val) { this._sigma = val; return this; }

}
