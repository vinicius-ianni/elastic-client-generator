
package org.elasticsearch.indices.monitoring.indices_segments;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.monitoring.indices_segments.*;

public class IndexSegment  {
  
  private Map<String, ShardsSegment> _shards;
  public Map<String, ShardsSegment> getShards() { return this._shards; }
  public IndexSegment setShards(Map<String, ShardsSegment> val) { this._shards = val; return this; }

}
