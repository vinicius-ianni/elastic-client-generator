
package org.elasticsearch.common_abstractions.response;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.hit.*;

public class IndicesResponseBase  {
  
  private ShardStatistics _shards;
  public ShardStatistics getShards() { return this._shards; }
  public IndicesResponseBase setShards(ShardStatistics val) { this._shards = val; return this; }

}
