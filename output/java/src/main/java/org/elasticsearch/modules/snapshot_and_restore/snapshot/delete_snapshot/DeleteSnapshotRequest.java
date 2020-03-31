
package org.elasticsearch.modules.snapshot_and_restore.snapshot.delete_snapshot;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class DeleteSnapshotRequest  {
  
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public DeleteSnapshotRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }

}
