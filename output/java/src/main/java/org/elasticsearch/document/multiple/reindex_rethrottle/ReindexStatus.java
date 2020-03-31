
package org.elasticsearch.document.multiple.reindex_rethrottle;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.document.multiple.*;

public class ReindexStatus  {
  
  private Long _batches;
  public Long getBatches() { return this._batches; }
  public ReindexStatus setBatches(Long val) { this._batches = val; return this; }


  private Long _created;
  public Long getCreated() { return this._created; }
  public ReindexStatus setCreated(Long val) { this._created = val; return this; }


  private Long _deleted;
  public Long getDeleted() { return this._deleted; }
  public ReindexStatus setDeleted(Long val) { this._deleted = val; return this; }


  private Long _noops;
  public Long getNoops() { return this._noops; }
  public ReindexStatus setNoops(Long val) { this._noops = val; return this; }


  private Float _requestsPerSecond;
  public Float getRequestsPerSecond() { return this._requestsPerSecond; }
  public ReindexStatus setRequestsPerSecond(Float val) { this._requestsPerSecond = val; return this; }


  private Retries _retries;
  public Retries getRetries() { return this._retries; }
  public ReindexStatus setRetries(Retries val) { this._retries = val; return this; }


  private Long _throttledMillis;
  public Long getThrottledMillis() { return this._throttledMillis; }
  public ReindexStatus setThrottledMillis(Long val) { this._throttledMillis = val; return this; }


  private Long _throttledUntilMillis;
  public Long getThrottledUntilMillis() { return this._throttledUntilMillis; }
  public ReindexStatus setThrottledUntilMillis(Long val) { this._throttledUntilMillis = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public ReindexStatus setTotal(Long val) { this._total = val; return this; }


  private Long _updated;
  public Long getUpdated() { return this._updated; }
  public ReindexStatus setUpdated(Long val) { this._updated = val; return this; }


  private Long _versionConflicts;
  public Long getVersionConflicts() { return this._versionConflicts; }
  public ReindexStatus setVersionConflicts(Long val) { this._versionConflicts = val; return this; }

}
