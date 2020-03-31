
package org.elasticsearch.indices.monitoring.indices_recovery;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.indices.monitoring.indices_recovery.*;

public class ShardRecovery  {
  
  private Long _id;
  public Long getId() { return this._id; }
  public ShardRecovery setId(Long val) { this._id = val; return this; }


  private RecoveryIndexStatus _index;
  public RecoveryIndexStatus getIndex() { return this._index; }
  public ShardRecovery setIndex(RecoveryIndexStatus val) { this._index = val; return this; }


  private Boolean _primary;
  public Boolean getPrimary() { return this._primary; }
  public ShardRecovery setPrimary(Boolean val) { this._primary = val; return this; }


  private RecoveryOrigin _source;
  public RecoveryOrigin getSource() { return this._source; }
  public ShardRecovery setSource(RecoveryOrigin val) { this._source = val; return this; }


  private String _stage;
  public String getStage() { return this._stage; }
  public ShardRecovery setStage(String val) { this._stage = val; return this; }


  private RecoveryStartStatus _start;
  public RecoveryStartStatus getStart() { return this._start; }
  public ShardRecovery setStart(RecoveryStartStatus val) { this._start = val; return this; }


  private Date _startTimeInMillis;
  public Date getStartTimeInMillis() { return this._startTimeInMillis; }
  public ShardRecovery setStartTimeInMillis(Date val) { this._startTimeInMillis = val; return this; }


  private Date _stopTimeInMillis;
  public Date getStopTimeInMillis() { return this._stopTimeInMillis; }
  public ShardRecovery setStopTimeInMillis(Date val) { this._stopTimeInMillis = val; return this; }


  private RecoveryOrigin _target;
  public RecoveryOrigin getTarget() { return this._target; }
  public ShardRecovery setTarget(RecoveryOrigin val) { this._target = val; return this; }


  private Long _totalTimeInMillis;
  public Long getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public ShardRecovery setTotalTimeInMillis(Long val) { this._totalTimeInMillis = val; return this; }


  private RecoveryTranslogStatus _translog;
  public RecoveryTranslogStatus getTranslog() { return this._translog; }
  public ShardRecovery setTranslog(RecoveryTranslogStatus val) { this._translog = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public ShardRecovery setType(String val) { this._type = val; return this; }


  private RecoveryVerifyIndex _verifyIndex;
  public RecoveryVerifyIndex getVerifyIndex() { return this._verifyIndex; }
  public ShardRecovery setVerifyIndex(RecoveryVerifyIndex val) { this._verifyIndex = val; return this; }

}
