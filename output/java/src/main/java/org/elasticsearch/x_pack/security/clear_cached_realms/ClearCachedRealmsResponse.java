
package org.elasticsearch.x_pack.security.clear_cached_realms;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.*;

public class ClearCachedRealmsResponse  {
  
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public ClearCachedRealmsResponse setClusterName(String val) { this._clusterName = val; return this; }


  private Map<String, SecurityNode> _nodes;
  public Map<String, SecurityNode> getNodes() { return this._nodes; }
  public ClearCachedRealmsResponse setNodes(Map<String, SecurityNode> val) { this._nodes = val; return this; }

}
