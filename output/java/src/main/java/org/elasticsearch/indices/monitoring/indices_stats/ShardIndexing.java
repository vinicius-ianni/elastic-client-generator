
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ShardIndexing  {
  
  private Long _deleteCurrent;
  public Long getDeleteCurrent() { return this._deleteCurrent; }
  public ShardIndexing setDeleteCurrent(Long val) { this._deleteCurrent = val; return this; }


  private Long _deleteTimeInMillis;
  public Long getDeleteTimeInMillis() { return this._deleteTimeInMillis; }
  public ShardIndexing setDeleteTimeInMillis(Long val) { this._deleteTimeInMillis = val; return this; }


  private Long _deleteTotal;
  public Long getDeleteTotal() { return this._deleteTotal; }
  public ShardIndexing setDeleteTotal(Long val) { this._deleteTotal = val; return this; }


  private Long _indexCurrent;
  public Long getIndexCurrent() { return this._indexCurrent; }
  public ShardIndexing setIndexCurrent(Long val) { this._indexCurrent = val; return this; }


  private Long _indexFailed;
  public Long getIndexFailed() { return this._indexFailed; }
  public ShardIndexing setIndexFailed(Long val) { this._indexFailed = val; return this; }


  private Long _indexTimeInMillis;
  public Long getIndexTimeInMillis() { return this._indexTimeInMillis; }
  public ShardIndexing setIndexTimeInMillis(Long val) { this._indexTimeInMillis = val; return this; }


  private Long _indexTotal;
  public Long getIndexTotal() { return this._indexTotal; }
  public ShardIndexing setIndexTotal(Long val) { this._indexTotal = val; return this; }


  private Boolean _isThrottled;
  public Boolean getIsThrottled() { return this._isThrottled; }
  public ShardIndexing setIsThrottled(Boolean val) { this._isThrottled = val; return this; }


  private Long _noopUpdateTotal;
  public Long getNoopUpdateTotal() { return this._noopUpdateTotal; }
  public ShardIndexing setNoopUpdateTotal(Long val) { this._noopUpdateTotal = val; return this; }


  private Long _throttleTimeInMillis;
  public Long getThrottleTimeInMillis() { return this._throttleTimeInMillis; }
  public ShardIndexing setThrottleTimeInMillis(Long val) { this._throttleTimeInMillis = val; return this; }

}
