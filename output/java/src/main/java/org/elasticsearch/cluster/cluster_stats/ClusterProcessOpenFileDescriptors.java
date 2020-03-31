
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ClusterProcessOpenFileDescriptors  {
  
  private Long _avg;
  public Long getAvg() { return this._avg; }
  public ClusterProcessOpenFileDescriptors setAvg(Long val) { this._avg = val; return this; }


  private Long _max;
  public Long getMax() { return this._max; }
  public ClusterProcessOpenFileDescriptors setMax(Long val) { this._max = val; return this; }


  private Long _min;
  public Long getMin() { return this._min; }
  public ClusterProcessOpenFileDescriptors setMin(Long val) { this._min = val; return this; }

}
