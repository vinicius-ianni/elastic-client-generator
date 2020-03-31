
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class AlertingCount  {
  
  private Long _active;
  public Long getActive() { return this._active; }
  public AlertingCount setActive(Long val) { this._active = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public AlertingCount setTotal(Long val) { this._total = val; return this; }

}
