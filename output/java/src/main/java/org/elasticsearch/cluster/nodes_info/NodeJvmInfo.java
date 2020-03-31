
package org.elasticsearch.cluster.nodes_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.nodes_info.*;
import org.elasticsearch.internal.*;

public class NodeJvmInfo  {
  
  private String[] _gcCollectors;
  public String[] getGcCollectors() { return this._gcCollectors; }
  public NodeJvmInfo setGcCollectors(String[] val) { this._gcCollectors = val; return this; }


  private NodeInfoJvmMemory _mem;
  public NodeInfoJvmMemory getMem() { return this._mem; }
  public NodeJvmInfo setMem(NodeInfoJvmMemory val) { this._mem = val; return this; }


  private String[] _memoryPools;
  public String[] getMemoryPools() { return this._memoryPools; }
  public NodeJvmInfo setMemoryPools(String[] val) { this._memoryPools = val; return this; }


  private Integer _pid;
  public Integer getPid() { return this._pid; }
  public NodeJvmInfo setPid(Integer val) { this._pid = val; return this; }


  private Long _startTimeInMillis;
  public Long getStartTimeInMillis() { return this._startTimeInMillis; }
  public NodeJvmInfo setStartTimeInMillis(Long val) { this._startTimeInMillis = val; return this; }


  private String _version;
  public String getVersion() { return this._version; }
  public NodeJvmInfo setVersion(String val) { this._version = val; return this; }


  private String _vmName;
  public String getVmName() { return this._vmName; }
  public NodeJvmInfo setVmName(String val) { this._vmName = val; return this; }


  private String _vmVendor;
  public String getVmVendor() { return this._vmVendor; }
  public NodeJvmInfo setVmVendor(String val) { this._vmVendor = val; return this; }


  private String _vmVersion;
  public String getVmVersion() { return this._vmVersion; }
  public NodeJvmInfo setVmVersion(String val) { this._vmVersion = val; return this; }

}
