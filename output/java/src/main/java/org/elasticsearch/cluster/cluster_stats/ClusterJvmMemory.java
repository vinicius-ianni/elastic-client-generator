
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ClusterJvmMemory  {
  
  private Long _heapMaxInBytes;
  public Long getHeapMaxInBytes() { return this._heapMaxInBytes; }
  public ClusterJvmMemory setHeapMaxInBytes(Long val) { this._heapMaxInBytes = val; return this; }


  private Long _heapUsedInBytes;
  public Long getHeapUsedInBytes() { return this._heapUsedInBytes; }
  public ClusterJvmMemory setHeapUsedInBytes(Long val) { this._heapUsedInBytes = val; return this; }

}
