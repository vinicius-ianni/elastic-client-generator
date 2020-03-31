
package org.elasticsearch.cluster.nodes_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.nodes_info.*;
import org.elasticsearch.common_options.stats.*;

public class NodeInfo  {
  
  private String _buildHash;
  public String getBuildHash() { return this._buildHash; }
  public NodeInfo setBuildHash(String val) { this._buildHash = val; return this; }


  private String _host;
  public String getHost() { return this._host; }
  public NodeInfo setHost(String val) { this._host = val; return this; }


  private NodeInfoHttp _http;
  public NodeInfoHttp getHttp() { return this._http; }
  public NodeInfo setHttp(NodeInfoHttp val) { this._http = val; return this; }


  private String _ip;
  public String getIp() { return this._ip; }
  public NodeInfo setIp(String val) { this._ip = val; return this; }


  private NodeJvmInfo _jvm;
  public NodeJvmInfo getJvm() { return this._jvm; }
  public NodeInfo setJvm(NodeJvmInfo val) { this._jvm = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public NodeInfo setName(String val) { this._name = val; return this; }


  private NodeInfoNetwork _network;
  public NodeInfoNetwork getNetwork() { return this._network; }
  public NodeInfo setNetwork(NodeInfoNetwork val) { this._network = val; return this; }


  private NodeOperatingSystemInfo _os;
  public NodeOperatingSystemInfo getOs() { return this._os; }
  public NodeInfo setOs(NodeOperatingSystemInfo val) { this._os = val; return this; }


  private PluginStats[] _plugins;
  public PluginStats[] getPlugins() { return this._plugins; }
  public NodeInfo setPlugins(PluginStats[] val) { this._plugins = val; return this; }


  private NodeProcessInfo _process;
  public NodeProcessInfo getProcess() { return this._process; }
  public NodeInfo setProcess(NodeProcessInfo val) { this._process = val; return this; }


  private NodeRole[] _roles;
  public NodeRole[] getRoles() { return this._roles; }
  public NodeInfo setRoles(NodeRole[] val) { this._roles = val; return this; }


  private String[] _settings;
  public String[] getSettings() { return this._settings; }
  public NodeInfo setSettings(String[] val) { this._settings = val; return this; }


  private Map<String, NodeThreadPoolInfo> _threadPool;
  public Map<String, NodeThreadPoolInfo> getThreadPool() { return this._threadPool; }
  public NodeInfo setThreadPool(Map<String, NodeThreadPoolInfo> val) { this._threadPool = val; return this; }


  private NodeInfoTransport _transport;
  public NodeInfoTransport getTransport() { return this._transport; }
  public NodeInfo setTransport(NodeInfoTransport val) { this._transport = val; return this; }


  private String _transportAddress;
  public String getTransportAddress() { return this._transportAddress; }
  public NodeInfo setTransportAddress(String val) { this._transportAddress = val; return this; }


  private String _version;
  public String getVersion() { return this._version; }
  public NodeInfo setVersion(String val) { this._version = val; return this; }

}
