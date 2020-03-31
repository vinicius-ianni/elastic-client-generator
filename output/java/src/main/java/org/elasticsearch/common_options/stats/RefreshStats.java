
package org.elasticsearch.common_options.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class RefreshStats  {
  
  private Long _total;
  public Long getTotal() { return this._total; }
  public RefreshStats setTotal(Long val) { this._total = val; return this; }


  private String _totalTime;
  public String getTotalTime() { return this._totalTime; }
  public RefreshStats setTotalTime(String val) { this._totalTime = val; return this; }


  private Long _totalTimeInMillis;
  public Long getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public RefreshStats setTotalTimeInMillis(Long val) { this._totalTimeInMillis = val; return this; }


  private Long _externalTotal;
  public Long getExternalTotal() { return this._externalTotal; }
  public RefreshStats setExternalTotal(Long val) { this._externalTotal = val; return this; }


  private Long _externalTotalTimeInMillis;
  public Long getExternalTotalTimeInMillis() { return this._externalTotalTimeInMillis; }
  public RefreshStats setExternalTotalTimeInMillis(Long val) { this._externalTotalTimeInMillis = val; return this; }

}
