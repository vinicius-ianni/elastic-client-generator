
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ThreadCountStats  {
  
  private Long _active;
  public Long getActive() { return this._active; }
  public ThreadCountStats setActive(Long val) { this._active = val; return this; }


  private Long _completed;
  public Long getCompleted() { return this._completed; }
  public ThreadCountStats setCompleted(Long val) { this._completed = val; return this; }


  private Long _largest;
  public Long getLargest() { return this._largest; }
  public ThreadCountStats setLargest(Long val) { this._largest = val; return this; }


  private Long _queue;
  public Long getQueue() { return this._queue; }
  public ThreadCountStats setQueue(Long val) { this._queue = val; return this; }


  private Long _rejected;
  public Long getRejected() { return this._rejected; }
  public ThreadCountStats setRejected(Long val) { this._rejected = val; return this; }


  private Long _threads;
  public Long getThreads() { return this._threads; }
  public ThreadCountStats setThreads(Long val) { this._threads = val; return this; }

}
