
package org.elasticsearch.modules.snapshot_and_restore.snapshot.snapshot_status;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class SnapshotShardsStats  {
  
  private Long _done;
  public Long getDone() { return this._done; }
  public SnapshotShardsStats setDone(Long val) { this._done = val; return this; }


  private Long _failed;
  public Long getFailed() { return this._failed; }
  public SnapshotShardsStats setFailed(Long val) { this._failed = val; return this; }


  private Long _finalizing;
  public Long getFinalizing() { return this._finalizing; }
  public SnapshotShardsStats setFinalizing(Long val) { this._finalizing = val; return this; }


  private Long _initializing;
  public Long getInitializing() { return this._initializing; }
  public SnapshotShardsStats setInitializing(Long val) { this._initializing = val; return this; }


  private Long _started;
  public Long getStarted() { return this._started; }
  public SnapshotShardsStats setStarted(Long val) { this._started = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public SnapshotShardsStats setTotal(Long val) { this._total = val; return this; }

}
