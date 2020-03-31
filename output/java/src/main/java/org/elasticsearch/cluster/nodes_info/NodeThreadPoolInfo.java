
package org.elasticsearch.cluster.nodes_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class NodeThreadPoolInfo  {
  
  private String _keepAlive;
  public String getKeepAlive() { return this._keepAlive; }
  public NodeThreadPoolInfo setKeepAlive(String val) { this._keepAlive = val; return this; }


  private Integer _max;
  public Integer getMax() { return this._max; }
  public NodeThreadPoolInfo setMax(Integer val) { this._max = val; return this; }


  private Integer _core;
  public Integer getCore() { return this._core; }
  public NodeThreadPoolInfo setCore(Integer val) { this._core = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public NodeThreadPoolInfo setSize(Integer val) { this._size = val; return this; }


  private Integer _queueSize;
  public Integer getQueueSize() { return this._queueSize; }
  public NodeThreadPoolInfo setQueueSize(Integer val) { this._queueSize = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public NodeThreadPoolInfo setType(String val) { this._type = val; return this; }

}
