
package org.elasticsearch.common_options.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class WarmerStats  {
  
  private Long _current;
  public Long getCurrent() { return this._current; }
  public WarmerStats setCurrent(Long val) { this._current = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public WarmerStats setTotal(Long val) { this._total = val; return this; }


  private String _totalTime;
  public String getTotalTime() { return this._totalTime; }
  public WarmerStats setTotalTime(String val) { this._totalTime = val; return this; }


  private Long _totalTimeInMillis;
  public Long getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public WarmerStats setTotalTimeInMillis(Long val) { this._totalTimeInMillis = val; return this; }

}
