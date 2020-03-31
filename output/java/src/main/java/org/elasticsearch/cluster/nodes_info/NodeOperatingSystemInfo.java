
package org.elasticsearch.cluster.nodes_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.cluster.nodes_info.*;

public class NodeOperatingSystemInfo  {
  
  private String _arch;
  public String getArch() { return this._arch; }
  public NodeOperatingSystemInfo setArch(String val) { this._arch = val; return this; }


  private Integer _availableProcessors;
  public Integer getAvailableProcessors() { return this._availableProcessors; }
  public NodeOperatingSystemInfo setAvailableProcessors(Integer val) { this._availableProcessors = val; return this; }


  private NodeInfoOscpu _cpu;
  public NodeInfoOscpu getCpu() { return this._cpu; }
  public NodeOperatingSystemInfo setCpu(NodeInfoOscpu val) { this._cpu = val; return this; }


  private NodeInfoMemory _mem;
  public NodeInfoMemory getMem() { return this._mem; }
  public NodeOperatingSystemInfo setMem(NodeInfoMemory val) { this._mem = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public NodeOperatingSystemInfo setName(String val) { this._name = val; return this; }


  private String _prettyName;
  public String getPrettyName() { return this._prettyName; }
  public NodeOperatingSystemInfo setPrettyName(String val) { this._prettyName = val; return this; }


  private Integer _refreshIntervalInMillis;
  public Integer getRefreshIntervalInMillis() { return this._refreshIntervalInMillis; }
  public NodeOperatingSystemInfo setRefreshIntervalInMillis(Integer val) { this._refreshIntervalInMillis = val; return this; }


  private NodeInfoMemory _swap;
  public NodeInfoMemory getSwap() { return this._swap; }
  public NodeOperatingSystemInfo setSwap(NodeInfoMemory val) { this._swap = val; return this; }


  private String _version;
  public String getVersion() { return this._version; }
  public NodeOperatingSystemInfo setVersion(String val) { this._version = val; return this; }

}
