
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class OperatingSystemMemoryInfo  {
  
  private Long _freeInBytes;
  public Long getFreeInBytes() { return this._freeInBytes; }
  public OperatingSystemMemoryInfo setFreeInBytes(Long val) { this._freeInBytes = val; return this; }


  private Integer _freePercent;
  public Integer getFreePercent() { return this._freePercent; }
  public OperatingSystemMemoryInfo setFreePercent(Integer val) { this._freePercent = val; return this; }


  private Long _totalInBytes;
  public Long getTotalInBytes() { return this._totalInBytes; }
  public OperatingSystemMemoryInfo setTotalInBytes(Long val) { this._totalInBytes = val; return this; }


  private Long _usedInBytes;
  public Long getUsedInBytes() { return this._usedInBytes; }
  public OperatingSystemMemoryInfo setUsedInBytes(Long val) { this._usedInBytes = val; return this; }


  private Integer _usedPercent;
  public Integer getUsedPercent() { return this._usedPercent; }
  public OperatingSystemMemoryInfo setUsedPercent(Integer val) { this._usedPercent = val; return this; }

}
