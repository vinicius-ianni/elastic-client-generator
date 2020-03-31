
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.nodes_stats.*;
import org.elasticsearch.internal.*;

public class ProcessStats  {
  
  private CpuStats _cpu;
  public CpuStats getCpu() { return this._cpu; }
  public ProcessStats setCpu(CpuStats val) { this._cpu = val; return this; }


  private MemoryStats _mem;
  public MemoryStats getMem() { return this._mem; }
  public ProcessStats setMem(MemoryStats val) { this._mem = val; return this; }


  private Integer _openFileDescriptors;
  public Integer getOpenFileDescriptors() { return this._openFileDescriptors; }
  public ProcessStats setOpenFileDescriptors(Integer val) { this._openFileDescriptors = val; return this; }


  private Long _timestamp;
  public Long getTimestamp() { return this._timestamp; }
  public ProcessStats setTimestamp(Long val) { this._timestamp = val; return this; }

}
