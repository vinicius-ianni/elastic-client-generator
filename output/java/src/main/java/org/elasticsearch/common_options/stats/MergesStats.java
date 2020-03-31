
package org.elasticsearch.common_options.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class MergesStats  {
  
  private Long _current;
  public Long getCurrent() { return this._current; }
  public MergesStats setCurrent(Long val) { this._current = val; return this; }


  private Long _currentDocs;
  public Long getCurrentDocs() { return this._currentDocs; }
  public MergesStats setCurrentDocs(Long val) { this._currentDocs = val; return this; }


  private String _currentSize;
  public String getCurrentSize() { return this._currentSize; }
  public MergesStats setCurrentSize(String val) { this._currentSize = val; return this; }


  private Long _currentSizeInBytes;
  public Long getCurrentSizeInBytes() { return this._currentSizeInBytes; }
  public MergesStats setCurrentSizeInBytes(Long val) { this._currentSizeInBytes = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public MergesStats setTotal(Long val) { this._total = val; return this; }


  private String _totalAutoThrottle;
  public String getTotalAutoThrottle() { return this._totalAutoThrottle; }
  public MergesStats setTotalAutoThrottle(String val) { this._totalAutoThrottle = val; return this; }


  private Long _totalAutoThrottleInBytes;
  public Long getTotalAutoThrottleInBytes() { return this._totalAutoThrottleInBytes; }
  public MergesStats setTotalAutoThrottleInBytes(Long val) { this._totalAutoThrottleInBytes = val; return this; }


  private Long _totalDocs;
  public Long getTotalDocs() { return this._totalDocs; }
  public MergesStats setTotalDocs(Long val) { this._totalDocs = val; return this; }


  private String _totalSize;
  public String getTotalSize() { return this._totalSize; }
  public MergesStats setTotalSize(String val) { this._totalSize = val; return this; }


  private Long _totalSizeInBytes;
  public Long getTotalSizeInBytes() { return this._totalSizeInBytes; }
  public MergesStats setTotalSizeInBytes(Long val) { this._totalSizeInBytes = val; return this; }


  private String _totalStoppedTime;
  public String getTotalStoppedTime() { return this._totalStoppedTime; }
  public MergesStats setTotalStoppedTime(String val) { this._totalStoppedTime = val; return this; }


  private Long _totalStoppedTimeInMillis;
  public Long getTotalStoppedTimeInMillis() { return this._totalStoppedTimeInMillis; }
  public MergesStats setTotalStoppedTimeInMillis(Long val) { this._totalStoppedTimeInMillis = val; return this; }


  private String _totalThrottledTime;
  public String getTotalThrottledTime() { return this._totalThrottledTime; }
  public MergesStats setTotalThrottledTime(String val) { this._totalThrottledTime = val; return this; }


  private Long _totalThrottledTimeInMillis;
  public Long getTotalThrottledTimeInMillis() { return this._totalThrottledTimeInMillis; }
  public MergesStats setTotalThrottledTimeInMillis(Long val) { this._totalThrottledTimeInMillis = val; return this; }


  private String _totalTime;
  public String getTotalTime() { return this._totalTime; }
  public MergesStats setTotalTime(String val) { this._totalTime = val; return this; }


  private Long _totalTimeInMillis;
  public Long getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public MergesStats setTotalTimeInMillis(Long val) { this._totalTimeInMillis = val; return this; }

}
