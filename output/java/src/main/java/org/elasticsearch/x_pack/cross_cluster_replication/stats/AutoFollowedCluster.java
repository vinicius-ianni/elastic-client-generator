
package org.elasticsearch.x_pack.cross_cluster_replication.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class AutoFollowedCluster  {
  
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public AutoFollowedCluster setClusterName(String val) { this._clusterName = val; return this; }


  private Date _timeSinceLastCheckMillis;
  public Date getTimeSinceLastCheckMillis() { return this._timeSinceLastCheckMillis; }
  public AutoFollowedCluster setTimeSinceLastCheckMillis(Date val) { this._timeSinceLastCheckMillis = val; return this; }


  private Long _lastSeenMetadataVersion;
  public Long getLastSeenMetadataVersion() { return this._lastSeenMetadataVersion; }
  public AutoFollowedCluster setLastSeenMetadataVersion(Long val) { this._lastSeenMetadataVersion = val; return this; }

}
