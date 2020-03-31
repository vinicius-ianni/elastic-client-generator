
package org.elasticsearch.indices.monitoring.indices_recovery;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.monitoring.indices_recovery.*;
import org.elasticsearch.internal.*;

public class RecoveryFiles  {
  
  private RecoveryFileDetails[] _details;
  public RecoveryFileDetails[] getDetails() { return this._details; }
  public RecoveryFiles setDetails(RecoveryFileDetails[] val) { this._details = val; return this; }


  private String _percent;
  public String getPercent() { return this._percent; }
  public RecoveryFiles setPercent(String val) { this._percent = val; return this; }


  private Long _recovered;
  public Long getRecovered() { return this._recovered; }
  public RecoveryFiles setRecovered(Long val) { this._recovered = val; return this; }


  private Long _reused;
  public Long getReused() { return this._reused; }
  public RecoveryFiles setReused(Long val) { this._reused = val; return this; }


  private Long _total;
  public Long getTotal() { return this._total; }
  public RecoveryFiles setTotal(Long val) { this._total = val; return this; }

}
