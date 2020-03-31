
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.nodes_stats.*;
import org.elasticsearch.internal.*;

public class NodeJvmStats  {
  
  private Map<String, NodeBufferPool> _bufferPools;
  public Map<String, NodeBufferPool> getBufferPools() { return this._bufferPools; }
  public NodeJvmStats setBufferPools(Map<String, NodeBufferPool> val) { this._bufferPools = val; return this; }


  private JvmClassesStats _classes;
  public JvmClassesStats getClasses() { return this._classes; }
  public NodeJvmStats setClasses(JvmClassesStats val) { this._classes = val; return this; }


  private GarbageCollectionStats _gc;
  public GarbageCollectionStats getGc() { return this._gc; }
  public NodeJvmStats setGc(GarbageCollectionStats val) { this._gc = val; return this; }


  private MemoryStats _mem;
  public MemoryStats getMem() { return this._mem; }
  public NodeJvmStats setMem(MemoryStats val) { this._mem = val; return this; }


  private ThreadStats _threads;
  public ThreadStats getThreads() { return this._threads; }
  public NodeJvmStats setThreads(ThreadStats val) { this._threads = val; return this; }


  private Long _timestamp;
  public Long getTimestamp() { return this._timestamp; }
  public NodeJvmStats setTimestamp(Long val) { this._timestamp = val; return this; }


  private String _uptime;
  public String getUptime() { return this._uptime; }
  public NodeJvmStats setUptime(String val) { this._uptime = val; return this; }


  private Long _uptimeInMillis;
  public Long getUptimeInMillis() { return this._uptimeInMillis; }
  public NodeJvmStats setUptimeInMillis(Long val) { this._uptimeInMillis = val; return this; }

}
