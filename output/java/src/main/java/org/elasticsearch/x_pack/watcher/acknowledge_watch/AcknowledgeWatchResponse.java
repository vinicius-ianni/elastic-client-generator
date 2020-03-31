
package org.elasticsearch.x_pack.watcher.acknowledge_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.acknowledge_watch.*;

public class AcknowledgeWatchResponse  {
  
  private WatchStatus _status;
  public WatchStatus getStatus() { return this._status; }
  public AcknowledgeWatchResponse setStatus(WatchStatus val) { this._status = val; return this; }

}
