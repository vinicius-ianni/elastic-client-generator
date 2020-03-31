
package org.elasticsearch.x_pack.watcher.watcher_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ExecutionThreadPool  {
  
  private Long _maxSize;
  public Long getMaxSize() { return this._maxSize; }
  public ExecutionThreadPool setMaxSize(Long val) { this._maxSize = val; return this; }


  private Long _queueSize;
  public Long getQueueSize() { return this._queueSize; }
  public ExecutionThreadPool setQueueSize(Long val) { this._queueSize = val; return this; }

}
