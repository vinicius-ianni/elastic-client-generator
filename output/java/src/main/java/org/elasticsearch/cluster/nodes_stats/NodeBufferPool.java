
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class NodeBufferPool  {
  
  private Long _count;
  public Long getCount() { return this._count; }
  public NodeBufferPool setCount(Long val) { this._count = val; return this; }


  private String _totalCapacity;
  public String getTotalCapacity() { return this._totalCapacity; }
  public NodeBufferPool setTotalCapacity(String val) { this._totalCapacity = val; return this; }


  private Long _totalCapacityInBytes;
  public Long getTotalCapacityInBytes() { return this._totalCapacityInBytes; }
  public NodeBufferPool setTotalCapacityInBytes(Long val) { this._totalCapacityInBytes = val; return this; }


  private String _used;
  public String getUsed() { return this._used; }
  public NodeBufferPool setUsed(String val) { this._used = val; return this; }


  private Long _usedInBytes;
  public Long getUsedInBytes() { return this._usedInBytes; }
  public NodeBufferPool setUsedInBytes(Long val) { this._usedInBytes = val; return this; }

}
