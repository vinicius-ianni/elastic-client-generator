
package org.elasticsearch.document.multiple.update_by_query;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.document.multiple.*;
import org.elasticsearch.common_abstractions.infer.task_id.*;

public class UpdateByQueryResponse  {
  
  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public UpdateByQueryResponse setIsValid(Boolean val) { this._isValid = val; return this; }


  private Long _batches;
  public Long getBatches() { return this._batches; }
  public UpdateByQueryResponse setBatches(Long val) { this._batches = val; return this; }


  private BulkIndexByScrollFailure[] _failures;
  public BulkIndexByScrollFailure[] getFailures() { return this._failures; }
  public UpdateByQueryResponse setFailures(BulkIndexByScrollFailure[] val) { this._failures = val; return this; }


  private Long _noops;
  public Long getNoops() { return this._noops; }
  public UpdateByQueryResponse setNoops(Long val) { this._noops = val; return this; }


  private Float _requestsPerSecond;
  public Float getRequestsPerSecond() { return this._requestsPerSecond; }
  public UpdateByQueryResponse setRequestsPerSecond(Float val) { this._requestsPerSecond = val; return this; }


  private Retries _retries;
  public Retries getRetries() { return this._retries; }
  public UpdateByQueryResponse setRetries(Retries val) { this._retries = val; return this; }


  private TaskId _task;
  public TaskId getTask() { return this._task; }
  public UpdateByQueryResponse setTask(TaskId val) { this._task = val; return this; }


  private Boolean _timedOut;
  public Boolean getTimedOut() { return this._timedOut; }
  public UpdateByQueryResponse setTimedOut(Boolean val) { this._timedOut = val; return this; }


  private Long _took;
  public Long getTook() { return this._took; }
  public UpdateByQueryResponse setTook(Long val) { this._took = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public UpdateByQueryResponse setTotal(Long val) { this._total = val; return this; }


  private Long _updated;
  public Long getUpdated() { return this._updated; }
  public UpdateByQueryResponse setUpdated(Long val) { this._updated = val; return this; }


  private Long _versionConflicts;
  public Long getVersionConflicts() { return this._versionConflicts; }
  public UpdateByQueryResponse setVersionConflicts(Long val) { this._versionConflicts = val; return this; }

}
