
package org.elasticsearch.document.multiple.delete_by_query;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.document.multiple.*;
import org.elasticsearch.common_abstractions.infer.task_id.*;

public class DeleteByQueryResponse  {
  
  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public DeleteByQueryResponse setIsValid(Boolean val) { this._isValid = val; return this; }


  private Long _batches;
  public Long getBatches() { return this._batches; }
  public DeleteByQueryResponse setBatches(Long val) { this._batches = val; return this; }


  private Long _deleted;
  public Long getDeleted() { return this._deleted; }
  public DeleteByQueryResponse setDeleted(Long val) { this._deleted = val; return this; }


  private BulkIndexByScrollFailure[] _failures;
  public BulkIndexByScrollFailure[] getFailures() { return this._failures; }
  public DeleteByQueryResponse setFailures(BulkIndexByScrollFailure[] val) { this._failures = val; return this; }


  private Long _noops;
  public Long getNoops() { return this._noops; }
  public DeleteByQueryResponse setNoops(Long val) { this._noops = val; return this; }


  private Float _requestsPerSecond;
  public Float getRequestsPerSecond() { return this._requestsPerSecond; }
  public DeleteByQueryResponse setRequestsPerSecond(Float val) { this._requestsPerSecond = val; return this; }


  private Retries _retries;
  public Retries getRetries() { return this._retries; }
  public DeleteByQueryResponse setRetries(Retries val) { this._retries = val; return this; }


  private Integer _sliceId;
  public Integer getSliceId() { return this._sliceId; }
  public DeleteByQueryResponse setSliceId(Integer val) { this._sliceId = val; return this; }


  private TaskId _task;
  public TaskId getTask() { return this._task; }
  public DeleteByQueryResponse setTask(TaskId val) { this._task = val; return this; }


  private Long _throttledMillis;
  public Long getThrottledMillis() { return this._throttledMillis; }
  public DeleteByQueryResponse setThrottledMillis(Long val) { this._throttledMillis = val; return this; }


  private Long _throttledUntilMillis;
  public Long getThrottledUntilMillis() { return this._throttledUntilMillis; }
  public DeleteByQueryResponse setThrottledUntilMillis(Long val) { this._throttledUntilMillis = val; return this; }


  private Boolean _timedOut;
  public Boolean getTimedOut() { return this._timedOut; }
  public DeleteByQueryResponse setTimedOut(Boolean val) { this._timedOut = val; return this; }


  private Long _took;
  public Long getTook() { return this._took; }
  public DeleteByQueryResponse setTook(Long val) { this._took = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public DeleteByQueryResponse setTotal(Long val) { this._total = val; return this; }


  private Long _versionConflicts;
  public Long getVersionConflicts() { return this._versionConflicts; }
  public DeleteByQueryResponse setVersionConflicts(Long val) { this._versionConflicts = val; return this; }

}
