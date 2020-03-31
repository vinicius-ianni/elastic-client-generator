
package org.elasticsearch.indices.monitoring.indices_shard_stores;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.monitoring.indices_shard_stores.*;

public class IndicesShardStores  {
  
  private Map<String, ShardStoreWrapper> _shards;
  public Map<String, ShardStoreWrapper> getShards() { return this._shards; }
  public IndicesShardStores setShards(Map<String, ShardStoreWrapper> val) { this._shards = val; return this; }

}
