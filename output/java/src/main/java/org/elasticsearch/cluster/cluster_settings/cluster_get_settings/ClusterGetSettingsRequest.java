
package org.elasticsearch.cluster.cluster_settings.cluster_get_settings;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class ClusterGetSettingsRequest  {
  
  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public ClusterGetSettingsRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }


  private Boolean _includeDefaults;
  public Boolean getIncludeDefaults() { return this._includeDefaults; }
  public ClusterGetSettingsRequest setIncludeDefaults(Boolean val) { this._includeDefaults = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public ClusterGetSettingsRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public ClusterGetSettingsRequest setTimeout(Time val) { this._timeout = val; return this; }

}
