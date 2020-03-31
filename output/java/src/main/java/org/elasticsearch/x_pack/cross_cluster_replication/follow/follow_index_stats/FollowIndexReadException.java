
package org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_index_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class FollowIndexReadException  {
  
  private Long _fromSeqNo;
  public Long getFromSeqNo() { return this._fromSeqNo; }
  public FollowIndexReadException setFromSeqNo(Long val) { this._fromSeqNo = val; return this; }


  private Integer _retries;
  public Integer getRetries() { return this._retries; }
  public FollowIndexReadException setRetries(Integer val) { this._retries = val; return this; }


  private ErrorCause _exception;
  public ErrorCause getException() { return this._exception; }
  public FollowIndexReadException setException(ErrorCause val) { this._exception = val; return this; }

}
