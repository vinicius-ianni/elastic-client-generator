
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ClusterProcessCpu  {
  
  private Integer _percent;
  public Integer getPercent() { return this._percent; }
  public ClusterProcessCpu setPercent(Integer val) { this._percent = val; return this; }

}
