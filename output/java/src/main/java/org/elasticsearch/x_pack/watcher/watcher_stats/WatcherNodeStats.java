
package org.elasticsearch.x_pack.watcher.watcher_stats;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.watcher.watcher_stats.*;
import org.elasticsearch.internal.*;

public class WatcherNodeStats  implements XContentable<WatcherNodeStats> {
  
  static final ParseField CURRENT_WATCHES = new ParseField("current_watches");
  private List<WatchRecordStats> _currentWatches;
  public List<WatchRecordStats> getCurrentWatches() { return this._currentWatches; }
  public WatcherNodeStats setCurrentWatches(List<WatchRecordStats> val) { this._currentWatches = val; return this; }


  static final ParseField EXECUTION_THREAD_POOL = new ParseField("execution_thread_pool");
  private ExecutionThreadPool _executionThreadPool;
  public ExecutionThreadPool getExecutionThreadPool() { return this._executionThreadPool; }
  public WatcherNodeStats setExecutionThreadPool(ExecutionThreadPool val) { this._executionThreadPool = val; return this; }


  static final ParseField QUEUED_WATCHES = new ParseField("queued_watches");
  private List<WatchRecordQueuedStats> _queuedWatches;
  public List<WatchRecordQueuedStats> getQueuedWatches() { return this._queuedWatches; }
  public WatcherNodeStats setQueuedWatches(List<WatchRecordQueuedStats> val) { this._queuedWatches = val; return this; }


  static final ParseField WATCH_COUNT = new ParseField("watch_count");
  private Long _watchCount;
  public Long getWatchCount() { return this._watchCount; }
  public WatcherNodeStats setWatchCount(Long val) { this._watchCount = val; return this; }


  static final ParseField WATCHER_STATE = new ParseField("watcher_state");
  private WatcherState _watcherState;
  public WatcherState getWatcherState() { return this._watcherState; }
  public WatcherNodeStats setWatcherState(WatcherState val) { this._watcherState = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public WatcherNodeStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return WatcherNodeStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<WatcherNodeStats, Void> PARSER =
    new ConstructingObjectParser<>(WatcherNodeStats.class.getName(), false, args -> new WatcherNodeStats());

  static {
    PARSER.declareObjectArray(WatcherNodeStats::setCurrentWatches, (p, t) -> WatchRecordStats.PARSER.apply(p), CURRENT_WATCHES);
    PARSER.declareObject(WatcherNodeStats::setExecutionThreadPool, (p, t) -> ExecutionThreadPool.PARSER.apply(p, null), EXECUTION_THREAD_POOL);
    PARSER.declareObjectArray(WatcherNodeStats::setQueuedWatches, (p, t) -> WatchRecordQueuedStats.PARSER.apply(p), QUEUED_WATCHES);
    PARSER.declareLong(WatcherNodeStats::setWatchCount, WATCH_COUNT);
    PARSER.declareObject(WatcherNodeStats::setWatcherState, (p, t) -> WatcherState.PARSER.apply(p, null), WATCHER_STATE);
  }

}
