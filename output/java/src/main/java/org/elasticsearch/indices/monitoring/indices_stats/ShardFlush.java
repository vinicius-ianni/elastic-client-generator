
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ShardFlush  {
  
  private Long _total;
  public Long getTotal() { return this._total; }
  public ShardFlush setTotal(Long val) { this._total = val; return this; }


  private Long _totalTimeInMillis;
  public Long getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public ShardFlush setTotalTimeInMillis(Long val) { this._totalTimeInMillis = val; return this; }

}
