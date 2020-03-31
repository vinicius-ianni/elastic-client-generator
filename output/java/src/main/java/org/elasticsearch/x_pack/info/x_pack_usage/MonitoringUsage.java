
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class MonitoringUsage  {
  
  private Boolean _collectionEnabled;
  public Boolean getCollectionEnabled() { return this._collectionEnabled; }
  public MonitoringUsage setCollectionEnabled(Boolean val) { this._collectionEnabled = val; return this; }


  private Map<String, Long> _enabledExporters;
  public Map<String, Long> getEnabledExporters() { return this._enabledExporters; }
  public MonitoringUsage setEnabledExporters(Map<String, Long> val) { this._enabledExporters = val; return this; }

}
