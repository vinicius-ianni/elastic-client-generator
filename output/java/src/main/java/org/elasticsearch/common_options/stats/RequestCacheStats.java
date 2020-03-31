
package org.elasticsearch.common_options.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class RequestCacheStats  {
  
  private Long _evictions;
  public Long getEvictions() { return this._evictions; }
  public RequestCacheStats setEvictions(Long val) { this._evictions = val; return this; }


  private Long _hitCount;
  public Long getHitCount() { return this._hitCount; }
  public RequestCacheStats setHitCount(Long val) { this._hitCount = val; return this; }


  private String _memorySize;
  public String getMemorySize() { return this._memorySize; }
  public RequestCacheStats setMemorySize(String val) { this._memorySize = val; return this; }


  private Long _memorySizeInBytes;
  public Long getMemorySizeInBytes() { return this._memorySizeInBytes; }
  public RequestCacheStats setMemorySizeInBytes(Long val) { this._memorySizeInBytes = val; return this; }


  private Long _missCount;
  public Long getMissCount() { return this._missCount; }
  public RequestCacheStats setMissCount(Long val) { this._missCount = val; return this; }

}
