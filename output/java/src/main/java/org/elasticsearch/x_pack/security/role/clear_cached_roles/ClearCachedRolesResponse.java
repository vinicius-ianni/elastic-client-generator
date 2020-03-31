
package org.elasticsearch.x_pack.security.role.clear_cached_roles;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.*;

public class ClearCachedRolesResponse  {
  
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public ClearCachedRolesResponse setClusterName(String val) { this._clusterName = val; return this; }


  private Map<String, SecurityNode> _nodes;
  public Map<String, SecurityNode> getNodes() { return this._nodes; }
  public ClearCachedRolesResponse setNodes(Map<String, SecurityNode> val) { this._nodes = val; return this; }

}
