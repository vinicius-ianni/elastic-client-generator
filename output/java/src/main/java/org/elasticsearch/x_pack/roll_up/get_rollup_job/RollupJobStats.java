
package org.elasticsearch.x_pack.roll_up.get_rollup_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class RollupJobStats  {
  
  private Long _documentsProcessed;
  public Long getDocumentsProcessed() { return this._documentsProcessed; }
  public RollupJobStats setDocumentsProcessed(Long val) { this._documentsProcessed = val; return this; }


  private Long _pagesProcessed;
  public Long getPagesProcessed() { return this._pagesProcessed; }
  public RollupJobStats setPagesProcessed(Long val) { this._pagesProcessed = val; return this; }


  private Long _rollupsIndexed;
  public Long getRollupsIndexed() { return this._rollupsIndexed; }
  public RollupJobStats setRollupsIndexed(Long val) { this._rollupsIndexed = val; return this; }


  private Long _triggerCount;
  public Long getTriggerCount() { return this._triggerCount; }
  public RollupJobStats setTriggerCount(Long val) { this._triggerCount = val; return this; }


  private Long _searchFailures;
  public Long getSearchFailures() { return this._searchFailures; }
  public RollupJobStats setSearchFailures(Long val) { this._searchFailures = val; return this; }


  private Long _indexFailures;
  public Long getIndexFailures() { return this._indexFailures; }
  public RollupJobStats setIndexFailures(Long val) { this._indexFailures = val; return this; }


  private Long _indexTimeInMs;
  public Long getIndexTimeInMs() { return this._indexTimeInMs; }
  public RollupJobStats setIndexTimeInMs(Long val) { this._indexTimeInMs = val; return this; }


  private Long _indexTotal;
  public Long getIndexTotal() { return this._indexTotal; }
  public RollupJobStats setIndexTotal(Long val) { this._indexTotal = val; return this; }


  private Long _searchTimeInMs;
  public Long getSearchTimeInMs() { return this._searchTimeInMs; }
  public RollupJobStats setSearchTimeInMs(Long val) { this._searchTimeInMs = val; return this; }


  private Long _searchTotal;
  public Long getSearchTotal() { return this._searchTotal; }
  public RollupJobStats setSearchTotal(Long val) { this._searchTotal = val; return this; }

}
