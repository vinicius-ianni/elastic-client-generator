
package org.elasticsearch.x_pack.machine_learning.get_overall_buckets;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.results.*;

public class GetOverallBucketsResponse  {
  
  private Long _count;
  public Long getCount() { return this._count; }
  public GetOverallBucketsResponse setCount(Long val) { this._count = val; return this; }


  private OverallBucket[] _overallBuckets;
  public OverallBucket[] getOverallBuckets() { return this._overallBuckets; }
  public GetOverallBucketsResponse setOverallBuckets(OverallBucket[] val) { this._overallBuckets = val; return this; }

}
