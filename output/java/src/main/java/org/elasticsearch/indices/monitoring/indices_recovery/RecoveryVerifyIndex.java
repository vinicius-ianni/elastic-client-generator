
package org.elasticsearch.indices.monitoring.indices_recovery;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class RecoveryVerifyIndex  {
  
  private Long _checkIndexTimeInMillis;
  public Long getCheckIndexTimeInMillis() { return this._checkIndexTimeInMillis; }
  public RecoveryVerifyIndex setCheckIndexTimeInMillis(Long val) { this._checkIndexTimeInMillis = val; return this; }


  private Long _totalTimeInMillis;
  public Long getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public RecoveryVerifyIndex setTotalTimeInMillis(Long val) { this._totalTimeInMillis = val; return this; }

}
