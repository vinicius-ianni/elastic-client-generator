
package org.elasticsearch.cluster.nodes_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.nodes_info.*;

public class NodesInfoResponse  {
  
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public NodesInfoResponse setClusterName(String val) { this._clusterName = val; return this; }


  private Map<String, NodeInfo> _nodes;
  public Map<String, NodeInfo> getNodes() { return this._nodes; }
  public NodesInfoResponse setNodes(Map<String, NodeInfo> val) { this._nodes = val; return this; }

}
