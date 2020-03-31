
package org.elasticsearch.aggregations.bucket.filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class FiltersAggregation  {
  
  private Either<Map<String, QueryContainer>, QueryContainer[]> _filters;
  public Either<Map<String, QueryContainer>, QueryContainer[]> getFilters() { return this._filters; }
  public FiltersAggregation setFilters(Either<Map<String, QueryContainer>, QueryContainer[]> val) { this._filters = val; return this; }


  private Boolean _otherBucket;
  public Boolean getOtherBucket() { return this._otherBucket; }
  public FiltersAggregation setOtherBucket(Boolean val) { this._otherBucket = val; return this; }


  private String _otherBucketKey;
  public String getOtherBucketKey() { return this._otherBucketKey; }
  public FiltersAggregation setOtherBucketKey(String val) { this._otherBucketKey = val; return this; }

}
