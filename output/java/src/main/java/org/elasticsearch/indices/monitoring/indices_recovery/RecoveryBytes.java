
package org.elasticsearch.indices.monitoring.indices_recovery;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class RecoveryBytes  {
  
  private String _percent;
  public String getPercent() { return this._percent; }
  public RecoveryBytes setPercent(String val) { this._percent = val; return this; }


  private Long _recovered;
  public Long getRecovered() { return this._recovered; }
  public RecoveryBytes setRecovered(Long val) { this._recovered = val; return this; }


  private Long _reused;
  public Long getReused() { return this._reused; }
  public RecoveryBytes setReused(Long val) { this._reused = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public RecoveryBytes setTotal(Long val) { this._total = val; return this; }

}
