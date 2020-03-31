
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ShardRefresh  {
  
  private Long _listeners;
  public Long getListeners() { return this._listeners; }
  public ShardRefresh setListeners(Long val) { this._listeners = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public ShardRefresh setTotal(Long val) { this._total = val; return this; }


  private Long _totalTimeInMillis;
  public Long getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public ShardRefresh setTotalTimeInMillis(Long val) { this._totalTimeInMillis = val; return this; }

}
