
package org.elasticsearch.search.count;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.hit.*;

public class CountResponse  {
  
  private Long _count;
  public Long getCount() { return this._count; }
  public CountResponse setCount(Long val) { this._count = val; return this; }


  private ShardStatistics _shards;
  public ShardStatistics getShards() { return this._shards; }
  public CountResponse setShards(ShardStatistics val) { this._shards = val; return this; }

}
