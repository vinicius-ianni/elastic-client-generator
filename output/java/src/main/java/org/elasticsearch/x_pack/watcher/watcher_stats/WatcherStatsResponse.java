
package org.elasticsearch.x_pack.watcher.watcher_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.watcher_stats.*;

public class WatcherStatsResponse  {
  
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public WatcherStatsResponse setClusterName(String val) { this._clusterName = val; return this; }


  private Boolean _manuallyStopped;
  public Boolean getManuallyStopped() { return this._manuallyStopped; }
  public WatcherStatsResponse setManuallyStopped(Boolean val) { this._manuallyStopped = val; return this; }


  private WatcherNodeStats[] _stats;
  public WatcherNodeStats[] getStats() { return this._stats; }
  public WatcherStatsResponse setStats(WatcherNodeStats[] val) { this._stats = val; return this; }

}
