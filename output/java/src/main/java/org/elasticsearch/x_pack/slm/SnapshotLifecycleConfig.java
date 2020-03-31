
package org.elasticsearch.x_pack.slm;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.indices.*;

public class SnapshotLifecycleConfig  {
  
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public SnapshotLifecycleConfig setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _includeGlobalState;
  public Boolean getIncludeGlobalState() { return this._includeGlobalState; }
  public SnapshotLifecycleConfig setIncludeGlobalState(Boolean val) { this._includeGlobalState = val; return this; }


  private Indices _indices;
  public Indices getIndices() { return this._indices; }
  public SnapshotLifecycleConfig setIndices(Indices val) { this._indices = val; return this; }

}
