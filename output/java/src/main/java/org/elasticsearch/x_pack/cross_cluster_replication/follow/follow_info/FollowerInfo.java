
package org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_info.*;

public class FollowerInfo  {
  
  private String _followerIndex;
  public String getFollowerIndex() { return this._followerIndex; }
  public FollowerInfo setFollowerIndex(String val) { this._followerIndex = val; return this; }


  private String _remoteCluster;
  public String getRemoteCluster() { return this._remoteCluster; }
  public FollowerInfo setRemoteCluster(String val) { this._remoteCluster = val; return this; }


  private String _leaderIndex;
  public String getLeaderIndex() { return this._leaderIndex; }
  public FollowerInfo setLeaderIndex(String val) { this._leaderIndex = val; return this; }


  private FollowerIndexStatus _status;
  public FollowerIndexStatus getStatus() { return this._status; }
  public FollowerInfo setStatus(FollowerIndexStatus val) { this._status = val; return this; }


  private FollowConfig _parameters;
  public FollowConfig getParameters() { return this._parameters; }
  public FollowerInfo setParameters(FollowConfig val) { this._parameters = val; return this; }

}
