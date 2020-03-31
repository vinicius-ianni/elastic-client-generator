
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.monitoring.indices_stats.*;

public class IndicesStats  {
  
  private IndexStats _primaries;
  public IndexStats getPrimaries() { return this._primaries; }
  public IndicesStats setPrimaries(IndexStats val) { this._primaries = val; return this; }


  private Map<String, ShardStats[]> _shards;
  public Map<String, ShardStats[]> getShards() { return this._shards; }
  public IndicesStats setShards(Map<String, ShardStats[]> val) { this._shards = val; return this; }


  private IndexStats _total;
  public IndexStats getTotal() { return this._total; }
  public IndicesStats setTotal(IndexStats val) { this._total = val; return this; }


  private String _uuid;
  public String getUuid() { return this._uuid; }
  public IndicesStats setUuid(String val) { this._uuid = val; return this; }

}
