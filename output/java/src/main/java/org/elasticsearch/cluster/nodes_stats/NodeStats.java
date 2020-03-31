
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.nodes_stats.*;
import org.elasticsearch.indices.monitoring.indices_stats.*;
import org.elasticsearch.cluster.nodes_stats.statistics.*;
import org.elasticsearch.cluster.nodes_info.*;
import org.elasticsearch.internal.*;

public class NodeStats  {
  
  private Map<String, AdaptiveSelectionStats> _adaptiveSelection;
  public Map<String, AdaptiveSelectionStats> getAdaptiveSelection() { return this._adaptiveSelection; }
  public NodeStats setAdaptiveSelection(Map<String, AdaptiveSelectionStats> val) { this._adaptiveSelection = val; return this; }


  private Map<String, BreakerStats> _breakers;
  public Map<String, BreakerStats> getBreakers() { return this._breakers; }
  public NodeStats setBreakers(Map<String, BreakerStats> val) { this._breakers = val; return this; }


  private FileSystemStats _fs;
  public FileSystemStats getFs() { return this._fs; }
  public NodeStats setFs(FileSystemStats val) { this._fs = val; return this; }


  private String _host;
  public String getHost() { return this._host; }
  public NodeStats setHost(String val) { this._host = val; return this; }


  private HttpStats _http;
  public HttpStats getHttp() { return this._http; }
  public NodeStats setHttp(HttpStats val) { this._http = val; return this; }


  private IndexStats _indices;
  public IndexStats getIndices() { return this._indices; }
  public NodeStats setIndices(IndexStats val) { this._indices = val; return this; }


  private NodeIngestStats _ingest;
  public NodeIngestStats getIngest() { return this._ingest; }
  public NodeStats setIngest(NodeIngestStats val) { this._ingest = val; return this; }


  private String[] _ip;
  public String[] getIp() { return this._ip; }
  public NodeStats setIp(String[] val) { this._ip = val; return this; }


  private NodeJvmStats _jvm;
  public NodeJvmStats getJvm() { return this._jvm; }
  public NodeStats setJvm(NodeJvmStats val) { this._jvm = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public NodeStats setName(String val) { this._name = val; return this; }


  private OperatingSystemStats _os;
  public OperatingSystemStats getOs() { return this._os; }
  public NodeStats setOs(OperatingSystemStats val) { this._os = val; return this; }


  private ProcessStats _process;
  public ProcessStats getProcess() { return this._process; }
  public NodeStats setProcess(ProcessStats val) { this._process = val; return this; }


  private NodeRole[] _roles;
  public NodeRole[] getRoles() { return this._roles; }
  public NodeStats setRoles(NodeRole[] val) { this._roles = val; return this; }


  private ScriptStats _script;
  public ScriptStats getScript() { return this._script; }
  public NodeStats setScript(ScriptStats val) { this._script = val; return this; }


  private Map<String, ThreadCountStats> _threadPool;
  public Map<String, ThreadCountStats> getThreadPool() { return this._threadPool; }
  public NodeStats setThreadPool(Map<String, ThreadCountStats> val) { this._threadPool = val; return this; }


  private Long _timestamp;
  public Long getTimestamp() { return this._timestamp; }
  public NodeStats setTimestamp(Long val) { this._timestamp = val; return this; }


  private TransportStats _transport;
  public TransportStats getTransport() { return this._transport; }
  public NodeStats setTransport(TransportStats val) { this._transport = val; return this; }


  private String _transportAddress;
  public String getTransportAddress() { return this._transportAddress; }
  public NodeStats setTransportAddress(String val) { this._transportAddress = val; return this; }

}
