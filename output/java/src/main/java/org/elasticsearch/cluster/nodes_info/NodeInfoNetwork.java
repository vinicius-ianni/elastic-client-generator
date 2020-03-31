
package org.elasticsearch.cluster.nodes_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.nodes_info.*;
import org.elasticsearch.internal.*;

public class NodeInfoNetwork  {
  
  private NodeInfoNetworkInterface _primaryInterface;
  public NodeInfoNetworkInterface getPrimaryInterface() { return this._primaryInterface; }
  public NodeInfoNetwork setPrimaryInterface(NodeInfoNetworkInterface val) { this._primaryInterface = val; return this; }


  private Integer _refreshInterval;
  public Integer getRefreshInterval() { return this._refreshInterval; }
  public NodeInfoNetwork setRefreshInterval(Integer val) { this._refreshInterval = val; return this; }

}
