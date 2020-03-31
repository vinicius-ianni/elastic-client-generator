
package org.elasticsearch.cluster.cluster_settings.cluster_put_settings;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ClusterPutSettingsResponse  {
  
  private Boolean _acknowledged;
  public Boolean getAcknowledged() { return this._acknowledged; }
  public ClusterPutSettingsResponse setAcknowledged(Boolean val) { this._acknowledged = val; return this; }


  private Map<String, Object> _persistent;
  public Map<String, Object> getPersistent() { return this._persistent; }
  public ClusterPutSettingsResponse setPersistent(Map<String, Object> val) { this._persistent = val; return this; }


  private Map<String, Object> _transient;
  public Map<String, Object> getTransient() { return this._transient; }
  public ClusterPutSettingsResponse setTransient(Map<String, Object> val) { this._transient = val; return this; }

}
