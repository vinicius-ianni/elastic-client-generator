
package org.elasticsearch.x_pack.cross_cluster_replication.follow.forget_follower_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;

public class ForgetFollowerIndexRequest  {
  
  private String _followerCluster;
  public String getFollowerCluster() { return this._followerCluster; }
  public ForgetFollowerIndexRequest setFollowerCluster(String val) { this._followerCluster = val; return this; }


  private IndexName _followerIndex;
  public IndexName getFollowerIndex() { return this._followerIndex; }
  public ForgetFollowerIndexRequest setFollowerIndex(IndexName val) { this._followerIndex = val; return this; }


  private String _followerIndexUuid;
  public String getFollowerIndexUuid() { return this._followerIndexUuid; }
  public ForgetFollowerIndexRequest setFollowerIndexUuid(String val) { this._followerIndexUuid = val; return this; }


  private String _leaderRemoteCluster;
  public String getLeaderRemoteCluster() { return this._leaderRemoteCluster; }
  public ForgetFollowerIndexRequest setLeaderRemoteCluster(String val) { this._leaderRemoteCluster = val; return this; }

}
