
package org.elasticsearch.x_pack.machine_learning.get_buckets;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.job.results.*;
import org.elasticsearch.internal.*;

public class GetBucketsResponse  {
  
  private Bucket[] _buckets;
  public Bucket[] getBuckets() { return this._buckets; }
  public GetBucketsResponse setBuckets(Bucket[] val) { this._buckets = val; return this; }


  private Long _count;
  public Long getCount() { return this._count; }
  public GetBucketsResponse setCount(Long val) { this._count = val; return this; }

}
