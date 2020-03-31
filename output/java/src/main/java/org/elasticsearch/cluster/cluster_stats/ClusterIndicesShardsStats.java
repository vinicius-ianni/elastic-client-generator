
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.cluster_stats.*;
import org.elasticsearch.internal.*;

public class ClusterIndicesShardsStats  {
  
  private ClusterIndicesShardsIndexStats _index;
  public ClusterIndicesShardsIndexStats getIndex() { return this._index; }
  public ClusterIndicesShardsStats setIndex(ClusterIndicesShardsIndexStats val) { this._index = val; return this; }


  private Double _primaries;
  public Double getPrimaries() { return this._primaries; }
  public ClusterIndicesShardsStats setPrimaries(Double val) { this._primaries = val; return this; }


  private Double _replication;
  public Double getReplication() { return this._replication; }
  public ClusterIndicesShardsStats setReplication(Double val) { this._replication = val; return this; }


  private Double _total;
  public Double getTotal() { return this._total; }
  public ClusterIndicesShardsStats setTotal(Double val) { this._total = val; return this; }

}
