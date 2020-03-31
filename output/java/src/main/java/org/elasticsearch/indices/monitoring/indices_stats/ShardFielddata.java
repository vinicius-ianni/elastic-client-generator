
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ShardFielddata  {
  
  private Long _evictions;
  public Long getEvictions() { return this._evictions; }
  public ShardFielddata setEvictions(Long val) { this._evictions = val; return this; }


  private Long _memorySizeInBytes;
  public Long getMemorySizeInBytes() { return this._memorySizeInBytes; }
  public ShardFielddata setMemorySizeInBytes(Long val) { this._memorySizeInBytes = val; return this; }

}
