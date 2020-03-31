
package org.elasticsearch.modules.snapshot_and_restore.snapshot.snapshot_status;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.modules.snapshot_and_restore.snapshot.snapshot_status.*;

public class SnapshotStatusResponse  {
  
  private SnapshotStatus[] _snapshots;
  public SnapshotStatus[] getSnapshots() { return this._snapshots; }
  public SnapshotStatusResponse setSnapshots(SnapshotStatus[] val) { this._snapshots = val; return this; }

}
