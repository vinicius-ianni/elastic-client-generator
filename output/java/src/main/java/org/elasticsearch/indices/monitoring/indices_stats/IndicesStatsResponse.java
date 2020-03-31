
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.monitoring.indices_stats.*;
import org.elasticsearch.common_options.hit.*;

public class IndicesStatsResponse  {
  
  private Map<String, IndicesStats> _indices;
  public Map<String, IndicesStats> getIndices() { return this._indices; }
  public IndicesStatsResponse setIndices(Map<String, IndicesStats> val) { this._indices = val; return this; }


  private ShardStatistics _shards;
  public ShardStatistics getShards() { return this._shards; }
  public IndicesStatsResponse setShards(ShardStatistics val) { this._shards = val; return this; }


  private IndicesStats _all;
  public IndicesStats getAll() { return this._all; }
  public IndicesStatsResponse setAll(IndicesStats val) { this._all = val; return this; }

}
