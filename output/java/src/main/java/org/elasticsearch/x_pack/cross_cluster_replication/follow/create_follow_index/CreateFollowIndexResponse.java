
package org.elasticsearch.x_pack.cross_cluster_replication.follow.create_follow_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CreateFollowIndexResponse  {
  
  private Boolean _followIndexCreated;
  public Boolean getFollowIndexCreated() { return this._followIndexCreated; }
  public CreateFollowIndexResponse setFollowIndexCreated(Boolean val) { this._followIndexCreated = val; return this; }


  private Boolean _followIndexShardsAcked;
  public Boolean getFollowIndexShardsAcked() { return this._followIndexShardsAcked; }
  public CreateFollowIndexResponse setFollowIndexShardsAcked(Boolean val) { this._followIndexShardsAcked = val; return this; }


  private Boolean _indexFollowingStarted;
  public Boolean getIndexFollowingStarted() { return this._indexFollowingStarted; }
  public CreateFollowIndexResponse setIndexFollowingStarted(Boolean val) { this._indexFollowingStarted = val; return this; }

}
