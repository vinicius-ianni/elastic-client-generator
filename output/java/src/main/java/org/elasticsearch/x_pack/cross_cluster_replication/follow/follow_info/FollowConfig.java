
package org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.time_unit.*;

public class FollowConfig  {
  
  private Integer _maxReadRequestOperationCount;
  public Integer getMaxReadRequestOperationCount() { return this._maxReadRequestOperationCount; }
  public FollowConfig setMaxReadRequestOperationCount(Integer val) { this._maxReadRequestOperationCount = val; return this; }


  private String _maxReadRequestSize;
  public String getMaxReadRequestSize() { return this._maxReadRequestSize; }
  public FollowConfig setMaxReadRequestSize(String val) { this._maxReadRequestSize = val; return this; }


  private Integer _maxOutstandingReadRequests;
  public Integer getMaxOutstandingReadRequests() { return this._maxOutstandingReadRequests; }
  public FollowConfig setMaxOutstandingReadRequests(Integer val) { this._maxOutstandingReadRequests = val; return this; }


  private Integer _maxWriteRequestOperationCount;
  public Integer getMaxWriteRequestOperationCount() { return this._maxWriteRequestOperationCount; }
  public FollowConfig setMaxWriteRequestOperationCount(Integer val) { this._maxWriteRequestOperationCount = val; return this; }


  private String _maxWriteRequestSize;
  public String getMaxWriteRequestSize() { return this._maxWriteRequestSize; }
  public FollowConfig setMaxWriteRequestSize(String val) { this._maxWriteRequestSize = val; return this; }


  private Integer _maxOutstandingWriteRequests;
  public Integer getMaxOutstandingWriteRequests() { return this._maxOutstandingWriteRequests; }
  public FollowConfig setMaxOutstandingWriteRequests(Integer val) { this._maxOutstandingWriteRequests = val; return this; }


  private Integer _maxWriteBufferCount;
  public Integer getMaxWriteBufferCount() { return this._maxWriteBufferCount; }
  public FollowConfig setMaxWriteBufferCount(Integer val) { this._maxWriteBufferCount = val; return this; }


  private String _maxWriteBufferSize;
  public String getMaxWriteBufferSize() { return this._maxWriteBufferSize; }
  public FollowConfig setMaxWriteBufferSize(String val) { this._maxWriteBufferSize = val; return this; }


  private Time _maxRetryDelay;
  public Time getMaxRetryDelay() { return this._maxRetryDelay; }
  public FollowConfig setMaxRetryDelay(Time val) { this._maxRetryDelay = val; return this; }


  private Time _readPollTimeout;
  public Time getReadPollTimeout() { return this._readPollTimeout; }
  public FollowConfig setReadPollTimeout(Time val) { this._readPollTimeout = val; return this; }

}
