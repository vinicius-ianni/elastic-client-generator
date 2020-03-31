
package org.elasticsearch.common_options.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class QueryCacheStats  {
  
  private Long _cacheCount;
  public Long getCacheCount() { return this._cacheCount; }
  public QueryCacheStats setCacheCount(Long val) { this._cacheCount = val; return this; }


  private Long _cacheSize;
  public Long getCacheSize() { return this._cacheSize; }
  public QueryCacheStats setCacheSize(Long val) { this._cacheSize = val; return this; }


  private Long _evictions;
  public Long getEvictions() { return this._evictions; }
  public QueryCacheStats setEvictions(Long val) { this._evictions = val; return this; }


  private Long _hitCount;
  public Long getHitCount() { return this._hitCount; }
  public QueryCacheStats setHitCount(Long val) { this._hitCount = val; return this; }


  private Long _memorySizeInBytes;
  public Long getMemorySizeInBytes() { return this._memorySizeInBytes; }
  public QueryCacheStats setMemorySizeInBytes(Long val) { this._memorySizeInBytes = val; return this; }


  private Long _missCount;
  public Long getMissCount() { return this._missCount; }
  public QueryCacheStats setMissCount(Long val) { this._missCount = val; return this; }


  private Long _totalCount;
  public Long getTotalCount() { return this._totalCount; }
  public QueryCacheStats setTotalCount(Long val) { this._totalCount = val; return this; }

}
