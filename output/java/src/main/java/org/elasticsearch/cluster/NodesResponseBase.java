
package org.elasticsearch.cluster;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.*;

public class NodesResponseBase  {
  
  private NodeStatistics _nodes;
  public NodeStatistics getNodes() { return this._nodes; }
  public NodesResponseBase setNodes(NodeStatistics val) { this._nodes = val; return this; }

}
