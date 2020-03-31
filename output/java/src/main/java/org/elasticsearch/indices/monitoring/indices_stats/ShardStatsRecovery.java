
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ShardStatsRecovery  {
  
  private Long _currentAsSource;
  public Long getCurrentAsSource() { return this._currentAsSource; }
  public ShardStatsRecovery setCurrentAsSource(Long val) { this._currentAsSource = val; return this; }


  private Long _currentAsTarget;
  public Long getCurrentAsTarget() { return this._currentAsTarget; }
  public ShardStatsRecovery setCurrentAsTarget(Long val) { this._currentAsTarget = val; return this; }


  private Long _throttleTimeInMillis;
  public Long getThrottleTimeInMillis() { return this._throttleTimeInMillis; }
  public ShardStatsRecovery setThrottleTimeInMillis(Long val) { this._throttleTimeInMillis = val; return this; }

}
