
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ShardGet  {
  
  private Long _current;
  public Long getCurrent() { return this._current; }
  public ShardGet setCurrent(Long val) { this._current = val; return this; }


  private Long _existsTimeInMillis;
  public Long getExistsTimeInMillis() { return this._existsTimeInMillis; }
  public ShardGet setExistsTimeInMillis(Long val) { this._existsTimeInMillis = val; return this; }


  private Long _existsTotal;
  public Long getExistsTotal() { return this._existsTotal; }
  public ShardGet setExistsTotal(Long val) { this._existsTotal = val; return this; }


  private Long _missingTimeInMillis;
  public Long getMissingTimeInMillis() { return this._missingTimeInMillis; }
  public ShardGet setMissingTimeInMillis(Long val) { this._missingTimeInMillis = val; return this; }


  private Long _missingTotal;
  public Long getMissingTotal() { return this._missingTotal; }
  public ShardGet setMissingTotal(Long val) { this._missingTotal = val; return this; }


  private Long _timeInMillis;
  public Long getTimeInMillis() { return this._timeInMillis; }
  public ShardGet setTimeInMillis(Long val) { this._timeInMillis = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public ShardGet setTotal(Long val) { this._total = val; return this; }

}
