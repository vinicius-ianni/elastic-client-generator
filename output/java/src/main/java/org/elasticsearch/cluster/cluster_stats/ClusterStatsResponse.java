
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.cluster_stats.*;
import org.elasticsearch.cluster.*;
import org.elasticsearch.internal.*;

public class ClusterStatsResponse  {
  
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public ClusterStatsResponse setClusterName(String val) { this._clusterName = val; return this; }


  private String _clusterUuid;
  public String getClusterUuid() { return this._clusterUuid; }
  public ClusterStatsResponse setClusterUuid(String val) { this._clusterUuid = val; return this; }


  private ClusterIndicesStats _indices;
  public ClusterIndicesStats getIndices() { return this._indices; }
  public ClusterStatsResponse setIndices(ClusterIndicesStats val) { this._indices = val; return this; }


  private ClusterNodesStats _nodes;
  public ClusterNodesStats getNodes() { return this._nodes; }
  public ClusterStatsResponse setNodes(ClusterNodesStats val) { this._nodes = val; return this; }


  private ClusterStatus _status;
  public ClusterStatus getStatus() { return this._status; }
  public ClusterStatsResponse setStatus(ClusterStatus val) { this._status = val; return this; }


  private Long _timestamp;
  public Long getTimestamp() { return this._timestamp; }
  public ClusterStatsResponse setTimestamp(Long val) { this._timestamp = val; return this; }

}
