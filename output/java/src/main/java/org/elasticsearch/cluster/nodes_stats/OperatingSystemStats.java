
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.nodes_stats.*;
import org.elasticsearch.internal.*;

public class OperatingSystemStats  {
  
  private CpuStats _cpu;
  public CpuStats getCpu() { return this._cpu; }
  public OperatingSystemStats setCpu(CpuStats val) { this._cpu = val; return this; }


  private ExtendedMemoryStats _mem;
  public ExtendedMemoryStats getMem() { return this._mem; }
  public OperatingSystemStats setMem(ExtendedMemoryStats val) { this._mem = val; return this; }


  private MemoryStats _swap;
  public MemoryStats getSwap() { return this._swap; }
  public OperatingSystemStats setSwap(MemoryStats val) { this._swap = val; return this; }


  private Long _timestamp;
  public Long getTimestamp() { return this._timestamp; }
  public OperatingSystemStats setTimestamp(Long val) { this._timestamp = val; return this; }

}
