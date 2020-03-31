
package org.elasticsearch.x_pack.cross_cluster_replication.auto_follow.create_auto_follow_pattern;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.time_unit.*;

public class CreateAutoFollowPatternRequest  {
  
  private String _remoteCluster;
  public String getRemoteCluster() { return this._remoteCluster; }
  public CreateAutoFollowPatternRequest setRemoteCluster(String val) { this._remoteCluster = val; return this; }


  private String[] _leaderIndexPatterns;
  public String[] getLeaderIndexPatterns() { return this._leaderIndexPatterns; }
  public CreateAutoFollowPatternRequest setLeaderIndexPatterns(String[] val) { this._leaderIndexPatterns = val; return this; }


  private String _followIndexPattern;
  public String getFollowIndexPattern() { return this._followIndexPattern; }
  public CreateAutoFollowPatternRequest setFollowIndexPattern(String val) { this._followIndexPattern = val; return this; }


  private Integer _maxReadRequestOperationCount;
  public Integer getMaxReadRequestOperationCount() { return this._maxReadRequestOperationCount; }
  public CreateAutoFollowPatternRequest setMaxReadRequestOperationCount(Integer val) { this._maxReadRequestOperationCount = val; return this; }


  private Long _maxOutstandingReadRequests;
  public Long getMaxOutstandingReadRequests() { return this._maxOutstandingReadRequests; }
  public CreateAutoFollowPatternRequest setMaxOutstandingReadRequests(Long val) { this._maxOutstandingReadRequests = val; return this; }


  private String _maxReadRequestSize;
  public String getMaxReadRequestSize() { return this._maxReadRequestSize; }
  public CreateAutoFollowPatternRequest setMaxReadRequestSize(String val) { this._maxReadRequestSize = val; return this; }


  private Integer _maxWriteRequestOperationCount;
  public Integer getMaxWriteRequestOperationCount() { return this._maxWriteRequestOperationCount; }
  public CreateAutoFollowPatternRequest setMaxWriteRequestOperationCount(Integer val) { this._maxWriteRequestOperationCount = val; return this; }


  private String _maxWriteRequestSize;
  public String getMaxWriteRequestSize() { return this._maxWriteRequestSize; }
  public CreateAutoFollowPatternRequest setMaxWriteRequestSize(String val) { this._maxWriteRequestSize = val; return this; }


  private Integer _maxOutstandingWriteRequests;
  public Integer getMaxOutstandingWriteRequests() { return this._maxOutstandingWriteRequests; }
  public CreateAutoFollowPatternRequest setMaxOutstandingWriteRequests(Integer val) { this._maxOutstandingWriteRequests = val; return this; }


  private Integer _maxWriteBufferCount;
  public Integer getMaxWriteBufferCount() { return this._maxWriteBufferCount; }
  public CreateAutoFollowPatternRequest setMaxWriteBufferCount(Integer val) { this._maxWriteBufferCount = val; return this; }


  private String _maxWriteBufferSize;
  public String getMaxWriteBufferSize() { return this._maxWriteBufferSize; }
  public CreateAutoFollowPatternRequest setMaxWriteBufferSize(String val) { this._maxWriteBufferSize = val; return this; }


  private Time _maxRetryDelay;
  public Time getMaxRetryDelay() { return this._maxRetryDelay; }
  public CreateAutoFollowPatternRequest setMaxRetryDelay(Time val) { this._maxRetryDelay = val; return this; }


  private Time _maxPollTimeout;
  public Time getMaxPollTimeout() { return this._maxPollTimeout; }
  public CreateAutoFollowPatternRequest setMaxPollTimeout(Time val) { this._maxPollTimeout = val; return this; }

}
