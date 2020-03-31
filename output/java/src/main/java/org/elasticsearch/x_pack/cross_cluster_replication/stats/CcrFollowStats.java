
package org.elasticsearch.x_pack.cross_cluster_replication.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_index_stats.*;

public class CcrFollowStats  {
  
  private FollowIndexStats[] _indices;
  public FollowIndexStats[] getIndices() { return this._indices; }
  public CcrFollowStats setIndices(FollowIndexStats[] val) { this._indices = val; return this; }

}
