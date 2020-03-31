
package org.elasticsearch.cluster.task_management.list_tasks;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.cluster.task_management.list_tasks.*;

public class TaskStatus  {
  
  private Long _batches;
  public Long getBatches() { return this._batches; }
  public TaskStatus setBatches(Long val) { this._batches = val; return this; }


  private Long _created;
  public Long getCreated() { return this._created; }
  public TaskStatus setCreated(Long val) { this._created = val; return this; }


  private Long _deleted;
  public Long getDeleted() { return this._deleted; }
  public TaskStatus setDeleted(Long val) { this._deleted = val; return this; }


  private Long _noops;
  public Long getNoops() { return this._noops; }
  public TaskStatus setNoops(Long val) { this._noops = val; return this; }


  private Float _requestsPerSecond;
  public Float getRequestsPerSecond() { return this._requestsPerSecond; }
  public TaskStatus setRequestsPerSecond(Float val) { this._requestsPerSecond = val; return this; }


  private TaskRetries _retries;
  public TaskRetries getRetries() { return this._retries; }
  public TaskStatus setRetries(TaskRetries val) { this._retries = val; return this; }


  private Long _throttledMillis;
  public Long getThrottledMillis() { return this._throttledMillis; }
  public TaskStatus setThrottledMillis(Long val) { this._throttledMillis = val; return this; }


  private Long _throttledUntilMillis;
  public Long getThrottledUntilMillis() { return this._throttledUntilMillis; }
  public TaskStatus setThrottledUntilMillis(Long val) { this._throttledUntilMillis = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public TaskStatus setTotal(Long val) { this._total = val; return this; }


  private Long _updated;
  public Long getUpdated() { return this._updated; }
  public TaskStatus setUpdated(Long val) { this._updated = val; return this; }


  private Long _versionConflicts;
  public Long getVersionConflicts() { return this._versionConflicts; }
  public TaskStatus setVersionConflicts(Long val) { this._versionConflicts = val; return this; }

}
