
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ShardMerges  {
  
  private Long _current;
  public Long getCurrent() { return this._current; }
  public ShardMerges setCurrent(Long val) { this._current = val; return this; }


  private Long _currentDocs;
  public Long getCurrentDocs() { return this._currentDocs; }
  public ShardMerges setCurrentDocs(Long val) { this._currentDocs = val; return this; }


  private Long _currentSizeInBytes;
  public Long getCurrentSizeInBytes() { return this._currentSizeInBytes; }
  public ShardMerges setCurrentSizeInBytes(Long val) { this._currentSizeInBytes = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public ShardMerges setTotal(Long val) { this._total = val; return this; }


  private Long _totalAutoThrottleInBytes;
  public Long getTotalAutoThrottleInBytes() { return this._totalAutoThrottleInBytes; }
  public ShardMerges setTotalAutoThrottleInBytes(Long val) { this._totalAutoThrottleInBytes = val; return this; }


  private Long _totalDocs;
  public Long getTotalDocs() { return this._totalDocs; }
  public ShardMerges setTotalDocs(Long val) { this._totalDocs = val; return this; }


  private Long _totalSizeInBytes;
  public Long getTotalSizeInBytes() { return this._totalSizeInBytes; }
  public ShardMerges setTotalSizeInBytes(Long val) { this._totalSizeInBytes = val; return this; }


  private Long _totalStoppedTimeInMillis;
  public Long getTotalStoppedTimeInMillis() { return this._totalStoppedTimeInMillis; }
  public ShardMerges setTotalStoppedTimeInMillis(Long val) { this._totalStoppedTimeInMillis = val; return this; }


  private Long _totalThrottledTimeInMillis;
  public Long getTotalThrottledTimeInMillis() { return this._totalThrottledTimeInMillis; }
  public ShardMerges setTotalThrottledTimeInMillis(Long val) { this._totalThrottledTimeInMillis = val; return this; }


  private Long _totalTimeInMillis;
  public Long getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public ShardMerges setTotalTimeInMillis(Long val) { this._totalTimeInMillis = val; return this; }

}
