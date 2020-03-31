
package org.elasticsearch.modules.snapshot_and_restore.snapshot;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class SnapshotShardFailure  {
  
  private String _index;
  public String getIndex() { return this._index; }
  public SnapshotShardFailure setIndex(String val) { this._index = val; return this; }


  private String _nodeId;
  public String getNodeId() { return this._nodeId; }
  public SnapshotShardFailure setNodeId(String val) { this._nodeId = val; return this; }


  private String _reason;
  public String getReason() { return this._reason; }
  public SnapshotShardFailure setReason(String val) { this._reason = val; return this; }


  private String _shardId;
  public String getShardId() { return this._shardId; }
  public SnapshotShardFailure setShardId(String val) { this._shardId = val; return this; }


  private String _status;
  public String getStatus() { return this._status; }
  public SnapshotShardFailure setStatus(String val) { this._status = val; return this; }

}
