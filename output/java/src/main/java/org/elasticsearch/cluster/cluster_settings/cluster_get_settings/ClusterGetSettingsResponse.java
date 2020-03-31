
package org.elasticsearch.cluster.cluster_settings.cluster_get_settings;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ClusterGetSettingsResponse  {
  
  private Map<String, Object> _persistent;
  public Map<String, Object> getPersistent() { return this._persistent; }
  public ClusterGetSettingsResponse setPersistent(Map<String, Object> val) { this._persistent = val; return this; }


  private Map<String, Object> _transient;
  public Map<String, Object> getTransient() { return this._transient; }
  public ClusterGetSettingsResponse setTransient(Map<String, Object> val) { this._transient = val; return this; }

}
