
package org.elasticsearch.modules.snapshot_and_restore.restore;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.common_options.hit.*;

public class SnapshotRestore  {
  
  private IndexName[] _indices;
  public IndexName[] getIndices() { return this._indices; }
  public SnapshotRestore setIndices(IndexName[] val) { this._indices = val; return this; }


  private String _snapshot;
  public String getSnapshot() { return this._snapshot; }
  public SnapshotRestore setSnapshot(String val) { this._snapshot = val; return this; }


  private ShardStatistics _shards;
  public ShardStatistics getShards() { return this._shards; }
  public SnapshotRestore setShards(ShardStatistics val) { this._shards = val; return this; }

}
