
package org.elasticsearch.aggregations.bucket;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.*;

public class BucketAggregation  {
  
  private Map<String, AggregationContainer> _aggregations;
  public Map<String, AggregationContainer> getAggregations() { return this._aggregations; }
  public BucketAggregation setAggregations(Map<String, AggregationContainer> val) { this._aggregations = val; return this; }

}
