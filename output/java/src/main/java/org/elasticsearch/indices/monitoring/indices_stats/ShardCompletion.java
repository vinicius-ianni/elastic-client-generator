
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ShardCompletion  {
  
  private Long _sizeInBytes;
  public Long getSizeInBytes() { return this._sizeInBytes; }
  public ShardCompletion setSizeInBytes(Long val) { this._sizeInBytes = val; return this; }

}
