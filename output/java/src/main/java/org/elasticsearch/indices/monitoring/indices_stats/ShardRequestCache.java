
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ShardRequestCache  {
  
  private Long _evictions;
  public Long getEvictions() { return this._evictions; }
  public ShardRequestCache setEvictions(Long val) { this._evictions = val; return this; }


  private Long _hitCount;
  public Long getHitCount() { return this._hitCount; }
  public ShardRequestCache setHitCount(Long val) { this._hitCount = val; return this; }


  private Long _memorySizeInBytes;
  public Long getMemorySizeInBytes() { return this._memorySizeInBytes; }
  public ShardRequestCache setMemorySizeInBytes(Long val) { this._memorySizeInBytes = val; return this; }


  private Long _missCount;
  public Long getMissCount() { return this._missCount; }
  public ShardRequestCache setMissCount(Long val) { this._missCount = val; return this; }

}
