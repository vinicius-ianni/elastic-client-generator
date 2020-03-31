
package org.elasticsearch.x_pack.cross_cluster_replication.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.cross_cluster_replication.stats.*;

public class CcrStatsResponse  {
  
  private CcrAutoFollowStats _autoFollowStats;
  public CcrAutoFollowStats getAutoFollowStats() { return this._autoFollowStats; }
  public CcrStatsResponse setAutoFollowStats(CcrAutoFollowStats val) { this._autoFollowStats = val; return this; }


  private CcrFollowStats _followStats;
  public CcrFollowStats getFollowStats() { return this._followStats; }
  public CcrStatsResponse setFollowStats(CcrFollowStats val) { this._followStats = val; return this; }

}
