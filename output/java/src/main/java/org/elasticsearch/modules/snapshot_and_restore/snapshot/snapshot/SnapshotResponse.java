
package org.elasticsearch.modules.snapshot_and_restore.snapshot.snapshot;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.modules.snapshot_and_restore.snapshot.*;

public class SnapshotResponse  {
  
  private Boolean _accepted;
  public Boolean getAccepted() { return this._accepted; }
  public SnapshotResponse setAccepted(Boolean val) { this._accepted = val; return this; }


  private Snapshot _snapshot;
  public Snapshot getSnapshot() { return this._snapshot; }
  public SnapshotResponse setSnapshot(Snapshot val) { this._snapshot = val; return this; }

}
