
package org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_index_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_index_stats.*;
import org.elasticsearch.common.*;

public class FollowIndexShardStats  {
  
  private Long _bytesRead;
  public Long getBytesRead() { return this._bytesRead; }
  public FollowIndexShardStats setBytesRead(Long val) { this._bytesRead = val; return this; }


  private Long _failedReadRequests;
  public Long getFailedReadRequests() { return this._failedReadRequests; }
  public FollowIndexShardStats setFailedReadRequests(Long val) { this._failedReadRequests = val; return this; }


  private Long _failedWriteRequests;
  public Long getFailedWriteRequests() { return this._failedWriteRequests; }
  public FollowIndexShardStats setFailedWriteRequests(Long val) { this._failedWriteRequests = val; return this; }


  private Long _followerGlobalCheckpoint;
  public Long getFollowerGlobalCheckpoint() { return this._followerGlobalCheckpoint; }
  public FollowIndexShardStats setFollowerGlobalCheckpoint(Long val) { this._followerGlobalCheckpoint = val; return this; }


  private String _followerIndex;
  public String getFollowerIndex() { return this._followerIndex; }
  public FollowIndexShardStats setFollowerIndex(String val) { this._followerIndex = val; return this; }


  private Long _followerMappingVersion;
  public Long getFollowerMappingVersion() { return this._followerMappingVersion; }
  public FollowIndexShardStats setFollowerMappingVersion(Long val) { this._followerMappingVersion = val; return this; }


  private Long _followerMaxSeqNo;
  public Long getFollowerMaxSeqNo() { return this._followerMaxSeqNo; }
  public FollowIndexShardStats setFollowerMaxSeqNo(Long val) { this._followerMaxSeqNo = val; return this; }


  private Long _followerSettingsVersion;
  public Long getFollowerSettingsVersion() { return this._followerSettingsVersion; }
  public FollowIndexShardStats setFollowerSettingsVersion(Long val) { this._followerSettingsVersion = val; return this; }


  private Long _followerAliasesVersion;
  public Long getFollowerAliasesVersion() { return this._followerAliasesVersion; }
  public FollowIndexShardStats setFollowerAliasesVersion(Long val) { this._followerAliasesVersion = val; return this; }


  private Long _lastRequestedSeqNo;
  public Long getLastRequestedSeqNo() { return this._lastRequestedSeqNo; }
  public FollowIndexShardStats setLastRequestedSeqNo(Long val) { this._lastRequestedSeqNo = val; return this; }


  private Long _leaderGlobalCheckpoint;
  public Long getLeaderGlobalCheckpoint() { return this._leaderGlobalCheckpoint; }
  public FollowIndexShardStats setLeaderGlobalCheckpoint(Long val) { this._leaderGlobalCheckpoint = val; return this; }


  private String _leaderIndex;
  public String getLeaderIndex() { return this._leaderIndex; }
  public FollowIndexShardStats setLeaderIndex(String val) { this._leaderIndex = val; return this; }


  private Long _leaderMaxSeqNo;
  public Long getLeaderMaxSeqNo() { return this._leaderMaxSeqNo; }
  public FollowIndexShardStats setLeaderMaxSeqNo(Long val) { this._leaderMaxSeqNo = val; return this; }


  private Long _operationsRead;
  public Long getOperationsRead() { return this._operationsRead; }
  public FollowIndexShardStats setOperationsRead(Long val) { this._operationsRead = val; return this; }


  private Long _operationsWritten;
  public Long getOperationsWritten() { return this._operationsWritten; }
  public FollowIndexShardStats setOperationsWritten(Long val) { this._operationsWritten = val; return this; }


  private Integer _outstandingReadRequests;
  public Integer getOutstandingReadRequests() { return this._outstandingReadRequests; }
  public FollowIndexShardStats setOutstandingReadRequests(Integer val) { this._outstandingReadRequests = val; return this; }


  private Integer _outstandingWriteRequests;
  public Integer getOutstandingWriteRequests() { return this._outstandingWriteRequests; }
  public FollowIndexShardStats setOutstandingWriteRequests(Integer val) { this._outstandingWriteRequests = val; return this; }


  private String _remoteCluster;
  public String getRemoteCluster() { return this._remoteCluster; }
  public FollowIndexShardStats setRemoteCluster(String val) { this._remoteCluster = val; return this; }


  private Integer _shardId;
  public Integer getShardId() { return this._shardId; }
  public FollowIndexShardStats setShardId(Integer val) { this._shardId = val; return this; }


  private Long _successfulReadRequests;
  public Long getSuccessfulReadRequests() { return this._successfulReadRequests; }
  public FollowIndexShardStats setSuccessfulReadRequests(Long val) { this._successfulReadRequests = val; return this; }


  private Long _successfulWriteRequests;
  public Long getSuccessfulWriteRequests() { return this._successfulWriteRequests; }
  public FollowIndexShardStats setSuccessfulWriteRequests(Long val) { this._successfulWriteRequests = val; return this; }


  private Long _totalReadRemoteExecTimeMillis;
  public Long getTotalReadRemoteExecTimeMillis() { return this._totalReadRemoteExecTimeMillis; }
  public FollowIndexShardStats setTotalReadRemoteExecTimeMillis(Long val) { this._totalReadRemoteExecTimeMillis = val; return this; }


  private Long _totalReadTimeMillis;
  public Long getTotalReadTimeMillis() { return this._totalReadTimeMillis; }
  public FollowIndexShardStats setTotalReadTimeMillis(Long val) { this._totalReadTimeMillis = val; return this; }


  private Long _totalWriteTimeMillis;
  public Long getTotalWriteTimeMillis() { return this._totalWriteTimeMillis; }
  public FollowIndexShardStats setTotalWriteTimeMillis(Long val) { this._totalWriteTimeMillis = val; return this; }


  private Long _writeBufferOperationCount;
  public Long getWriteBufferOperationCount() { return this._writeBufferOperationCount; }
  public FollowIndexShardStats setWriteBufferOperationCount(Long val) { this._writeBufferOperationCount = val; return this; }


  private Long _writeBufferSizeInBytes;
  public Long getWriteBufferSizeInBytes() { return this._writeBufferSizeInBytes; }
  public FollowIndexShardStats setWriteBufferSizeInBytes(Long val) { this._writeBufferSizeInBytes = val; return this; }


  private FollowIndexReadException[] _readExceptions;
  public FollowIndexReadException[] getReadExceptions() { return this._readExceptions; }
  public FollowIndexShardStats setReadExceptions(FollowIndexReadException[] val) { this._readExceptions = val; return this; }


  private Long _timeSinceLastReadMillis;
  public Long getTimeSinceLastReadMillis() { return this._timeSinceLastReadMillis; }
  public FollowIndexShardStats setTimeSinceLastReadMillis(Long val) { this._timeSinceLastReadMillis = val; return this; }


  private ErrorCause _fatalException;
  public ErrorCause getFatalException() { return this._fatalException; }
  public FollowIndexShardStats setFatalException(ErrorCause val) { this._fatalException = val; return this; }

}
