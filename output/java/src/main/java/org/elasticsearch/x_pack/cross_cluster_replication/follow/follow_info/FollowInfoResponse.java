
package org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_info.*;

public class FollowInfoResponse  {
  
  private FollowerInfo[] _followerIndices;
  public FollowerInfo[] getFollowerIndices() { return this._followerIndices; }
  public FollowInfoResponse setFollowerIndices(FollowerInfo[] val) { this._followerIndices = val; return this; }

}
