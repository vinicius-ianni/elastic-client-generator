
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.cluster.cluster_stats.*;
import org.elasticsearch.cluster.nodes_info.*;

public class ClusterOperatingSystemStats  {
  
  private Integer _allocatedProcessors;
  public Integer getAllocatedProcessors() { return this._allocatedProcessors; }
  public ClusterOperatingSystemStats setAllocatedProcessors(Integer val) { this._allocatedProcessors = val; return this; }


  private Integer _availableProcessors;
  public Integer getAvailableProcessors() { return this._availableProcessors; }
  public ClusterOperatingSystemStats setAvailableProcessors(Integer val) { this._availableProcessors = val; return this; }


  private OperatingSystemMemoryInfo _mem;
  public OperatingSystemMemoryInfo getMem() { return this._mem; }
  public ClusterOperatingSystemStats setMem(OperatingSystemMemoryInfo val) { this._mem = val; return this; }


  private ClusterOperatingSystemName[] _names;
  public ClusterOperatingSystemName[] getNames() { return this._names; }
  public ClusterOperatingSystemStats setNames(ClusterOperatingSystemName[] val) { this._names = val; return this; }


  private ClusterOperatingSystemPrettyNane[] _prettyNames;
  public ClusterOperatingSystemPrettyNane[] getPrettyNames() { return this._prettyNames; }
  public ClusterOperatingSystemStats setPrettyNames(ClusterOperatingSystemPrettyNane[] val) { this._prettyNames = val; return this; }

}
