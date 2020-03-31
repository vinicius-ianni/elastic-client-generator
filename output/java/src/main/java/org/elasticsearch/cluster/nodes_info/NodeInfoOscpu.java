
package org.elasticsearch.cluster.nodes_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class NodeInfoOscpu  {
  
  private String _cacheSize;
  public String getCacheSize() { return this._cacheSize; }
  public NodeInfoOscpu setCacheSize(String val) { this._cacheSize = val; return this; }


  private Integer _cacheSizeInBytes;
  public Integer getCacheSizeInBytes() { return this._cacheSizeInBytes; }
  public NodeInfoOscpu setCacheSizeInBytes(Integer val) { this._cacheSizeInBytes = val; return this; }


  private Integer _coresPerSocket;
  public Integer getCoresPerSocket() { return this._coresPerSocket; }
  public NodeInfoOscpu setCoresPerSocket(Integer val) { this._coresPerSocket = val; return this; }


  private Integer _mhz;
  public Integer getMhz() { return this._mhz; }
  public NodeInfoOscpu setMhz(Integer val) { this._mhz = val; return this; }


  private String _model;
  public String getModel() { return this._model; }
  public NodeInfoOscpu setModel(String val) { this._model = val; return this; }


  private Integer _totalCores;
  public Integer getTotalCores() { return this._totalCores; }
  public NodeInfoOscpu setTotalCores(Integer val) { this._totalCores = val; return this; }


  private Integer _totalSockets;
  public Integer getTotalSockets() { return this._totalSockets; }
  public NodeInfoOscpu setTotalSockets(Integer val) { this._totalSockets = val; return this; }


  private String _vendor;
  public String getVendor() { return this._vendor; }
  public NodeInfoOscpu setVendor(String val) { this._vendor = val; return this; }

}
