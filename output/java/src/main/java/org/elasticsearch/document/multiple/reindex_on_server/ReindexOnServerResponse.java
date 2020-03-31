
package org.elasticsearch.document.multiple.reindex_on_server;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.document.multiple.*;
import org.elasticsearch.common_abstractions.infer.task_id.*;
import org.elasticsearch.common_options.time_unit.*;

public class ReindexOnServerResponse  {
  
  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public ReindexOnServerResponse setIsValid(Boolean val) { this._isValid = val; return this; }


  private Long _batches;
  public Long getBatches() { return this._batches; }
  public ReindexOnServerResponse setBatches(Long val) { this._batches = val; return this; }


  private Long _created;
  public Long getCreated() { return this._created; }
  public ReindexOnServerResponse setCreated(Long val) { this._created = val; return this; }


  private BulkIndexByScrollFailure[] _failures;
  public BulkIndexByScrollFailure[] getFailures() { return this._failures; }
  public ReindexOnServerResponse setFailures(BulkIndexByScrollFailure[] val) { this._failures = val; return this; }


  private Long _noops;
  public Long getNoops() { return this._noops; }
  public ReindexOnServerResponse setNoops(Long val) { this._noops = val; return this; }


  private Retries _retries;
  public Retries getRetries() { return this._retries; }
  public ReindexOnServerResponse setRetries(Retries val) { this._retries = val; return this; }


  private Integer _sliceId;
  public Integer getSliceId() { return this._sliceId; }
  public ReindexOnServerResponse setSliceId(Integer val) { this._sliceId = val; return this; }


  private TaskId _task;
  public TaskId getTask() { return this._task; }
  public ReindexOnServerResponse setTask(TaskId val) { this._task = val; return this; }


  private Boolean _timedOut;
  public Boolean getTimedOut() { return this._timedOut; }
  public ReindexOnServerResponse setTimedOut(Boolean val) { this._timedOut = val; return this; }


  private Time _took;
  public Time getTook() { return this._took; }
  public ReindexOnServerResponse setTook(Time val) { this._took = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public ReindexOnServerResponse setTotal(Long val) { this._total = val; return this; }


  private Long _updated;
  public Long getUpdated() { return this._updated; }
  public ReindexOnServerResponse setUpdated(Long val) { this._updated = val; return this; }


  private Long _versionConflicts;
  public Long getVersionConflicts() { return this._versionConflicts; }
  public ReindexOnServerResponse setVersionConflicts(Long val) { this._versionConflicts = val; return this; }

}
