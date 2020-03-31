
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ExtendedMemoryStats  {
  
  private Integer _freePercent;
  public Integer getFreePercent() { return this._freePercent; }
  public ExtendedMemoryStats setFreePercent(Integer val) { this._freePercent = val; return this; }


  private Integer _usedPercent;
  public Integer getUsedPercent() { return this._usedPercent; }
  public ExtendedMemoryStats setUsedPercent(Integer val) { this._usedPercent = val; return this; }

}
