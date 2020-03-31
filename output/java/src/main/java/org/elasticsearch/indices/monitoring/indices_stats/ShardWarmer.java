
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ShardWarmer  {
  
  private Long _current;
  public Long getCurrent() { return this._current; }
  public ShardWarmer setCurrent(Long val) { this._current = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public ShardWarmer setTotal(Long val) { this._total = val; return this; }


  private Long _totalTimeInMillis;
  public Long getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public ShardWarmer setTotalTimeInMillis(Long val) { this._totalTimeInMillis = val; return this; }

}
