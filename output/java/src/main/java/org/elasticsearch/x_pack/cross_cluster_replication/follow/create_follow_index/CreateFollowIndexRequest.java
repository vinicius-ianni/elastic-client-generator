
package org.elasticsearch.x_pack.cross_cluster_replication.follow.create_follow_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.time_unit.*;

public class CreateFollowIndexRequest  {
  
  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public CreateFollowIndexRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }


  private String _remoteCluster;
  public String getRemoteCluster() { return this._remoteCluster; }
  public CreateFollowIndexRequest setRemoteCluster(String val) { this._remoteCluster = val; return this; }


  private IndexName _leaderIndex;
  public IndexName getLeaderIndex() { return this._leaderIndex; }
  public CreateFollowIndexRequest setLeaderIndex(IndexName val) { this._leaderIndex = val; return this; }


  private Long _maxReadRequestOperationCount;
  public Long getMaxReadRequestOperationCount() { return this._maxReadRequestOperationCount; }
  public CreateFollowIndexRequest setMaxReadRequestOperationCount(Long val) { this._maxReadRequestOperationCount = val; return this; }


  private Long _maxOutstandingReadRequests;
  public Long getMaxOutstandingReadRequests() { return this._maxOutstandingReadRequests; }
  public CreateFollowIndexRequest setMaxOutstandingReadRequests(Long val) { this._maxOutstandingReadRequests = val; return this; }


  private String _maxReadRequestSize;
  public String getMaxReadRequestSize() { return this._maxReadRequestSize; }
  public CreateFollowIndexRequest setMaxReadRequestSize(String val) { this._maxReadRequestSize = val; return this; }


  private Long _maxWriteRequestOperationCount;
  public Long getMaxWriteRequestOperationCount() { return this._maxWriteRequestOperationCount; }
  public CreateFollowIndexRequest setMaxWriteRequestOperationCount(Long val) { this._maxWriteRequestOperationCount = val; return this; }


  private String _maxWriteRequestSize;
  public String getMaxWriteRequestSize() { return this._maxWriteRequestSize; }
  public CreateFollowIndexRequest setMaxWriteRequestSize(String val) { this._maxWriteRequestSize = val; return this; }


  private Long _maxOutstandingWriteRequests;
  public Long getMaxOutstandingWriteRequests() { return this._maxOutstandingWriteRequests; }
  public CreateFollowIndexRequest setMaxOutstandingWriteRequests(Long val) { this._maxOutstandingWriteRequests = val; return this; }


  private Long _maxWriteBufferCount;
  public Long getMaxWriteBufferCount() { return this._maxWriteBufferCount; }
  public CreateFollowIndexRequest setMaxWriteBufferCount(Long val) { this._maxWriteBufferCount = val; return this; }


  private String _maxWriteBufferSize;
  public String getMaxWriteBufferSize() { return this._maxWriteBufferSize; }
  public CreateFollowIndexRequest setMaxWriteBufferSize(String val) { this._maxWriteBufferSize = val; return this; }


  private Time _maxRetryDelay;
  public Time getMaxRetryDelay() { return this._maxRetryDelay; }
  public CreateFollowIndexRequest setMaxRetryDelay(Time val) { this._maxRetryDelay = val; return this; }


  private Time _readPollTimeout;
  public Time getReadPollTimeout() { return this._readPollTimeout; }
  public CreateFollowIndexRequest setReadPollTimeout(Time val) { this._readPollTimeout = val; return this; }

}
