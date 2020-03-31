
package org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_index_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_index_stats.*;

public class FollowIndexStats  {
  
  private String _index;
  public String getIndex() { return this._index; }
  public FollowIndexStats setIndex(String val) { this._index = val; return this; }


  private FollowIndexShardStats[] _shards;
  public FollowIndexShardStats[] getShards() { return this._shards; }
  public FollowIndexStats setShards(FollowIndexShardStats[] val) { this._shards = val; return this; }

}
