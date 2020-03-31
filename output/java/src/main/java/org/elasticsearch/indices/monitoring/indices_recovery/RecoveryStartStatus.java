
package org.elasticsearch.indices.monitoring.indices_recovery;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class RecoveryStartStatus  {
  
  private Long _checkIndexTime;
  public Long getCheckIndexTime() { return this._checkIndexTime; }
  public RecoveryStartStatus setCheckIndexTime(Long val) { this._checkIndexTime = val; return this; }


  private String _totalTimeInMillis;
  public String getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public RecoveryStartStatus setTotalTimeInMillis(String val) { this._totalTimeInMillis = val; return this; }

}
