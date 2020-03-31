
package org.elasticsearch.x_pack.watcher.watcher_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.watcher_stats.*;

public class WatchRecordStats  {
  
  private ExecutionPhase _executionPhase;
  public ExecutionPhase getExecutionPhase() { return this._executionPhase; }
  public WatchRecordStats setExecutionPhase(ExecutionPhase val) { this._executionPhase = val; return this; }

}
