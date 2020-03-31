
package org.elasticsearch.x_pack.cross_cluster_replication.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;
import org.elasticsearch.x_pack.cross_cluster_replication.stats.*;

public class CcrAutoFollowStats  {
  
  private Long _numberOfFailedFollowIndices;
  public Long getNumberOfFailedFollowIndices() { return this._numberOfFailedFollowIndices; }
  public CcrAutoFollowStats setNumberOfFailedFollowIndices(Long val) { this._numberOfFailedFollowIndices = val; return this; }


  private Long _numberOfFailedRemoteClusterStateRequests;
  public Long getNumberOfFailedRemoteClusterStateRequests() { return this._numberOfFailedRemoteClusterStateRequests; }
  public CcrAutoFollowStats setNumberOfFailedRemoteClusterStateRequests(Long val) { this._numberOfFailedRemoteClusterStateRequests = val; return this; }


  private Long _numberOfSuccessfulFollowIndices;
  public Long getNumberOfSuccessfulFollowIndices() { return this._numberOfSuccessfulFollowIndices; }
  public CcrAutoFollowStats setNumberOfSuccessfulFollowIndices(Long val) { this._numberOfSuccessfulFollowIndices = val; return this; }


  private ErrorCause[] _recentAutoFollowErrors;
  public ErrorCause[] getRecentAutoFollowErrors() { return this._recentAutoFollowErrors; }
  public CcrAutoFollowStats setRecentAutoFollowErrors(ErrorCause[] val) { this._recentAutoFollowErrors = val; return this; }


  private AutoFollowedCluster[] _autoFollowedClusters;
  public AutoFollowedCluster[] getAutoFollowedClusters() { return this._autoFollowedClusters; }
  public CcrAutoFollowStats setAutoFollowedClusters(AutoFollowedCluster[] val) { this._autoFollowedClusters = val; return this; }

}
