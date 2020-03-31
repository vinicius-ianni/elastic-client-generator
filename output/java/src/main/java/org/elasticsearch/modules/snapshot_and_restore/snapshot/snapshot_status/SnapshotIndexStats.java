
package org.elasticsearch.modules.snapshot_and_restore.snapshot.snapshot_status;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.modules.snapshot_and_restore.snapshot.snapshot_status.*;

public class SnapshotIndexStats  {
  
  private Map<String, SnapshotShardsStats> _shards;
  public Map<String, SnapshotShardsStats> getShards() { return this._shards; }
  public SnapshotIndexStats setShards(Map<String, SnapshotShardsStats> val) { this._shards = val; return this; }


  private SnapshotShardsStats _shardsStats;
  public SnapshotShardsStats getShardsStats() { return this._shardsStats; }
  public SnapshotIndexStats setShardsStats(SnapshotShardsStats val) { this._shardsStats = val; return this; }


  private SnapshotStats _stats;
  public SnapshotStats getStats() { return this._stats; }
  public SnapshotIndexStats setStats(SnapshotStats val) { this._stats = val; return this; }

}
