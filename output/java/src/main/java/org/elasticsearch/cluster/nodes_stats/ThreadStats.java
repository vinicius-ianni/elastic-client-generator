
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ThreadStats  {
  
  private Long _count;
  public Long getCount() { return this._count; }
  public ThreadStats setCount(Long val) { this._count = val; return this; }


  private Long _peakCount;
  public Long getPeakCount() { return this._peakCount; }
  public ThreadStats setPeakCount(Long val) { this._peakCount = val; return this; }

}
