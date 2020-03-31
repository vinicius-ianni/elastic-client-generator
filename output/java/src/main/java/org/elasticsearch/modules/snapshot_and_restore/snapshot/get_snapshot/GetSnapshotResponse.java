
package org.elasticsearch.modules.snapshot_and_restore.snapshot.get_snapshot;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.modules.snapshot_and_restore.snapshot.*;

public class GetSnapshotResponse  {
  
  private Snapshot[] _snapshots;
  public Snapshot[] getSnapshots() { return this._snapshots; }
  public GetSnapshotResponse setSnapshots(Snapshot[] val) { this._snapshots = val; return this; }

}
