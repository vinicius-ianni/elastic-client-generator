
package org.elasticsearch.modules.snapshot_and_restore.snapshot.snapshot_status;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class SnapshotStatusRequest  {
  
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public SnapshotStatusRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public SnapshotStatusRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }

}
