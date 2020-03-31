
package org.elasticsearch.cat.cat_snapshots;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;

public class CatSnapshotsRecord  {
  
  private Time _duration;
  public Time getDuration() { return this._duration; }
  public CatSnapshotsRecord setDuration(Time val) { this._duration = val; return this; }


  private Long _endEpoch;
  public Long getEndEpoch() { return this._endEpoch; }
  public CatSnapshotsRecord setEndEpoch(Long val) { this._endEpoch = val; return this; }


  private String _endTime;
  public String getEndTime() { return this._endTime; }
  public CatSnapshotsRecord setEndTime(String val) { this._endTime = val; return this; }


  private Long _failedShards;
  public Long getFailedShards() { return this._failedShards; }
  public CatSnapshotsRecord setFailedShards(Long val) { this._failedShards = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public CatSnapshotsRecord setId(String val) { this._id = val; return this; }


  private Long _indices;
  public Long getIndices() { return this._indices; }
  public CatSnapshotsRecord setIndices(Long val) { this._indices = val; return this; }


  private Long _startEpoch;
  public Long getStartEpoch() { return this._startEpoch; }
  public CatSnapshotsRecord setStartEpoch(Long val) { this._startEpoch = val; return this; }


  private String _startTime;
  public String getStartTime() { return this._startTime; }
  public CatSnapshotsRecord setStartTime(String val) { this._startTime = val; return this; }


  private String _status;
  public String getStatus() { return this._status; }
  public CatSnapshotsRecord setStatus(String val) { this._status = val; return this; }


  private Long _successfulShards;
  public Long getSuccessfulShards() { return this._successfulShards; }
  public CatSnapshotsRecord setSuccessfulShards(Long val) { this._successfulShards = val; return this; }


  private Long _totalShards;
  public Long getTotalShards() { return this._totalShards; }
  public CatSnapshotsRecord setTotalShards(Long val) { this._totalShards = val; return this; }

}
