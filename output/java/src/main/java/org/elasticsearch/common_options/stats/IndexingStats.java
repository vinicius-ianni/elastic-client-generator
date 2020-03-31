
package org.elasticsearch.common_options.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.stats.*;

public class IndexingStats  {
  
  private Long _indexCurrent;
  public Long getIndexCurrent() { return this._indexCurrent; }
  public IndexingStats setIndexCurrent(Long val) { this._indexCurrent = val; return this; }


  private Long _deleteCurrent;
  public Long getDeleteCurrent() { return this._deleteCurrent; }
  public IndexingStats setDeleteCurrent(Long val) { this._deleteCurrent = val; return this; }


  private String _deleteTime;
  public String getDeleteTime() { return this._deleteTime; }
  public IndexingStats setDeleteTime(String val) { this._deleteTime = val; return this; }


  private Long _deleteTimeInMillis;
  public Long getDeleteTimeInMillis() { return this._deleteTimeInMillis; }
  public IndexingStats setDeleteTimeInMillis(Long val) { this._deleteTimeInMillis = val; return this; }


  private Long _deleteTotal;
  public Long getDeleteTotal() { return this._deleteTotal; }
  public IndexingStats setDeleteTotal(Long val) { this._deleteTotal = val; return this; }


  private Boolean _isThrottled;
  public Boolean getIsThrottled() { return this._isThrottled; }
  public IndexingStats setIsThrottled(Boolean val) { this._isThrottled = val; return this; }


  private Long _noopUpdateTotal;
  public Long getNoopUpdateTotal() { return this._noopUpdateTotal; }
  public IndexingStats setNoopUpdateTotal(Long val) { this._noopUpdateTotal = val; return this; }


  private String _throttleTime;
  public String getThrottleTime() { return this._throttleTime; }
  public IndexingStats setThrottleTime(String val) { this._throttleTime = val; return this; }


  private Long _throttleTimeInMillis;
  public Long getThrottleTimeInMillis() { return this._throttleTimeInMillis; }
  public IndexingStats setThrottleTimeInMillis(Long val) { this._throttleTimeInMillis = val; return this; }


  private String _indexTime;
  public String getIndexTime() { return this._indexTime; }
  public IndexingStats setIndexTime(String val) { this._indexTime = val; return this; }


  private Long _indexTimeInMillis;
  public Long getIndexTimeInMillis() { return this._indexTimeInMillis; }
  public IndexingStats setIndexTimeInMillis(Long val) { this._indexTimeInMillis = val; return this; }


  private Long _indexTotal;
  public Long getIndexTotal() { return this._indexTotal; }
  public IndexingStats setIndexTotal(Long val) { this._indexTotal = val; return this; }


  private Map<String, IndexingStats> _types;
  public Map<String, IndexingStats> getTypes() { return this._types; }
  public IndexingStats setTypes(Map<String, IndexingStats> val) { this._types = val; return this; }

}
