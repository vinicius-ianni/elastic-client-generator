
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class XPackUsage  {
  
  private Boolean _available;
  public Boolean getAvailable() { return this._available; }
  public XPackUsage setAvailable(Boolean val) { this._available = val; return this; }


  private Boolean _enabled;
  public Boolean getEnabled() { return this._enabled; }
  public XPackUsage setEnabled(Boolean val) { this._enabled = val; return this; }

}
