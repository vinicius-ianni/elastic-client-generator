
package org.elasticsearch.cluster.reload_secure_settings;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class ReloadSecureSettingsRequest  {
  
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public ReloadSecureSettingsRequest setTimeout(Time val) { this._timeout = val; return this; }

}
