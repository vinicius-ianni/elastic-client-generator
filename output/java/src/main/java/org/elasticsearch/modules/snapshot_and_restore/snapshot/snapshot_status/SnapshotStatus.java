
package org.elasticsearch.modules.snapshot_and_restore.snapshot.snapshot_status;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.modules.snapshot_and_restore.snapshot.snapshot_status.*;

public class SnapshotStatus  {
  
  private Boolean _includeGlobalState;
  public Boolean getIncludeGlobalState() { return this._includeGlobalState; }
  public SnapshotStatus setIncludeGlobalState(Boolean val) { this._includeGlobalState = val; return this; }


  private Map<String, SnapshotIndexStats> _indices;
  public Map<String, SnapshotIndexStats> getIndices() { return this._indices; }
  public SnapshotStatus setIndices(Map<String, SnapshotIndexStats> val) { this._indices = val; return this; }


  private String _repository;
  public String getRepository() { return this._repository; }
  public SnapshotStatus setRepository(String val) { this._repository = val; return this; }


  private SnapshotShardsStats _shardsStats;
  public SnapshotShardsStats getShardsStats() { return this._shardsStats; }
  public SnapshotStatus setShardsStats(SnapshotShardsStats val) { this._shardsStats = val; return this; }


  private String _snapshot;
  public String getSnapshot() { return this._snapshot; }
  public SnapshotStatus setSnapshot(String val) { this._snapshot = val; return this; }


  private String _state;
  public String getState() { return this._state; }
  public SnapshotStatus setState(String val) { this._state = val; return this; }


  private SnapshotStats _stats;
  public SnapshotStats getStats() { return this._stats; }
  public SnapshotStatus setStats(SnapshotStats val) { this._stats = val; return this; }


  private String _uuid;
  public String getUuid() { return this._uuid; }
  public SnapshotStatus setUuid(String val) { this._uuid = val; return this; }

}
