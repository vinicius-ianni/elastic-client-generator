
package org.elasticsearch.common_options.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class RecoveryStats  {
  
  private Long _currentAsSource;
  public Long getCurrentAsSource() { return this._currentAsSource; }
  public RecoveryStats setCurrentAsSource(Long val) { this._currentAsSource = val; return this; }


  private Long _currentAsTarget;
  public Long getCurrentAsTarget() { return this._currentAsTarget; }
  public RecoveryStats setCurrentAsTarget(Long val) { this._currentAsTarget = val; return this; }


  private String _throttleTime;
  public String getThrottleTime() { return this._throttleTime; }
  public RecoveryStats setThrottleTime(String val) { this._throttleTime = val; return this; }


  private Long _throttleTimeInMillis;
  public Long getThrottleTimeInMillis() { return this._throttleTimeInMillis; }
  public RecoveryStats setThrottleTimeInMillis(Long val) { this._throttleTimeInMillis = val; return this; }

}
