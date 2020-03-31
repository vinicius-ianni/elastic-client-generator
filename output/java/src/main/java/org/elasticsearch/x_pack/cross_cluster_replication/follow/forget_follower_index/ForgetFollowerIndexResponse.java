
package org.elasticsearch.x_pack.cross_cluster_replication.follow.forget_follower_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.hit.*;

public class ForgetFollowerIndexResponse  {
  
  private ShardStatistics _shards;
  public ShardStatistics getShards() { return this._shards; }
  public ForgetFollowerIndexResponse setShards(ShardStatistics val) { this._shards = val; return this; }

}
