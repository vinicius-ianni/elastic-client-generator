
package org.elasticsearch.indices.monitoring.indices_segments;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.monitoring.indices_segments.*;
import org.elasticsearch.common_options.hit.*;

public class SegmentsResponse  {
  
  private Map<String, IndexSegment> _indices;
  public Map<String, IndexSegment> getIndices() { return this._indices; }
  public SegmentsResponse setIndices(Map<String, IndexSegment> val) { this._indices = val; return this; }


  private ShardStatistics _shards;
  public ShardStatistics getShards() { return this._shards; }
  public SegmentsResponse setShards(ShardStatistics val) { this._shards = val; return this; }

}
