
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.cluster_stats.*;

public class ClusterIndicesShardsIndexStats  {
  
  private ClusterShardMetrics _primaries;
  public ClusterShardMetrics getPrimaries() { return this._primaries; }
  public ClusterIndicesShardsIndexStats setPrimaries(ClusterShardMetrics val) { this._primaries = val; return this; }


  private ClusterShardMetrics _replication;
  public ClusterShardMetrics getReplication() { return this._replication; }
  public ClusterIndicesShardsIndexStats setReplication(ClusterShardMetrics val) { this._replication = val; return this; }


  private ClusterShardMetrics _shards;
  public ClusterShardMetrics getShards() { return this._shards; }
  public ClusterIndicesShardsIndexStats setShards(ClusterShardMetrics val) { this._shards = val; return this; }

}
