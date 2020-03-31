
package org.elasticsearch.modules.snapshot_and_restore.snapshot.get_snapshot;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class GetSnapshotRequest  {
  
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public GetSnapshotRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public GetSnapshotRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public GetSnapshotRequest setVerbose(Boolean val) { this._verbose = val; return this; }

}
