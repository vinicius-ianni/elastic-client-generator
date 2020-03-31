
package org.elasticsearch.common_options.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class FlushStats  {
  
  private Long _periodic;
  public Long getPeriodic() { return this._periodic; }
  public FlushStats setPeriodic(Long val) { this._periodic = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public FlushStats setTotal(Long val) { this._total = val; return this; }


  private String _totalTime;
  public String getTotalTime() { return this._totalTime; }
  public FlushStats setTotalTime(String val) { this._totalTime = val; return this; }


  private Long _totalTimeInMillis;
  public Long getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public FlushStats setTotalTimeInMillis(Long val) { this._totalTimeInMillis = val; return this; }

}
