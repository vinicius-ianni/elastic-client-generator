
package org.elasticsearch.x_pack.slm;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.slm.*;

public class SnapshotLifecyclePolicyMetadata  {
  
  private Date _modifiedDateMillis;
  public Date getModifiedDateMillis() { return this._modifiedDateMillis; }
  public SnapshotLifecyclePolicyMetadata setModifiedDateMillis(Date val) { this._modifiedDateMillis = val; return this; }


  private Date _nextExecutionMillis;
  public Date getNextExecutionMillis() { return this._nextExecutionMillis; }
  public SnapshotLifecyclePolicyMetadata setNextExecutionMillis(Date val) { this._nextExecutionMillis = val; return this; }


  private SnapshotLifecyclePolicy _policy;
  public SnapshotLifecyclePolicy getPolicy() { return this._policy; }
  public SnapshotLifecyclePolicyMetadata setPolicy(SnapshotLifecyclePolicy val) { this._policy = val; return this; }


  private Integer _version;
  public Integer getVersion() { return this._version; }
  public SnapshotLifecyclePolicyMetadata setVersion(Integer val) { this._version = val; return this; }


  private SnapshotLifecycleInProgress _inProgress;
  public SnapshotLifecycleInProgress getInProgress() { return this._inProgress; }
  public SnapshotLifecyclePolicyMetadata setInProgress(SnapshotLifecycleInProgress val) { this._inProgress = val; return this; }


  private SnapshotLifecycleInvocationRecord _lastSuccess;
  public SnapshotLifecycleInvocationRecord getLastSuccess() { return this._lastSuccess; }
  public SnapshotLifecyclePolicyMetadata setLastSuccess(SnapshotLifecycleInvocationRecord val) { this._lastSuccess = val; return this; }


  private SnapshotLifecycleInvocationRecord _lastFailure;
  public SnapshotLifecycleInvocationRecord getLastFailure() { return this._lastFailure; }
  public SnapshotLifecyclePolicyMetadata setLastFailure(SnapshotLifecycleInvocationRecord val) { this._lastFailure = val; return this; }

}
