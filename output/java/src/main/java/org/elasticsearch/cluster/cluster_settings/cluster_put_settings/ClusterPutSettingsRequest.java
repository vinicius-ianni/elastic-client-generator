
package org.elasticsearch.cluster.cluster_settings.cluster_put_settings;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class ClusterPutSettingsRequest  {
  
  private Map<String, Object> _persistent;
  public Map<String, Object> getPersistent() { return this._persistent; }
  public ClusterPutSettingsRequest setPersistent(Map<String, Object> val) { this._persistent = val; return this; }


  private Map<String, Object> _transient;
  public Map<String, Object> getTransient() { return this._transient; }
  public ClusterPutSettingsRequest setTransient(Map<String, Object> val) { this._transient = val; return this; }


  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public ClusterPutSettingsRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public ClusterPutSettingsRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public ClusterPutSettingsRequest setTimeout(Time val) { this._timeout = val; return this; }

}
