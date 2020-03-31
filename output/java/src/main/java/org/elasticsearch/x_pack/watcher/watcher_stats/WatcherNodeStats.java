
package org.elasticsearch.x_pack.watcher.watcher_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.watcher_stats.*;
import org.elasticsearch.internal.*;

public class WatcherNodeStats  {
  
  private WatchRecordStats[] _currentWatches;
  public WatchRecordStats[] getCurrentWatches() { return this._currentWatches; }
  public WatcherNodeStats setCurrentWatches(WatchRecordStats[] val) { this._currentWatches = val; return this; }


  private ExecutionThreadPool _executionThreadPool;
  public ExecutionThreadPool getExecutionThreadPool() { return this._executionThreadPool; }
  public WatcherNodeStats setExecutionThreadPool(ExecutionThreadPool val) { this._executionThreadPool = val; return this; }


  private WatchRecordQueuedStats[] _queuedWatches;
  public WatchRecordQueuedStats[] getQueuedWatches() { return this._queuedWatches; }
  public WatcherNodeStats setQueuedWatches(WatchRecordQueuedStats[] val) { this._queuedWatches = val; return this; }


  private Long _watchCount;
  public Long getWatchCount() { return this._watchCount; }
  public WatcherNodeStats setWatchCount(Long val) { this._watchCount = val; return this; }


  private WatcherState _watcherState;
  public WatcherState getWatcherState() { return this._watcherState; }
  public WatcherNodeStats setWatcherState(WatcherState val) { this._watcherState = val; return this; }

}
