
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.cluster_stats.*;

public class ClusterProcess  {
  
  private ClusterProcessCpu _cpu;
  public ClusterProcessCpu getCpu() { return this._cpu; }
  public ClusterProcess setCpu(ClusterProcessCpu val) { this._cpu = val; return this; }


  private ClusterProcessOpenFileDescriptors _openFileDescriptors;
  public ClusterProcessOpenFileDescriptors getOpenFileDescriptors() { return this._openFileDescriptors; }
  public ClusterProcess setOpenFileDescriptors(ClusterProcessOpenFileDescriptors val) { this._openFileDescriptors = val; return this; }

}
