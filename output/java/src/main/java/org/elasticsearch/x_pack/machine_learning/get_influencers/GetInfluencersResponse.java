
package org.elasticsearch.x_pack.machine_learning.get_influencers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.results.*;

public class GetInfluencersResponse  {
  
  private Long _count;
  public Long getCount() { return this._count; }
  public GetInfluencersResponse setCount(Long val) { this._count = val; return this; }


  private BucketInfluencer[] _influencers;
  public BucketInfluencer[] getInfluencers() { return this._influencers; }
  public GetInfluencersResponse setInfluencers(BucketInfluencer[] val) { this._influencers = val; return this; }

}
