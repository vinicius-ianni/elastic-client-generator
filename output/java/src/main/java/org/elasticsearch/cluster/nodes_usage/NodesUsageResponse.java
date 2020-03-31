
package org.elasticsearch.cluster.nodes_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.nodes_usage.*;

public class NodesUsageResponse  {
  
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public NodesUsageResponse setClusterName(String val) { this._clusterName = val; return this; }


  private Map<String, NodeUsageInformation> _nodes;
  public Map<String, NodeUsageInformation> getNodes() { return this._nodes; }
  public NodesUsageResponse setNodes(Map<String, NodeUsageInformation> val) { this._nodes = val; return this; }

}
