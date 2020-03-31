
package org.elasticsearch.cluster.nodes_stats.statistics;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.cluster.nodes_stats.statistics.*;

public class IngestStats  {
  
  private Long _count;
  public Long getCount() { return this._count; }
  public IngestStats setCount(Long val) { this._count = val; return this; }


  private Long _current;
  public Long getCurrent() { return this._current; }
  public IngestStats setCurrent(Long val) { this._current = val; return this; }


  private Long _failed;
  public Long getFailed() { return this._failed; }
  public IngestStats setFailed(Long val) { this._failed = val; return this; }


  private Long _timeInMillis;
  public Long getTimeInMillis() { return this._timeInMillis; }
  public IngestStats setTimeInMillis(Long val) { this._timeInMillis = val; return this; }


  private KeyedProcessorStats[] _processors;
  public KeyedProcessorStats[] getProcessors() { return this._processors; }
  public IngestStats setProcessors(KeyedProcessorStats[] val) { this._processors = val; return this; }

}
