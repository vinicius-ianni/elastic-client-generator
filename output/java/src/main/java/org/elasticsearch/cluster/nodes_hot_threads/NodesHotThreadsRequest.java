
package org.elasticsearch.cluster.nodes_hot_threads;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class NodesHotThreadsRequest  {
  
  private Boolean _ignoreIdleThreads;
  public Boolean getIgnoreIdleThreads() { return this._ignoreIdleThreads; }
  public NodesHotThreadsRequest setIgnoreIdleThreads(Boolean val) { this._ignoreIdleThreads = val; return this; }


  private Time _interval;
  public Time getInterval() { return this._interval; }
  public NodesHotThreadsRequest setInterval(Time val) { this._interval = val; return this; }


  private Long _snapshots;
  public Long getSnapshots() { return this._snapshots; }
  public NodesHotThreadsRequest setSnapshots(Long val) { this._snapshots = val; return this; }


  private ThreadType _threadType;
  public ThreadType getThreadType() { return this._threadType; }
  public NodesHotThreadsRequest setThreadType(ThreadType val) { this._threadType = val; return this; }


  private Long _threads;
  public Long getThreads() { return this._threads; }
  public NodesHotThreadsRequest setThreads(Long val) { this._threads = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public NodesHotThreadsRequest setTimeout(Time val) { this._timeout = val; return this; }

}
