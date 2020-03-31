
package org.elasticsearch.x_pack.cross_cluster_replication.follow.resume_follow_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.time_unit.*;

public class ResumeFollowIndexRequest  {
  
  private Long _maxReadRequestOperationCount;
  public Long getMaxReadRequestOperationCount() { return this._maxReadRequestOperationCount; }
  public ResumeFollowIndexRequest setMaxReadRequestOperationCount(Long val) { this._maxReadRequestOperationCount = val; return this; }


  private Long _maxOutstandingReadRequests;
  public Long getMaxOutstandingReadRequests() { return this._maxOutstandingReadRequests; }
  public ResumeFollowIndexRequest setMaxOutstandingReadRequests(Long val) { this._maxOutstandingReadRequests = val; return this; }


  private String _maxReadRequestSize;
  public String getMaxReadRequestSize() { return this._maxReadRequestSize; }
  public ResumeFollowIndexRequest setMaxReadRequestSize(String val) { this._maxReadRequestSize = val; return this; }


  private Long _maxWriteRequestOperationCount;
  public Long getMaxWriteRequestOperationCount() { return this._maxWriteRequestOperationCount; }
  public ResumeFollowIndexRequest setMaxWriteRequestOperationCount(Long val) { this._maxWriteRequestOperationCount = val; return this; }


  private String _maxWriteRequestSize;
  public String getMaxWriteRequestSize() { return this._maxWriteRequestSize; }
  public ResumeFollowIndexRequest setMaxWriteRequestSize(String val) { this._maxWriteRequestSize = val; return this; }


  private Long _maxOutstandingWriteRequests;
  public Long getMaxOutstandingWriteRequests() { return this._maxOutstandingWriteRequests; }
  public ResumeFollowIndexRequest setMaxOutstandingWriteRequests(Long val) { this._maxOutstandingWriteRequests = val; return this; }


  private Long _maxWriteBufferCount;
  public Long getMaxWriteBufferCount() { return this._maxWriteBufferCount; }
  public ResumeFollowIndexRequest setMaxWriteBufferCount(Long val) { this._maxWriteBufferCount = val; return this; }


  private String _maxWriteBufferSize;
  public String getMaxWriteBufferSize() { return this._maxWriteBufferSize; }
  public ResumeFollowIndexRequest setMaxWriteBufferSize(String val) { this._maxWriteBufferSize = val; return this; }


  private Time _maxRetryDelay;
  public Time getMaxRetryDelay() { return this._maxRetryDelay; }
  public ResumeFollowIndexRequest setMaxRetryDelay(Time val) { this._maxRetryDelay = val; return this; }


  private Time _readPollTimeout;
  public Time getReadPollTimeout() { return this._readPollTimeout; }
  public ResumeFollowIndexRequest setReadPollTimeout(Time val) { this._readPollTimeout = val; return this; }

}
