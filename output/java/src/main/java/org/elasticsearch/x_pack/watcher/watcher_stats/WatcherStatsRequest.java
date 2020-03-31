
package org.elasticsearch.x_pack.watcher.watcher_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class WatcherStatsRequest  {
  
  private Boolean _emitStacktraces;
  public Boolean getEmitStacktraces() { return this._emitStacktraces; }
  public WatcherStatsRequest setEmitStacktraces(Boolean val) { this._emitStacktraces = val; return this; }

}
