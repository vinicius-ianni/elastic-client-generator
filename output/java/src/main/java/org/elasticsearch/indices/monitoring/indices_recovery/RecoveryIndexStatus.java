
package org.elasticsearch.indices.monitoring.indices_recovery;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.monitoring.indices_recovery.*;
import org.elasticsearch.internal.*;

public class RecoveryIndexStatus  {
  
  private RecoveryBytes _bytes;
  public RecoveryBytes getBytes() { return this._bytes; }
  public RecoveryIndexStatus setBytes(RecoveryBytes val) { this._bytes = val; return this; }


  private RecoveryFiles _files;
  public RecoveryFiles getFiles() { return this._files; }
  public RecoveryIndexStatus setFiles(RecoveryFiles val) { this._files = val; return this; }


  private RecoveryBytes _size;
  public RecoveryBytes getSize() { return this._size; }
  public RecoveryIndexStatus setSize(RecoveryBytes val) { this._size = val; return this; }


  private Long _sourceThrottleTimeInMillis;
  public Long getSourceThrottleTimeInMillis() { return this._sourceThrottleTimeInMillis; }
  public RecoveryIndexStatus setSourceThrottleTimeInMillis(Long val) { this._sourceThrottleTimeInMillis = val; return this; }


  private Long _targetThrottleTimeInMillis;
  public Long getTargetThrottleTimeInMillis() { return this._targetThrottleTimeInMillis; }
  public RecoveryIndexStatus setTargetThrottleTimeInMillis(Long val) { this._targetThrottleTimeInMillis = val; return this; }


  private Long _totalTimeInMillis;
  public Long getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public RecoveryIndexStatus setTotalTimeInMillis(Long val) { this._totalTimeInMillis = val; return this; }

}
