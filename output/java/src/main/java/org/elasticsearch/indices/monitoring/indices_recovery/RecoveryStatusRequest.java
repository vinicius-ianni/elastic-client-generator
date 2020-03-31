
package org.elasticsearch.indices.monitoring.indices_recovery;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class RecoveryStatusRequest  {
  
  private Boolean _activeOnly;
  public Boolean getActiveOnly() { return this._activeOnly; }
  public RecoveryStatusRequest setActiveOnly(Boolean val) { this._activeOnly = val; return this; }


  private Boolean _detailed;
  public Boolean getDetailed() { return this._detailed; }
  public RecoveryStatusRequest setDetailed(Boolean val) { this._detailed = val; return this; }

}
