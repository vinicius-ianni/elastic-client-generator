
package org.elasticsearch.cluster.reload_secure_settings;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.nodes_stats.*;

public class ReloadSecureSettingsResponse  {
  
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public ReloadSecureSettingsResponse setClusterName(String val) { this._clusterName = val; return this; }


  private Map<String, NodeStats> _nodes;
  public Map<String, NodeStats> getNodes() { return this._nodes; }
  public ReloadSecureSettingsResponse setNodes(Map<String, NodeStats> val) { this._nodes = val; return this; }

}
