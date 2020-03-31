
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ShardStatsStore  {
  
  private Long _sizeInBytes;
  public Long getSizeInBytes() { return this._sizeInBytes; }
  public ShardStatsStore setSizeInBytes(Long val) { this._sizeInBytes = val; return this; }

}
