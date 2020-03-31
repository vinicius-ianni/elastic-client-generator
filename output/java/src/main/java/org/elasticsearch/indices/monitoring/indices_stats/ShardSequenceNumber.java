
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ShardSequenceNumber  {
  
  private Long _globalCheckpoint;
  public Long getGlobalCheckpoint() { return this._globalCheckpoint; }
  public ShardSequenceNumber setGlobalCheckpoint(Long val) { this._globalCheckpoint = val; return this; }


  private Long _localCheckpoint;
  public Long getLocalCheckpoint() { return this._localCheckpoint; }
  public ShardSequenceNumber setLocalCheckpoint(Long val) { this._localCheckpoint = val; return this; }


  private Long _maxSeqNo;
  public Long getMaxSeqNo() { return this._maxSeqNo; }
  public ShardSequenceNumber setMaxSeqNo(Long val) { this._maxSeqNo = val; return this; }

}
