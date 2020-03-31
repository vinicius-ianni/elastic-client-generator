
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.cluster.cluster_stats.*;

public class ClusterJvm  {
  
  private Long _maxUptimeInMillis;
  public Long getMaxUptimeInMillis() { return this._maxUptimeInMillis; }
  public ClusterJvm setMaxUptimeInMillis(Long val) { this._maxUptimeInMillis = val; return this; }


  private ClusterJvmMemory _mem;
  public ClusterJvmMemory getMem() { return this._mem; }
  public ClusterJvm setMem(ClusterJvmMemory val) { this._mem = val; return this; }


  private Long _threads;
  public Long getThreads() { return this._threads; }
  public ClusterJvm setThreads(Long val) { this._threads = val; return this; }


  private ClusterJvmVersion[] _versions;
  public ClusterJvmVersion[] getVersions() { return this._versions; }
  public ClusterJvm setVersions(ClusterJvmVersion[] val) { this._versions = val; return this; }

}
