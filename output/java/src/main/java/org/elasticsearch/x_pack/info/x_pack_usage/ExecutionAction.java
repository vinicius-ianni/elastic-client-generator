
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ExecutionAction  {
  
  private Long _total;
  public Long getTotal() { return this._total; }
  public ExecutionAction setTotal(Long val) { this._total = val; return this; }


  private Long _totalInMs;
  public Long getTotalInMs() { return this._totalInMs; }
  public ExecutionAction setTotalInMs(Long val) { this._totalInMs = val; return this; }

}
