
package org.elasticsearch.cat.cat_thread_pool;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.time_unit.*;

public class CatThreadPoolRecord  {
  
  private Integer _active;
  public Integer getActive() { return this._active; }
  public CatThreadPoolRecord setActive(Integer val) { this._active = val; return this; }


  private Long _completed;
  public Long getCompleted() { return this._completed; }
  public CatThreadPoolRecord setCompleted(Long val) { this._completed = val; return this; }


  private Integer _core;
  public Integer getCore() { return this._core; }
  public CatThreadPoolRecord setCore(Integer val) { this._core = val; return this; }


  private String _ephemeralNodeId;
  public String getEphemeralNodeId() { return this._ephemeralNodeId; }
  public CatThreadPoolRecord setEphemeralNodeId(String val) { this._ephemeralNodeId = val; return this; }


  private String _host;
  public String getHost() { return this._host; }
  public CatThreadPoolRecord setHost(String val) { this._host = val; return this; }


  private String _ip;
  public String getIp() { return this._ip; }
  public CatThreadPoolRecord setIp(String val) { this._ip = val; return this; }


  private Time _keepAlive;
  public Time getKeepAlive() { return this._keepAlive; }
  public CatThreadPoolRecord setKeepAlive(Time val) { this._keepAlive = val; return this; }


  private Integer _largest;
  public Integer getLargest() { return this._largest; }
  public CatThreadPoolRecord setLargest(Integer val) { this._largest = val; return this; }


  private Integer _max;
  public Integer getMax() { return this._max; }
  public CatThreadPoolRecord setMax(Integer val) { this._max = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public CatThreadPoolRecord setName(String val) { this._name = val; return this; }


  private String _nodeId;
  public String getNodeId() { return this._nodeId; }
  public CatThreadPoolRecord setNodeId(String val) { this._nodeId = val; return this; }


  private String _nodeName;
  public String getNodeName() { return this._nodeName; }
  public CatThreadPoolRecord setNodeName(String val) { this._nodeName = val; return this; }


  private Integer _poolSize;
  public Integer getPoolSize() { return this._poolSize; }
  public CatThreadPoolRecord setPoolSize(Integer val) { this._poolSize = val; return this; }


  private Integer _port;
  public Integer getPort() { return this._port; }
  public CatThreadPoolRecord setPort(Integer val) { this._port = val; return this; }


  private Integer _pid;
  public Integer getPid() { return this._pid; }
  public CatThreadPoolRecord setPid(Integer val) { this._pid = val; return this; }


  private Integer _queue;
  public Integer getQueue() { return this._queue; }
  public CatThreadPoolRecord setQueue(Integer val) { this._queue = val; return this; }


  private Integer _queueSize;
  public Integer getQueueSize() { return this._queueSize; }
  public CatThreadPoolRecord setQueueSize(Integer val) { this._queueSize = val; return this; }


  private Long _rejected;
  public Long getRejected() { return this._rejected; }
  public CatThreadPoolRecord setRejected(Long val) { this._rejected = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public CatThreadPoolRecord setSize(Integer val) { this._size = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public CatThreadPoolRecord setType(String val) { this._type = val; return this; }

}
