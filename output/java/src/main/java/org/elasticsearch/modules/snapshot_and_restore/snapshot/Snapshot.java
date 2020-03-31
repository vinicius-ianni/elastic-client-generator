
package org.elasticsearch.modules.snapshot_and_restore.snapshot;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.modules.snapshot_and_restore.snapshot.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.common_options.hit.*;

public class Snapshot  {
  
  private Long _durationInMillis;
  public Long getDurationInMillis() { return this._durationInMillis; }
  public Snapshot setDurationInMillis(Long val) { this._durationInMillis = val; return this; }


  private Date _endTime;
  public Date getEndTime() { return this._endTime; }
  public Snapshot setEndTime(Date val) { this._endTime = val; return this; }


  private Long _endTimeInMillis;
  public Long getEndTimeInMillis() { return this._endTimeInMillis; }
  public Snapshot setEndTimeInMillis(Long val) { this._endTimeInMillis = val; return this; }


  private SnapshotShardFailure[] _failures;
  public SnapshotShardFailure[] getFailures() { return this._failures; }
  public Snapshot setFailures(SnapshotShardFailure[] val) { this._failures = val; return this; }


  private IndexName[] _indices;
  public IndexName[] getIndices() { return this._indices; }
  public Snapshot setIndices(IndexName[] val) { this._indices = val; return this; }


  private String _snapshot;
  public String getSnapshot() { return this._snapshot; }
  public Snapshot setSnapshot(String val) { this._snapshot = val; return this; }


  private ShardStatistics _shards;
  public ShardStatistics getShards() { return this._shards; }
  public Snapshot setShards(ShardStatistics val) { this._shards = val; return this; }


  private Date _startTime;
  public Date getStartTime() { return this._startTime; }
  public Snapshot setStartTime(Date val) { this._startTime = val; return this; }


  private Long _startTimeInMillis;
  public Long getStartTimeInMillis() { return this._startTimeInMillis; }
  public Snapshot setStartTimeInMillis(Long val) { this._startTimeInMillis = val; return this; }


  private String _state;
  public String getState() { return this._state; }
  public Snapshot setState(String val) { this._state = val; return this; }


  private Map<String, Object> _metadata;
  public Map<String, Object> getMetadata() { return this._metadata; }
  public Snapshot setMetadata(Map<String, Object> val) { this._metadata = val; return this; }

}
