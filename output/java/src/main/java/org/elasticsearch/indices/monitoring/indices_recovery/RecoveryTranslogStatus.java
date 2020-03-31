
package org.elasticsearch.indices.monitoring.indices_recovery;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class RecoveryTranslogStatus  {
  
  private String _percent;
  public String getPercent() { return this._percent; }
  public RecoveryTranslogStatus setPercent(String val) { this._percent = val; return this; }


  private Long _recovered;
  public Long getRecovered() { return this._recovered; }
  public RecoveryTranslogStatus setRecovered(Long val) { this._recovered = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public RecoveryTranslogStatus setTotal(Long val) { this._total = val; return this; }


  private Long _totalOnStart;
  public Long getTotalOnStart() { return this._totalOnStart; }
  public RecoveryTranslogStatus setTotalOnStart(Long val) { this._totalOnStart = val; return this; }


  private String _totalTime;
  public String getTotalTime() { return this._totalTime; }
  public RecoveryTranslogStatus setTotalTime(String val) { this._totalTime = val; return this; }


  private Long _totalTimeInMillis;
  public Long getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public RecoveryTranslogStatus setTotalTimeInMillis(Long val) { this._totalTimeInMillis = val; return this; }

}
