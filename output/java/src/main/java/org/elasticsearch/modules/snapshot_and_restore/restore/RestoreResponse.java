
package org.elasticsearch.modules.snapshot_and_restore.restore;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.modules.snapshot_and_restore.restore.*;

public class RestoreResponse  {
  
  private SnapshotRestore _snapshot;
  public SnapshotRestore getSnapshot() { return this._snapshot; }
  public RestoreResponse setSnapshot(SnapshotRestore val) { this._snapshot = val; return this; }

}
