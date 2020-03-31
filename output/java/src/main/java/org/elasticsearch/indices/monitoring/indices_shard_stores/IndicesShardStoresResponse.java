
package org.elasticsearch.indices.monitoring.indices_shard_stores;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.monitoring.indices_shard_stores.*;

public class IndicesShardStoresResponse  {
  
  private Map<String, IndicesShardStores> _indices;
  public Map<String, IndicesShardStores> getIndices() { return this._indices; }
  public IndicesShardStoresResponse setIndices(Map<String, IndicesShardStores> val) { this._indices = val; return this; }

}
