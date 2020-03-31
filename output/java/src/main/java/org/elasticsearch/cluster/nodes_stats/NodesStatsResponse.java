
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.nodes_stats.*;

public class NodesStatsResponse  {
  
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public NodesStatsResponse setClusterName(String val) { this._clusterName = val; return this; }


  private Map<String, NodeStats> _nodes;
  public Map<String, NodeStats> getNodes() { return this._nodes; }
  public NodesStatsResponse setNodes(Map<String, NodeStats> val) { this._nodes = val; return this; }

}
