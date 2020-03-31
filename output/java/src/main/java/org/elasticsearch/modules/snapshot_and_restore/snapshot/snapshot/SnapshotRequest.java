
package org.elasticsearch.modules.snapshot_and_restore.snapshot.snapshot;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.indices.*;
import org.elasticsearch.common_options.time_unit.*;

public class SnapshotRequest  {
  
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public SnapshotRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _includeGlobalState;
  public Boolean getIncludeGlobalState() { return this._includeGlobalState; }
  public SnapshotRequest setIncludeGlobalState(Boolean val) { this._includeGlobalState = val; return this; }


  private Indices _indices;
  public Indices getIndices() { return this._indices; }
  public SnapshotRequest setIndices(Indices val) { this._indices = val; return this; }


  private Boolean _partial;
  public Boolean getPartial() { return this._partial; }
  public SnapshotRequest setPartial(Boolean val) { this._partial = val; return this; }


  private Map<String, Object> _metadata;
  public Map<String, Object> getMetadata() { return this._metadata; }
  public SnapshotRequest setMetadata(Map<String, Object> val) { this._metadata = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public SnapshotRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Boolean _waitForCompletion;
  public Boolean getWaitForCompletion() { return this._waitForCompletion; }
  public SnapshotRequest setWaitForCompletion(Boolean val) { this._waitForCompletion = val; return this; }

}
