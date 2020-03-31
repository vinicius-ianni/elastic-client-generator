
package org.elasticsearch.modules.snapshot_and_restore.snapshot.snapshot_status;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.modules.snapshot_and_restore.snapshot.snapshot_status.*;
import org.elasticsearch.internal.*;

public class SnapshotStats  {
  
  private FileCountSnapshotStats _incremental;
  public FileCountSnapshotStats getIncremental() { return this._incremental; }
  public SnapshotStats setIncremental(FileCountSnapshotStats val) { this._incremental = val; return this; }


  private FileCountSnapshotStats _total;
  public FileCountSnapshotStats getTotal() { return this._total; }
  public SnapshotStats setTotal(FileCountSnapshotStats val) { this._total = val; return this; }


  private Long _startTimeInMillis;
  public Long getStartTimeInMillis() { return this._startTimeInMillis; }
  public SnapshotStats setStartTimeInMillis(Long val) { this._startTimeInMillis = val; return this; }


  private Long _timeInMillis;
  public Long getTimeInMillis() { return this._timeInMillis; }
  public SnapshotStats setTimeInMillis(Long val) { this._timeInMillis = val; return this; }

}
