
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ClusterShardMetrics  {
  
  private Double _avg;
  public Double getAvg() { return this._avg; }
  public ClusterShardMetrics setAvg(Double val) { this._avg = val; return this; }


  private Double _max;
  public Double getMax() { return this._max; }
  public ClusterShardMetrics setMax(Double val) { this._max = val; return this; }


  private Double _min;
  public Double getMin() { return this._min; }
  public ClusterShardMetrics setMin(Double val) { this._min = val; return this; }

}
